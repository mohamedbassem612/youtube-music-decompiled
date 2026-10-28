package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aahf extends aagy {
    private final awmd g;
    private final awlo h;
    private boolean i;

    public aahf(awmd awmdVar, abxu abxuVar, awmd awmdVar2, awmd awmdVar3, vxz vxzVar, aauk aaukVar) {
        super(awmdVar, awmdVar2, abxuVar, vxzVar, aaukVar);
        this.h = new awlo();
        this.g = awmdVar3;
    }

    private final void k(String str, aahc aahcVar) {
        aaha aahaVarE = aahb.e();
        aahaVarE.b(str);
        aahaVarE.c(198);
        aahaVarE.a = aahcVar;
        this.h.kk(aahaVarE.a());
    }

    @Override // defpackage.aahd
    public final synchronized avlr c(zwa zwaVar) {
        avlr avlrVarK;
        awlo awloVar;
        if (!this.f.l(23, 45370273L, false) && !this.i) {
            ((tbt) this.g.io()).f(this);
            this.i = true;
        }
        avlrVarK = i() ? ((wco) this.b.io()).b(zwaVar).i(aohq.class).K(new xee(10)) : null;
        awloVar = this.h;
        return avlrVarK != null ? avlr.M(awloVar.az(), avlrVarK) : awloVar.az();
    }

    @Override // defpackage.aagy
    protected final ListenableFuture d(wcn wcnVar, List list) {
        return ahno.ar(tzk.b(wcnVar.n((agkz) Collection.EL.stream(list).map(new aaeq(10)).collect(aghu.b)).x(agpr.a)), new xwx(17), this.e ? this.c : this.d);
    }

    @Override // defpackage.aagy
    protected final ListenableFuture f(wcn wcnVar, String str) {
        return tzk.e(wcnVar.g(wfs.g(198, str)).g(aohq.class).r(new xdx(14)).t());
    }

    @Override // defpackage.aagy
    public final Optional h(aamt aamtVar) {
        agke agkeVarB = aagu.b(aamtVar);
        if (agkeVarB.isEmpty()) {
            return Optional.empty();
        }
        aoho aohoVarE = aohq.e(wfs.g(198, aamtVar.b()));
        aohoVarE.am(agkeVarB);
        return Optional.of(aohoVarE);
    }

    @tcc
    public void handleOfflineVideoCompleteEvent(aahz aahzVar) {
        k(aahzVar.a.b(), aahc.e);
    }

    @tcc
    public void handleOfflineVideoDeleteEvent(aaia aaiaVar) {
        k(aaiaVar.a, aahc.g);
    }

    @tcc
    public void handleOfflineVideoStatusUpdateEvent(aaif aaifVar) {
        k(aaifVar.a.b(), aahc.c);
    }

    @Override // defpackage.aagy
    protected final boolean i() {
        vxz vxzVar = this.f;
        return vxzVar.l(23, 45370273L, false) || vxzVar.l(142, 45632208L, false);
    }
}
