package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahkq {
    public static final ahkq a = new ahkq("SHA256");
    public static final ahkq b = new ahkq("SHA384");
    public static final ahkq c = new ahkq("SHA512");
    private final String d;

    private ahkq(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
