package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahfz {
    public static final ahfz a = new ahfz("UNKNOWN_KEYMATERIAL");
    public static final ahfz b = new ahfz("SYMMETRIC");
    public static final ahfz c = new ahfz("ASYMMETRIC_PRIVATE");
    public static final ahfz d = new ahfz("ASYMMETRIC_PUBLIC");
    public static final ahfz e = new ahfz("REMOTE");
    public final String f;

    private ahfz(String str) {
        this.f = str;
    }

    public final String toString() {
        return this.f;
    }
}
