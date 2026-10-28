package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ahca {
    static final ahca a;
    static final ahca b;
    final boolean c;
    final Throwable d;

    static {
        if (ahco.i) {
            b = null;
            a = null;
        } else {
            b = new ahca(false, null);
            a = new ahca(true, null);
        }
    }

    public ahca(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}
