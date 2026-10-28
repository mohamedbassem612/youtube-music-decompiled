package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class unr {
    public boolean a = false;
    public boolean b = false;
    public boolean c = false;
    public boolean d = true;
    public final Object e = new Object();
    private final boolean f;
    private final boolean g;

    public unr(vxz vxzVar, boolean z) {
        this.f = vxzVar.l(65, 45751669L, false);
        this.g = z;
    }

    public final void a(boolean z) {
        synchronized (this.e) {
            this.d = z;
        }
    }

    public final boolean b(ugb ugbVar) {
        boolean zC;
        synchronized (this.e) {
            int iOrdinal = ugbVar.ordinal();
            if (iOrdinal == 0) {
                this.c = true;
            } else if (iOrdinal == 1) {
                this.c = false;
            }
            zC = c();
        }
        return zC;
    }

    public final boolean c() {
        boolean z;
        synchronized (this.e) {
            z = this.a && (!this.b || this.f) && !this.c && (!this.g || this.d);
        }
        return z;
    }
}
