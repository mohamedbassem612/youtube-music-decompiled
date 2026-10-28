package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dzh extends bbl {
    private final Throwable a;

    public dzh(Throwable th) {
        super(null);
        this.a = th;
    }

    public final String toString() {
        return "FAILURE (" + this.a.getMessage() + ')';
    }
}
