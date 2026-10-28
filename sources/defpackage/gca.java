package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gca extends gcr {
    private static volatile Long h;
    private static final Object i = new Object();

    public gca(gbg gbgVar, fxg fxgVar, int i2) {
        super(gbgVar, "Un5AAvnvAy4QGo4F+FxWyo27oJRq8yHXTL/5BO992/Qbcx/AxeRAjUiJCJFf12B5", "RXeMNI8bd8gwJjHGvzfkcshLS49npesklSWQ3zLeALQ=", fxgVar, i2, 22);
    }

    @Override // defpackage.gcr
    protected final void a() {
        if (h == null) {
            synchronized (i) {
                if (h == null) {
                    h = (Long) this.e.invoke(null, null);
                }
            }
        }
        fxg fxgVar = this.d;
        synchronized (fxgVar) {
            long jLongValue = h.longValue();
            fxgVar.copyOnWrite();
            fxl fxlVar = (fxl) fxgVar.instance;
            fxl fxlVar2 = fxl.a;
            fxlVar.b |= 1048576;
            fxlVar.r = jLongValue;
        }
    }
}
