package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acgp implements acgl {
    private final abvn a;
    private final Optional b;
    private final dxu c;

    public acgp(abvn abvnVar, dxu dxuVar, Optional optional) {
        this.a = abvnVar;
        this.c = dxuVar;
        this.b = optional;
    }

    @Override // defpackage.acgl
    public final void a(akje akjeVar, acfx acfxVar, long j) {
        ahno.F(akjeVar.b == 2);
        if (acfxVar.o(j)) {
            if (((akjeVar.b == 2 ? (aksq) akjeVar.c : aksq.a).b & 1) != 0) {
                this.a.o().aq(true, 45);
                dxu dxuVar = this.c;
                apji apjiVar = (akjeVar.b == 2 ? (aksq) akjeVar.c : aksq.a).c;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aoqq.a);
                apjiVar.c(aihlVarCheckIsLite);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                aoqp aoqpVar = (aoqp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                alay alayVar = aoqpVar.c;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                dxuVar.g(new aboe(17, false, 3, ackj.k(null, alayVar, null, false).toString(), null, null, null, aoqpVar));
            }
            this.b.isPresent();
        }
    }

    @Override // defpackage.acgl
    public final void b(akje akjeVar, acfx acfxVar, long j, boolean z) {
        ahno.F(akjeVar.b == 2);
        if (acfxVar.o(j) || !z) {
            return;
        }
        this.b.isPresent();
    }
}
