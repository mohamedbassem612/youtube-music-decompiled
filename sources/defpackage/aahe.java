package defpackage;

import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aahe extends aagy {
    private final awmd g;
    private final awlo h;
    private boolean i;

    public aahe(awmd awmdVar, abxu abxuVar, awmd awmdVar2, awmd awmdVar3, vxz vxzVar, aauk aaukVar) {
        super(awmdVar, awmdVar2, abxuVar, vxzVar, aaukVar);
        this.h = new awlo();
        this.g = awmdVar3;
    }

    private final void k(String str, aahc aahcVar) {
        aaha aahaVarE = aahb.e();
        aahaVarE.b(str);
        aahaVarE.c(130);
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
        avlrVarK = i() ? ((wco) this.b.io()).b(zwaVar).i(aohk.class).K(new xee(9)) : null;
        awloVar = this.h;
        return avlrVarK != null ? avlr.M(awloVar.az(), avlrVarK) : awloVar.az();
    }

    @Override // defpackage.aagy
    protected final ListenableFuture d(wcn wcnVar, List list) {
        return ahno.ar(tzk.b(wcnVar.n((agkz) Collection.EL.stream(list).map(new aaeq(3)).collect(aghu.b)).x(agpr.a)), new xwx(16), this.e ? this.c : this.d);
    }

    @Override // defpackage.aagy
    protected final ListenableFuture f(wcn wcnVar, String str) {
        return tzk.e(wcnVar.g(wfs.g(130, str)).g(aohk.class).r(new xdx(13)).t());
    }

    @Override // defpackage.aagy
    public final Optional h(aamt aamtVar) {
        aohh aohhVar;
        aams aamsVar = aamtVar.m;
        if (aamsVar == null) {
            return Optional.empty();
        }
        aohi aohiVarE = aohk.e(wfs.g(130, aamtVar.b()));
        aogq aogqVar = aamsVar.c;
        aogp aogpVarA = aogp.a(aogqVar.h);
        if (aogpVarA == null) {
            aogpVarA = aogp.UNKNOWN;
        }
        int iOrdinal = aogpVarA.ordinal();
        if (iOrdinal != 1) {
            aohhVar = iOrdinal != 3 ? aohh.OFFLINE_VIDEO_POLICY_ACTION_UNKNOWN : aohh.OFFLINE_VIDEO_POLICY_ACTION_DISABLE;
        } else {
            aohhVar = aohh.OFFLINE_VIDEO_POLICY_ACTION_OK;
        }
        aohiVarE.am(aohhVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aohiVarE.an(Long.valueOf(aamsVar.a() / 1000));
        long j = aamsVar.e;
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        aohiVarE.ao(Long.valueOf(j / 1000));
        aohiVarE.aq(aogqVar.toByteString());
        String strC = aamsVar.c();
        if (strC != null) {
            aihf aihfVar = aohiVarE.a;
            aihfVar.copyOnWrite();
            aohl aohlVar = (aohl) aihfVar.instance;
            aohl aohlVar2 = aohl.a;
            aohlVar.b |= SemanticState.Hidden;
            aohlVar.k = strC;
        }
        if ((aogqVar.b & SemanticState.LiveRegion) != 0) {
            aoeu aoeuVar = aogqVar.l;
            if (aoeuVar == null) {
                aoeuVar = aoeu.a;
            }
            aohiVarE.ap(aoeuVar);
        }
        int i = aogqVar.c;
        if (i == 15) {
            aohiVarE.ar(i == 15 ? (aoet) aogqVar.d : aoet.a);
        }
        if ((aogqVar.b & 16) != 0) {
            String str = aogqVar.i;
            aihf aihfVar2 = aohiVarE.a;
            aihfVar2.copyOnWrite();
            aohl aohlVar3 = (aohl) aihfVar2.instance;
            aohl aohlVar4 = aohl.a;
            str.getClass();
            aohlVar3.b |= SemanticState.Focused;
            aohlVar3.j = str;
        }
        return Optional.of(aohiVarE);
    }

    @tcc
    public void handleOfflineVideoDeleteEvent(aaia aaiaVar) {
        k(aaiaVar.a, aahc.g);
    }

    @tcc
    public void handleOfflineVideoRefreshedEvent(aaie aaieVar) {
        k(aaieVar.a, aahc.d);
    }

    @tcc
    public void handleOfflineVideoStatusUpdateEvent(aaif aaifVar) {
        k(aaifVar.a.b(), aahc.c);
    }

    @Override // defpackage.aagy
    protected final boolean i() {
        vxz vxzVar = this.f;
        return vxzVar.l(24, 45370274L, false) || vxzVar.l(142, 45632208L, false);
    }
}
