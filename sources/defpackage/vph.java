package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vph implements advd {
    private final adxi a;
    private final vnb b;
    private final srq c;
    private final wnf d;
    private final xgn e;

    public vph(jaz jazVar, srq srqVar, wnf wnfVar, xgn xgnVar, vnb vnbVar) {
        this.c = srqVar;
        this.d = wnfVar;
        this.e = xgnVar;
        this.a = jazVar.a(wnfVar, xgnVar);
        this.b = vnbVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x013c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.advd
    public final advc a(Object obj, adxd adxdVar, adwr adwrVar) {
        advc advcVar;
        if (obj instanceof wga) {
            wga wgaVar = (wga) obj;
            amgg amggVar = wgaVar.a;
            String str = amggVar.i;
            if (!str.equals("comment-item-section") && !str.equals("community-tab-chip-posts-section")) {
                amge amgeVar = amggVar.d;
                if (amgeVar == null) {
                    amgeVar = amge.a;
                }
                if ((amgeVar.b & 4) == 0) {
                    advcVar = (advc) Optional.empty().orElse(this.a.a(obj, adxdVar, adwrVar));
                }
            }
            srq srqVar = this.c;
            wnf wnfVar = this.d;
            xgn xgnVar = this.e;
            advb advbVar = (advb) srqVar.a.io();
            advbVar.getClass();
            tbt tbtVar = (tbt) srqVar.b.io();
            tbtVar.getClass();
            ttm ttmVar = (ttm) srqVar.c.io();
            ttmVar.getClass();
            roq roqVar = (roq) srqVar.d.io();
            acyx acyxVar = (acyx) srqVar.e.io();
            ((lqa) srqVar.f.io()).getClass();
            lqa lqaVar = (lqa) srqVar.g.io();
            lqaVar.getClass();
            ((vxu) srqVar.h.io()).getClass();
            vxz vxzVar = (vxz) srqVar.i.io();
            vxzVar.getClass();
            vxz vxzVar2 = (vxz) srqVar.j.io();
            vxzVar2.getClass();
            roq roqVar2 = (roq) srqVar.k.io();
            roqVar2.getClass();
            xsc xscVar = (xsc) srqVar.l.io();
            xscVar.getClass();
            sry sryVar = (sry) srqVar.m.io();
            sryVar.getClass();
            lqa lqaVar2 = (lqa) srqVar.n.io();
            lqaVar2.getClass();
            stp stpVar = (stp) srqVar.o.io();
            stpVar.getClass();
            lqa lqaVar3 = (lqa) srqVar.p.io();
            lqaVar3.getClass();
            aciz acizVar = (aciz) srqVar.q.io();
            acxn acxnVar = (acxn) srqVar.r.io();
            acxnVar.getClass();
            vxe vxeVar = (vxe) srqVar.s.io();
            vxeVar.getClass();
            vxz vxzVar3 = (vxz) srqVar.t.io();
            vxzVar3.getClass();
            srp srpVar = new srp(advbVar, tbtVar, ttmVar, roqVar, acyxVar, lqaVar, vxzVar, vxzVar2, roqVar2, xscVar, sryVar, lqaVar2, stpVar, lqaVar3, acizVar, acxnVar, vxeVar, vxzVar3, wnfVar, xgnVar, adxdVar, adwrVar);
            srpVar.e(wgaVar);
            advcVar = srpVar;
        } else {
            advcVar = (advc) Optional.empty().orElse(this.a.a(obj, adxdVar, adwrVar));
        }
        if (advcVar instanceof vox) {
            this.b.b((vox) advcVar);
        }
        return advcVar;
    }
}
