package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sxw implements sxu {
    private volatile sxu a;

    public sxw(sxu sxuVar) {
        this.a = sxuVar;
    }

    @Override // defpackage.sxu
    public final void b(Object obj, Object obj2) {
        if (this.a != null) {
            try {
                this.a.b(obj, obj2);
            } catch (NullPointerException unused) {
            }
        }
    }

    public final void c() {
        this.a = null;
    }

    public final boolean d() {
        return this.a == null;
    }

    @Override // defpackage.sxu
    public final void iT(Object obj, Exception exc) {
        if (this.a != null) {
            try {
                this.a.iT(obj, exc);
            } catch (NullPointerException unused) {
            }
        }
    }
}
