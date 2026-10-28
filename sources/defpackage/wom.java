package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wom extends wnn implements wnf {
    public static final /* synthetic */ int l = 0;
    private static final agkj m = agkj.j("SPunlimited", ajgq.ENGAGEMENT_TYPE_YPC_GET_PREMIUM_PAGE);
    public final zwb c;
    public final String d;
    public final boolean e;
    public final aunn f;
    public final agfr g;
    public final aunn h;
    public final tqj i;
    public final Context j;
    public final aunn k;
    private final aunn n;
    private final vyo o;
    private final aunn p;
    private final aunn r;
    private final boolean s;
    private final aunn t;
    private final aunn u;
    private final aunn v;

    public wom(aunn aunnVar, abxv abxvVar, zwb zwbVar, aunn aunnVar2, vxu vxuVar, vyo vyoVar, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, tbt tbtVar, aunn aunnVar6, aunn aunnVar7, aunn aunnVar8, tqj tqjVar, aunn aunnVar9, aunn aunnVar10, Context context, aunn aunnVar11) {
        super(abxvVar, aunnVar2);
        this.c = zwbVar;
        this.d = "browse";
        int i = tqr.a;
        if (tqjVar.k(1073808352)) {
            this.s = tqjVar.k(1073810995) ? tqjVar.k(1073810994) : vys.a.c;
        } else {
            this.s = vys.a(vxuVar);
        }
        this.e = tqjVar.k(1073820312);
        this.o = vyoVar;
        this.p = aunnVar3;
        this.r = aunnVar4;
        this.n = aunnVar5;
        tbtVar.getClass();
        this.t = aunnVar6;
        this.f = aunnVar7;
        this.h = aunnVar8;
        this.u = aunnVar9;
        this.i = tqjVar;
        this.g = aguu.al(new jxq(this, aunnVar, 15));
        this.v = aunnVar10;
        this.j = context;
        this.k = aunnVar11;
    }

    private final void n(woo wooVar) {
        afvx afvxVarAd = tym.ad(tsa.BS_ON_BUILD_DECORATORS);
        try {
            if (!wooVar.g().e(2)) {
                Iterator it = ((Set) this.r.io()).iterator();
                while (it.hasNext()) {
                    ((won) it.next()).d(wooVar);
                }
            }
            afvxVarAd.close();
        } catch (Throwable th) {
            try {
                afvxVarAd.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static wlt o(vyo vyoVar, wjr wjrVar) {
        if (wjrVar == null) {
            return null;
        }
        ahfi ahfiVarC = wlt.c();
        ahfiVarC.a = new hyl(vyoVar, 5);
        anin aninVar = vyoVar.b().g;
        if (aninVar == null) {
            aninVar = anin.a;
        }
        ajmw ajmwVar = aninVar.c;
        if (ajmwVar == null) {
            ajmwVar = ajmw.a;
        }
        if (ajmwVar.b) {
            ahfiVarC.h(new twq(ajmwVar.d, ajmwVar.e, ajmwVar.f, ajmwVar.c, ajmwVar.g));
            ahfiVarC.i(new hsb(ajmwVar, 7));
        }
        return ahfiVarC.g();
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture b(wlu wluVar, wne wneVar, Executor executor) {
        return zik.ch(this, wluVar, wneVar);
    }

    @Override // defpackage.wnf
    public final void c(wlu wluVar, wne wneVar, zza zzaVar) {
        woo wooVar = (woo) wluVar;
        n(wooVar);
        wlt wltVarO = o(this.o, (wjr) this.t.io());
        ((wol) this.n.io()).k(wooVar, wneVar, new woj((aaok) this.h.io(), wooVar, zzaVar), wltVarO);
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture d(wlu wluVar, wne wneVar, Executor executor) {
        return zik.ch(this, wluVar, wneVar);
    }

    @Override // defpackage.wnf
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final woo a(acjx acjxVar) {
        woo wooVarL = l();
        wooVarL.q(acjxVar);
        acjxVar.i();
        akek akekVarB = acjxVar.b();
        if (akekVarB != null && (akekVarB.b & 2) != 0) {
            wooVarL.z = akekVarB.d;
        }
        return wooVarL;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0095 A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #0 {all -> 0x00a3, blocks: (B:3:0x0006, B:5:0x0016, B:8:0x0031, B:10:0x0045, B:12:0x0074, B:21:0x0094, B:20:0x0091, B:22:0x0095, B:6:0x001e, B:11:0x0058, B:16:0x008b), top: B:32:0x0006, inners: #2, #3 }] */
    public final ListenableFuture h(woo wooVar, Executor executor) {
        ListenableFuture listenableFutureI;
        afvx afvxVarAd = tym.ad(tsa.BS_GET_BROWSE_DATA);
        try {
            n(wooVar);
            tqj tqjVar = this.i;
            int i = tqr.a;
            if (tqjVar.k(1073808352) ? tqjVar.k(69172) : ((vxz) this.v.io()).m(13, 45417830L)) {
                agev agevVarH = agev.h((ajgq) m.get(wooVar.a));
                if (agevVarH.g()) {
                    zwa zwaVarE = this.c.e();
                    ajgq ajgqVar = (ajgq) agevVarH.c();
                    afvx afvxVarAd2 = tym.ad(tsa.BS_GET_ATTESTATION_RESPONSE_DATA);
                    try {
                        ListenableFuture listenableFutureAs = ahno.as(((syn) this.k.io()).n(zwaVarE), new qzc((Object) this, (Object) zwaVarE, (Object) ajgqVar, 11, (byte[]) null), executor);
                        afvxVarAd2.a(listenableFutureAs);
                        afvxVarAd2.close();
                        listenableFutureI = ahno.as(listenableFutureAs, new qzc((Object) this, (Object) wooVar, (Object) executor, 10, (byte[]) null), executor);
                        afvxVarAd.a(listenableFutureI);
                    } catch (Throwable th) {
                        try {
                            afvxVarAd2.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } else {
                    listenableFutureI = i(wooVar, executor);
                    afvxVarAd.a(listenableFutureI);
                }
            } else {
                listenableFutureI = i(wooVar, executor);
                afvxVarAd.a(listenableFutureI);
            }
            afvxVarAd.close();
            return listenableFutureI;
        } catch (Throwable th3) {
            try {
                afvxVarAd.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public final ListenableFuture i(woo wooVar, Executor executor) {
        wlt wltVarO = o(this.o, (wjr) this.t.io());
        return ahno.ar(ahno.aq(new ojj(this, wooVar, executor, wltVarO, 7), MoreExecutors.directExecutor()), new tvm(this, wooVar, 10), MoreExecutors.directExecutor());
    }

    public final boolean j() {
        int i = tqr.a;
        return this.i.k(1073811004);
    }

    public final boolean k() {
        int i = tqr.a;
        tqj tqjVar = this.i;
        return tqjVar.k(1073808352) ? tqjVar.k(69169) : ((vxz) this.u.io()).m(42, 45411578L);
    }

    public final woo l() {
        zwa zwaVarE = this.c.e();
        boolean zK = k();
        boolean zJ = j();
        int i = tqr.a;
        woo wooVar = new woo(this.b, zwaVarE, this.s, zK, zJ, this.e, null, !this.i.k(1073815177));
        wooVar.x = null;
        m(wooVar);
        return wooVar;
    }

    public final void m(woo wooVar) {
        boolean zE = wooVar.g().e(2);
        aunn aunnVar = this.p;
        if (zE) {
            wooVar.G(aunnVar);
            wooVar.H(this.r);
        } else {
            Iterator it = ((Set) aunnVar.io()).iterator();
            while (it.hasNext()) {
                ((wop) it.next()).d(wooVar);
            }
        }
    }
}
