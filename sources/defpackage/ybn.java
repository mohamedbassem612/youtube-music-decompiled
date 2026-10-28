package defpackage;

import android.content.Context;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ybn extends ycj {
    private final xvk a;
    private final vxz b;
    private final qcb c;

    /* JADX WARN: Illegal instructions before constructor call */
    public ybn(xvk xvkVar, qcb qcbVar, Context context, ycp ycpVar, ycp ycpVar2, ttm ttmVar, wjr wjrVar, int i, String str, xla xlaVar, amyv amyvVar, String str2, vxz vxzVar) {
        Optional optionalOfNullable = Optional.ofNullable(str2);
        xzd xzdVarCS = yno.cS(str);
        xzdVarCS.k(4);
        xzdVarCS.i(xvkVar.c());
        xzdVarCS.g(i);
        xzdVarCS.f(xqz.f(xvkVar));
        super(context, ycpVar, ycpVar2, wjrVar, ttmVar, xlaVar, amyvVar, optionalOfNullable, vxzVar, xzdVarCS.a());
        this.a = xvkVar;
        this.c = qcbVar;
        this.b = vxzVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038  */
    @Override // defpackage.ycj, defpackage.xzc
    public final void I(xyv xyvVar) {
        if (this.C == amyv.MDX_SESSION_SOURCE_ALWAYS_AUTOCONNECT) {
            xyvVar = xyv.a;
        }
        super.I(xyvVar);
        qcb qcbVar = this.c;
        xvk xvkVar = this.a;
        yaa yaaVar = new yaa((ycj) this);
        ycp ycpVar = this.E;
        yam yamVarB = qcbVar.B(xvkVar.a, yaaVar, ycpVar, this);
        this.A = yamVarB;
        if (this.b.l(53, 45391510L, false)) {
            Optional optional = this.B;
            if (optional.isPresent()) {
                yamVarB.m(xyvVar, optional);
            } else {
                yamVarB.l(xyvVar);
            }
        } else {
            yamVarB.l(xyvVar);
        }
        ycpVar.l(10);
    }

    @Override // defpackage.xzc
    public final xvr j() {
        return this.a;
    }

    @Override // defpackage.yco
    public final void aA() {
    }

    @Override // defpackage.yco
    public final void aB(boolean z) {
    }
}
