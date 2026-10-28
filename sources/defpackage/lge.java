package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum lge {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");

    private final String f;

    lge(String str) {
        this.f = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f;
    }
}
