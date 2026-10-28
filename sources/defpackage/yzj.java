package defpackage;

import android.os.SystemClock;
import com.google.android.libraries.youtube.media.interfaces.Time;
import com.google.protos.youtube.api.innertube.MediaCommonConfigOuterClass$MediaCommonConfig;
import com.google.protos.youtube.api.innertube.NextRequestPolicyOuterClass$NextRequestPolicy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yzj implements ccw {
    private long A;
    protected final yye a;
    protected final zjr b;
    protected ywn c = ywn.b;
    protected ywo d;
    protected ywo e;
    volatile boolean f;
    protected final tgr g;
    private crf h;
    private volatile long i;
    private volatile long j;
    private volatile long k;
    private int l;
    private int m;
    private final boolean n;
    private volatile long o;
    private boolean p;
    private boolean q;
    private boolean r;
    private final zeh s;
    private final zan t;
    private final btl u;
    private final btm v;
    private zcf w;
    private long x;
    private long y;
    private long z;

    public yzj(yye yyeVar, zjr zjrVar, tgr tgrVar, zeh zehVar, zan zanVar) {
        ywn ywnVar = this.c;
        this.d = new ywo(ywnVar);
        this.e = new ywo(ywnVar);
        this.j = 2500000L;
        this.k = 5000000L;
        this.u = new btl();
        this.v = new btm();
        this.w = null;
        this.x = -9223372036854775807L;
        this.y = 0L;
        this.z = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.a = yyeVar;
        this.b = zjrVar;
        this.g = tgrVar;
        this.n = zjrVar.R().n;
        this.s = zehVar;
        this.i = SystemClock.elapsedRealtime();
        zehVar.c();
        this.t = zanVar;
    }

    private static long q(wiu wiuVar) {
        if (wiuVar.F() == null || (wiuVar.F().b & 2) == 0) {
            return 60000L;
        }
        return wiuVar.F().c;
    }

    private final zcf r(btn btnVar, cnm cnmVar) {
        Object obj = cnmVar.a;
        btl btlVar = this.u;
        btnVar.m(obj, btlVar);
        int i = btlVar.c;
        btm btmVar = this.v;
        btnVar.e(i, btmVar, 0L);
        return zce.c(btmVar);
    }

    private final synchronized void s(boolean z) {
        crf crfVar;
        this.i = SystemClock.elapsedRealtime();
        this.s.c();
        this.l = 0;
        if (z) {
            synchronized (this) {
                try {
                    if (this.b.i.l(460, 45808739L, false) && (crfVar = this.h) != null) {
                        crfVar.i(0);
                        this.h.b();
                    }
                    this.h = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.x = -9223372036854775807L;
        this.y = 0L;
        this.z = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.s.d(null);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002e A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000c, B:6:0x0016, B:8:0x0021, B:12:0x002b, B:13:0x002e, B:20:0x003c, B:25:0x0044, B:29:0x0050, B:31:0x0056, B:32:0x005d), top: B:41:0x0001 }] */
    private final synchronized boolean t(wiu wiuVar, long j) {
        long j2;
        long j3;
        if (this.x == -9223372036854775807L) {
            this.x = bwp.y(q(wiuVar));
        }
        yye yyeVar = this.a;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zC = true;
        if (!yyeVar.i) {
            j2 = this.z;
            if (j2 == -9223372036854775807L) {
            }
            j3 = this.y;
            if (j3 > 0) {
            }
            return true;
        }
        long j4 = this.A;
        if (j4 == -9223372036854775807L || jElapsedRealtime <= j4) {
            j2 = this.z;
            if ((j2 == -9223372036854775807L && jElapsedRealtime < j2) || j > this.x) {
                return false;
            }
            j3 = this.y;
            if (j3 > 0 || j < j3) {
                return true;
            }
            zC = wiuVar.aP() ? this.g.c() : this.p;
        } else {
            this.A = -9223372036854775807L;
        }
        return zC;
    }

    @Override // defpackage.ccw
    public final /* bridge */ /* synthetic */ cra a(cfd cfdVar) {
        return o();
    }

    @Override // defpackage.ccw
    public final void b(cfd cfdVar) {
        wiu wiuVarA = this.a.a();
        this.j = ((long) wiuVarA.q()) * 1000;
        this.k = ((long) wiuVarA.s()) * 1000;
        s(false);
    }

    @Override // defpackage.ccw
    public final void c(cfd cfdVar) {
        s(true);
    }

    @Override // defpackage.ccw
    public final void d(cfd cfdVar) {
        s(true);
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0112  */
    /* JADX WARN: Code duplicated, block: B:83:0x0118 A[PHI: r3
      0x0118: PHI (r3v3 long) = (r3v2 long), (r3v10 long), (r3v10 long), (r3v10 long), (r3v10 long) binds: [B:82:0x0116, B:75:0x0107, B:79:0x010f, B:69:0x00f8, B:73:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x011a A[PHI: r3
      0x011a: PHI (r3v5 long) = (r3v2 long), (r3v10 long), (r3v10 long), (r3v10 long), (r3v10 long) binds: [B:82:0x0116, B:77:0x010b, B:79:0x010f, B:71:0x0100, B:73:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.ccw
    public final boolean e(ccv ccvVar) {
        long j;
        boolean z;
        boolean zT;
        zcf zcfVar = this.w;
        if (zcfVar != null && zcfVar.P) {
            return false;
        }
        long j2 = ccvVar.e;
        if (j2 < 500000) {
            this.p = true;
            return true;
        }
        boolean z2 = this.l != 0 && o().f() >= this.l;
        yye yyeVar = this.a;
        wiu wiuVarA = yyeVar.a();
        if (z2) {
            j = j2;
            zT = false;
        } else if (wiuVarA.am()) {
            zT = t(wiuVarA, j2);
            j = j2;
        } else {
            wiu wiuVarA2 = yyeVar.a();
            MediaCommonConfigOuterClass$MediaCommonConfig defaultInstance = yyeVar.a().d.e;
            if (defaultInstance == null) {
                defaultInstance = MediaCommonConfigOuterClass$MediaCommonConfig.getDefaultInstance();
            }
            akpa akpaVar = defaultInstance.c;
            if (akpaVar == null) {
                akpaVar = akpa.a;
            }
            int i = akpaVar.b;
            if (i == 0) {
                i = 120000;
            }
            aoqd aoqdVar = wiuVarA2.d;
            MediaCommonConfigOuterClass$MediaCommonConfig defaultInstance2 = aoqdVar.e;
            akpa akpaVar2 = (defaultInstance2 == null ? MediaCommonConfigOuterClass$MediaCommonConfig.getDefaultInstance() : defaultInstance2).c;
            if (akpaVar2 == null) {
                akpaVar2 = akpa.a;
            }
            int i2 = akpaVar2.c;
            int i3 = i2 != 0 ? i2 : 120000;
            if (defaultInstance2 == null) {
                defaultInstance2 = MediaCommonConfigOuterClass$MediaCommonConfig.getDefaultInstance();
            }
            akpa akpaVar3 = defaultInstance2.c;
            if (akpaVar3 == null) {
                akpaVar3 = akpa.a;
            }
            long jMin = Math.min(((long) i) * 1000, (((long) i3) * 1000) + (((long) akpaVar3.d) * (SystemClock.elapsedRealtime() - this.i)));
            MediaCommonConfigOuterClass$MediaCommonConfig defaultInstance3 = aoqdVar.e;
            if (defaultInstance3 == null) {
                defaultInstance3 = MediaCommonConfigOuterClass$MediaCommonConfig.getDefaultInstance();
            }
            akpa akpaVar4 = defaultInstance3.c;
            if (akpaVar4 == null) {
                akpaVar4 = akpa.a;
            }
            float f = akpaVar4.e;
            if (f > 0.0f) {
                float f2 = jMin;
                float fMin = f * f2;
                long jO = ((long) wiuVarA2.o()) * 1000;
                MediaCommonConfigOuterClass$MediaCommonConfig defaultInstance4 = aoqdVar.e;
                if (defaultInstance4 == null) {
                    defaultInstance4 = MediaCommonConfigOuterClass$MediaCommonConfig.getDefaultInstance();
                }
                akpa akpaVar5 = defaultInstance4.c;
                if (akpaVar5 == null) {
                    akpaVar5 = akpa.a;
                }
                long j3 = ((long) akpaVar5.f) * 1000;
                if (wiuVarA2.o() > 0) {
                    fMin = Math.min(fMin, jO);
                }
                if (fMin >= j3) {
                    j = j2;
                    float f3 = j;
                    float f4 = f2 + fMin;
                    float f5 = f2 - fMin;
                    if (!wiuVarA2.aP() ? !(f3 > f4 || (!this.p && f3 > f5)) : !(f3 > f4 || (!this.g.c() && f3 > f5))) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    j = j2;
                    if (j > jMin) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zT = !z;
            } else {
                j = j2;
                if (j > jMin) {
                    z = true;
                } else {
                    z = false;
                }
                zT = !z;
            }
        }
        if (this.n && (SystemClock.elapsedRealtime() - this.o < 15000 || this.r != zT || this.q != z2)) {
            this.e.a(Boolean.valueOf(zT), "scl." + z2 + '.' + this.l + '.' + j + '.' + zT + '.' + ccvVar.d);
            this.r = zT;
            this.q = z2;
        }
        this.p = zT;
        return zT;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e4  */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x00e4, please report this as an issue */
    @Override // defpackage.ccw
    public final boolean f(ccv ccvVar) {
        long j;
        long jS;
        zcf zcfVarR = r(ccvVar.b, ccvVar.c);
        boolean z = true;
        boolean z2 = zcfVarR != null && zcfVarR.P;
        boolean z3 = z2 && zcfVarR.Q;
        boolean z4 = this.n;
        if (z4) {
            this.c.w("lcsp", (true != z2 ? "0" : "1") + '.' + (true != z3 ? "0" : "1"));
        }
        if (z3) {
            zan zanVar = this.t;
            Time time = new Time(ccvVar.e, 1000000L);
            twv twvVar = ((yyr) zanVar).a.C;
            boolean z5 = twvVar != null && ((ytp) twvVar.io()).jx(time);
            if (z5 && this.f) {
                this.a.c().w("mvas", "end");
                this.f = false;
            }
            if (!z4) {
                return z5;
            }
            this.c.w("lcdi", "s.".concat(true == z5 ? "1" : "0"));
            return z5;
        }
        if (!this.f) {
            if (z2) {
                boolean z6 = ccvVar.g;
                wiu wiuVar = zcfVarR.y;
                jS = z6 ? wiuVar.s() : wiuVar.q();
            } else {
                j = ccvVar.g ? this.k : this.j;
            }
            if (j > 0 && ccvVar.e < j) {
                z = false;
            }
            if (z) {
                if (this.f) {
                    this.a.c().w("mvas", "end");
                }
                this.f = false;
            }
            if (z4) {
                this.d.a(Boolean.valueOf(z), "ssp." + ccvVar.e + '.' + ccvVar.g + '.' + j + '.' + z);
            }
            return z;
        }
        jS = this.b.i.d(18, 45621609L);
        j = jS * 1000;
        if (j > 0) {
            z = false;
        }
        if (z) {
            if (this.f) {
                this.a.c().w("mvas", "end");
            }
            this.f = false;
        }
        if (z4) {
            this.d.a(Boolean.valueOf(z), "ssp." + ccvVar.e + '.' + ccvVar.g + '.' + j + '.' + z);
        }
        return z;
    }

    @Override // defpackage.ccw
    public final long g() {
        return 0L;
    }

    @Override // defpackage.ccw
    public final void h(ccv ccvVar, cqs[] cqsVarArr) {
        cqs cqsVar;
        wiu wiuVarA;
        zcf zcfVarR = r(ccvVar.b, ccvVar.c);
        this.w = zcfVarR;
        if (zcfVarR == null || !zcfVarR.P) {
            if (cqsVarArr.length == 0 || (cqsVar = cqsVarArr[0]) == null) {
                wiuVarA = this.a.a();
            } else {
                Object objH = cqsVar.h();
                wiuVarA = objH instanceof zco ? ((zco) objH).a.y : this.a.a();
            }
            synchronized (this) {
                aoqd aoqdVar = wiuVarA.d;
                akwm akwmVar = aoqdVar.f;
                if (akwmVar == null) {
                    akwmVar = akwm.b;
                }
                int i = akwmVar.u;
                if (i == 0) {
                    i = 389;
                }
                akwm akwmVar2 = aoqdVar.f;
                if (akwmVar2 == null) {
                    akwmVar2 = akwm.b;
                }
                int i2 = akwmVar2.v;
                if (i2 == 0) {
                    i2 = 38;
                }
                int iH = ((i + i2) * wiuVarA.h()) << 10;
                this.m = iH;
                this.l = iH;
                o().i(this.l);
            }
        }
    }

    @Override // defpackage.ccw
    public final /* synthetic */ boolean i() {
        bvx.e("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    public final synchronized void k() {
        crf crfVar = this.h;
        if (crfVar != null) {
            this.l = 0;
            crfVar.i(0);
            this.h.b();
        }
    }

    public final void l(wiu wiuVar, ywn ywnVar) {
        this.j = ((long) wiuVar.q()) * 1000;
        this.k = ((long) wiuVar.s()) * 1000;
        this.c = ywnVar;
        this.d = new ywo(ywnVar);
        this.e = new ywo(ywnVar);
        zeh zehVar = this.s;
        zehVar.d = ywnVar;
        zehVar.g.set(-1L);
        zehVar.h.set(null);
        if (this.n) {
            this.o = SystemClock.elapsedRealtime();
        }
    }

    public final synchronized void m(NextRequestPolicyOuterClass$NextRequestPolicy nextRequestPolicyOuterClass$NextRequestPolicy) {
        this.x = bwp.y((nextRequestPolicyOuterClass$NextRequestPolicy.b & 2) != 0 ? nextRequestPolicyOuterClass$NextRequestPolicy.c : q(this.a.a()));
        this.y = bwp.y(nextRequestPolicyOuterClass$NextRequestPolicy.f);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = nextRequestPolicyOuterClass$NextRequestPolicy.d;
        long j = i > 0 ? ((long) i) + jElapsedRealtime : -9223372036854775807L;
        this.A = j;
        int i2 = nextRequestPolicyOuterClass$NextRequestPolicy.b;
        long j2 = (i2 & 8) != 0 ? jElapsedRealtime + ((long) nextRequestPolicyOuterClass$NextRequestPolicy.e) : -9223372036854775807L;
        this.z = j2;
        if (j != -9223372036854775807L && j2 > j) {
            this.z = j;
        }
        int i3 = i2 & 64;
        zeh zehVar = this.s;
        if (i3 != 0) {
            zehVar.d(nextRequestPolicyOuterClass$NextRequestPolicy.g);
        } else {
            zehVar.d(null);
        }
    }

    public final synchronized void n() {
        int i = this.m;
        if (i > 0 && this.l == 0) {
            this.l = i;
            crf crfVar = this.h;
            if (crfVar != null) {
                crfVar.i(i);
            }
        }
    }

    public final synchronized crf o() {
        crf crfVar;
        crfVar = this.h;
        if (crfVar == null) {
            yye yyeVar = this.a;
            yza yzaVar = yyeVar.a;
            crf crfVar2 = new crf(false, yyeVar.a().h() << 10);
            this.h = crfVar2;
            crfVar = crfVar2;
        }
        return crfVar;
    }

    public final synchronized void p() {
        this.i = SystemClock.elapsedRealtime();
        this.s.c();
        this.z = -9223372036854775807L;
    }

    @Override // defpackage.ccw
    public final void j() {
    }
}
