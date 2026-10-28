package defpackage;

import android.content.res.Configuration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class adty extends adtv implements advc {
    private final tbt a;
    private boolean b;
    private boolean c;
    private final vxz d;
    public final adlr f;
    public advl g;
    public acjx h;

    protected adty(wnf wnfVar, tbt tbtVar, ttm ttmVar, xgn xgnVar, adxd adxdVar, adlr adlrVar, vxz vxzVar) {
        super(adxdVar != null ? adxdVar.o : null, wnfVar, tbtVar, new Object(), ttmVar, xgnVar);
        this.a = tbtVar;
        this.d = vxzVar;
        hxg hxgVar = new hxg(this, 13);
        adtw adtwVar = new adtw(this, 0);
        if (vxzVar.l(38, 45752978L, false)) {
            this.f = new adld(adlrVar);
        } else {
            this.f = adlrVar;
        }
        if (adxdVar instanceof adtx) {
            adtx adtxVar = (adtx) adxdVar;
            this.f.l(adtxVar.a);
            this.b = adtxVar.b;
            this.h = adtxVar.c;
            advl advlVar = adtxVar.d;
            L(new advl(advlVar.a, advlVar.b, hxgVar, adtwVar));
        } else {
            this.b = true;
            L(new advl(null, ax(), hxgVar, adtwVar));
        }
        tbtVar.i(this, adty.class, ax());
        this.c = true;
    }

    private final boolean h() {
        adlr adlrVar = this.f;
        return !adlrVar.isEmpty() && adlrVar.d(adlrVar.a() + (-1)) == this.g;
    }

    public final void E(Object obj) {
        F(obj, this.f.a() - (h() ? 1 : 0));
    }

    protected void F(Object obj, int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f.a() - (h() ? 1 : 0)) {
            z = true;
        }
        ahno.O(z);
        this.f.add(i, obj);
        L(this.g);
    }

    public final void G(Collection collection) {
        boolean zL = this.d.l(38, 45752978L, false);
        adlr adlrVar = this.f;
        if (!zL) {
            I(collection, adlrVar.a() - (h() ? 1 : 0));
            return;
        }
        collection.getClass();
        adlr adlrVar2 = ((adld) adlrVar).a;
        adlrVar2.addAll(adlrVar2.a(), collection);
        L(this.g);
    }

    protected final void I(Collection collection, int i) {
        this.f.addAll(i, collection);
        L(this.g);
    }

    public final void J(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return;
        }
        this.f.k(obj, obj2);
    }

    protected final void K(adlr adlrVar) {
        adlr adlrVar2 = this.f;
        if (adlrVar2 instanceof adld) {
            adld adldVar = (adld) adlrVar2;
            adlrVar.getClass();
            adlr adlrVar3 = adldVar.a;
            if (adlrVar != adlrVar3) {
                xbl xblVar = adldVar.c;
                adlrVar3.n(xblVar);
                adldVar.a = adlrVar;
                Iterator it = adldVar.b.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    adldVar.a.e((adlz) next);
                }
                adldVar.a.h(xblVar);
                adldVar.d.O();
            }
        }
    }

    public final void L(advl advlVar) {
        boolean z = !this.b && this.c;
        if (this.d.l(38, 45752978L, false)) {
            ((adld) this.f).m(true != z ? null : advlVar);
        } else {
            adlr adlrVar = this.f;
            if (!z) {
                adlrVar.remove(this.g);
            } else if (adlrVar.contains(this.g)) {
                advl advlVar2 = this.g;
                if (advlVar2 != advlVar) {
                    adlrVar.k(advlVar2, advlVar);
                }
            } else {
                adlrVar.add(advlVar);
            }
        }
        this.g = advlVar;
    }

    public final void M() {
        if (this.c) {
            this.c = false;
            L(this.g);
        }
    }

    @Override // defpackage.advc
    public adkz a() {
        return this.f;
    }

    @Override // defpackage.adtv, defpackage.advw
    public adxd hq() {
        ArrayList arrayList = new ArrayList();
        this.f.hH(arrayList);
        adxd adxdVarHq = super.hq();
        boolean z = this.b;
        acjx acjxVar = this.h;
        advl advlVar = this.g;
        return new adtx(adxdVarHq, arrayList, z, acjxVar, new advl(advlVar.a, advlVar.b, null, null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adtv
    public final void ht(toe toeVar, acjx acjxVar) {
        super.ht(toeVar, acjxVar);
        this.h = acjxVar;
    }

    @Override // defpackage.adtv, defpackage.twn
    public void i() {
        super.i();
        this.a.l(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l(Object obj) {
        if (obj != null) {
            this.f.remove(obj);
        }
    }

    @tcc
    public void onContentEvent(adtk adtkVar) {
        this.b = true;
        L(this.g.a(adtkVar));
    }

    @tcc
    public void onContinuationRequestEvent(adue adueVar) {
        throw null;
    }

    @tcc
    public void onErrorEvent(adtr adtrVar) {
        this.b = false;
        L(this.g.a(adtrVar));
    }

    @tcc
    public void onLoadingEvent(adts adtsVar) {
        this.b = false;
        L(this.g.a(adtsVar));
    }

    protected void x() {
        this.f.clear();
        z();
    }

    @Override // defpackage.advc
    public final void k(Configuration configuration) {
    }

    public adty(wnf wnfVar, tbt tbtVar, ttm ttmVar, xgn xgnVar, vxz vxzVar) {
        this(wnfVar, tbtVar, ttmVar, xgnVar, null, new admu(), vxzVar);
    }
}
