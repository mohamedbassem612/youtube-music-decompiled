package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gbu extends gcr {
    private static volatile Long h;
    private static final Object i = new Object();

    public gbu(gbg gbgVar, fxg fxgVar, int i2) {
        super(gbgVar, "nhuP9R4hppNmth1yNrgGWIOXDJip+YNZibYhZu3EiGhPWp2ziegk9lKQZAz5y8Y6", "ZtOWgCuVzbV1YOR1Q2MkCR28/Ahzvo+dfHqW5BEsaGQ=", fxgVar, i2, 44);
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
            fxlVar.c |= 32;
            fxlVar.G = jLongValue;
        }
    }
}
