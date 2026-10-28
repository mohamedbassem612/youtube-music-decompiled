package defpackage;

import com.google.android.apps.youtube.proto.streaming.MediaCapabilitiesOuterClass$MediaCapabilities;
import com.google.protos.youtube.api.innertube.InnertubeDrmService$AuthorizedFormat;
import com.google.protos.youtube.api.innertube.MediaCommonConfigOuterClass$ServerPlaybackStartConfig;
import com.google.protos.youtube.api.innertube.MediaSource$MediaSourceInfo;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zcf {
    public volatile wja A;
    public volatile yxb B;
    public volatile zcd C;
    public volatile ArrayList D;
    public zco E;
    public wgs F;
    public int G;
    public final zjr H;
    public final jsk I;
    public final yxr J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public final boolean P;
    public final boolean Q;
    public agke R;
    public volatile zfp S;
    public volatile byte[] T;
    public volatile boolean U;
    public final boolean V;
    public volatile boolean W;
    public volatile boolean X;
    public volatile boolean Y;
    public final ywn Z;
    public final String a;
    public final cjz aa;
    public yvy ad;
    public volatile yxe ae;
    public final yyv af;
    public ywk ag;
    public final ablj ah;
    private MediaSource$MediaSourceInfo ai;
    private MediaSource$MediaSourceInfo aj;
    private final boolean ak;
    public final ywj b;
    public final yxi c;
    public final zcm d;
    public final long e;
    public final long f;
    public volatile long g;
    public int j;
    public cno k;
    public zcf m;
    public int o;
    public wgs q;
    wgs r;
    public volatile String s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public volatile zfc x;
    public volatile wiu y;
    public boolean z;
    public volatile appa h = appa.SEEK_SOURCE_UNKNOWN;
    public int i = 0;
    public long l = -1;
    public long n = -1;
    public volatile float p = 1.0f;
    public volatile zch ab = zch.a;
    public final Map ac = new ConcurrentHashMap();
    private final AtomicReference al = new AtomicReference(zjv.a);

    public zcf(yyv yyvVar, ywk ywkVar, zfc zfcVar, zcd zcdVar, ScheduledExecutorService scheduledExecutorService, zjr zjrVar, cjz cjzVar, boolean z, jsk jskVar) {
        boolean z2 = false;
        this.o = 0;
        this.D = new ArrayList();
        this.R = agpi.a;
        this.a = ywkVar.h;
        this.ag = ywkVar;
        this.y = ywkVar.i;
        this.b = new ywq(ywkVar.b);
        yxi yxiVar = ywkVar.t;
        this.c = yxiVar;
        this.A = ywkVar.d;
        this.B = ywkVar.k;
        this.x = zfcVar;
        this.C = zcdVar;
        this.af = yyvVar;
        zkf.d(zjrVar);
        this.H = zjrVar;
        this.V = zjrVar.cv();
        this.ak = zjrVar.i.m(527, 45857071L);
        ywn ywnVar = ywkVar.a;
        this.Z = ywnVar;
        this.S = ywkVar.p;
        this.T = ywkVar.q;
        this.d = new zcm(this, scheduledExecutorService);
        this.P = z;
        if (z && zjrVar.W().d) {
            MediaCommonConfigOuterClass$ServerPlaybackStartConfig mediaCommonConfigOuterClass$ServerPlaybackStartConfig = this.y.E().j;
            if ((mediaCommonConfigOuterClass$ServerPlaybackStartConfig == null ? MediaCommonConfigOuterClass$ServerPlaybackStartConfig.getDefaultInstance() : mediaCommonConfigOuterClass$ServerPlaybackStartConfig).b) {
                z2 = true;
            }
        }
        this.Q = z2;
        this.aa = cjzVar;
        this.e = ywkVar.f;
        this.f = ywkVar.g;
        this.I = jskVar;
        this.g = zjrVar.v();
        this.ah = new ablj(zjrVar, ywkVar.b);
        this.ad = zik.aH().a();
        String str = this.A.g;
        vnn vnnVar = new vnn(this, 11);
        wiu wiuVar = this.y;
        wiuVar.getClass();
        vnn vnnVar2 = new vnn(wiuVar, 12);
        ywj ywjVar = ywkVar.b;
        ywjVar.getClass();
        this.J = new yxr(vnnVar, vnnVar2, new vnn(ywjVar, 13));
        if (zjrVar.aF()) {
            ywnVar.w("ctype", jskVar == null ? "null" : jskVar instanceof ygd ? "noopytm" : jskVar instanceof ygu ? "ytm" : "simple");
        }
        wja wjaVar = this.A;
        if (yxiVar != null) {
            this.D = w(wjaVar.t, yxiVar.bu());
        }
        this.ae = ywkVar.v;
        this.o = ywkVar.n;
        this.R = wjaVar.n();
        p(1);
    }

    public static ArrayList w(List list, acca accaVar) {
        return accaVar == null ? new ArrayList() : (ArrayList) Collection.EL.stream(list).filter(new aaep(1)).filter(new xdo(accaVar, 11)).map(new yom(7)).collect(Collectors.toCollection(new yoj(3)));
    }

    private final void x(yog yogVar, int i, yus yusVar, String str, yvv yvvVar, yvy yvyVar) {
        wgs wgsVar;
        wgs wgsVar2 = this.F;
        wgs wgsVar3 = this.q;
        wiw[] wiwVarArrO = c().o();
        wgo[] wgoVarArrM = c().m();
        yyv yyvVar = this.af;
        yvt yvtVarA = yvt.a(yyvVar.d(), yyvVar.e(), yyvVar.q());
        String strI = null;
        if (this.H.cV() && (wgsVar = this.F) != null) {
            strI = i(wgsVar.f);
        }
        int i2 = yusVar.c;
        this.b.j(new yvu(wgsVar2, wgsVar3, null, wiwVarArrO, wgoVarArrM, yogVar, i, yusVar.b, i2, yvtVarA, str, strI, yvvVar, yvyVar));
    }

    public final long a() {
        zjr zjrVar = this.H;
        long j = this.g;
        return j == zjrVar.v() ? zjrVar.v() : j * 1000;
    }

    public final MediaCapabilitiesOuterClass$MediaCapabilities b() {
        if (this.C.b() == zcc.b) {
            return this.C.c().k;
        }
        return null;
    }

    public final synchronized yoe c() {
        return this.C.d();
    }

    public final synchronized zco d() {
        return this.E;
    }

    public final zcp e() {
        return this.ab.c;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final zjv f() {
        return (zjv) this.al.get();
    }

    public final zjv g() {
        int iOrdinal = this.C.b().ordinal();
        if (iOrdinal == 0) {
            return (zjv) this.C.a().b.b;
        }
        if (iOrdinal != 1) {
            throw new AssertionError(this.C.b());
        }
        zcp zcpVar = this.ab.c;
        if (zcpVar != null) {
            return ((zbv) zcpVar).a;
        }
        return null;
    }

    public final zsf h() {
        return this.P ? zsf.d : zsf.c;
    }

    public final String i(String str) {
        if (str == null) {
            return null;
        }
        return (String) this.ac.get(str);
    }

    public final synchronized String j() {
        return this.A.g;
    }

    public final void k(String str, boolean z, zco zcoVar, int i, String str2, yvv yvvVar) {
        yvv yvvVar2;
        int i2;
        int i3;
        yvv yvvVar3 = yvvVar;
        wgs wgsVar = (wgs) this.A.t().get(str);
        if (wgsVar != null) {
            if (wgsVar.af()) {
                if (this.H.ev()) {
                    if (yvvVar3 != null) {
                        this.aj = yvvVar3.a;
                    } else {
                        yvvVar3 = null;
                    }
                }
                wgs wgsVar2 = this.F;
                int i4 = 3;
                if (wgsVar2 != null && wgsVar2.equals(wgsVar)) {
                    if (i == 0 || i == 3) {
                        return;
                    }
                    p(i);
                    return;
                }
                if (i != 0) {
                    if (i != 3) {
                        i3 = i;
                        i4 = i3;
                    } else if (this.F == null) {
                        i3 = 3;
                    } else {
                        i3 = 3;
                    }
                    this.F = wgsVar;
                    p(i4);
                    yvv yvvVar4 = yvvVar3;
                    i2 = i3;
                    yvvVar2 = yvvVar4;
                } else {
                    i3 = 0;
                }
                if (!this.v) {
                    i4 = 1;
                }
                this.F = wgsVar;
                p(i4);
                yvv yvvVar5 = yvvVar3;
                i2 = i3;
                yvvVar2 = yvvVar5;
            } else {
                if (wgsVar.I()) {
                    if (this.H.ev()) {
                        if (yvvVar3 != null) {
                            this.ai = yvvVar3.b;
                        } else {
                            yvvVar3 = null;
                        }
                    }
                    if (!t(wgsVar)) {
                        return;
                    }
                }
                yvvVar2 = yvvVar3;
                i2 = i;
            }
            if (this.t) {
                boolean z2 = (z && c().k()) ? false : true;
                if (this.r == null && !z2 && this.C.b() == zcc.a) {
                    this.r = this.C.a().a.d;
                }
                synchronized (this) {
                    this.E = zcoVar;
                }
                if (this.q != null && (this.F != null || z2)) {
                    this.v = true;
                    x(c().c(), i2, zcoVar.d, str2, this.H.ev() ? new yvv(this.aj, this.ai) : yvvVar2, this.ad);
                }
                if (this.H.ex()) {
                    l(zcoVar.c);
                }
            }
        }
    }

    public final void l(zjv zjvVar) {
        if (zjvVar == null) {
            zjvVar = zjv.a;
        }
        this.al.set(zjvVar);
    }

    public final void m(long j, appa appaVar) {
        zjr zjrVar = this.H;
        if (!zjrVar.l.m(0, 45617183L) || j >= 0 || j == zjrVar.v()) {
            this.g = j;
            this.h = appaVar;
        }
    }

    public final synchronized void n(zcb zcbVar) {
        this.C = new zby(zcbVar);
    }

    public final void o(yop yopVar) {
        this.C = new zbz(yopVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    final void p(int i) {
        zjr zjrVar = this.H;
        if (zjrVar.i.m(511, 45844128L)) {
            String strCv = null;
            if (yno.cv(i) != null) {
                yoe yoeVarC = c();
                zkd zkdVar = zjrVar.u;
                arfb arfbVarF = zkdVar != null ? zkdVar.f(this.a) : null;
                if (arfbVarF == arfb.VIDEO_QUALITY_SETTING_DATA_SAVER) {
                    strCv = "z";
                } else if (arfbVarF == arfb.VIDEO_QUALITY_SETTING_HIGHER_QUALITY) {
                    strCv = "q";
                } else {
                    yog yogVarC = i != 10002 ? yoeVarC.c() : null;
                    if (yogVarC == null) {
                        if (i == 10000) {
                            strCv = "a";
                        } else {
                            strCv = yno.cv(i);
                        }
                    } else if (yogVarC.d()) {
                        strCv = "s";
                    } else if (yogVarC.e()) {
                        strCv = "m";
                    } else if (i == 10000) {
                        strCv = "a";
                    } else {
                        strCv = yno.cv(i);
                    }
                }
            }
            this.s = strCv;
        }
    }

    public final boolean q() {
        return u() && !this.D.isEmpty();
    }

    public final boolean r() {
        agke agkeVar = this.R;
        int size = agkeVar.size();
        for (int i = 0; i < size; i++) {
            InnertubeDrmService$AuthorizedFormat innertubeDrmService$AuthorizedFormat = (InnertubeDrmService$AuthorizedFormat) agkeVar.get(i);
            akvr akvrVarA = akvr.a(innertubeDrmService$AuthorizedFormat.c);
            if (akvrVarA == null) {
                akvrVarA = akvr.DRM_TRACK_TYPE_UNSPECIFIED;
            }
            if (akvrVarA != akvr.DRM_TRACK_TYPE_AUDIO && !innertubeDrmService$AuthorizedFormat.e) {
                return true;
            }
        }
        return false;
    }

    public final boolean s() {
        if (!this.H.R().y || !this.A.E()) {
            return false;
        }
        wgs wgsVar = this.F;
        if (wgsVar == null && this.A.v.size() == 1) {
            wgsVar = (wgs) this.A.v.get(0);
        }
        return (wgsVar == null || this.af.S.f(wgsVar)) ? false : true;
    }

    public final boolean t(wgs wgsVar) {
        if (Objects.equals(this.q, wgsVar)) {
            return false;
        }
        this.q = wgsVar;
        yyv yyvVar = this.af;
        yye yyeVar = yyvVar.h;
        zjr zjrVar = yyeVar.d;
        if (zjrVar.cz()) {
            this.ad = yyvVar.V.s(this, zjrVar, yyvVar.E, true);
        }
        if (equals(yyeVar.m)) {
            yyvVar.O(yyvVar.E);
        }
        return true;
    }

    public final boolean u() {
        if (this.y.at()) {
            return true;
        }
        if (this.P) {
            boolean z = this.ak;
            wja wjaVar = this.A;
            if (z) {
                if (wjaVar.D()) {
                    return true;
                }
            } else if (wjaVar.B()) {
                return true;
            }
        }
        return false;
    }

    public final void v(zjr zjrVar, tfq tfqVar, zkj zkjVar, int i, boolean z) {
        zco zcoVar = this.E;
        if (zcoVar == null || !this.t) {
            return;
        }
        yus yusVar = zcoVar.d;
        if (i == 0) {
            x(c().c(), i, yusVar, null, null, this.ad);
            return;
        }
        wgs wgsVar = null;
        boolean z2 = false;
        if (i == 1) {
            z2 = (z && c().k()) ? false : true;
            if (this.q != null) {
                if (this.F == null) {
                    if (!z2) {
                        return;
                    } else {
                        z2 = true;
                    }
                }
                if (this.v) {
                    return;
                }
                p(i);
                wgs wgsVar2 = this.F;
                if (wgsVar2 != null) {
                    this.F = (wgs) this.A.t().get(wgsVar2.f);
                }
                if (!z2 && this.C.b() != zcc.b) {
                    wgsVar = this.C.a().a.d;
                }
                this.r = wgsVar;
                this.v = true;
                x(c().c(), i, yusVar, null, new yvv(this.aj, this.ai), this.ad);
                return;
            }
            return;
        }
        if (i != 10001) {
            if (i == 10002) {
                this.r = null;
                this.F = null;
                if (this.q != null) {
                    x(yog.a, i, this.E.d, null, null, this.ad);
                }
                p(i);
                return;
            }
            return;
        }
        if (this.C.b().ordinal() == 0) {
            yod yodVar = this.C.a().a;
            zco zcoVar2 = this.E;
            if (zcoVar2 == null || this.F == null || this.q == null) {
                return;
            }
            wgs[] wgsVarArr = yodVar.c;
            int iA = tfqVar.a();
            List listAsList = Arrays.asList(yodVar.b);
            yog yogVar = yodVar.g;
            wgs wgsVarE = yos.e(listAsList, yogVar, tfqVar, this.y, zjrVar, wgsVarArr.length != 0 ? wgsVarArr[0].g : 0, zkjVar.c, zkjVar.d, this.y.g(), this.y.d(), iA, zjrVar.u.f(this.a));
            boolean z3 = wgsVarE == null;
            wgs wgsVar3 = this.r;
            boolean z4 = wgsVar3 == null;
            if (wgsVarE != null && wgsVar3 != null && wgsVar3.e() != wgsVarE.e()) {
                z2 = true;
            }
            if ((z3 ^ z4) || z2) {
                yus yusVar2 = zcoVar2.d;
                this.r = wgsVarE;
                x(yogVar, i, yusVar2, null, null, this.ad);
            }
        }
    }
}
