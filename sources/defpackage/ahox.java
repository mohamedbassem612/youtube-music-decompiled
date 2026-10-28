package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahox implements ahrs {
    private static final Object a = new Object();
    private volatile Object b = a;
    private volatile ahrs c;

    public ahox(ahrs ahrsVar) {
        this.c = ahrsVar;
    }

    @Override // defpackage.ahrs
    public final Object a() {
        Object objA = this.b;
        Object obj = a;
        if (objA == obj) {
            synchronized (this) {
                objA = this.b;
                if (objA == obj) {
                    objA = this.c.a();
                    this.b = objA;
                    this.c = null;
                }
            }
        }
        return objA;
    }
}
