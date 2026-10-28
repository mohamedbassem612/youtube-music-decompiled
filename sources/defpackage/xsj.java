package defpackage;

import android.text.TextUtils;
import com.google.android.apps.youtube.music.R;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xsj {
    public static final xtj a = new xtj();
    public static final xtk b = new xtk();
    public static final xtb c = new xtb(false);
    public static final xtb d = new xtb(true);
    public static final xtf e = new xtf();
    public static final xsz f = new xsz(R.string.select_a_device_title, true, false);
    public static final xsz g = new xsz(R.string.other_devices_title, true, true);
    public static final xsz h = new xsz(R.string.all_devices_title, true, true);
    public static final xsz i = new xsz(R.string.select_different_device_title, true, true);
    public static final xsz j = new xsz(R.string.play_on_different_device_title, true, true);
    public xgx A;
    public xgx B;
    public xgx C;
    public xgx D;
    public xgx E;
    public xgx F;
    public xgx G;
    protected xgx I;
    public xgx J;
    public xgx K;
    protected xgx L;
    public final ycp M;
    public final vxz N;
    private final xqw O;
    private final xrx P;
    private final xpn Q;
    private final xvq R;
    private xtr S;
    private xso T;
    private final boolean U;
    private final boolean V;
    private final boolean W;
    private final boolean X;
    private final boolean Y;
    private final boolean Z;
    public final xsz k;
    public final dij l;
    public final ydu m;
    public final awku n;
    final awmd o;
    public xvq q;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final String w;
    public xgn x;
    protected xgx z;
    public List p = new ArrayList();
    public xvq r = null;
    public boolean v = false;
    private final AtomicBoolean aa = new AtomicBoolean(false);
    public final HashMap y = new HashMap();
    protected boolean H = false;

    public xsj(dij dijVar, ydu yduVar, xqw xqwVar, vxz vxzVar, xrx xrxVar, xmr xmrVar, ycp ycpVar, awmd awmdVar, xpn xpnVar) {
        this.l = dijVar;
        this.m = yduVar;
        this.O = xqwVar;
        this.N = vxzVar;
        this.P = xrxVar;
        this.w = xmrVar.a;
        this.M = ycpVar;
        this.Q = xpnVar;
        this.U = vxzVar.l(43, 45383917L, false);
        this.s = vxzVar.l(70, 45414745L, false);
        this.V = vxzVar.l(52, 45391189L, false);
        this.W = vxzVar.l(73, 45416615L, false);
        this.t = vxzVar.l(74, 45416616L, false);
        this.X = vxzVar.l(53, 45391510L, false);
        boolean zL = vxzVar.l(83, 45419288L, false);
        this.Y = zL;
        this.u = vxzVar.l(164, 45673420L, false);
        this.Z = vxzVar.l(198, 45738303L, false);
        this.k = new xsz(R.string.suggested_devices_title, false, zL);
        this.n = new awku();
        this.o = awmdVar;
        this.q = zik.bW();
        this.R = zik.bV();
    }

    private final boolean z() {
        if (!this.s) {
            return s();
        }
        xtf xtfVar = e;
        return (TextUtils.isEmpty(xtfVar.d) || TextUtils.isEmpty(xtfVar.e) || xtfVar.g == null || xtfVar.f == null) ? false : true;
    }

    public final int a() {
        if (s()) {
            return 1;
        }
        return t() ? 0 : 2;
    }

    protected final xgx b(xgx xgxVar, xhc xhcVar) {
        xgt xgtVarA;
        xgn xgnVar = this.x;
        if (xgxVar != null || xgnVar == null || (xgtVarA = xgnVar.a()) == null) {
            return null;
        }
        xgx xgxVar2 = new xgx(xgtVarA, xhcVar);
        xgx xgxVar3 = this.I;
        if (xgxVar3 == null) {
            xgnVar.d(xgxVar2);
        } else {
            xgnVar.e(xgxVar2, xgxVar3);
        }
        xgnVar.w(xgxVar2, null);
        return xgxVar2;
    }

    protected final xgx c(xgx xgxVar, xhc xhcVar) {
        xgt xgtVarA;
        xgn xgnVar = this.x;
        if (xgxVar != null || xgnVar == null || (xgtVarA = xgnVar.a()) == null) {
            return null;
        }
        xgx xgxVar2 = new xgx(xgtVarA, xhcVar);
        xgx xgxVar3 = this.z;
        if (xgxVar3 == null) {
            xgnVar.d(xgxVar2);
        } else {
            xgnVar.e(xgxVar2, xgxVar3);
        }
        xgnVar.w(xgxVar2, null);
        return xgxVar2;
    }

    public final List d(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof xvq) {
                xvq xvqVar = (xvq) obj;
                if (xvqVar.b && !xvqVar.l()) {
                    arrayList.add(xvqVar);
                }
            }
        }
        return arrayList;
    }

    public final List e(List list) {
        int iCount;
        xsz xszVar;
        List arrayList = new ArrayList();
        boolean z = this.U;
        if (!z || this.u) {
            iCount = (int) Collection.EL.stream(list).filter(new xdo(this, 6)).count();
        } else {
            arrayList = (List) Collection.EL.stream(list).filter(new hkn(this, 12)).sorted(new xsi(this.m, 0)).collect(Collectors.toCollection(new idl(7)));
            iCount = arrayList.size();
        }
        if (v() && !this.q.l()) {
            arrayList.add(0, this.R);
        }
        Stream streamLimit = Collection.EL.stream(arrayList).limit(3L);
        Collector collector = aghu.a;
        agke agkeVar = (agke) streamLimit.collect(collector);
        agke agkeVar2 = (agke) Collection.EL.stream(list).filter(new hkn(agkeVar, 13)).filter(new hkn(this, 14)).sorted(new xsi(this.m, 0)).collect(collector);
        int size = agkeVar.size() + agkeVar2.size();
        ArrayList arrayList2 = new ArrayList();
        this.H = size >= 4 && iCount > 0 && !z;
        int size2 = agkeVar.size();
        if (!z || size < 4 || size2 <= 0) {
            if (!v()) {
                xszVar = f;
            } else if (s()) {
                xszVar = this.N.l(155, 45653927L, false) ? j : i;
            } else {
                xszVar = h;
            }
            arrayList2.add(xszVar);
            arrayList2.addAll(agkeVar);
        } else {
            arrayList2.add(this.k);
            arrayList2.addAll(agkeVar);
            arrayList2.add(g);
        }
        arrayList2.addAll(agkeVar2);
        if (q() && a() != 1) {
            arrayList2.add(b);
        }
        if (!this.Q.a()) {
            arrayList2.add(xss.a);
        }
        if (!this.X || !s() ? !(!arrayList.isEmpty() || !agkeVar2.isEmpty()) : !(arrayList.size() != 1 || !agkeVar2.isEmpty())) {
            arrayList2.add(a);
        }
        return arrayList2;
    }

    protected final void f(xvq xvqVar, List list) {
        if (!list.isEmpty()) {
            xqw xqwVar = this.O;
            dii diiVar = xvqVar.a;
            int i2 = 6;
            Stream map = Collection.EL.stream(list).map(new xjh(i2));
            Collector collector = aghu.a;
            if (xqwVar.m(diiVar, xqw.s((agke) map.collect(collector)), xqwVar.f((agke) Collection.EL.stream(list).map(new xjh(i2)).collect(collector)), xqwVar.i.l(255, 45837246L, false) ? xqwVar.a(list) : agpr.a, xqwVar.e(), true, true)) {
                return;
            }
        }
        if (u(xvqVar) || t() || p(xvqVar)) {
            return;
        }
        List list2 = this.p;
        xtj xtjVar = a;
        if (list2.contains(xtjVar)) {
            this.p.remove(xtjVar);
            this.p.add(true == v() ? 4 : 1, xvqVar);
        } else if (!q() || this.p.size() <= 0) {
            this.p.add(xvqVar);
        } else {
            List list3 = this.p;
            list3.add(list3.size() - 1, xvqVar);
        }
        k(this.p);
    }

    protected final void g(xvq xvqVar, List list) {
        Object objOrElse = Collection.EL.stream(this.p).filter(new xdo(xvqVar.c(), 5)).findFirst().orElse(null);
        xvq xvqVar2 = objOrElse instanceof xvq ? (xvq) objOrElse : null;
        if (xvqVar2 != null) {
            if (!xvqVar.equals(xvqVar2) || xrx.j(xvqVar.a)) {
                u(xvqVar);
                return;
            }
            return;
        }
        vxz vxzVar = this.N;
        if (vxzVar.l(164, 45673420L, false)) {
            dii diiVar = xvqVar.a;
            if (xrx.j(diiVar)) {
                if (this.O.j(diiVar)) {
                    k(this.p);
                    return;
                } else if (u(xvqVar)) {
                    return;
                }
            }
        }
        if (vxzVar.l(164, 45673420L, false) && vxzVar.l(255, 45837246L, false) && !xrx.j(xvqVar.a) && u(xvqVar)) {
            return;
        }
        f(xvqVar, list);
    }

    public final void h() {
        xgx xgxVar;
        xgn xgnVar = this.x;
        if (xgnVar == null || xgnVar.a() == null || (xgxVar = this.I) == null) {
            return;
        }
        xgnVar.p(xgxVar, null);
    }

    protected final void i(xvq xvqVar) {
        this.q = xvqVar;
        if (this.u) {
            ((xql) this.o.io()).e = xvqVar;
        }
    }

    protected final void j(xvq xvqVar) {
        this.r = xvqVar;
        if (this.u) {
            ((xql) this.o.io()).f = xvqVar;
        }
    }

    protected final void k(List list) {
        this.p = list;
        this.n.kk(list);
        boolean z = this.u;
        if (z) {
            List listD = d(list);
            if (z) {
                xvq xvqVar = this.R;
                if (!listD.contains(xvqVar)) {
                    listD.add(0, xvqVar);
                }
                xql xqlVar = (xql) this.o.io();
                if (!xqlVar.e.k()) {
                    listD = xqlVar.j(listD);
                    listD.add(0, xqlVar.e);
                }
                xqlVar.d = listD;
                xqlVar.i.kk(listD);
            }
        }
    }

    protected final void l(boolean z) {
        this.aa.set(z);
    }

    protected final void m(List list) {
        this.k.c = v();
        if (t()) {
            ArrayList arrayList = new ArrayList();
            xso xsoVar = new xso(false, this.s);
            xsoVar.c = 1;
            arrayList.add(xsoVar);
            xvq xvqVar = this.r;
            if (xvqVar != null) {
                arrayList.add(xvqVar);
            }
            arrayList.add(d);
            k(arrayList);
            return;
        }
        if (v()) {
            ArrayList arrayList2 = new ArrayList();
            boolean z = z();
            boolean z2 = this.s;
            xso xsoVar2 = new xso(z, z2);
            this.T = xsoVar2;
            arrayList2.add(xsoVar2);
            if (z2) {
                arrayList2.add(new xtf(e));
            }
            if (s()) {
                xtr xtrVar = new xtr(this.q);
                this.S = xtrVar;
                arrayList2.add(xtrVar);
            } else {
                arrayList2.add(this.q);
            }
            arrayList2.addAll(e(list));
            k(arrayList2);
            return;
        }
        if (!s()) {
            k(e(list));
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        boolean z3 = z();
        boolean z4 = this.s;
        xso xsoVar3 = new xso(z3, z4);
        xtr xtrVar2 = new xtr(this.q);
        this.T = xsoVar3;
        this.S = xtrVar2;
        arrayList3.add(xsoVar3);
        if (z4) {
            arrayList3.add(new xtf(e));
        }
        arrayList3.add(xtrVar2);
        arrayList3.add(c);
        k(arrayList3);
    }

    public final boolean n() {
        if (v()) {
            if (this.v && this.V) {
                return true;
            }
        } else if (!s() && this.v && this.V) {
            return true;
        }
        return false;
    }

    protected final boolean o() {
        return this.w.equals("cl");
    }

    public final boolean p(xvq xvqVar) {
        return this.Z ? this.O.j(xvqVar.a) : xvqVar.c().equals(this.q.c());
    }

    protected final boolean q() {
        return this.W || o();
    }

    protected final boolean r() {
        return this.aa.get();
    }

    public final boolean s() {
        return (t() || this.q.l()) ? false : true;
    }

    public final boolean t() {
        xvq xvqVar = this.r;
        return (xvqVar == null || xvqVar.l()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0088  */
    protected final boolean u(xvq xvqVar) {
        Optional optionalC;
        if (Collection.EL.stream(this.p).anyMatch(new xdo(xvqVar, 4))) {
            ListIterator listIterator = this.p.listIterator();
            while (listIterator.hasNext()) {
                Object next = listIterator.next();
                if ((next instanceof xvq) && ((xvq) next).c().equals(xvqVar.c())) {
                    listIterator.set(xvqVar);
                    k(this.p);
                    return true;
                }
            }
        } else {
            dii diiVar = xvqVar.a;
            if (xrx.j(diiVar)) {
                Optional optionalC2 = this.O.c(xvqVar, d(this.p), false);
                if (!optionalC2.isPresent() || (this.N.l(255, 45837246L, false) && !((xvq) optionalC2.get()).m())) {
                    if (this.N.l(255, 45837246L, false) && !xrx.j(diiVar) && !xvqVar.m()) {
                        optionalC = this.O.c(xvqVar, d(this.p), true);
                        if (optionalC.isPresent() && zik.bT(this.p, (xvq) optionalC.get(), xvqVar)) {
                            k(this.p);
                            return true;
                        }
                    }
                } else if (zik.bT(this.p, (xvq) optionalC2.get(), xvqVar)) {
                    k(this.p);
                    return true;
                }
            } else if (this.N.l(255, 45837246L, false)) {
                optionalC = this.O.c(xvqVar, d(this.p), true);
                if (optionalC.isPresent()) {
                    k(this.p);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean v() {
        return s() ? this.X : this.Y;
    }

    public final int w(xvq xvqVar) {
        if (xvqVar.k() && xvqVar.h()) {
            return 5;
        }
        return this.P.l(xvqVar.a);
    }

    public final void x(int i2, int i3) {
        xgx xgxVar;
        xgn xgnVar = this.x;
        if (xgnVar == null || xgnVar.a() == null || (xgxVar = this.z) == null) {
            return;
        }
        aihf aihfVarCreateBuilder = amdd.a.createBuilder();
        aihf aihfVarCreateBuilder2 = amdg.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        amdg amdgVar = (amdg) aihfVarCreateBuilder2.instance;
        amdgVar.e = i2 - 1;
        amdgVar.b |= 8;
        int iBU = zik.bU(i3);
        aihfVarCreateBuilder2.copyOnWrite();
        amdg amdgVar2 = (amdg) aihfVarCreateBuilder2.instance;
        amdgVar2.d = iBU - 1;
        amdgVar2.b |= 4;
        amdg amdgVar3 = (amdg) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
        amdgVar3.getClass();
        amddVar.f = amdgVar3;
        amddVar.b |= 4;
        xgnVar.p(xgxVar, (amdd) aihfVarCreateBuilder.build());
    }

    public final void y(xgx xgxVar) {
        xgn xgnVar = this.x;
        if (xgnVar == null || xgxVar == null) {
            return;
        }
        xgnVar.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, xgxVar, null);
    }
}
