package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gce extends gcr {
    public gce(gbg gbgVar, fxg fxgVar, int i) {
        super(gbgVar, "L2+Onoldi+9yXtL0GSDq44O30y1HXGu7c43ZFvmHTExSiuGSa1HmDeMmeZBAhlSh", "6ROGmQSzuQIVfFazSGe+sz4U8NIaimvhIuETAyd7RP8=", fxgVar, i, 12);
    }

    @Override // defpackage.gcr
    protected final void a() {
        fxg fxgVar = this.d;
        fxgVar.copyOnWrite();
        fxl fxlVar = (fxl) fxgVar.instance;
        fxl fxlVar2 = fxl.a;
        fxlVar.b |= SemanticState.Modal;
        fxlVar.l = -1L;
        long jLongValue = ((Long) this.e.invoke(null, this.a.a)).longValue();
        fxgVar.copyOnWrite();
        fxl fxlVar3 = (fxl) fxgVar.instance;
        fxlVar3.b |= SemanticState.Modal;
        fxlVar3.l = jLongValue;
    }
}
