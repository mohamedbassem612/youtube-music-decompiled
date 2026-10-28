package defpackage;

import androidx.car.app.model.Alert;
import j$.util.Optional;
import java.util.List;
import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class adsx extends adsv implements advp {
    protected final admu a;
    protected final admu b;
    protected admu c;
    protected final aduo d;
    public boolean e;
    public int f;
    public agev g;
    public final vxz h;
    private final tbt i;
    private final apun j;
    private final adlq k;
    private final admu l;
    private final adku m;
    private final admu n;
    private final adul o;
    private boolean p;
    private final int q;
    private final aecf r;
    private final avmn s;
    private aeay t;
    private final List u;
    private final abfv v;

    public adsx(advb advbVar, tbt tbtVar, apun apunVar, List list, int i, aecf aecfVar, aduo aduoVar, adxd adxdVar, vxz vxzVar) {
        List listC;
        list.getClass();
        this.i = tbtVar;
        this.j = apunVar;
        this.q = i;
        this.h = vxzVar;
        this.r = aecfVar;
        adlq adlqVar = new adlq(r());
        this.k = adlqVar;
        admu admuVar = new admu();
        this.a = admuVar;
        admu admuVar2 = new admu();
        this.l = admuVar2;
        adku adkuVar = new adku(admuVar2);
        this.m = adkuVar;
        admu admuVar3 = new admu();
        this.n = admuVar3;
        admu admuVar4 = new admu();
        this.b = admuVar4;
        this.c = new admu();
        this.g = agdf.a;
        this.d = aduoVar;
        this.o = new adul();
        this.t = new aeay(1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, new Random().nextInt(Alert.DURATION_SHOW_INDEFINITELY) + 1);
        advbVar.b(c());
        tbtVar.g(this, adsx.class);
        this.f = b(1);
        adlqVar.e(new jeo(adtc.a, 8));
        abfv abfvVar = new abfv();
        this.v = abfvVar;
        e();
        f(null);
        if (adxdVar instanceof adsw) {
            adsw adswVar = (adsw) adxdVar;
            listC = adswVar.b;
            this.u = listC;
            this.e = adswVar.a;
            this.p = adswVar.c;
            this.c = adswVar.d;
        } else {
            listC = abfvVar.c(list);
            this.u = listC;
            aqjn aqjnVar = apunVar.f;
            aqjnVar = aqjnVar == null ? aqjn.a : aqjnVar;
            if (aqjnVar.d.size() > 0) {
            }
            this.p = true;
        }
        Optional optionalB = aecfVar.b();
        adha adhaVar = new adha(this, 5);
        optionalB.isPresent();
        this.s = (avmn) Optional.ofNullable(((avlr) optionalB.get()).ag(new acym(adhaVar.a, 6), new acrr(10))).orElse(new avmq(avoi.b));
        if (listC.isEmpty()) {
            return;
        }
        if (r()) {
            taq.d();
        }
        if (this.p) {
            adlqVar.m(-1, admuVar, true);
            adlqVar.m(-1, adkuVar, true);
            adlqVar.m(-1, admuVar3, true);
            adlqVar.m(-1, admuVar4, true);
        } else if (!this.c.isEmpty()) {
            adlqVar.m(-1, this.c, true);
        }
        if (!apunVar.i) {
            if ((apunVar.b & 32) != 0) {
                apji apjiVar = apunVar.g;
                apjiVar = apjiVar == null ? apji.a : apjiVar;
                aihl aihlVar = aphn.a;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                apjiVar.c(aihlVarCheckIsLite);
                if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                    apji apjiVar2 = apunVar.g;
                    apjiVar2 = apjiVar2 == null ? apji.a : apjiVar2;
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                    apjiVar2.c(aihlVarCheckIsLite2);
                    Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                    admuVar.add(objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                } else {
                    apji apjiVar3 = apunVar.g;
                    apjiVar3 = apjiVar3 == null ? apji.a : apjiVar3;
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(akrs.a);
                    apjiVar3.c(aihlVarCheckIsLite3);
                    apjiVar3.j.n(aihlVarCheckIsLite3.d);
                }
            } else {
                admuVar.add(apunVar);
            }
        }
        if ((apunVar.b & 64) != 0) {
            apji apjiVar4 = apunVar.h;
            apjiVar4 = apjiVar4 == null ? apji.a : apjiVar4;
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(akrs.a);
            apjiVar4.c(aihlVarCheckIsLite4);
            apjiVar4.j.n(aihlVarCheckIsLite4.d);
        }
        this.e = this.e || listC.size() <= i;
        m();
        h();
        j();
    }

    private final boolean p() {
        int iAX = a.aX(this.j.m);
        if (iAX == 0) {
            iAX = 1;
        }
        return iAX == 3 || iAX == 6 || iAX == 4 || iAX == 5 || iAX == 2;
    }

    private final boolean r() {
        return this.h.l(313, 45763001L, false);
    }

    private final boolean s() {
        return this.f > 0;
    }

    private final boolean t() {
        boolean z = (this.f > 1 && this.u.size() > 1) || p() || (this.h.l(317, 45766757L, false) && this.r != aecf.a);
        if (s() && z) {
            return (r() && u()) ? false : true;
        }
        return false;
    }

    private final boolean u() {
        return this.h.l(316, 45764742L, false);
    }

    @Override // defpackage.advc
    public final adkz a() {
        return this.k;
    }

    public final int b(int i) {
        apun apunVar = this.j;
        int i2 = apunVar.c;
        if (i2 != 45) {
            return i2 == 46 ? Math.max(((Integer) apunVar.d).intValue(), i) : i;
        }
        return ((Integer) apunVar.d).intValue();
    }

    protected abstract Class c();

    protected final void f(adwp adwpVar) {
        this.v.d(adwpVar);
    }

    public final void g(int i) {
        this.f = b(i);
        m();
        h();
        j();
    }

    protected final void h() {
        admu admuVar = this.l;
        admuVar.clear();
        List list = this.u;
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        if (!t()) {
            if (s()) {
                admuVar.addAll(list);
                return;
            }
            return;
        }
        int i = this.f;
        int i2 = ((size + i) - 1) / i;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = this.f;
            int i5 = i3 * i4;
            i3++;
            admuVar.add(new adla(this.f, list.subList(i5, Math.min(i4 * i3, size)), 0, 0, 0, 0));
        }
    }

    @tcc
    public void handleHideEnclosingEvent(vvt vvtVar) {
        Object obj = vvtVar.a;
        if (obj == this.j) {
            o();
            return;
        }
        List list = this.u;
        if (list.remove(obj)) {
            agke agkeVarQ = agke.q(obj);
            if (list.isEmpty()) {
                o();
                return;
            }
            if (t()) {
                h();
            } else {
                int i = ((agpi) agkeVarQ).d;
                for (int i2 = 0; i2 < i; i2++) {
                    this.l.remove(agkeVarQ.get(i2));
                }
            }
            j();
        }
    }

    @tcc
    public void handleRemoveItemEvent(vvu vvuVar) {
        if (this.h.l(290, 45733803L, true)) {
            throw null;
        }
    }

    @tcc
    public void handleServiceResponseRemoveEvent(wpx wpxVar) {
        throw null;
    }

    @Override // defpackage.adsv, defpackage.advw
    public final adxd hq() {
        return new adsw(this.e, this.u, this.p, this.c);
    }

    @Override // defpackage.adsv, defpackage.twn
    public final void i() {
        this.i.l(this);
        this.s.dispose();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002e  */
    protected final void j() {
        boolean z;
        admu admuVar = this.l;
        int iA = this.m.a();
        int size = admuVar.size();
        boolean z2 = iA >= size;
        aduo aduoVar = this.d;
        aduoVar.b = z2;
        apun apunVar = this.j;
        akrq akrqVar = apunVar.n;
        if (akrqVar == null) {
            akrqVar = akrq.a;
        }
        if ((akrqVar.b & 1) != 0) {
            akrq akrqVar2 = apunVar.n;
            if (akrqVar2 == null) {
                akrqVar2 = akrq.a;
            }
            z = akrqVar2.c;
        }
        boolean z3 = !p();
        if ((apunVar.b & 64) == 0) {
            if (iA >= size) {
                if (!(aduoVar.b ? aduoVar.a.a : aduoVar.a.b).g()) {
                    if (z3 && z) {
                        l(this.o);
                        return;
                    } else {
                        this.n.clear();
                        return;
                    }
                }
            }
            l(aduoVar);
        }
    }

    protected final void l(Object obj) {
        admu admuVar = this.n;
        if (admuVar.isEmpty()) {
            admuVar.add(obj);
        } else {
            admuVar.hM(0, obj);
        }
    }

    public final void m() {
        if (this.e) {
            this.m.b(Alert.DURATION_SHOW_INDEFINITELY);
            return;
        }
        int iMin = Math.min(this.q, this.u.size());
        int i = this.f;
        if (i > 1) {
            iMin = ((iMin + i) - 1) / i;
        }
        this.m.b(iMin);
    }

    public final void n(aeck aeckVar) {
        if (r()) {
            if (u()) {
                aeay aeayVar = new aeay(aeckVar.b(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, this.t.b);
                if (this.g.g()) {
                    aeayVar = new aeay(aeayVar.a, ((aecc) this.g.c()).k, ((aecc) this.g.c()).l, ((aecc) this.g.c()).i, ((aecc) this.g.c()).j, ((aecc) this.g.c()).g, ((aecc) this.g.c()).h, aeayVar.b);
                }
                this.t = aeayVar;
            } else if (this.g.g()) {
                this.t = new aeay(1, 0.0f, 0.0f, 0.0f, 0.0f, ((aecc) this.g.c()).g, ((aecc) this.g.c()).h, this.t.b);
            }
            taq.d();
        }
    }

    protected final void o() {
        if (this.p) {
            this.p = false;
            this.k.t();
        }
    }

    @Override // defpackage.advp
    public final String q() {
        apun apunVar = this.j;
        aqjn aqjnVar = apunVar.f;
        if (aqjnVar == null) {
            aqjnVar = aqjn.a;
        }
        if ((aqjnVar.b & 1) == 0) {
            return apunVar.e;
        }
        aqjn aqjnVar2 = apunVar.f;
        if (aqjnVar2 == null) {
            aqjnVar2 = aqjn.a;
        }
        return aqjnVar2.c;
    }

    protected void e() {
    }
}
