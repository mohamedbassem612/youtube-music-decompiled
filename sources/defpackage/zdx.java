package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.youtube.media.interfaces.RestartPrefetchEvaluationSource;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zdx implements zew {
    private static final zdr z = new zdq(ywj.c);
    private boolean B;
    private zsf C;
    private boolean D;
    private final zeb E;
    public final aunn d;
    public final zjr e;
    public final ahey f;
    public final xeu g;
    public final mbc h;
    public ywk l;
    public boolean o;
    boolean r;
    public aaok x;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    private volatile zew A = new zey();
    final List i = new ArrayList();
    public final List j = new ArrayList();
    final Map k = new HashMap();
    public zdr m = z;
    ywn n = ywn.b;
    public Runnable p = new gkz(8);
    public Runnable q = new gkz(9);
    final dov y = new dov((char[]) null, (char[]) null);
    float s = 1.0f;
    public Runnable t = new gkz(10);
    public final zdt w = new zdt(this);
    public final zdu u = new zdu(this);
    public final zdn v = new zdn();

    public zdx(zeb zebVar, aunn aunnVar, zjr zjrVar, ahey aheyVar, xeu xeuVar, mbc mbcVar) {
        this.E = zebVar;
        this.d = aunnVar;
        this.e = zjrVar;
        this.f = aheyVar;
        this.g = xeuVar;
        this.h = mbcVar;
    }

    private final void ar(zew zewVar, String str, long j) {
        zdm zdmVar;
        double dSin;
        float fM = 1.0f;
        if (str != null && (zdmVar = (zdm) ((ConcurrentHashMap) this.y.a).get(str)) != null) {
            float fM2 = awro.m(zdmVar.a(j));
            if (zdmVar.c - 1 != 0) {
                if (zdmVar.d - 1 != 0) {
                    dSin = Math.cos(fM2 * 1.5707964f);
                    fM2 = (float) dSin;
                } else {
                    fM2 = 1.0f - fM2;
                }
            } else if (zdmVar.d - 1 != 0) {
                dSin = Math.sin(fM2 * 1.5707964f);
                fM2 = (float) dSin;
            }
            fM = awro.m(fM2);
        }
        zewVar.O(this.s * fM);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, zcg, zew] */
    private final boolean as(zev zevVar) {
        zcj zcjVarT;
        Set set;
        zeb zebVar = this.E;
        zdt zdtVar = this.w;
        List list = this.i;
        ?? A = zebVar.a(zdtVar);
        list.add(A);
        zcf zcfVarAF = A.aF(zevVar.b);
        if (zcfVarAF != null && (zcjVarT = t(A)) != null) {
            zdn zdnVar = this.v;
            if (!awrc.c(zcjVarT, zcj.W)) {
                synchronized (zdnVar.a) {
                    zcj zcjVar = (zcj) zdnVar.b.put(zcfVarAF, zcjVarT);
                    if (zcjVar != null && !awrc.c(zcjVar, zcjVarT) && (set = (Set) zdnVar.c.get(zcjVar)) != null) {
                        set.remove(zcfVarAF);
                    }
                    zdnVar.c(zcjVarT);
                    Set set2 = (Set) zdnVar.c.get(zcjVarT);
                    if (set2 != null) {
                        set2.add(zcfVarAF);
                    }
                }
            }
            zcfVarAF.m(zevVar.b.e.a, appa.SEEK_SOURCE_UNKNOWN);
            cno cnoVarB = this.w.b(zevVar.a, zcfVarAF, false, this.a, null);
            if (cnoVarB != null) {
                this.k.put(zevVar, new xsc((zew) A, zcfVarAF, cnoVarB));
                return true;
            }
        }
        af(A);
        return false;
    }

    private static long at(ywk ywkVar) {
        long j = ywkVar.g;
        return j == -1 ? ywkVar.d.h : j;
    }

    private final boolean au(zev zevVar, ywk ywkVar) {
        if (this.e.bD()) {
            ywk ywkVar2 = zevVar.b;
            if (ywkVar != null && T(ywkVar.d, ywkVar.i)) {
                zgp zgpVar = ywkVar2.w;
                if (zgpVar instanceof zgp) {
                    Duration duration = zgpVar.a;
                    if (!duration.isZero() && !duration.isNegative()) {
                        return T(ywkVar2.d, ywkVar2.i);
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, zew] */
    /* JADX WARN: Type inference failed for: r1v4, types: [cno, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, zew] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, zcg, zew] */
    private final void av(zev zevVar, xsc xscVar) {
        boolean z2;
        int i;
        if (zevVar != null) {
            long jQ = q(zevVar);
            if (jQ != -1) {
                long jD = this.A.d();
                if (jD != -1 && jD >= Math.max(0L, jQ - 250)) {
                    ywk ywkVar = zevVar.b;
                    yvw yvwVar = ywkVar.e;
                    if ((yvwVar != null ? yvwVar.a : 0L) == 0) {
                        zgp zgpVar = ywkVar.w;
                        if (zgpVar instanceof zgp) {
                            Duration duration = zgpVar.a;
                            if (!duration.isZero() && !duration.isNegative()) {
                                zdt zdtVar = this.w;
                                zcf zcfVar = (zcf) xscVar.c;
                                if (zdtVar.u(zcfVar, duration)) {
                                    if (ywkVar.e != null) {
                                        zgp zgpVar2 = ywkVar.w;
                                        if (zgpVar2 instanceof zgp) {
                                            Duration duration2 = zgpVar2.a;
                                            if (duration2.isZero() || duration2.isNegative()) {
                                                return;
                                            }
                                            ywk ywkVar2 = this.l;
                                            String strR = ywkVar2 != null ? ywkVar2.h : this.A.r();
                                            String strR2 = ywkVar.h;
                                            if (strR2 == null) {
                                                strR2 = xscVar.a.r();
                                            }
                                            String str = strR2;
                                            if (strR == null || str == null) {
                                                return;
                                            }
                                            this.r = true;
                                            Handler handler = this.a;
                                            handler.removeCallbacks(this.p);
                                            long jS = s(zevVar);
                                            int iC = (int) this.e.i.c(56, 45836213L, 0L);
                                            if (iC == 0 || iC != 1) {
                                                z2 = true;
                                                i = 1;
                                            } else {
                                                i = 2;
                                                z2 = true;
                                            }
                                            dov dovVar = this.y;
                                            dovVar.L(strR, 2, jS, duration2, i);
                                            dovVar.L(str, 1, 0L, duration2, i);
                                            zew zewVar = this.A;
                                            zdr zdrVar = this.m;
                                            long jE = zewVar.e();
                                            if (jE == -1) {
                                                jE = s(zevVar);
                                            }
                                            long jMax = Math.max(0L, jE);
                                            long j = ywkVar.e.a;
                                            long epochMilli = this.h.f().toEpochMilli();
                                            ag(zevVar);
                                            this.b.remove(zevVar);
                                            zdrVar.B(jMax, j, ywkVar, epochMilli);
                                            zdrVar.E();
                                            this.j.add(new xsc((Object) zewVar, (Object) strR, (Object) zdrVar, (short[]) null));
                                            ?? r3 = xscVar.a;
                                            this.A = r3;
                                            this.i.remove((Object) r3);
                                            zcj zcjVarT = t(this.A);
                                            if (zcjVarT != null) {
                                                this.v.b(zcjVarT);
                                            }
                                            al(zevVar);
                                            r3.M(a());
                                            r3.aG(zcfVar, xscVar.b, ywkVar);
                                            r3.O(0.0f);
                                            zdtVar.x(zcfVar, z2);
                                            this.A.A();
                                            an();
                                            aj();
                                            handler.post(new ywt(this, 17));
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        this.a.removeCallbacks(this.p);
        x();
        zdt zdtVar2 = this.w;
        zdtVar2.d((zcf) xscVar.c);
        zdtVar2.e();
        zdtVar2.l();
        af(xscVar.a);
        ag(zevVar);
        List list = this.c;
        if (list.isEmpty() && this.A.X(zevVar)) {
            return;
        }
        List list2 = this.b;
        list.addAll(0, list2);
        list2.clear();
        ae();
        am(false);
    }

    static zcj t(zew zewVar) {
        if (zewVar instanceof zdl) {
            return ((zdl) zewVar).q();
        }
        if (zewVar instanceof zcj) {
            return (zcj) zewVar;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, zew] */
    @Override // defpackage.zew
    public final void A() {
        if (this.D && this.b.isEmpty() && !this.c.isEmpty()) {
            this.D = false;
            F(e());
        } else {
            this.A.A();
        }
        if (this.e.bD()) {
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                ((xsc) it.next()).c.A();
            }
            ai();
            if (this.y.K()) {
                an();
            }
        }
    }

    @Override // defpackage.zew
    public final void B() {
        if (this.e.bD() && this.y.K()) {
            ao();
        } else {
            this.A.B();
        }
    }

    @Override // defpackage.zew
    public final void E() {
        this.A.E();
    }

    public final void F(long j) {
        String str;
        String str2;
        ywk ywkVar;
        zjr zjrVar = this.e;
        if (zjrVar.bD()) {
            ap();
        }
        this.B = true;
        Handler handler = this.a;
        handler.removeCallbacksAndMessages(null);
        zev zevVar = (zev) this.c.remove(0);
        zhq zhqVar = zhq.ABR;
        ywk ywkVar2 = this.l;
        if (ywkVar2 != null) {
            this.A.aa(false, 39);
        }
        zdr zdrVar = this.m;
        ywk ywkVar3 = zevVar.b;
        zdrVar.C(j, ywkVar3);
        if (zjrVar.bD()) {
            this.m.E();
        }
        if (ywkVar2 != null) {
            String str3 = ywkVar2.h;
            str2 = ywkVar2.d.g;
            str = str3;
        } else {
            str = null;
            str2 = null;
        }
        if (str == null || str2 == null) {
            ywkVar = ywkVar3;
        } else {
            ywkVar = ywkVar3;
            this.x = new aaok(this.n, str, str2, j, ywkVar3.e.a, zevVar, false);
        }
        this.m = (zdr) ywkVar.b;
        ywk ywkVar4 = new ywk(ywkVar);
        ywk ywkVar5 = this.l;
        int i = (ywkVar5 != null ? ywkVar5.n : 0) | 2;
        Integer.valueOf(i).getClass();
        ywkVar4.n = i;
        this.l = ywkVar4;
        this.n = ywkVar4.a;
        Q(this.A.Y(this.l));
        handler.post(new ywt(this, 17));
    }

    @Override // defpackage.zew
    public final void H(RestartPrefetchEvaluationSource restartPrefetchEvaluationSource, boolean z2) {
        this.A.H(restartPrefetchEvaluationSource, z2);
    }

    @Override // defpackage.zew
    public final void I(long j, appa appaVar) {
        this.D = false;
        zjr zjrVar = this.e;
        if (zjrVar.bD()) {
            ap();
        }
        this.A.I(j, appaVar);
        if (zjrVar.bD()) {
            ai();
        }
    }

    @Override // defpackage.zew
    public final void J(boolean z2, ajvs ajvsVar) {
        this.A.J(z2, ajvsVar);
    }

    @Override // defpackage.zew
    public final void K(zlm zlmVar) {
        this.A.K(zlmVar);
    }

    @Override // defpackage.zew
    public final void L(int i, int i2) {
        this.A.L(i, i2);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, zew] */
    @Override // defpackage.zew
    public final void M(float f) {
        this.A.M(f);
        if (this.e.bD()) {
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                ((zew) it.next()).M(f);
            }
            List list = this.j;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((xsc) it2.next()).c.M(f);
            }
            if (!this.y.K() || list.isEmpty()) {
                if (this.r) {
                    return;
                }
                ai();
            } else {
                if (!W() || S()) {
                    return;
                }
                an();
            }
        }
    }

    @Override // defpackage.zew
    public final void N(boolean z2) {
        this.A.N(z2);
    }

    @Override // defpackage.zew
    public final void O(float f) {
        this.s = f;
        if (this.e.bD() && this.y.K()) {
            ao();
        } else {
            this.A.O(f);
        }
    }

    @Override // defpackage.zew
    public final void P(boolean z2) {
        this.A.P(z2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ywn] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, ywn] */
    public final void Q(zsf zsfVar) {
        aaok aaokVar = this.x;
        if (aaokVar != null) {
            zsf zsfVar2 = this.C;
            boolean z2 = false;
            if (zsfVar2 != null && !zsfVar2.equals(zsfVar)) {
                z2 = true;
            }
            aaok.d(z2, (zds) aaokVar.d, aaokVar.c);
            aaok.d(z2, (zds) aaokVar.a, aaokVar.b);
            this.x = null;
        }
        this.C = zsfVar;
    }

    @Override // defpackage.zew
    public final boolean R() {
        return this.A.R();
    }

    @Override // defpackage.zew
    public final boolean S() {
        return this.A.S();
    }

    @Override // defpackage.zew
    public final boolean T(wja wjaVar, wiu wiuVar) {
        return this.A.T(wjaVar, wiuVar);
    }

    public final void U() {
        if (!(this.A instanceof zey)) {
            throw new IllegalStateException("QueuingPlayer has already been initialized.");
        }
        this.A = this.E.a(this.w);
        byte[] bArr = null;
        this.p = new yas(this, 3, bArr);
        this.t = new yas(this, 4, bArr);
        this.q = new yas(this, 5, bArr);
    }

    public final void V() {
        List list;
        boolean zX;
        List list2 = this.b;
        ywk ywkVar = !list2.isEmpty() ? ((zev) aguu.K(list2)).b : this.l;
        int i = 0;
        while (true) {
            list = this.c;
            if (i >= list.size()) {
                break;
            }
            zev zevVar = (zev) list.get(i);
            if (!this.e.bD() || !au(zevVar, ywkVar) || !(zX = as(zevVar))) {
                zX = this.A.X(zevVar);
            }
            if (!zX) {
                break;
            }
            list2.add(zevVar);
            ywkVar = zevVar.b;
            i++;
        }
        if (i > 0) {
            list.subList(0, i).clear();
            ai();
        }
        am(false);
    }

    @Override // defpackage.zew
    public final boolean W() {
        return this.A.W();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0073  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a9  */
    @Override // defpackage.zew
    public final boolean X(zev zevVar) {
        List list;
        if (this.m == z) {
            return false;
        }
        ywk ywkVar = zevVar.b;
        zjd zjdVarB = ywkVar.b.b();
        zjdVarB.ar();
        zev zevVarA = zevVar.a(new zdw(this, ywkVar.b));
        if (this.e.bD()) {
            List list2 = this.c;
            if (list2.isEmpty()) {
                String str = zevVarA.b.h;
                ywk ywkVar2 = this.l;
                if (str != null) {
                    int i = 0;
                    while (true) {
                        List list3 = this.b;
                        if (i < list3.size()) {
                            ywk ywkVar3 = ((zev) list3.get(i)).b;
                            if (!str.equals(ywkVar3.h)) {
                                i++;
                                ywkVar2 = ywkVar3;
                            }
                        } else {
                            int i2 = 0;
                            while (true) {
                                if (i2 < list2.size()) {
                                    ywk ywkVar4 = ((zev) list2.get(i2)).b;
                                    if (!str.equals(ywkVar4.h)) {
                                        i2++;
                                        ywkVar2 = ywkVar4;
                                    }
                                } else if (list2.isEmpty()) {
                                    list = this.b;
                                    if (list.isEmpty()) {
                                        ywkVar2 = this.l;
                                    } else {
                                        ywkVar2 = ((zev) aguu.K(list)).b;
                                    }
                                } else {
                                    ywkVar2 = ((zev) aguu.K(list2)).b;
                                }
                            }
                        }
                    }
                } else if (list2.isEmpty()) {
                    ywkVar2 = ((zev) aguu.K(list2)).b;
                } else {
                    list = this.b;
                    if (list.isEmpty()) {
                        ywkVar2 = ((zev) aguu.K(list)).b;
                    } else {
                        ywkVar2 = this.l;
                    }
                }
                if (au(zevVarA, ywkVar2) && as(zevVarA)) {
                    this.b.add(zevVarA);
                    ai();
                } else if (list2.isEmpty() || !this.A.X(zevVarA)) {
                    list2.add(zevVarA);
                    am(false);
                } else {
                    this.b.add(zevVarA);
                    ai();
                }
            } else {
                if (list2.isEmpty()) {
                }
                list2.add(zevVarA);
                am(false);
            }
        } else if (this.A.X(zevVarA)) {
            this.b.add(zevVarA);
        } else {
            this.c.add(zevVarA);
            am(false);
        }
        zjdVarB.aq();
        return true;
    }

    @Override // defpackage.zew
    public final zsf Y(ywk ywkVar) {
        this.b.clear();
        this.c.clear();
        this.s = ywkVar.l;
        if (this.e.bD()) {
            ae();
        }
        this.D = false;
        this.m = new zdw(this, ywkVar.b);
        ywk ywkVar2 = new ywk(ywkVar);
        ywkVar2.b = this.m;
        this.l = ywkVar2;
        this.n = ywkVar.a;
        this.B = true;
        this.o = false;
        zsf zsfVarY = this.A.Y(this.l);
        this.C = zsfVarY;
        return zsfVarY;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, zew] */
    @Override // defpackage.zew
    public final void Z(int i) {
        this.A.Z(i);
        if (this.e.bD()) {
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                ((xsc) it.next()).c.Z(i);
            }
            Handler handler = this.a;
            handler.removeCallbacks(this.p);
            handler.removeCallbacks(this.q);
            handler.removeCallbacks(this.t);
        }
    }

    @Override // defpackage.zew
    public final float a() {
        return this.A.a();
    }

    @Override // defpackage.zew
    public final void aa(boolean z2, int i) {
        ah();
        this.A.aa(z2, i);
    }

    @Override // defpackage.zew
    public final void ab(int i) {
        ah();
        this.A.ab(i);
    }

    @Override // defpackage.zew
    public final void ac(acca accaVar) {
        this.A.ac(accaVar);
    }

    public final void ad() {
        if (S()) {
            an();
        } else if (ap()) {
            ai();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, zew] */
    final void ae() {
        List list = this.i;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ak((zew) it.next());
        }
        list.clear();
        List list2 = this.j;
        ArrayList arrayList = new ArrayList(list2);
        list2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xsc xscVar = (xsc) arrayList.get(i);
            ak(xscVar.c);
            xscVar.z();
        }
        y();
        this.w.l();
        this.a.removeCallbacks(this.p);
        x();
    }

    final void af(zew zewVar) {
        xsc xscVar;
        List list = this.j;
        List list2 = this.i;
        boolean zRemove = list2.remove(zewVar);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                xscVar = null;
                break;
            }
            xscVar = (xsc) it.next();
            if (zewVar.equals(xscVar.c)) {
                it.remove();
                break;
            }
        }
        boolean z2 = true;
        boolean z3 = xscVar != null;
        if (zRemove) {
            z2 = z3;
        } else if (!z3) {
            return;
        }
        ak(zewVar);
        Collection.EL.removeIf(this.k.values(), new xdo(zewVar, 12));
        if (xscVar != null) {
            ((ConcurrentHashMap) this.y.a).remove(xscVar.a);
            xscVar.z();
        }
        if (z2 && list.isEmpty()) {
            this.w.l();
            x();
        }
        if (list2.isEmpty() && list.isEmpty()) {
            this.a.removeCallbacks(this.p);
            if (this.r) {
                x();
                this.r = false;
            }
        }
    }

    final void ag(zev zevVar) {
        this.k.remove(zevVar);
    }

    public final void ah() {
        this.b.clear();
        this.c.clear();
        if (this.e.bD()) {
            ae();
            y();
        }
        Handler handler = this.a;
        handler.removeCallbacks(this.p);
        handler.removeCallbacks(this.q);
        zdn zdnVar = this.v;
        synchronized (zdnVar.a) {
            zdnVar.b.clear();
            for (Object obj : zdnVar.c.values()) {
                obj.getClass();
                ((Set) obj).clear();
            }
        }
        this.l = null;
        this.n = ywn.b;
        this.C = null;
        this.x = null;
        this.m = z;
        this.D = false;
    }

    public final void ai() {
        if (this.e.bD()) {
            Handler handler = this.a;
            handler.removeCallbacks(this.p);
            if (this.r) {
                return;
            }
            List list = this.b;
            if (list.isEmpty()) {
                return;
            }
            zev zevVar = (zev) list.get(0);
            xsc xscVar = (xsc) this.k.get(zevVar);
            if (xscVar != null) {
                long jS = s(zevVar);
                if (jS != -1) {
                    long jE = e();
                    if (jE != -1 && jE >= jS) {
                        av(zevVar, xscVar);
                        return;
                    }
                    float fA = a();
                    if (!W() || S() || fA <= 0.0f) {
                        return;
                    }
                    if (jE != -1) {
                        jS -= jE;
                    }
                    long j = (long) (jS / ((double) fA));
                    if (j <= 0) {
                        av(zevVar, xscVar);
                    } else {
                        handler.postDelayed(this.p, j);
                    }
                }
            }
        }
    }

    final void aj() {
        this.a.removeCallbacks(this.t);
        ao();
    }

    public final void ak(zew zewVar) {
        Object next;
        zewVar.aa(false, 1);
        zcj zcjVarT = t(zewVar);
        if (zcjVarT != null) {
            zdn zdnVar = this.v;
            synchronized (zdnVar.a) {
                ConcurrentHashMap concurrentHashMap = zdnVar.d;
                concurrentHashMap.remove(zcjVarT);
                ConcurrentHashMap concurrentHashMap2 = zdnVar.c;
                Set set = (Set) concurrentHashMap2.remove(zcjVarT);
                if (set != null) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        zdnVar.b.remove((zcf) it.next(), zcjVarT);
                    }
                }
                if (awrc.c(zdnVar.e, zcjVarT)) {
                    Set setKeySet = concurrentHashMap2.keySet();
                    setKeySet.getClass();
                    Iterator it2 = setKeySet.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (concurrentHashMap.get((zcj) next) == yxj.c);
                    zcj zcjVar = (zcj) next;
                    if (zcjVar == null) {
                        Set setKeySet2 = concurrentHashMap2.keySet();
                        setKeySet2.getClass();
                        zcjVar = (zcj) atqq.Y(setKeySet2);
                    }
                    zdnVar.e = zcjVar == null ? zcj.W : zcjVar;
                    if (zcjVar != null && concurrentHashMap.get(zcjVar) != yxj.c) {
                        concurrentHashMap.put(zcjVar, yxj.a);
                    }
                }
            }
        }
    }

    public final void al(zev zevVar) {
        ywk ywkVar = zevVar.b;
        ywj ywjVar = ywkVar.b;
        if (ywjVar instanceof zdr) {
            this.m = (zdr) ywjVar;
        } else {
            this.m = new zdw(this, ywjVar);
        }
        ywk ywkVar2 = new ywk(ywkVar);
        ywkVar2.b = this.m;
        ywkVar2.y(2);
        this.l = ywkVar2;
        this.n = ywkVar2.a;
    }

    public final void am(boolean z2) {
        if (this.B || !this.b.isEmpty()) {
            return;
        }
        List list = this.c;
        if (list.isEmpty()) {
            return;
        }
        zev zevVar = (zev) list.get(0);
        if (z2) {
            ywk ywkVar = this.l;
            if (ywkVar == null) {
                this.m.h(new zhz("player.exception", e(), "nullStreamingData"));
                F(-1L);
                return;
            } else if (zevVar.b.s(4)) {
                this.D = true;
                return;
            } else {
                F(at(ywkVar));
                return;
            }
        }
        long j = zevVar.a;
        if (j != -1) {
            long jE = e();
            if (j <= jE) {
                F(jE);
            } else if (this.o || (W() && !S())) {
                this.o = false;
                this.a.postDelayed(new ywt(this, 16), j - jE);
            }
        }
    }

    final void an() {
        long j;
        long j2;
        if (this.e.bD()) {
            dov dovVar = this.y;
            if (dovVar.K()) {
                ywk ywkVar = this.l;
                String strR = ywkVar != null ? ywkVar.h : this.A.r();
                zdm zdmVarJ = strR != null ? dovVar.J(strR) : null;
                if (zdmVarJ == null) {
                    Iterator it = this.j.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            j = 0;
                            break;
                        }
                        zdm zdmVarJ2 = dovVar.J((String) ((xsc) it.next()).a);
                        if (zdmVarJ2 != null) {
                            j = zdmVarJ2.a;
                            break;
                        }
                    }
                } else {
                    j = zdmVarJ.a;
                }
                if (j > 0) {
                    long jE = this.A.e();
                    if (jE == -1 || jE < 0) {
                        jE = 0;
                    }
                    long jMax = zdmVarJ != null ? Math.max(0L, zdmVarJ.b - jE) : Math.max(0L, j - jE);
                    Handler handler = this.a;
                    handler.removeCallbacks(this.q);
                    float fA = a();
                    if (fA <= 0.0f) {
                        fA = 1.0f;
                    }
                    if (jMax == 0) {
                        j2 = 0;
                    } else {
                        double d = jMax;
                        j2 = (long) ((d + d) / ((double) fA));
                    }
                    handler.postDelayed(this.q, Math.max(0L, j2));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, zew] */
    public final void ao() {
        zdm zdmVar;
        zjr zjrVar = this.e;
        if (zjrVar.bD()) {
            dov dovVar = this.y;
            if (!dovVar.K()) {
                this.a.removeCallbacks(this.t);
                return;
            }
            ywk ywkVar = this.l;
            String strR = ywkVar != null ? ywkVar.h : this.A.r();
            long jE = this.A.e();
            if (jE != -1 && strR != null && jE >= 0 && (zdmVar = (zdm) ((ConcurrentHashMap) dovVar.a).get(strR)) != null && zdmVar.a(jE) >= 1.0f) {
                ad();
                return;
            }
            ar(this.A, strR, jE);
            for (xsc xscVar : this.j) {
                ?? r3 = xscVar.c;
                ar(r3, (String) xscVar.a, r3.e());
            }
            Handler handler = this.a;
            handler.removeCallbacks(this.t);
            if (!W() || S()) {
                return;
            }
            int iC = (int) zjrVar.i.c(58, 45840374L, 0L);
            if (iC <= 0) {
                iC = 50;
            }
            handler.postDelayed(this.t, iC);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, zew] */
    final boolean ap() {
        if (!this.e.bD()) {
            return false;
        }
        if (!this.r && this.j.isEmpty() && !this.y.K()) {
            return false;
        }
        x();
        List list = this.j;
        ArrayList arrayList = new ArrayList(list);
        list.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xsc xscVar = (xsc) arrayList.get(i);
            ak(xscVar.c);
            xscVar.z();
        }
        this.w.l();
        return true;
    }

    @Override // defpackage.zew
    public final int b(wja wjaVar, wiu wiuVar) {
        return this.A.b(wjaVar, wiuVar);
    }

    @Override // defpackage.zew
    public final int c() {
        return this.A.c();
    }

    @Override // defpackage.zew
    public final long d() {
        return this.A.d();
    }

    @Override // defpackage.zew
    public final long e() {
        return this.A.e();
    }

    @Override // defpackage.zew
    public final long f() {
        return this.A.f();
    }

    @Override // defpackage.zew
    public final long g() {
        return this.A.g();
    }

    @Override // defpackage.zew
    public final long h() {
        return this.A.h();
    }

    @Override // defpackage.zew
    public final long i() {
        return this.A.i();
    }

    @Override // defpackage.zew
    public final long j(long j) {
        return this.A.j(j);
    }

    @Override // defpackage.zew
    public final wgs k() {
        return this.A.k();
    }

    @Override // defpackage.zew
    public final wgs l() {
        return this.A.l();
    }

    @Override // defpackage.zew
    public final yod m(wja wjaVar, wiu wiuVar, boolean z2, yoc yocVar, int i) {
        return this.A.m(wjaVar, wiuVar, z2, yocVar, i);
    }

    @Override // defpackage.zew
    public final yve n() {
        return this.A.n();
    }

    @Override // defpackage.zew
    public final zia o() {
        return this.A.o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [zew] */
    /* JADX WARN: Type inference failed for: r1v2, types: [zew] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // defpackage.zew
    public final zia p(String str) {
        zjr zjrVar = this.e;
        if (!zjrVar.aV()) {
            return o();
        }
        ?? r1 = this.A;
        ywk ywkVar = this.l;
        if (!str.equals(ywkVar != null ? ywkVar.h : r1.r()) && !str.equals(r1.r())) {
            r1 = 0;
            r1 = 0;
            if (zjrVar.bD()) {
                for (xsc xscVar : this.j) {
                    if (str.equals(xscVar.a)) {
                        r1 = xscVar.c;
                        break;
                    }
                }
            }
        }
        return r1 != 0 ? r1.p(str) : zia.a;
    }

    final long q(zev zevVar) {
        long jG = zevVar.a;
        if (jG == -1) {
            ywk ywkVar = this.l;
            jG = ywkVar != null ? at(ywkVar) : -1L;
        }
        if (jG == -1 || jG <= 0) {
            jG = g();
        }
        if (jG == -1 || jG <= 0) {
            return -1L;
        }
        return jG;
    }

    @Override // defpackage.zew
    public final String r() {
        return this.A.r();
    }

    final long s(zev zevVar) {
        if (zevVar == null) {
            return -1L;
        }
        zgp zgpVar = zevVar.b.w;
        if (!(zgpVar instanceof zgp)) {
            return -1L;
        }
        Duration duration = zgpVar.a;
        if (duration.isZero() || duration.isNegative()) {
            return -1L;
        }
        long jQ = q(zevVar);
        if (jQ != -1) {
            return Math.max(0L, jQ - duration.toMillis());
        }
        return -1L;
    }

    @Override // defpackage.zew
    public final void u() {
        this.A.u();
        this.b.clear();
        this.c.clear();
        if (this.e.bD()) {
            ae();
            y();
        }
    }

    @Override // defpackage.zew
    public final void v() {
        this.A.v();
    }

    @Override // defpackage.zew
    public final void w(boolean z2) {
        this.A.w(z2);
    }

    final void x() {
        Handler handler = this.a;
        handler.removeCallbacks(this.t);
        handler.removeCallbacks(this.q);
        this.r = false;
        ((ConcurrentHashMap) this.y.a).clear();
        this.A.O(this.s);
    }

    final void y() {
        this.k.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [cno, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, zcg, zew] */
    @Override // defpackage.zew
    public final void z() {
        zjd zjdVarB;
        List list = this.b;
        if (list.isEmpty()) {
            List list2 = this.c;
            zjdVarB = !list2.isEmpty() ? ((zev) list2.get(0)).b.b.b() : zjd.a;
        } else {
            zjdVarB = ((zev) list.get(0)).b.b.b();
        }
        zjdVarB.ac();
        this.D = false;
        zjr zjrVar = this.e;
        if (zjrVar.bD()) {
            ap();
        }
        this.n.l("tntnxt", String.valueOf(this.h.b() - (this.n.a() / 1000.0d)));
        if (list.isEmpty()) {
            List list3 = this.c;
            if (!list3.isEmpty()) {
                ((zev) list3.get(0)).b.a.l("tntprv", "1");
                F(e());
            }
        } else {
            zev zevVar = (zev) list.get(0);
            ywk ywkVar = zevVar.b;
            ywkVar.a.l("tntprv", "1");
            xsc xscVar = (xsc) this.k.get(zevVar);
            if (!zjrVar.bD() || xscVar == null) {
                this.A.z();
            } else if (ywkVar.e != null) {
                Handler handler = this.a;
                handler.removeCallbacks(this.p);
                float fA = a();
                ?? r8 = xscVar.a;
                r8.M(fA);
                ?? r6 = xscVar.b;
                zcf zcfVar = (zcf) xscVar.c;
                r8.aG(zcfVar, r6, ywkVar);
                r8.O(this.s);
                this.w.x(zcfVar, false);
                zew zewVar = this.A;
                long jMax = Math.max(0L, zewVar.e());
                this.A = r8;
                this.i.remove((Object) r8);
                zcj zcjVarT = t(this.A);
                if (zcjVarT != null) {
                    this.v.b(zcjVarT);
                }
                ak(zewVar);
                ag(zevVar);
                list.remove(zevVar);
                zdr zdrVar = this.m;
                al(zevVar);
                zdrVar.C(jMax, ywkVar);
                zdrVar.E();
                this.A.A();
                handler.post(new ywt(this, 17));
                ai();
            }
        }
        zjdVarB.ab();
    }

    @Override // defpackage.zew
    public final /* synthetic */ void C() {
    }

    @Override // defpackage.zew
    public final /* synthetic */ void G() {
    }

    @Override // defpackage.zew
    public final /* synthetic */ void D(ywn ywnVar) {
    }
}
