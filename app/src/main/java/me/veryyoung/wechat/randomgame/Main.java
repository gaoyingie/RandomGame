package me.veryyoung.wechat.randomgame;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam;

import static de.robv.android.xposed.XposedBridge.log;
import static de.robv.android.xposed.XposedHelpers.callMethod;
import static de.robv.android.xposed.XposedHelpers.callStaticMethod;
import static de.robv.android.xposed.XposedHelpers.findAndHookMethod;
import static de.robv.android.xposed.XposedHelpers.findClass;


public class Main implements IXposedHookLoadPackage {

    public static final String WECHAT_PACKAGE_NAME = "com.tencent.mm";

    private static String wechatVersion = "";

    @Override
    public void handleLoadPackage(final LoadPackageParam lpparam) throws Throwable {
        if (lpparam.packageName.equals(WECHAT_PACKAGE_NAME)) {
            initVersion(lpparam);
            switch (wechatVersion) {
                case "6.3.22":
                case "6.3.23":
                case "6.3.25":
                case "6.3.27":
                    findAndHookMethod(VersionParam.randomGameClass, lpparam.classLoader, VersionParam.gameType, int.class, new XC_MethodHook() {
                        @Override
                        protected void afterHookedMethod(MethodHookParam param) {
                            handleHook(param);
                        }
                    });
                    break;
                default:
                    findAndHookMethod(VersionParam.randomGameClass, lpparam.classLoader, VersionParam.gameType, int.class, int.class, new XC_MethodHook() {
                        @Override
                        protected void afterHookedMethod(MethodHookParam param) {
                            handleHook(param);
                        }
                    });
            }

            new HideModuleHook().hook(lpparam);

        }
    }

    private void handleHook(XC_MethodHook.MethodHookParam param) {
        int gameType = ((Integer) param.args[0]).intValue();
        switch (gameType) {
            case 2:
                if (PreferencesUtils.moraCheat()) {
                    param.setResult(PreferencesUtils.moraNum());
                }
                break;
            case 5:
                if (PreferencesUtils.diceCheat()) {
                    param.setResult(PreferencesUtils.diceNum());
                }
            default:
        }
    }

    private void initVersion(LoadPackageParam lpparam) throws PackageManager.NameNotFoundException {
        if (TextUtils.isEmpty(wechatVersion)) {
            Context context = (Context) callMethod(callStaticMethod(findClass("android.app.ActivityThread", null), "currentActivityThread", new Object[0]), "getSystemContext", new Object[0]);
            String versionName = context.getPackageManager().getPackageInfo(lpparam.packageName, 0).versionName;
            log("Found wechat version:" + versionName);
            this.wechatVersion = versionName;
            VersionParam.init(versionName);
        }
    }


}
