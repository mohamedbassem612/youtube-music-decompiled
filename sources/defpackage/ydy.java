package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum ydy {
    PRODUCTION("https://www.youtube.com/api/lounge", ""),
    STAGING("https://www.youtube.com/api/loungestaging", "&env_mdxEnvironment=STAGING"),
    SANDBOX("https://www.youtube.com/api/loungesandbox", "&env_mdxEnvironment=SANDBOX"),
    DEV("https://www.youtube.com/api/loungedev", "&env_mdxEnvironment=DEV");

    public final String f;
    public final String g;
    public final String h;
    public static final ydy e = PRODUCTION;

    ydy(String str, String str2) {
        this.f = str.concat("/bc/bind");
        this.g = str.concat("/pairing/");
        this.h = str2;
    }
}
