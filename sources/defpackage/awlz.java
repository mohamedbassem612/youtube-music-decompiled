package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awlz implements avlk {
    axsq a;
    public volatile Object b;

    public awlz(Object obj) {
        this.b = obj;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        this.b = new awkj(th);
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        axsq axsqVar2 = this.a;
        if (axsqVar2 != null) {
            axsqVar.kj();
            if (axsqVar2 != awka.CANCELLED) {
                atqp.z(getClass());
                return;
            }
            return;
        }
        this.a = axsqVar;
        if (axsqVar != null) {
            axsqVar.ko(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        this.b = obj;
    }

    @Override // defpackage.axsp
    public final void kn() {
        this.b = awkl.COMPLETE;
    }
}
