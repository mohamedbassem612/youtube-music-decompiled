package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum zru {
    DESKTOP("desktop"),
    MOBILE("mobile"),
    TV("tv"),
    TABLET("tablet"),
    BLURAY("bluray"),
    STB("stb"),
    GAME_CONSOLE("game_console"),
    AUTOMOTIVE("automotive"),
    WEARABLE("wearable"),
    UNKNOWN("unknown_platform");

    public final String k;

    zru(String str) {
        this.k = str;
    }
}
