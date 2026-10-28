package defpackage;

import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aahg extends aagy {
    private final awmd g;
    private final awlo h;
    private boolean i;

    public aahg(awmd awmdVar, abxu abxuVar, awmd awmdVar2, awmd awmdVar3, vxz vxzVar, aauk aaukVar) {
        super(awmdVar, awmdVar2, abxuVar, vxzVar, aaukVar);
        this.h = new awlo();
        this.g = awmdVar3;
        aaukVar.M();
    }

    private final void m(String str, aahc aahcVar) {
        aaha aahaVarE = aahb.e();
        aahaVarE.b(str);
        aahaVarE.c(119);
        aahaVarE.a = aahcVar;
        this.h.kk(aahaVarE.a());
    }

    @Override // defpackage.aahd
    public final synchronized avlr c(zwa zwaVar) {
        avlr avlrVarK;
        awlo awloVar;
        if (!this.f.l(24, 45370274L, false) && !this.i) {
            ((tbt) this.g.io()).f(this);
            this.i = true;
        }
        wcn wcnVarB = i() ? ((wco) this.b.io()).b(zwaVar) : null;
        avlrVarK = wcnVarB != null ? wcnVarB.i(aoop.class).K(new zze(this, wcnVarB, 2)) : null;
        awloVar = this.h;
        return avlrVarK != null ? avlr.M(awloVar.az(), avlrVarK) : awloVar.az();
    }

    @Override // defpackage.aagy
    protected final ListenableFuture d(wcn wcnVar, List list) {
        return ahno.ar(tzk.b(wcnVar.n((agkz) Collection.EL.stream(list).map(new aaeq(13)).collect(aghu.b)).x(agpr.a)), new aagw(this, 4), this.e ? this.c : this.d);
    }

    @Override // defpackage.aagy
    protected final ListenableFuture f(wcn wcnVar, String str) {
        return tzk.e(wcnVar.g(wfs.g(119, str)).g(aoop.class).r(new yrb(this, 3)).t());
    }

    @Override // defpackage.aagy
    public final Optional h(aamt aamtVar) {
        wjf wjfVar = aamtVar.r;
        if (wjfVar == null) {
            return Optional.empty();
        }
        aoon aoonVarF = aoop.f(wfs.g(119, aamtVar.b()));
        if (!this.f.l(224, 45831962L, false)) {
            aoonVarF.aq(((wji) wjfVar).a.toByteString());
        }
        aoonVarF.ar(Long.valueOf(aamtVar.g.getEpochSecond()));
        aoonVarF.an(wfs.g(130, aamtVar.b()));
        aoonVarF.ao(wfs.g(120, aamtVar.b()));
        aoonVarF.ap(wfs.g(461, aamtVar.b()));
        String strG = wfs.g(146, aamtVar.b());
        aihh aihhVar = aoonVarF.a;
        aihhVar.copyOnWrite();
        aooq aooqVar = (aooq) aihhVar.instance;
        aooq aooqVar2 = aooq.a;
        strG.getClass();
        aooqVar.b |= SemanticState.LiveRegion;
        aooqVar.n = strG;
        l(aoonVarF, wjfVar);
        return Optional.of(aoonVarF);
    }

    @tcc
    public void handleOfflineVideoDeleteEvent(aaia aaiaVar) {
        m(aaiaVar.a, aahc.g);
    }

    @tcc
    public void handleOfflineVideoStatusUpdateEvent(aaif aaifVar) {
        m(aaifVar.a.b(), aahc.c);
    }

    @Override // defpackage.aagy
    protected final boolean i() {
        vxz vxzVar = this.f;
        return vxzVar.l(24, 45370274L, false) || vxzVar.l(142, 45632208L, false);
    }

    public final aoon k(aoop aoopVar) {
        vxz vxzVar = this.f;
        aoon aoonVarD = aoopVar.d();
        if (vxzVar.l(224, 45831962L, false)) {
            aihh aihhVar = aoonVarD.a;
            aihhVar.copyOnWrite();
            aooq aooqVar = (aooq) aihhVar.instance;
            aooq aooqVar2 = aooq.a;
            aooqVar.b &= -3;
            aooqVar.d = aooq.a.d;
        }
        return aoonVarD;
    }

    public final void l(aoon aoonVar, wjf wjfVar) {
        if (!this.f.l(158, 45650480L, false) || (((wji) wjfVar).a.b & 4) == 0) {
            return;
        }
        alvl alvlVarT = wjfVar.t();
        aofo aofoVarF = aaje.f(alvlVarT);
        aihh aihhVar = aoonVar.a;
        aihhVar.copyOnWrite();
        aooq aooqVar = (aooq) aihhVar.instance;
        aooq aooqVar2 = aooq.a;
        aooqVar.e = aofoVarF;
        aooqVar.b |= 4;
        aony aonyVarA = aony.a(alvlVarT.c);
        if (aonyVarA == null) {
            aonyVarA = aony.OK;
        }
        aihhVar.copyOnWrite();
        aooq aooqVar3 = (aooq) aihhVar.instance;
        aooqVar3.h = aonyVarA.k;
        aooqVar3.b |= 32;
    }
}
