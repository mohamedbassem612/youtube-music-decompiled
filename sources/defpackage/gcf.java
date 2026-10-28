package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gcf extends gcr {
    private static volatile String h;
    private static final Object i = new Object();

    public gcf(gbg gbgVar, fxg fxgVar, int i2) {
        super(gbgVar, "cpast73oyVGxAsfdJwgMLBMhPcwGBuaRfzY3Bhh3kWL4MebzVk4iFU4Wx0PgZ1kl", "Qm8MG2DrzXgkT9mmjHxWILqdq05Xbm3so5KwQC2McyE=", fxgVar, i2, 1);
    }

    @Override // defpackage.gcr
    protected final void a() {
        fxg fxgVar = this.d;
        fxgVar.copyOnWrite();
        fxl fxlVar = (fxl) fxgVar.instance;
        fxl fxlVar2 = fxl.a;
        fxlVar.b |= 1;
        fxlVar.f = "E";
        if (h == null) {
            synchronized (i) {
                if (h == null) {
                    h = (String) this.e.invoke(null, null);
                }
            }
        }
        fxg fxgVar2 = this.d;
        synchronized (fxgVar2) {
            String str = h;
            fxgVar2.copyOnWrite();
            fxl fxlVar3 = (fxl) fxgVar2.instance;
            str.getClass();
            fxlVar3.b |= 1;
            fxlVar3.f = str;
        }
    }
}
