package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xyb extends xxk {
    public xyb(tbt tbtVar, abvn abvnVar, awmd awmdVar, awmd awmdVar2, xmr xmrVar, vxz vxzVar, ycp ycpVar) {
        super(tbtVar, (xxm) abvnVar.l(), awmdVar, awmdVar2, xmrVar, vxzVar, ycpVar);
    }

    @Override // defpackage.xxk
    protected final void b(xyv xyvVar) {
        this.d.c(new xye(xyvVar));
    }

    @Override // defpackage.xxk
    protected final void c() {
        this.d.c(new xyc(true, abjx.a, -1L, null, false));
    }

    @Override // defpackage.xxk
    protected final void d(xyv xyvVar) {
        this.d.c(new xyd(xyvVar));
    }

    @Override // defpackage.xxk
    protected final void e(abjx abjxVar, amyu amyuVar, boolean z) {
        abvk abvkVarG = g();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.d.c(new xyc(false, abjxVar, abvkVarG.c() / 1000, amyuVar, z));
    }
}
