package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class eox {
    static final eox a;
    static final eox b;
    final Throwable c;

    static {
        if (epf.a) {
            b = null;
            a = null;
        } else {
            b = new eox(null);
            a = new eox(null);
        }
    }

    public eox(Throwable th) {
        this.c = th;
    }
}
