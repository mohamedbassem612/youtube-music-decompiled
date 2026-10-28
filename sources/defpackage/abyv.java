package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Optional;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abyv {
    private static final agrf i = agrf.h("com/google/android/libraries/youtube/player/stats/PlaybackClientManager");
    private boolean A;
    private aazb B;
    private aaxh C;
    private final adws D;
    private final abzo E;
    public final abym a;
    public abzc b;
    public abzh c;
    public abzn d;
    public abyt e;
    public boolean f;
    public aazl g;
    public Optional h = Optional.empty();
    private abyq j;
    private abyx k;
    private final abzd l;
    private final abzi m;
    private final vyo n;
    private final abmt o;
    private final avlh p;
    private final avlh q;
    private final avlh r;
    private final avlh s;
    private final avmc t;
    private final avlh u;
    private final awmd v;
    private final abzo w;
    private String x;
    private boolean y;
    private boolean z;

    public abyv(abym abymVar, abzo abzoVar, abzd abzdVar, abzo abzoVar2, abzi abziVar, vyo vyoVar, abmt abmtVar, avlh avlhVar, avlh avlhVar2, adws adwsVar, avlh avlhVar3, avlh avlhVar4, avlh avlhVar5, avmc avmcVar, awmd awmdVar) {
        abymVar.getClass();
        this.a = abymVar;
        abzoVar.getClass();
        this.E = abzoVar;
        this.l = abzdVar;
        abzoVar2.getClass();
        this.w = abzoVar2;
        this.m = abziVar;
        this.n = vyoVar;
        this.o = abmtVar;
        this.p = avlhVar;
        this.q = avlhVar2;
        this.D = adwsVar;
        this.r = avlhVar3;
        this.s = avlhVar4;
        this.u = avlhVar5;
        this.t = avmcVar;
        this.v = awmdVar;
        this.f = true;
    }

    private final void q() {
        aazb aazbVar;
        abzc abzcVar;
        aaxh aaxhVar;
        aazl aazlVar;
        abmt abmtVar = this.o;
        boolean zCl = abmtVar.cl();
        abzc abzcVar2 = this.b;
        if (zCl) {
            if (abzcVar2 != null && this.f && (aazlVar = this.g) != null) {
                abzcVar2.i(aazlVar);
            }
        } else if (abzcVar2 != null && this.f && (aazbVar = this.B) != null) {
            abzcVar2.g(aazbVar);
        }
        abzc abzcVar3 = this.b;
        if (abzcVar3 != null && this.f) {
            abzcVar3.R = this.h;
        }
        if (!abmtVar.bq() || (abzcVar = this.b) == null || !this.f || (aaxhVar = this.C) == null) {
            return;
        }
        abzcVar.e(aaxhVar);
    }

    private final void r(wjf wjfVar, int i2, String str) {
        if (wjfVar.G().isEmpty() || this.j != null) {
            return;
        }
        boolean z = true;
        boolean z2 = wjfVar.g() != null && wjfVar.g().A;
        abym abymVar = this.a;
        alvf alvfVarS = wjfVar.s();
        byte[] bArrAb = wjfVar.ab();
        String strG = wjfVar.G();
        boolean zV = wjfVar.V();
        awmd awmdVar = this.v;
        abymVar.i.getClass();
        typ.f(strG);
        if (i2 != 3) {
            abmt abmtVar = abymVar.g;
            if (!abmtVar.bk() && (!abmtVar.bL() || !zV)) {
                z = false;
            }
        }
        abyq abyqVar = null;
        if (abymVar.j.c && alvfVarS != null && aavv.l(alvfVarS) && aavv.m(bArrAb)) {
            abmt abmtVar2 = abymVar.g;
            if (aavv.n(abmtVar2, alvfVarS, z2) && !z) {
                abyqVar = new abyq(abymVar.a, abymVar.b, abymVar.c, abymVar.d, abymVar.e, abymVar.f, abymVar.i, alvfVarS, bArrAb, strG, abymVar.h, awmdVar, abmtVar2, str);
            }
        }
        this.j = abyqVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005b  */
    /* JADX WARN: Type inference failed for: r10v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v42, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v46, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [awmd, java.lang.Object] */
    private final void s() {
        abyq abyqVar;
        abyx abyxVarB;
        abzc abzcVar;
        abzn abznVar;
        abzh abzhVar;
        abyt abytVar = this.e;
        if (abytVar != null) {
            abyn abynVar = abytVar.b;
            if (abynVar != null) {
                abym abymVar = this.a;
                awmd awmdVar = this.v;
                abymVar.i.getClass();
                if (abymVar.j.c) {
                    alvf alvfVar = abynVar.a;
                    if (aavv.l(alvfVar)) {
                        byte[] bArr = abynVar.b;
                        if (aavv.m(bArr)) {
                            String str = abynVar.c;
                            if (TextUtils.isEmpty(str)) {
                                abyqVar = null;
                            } else {
                                abyqVar = new abyq(abymVar.a, abymVar.b, abymVar.c, abymVar.d, abymVar.e, abymVar.f, abymVar.i, alvfVar, bArr, str, abymVar.h, awmdVar, abymVar.g, abynVar.f);
                                abyqVar.m = abynVar.e;
                                abyqVar.l = abynVar.d;
                            }
                        } else {
                            abyqVar = null;
                        }
                    } else {
                        abyqVar = null;
                    }
                } else {
                    abyqVar = null;
                }
            } else {
                abyqVar = null;
            }
            this.j = abyqVar;
            abyw abywVar = abytVar.c;
            if (abywVar == null) {
                abyxVarB = null;
            } else {
                abyxVarB = this.E.b(Arrays.asList(abywVar.a), Arrays.asList(abywVar.b), abywVar.c);
            }
            this.k = abyxVarB;
            abza abzaVar = abytVar.d;
            if (abzaVar == null) {
                abzcVar = null;
            } else {
                abzd abzdVar = this.l;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) abzdVar.a.io();
                scheduledExecutorService.getClass();
                zxj zxjVar = (zxj) abzdVar.b.io();
                zxjVar.getClass();
                zrx zrxVar = (zrx) abzdVar.c.io();
                zrxVar.getClass();
                mbc mbcVar = (mbc) abzdVar.d.io();
                mbcVar.getClass();
                tfq tfqVar = (tfq) abzdVar.e.io();
                tfqVar.getClass();
                abuz abuzVar = (abuz) abzdVar.g.io();
                abuzVar.getClass();
                zzj zzjVar = (zzj) abzdVar.h.io();
                zzjVar.getClass();
                tun tunVar = (tun) abzdVar.i.io();
                aawa aawaVar = (aawa) abzdVar.j.io();
                aawaVar.getClass();
                zwb zwbVar = (zwb) abzdVar.k.io();
                zwbVar.getClass();
                ci ciVar = (ci) abzdVar.l.io();
                ciVar.getClass();
                vyo vyoVar = (vyo) abzdVar.m.io();
                vyoVar.getClass();
                vxu vxuVar = (vxu) abzdVar.n.io();
                vxuVar.getClass();
                abmt abmtVar = (abmt) abzdVar.o.io();
                abmtVar.getClass();
                abnc abncVar = (abnc) abzdVar.p.io();
                abncVar.getClass();
                xeu xeuVar = (xeu) abzdVar.v.io();
                xeuVar.getClass();
                arif arifVar = (arif) abzdVar.r.io();
                abzj abzjVar = (abzj) abzdVar.s.io();
                abzjVar.getClass();
                tyw tywVar = (tyw) abzdVar.f.io();
                tywVar.getClass();
                Map map = (Map) ((aupo) abzdVar.w).b;
                map.getClass();
                abzcVar = new abzc(scheduledExecutorService, zxjVar, zrxVar, mbcVar, tfqVar, abuzVar, zzjVar, tunVar, aawaVar, zwbVar, ciVar, vyoVar, vxuVar, abmtVar, abncVar, xeuVar, arifVar, abzjVar, tywVar, map, abzdVar.x, abzaVar);
            }
            this.b = abzcVar;
            q();
            if (abmt.bt(this.n)) {
                abzg abzgVar = abytVar.f;
                if (abzgVar == null) {
                    abzhVar = null;
                } else {
                    abzi abziVar = this.m;
                    ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) abziVar.j.io();
                    scheduledExecutorService2.getClass();
                    tfq tfqVar2 = (tfq) abziVar.a.io();
                    tfqVar2.getClass();
                    tyw tywVar2 = (tyw) abziVar.k.io();
                    tywVar2.getClass();
                    mbc mbcVar2 = (mbc) abziVar.c.io();
                    mbcVar2.getClass();
                    xeu xeuVar2 = (xeu) abziVar.b.io();
                    xeuVar2.getClass();
                    abnc abncVar2 = (abnc) abziVar.e.io();
                    abncVar2.getClass();
                    arif arifVar2 = (arif) abziVar.l.io();
                    abmt abmtVar2 = (abmt) abziVar.f.io();
                    abmtVar2.getClass();
                    Map map2 = (Map) ((aupo) abziVar.h).b;
                    map2.getClass();
                    abzj abzjVar2 = (abzj) abziVar.m.io();
                    abzjVar2.getClass();
                    abzhVar = new abzh(scheduledExecutorService2, tfqVar2, tywVar2, mbcVar2, xeuVar2, abncVar2, arifVar2, abmtVar2, map2, abzjVar2, abzgVar);
                }
                this.c = abzhVar;
            }
            abzm abzmVar = abytVar.e;
            if (abzmVar == null) {
                abznVar = null;
            } else {
                abzo abzoVar = this.w;
                zxj zxjVar2 = (zxj) abzoVar.a.io();
                zxjVar2.getClass();
                Executor executor = (Executor) abzoVar.b.io();
                executor.getClass();
                ((Context) abzoVar.c.io()).getClass();
                ek ekVar = (ek) abzoVar.d.io();
                ekVar.getClass();
                zwb zwbVar2 = (zwb) abzoVar.e.io();
                zwbVar2.getClass();
                ci ciVar2 = (ci) abzoVar.f.io();
                ciVar2.getClass();
                tfq tfqVar3 = (tfq) abzoVar.g.io();
                tfqVar3.getClass();
                ztf ztfVar = (ztf) abzoVar.h.io();
                ztfVar.getClass();
                vxu vxuVar2 = (vxu) abzoVar.i.io();
                vxuVar2.getClass();
                acqf acqfVar = (acqf) abzoVar.j.io();
                acqfVar.getClass();
                abzq abzqVar = (abzq) abzoVar.k.io();
                abzqVar.getClass();
                abznVar = new abzn(zxjVar2, executor, ekVar, zwbVar2, ciVar2, tfqVar3, ztfVar, vxuVar2, acqfVar, abzqVar, abzmVar);
            }
            this.d = abznVar;
        }
    }

    private final void t() {
        abzc abzcVar = this.b;
        if (abzcVar != null) {
            abzcVar.u();
        }
        this.b = null;
        abzh abzhVar = this.c;
        if (abzhVar != null) {
            abzhVar.k();
        }
        this.c = null;
        this.d = null;
        this.j = null;
        this.k = null;
    }

    private static boolean u(wjf wjfVar) {
        return wjfVar.h().j != null;
    }

    private final boolean v(String str) {
        abyt abytVar = this.e;
        return abytVar != null && abytVar.a.equals(str);
    }

    public final abyt a() {
        abza abzaVar;
        abyt abytVar = this.e;
        String str = this.x;
        if (abytVar != null) {
            return abytVar;
        }
        if (str == null) {
            return null;
        }
        abzc abzcVar = this.b;
        if (abzcVar != null) {
            long j = abzcVar.s;
            long j2 = abzcVar.F;
            long j3 = abzcVar.u;
            long j4 = abzcVar.t;
            boolean z = abzcVar.v;
            boolean z2 = abzcVar.w;
            boolean z3 = abzcVar.x;
            boolean z4 = abzcVar.y;
            boolean z5 = abzcVar.A;
            boolean z6 = abzcVar.z;
            int i2 = abzcVar.B;
            int i3 = abzcVar.C;
            String str2 = abzcVar.D;
            float f = abzcVar.E;
            int i4 = abzcVar.r;
            int i5 = abzcVar.G;
            long j5 = abzcVar.H;
            Optional optional = abzcVar.U;
            int i6 = abzcVar.I;
            float f2 = abzcVar.J;
            String str3 = abzcVar.P;
            String str4 = abzcVar.Q;
            int i7 = abzcVar.O;
            boolean z7 = abzcVar.T;
            boolean z8 = abzcVar.S;
            String str5 = abzcVar.K;
            int[] iArr = abzcVar.q;
            int i8 = abzcVar.p;
            boolean z9 = abzcVar.L;
            boolean z10 = abzcVar.m;
            boolean z11 = abzcVar.l;
            boolean z12 = abzcVar.k;
            int i9 = abzcVar.j;
            String str6 = abzcVar.i;
            String str7 = abzcVar.h;
            String str8 = abzcVar.g;
            String str9 = abzcVar.f;
            long j6 = abzcVar.e;
            boolean z13 = abzcVar.d;
            abzaVar = new abza(abzcVar.a, abzcVar.b, abzcVar.c, z13, j6, j, j2, str9, str8, str7, str6, i9, j3, j4, z12, z11, z10, z, z2, z3, z4, z5, z9, z6, i2, i3, str2, f, i8, iArr, i4, str5, i5, j5, z8, z7, optional, i6, f2, i7, str3, str4);
        } else {
            abzaVar = null;
        }
        abzh abzhVar = this.c;
        abzg abzgVarA = abzhVar != null ? abzhVar.a() : null;
        abzn abznVar = this.d;
        abyq abyqVar = this.j;
        abyx abyxVar = this.k;
        return new abyt(str, abyqVar == null ? null : abyqVar.a(), abyxVar == null ? null : abyxVar.a(), abzaVar, abznVar == null ? null : new abzm(abznVar.c, abznVar.d, abznVar.e, abznVar.g, abznVar.k, abznVar.f), abzgVarA);
    }

    public final void b() {
        abzc abzcVar = this.b;
        if (abzcVar != null && this.f) {
            abzcVar.d();
        }
        abzh abzhVar = this.c;
        if (abzhVar != null) {
            mbc mbcVar = abzhVar.d;
            abzhVar.b(false, mbcVar.b());
            abzhVar.l(mbcVar.b());
        }
    }

    public final void c(aaxh aaxhVar) {
        if (this.o.bq() && aaxhVar != null) {
            this.C = aaxhVar;
        }
        abzc abzcVar = this.b;
        if (abzcVar != null && this.f) {
            abzcVar.e(aaxhVar);
        }
        abzh abzhVar = this.c;
        if (abzhVar != null) {
            float f = aaxhVar.c;
            if (abzhVar.m != f) {
                mbc mbcVar = abzhVar.d;
                abzhVar.b(false, mbcVar.b());
                abzhVar.m = f;
                if (abzhVar.B.bd()) {
                    Float f2 = aaxhVar.d;
                    if (f2 == null || f2.floatValue() == 0.0f) {
                        abzhVar.n = f;
                    } else {
                        abzhVar.n = f / f2.floatValue();
                    }
                }
                abzhVar.l(mbcVar.b());
            }
        }
    }

    public final void d(aaxo aaxoVar) {
        abzc abzcVar = this.b;
        if (abzcVar != null && this.f) {
            abzcVar.f(aaxoVar);
        }
        abzh abzhVar = this.c;
        if (abzhVar != null) {
            aaxo aaxoVar2 = abzhVar.t;
            if (aaxoVar2 != null) {
                if (aaxoVar2.a == aaxoVar.a) {
                    return;
                }
            }
            mbc mbcVar = abzhVar.d;
            abzhVar.b(false, mbcVar.b());
            abzhVar.t = aaxoVar;
            abzhVar.l(mbcVar.b());
        }
    }

    public final void e(aazb aazbVar) {
        if (aazbVar != null) {
            this.B = aazbVar;
        }
        abzc abzcVar = this.b;
        if (abzcVar != null && this.f) {
            abzcVar.g(aazbVar);
        }
        abzh abzhVar = this.c;
        if (abzhVar == null || TextUtils.equals(abzhVar.o, aazbVar.a())) {
            return;
        }
        if (abzhVar.i) {
            mbc mbcVar = abzhVar.d;
            abzhVar.b(false, mbcVar.b());
            abzhVar.l(mbcVar.b());
        }
        abzhVar.o = aazbVar.a();
    }

    public final void f() {
        abmt abmtVar = this.o;
        int i2 = 1;
        int i3 = 2;
        if (abmtVar.cj()) {
            this.t.C(new abyr(this.u.al(new abyr(this, i2), new abxq(i3)), 4));
        }
        int i4 = 0;
        int i5 = 3;
        if (!abmtVar.ck()) {
            if (abmtVar.cl()) {
                new avmm(this.q.al(new abyr(this, i5), new abxq(i3)));
            }
        } else {
            avmm avmmVar = new avmm(this.D.b().al(new abyr(this, 5), new abxq(i3)), this.r.al(new abyr(this, 6), new abxq(i3)), this.s.al(new abyr(this, 7), new abxq(i3)));
            if (abmtVar.cl()) {
                avmmVar.c(this.q.al(new abyr(this, i5), new abxq(i3)));
            } else {
                avmmVar.c(this.p.al(new abyr(this, i4), new abxq(i3)));
            }
            this.t.C(new abyr(avmmVar, i3));
        }
    }

    public final void g(yvu yvuVar) {
        if (yno.cw(yvuVar.j)) {
            abyq abyqVar = this.j;
            if (abyqVar != null) {
                abyqVar.b();
            }
            abzc abzcVar = this.b;
            if (abzcVar != null && this.f) {
                abzcVar.j(yvuVar);
            }
            abzh abzhVar = this.c;
            if (abzhVar != null) {
                abzhVar.e(yvuVar);
            }
        }
    }

    public final void h(String str, wjf wjfVar, String str2, int i2) {
        wjm wjmVar;
        if (this.z) {
            return;
        }
        this.z = true;
        if (v(wjfVar.G())) {
            if (!wjfVar.G().equals(this.x)) {
                s();
            }
        } else if (!TextUtils.isEmpty(wjfVar.G())) {
            wje wjeVarH = wjfVar.h();
            if (wjeVarH.e == null || wjeVarH.b == null) {
                ((agrc) ((agrc) i.c()).k("com/google/android/libraries/youtube/player/stats/PlaybackClientManager", "onPlayNewInterstitialVideo", 302, "PlaybackClientManager.java")).t("Missing QoE or Vss base url");
            } else {
                if (!wjfVar.f().aY()) {
                    this.k = this.E.b(wjeVarH.f, wjeVarH.g, str2);
                }
                this.b = this.l.a(str, wjfVar, str2, i2);
                q();
                if (abmt.bt(this.n) && u(wjfVar)) {
                    this.c = this.m.a(str, str2, i2, wjfVar);
                }
                if (wjfVar.w() != null && (wjmVar = wjeVarH.a) != null) {
                    this.d = this.w.a(wjfVar.w(), wjmVar, str2, wjfVar.G(), wjfVar.a());
                }
            }
        }
        this.e = null;
        this.x = wjfVar.G();
    }

    @tcc
    public void handleConnectivityChangedEvent(tfn tfnVar) {
        if (this.o.cj()) {
            return;
        }
        b();
    }

    @tcc
    public void handlePlaybackRateChangedEventWithEventBus(aaxh aaxhVar) {
        if (this.o.ck()) {
            return;
        }
        c(aaxhVar);
    }

    @tcc
    public void handlePlayerGeometryEventWithEventBus(aaxo aaxoVar) {
        if (this.o.ck()) {
            return;
        }
        d(aaxoVar);
    }

    @tcc
    public void handleStreamerUrlsExpiredEventWithEventBus(abmi abmiVar) {
        if (this.o.ck()) {
            return;
        }
        p();
    }

    @tcc
    public void handleSubtitleTrackChangedEventWithEventBus(aazb aazbVar) {
        abmt abmtVar = this.o;
        if (abmtVar.ck() || abmtVar.cl()) {
            return;
        }
        e(aazbVar);
    }

    @tcc
    public void handleUserinducedAudioOnlyEvent(aazg aazgVar) {
        aboa aboaVar;
        abzc abzcVar = this.b;
        if (abzcVar != null && this.f) {
            abzcVar.h(aazgVar);
        }
        abzh abzhVar = this.c;
        if (abzhVar == null || abzhVar.s == (aboaVar = aazgVar.a)) {
            return;
        }
        mbc mbcVar = abzhVar.d;
        abzhVar.b(false, mbcVar.b());
        abzhVar.s = aboaVar;
        abzhVar.l(mbcVar.b());
    }

    public final void i(String str, wjf wjfVar, int i2) {
        if (this.y) {
            return;
        }
        typ.f(str);
        this.y = true;
        String strG = wjfVar.G();
        if (!TextUtils.equals(strG, this.x)) {
            if (v(strG)) {
                s();
            } else if (!this.A) {
                wje wjeVarH = wjfVar.h();
                this.A = false;
                r(wjfVar, i2, str);
                if (!wjfVar.f().aY()) {
                    this.k = this.E.b(wjeVarH.f, wjeVarH.g, str);
                }
                if (this.b == null) {
                    this.b = this.l.a(null, wjfVar, str, i2);
                    q();
                }
                if (abmt.bt(this.n) && this.c == null && u(wjfVar)) {
                    this.c = this.m.a(null, str, i2, wjfVar);
                }
                if (wjfVar.w() != null) {
                    List list = wjeVarH.f;
                    this.d = this.w.a(wjfVar.w(), wjeVarH.a, str, wjfVar.G(), wjfVar.a());
                }
            }
        }
        this.x = strG;
        this.e = null;
    }

    public final void j(long j) {
        abzc abzcVar = this.b;
        if (abzcVar != null && this.f) {
            abzcVar.k(j);
        }
        abzn abznVar = this.d;
        if (abznVar != null) {
            abznVar.a();
        }
        abzh abzhVar = this.c;
        if (abzhVar != null) {
            if (abzhVar.A) {
                abzhVar.l = j;
            }
            abzhVar.b(true, abzhVar.d.b());
            abzhVar.v = true;
        }
        t();
    }

    public final void k(long j, String str, wjf wjfVar, int i2) {
        abyq abyqVar;
        if (this.b == null) {
            wje wjeVarH = wjfVar.h();
            if (wjeVarH.e == null || wjeVarH.b == null) {
                ((agrc) ((agrc) i.c()).k("com/google/android/libraries/youtube/player/stats/PlaybackClientManager", "maybeCreateVss2Client", 486, "PlaybackClientManager.java")).t("Missing QoE or Vss base url");
            } else {
                this.b = this.l.a(null, wjfVar, str, i2);
                q();
            }
        }
        if (!u(wjfVar)) {
            ((agrc) ((agrc) i.c()).k("com/google/android/libraries/youtube/player/stats/PlaybackClientManager", "maybeCreateVss3Client", 496, "PlaybackClientManager.java")).t("Missing Vss3Config");
        } else if (abmt.bt(this.n) && this.c == null) {
            this.c = this.m.a(null, str, i2, wjfVar);
        }
        abmt abmtVar = this.o;
        if (abmtVar.an()) {
            r(wjfVar, i2, str);
        }
        abzc abzcVar = this.b;
        if (abzcVar != null && this.f) {
            abzcVar.p(j);
        }
        abzh abzhVar = this.c;
        if (abzhVar != null) {
            abzhVar.h(j);
        }
        if (!abmtVar.an() || (abyqVar = this.j) == null) {
            return;
        }
        abyqVar.c();
    }

    public final void l() {
        abzc abzcVar = this.b;
        if (abzcVar != null && this.f) {
            abzcVar.r();
        }
        abzn abznVar = this.d;
        if (abznVar != null) {
            abznVar.a();
        }
        abzh abzhVar = this.c;
        if (abzhVar != null) {
            abzhVar.j();
        }
    }

    public final void m(long j, appa appaVar) {
        abzc abzcVar = this.b;
        if (abzcVar != null && this.f) {
            abzcVar.o(j, appaVar);
        }
        abzh abzhVar = this.c;
        if (abzhVar != null) {
            abzhVar.g(j, appaVar);
        }
    }

    public final void n(aazk aazkVar) {
        abyq abyqVar = this.j;
        if (abyqVar != null) {
            abyqVar.d(aazkVar);
        }
        abyx abyxVar = this.k;
        if (abyxVar != null) {
            abyxVar.c(aazkVar);
        }
        abzc abzcVar = this.b;
        if (abzcVar != null && this.f) {
            abzcVar.t(aazkVar);
        }
        abzn abznVar = this.d;
        if (abznVar != null && aazkVar.h && aazkVar.a >= ((long) abznVar.d.b(5)) * 1000) {
            abznVar.a();
        }
        abzh abzhVar = this.c;
        if (abzhVar != null) {
            long j = aazkVar.d;
            if (j > 0) {
                abzhVar.k = j;
            }
            if (!aazkVar.h) {
                ((agrc) ((agrc) abzh.a.c()).k("com/google/android/libraries/youtube/player/stats/VideoStats3Client", "onVideoTimeEvent", 1694, "VideoStats3Client.java")).w("Video time event received with event.hasPlaybackStarted=false. event: %s", aazkVar);
                return;
            }
            long j2 = aazkVar.a;
            long j3 = abzhVar.l;
            if (j2 < (-5000) + j3 || j2 > 5000 + j3) {
                ((agrc) ((agrc) abzh.a.c()).k("com/google/android/libraries/youtube/player/stats/VideoStats3Client", "onVideoTimeEvent", 1656, "VideoStats3Client.java")).z("Warning: unexpected playback progress %d for current playback position %d", j2, abzhVar.l);
                abzhVar.g(j2, appa.SEEK_SOURCE_UNKNOWN);
                return;
            }
            if (j2 >= j3) {
                if (abzhVar.f == null && !abzhVar.v) {
                    if (abzhVar.g) {
                        abzhVar.l(abzhVar.d.b());
                    } else if (!abzhVar.j) {
                        abzhVar.h(j3);
                    }
                }
                long j4 = abzhVar.p + (j2 - abzhVar.l);
                abzhVar.p = j4;
                abzhVar.l = j2;
                abzhVar.u = aazkVar.b - j2;
                if (!abzhVar.z) {
                    int i2 = abzhVar.x;
                    if (j4 >= ((long) i2) * 1000 && (i2 != 0 ? i2 != 0 : !(!abzhVar.y || !abzhVar.B.ah() || j4 <= 0))) {
                        abzhVar.z = true;
                    }
                }
                long j5 = abzhVar.p;
                int i3 = abzhVar.b.b;
                if (i3 != abzhVar.q && !abzhVar.n()) {
                    abzhVar.q = i3;
                    abzhVar.r = j5;
                }
                long j6 = j5 - abzhVar.r;
                if (!abzhVar.n() || j6 <= 2000) {
                    return;
                }
                abzhVar.r = -1L;
                abzhVar.q = i3;
                mbc mbcVar = abzhVar.d;
                abzhVar.b(false, mbcVar.b());
                abzhVar.l(mbcVar.b());
            }
        }
    }

    public final void o() {
        this.A = false;
        this.y = false;
        this.z = false;
        this.x = null;
        this.e = null;
        this.B = null;
        this.g = null;
        this.C = null;
        this.h = Optional.empty();
        t();
    }

    public final void p() {
        this.A = true;
    }
}
