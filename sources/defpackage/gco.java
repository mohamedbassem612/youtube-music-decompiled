package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gco extends gcr {
    public gco(gbg gbgVar, fxg fxgVar, int i) {
        super(gbgVar, "gCM0ED7pciDuY5xbx3ebwyPQpCNldX/bP76OrYRLdtMzjq7DoqyMtd+9mfzGQwJU", "TuSE3TZdW7axB5d4rWooHDZaw1BR4+Mttob/0paLt1I=", fxgVar, i, 48);
    }

    @Override // defpackage.gcr
    protected final void a() {
        fxg fxgVar = this.d;
        fxgVar.copyOnWrite();
        fxl fxlVar = (fxl) fxgVar.instance;
        fxl fxlVar2 = fxl.a;
        fxlVar.K = 2;
        fxlVar.c |= SemanticState.ReadOnly;
        boolean zBooleanValue = ((Boolean) this.e.invoke(null, this.a.a)).booleanValue();
        synchronized (fxgVar) {
            try {
                if (zBooleanValue) {
                    fxgVar.copyOnWrite();
                    fxl fxlVar3 = (fxl) fxgVar.instance;
                    fxlVar3.K = 1;
                    fxlVar3.c |= SemanticState.ReadOnly;
                } else {
                    fxgVar.copyOnWrite();
                    fxl fxlVar4 = (fxl) fxgVar.instance;
                    fxlVar4.K = 0;
                    fxlVar4.c |= SemanticState.ReadOnly;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
