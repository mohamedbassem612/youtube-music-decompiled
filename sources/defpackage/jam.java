package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jam extends advj {
    private final avlr a;
    private final avmb b;
    private avmn c;
    private final vxz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jam(advb advbVar, tbt tbtVar, ttm ttmVar, acyx acyxVar, vxz vxzVar, vxz vxzVar2, dov dovVar, avmb avmbVar, wnf wnfVar, xgn xgnVar, adxd adxdVar) {
        super(wnfVar, advbVar, tbtVar, ttmVar, xgnVar, adxdVar, vxzVar);
        Object obj = dovVar.a;
        Q(acyxVar);
        this.d = vxzVar2;
        this.a = (avlr) obj;
        this.b = avmbVar;
        r();
    }

    private final void h() {
        Object obj = this.c;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
            this.c = null;
        }
    }

    private final void r() {
        h();
        if (this.d.l(240, 45794845L, false)) {
            if (ahno.aa(this.i) && ahno.aa(this.j)) {
                return;
            }
            this.c = this.a.B(new hhw(this, 14)).O(this.b).af(new iwb(this, 7));
        }
    }

    @Override // defpackage.advj
    public final void e(wga wgaVar) {
        super.e(wgaVar);
        r();
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

    @Override // defpackage.adtv
    protected final boolean hu() {
        return this.d.l(240, 45794845L, false);
    }

    @Override // defpackage.advj, defpackage.adty, defpackage.adtv, defpackage.twn
    public final void i() {
        h();
        super.i();
    }
}
