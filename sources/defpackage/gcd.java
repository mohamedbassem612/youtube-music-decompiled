package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gcd extends gcr {
    private final gat h;
    private final long i;
    private final long j;

    public gcd(gbg gbgVar, fxg fxgVar, int i, gat gatVar, long j, long j2) {
        super(gbgVar, "iw4EwBgoYu05CXoLW7sIKpJUGjSQb1DZKDE4Ki+MKVgFEcWPNH9mDrrO8q1Hze91", "CHvTxbC7YZeeu/SxrQwyvtBVczJxaHC8NyYPG8HP4Y4=", fxgVar, i, 11);
        this.h = gatVar;
        this.i = j;
        this.j = j2;
    }

    @Override // defpackage.gcr
    protected final void a() {
        gat gatVar = this.h;
        if (gatVar != null) {
            gar garVar = new gar((String) this.e.invoke(null, gatVar.a, Long.valueOf(this.i), Long.valueOf(this.j)));
            fxg fxgVar = this.d;
            synchronized (fxgVar) {
                long jLongValue = garVar.a.longValue();
                fxgVar.copyOnWrite();
                fxl fxlVar = (fxl) fxgVar.instance;
                fxl fxlVar2 = fxl.a;
                fxlVar.b |= SemanticState.ReadOnly;
                fxlVar.k = jLongValue;
                if (garVar.b.longValue() >= 0) {
                    long jLongValue2 = garVar.b.longValue();
                    fxgVar.copyOnWrite();
                    fxl fxlVar3 = (fxl) fxgVar.instance;
                    fxlVar3.d |= SemanticState.Modal;
                    fxlVar3.ae = jLongValue2;
                }
                if (garVar.c.longValue() >= 0) {
                    long jLongValue3 = garVar.c.longValue();
                    fxgVar.copyOnWrite();
                    fxl fxlVar4 = (fxl) fxgVar.instance;
                    fxlVar4.d |= SemanticState.Obscured;
                    fxlVar4.af = jLongValue3;
                }
            }
        }
    }
}
