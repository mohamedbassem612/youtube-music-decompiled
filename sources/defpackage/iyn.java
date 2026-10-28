package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iyn extends adtv implements advc, iyx, adwk {
    public final adku a;
    public final admu b;
    public boolean c;
    public int d;
    private final Context e;
    private final tbt f;
    private final vxe g;
    private anwt h;
    private List i;
    private List j;
    private final adlq k;
    private final admu l;
    private final admu m;
    private final advn n;
    private final admu o;
    private final admu p;
    private final admu q;
    private boolean r;
    private int s;
    private Object t;
    private SparseArray u;
    private int v;

    public iyn(anwt anwtVar, adxd adxdVar, Context context, wnf wnfVar, tbt tbtVar, ttm ttmVar, vxe vxeVar, xgn xgnVar) {
        super(adxd.a(adxdVar), wnfVar, tbtVar, new Object(), ttmVar, xgnVar);
        this.u = new SparseArray();
        this.e = context;
        this.f = tbtVar;
        this.g = vxeVar;
        this.h = anwtVar;
        this.c = true;
        adlq adlqVar = new adlq(false);
        this.k = adlqVar;
        this.p = new admu();
        this.l = new admu();
        this.m = new admu();
        this.n = new advn();
        admu admuVar = new admu();
        this.o = admuVar;
        this.a = new adku(admuVar);
        this.b = new admu();
        this.q = new admu();
        adlqVar.e(new hde(7));
        tbtVar.f(this);
        v();
        if (!(adxdVar instanceof iym)) {
            D(anwtVar, false);
            return;
        }
        iym iymVar = (iym) adxdVar;
        this.h = iymVar.a;
        this.i = iymVar.b;
        this.u = iymVar.c;
        this.c = iymVar.d;
        this.s = iymVar.e;
        this.t = iymVar.f;
        this.j = iymVar.g;
        B(this.h);
        admuVar.addAll(this.i);
        E();
        C(this.i, this.h);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void A() {
        Object hefVar;
        anwt anwtVar = this.h;
        if ((anwtVar.c & SemanticState.ReadOnly) != 0 || anwtVar.x.size() > 0) {
            hefVar = new hef(this.h);
        } else {
            hefVar = null;
            if (q(this.h) != null && !this.c && this.r) {
                hee heeVar = new hee(q(this.h), null);
                heeVar.b = new ivp(this, 8);
                hefVar = heeVar;
            }
        }
        if (hefVar != null) {
            admu admuVar = this.b;
            if (admuVar.isEmpty()) {
                admuVar.add(hefVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    private final void B(anwt anwtVar) {
        alay alayVar = this.h.d;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        if (TextUtils.isEmpty(ackj.k(null, alayVar, null, false))) {
            alay alayVar2 = this.h.e;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
            if (TextUtils.isEmpty(ackj.k(null, alayVar2, null, false))) {
                alay alayVar3 = this.h.f;
                if (alayVar3 == null) {
                    alayVar3 = alay.a;
                }
                if (TextUtils.isEmpty(ackj.k(null, alayVar3, null, false))) {
                    anwt anwtVar2 = this.h;
                    if ((anwtVar2.c & 16) != 0 || anwtVar2.s.size() > 0) {
                        this.l.add(anwtVar);
                    }
                } else {
                    this.l.add(anwtVar);
                }
            } else {
                this.l.add(anwtVar);
            }
        } else {
            this.l.add(anwtVar);
        }
        ArrayList arrayList = new ArrayList();
        for (apji apjiVar : anwtVar.h) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(anwz.b);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anwz.b);
                apjiVar.c(aihlVarCheckIsLite2);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                arrayList.add(objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
        if (!arrayList.isEmpty()) {
            this.m.addAll(arrayList);
        }
        int iBc = a.bc(anwtVar.v);
        if (iBc == 0 || iBc != 4) {
            return;
        }
        this.p.add(new ixn(2, 2, false));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    private final void C(List list, anwt anwtVar) {
        boolean z;
        if (Collection.EL.stream(list).noneMatch(new iui(7))) {
            if ((anwtVar.c & 16384) == 0) {
                z = false;
            } else {
                anwl anwlVar = anwtVar.q;
                if (anwlVar == null) {
                    anwlVar = anwl.a;
                }
                anwj anwjVar = anwlVar.b;
                if (anwjVar == null) {
                    anwjVar = anwj.a;
                }
                if (anwjVar.c) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (list.isEmpty() && z) {
                this.q.add(new ixn(1, 2, true));
            } else {
                if (list.isEmpty()) {
                    return;
                }
                this.q.add(z ? new ixn(4, 2, true) : new ixn(4, 2, false));
            }
        }
    }

    private final void D(anwt anwtVar, boolean z) {
        h(z);
        this.c = false;
        this.h = anwtVar;
        this.i = u(anwtVar);
        B(this.h);
        this.o.addAll(this.i);
        G(this.h, false);
        C(this.i, anwtVar);
        List listR = r(anwtVar);
        this.j = listR;
        aI(listR);
        for (anwu anwuVar : anwtVar.l) {
            if ((anwuVar.b & 2) != 0) {
                apho aphoVar = anwuVar.d;
                if (aphoVar == null) {
                    aphoVar = apho.a;
                }
                int iBc = a.bc(aphoVar.f);
                if (iBc == 0) {
                    iBc = 1;
                }
                this.v = iBc;
            }
        }
        y();
        if (this.h.w && this.i.isEmpty()) {
            aE();
        }
    }

    private final void E() {
        kbp kbpVar = (kbp) this.u.get(this.e.getResources().getConfiguration().orientation != 2 ? 1 : 2);
        int i = kbpVar.a;
        this.d = kbpVar.b;
        this.r = q(this.h) != null && !this.c && i > 0 && this.d > i && this.h.j.size() >= i;
        adku adkuVar = this.a;
        if (this.c || i <= 0) {
            i = this.d;
        }
        adkuVar.b(i);
        A();
    }

    private final void F() {
        ArrayList arrayList = new ArrayList();
        admu admuVar = this.l;
        admuVar.hH(arrayList);
        admuVar.l(arrayList);
    }

    private final void G(anwt anwtVar, boolean z) {
        int i;
        int i2;
        int[] iArr = {2, 1};
        for (int i3 = 0; i3 < 2; i3++) {
            int i4 = iArr[i3];
            int iAS = a.aS(i4);
            if (iAS == 0) {
                throw null;
            }
            anws anwsVarV = rpi.V(anwtVar, iAS);
            kbp kbpVar = new kbp(null);
            kbp kbpVar2 = (kbp) this.u.get(i4, new kbp(null));
            int i5 = Alert.DURATION_SHOW_INDEFINITELY;
            if (anwsVarV != null) {
                i = anwsVarV.c;
                kbpVar.a = i;
                i2 = anwsVarV.d;
                kbpVar.b = i2;
            } else {
                i = anwtVar.n;
                kbpVar.a = i;
                kbpVar.b = Alert.DURATION_SHOW_INDEFINITELY;
                i2 = Integer.MAX_VALUE;
            }
            if (z) {
                kbpVar2.a += i;
                if (i2 != Integer.MAX_VALUE) {
                    i5 = kbpVar2.b + i2;
                }
                kbpVar2.b = i5;
                kbpVar = kbpVar2;
            }
            this.u.put(i4, kbpVar);
        }
        E();
    }

    private static akwo q(anwt anwtVar) {
        anwp anwpVar = anwtVar.o;
        if (anwpVar == null) {
            anwpVar = anwp.a;
        }
        if ((anwpVar.b & 1) == 0) {
            return null;
        }
        anwp anwpVar2 = anwtVar.o;
        if (anwpVar2 == null) {
            anwpVar2 = anwp.a;
        }
        akwo akwoVar = anwpVar2.c;
        return akwoVar == null ? akwo.a : akwoVar;
    }

    private static List r(anwt anwtVar) {
        ArrayList arrayList = new ArrayList();
        for (anwu anwuVar : anwtVar.l) {
            if ((anwuVar.b & 1) != 0) {
                aobx aobxVar = anwuVar.c;
                if (aobxVar == null) {
                    aobxVar = aobx.a;
                }
                acjx acjxVarAe = aawb.ae(aobxVar);
                if (acjxVarAe != null) {
                    arrayList.add(acjxVarAe);
                }
            }
            if ((anwuVar.b & 2) != 0) {
                apho aphoVar = anwuVar.d;
                if (aphoVar == null) {
                    aphoVar = apho.a;
                }
                acjx acjxVarAe2 = aawb.ae(aphoVar);
                if (acjxVarAe2 != null) {
                    arrayList.add(acjxVarAe2);
                }
            }
        }
        return arrayList;
    }

    private static List u(anwt anwtVar) {
        ArrayList arrayList = new ArrayList();
        for (anwv anwvVar : anwtVar.j) {
            int i = anwvVar.b;
            if ((i & SemanticState.Obscured) != 0) {
                anqz anqzVar = anwvVar.c;
                if (anqzVar == null) {
                    anqzVar = anqz.a;
                }
                arrayList.add(anqzVar);
            } else if ((262144 & i) != 0) {
                anzi anziVar = anwvVar.d;
                if (anziVar == null) {
                    anziVar = anzi.a;
                }
                arrayList.add(anziVar);
            } else if ((1048576 & i) != 0) {
                angn angnVar = anwvVar.e;
                if (angnVar == null) {
                    angnVar = angn.a;
                }
                arrayList.add(angnVar);
            } else if ((2097152 & i) != 0) {
                ankz ankzVar = anwvVar.f;
                if (ankzVar == null) {
                    ankzVar = ankz.a;
                }
                arrayList.add(ankzVar);
            } else if ((16777216 & i) != 0) {
                anwj anwjVar = anwvVar.g;
                if (anwjVar == null) {
                    anwjVar = anwj.a;
                }
                arrayList.add(anwjVar);
            } else if ((134217728 & i) != 0) {
                alhu alhuVar = anwvVar.i;
                if (alhuVar == null) {
                    alhuVar = alhu.a;
                }
                arrayList.add(alhuVar);
            } else if ((i & 67108864) != 0) {
                apnx apnxVar = anwvVar.h;
                if (apnxVar == null) {
                    apnxVar = apnx.a;
                }
                arrayList.add(apnxVar);
            }
        }
        return arrayList;
    }

    private final void v() {
        adlq adlqVar = this.k;
        adlqVar.m(-1, this.p, true);
        adlqVar.m(-1, this.l, true);
        adlqVar.m(-1, this.m, true);
        adlqVar.m(-1, this.n, true);
        adlqVar.m(-1, this.a, true);
        adlqVar.m(-1, this.b, true);
        adlqVar.m(-1, this.q, true);
    }

    private final void w(Object obj) {
        if (obj != null) {
            admu admuVar = this.o;
            if (admuVar.contains(obj)) {
                this.s = this.i.indexOf(obj);
                this.t = obj;
                admuVar.remove(obj);
                this.i.remove(obj);
                if (admuVar.isEmpty()) {
                    anwt anwtVar = this.h;
                    if (anwtVar.w) {
                        aE();
                    } else if (anwtVar.t) {
                        aihf builder = anwtVar.toBuilder();
                        builder.copyOnWrite();
                        ((anwt) builder.instance).j = anwt.emptyProtobufList();
                        this.h = (anwt) builder.build();
                        F();
                    } else {
                        this.k.t();
                        this.f.c(new vvt("MUSIC_SHELF_REMOVED_TAG"));
                    }
                }
                y();
            }
        }
    }

    private final void y() {
        int size = this.o.size();
        for (anwd anwdVar : this.h.y) {
            if ((anwdVar.b & 1) != 0 && anwdVar.c == size) {
                this.g.b(anwdVar.d);
            }
        }
    }

    @Override // defpackage.advc
    public final adkz a() {
        return this.k;
    }

    @Override // defpackage.adtv
    protected final /* bridge */ /* synthetic */ Object c(apjh apjhVar) {
        if (apjhVar == null) {
            return null;
        }
        aihl aihlVar = anwt.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        apjhVar.c(aihlVarCheckIsLite);
        if (apjhVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            apjhVar.c(aihlVarCheckIsLite2);
            Object objK = apjhVar.j.k(aihlVarCheckIsLite2.d);
            return (anwt) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        }
        aihl aihlVar2 = apoq.b;
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar2);
        apjhVar.c(aihlVarCheckIsLite3);
        if (!apjhVar.j.n(aihlVarCheckIsLite3.d)) {
            return null;
        }
        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar2);
        apjhVar.c(aihlVarCheckIsLite4);
        Object objK2 = apjhVar.j.k(aihlVarCheckIsLite4.d);
        aiie aiieVar = ((apoq) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2))).f;
        if (aiieVar.isEmpty() || (((apox) aiieVar.get(0)).c & 536870912) == 0) {
            return null;
        }
        anwt anwtVar = ((apox) aiieVar.get(0)).aq;
        return anwtVar == null ? anwt.a : anwtVar;
    }

    @Override // defpackage.iyx
    public final void e(int i, int i2) {
        if (i != i2) {
            adlq adlqVar = this.k;
            adku adkuVar = this.a;
            int iL = adlqVar.l(adkuVar);
            int iA = adkuVar.a() + iL;
            if (iL > i || i >= iA || iL > i2 || i2 >= iA) {
                return;
            }
            int i3 = i - iL;
            int i4 = i2 - iL;
            this.o.j(i3, i4);
            this.i.add(i4, this.i.remove(i3));
        }
    }

    public final void h(boolean z) {
        if (!z) {
            this.p.clear();
            this.l.clear();
            this.m.clear();
        }
        this.o.clear();
        this.b.clear();
        this.q.clear();
    }

    @tcc
    public void handleDeletePlaylistEvent(gsd gsdVar) {
        w(((Optional) gsdVar.e).orElse(null));
    }

    @tcc
    public void handleHideEnclosingEvent(vvt vvtVar) {
        Object obj = vvtVar.a;
        if (obj == "MUSIC_SHELF_REMOVED_TAG") {
            this.k.w();
        } else if (obj == this.h) {
            this.k.t();
        } else {
            w(obj);
        }
    }

    @tcc
    void handleLoadingEvent(adts adtsVar) {
        if (this.v == 2 || !adtsVar.a()) {
            return;
        }
        agev agevVar = adtsVar.b;
        if (agevVar.g() && this.j.contains(agevVar.c())) {
            agrf agrfVar = tbt.a;
            this.n.b(new advl(adtsVar, new Object(), null, null));
        }
    }

    @tcc
    public void handleMusicReloadShelfEvent(hcm hcmVar) {
        if (hcmVar.a == this.h) {
            aE();
        }
    }

    @tcc
    public void handleServiceResponseRemoveEvent(wpx wpxVar) {
        throw null;
    }

    @tcc
    public void handleShowEnclosingEvent(gsj gsjVar) {
        Object obj = gsjVar.e;
        if (this.h == ((Optional) obj).orElse(null)) {
            v();
            return;
        }
        int i = this.s;
        if (i < 0 || this.t != obj) {
            return;
        }
        int iMin = Math.min(i, this.i.size());
        this.s = iMin;
        this.i.add(iMin, obj);
        this.o.add(this.s, obj);
        if (this.k.isEmpty()) {
            if (this.h.t) {
                F();
            } else {
                v();
            }
        }
    }

    @tcc
    public void handleSideloadedTrackDeleteEvent(iso isoVar) {
        w(((Optional) isoVar.e).orElse(null));
    }

    @Override // defpackage.adtv, defpackage.advw
    public final adxd hq() {
        return new iym(super.hq(), this.h, this.i, this.u, this.c, this.s, this.t, this.j);
    }

    @Override // defpackage.adtv
    protected final /* bridge */ /* synthetic */ void hs(Object obj, acjx acjxVar) {
        anwt anwtVar = (anwt) obj;
        super.hs(anwtVar, acjxVar);
        acjw acjwVarA = acjxVar.a();
        acjw acjwVar = acjw.d;
        if (acjwVarA == acjwVar && this.v != 2) {
            this.n.b(null);
        }
        if (anwtVar != null) {
            if (acjxVar.a() == acjwVar) {
                D(anwtVar, true);
            } else {
                List listR = r(anwtVar);
                this.j = listR;
                aI(listR);
                List listU = u(anwtVar);
                this.i.addAll(listU);
                this.o.addAll(listU);
                A();
                y();
            }
            G(anwtVar, acjxVar.a() == acjw.b);
        }
    }

    @Override // defpackage.adtv
    protected final void ht(toe toeVar, acjx acjxVar) {
        super.ht(toeVar, acjxVar);
        if (acjxVar.a() != acjw.d || this.v == 2) {
            return;
        }
        this.n.b(null);
    }

    @Override // defpackage.adtv, defpackage.twn
    public final void i() {
        this.f.l(this);
    }

    @Override // defpackage.iyx
    public final void j(Object obj, int i) {
        int i2;
        if (i != 0) {
            adku adkuVar = this.a;
            if (adkuVar.contains(obj)) {
                for (int i3 = 0; i3 < adkuVar.a(); i3++) {
                    if (adkuVar.d(i3) == obj && (i2 = i3 + i) >= 0 && i2 < adkuVar.a()) {
                        this.o.j(i3, i2);
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.advc
    public final void k(Configuration configuration) {
        E();
    }

    @Override // defpackage.adwk
    public final void l(Object obj) {
        w(obj);
    }
}
