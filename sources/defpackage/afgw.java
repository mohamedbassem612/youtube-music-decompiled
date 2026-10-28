package defpackage;

import android.app.Activity;
import internal.org.jni_zero.CommonApis;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afgw implements bnu {
    public Object b;
    public final jij d;
    private final aunr e;
    private final afhk f;
    private final afny g;
    private final awmi h;
    private final boolean i;
    public static final afba c = new afba(null);
    public static final agrf a = agrf.h("com/google/apps/tiktok/account/api/controller/ActivityAccountState");

    public afgw(aunr aunrVar, jij jijVar, afhk afhkVar, agev agevVar, afny afnyVar) {
        bpj bpjVar;
        aunrVar.getClass();
        jijVar.getClass();
        afhkVar.getClass();
        agevVar.getClass();
        afnyVar.getClass();
        this.e = aunrVar;
        this.d = jijVar;
        this.f = afhkVar;
        this.g = afnyVar;
        int iD = aunrVar.d() - 1;
        if (iD != 0) {
            int i = 1;
            if (iD != 1) {
                cc ccVarB = aunrVar.b();
                awmi awmiVarK = atqp.k(3, new afgy(new afgy(ccVarB, 1), 0));
                int i2 = awrn.a;
                bpjVar = new bpj(new awqv(afhh.class), new afgy(awmiVarK, 2), new afgz(ccVarB, awmiVarK), new afgy(awmiVarK, 3));
            } else {
                afpa afpaVarE = aunrVar.e();
                int i3 = awrn.a;
                bpjVar = new bpj(new awqv(afhh.class), new acoo(afpaVarE, 19), new acoo(afpaVarE, 20), new afqt(afpaVarE, i));
            }
        } else {
            Activity activityA = aunrVar.a();
            afgx afgxVar = new afgx(activityA, 0);
            int i4 = awrn.a;
            bpjVar = new bpj(new awqv(afhh.class), new afgx(activityA, 2), afgxVar, new afgx(activityA, 3));
        }
        this.h = bpjVar;
        this.i = ((Boolean) agevVar.e(Boolean.FALSE)).booleanValue();
        aunrVar.getLifecycle().b(this);
    }

    public final int a() {
        qpj.c();
        afhg afhgVar = b().a;
        afhe afheVar = afhgVar instanceof afhe ? (afhe) afhgVar : null;
        if (afheVar != null) {
            return afheVar.a;
        }
        return -1;
    }

    public final afhh b() {
        return (afhh) this.h.a();
    }

    public final void c() {
        h(afhf.a);
    }

    public final void d() {
        afba.j(this.e).ah();
    }

    public final void e(affx affxVar) {
        h(afhc.a);
        jij jijVar = this.d;
        jijVar.N();
        afuu afuuVarC = afwt.c(109, "onNoAccountAvailable");
        try {
            agqr it = ((agpr) jijVar.c).iterator();
            while (it.hasNext()) {
                ((afgr) it.next()).n(affxVar);
            }
            Iterator it2 = ((ArrayList) jijVar.b).iterator();
            while (it2.hasNext()) {
                ((afgr) it2.next()).n(affxVar);
            }
            afuuVarC.close();
        } catch (Throwable th) {
            try {
                afuuVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void f() {
        if (h(afhd.a)) {
            jij jijVar = this.d;
            jijVar.O();
            afuu afuuVarC = afwt.c(110, "onAccountLoading");
            try {
                agqr it = ((agpr) jijVar.c).iterator();
                while (it.hasNext()) {
                    ((afgr) it.next()).k();
                }
                Iterator it2 = ((ArrayList) jijVar.b).iterator();
                while (it2.hasNext()) {
                    ((afgr) it2.next()).k();
                }
                afuuVarC.close();
            } catch (Throwable th) {
                try {
                    afuuVarC.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public final boolean g() {
        qpj.c();
        return b().a instanceof afhe;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0115 A[Catch: all -> 0x0156, TryCatch #2 {, blocks: (B:46:0x010d, B:48:0x0115, B:49:0x0123, B:57:0x0145, B:58:0x0148, B:61:0x014b, B:64:0x014e, B:65:0x0153, B:50:0x0124, B:52:0x0130, B:54:0x013e, B:55:0x0142), top: B:90:0x010d, outer: #1, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0130 A[Catch: all -> 0x014c, TryCatch #4 {all -> 0x014c, blocks: (B:50:0x0124, B:52:0x0130, B:54:0x013e, B:55:0x0142), top: B:92:0x0124, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x013d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0145 A[Catch: all -> 0x0156, TRY_ENTER, TryCatch #2 {, blocks: (B:46:0x010d, B:48:0x0115, B:49:0x0123, B:57:0x0145, B:58:0x0148, B:61:0x014b, B:64:0x014e, B:65:0x0153, B:50:0x0124, B:52:0x0130, B:54:0x013e, B:55:0x0142), top: B:90:0x010d, outer: #1, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x014e A[Catch: all -> 0x0156, TryCatch #2 {, blocks: (B:46:0x010d, B:48:0x0115, B:49:0x0123, B:57:0x0145, B:58:0x0148, B:61:0x014b, B:64:0x014e, B:65:0x0153, B:50:0x0124, B:52:0x0130, B:54:0x013e, B:55:0x0142), top: B:90:0x010d, outer: #1, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0124 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.Map] */
    public final boolean h(afhg afhgVar) {
        auod auodVarB;
        Map map;
        afoa afoaVarA;
        afoz afozVar;
        auod auodVarA;
        qpj.c();
        this.f.a();
        if (awrc.c(b().a, afhgVar)) {
            return false;
        }
        d();
        boolean z = afhgVar instanceof afhe;
        if (z || !(b().a instanceof afhf)) {
            c.k(afba.j(this.e));
        }
        afhg afhgVar2 = b().a;
        b().a = afhgVar;
        if ((afhgVar2 instanceof afhe) || z) {
            afny afnyVar = this.g;
            affd affdVarA = affd.a(a());
            synchronized (afnyVar.b) {
                Set setB = afnyVar.b();
                if (!setB.isEmpty()) {
                    affd affdVar = (affd) aguu.C(setB.iterator());
                    aunr aunrVar = afnyVar.a;
                    if (aunrVar.d() == 1 || aunrVar.d() == 2) {
                        axqr axqrVarCg = ((afnx) atqp.a(afnyVar.d, afnx.class)).cg();
                        synchronized (axqrVarCg.a) {
                            try {
                                ?? r3 = axqrVarCg.b;
                                if (!r3.containsKey(affdVar)) {
                                    throw new IllegalStateException();
                                }
                                afok afokVar = (afok) r3.remove(affdVar);
                                afog afogVarA = afokVar.b.a(afokVar.a);
                                synchronized (afogVarA.e) {
                                    try {
                                        boy boyVar = afogVarA.a;
                                        Object obj = boyVar.b;
                                        Set setKeySet = ((axfd) obj).c.keySet();
                                        ?? r10 = ((axfd) obj).b;
                                        Set setR = atqq.r(setKeySet, r10.keySet());
                                        ?? r7 = boyVar.a;
                                        for (String str : atqq.r(setR, r7.keySet())) {
                                            str.getClass();
                                            ((axfd) obj).ay(str);
                                            if (((box) r7.remove(str)) != null) {
                                                throw null;
                                            }
                                            str.getClass();
                                            r10.remove(str);
                                        }
                                        auodVarB = afogVarA.f != null ? ((afof) atqp.a(afogVarA.f, afof.class)).b() : null;
                                        afogVarA.f = null;
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                if (auodVarB != null) {
                                    auodVarB.a();
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        synchronized (afnyVar.b) {
                            map = afnyVar.c;
                            if (map.containsKey(affdVar)) {
                                throw new IllegalStateException();
                            }
                            afoaVarA = ((afnv) map.remove(affdVar)).a.a();
                            synchronized (afoaVarA.d) {
                                try {
                                    auor auorVar = afoaVarA.b;
                                    CommonApis.k();
                                    auorVar.a();
                                    afozVar = afoaVarA.e;
                                    if (afozVar != null) {
                                        auodVarA = ((afob) atqp.a(afozVar, afob.class)).a();
                                    } else {
                                        auodVarA = null;
                                    }
                                    afoaVarA.e = null;
                                    afoaVarA.a = null;
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                            if (auodVarA != null) {
                                auodVarA.a();
                            }
                        }
                    } else {
                        synchronized (afnyVar.b) {
                            map = afnyVar.c;
                            if (map.containsKey(affdVar)) {
                                throw new IllegalStateException();
                            }
                            afoaVarA = ((afnv) map.remove(affdVar)).a.a();
                            synchronized (afoaVarA.d) {
                                auor auorVar2 = afoaVarA.b;
                                CommonApis.k();
                                auorVar2.a();
                                afozVar = afoaVarA.e;
                                if (afozVar != null) {
                                    auodVarA = ((afob) atqp.a(afozVar, afob.class)).a();
                                } else {
                                    auodVarA = null;
                                }
                                afoaVarA.e = null;
                                afoaVarA.a = null;
                                if (auodVarA != null) {
                                    auodVarA.a();
                                }
                            }
                        }
                    }
                }
                afnyVar.c.put(affdVarA, afnyVar.a(affdVarA));
            }
        }
        return true;
    }

    @Override // defpackage.bnu
    public final void onCreate(bog bogVar) {
        boolean z = false;
        if (b().c && !this.i && b().b) {
            z = true;
        }
        b().b = this.i;
        if (z) {
            b().a = afhf.a;
            c.k(afba.j(this.e));
            return;
        }
        afhg afhgVar = b().a;
        if (awrc.c(afhgVar, afhd.a)) {
            this.d.O();
            return;
        }
        if (afhgVar instanceof afhe) {
            jij jijVar = this.d;
            afhe afheVar = (afhe) afhgVar;
            affd.a(afheVar.a);
            afhq afhqVar = afheVar.b;
            jijVar.Q();
            return;
        }
        if (awrc.c(afhgVar, afhc.a)) {
            this.d.N();
        } else if (!awrc.c(afhgVar, afhf.a)) {
            throw new awmj();
        }
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onDestroy(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onPause(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onResume(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStart(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStop(bog bogVar) {
    }
}
