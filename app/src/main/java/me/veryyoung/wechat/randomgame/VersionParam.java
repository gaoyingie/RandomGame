package me.veryyoung.wechat.randomgame;


public class VersionParam {

    public static String randomGameClass = "com.tencent.mm.sdk.platformtools.be";
    public static String gameType = "cx";

    public static void init(String version) {
        switch (version) {
            case "6.3.22":
                gameType = "rl";
                break;
            case "6.3.23":
            case "6.3.25":
                gameType = "rT";
                break;
            case "6.3.27":
                gameType = "tx";
                break;
            case "6.3.28":
                gameType = "cv";
                break;
            case "6.3.30":
                gameType = "cx";
                break;
            default:
                gameType = "cx";
        }
    }
}
