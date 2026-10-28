package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class axt extends axs {
    private final Object a;

    public axt(int i) {
        super(i);
        this.a = new Object();
    }

    @Override // defpackage.axs, defpackage.axr
    public final Object a() {
        Object objA;
        synchronized (this.a) {
            objA = super.a();
        }
        return objA;
    }

    @Override // defpackage.axs, defpackage.axr
    public final boolean b(Object obj) {
        boolean zB;
        obj.getClass();
        synchronized (this.a) {
            zB = super.b(obj);
        }
        return zB;
    }
}
