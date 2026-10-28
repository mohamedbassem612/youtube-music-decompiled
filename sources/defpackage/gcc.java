package defpackage;

import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gcc extends gcr {
    private final heg h;

    public gcc(gbg gbgVar, fxg fxgVar, int i, heg hegVar) {
        super(gbgVar, "wmaK2ieuKoUFg8t+jeIlrH/07haQgqiIztwBY3Xp0J9CPIEwvYe8MLDTV2YxY2XM", "iM/1sHPPbta3y6hBtnRnzb1RdQC99WgkGoqjG+ZlGiM=", fxgVar, i, 94);
        this.h = hegVar;
    }

    @Override // defpackage.gcr
    protected final void a() {
        int iIntValue = ((Integer) this.e.invoke(null, this.h.g())).intValue();
        fxg fxgVar = this.d;
        synchronized (fxgVar) {
            int iH = CommonApis.h(iIntValue);
            fxgVar.copyOnWrite();
            fxl fxlVar = (fxl) fxgVar.instance;
            fxl fxlVar2 = fxl.a;
            int i = iH - 1;
            if (iH == 0) {
                throw null;
            }
            fxlVar.al = i;
            fxlVar.d |= 16777216;
        }
    }
}
