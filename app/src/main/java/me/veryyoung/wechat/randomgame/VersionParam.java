package me.veryyoung.wechat.randomgame;


public class VersionParam {

    public static String randomGameClass = "com.tencent.mm.sdk.platformtools.be";
    public static String gameType = "tx";

    public static void init(String version) {
        switch (version) {
            case "6.3.22":
                randomGameClass = "com.tencent.mm.sdk.platformtools.be";
                gameType = "rl";
                break;
            case "6.3.23":
            case "6.3.25":
                randomGameClass = "com.tencent.mm.sdk.platformtools.be";
                gameType = "rT";
                break;
            case "6.3.27":
                randomGameClass = "com.tencent.mm.sdk.platformtools.be";
                gameType = "tx";
                break;
            default:
                randomGameClass = "com.tencent.mm.sdk.platformtools.be";
                gameType = "tx";
        }
    }
}
