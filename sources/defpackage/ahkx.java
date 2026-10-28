package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahkx {
    public static final ahkx a = new ahkx("SHA256");
    public static final ahkx b = new ahkx("SHA384");
    public static final ahkx c = new ahkx("SHA512");
    private final String d;

    private ahkx(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
