package defpackage;

import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class srg extends advj implements srx {
    private final acyx a;
    private final xgn b;
    private final sry c;
    private final acxn d;
    private final adxv e;
    private final vxz m;
    private final xsc n;

    public srg(advb advbVar, tbt tbtVar, ttm ttmVar, acyx acyxVar, xsc xscVar, sry sryVar, acxn acxnVar, aciz acizVar, vxz vxzVar, vxz vxzVar2, wnf wnfVar, xgn xgnVar, adxd adxdVar, advq advqVar) {
        adxz adxzVarL;
        super(wnfVar, advbVar, tbtVar, ttmVar, xgnVar, vxzVar.l(338, 45723774L, false) ? adxd.a(adxdVar) : adxdVar, vxzVar2);
        this.a = acyxVar;
        this.n = xscVar;
        this.c = sryVar;
        this.b = xgnVar;
        this.d = acxnVar;
        this.m = vxzVar;
        if (vxzVar.l(338, 45723774L, false)) {
            adxzVarL = acizVar.m(advqVar, adxdVar instanceof srf ? ((srf) adxdVar).a : null);
        } else {
            adxzVarL = acizVar.l(advqVar);
        }
        this.e = adxzVarL;
        Q(acyxVar);
        sryVar.a(this);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    /* JADX WARN: Code duplicated, block: B:18:0x0029  */
    /* JADX WARN: Code duplicated, block: B:20:0x002d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0030  */
    @Override // defpackage.srx
    public final void h(alnr alnrVar) {
        alna alnaVar;
        alns alnsVar = alnrVar.d;
        if (alnsVar == null) {
            alnsVar = alns.a;
        }
        if (alnsVar.b != 153515154 || this.a == null) {
            return;
        }
        if ((alnrVar.b & 16) == 0) {
            xsc xscVar = this.n;
            if ((alnrVar.b & 16) != 0) {
                alnaVar = alnrVar.f;
                if (alnaVar == null) {
                    alnaVar = alna.a;
                }
            } else {
                alnaVar = null;
            }
            xscVar.W(alnaVar, agkj.j("sectionController", this), R.string.reply_added);
        } else {
            alna alnaVar2 = alnrVar.f;
            if (alnaVar2 == null) {
                alnaVar2 = alna.a;
            }
            if (!alnaVar2.h) {
                xsc xscVar2 = this.n;
                if ((alnrVar.b & 16) != 0) {
                    alnaVar = alnrVar.f;
                    if (alnaVar == null) {
                        alnaVar = alna.a;
                    }
                } else {
                    alnaVar = null;
                }
                xscVar2.W(alnaVar, agkj.j("sectionController", this), R.string.reply_added);
            }
        }
        adxv adxvVar = this.e;
        if (adxvVar != null && (alnrVar.b & 64) != 0) {
            apok apokVar = alnrVar.g;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            adxvVar.a(apokVar, new srm(1));
            return;
        }
        if (o(acjw.b)) {
            return;
        }
        alns alnsVar2 = alnrVar.d;
        if (alnsVar2 == null) {
            alnsVar2 = alns.a;
        }
        akrn akrnVar = alnsVar2.b == 153515154 ? (akrn) alnsVar2.c : akrn.a;
        if ((akrnVar.b & 8) != 0) {
            this.b.d(new xgj(akrnVar.d.G()));
        }
        E(this.d.a(akrnVar));
    }

    @Override // defpackage.advj
    @tcc
    public void handleHideEnclosingEvent(vvt vvtVar) {
        super.handleHideEnclosingEvent(vvtVar);
    }

    @Override // defpackage.advj
    @tcc
    public void handleItemDismissedEvent(adve adveVar) {
        super.handleItemDismissedEvent(adveVar);
    }

    @Override // defpackage.advj
    @tcc
    public void handleRemoveItemEvent(vvu vvuVar) {
        super.handleRemoveItemEvent(vvuVar);
    }

    @Override // defpackage.advj
    @tcc
    public void handleServiceResponseRemoveEvent(wpx wpxVar) {
        super.handleServiceResponseRemoveEvent(wpxVar);
    }

    @Override // defpackage.advj, defpackage.adty, defpackage.adtv, defpackage.advw
    public final adxd hq() {
        if (!this.m.l(338, 45723774L, false)) {
            return super.hq();
        }
        adxd adxdVarHq = super.hq();
        adxv adxvVar = this.e;
        return new srf(adxdVarHq, adxvVar != null ? ((adxz) adxvVar).hq() : null);
    }

    @Override // defpackage.advj, defpackage.adty, defpackage.adtv, defpackage.twn
    public final void i() {
        super.i();
        this.c.d(this);
    }
}
