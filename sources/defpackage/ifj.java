package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ifj implements abvc, abtv {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/player/sequence/QueuePlaybackLoaderNavigator");
    public final ifa b;
    public final ift c;
    public final awmd d;
    public final ifn e;
    public final xit f;
    public final ilx g;
    public final awut h;
    public final vxz i;
    private final hzx j;
    private final awmd k;
    private final awmd l;
    private final Context m;
    private final avmb n;
    private final abvk o;
    private final adet p;
    private final heg q;
    private final jnm r;

    public ifj(ifa ifaVar, abvn abvnVar, ift iftVar, adet adetVar, awmd awmdVar, hzx hzxVar, ifn ifnVar, heg hegVar, xit xitVar, ilx ilxVar, jnm jnmVar, awmd awmdVar2, awmd awmdVar3, vxz vxzVar, Context context, avmb avmbVar, awut awutVar) {
        ifaVar.getClass();
        abvnVar.getClass();
        iftVar.getClass();
        adetVar.getClass();
        awmdVar.getClass();
        hzxVar.getClass();
        ifnVar.getClass();
        hegVar.getClass();
        xitVar.getClass();
        ilxVar.getClass();
        jnmVar.getClass();
        awmdVar3.getClass();
        vxzVar.getClass();
        context.getClass();
        avmbVar.getClass();
        awutVar.getClass();
        this.b = ifaVar;
        this.c = iftVar;
        this.p = adetVar;
        this.d = awmdVar;
        this.j = hzxVar;
        this.e = ifnVar;
        this.q = hegVar;
        this.f = xitVar;
        this.g = ilxVar;
        this.r = jnmVar;
        this.k = awmdVar2;
        this.l = awmdVar3;
        this.i = vxzVar;
        this.m = context;
        this.n = avmbVar;
        this.h = awutVar;
        this.o = abvnVar.o();
        ifaVar.a.add(this);
        abvnVar.J().L(avmbVar).al(new icy(new dmf((Object) this, 2, (char[]) null), 5), new icy(ifi.a, 6));
    }

    private final void t(abun abunVar) {
        ifn ifnVar = this.e;
        List listH = atqq.H(abunVar);
        abuk abukVarB = ifnVar.b();
        zj zjVarT = abuc.t();
        zjVarT.h(0);
        m(listH, abukVarB, zjVarT.f());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, awoq awoqVar) {
        ifc ifcVar;
        if (awoqVar instanceof ifc) {
            ifcVar = (ifc) awoqVar;
            int i2 = ifcVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ifcVar.d = i2 - Integer.MIN_VALUE;
            } else {
                ifcVar = new ifc(this, awoqVar);
            }
        } else {
            ifcVar = new ifc(this, awoqVar);
        }
        Object objC = ifcVar.b;
        awox awoxVar = awox.a;
        int i3 = ifcVar.d;
        if (i3 == 0) {
            atqp.j(objC);
            if (i >= 0) {
                ifn ifnVar = this.e;
                if (i < ifnVar.e().size()) {
                    ifcVar.a = i;
                    ifcVar.d = 1;
                    objC = ifnVar.c(false, null, ifcVar);
                    if (objC == awoxVar) {
                        return awoxVar;
                    }
                }
                return Boolean.valueOf(z);
            }
            return Boolean.valueOf(z);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = ifcVar.a;
        atqp.j(objC);
        boolean z = i >= ((List) objC).size();
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(abnl abnlVar, abnp abnpVar, awoq awoqVar) throws Throwable {
        ifd ifdVar;
        abnl abnlVar2;
        abnp abnpVar2;
        Object obj;
        Object objE;
        if (awoqVar instanceof ifd) {
            ifdVar = (ifd) awoqVar;
            int i = ifdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ifdVar.c = i - Integer.MIN_VALUE;
            } else {
                ifdVar = new ifd(this, awoqVar);
            }
        } else {
            ifdVar = new ifd(this, awoqVar);
        }
        ifd ifdVar2 = ifdVar;
        Object obj2 = ifdVar2.a;
        Object obj3 = awox.a;
        int i2 = ifdVar2.c;
        boolean z = true;
        if (i2 != 0) {
            if (i2 == 1) {
                abnpVar2 = ifdVar2.e;
                abnl abnlVar3 = ifdVar2.d;
                atqp.j(obj2);
                abnlVar2 = abnlVar3;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(obj2);
            }
            this.b.b.a(abmg.a);
            return awmy.a;
        }
        atqp.j(obj2);
        abnlVar2 = abnlVar;
        ifdVar2.d = abnlVar2;
        abnpVar2 = abnpVar;
        ifdVar2.e = abnpVar2;
        ifdVar2.c = 1;
        if (d(ifdVar2) == obj3) {
            return obj3;
        }
        String strW = abnlVar2.w();
        if ((strW == null || strW.length() == 0) && !gzj.X(abnlVar2)) {
            xir xirVar = abnpVar2.b;
            if (xirVar != null) {
                xirVar.n("seedless_start");
            }
            ahgr ahgrVar = new ahgr();
            ahgrVar.e(abnp.a);
            if (abnlVar2 == null) {
                throw new NullPointerException("Null playbackStartDescriptor");
            }
            ahgrVar.a = abnlVar2;
            ahgrVar.e(abnpVar2);
            Object obj4 = ahgrVar.a;
            if (obj4 == null || (obj = ahgrVar.b) == null) {
                StringBuilder sb = new StringBuilder();
                if (ahgrVar.a == null) {
                    sb.append(" playbackStartDescriptor");
                }
                if (ahgrVar.b == null) {
                    sb.append(" playbackStartParameters");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            abvt abvtVar = new abvt((abnl) obj4, (abnp) obj);
            abnl abnlVar4 = abvtVar.a;
            ahno.F(abnlVar4.w().isEmpty() && !abnlVar4.u().isEmpty());
            t(abvtVar);
        } else {
            ifdVar2.d = null;
            ifdVar2.e = null;
            ifdVar2.c = 2;
            abut abutVarH = abuu.h();
            abutVarH.b(abnlVar2);
            abutVarH.c(abnpVar2);
            if (!this.r.C() && this.i.l(63, 45721841L, false)) {
                z = false;
            }
            abutVarH.e(z);
            abuu abuuVarA = abutVarH.a();
            awmd awmdVar = this.d;
            igd igdVar = new igd(abuuVarA, 0L, ((abjp) awmdVar.io()).f(), 10);
            abje abjeVarE = ((abjp) awmdVar.io()).e();
            abtu abtuVarF = abjeVarE.f(abnlVar2, abnpVar2);
            if (abtuVarF == null || !aajg.g(abjeVarE.n(abtuVarF))) {
                t(igdVar);
                objE = awmy.a;
            } else {
                int iA = abjeVarE.a(abtuVarF);
                objE = e(igd.h(igdVar, null, ((hyz) this.e.e().get(iA)).m(), ((abjp) awmdVar.io()).f(), null, 9), abnpVar2, abtuVarF.e, iA, ifdVar2);
                if (objE != obj3) {
                    objE = awmy.a;
                }
            }
            if (objE == obj3) {
                return obj3;
            }
        }
        this.b.b.a(abmg.a);
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(awoq awoqVar) throws Throwable {
        ife ifeVar;
        if (awoqVar instanceof ife) {
            ifeVar = (ife) awoqVar;
            int i = ifeVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ifeVar.c = i - Integer.MIN_VALUE;
            } else {
                ifeVar = new ife(this, awoqVar);
            }
        } else {
            ifeVar = new ife(this, awoqVar);
        }
        Object objAd = ifeVar.a;
        awox awoxVar = awox.a;
        int i2 = ifeVar.c;
        if (i2 == 0) {
            atqp.j(objAd);
            if (!this.i.l(102, 45785173L, false)) {
                return null;
            }
            ListenableFuture listenableFutureN = ((syn) this.k.io()).n(((zwb) this.l.io()).e());
            ifeVar.c = 1;
            objAd = awrc.ad(listenableFutureN, ifeVar);
            if (objAd == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objAd);
        }
        return ((ifb) aguu.aw(this.m, ifb.class, (affd) objAd)).i();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(awoq awoqVar) throws Throwable {
        ifg ifgVar;
        abjl abjlVarG;
        if (awoqVar instanceof ifg) {
            ifgVar = (ifg) awoqVar;
            int i = ifgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ifgVar.c = i - Integer.MIN_VALUE;
            } else {
                ifgVar = new ifg(this, awoqVar);
            }
        } else {
            ifgVar = new ifg(this, awoqVar);
        }
        Object objC = ifgVar.a;
        Object obj = awox.a;
        int i2 = ifgVar.c;
        if (i2 == 0) {
            atqp.j(objC);
            this.b.b.b();
            this.j.b();
            ifgVar.c = 1;
            objC = c(ifgVar);
            if (objC == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objC);
        }
        iqn iqnVar = (iqn) objC;
        this.e.a = iqnVar;
        awmd awmdVar = this.d;
        if (((abjp) awmdVar.io()).g() instanceof abiz) {
            abjl abjlVarG2 = ((abjp) awmdVar.io()).g();
            abjlVarG2.getClass();
            abjlVarG = ((abiz) abjlVarG2).k;
        } else {
            abjlVarG = ((abjp) awmdVar.io()).g();
        }
        ift iftVar = this.c;
        abjlVarG.getClass();
        abjl abjlVar = iftVar.k;
        if (abjlVar != abjlVarG) {
            if (abjlVar != null) {
                iqn iqnVar2 = iftVar.l;
                if (iqnVar2 != null) {
                    iqnVar2.f.remove(iftVar);
                }
                iftVar.i.b();
                iftVar.f();
                iftVar.c.unregisterOnSharedPreferenceChangeListener(iftVar);
            }
            iftVar.k = abjlVarG;
            abjl abjlVar2 = iftVar.k;
            if (abjlVar2 != null) {
                avmm avmmVar = iftVar.i;
                avlh avlhVar = iftVar.f;
                avmb avmbVar = iftVar.g;
                int i3 = 4;
                avmmVar.c(avlhVar.ay().V(avmbVar).p().al(new ifo(new hho((Object) iftVar, 4, (int[]) null), 0), new ifo(ifq.a, 2)));
                if (abjlVar2 instanceof icj) {
                    avmmVar.c(iftVar.e.M(new iam(10), new iam(11)).L(avmbVar).al(new ifo(new hol(iftVar, 8), 3), new ifo(ifr.a, i3)));
                }
                iftVar.d();
                iftVar.c.registerOnSharedPreferenceChangeListener(iftVar);
                if (iftVar.m.l(102, 45785173L, false)) {
                    iftVar.l = iqnVar;
                    if (iqnVar != null) {
                        iqnVar.f.add(iftVar);
                    }
                }
            }
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [xir] */
    public final Object e(igd igdVar, abnp abnpVar, abtt abttVar, int i, awoq awoqVar) throws Throwable {
        ifh ifhVar;
        xir xirVar;
        int iA;
        List listAL;
        Object obj;
        ?? r9;
        Object obj2;
        if (awoqVar instanceof ifh) {
            ifhVar = (ifh) awoqVar;
            int i2 = ifhVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ifhVar.f = i2 - Integer.MIN_VALUE;
            } else {
                ifhVar = new ifh(this, awoqVar);
            }
        } else {
            ifhVar = new ifh(this, awoqVar);
        }
        Object objC = ifhVar.d;
        awox awoxVar = awox.a;
        int i3 = ifhVar.f;
        if (i3 == 0) {
            atqp.j(objC);
            xirVar = abnpVar.b;
            if (xirVar != null) {
                xirVar.n("sgs");
            }
            if (abttVar == abtt.JUMP && xirVar != null) {
                aihf aihfVarCreateBuilder = amiu.a.createBuilder();
                aihfVarCreateBuilder.getClass();
                aihf aihfVarCreateBuilder2 = amiw.a.createBuilder();
                aihfVarCreateBuilder2.getClass();
                agvp.aa(amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_JUMP, aihfVarCreateBuilder2);
                agvp.ac(agvp.Z(aihfVarCreateBuilder2), aihfVarCreateBuilder);
                xirVar.h(agvp.ab(aihfVarCreateBuilder));
            }
            boolean zO = o();
            ifn ifnVar = this.e;
            List listE = ifnVar.e();
            iA = zO ? ifnVar.a(true) : i;
            if (!zO) {
                ifhVar.g = igdVar;
                ifhVar.a = xirVar;
                ifhVar.b = i;
                ifhVar.c = iA;
                ifhVar.f = 2;
                objC = ifnVar.c(false, null, ifhVar);
                if (objC == awoxVar) {
                    obj2 = xirVar;
                    return awoxVar;
                }
                obj2 = xirVar;
                listAL = (List) objC;
                r9 = obj2;
            } else if (i < 0 || i >= listE.size()) {
                listAL = atqq.aL(new igd[]{igdVar, igdVar});
                r9 = xirVar;
            } else {
                hyz hyzVar = (hyz) listE.get(i);
                ifhVar.g = igdVar;
                ifhVar.a = xirVar;
                ifhVar.b = i;
                ifhVar.c = iA;
                ifhVar.f = 1;
                objC = ifnVar.c(true, hyzVar, ifhVar);
                if (objC == awoxVar) {
                    return awoxVar;
                }
                obj = xirVar;
                listAL = (List) objC;
                r9 = obj;
            }
        } else if (i3 == 1) {
            int i4 = ifhVar.c;
            int i5 = ifhVar.b;
            Object obj3 = ifhVar.a;
            igd igdVar2 = ifhVar.g;
            atqp.j(objC);
            iA = i4;
            igdVar = igdVar2;
            i = i5;
            obj = obj3;
            listAL = (List) objC;
            r9 = obj;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = ifhVar.c;
            i = ifhVar.b;
            Object obj4 = ifhVar.a;
            igd igdVar3 = ifhVar.g;
            atqp.j(objC);
            iA = i6;
            igdVar = igdVar3;
            obj2 = obj4;
            obj2 = xirVar;
            listAL = (List) objC;
            r9 = obj2;
        }
        ifn ifnVar2 = this.e;
        List listF = ifn.f(iA, igdVar, listAL);
        if (r9 != 0) {
            r9.n("sge");
        }
        igdVar.a();
        new Integer(iA);
        new Integer(listF.size());
        abuk abukVarB = ifnVar2.b();
        zj zjVarT = abuc.t();
        zjVarT.h(iA);
        m(listF, abukVarB, zjVarT.f());
        j(i, igdVar);
        return awmy.a;
    }

    @Override // defpackage.abvc
    public final void f() {
        this.o.p();
    }

    @Override // defpackage.abvc, defpackage.acia
    public final void g(abnl abnlVar) {
        abnp abnpVar = abnp.a;
        abnpVar.getClass();
        h(abnlVar, abnpVar);
    }

    @Override // defpackage.abvc
    public final void h(abnl abnlVar, abnp abnpVar) {
        awro.t(this.h, null, 0, new gme(this, abnlVar, abnpVar, (awoq) null, 4), 3);
    }

    @Override // defpackage.abvc, defpackage.aavo, defpackage.acdl
    public final void i(abtu abtuVar) {
        awro.t(this.h, null, 0, new iff(this, abtuVar, null), 3);
    }

    public final void j(int i, abun abunVar) {
        ifn ifnVar = this.e;
        hyz hyzVar = (hyz) atqq.aa(ifnVar.e(), i);
        if (hyzVar != null) {
            if (abunVar instanceof abvz) {
                abnl abnlVarA = ((abvz) abunVar).a();
                if (abnlVarA == null) {
                    return;
                }
                if (!hyzVar.k().contains(abnlVarA.w())) {
                    ((agrc) a.b().k("com/google/android/apps/youtube/music/player/sequence/QueuePlaybackLoaderNavigator", "onNavigationCommitted", 490, "QueuePlaybackLoaderNavigator.kt")).E("Navigation committed to a video that is not expected by the queue: indexOfItemToNavigateTo=%d, currentItem=%s, usedItem=%s", Integer.valueOf(i), hyzVar.n(), abnlVarA);
                    int iA = ((abjp) this.d.io()).e().a(new abtu(abtt.JUMP, abnlVarA, null, null));
                    if (iA >= 0 && iA < ifnVar.e().size()) {
                        hyzVar = (hyz) ifnVar.e().get(iA);
                    }
                }
            }
            awmd awmdVar = this.d;
            Object objM = ((abjp) awmdVar.io()).m();
            ((abjp) awmdVar.io()).e().M(hyzVar);
            ((abjp) awmdVar.io()).w(objM);
            k();
        }
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [axsp, java.lang.Object] */
    @Override // defpackage.abtv
    public final void k() {
        this.p.d.kk(new aayv(n(abtu.b), n(abtu.a), ((Integer) ibv.f.getOrDefault(Integer.valueOf(((ibv) this.q.a).g), 0)).intValue(), false));
    }

    public final void m(List list, abuk abukVar, abuc abucVar) {
        this.b.a(list, abukVar, abucVar, false, false);
    }

    @Override // defpackage.abvc, defpackage.acdl
    public final boolean n(abtu abtuVar) {
        return ((abjp) this.d.io()).e().n(abtuVar) == 2;
    }

    public final boolean o() {
        return !this.i.l(13, 45627362L, false) && this.q.a == ibv.LOOP_ONE;
    }

    @Override // defpackage.aavo
    public final boolean p() {
        return this.o.ad();
    }

    @Override // defpackage.abvc, defpackage.aavo
    public final int q(abtu abtuVar) {
        return ((abjp) this.d.io()).e().n(abtuVar);
    }

    @Override // defpackage.acdl
    public final void r() {
        this.b.b.a(abmg.f);
        this.o.as();
    }

    @Override // defpackage.abvc
    public final /* synthetic */ void s() {
    }

    @Override // defpackage.abvc
    public final void l(abns abnsVar, abnp abnpVar) {
    }
}
