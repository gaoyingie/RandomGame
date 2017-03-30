package me.veryyoung.wechat.randomgame;


public class VersionParam {

    public static String randomGameClass = "com.tencent.mm.sdk.platformtools.bf";
    public static String gameType = "da";

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
            case "6.3.28":
                randomGameClass = "com.tencent.mm.sdk.platformtools.be";
                gameType = "cv";
                break;
            case "6.3.30":
            case "6.3.31":
                randomGameClass = "com.tencent.mm.sdk.platformtools.be";
                gameType = "cx";
                break;
            case "6.3.32":
                randomGameClass = "com.tencent.mm.sdk.platformtools.be";
                gameType = "cC";
                break;
            case "6.5.3":
                randomGameClass = "com.tencent.mm.sdk.platformtools.be";
                gameType = "cW";
                break;
            case "6.5.4":
            case "6.5.6":
            case "6.5.7":
                randomGameClass = "com.tencent.mm.sdk.platformtools.bf";
                gameType = "da";
                break;
            default:
                randomGameClass = "com.tencent.mm.sdk.platformtools.bf";
                gameType = "da";
        }
    }
}
