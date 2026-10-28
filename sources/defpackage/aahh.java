package defpackage;

import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aahh extends aagy {
    private final awmd g;
    private final awlo h;
    private boolean i;

    public aahh(awmd awmdVar, abxu abxuVar, awmd awmdVar2, awmd awmdVar3, vxz vxzVar, aauk aaukVar) {
        super(awmdVar, awmdVar2, abxuVar, vxzVar, aaukVar);
        this.h = new awlo();
        this.g = awmdVar3;
    }

    private final void k(String str, aahc aahcVar) {
        aaha aahaVarE = aahb.e();
        aahaVarE.b(str);
        aahaVarE.c(120);
        aahaVarE.a = aahcVar;
        this.h.kk(aahaVarE.a());
    }

    @Override // defpackage.aahd
    public final avlr c(zwa zwaVar) {
        if (!this.f.l(23, 45370273L, false) && !this.i) {
            ((tbt) this.g.io()).f(this);
            this.i = true;
        }
        avlr avlrVarK = i() ? ((wco) this.b.io()).b(zwaVar).i(aqph.class).K(new xee(11)) : null;
        awlo awloVar = this.h;
        return avlrVarK != null ? avlr.M(awloVar.az(), avlrVarK) : awloVar.az();
    }

    @Override // defpackage.aagy
    protected final ListenableFuture d(wcn wcnVar, List list) {
        return ahno.ar(tzk.b(wcnVar.n((agkz) Collection.EL.stream(list).map(new aaeq(17)).collect(aghu.b)).x(agpr.a)), new xwx(18), this.e ? this.c : this.d);
    }

    @Override // defpackage.aagy
    protected final ListenableFuture f(wcn wcnVar, String str) {
        return tzk.e(wcnVar.g(wfs.g(120, str)).g(aqph.class).r(new xdx(15)).t());
    }

    @Override // defpackage.aagy
    public final Optional h(aamt aamtVar) {
        String strB = aamtVar.b();
        aqpf aqpfVarF = aqph.f(wfs.g(120, strB));
        aqpfVarF.ar(aamtVar.b);
        aagz aagzVarA = aagu.a(aamtVar);
        aqpfVarF.as(aagzVarA.a);
        Optional optional = aagzVarA.b;
        yyk yykVar = new yyk(aqpfVarF, 10);
        if (true == optional.isPresent()) {
            ((aqpf) yykVar.a).aq((aqpe) optional.get());
        }
        aqpfVarF.an(aagzVarA.c);
        long j = aamtVar.l;
        aihh aihhVar = aqpfVarF.a;
        Long.valueOf(j).getClass();
        aihhVar.copyOnWrite();
        aqpi aqpiVar = (aqpi) aihhVar.instance;
        aihw aihwVar = aqpi.a;
        aqpiVar.c |= SemanticState.ReadOnly;
        aqpiVar.s = j;
        if (aamtVar.p != null) {
            aqpfVarF.ao(wfs.g(198, strB));
        }
        return Optional.of(aqpfVarF);
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
