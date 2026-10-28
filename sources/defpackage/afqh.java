package defpackage;

import internal.org.jni_zero.JniZero;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afqh implements boe {
    private final /* synthetic */ int $cid;
    final /* synthetic */ boa a;
    final /* synthetic */ awrm b;
    final /* synthetic */ awut c;
    final /* synthetic */ boa d;
    final /* synthetic */ awuc e;
    final /* synthetic */ axff f;
    final /* synthetic */ awqk g;

    public afqh(boa boaVar, awrm awrmVar, awut awutVar, boa boaVar2, awuc awucVar, axff axffVar, awqk awqkVar, int i) {
        this.$cid = i;
        this.a = boaVar;
        this.b = awrmVar;
        this.c = awutVar;
        this.d = boaVar2;
        this.e = awucVar;
        this.f = axffVar;
        this.g = awqkVar;
    }

    @Override // defpackage.boe
    public final void a(bog bogVar, boa boaVar) throws Throwable {
        awwd awwdVarS;
        int i = this.$cid;
        boa boaVar2 = this.a;
        if (i != 0) {
            if (boaVar == boaVar2) {
                this.b.a = awro.t(this.c, null, 0, new poi(this.f, this.g, (awoq) null, 1), 3);
                return;
            }
            if (boaVar == this.d) {
                awrm awrmVar = this.b;
                awwd awwdVar = (awwd) awrmVar.a;
                if (awwdVar != null) {
                    awwdVar.p(null);
                }
                awrmVar.a = null;
            }
            if (boaVar == boa.ON_DESTROY) {
                this.e.resumeWith(awmy.a);
                return;
            }
            return;
        }
        if (boaVar != boaVar2) {
            if (boaVar == this.d) {
                awrm awrmVar2 = this.b;
                awwd awwdVar2 = (awwd) awrmVar2.a;
                if (awwdVar2 != null) {
                    awwdVar2.p(null);
                }
                awrmVar2.a = null;
            }
            if (boaVar == boa.ON_DESTROY) {
                this.e.resumeWith(awmy.a);
                return;
            }
            return;
        }
        awrm awrmVar3 = this.b;
        awut awutVar = this.c;
        axff axffVar = this.f;
        awqk awqkVar = this.g;
        if (afty.o()) {
            afws.b(awutVar);
            awwdVarS = awro.s(awutVar, aewp.k(), 1, new afqg(null, axffVar, awqkVar, 1, null));
        } else {
            UUID uuid = afuh.a;
            afuh afuhVar = new afuh("lifecycle state changed", afuh.a, afuh.b, afux.a, afty.a());
            afty.d(afuhVar);
            try {
                afws.b(awutVar);
                awwdVarS = awro.s(awutVar, aewp.k(), 1, new afqg((awoq) null, axffVar, awqkVar, 0));
                JniZero.l(afuhVar, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    JniZero.l(afuhVar, th);
                    throw th2;
                }
            }
        }
        awrmVar3.a = awwdVarS;
    }
}
