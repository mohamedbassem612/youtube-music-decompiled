package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gcl extends gcr {
    public gcl(gbg gbgVar, fxg fxgVar, int i) {
        super(gbgVar, "b+6HH60+sLG9QsIJiClLOuRdcg8cAH4vbF/y9Ifowp5XD0wqAJQYLs2TXMvc6ISe", "eWXNdRqiEshgW8P2VbEM61AmF5buSCNZF1IJn//7VnA=", fxgVar, i, 51);
    }

    @Override // defpackage.gcr
    protected final void a() {
        fxg fxgVar = this.d;
        synchronized (fxgVar) {
            gbf gbfVar = new gbf((String) this.e.invoke(null, null));
            long jLongValue = gbfVar.a.longValue();
            fxgVar.copyOnWrite();
            fxl fxlVar = (fxl) fxgVar.instance;
            fxl fxlVar2 = fxl.a;
            fxlVar.c |= SemanticState.Obscured;
            fxlVar.M = jLongValue;
            long jLongValue2 = gbfVar.b.longValue();
            fxgVar.copyOnWrite();
            fxl fxlVar3 = (fxl) fxgVar.instance;
            fxlVar3.c |= SemanticState.Multiline;
            fxlVar3.N = jLongValue2;
        }
    }
}
