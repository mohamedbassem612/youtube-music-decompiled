package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gbw extends gcr {
    private static volatile String h;
    private static final Object i = new Object();

    public gbw(gbg gbgVar, fxg fxgVar, int i2) {
        super(gbgVar, "5B458X0v4/KuTee7HSD6J48NfkPiGS44SuWDwWFKaldPm1qeiI+pd/cizEdJZ8+t", "BrJ5MiXjCuzm1ntfq3y6gqgS49CGP9+CAe+livJqYF4=", fxgVar, i2, 82);
    }

    @Override // defpackage.gcr
    protected final void a() {
        if (h == null) {
            synchronized (i) {
                if (h == null) {
                    h = (String) this.e.invoke(null, null);
                }
            }
        }
        fxg fxgVar = this.d;
        synchronized (fxgVar) {
            String str = h;
            fxgVar.copyOnWrite();
            fxl fxlVar = (fxl) fxgVar.instance;
            fxl fxlVar2 = fxl.a;
            str.getClass();
            fxlVar.d |= SemanticState.ReadOnly;
            fxlVar.ad = str;
        }
    }
}
