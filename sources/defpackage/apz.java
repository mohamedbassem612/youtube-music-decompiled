package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class apz {
    static final apz a;
    static final apz b;
    public final boolean c;
    final Throwable d;

    static {
        if (aqh.a) {
            b = null;
            a = null;
        } else {
            b = new apz(false, null);
            a = new apz(true, null);
        }
    }

    public apz(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}
