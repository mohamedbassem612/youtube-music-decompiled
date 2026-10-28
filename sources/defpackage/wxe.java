package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class wxe extends wwy {
    private boolean f;
    public final ttm g;
    private final xgm h;

    public wxe(wnf wnfVar, tbt tbtVar, final ttm ttmVar, final wwn wwnVar, xgm xgmVar) {
        super(wnfVar, tbtVar, ttmVar, wwnVar, wwnVar.l);
        this.f = false;
        this.h = xgmVar;
        this.g = ttmVar;
        this.an = new adtm() { // from class: wxd
            @Override // defpackage.adtm
            public final void p(toe toeVar, acjx acjxVar) {
                wxe wxeVar = this.a;
                if (wxeVar.a) {
                    wwnVar.s(ttmVar.b(toeVar), new wtg(wxeVar, acjxVar, 15));
                }
            }
        };
    }

    @Override // defpackage.wwy
    public final void a() {
        aA();
    }

    @Override // defpackage.wwy
    public final void h() {
        this.f = false;
    }

    @Override // defpackage.adtv
    protected final /* bridge */ /* synthetic */ void hs(Object obj, acjx acjxVar) {
        v((amqm) obj);
    }

    @Override // defpackage.wwy
    public final void j(List list) {
        super.aI(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArrH = ((acjx) it.next()).h();
            if (bArrH != null) {
                xgn xgnVarHB = this.h.hB();
                if (xgnVarHB.a() != null) {
                    xgnVarHB.d(new xgj(bArrH));
                } else {
                    wwn wwnVar = this.e;
                    wwnVar.l.d(new xgj(bArrH));
                }
            }
        }
    }

    @Override // defpackage.wwy
    public final void k() {
        aA();
        this.f = true;
    }

    @Override // defpackage.wwy
    public boolean l() {
        return false;
    }

    @Override // defpackage.wwy
    public final boolean q() {
        return !this.f;
    }

    public final void v(amqm amqmVar) {
        if (q()) {
            this.e.m(amqmVar);
        }
    }
}
