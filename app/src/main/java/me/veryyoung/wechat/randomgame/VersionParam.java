package me.veryyoung.wechat.randomgame;


public class VersionParam {

    /**
     * search new Random(System.currentTimeMillis())
     */
    public static String randomGameClass = "com.tencent.mm.sdk.platformtools.bi";
    public static String gameType = "eF";

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
            case "6.5.8":
                randomGameClass = "com.tencent.mm.sdk.platformtools.bf";
                gameType = "dv";
                break;
            case "6.5.10":
                randomGameClass = "com.tencent.mm.sdk.platformtools.bg";
                gameType = "dK";
                break;
            case "6.5.13":
                randomGameClass = "com.tencent.mm.sdk.platformtools.bf";
                gameType = "dM";
                break;
            case "6.5.16":
                randomGameClass = "com.tencent.mm.sdk.platformtools.bg";
                gameType = "dW";
                break;
            case "6.5.19":
                randomGameClass = "com.tencent.mm.sdk.platformtools.bg";
                gameType = "eb";
                break;
            case "6.5.22":
                randomGameClass = "com.tencent.mm.sdk.platformtools.bh";
                gameType = "ed";
                break;
            case "6.5.23":
                randomGameClass = "com.tencent.mm.sdk.platformtools.bh";
                gameType = "ee";
                break;
            case "6.6.0":
                randomGameClass = "com.tencent.mm.sdk.platformtools.bh";
                gameType = "em";
                break;
            case "6.6.1":
                randomGameClass = "com.tencent.mm.sdk.platformtools.bh";
                gameType = "en";
                break;
            case "6.6.2":
            case "6.6.3":
                randomGameClass = "com.tencent.mm.sdk.platformtools.bh";
                gameType = "eF";
                break;
            case "6.6.5":
                randomGameClass = "com.tencent.mm.sdk.platformtools.bh";
                gameType = "eI";
                break;
            case "6.6.6":
                randomGameClass = "com.tencent.mm.sdk.platformtools.bh";
                gameType = "eE";
                break;
            case "6.6.7":
                randomGameClass = "com.tencent.mm.sdk.platformtools.bi";
                gameType = "eF";
                break;
            default:
                randomGameClass = "com.tencent.mm.sdk.platformtools.bi";
                gameType = "eF";
        }
    }
}
