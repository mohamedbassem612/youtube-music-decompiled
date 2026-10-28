package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abzh {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/player/stats/VideoStats3Client");
    public final boolean A;
    public final abmt B;
    public int C;
    public aihf D;
    private final xeu E;
    private final abzj F;
    private arjb G;
    private final boolean H;
    private int I;
    private int J;
    private final aigj K;
    private final boolean L;
    private final Map M;
    private final avmm N;
    private arif O;
    private final long P;
    private final ScheduledExecutorService Q;
    private long R;
    private int S;
    private int T;
    private long U;
    private final String V;
    private final String W;
    private final String X;
    private Optional Y;
    private appa Z;
    private final boolean aa;
    private final boolean ab;
    private final boolean ac;
    private boolean ad;
    private String ae;
    private String af;
    private final int ag;
    private boolean ah;
    private final boolean ai;
    private final boolean aj;
    private final String ak;
    private final tfq al;
    private int am;
    private aihf an;
    public final tyw b;
    public final wjn c;
    public final mbc d;
    public final Runnable e;
    public ScheduledFuture f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public float m;
    public float n;
    public String o;
    public long p;
    public int q;
    public long r;
    public aboa s;
    public aaxo t;
    public long u;
    public boolean v;
    public Optional w;
    public final int x;
    public final boolean y;
    public boolean z;

    public abzh(ScheduledExecutorService scheduledExecutorService, tfq tfqVar, xeu xeuVar, tyw tywVar, mbc mbcVar, arif arifVar, abmt abmtVar, Map map, abzj abzjVar, String str, String str2, String str3, String str4, float f, float f2, long j, String str5, Optional optional, appa appaVar, int i, int i2, long j2, boolean z, boolean z2, boolean z3, boolean z4, int i3, int i4, aboa aboaVar, aaxo aaxoVar, wjn wjnVar, boolean z5, long j3, aihf aihfVar, aihf aihfVar2, arjb arjbVar, long j4, boolean z6, boolean z7, int i5, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i6, String str6, String str7) {
        this.am = 1;
        this.N = new avmm();
        this.e = new abyz(this, 2);
        this.f = null;
        this.w = Optional.empty();
        this.ae = "";
        this.af = "";
        this.Q = scheduledExecutorService;
        this.al = tfqVar;
        this.E = xeuVar;
        this.b = tywVar;
        this.d = mbcVar;
        this.O = arifVar;
        this.B = abmtVar;
        this.F = abzjVar;
        this.V = str;
        this.W = str2;
        this.X = str3;
        int i7 = typ.a;
        this.ak = str4;
        this.m = f;
        this.n = f2;
        this.k = j;
        this.o = str5;
        this.Y = optional;
        this.Z = appaVar;
        this.x = i;
        this.q = i2;
        this.r = j2;
        this.h = z;
        this.aa = z2;
        this.y = z3;
        this.ab = z4;
        this.S = i3;
        this.T = i4;
        this.s = aboaVar;
        this.t = aaxoVar;
        this.p = 0L;
        this.c = wjnVar;
        this.v = z5;
        this.P = j3;
        this.an = aihfVar;
        this.D = aihfVar2;
        this.G = arjbVar;
        boolean zL = abmtVar.g.l(500, 45839393L, false);
        this.H = zL;
        if (zL) {
            if (arjbVar != null) {
                int iBi = a.bi(arjbVar.l);
                this.am = iBi != 0 ? iBi : 1;
                if ((arjbVar.b & 32) != 0) {
                    arja arjaVar = arjbVar.i;
                    arjaVar = arjaVar == null ? arja.a : arjaVar;
                    this.I = arjaVar.c;
                    this.J = arjaVar.g;
                }
            } else {
                this.am = 10;
            }
        }
        this.R = j4;
        this.K = wjnVar.f;
        this.L = wjnVar.a;
        this.ac = z6;
        this.ad = z7;
        this.C = i5;
        this.ai = z8;
        this.A = z9;
        this.aj = z10;
        this.z = z11;
        this.ah = z12;
        this.ag = i6;
        this.ae = typ.c(str6);
        this.af = typ.c(str7);
        tywVar.b();
        this.M = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            this.M.put((String) entry.getKey(), (abyl) ((awmd) entry.getValue()).io());
        }
    }

    public static boolean m(int i) {
        return i == 0;
    }

    private static float o(long j) {
        return (float) ((((j + 50) / 100) * 100) / 1000.0d);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0035 A[Catch: all -> 0x0070, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:7:0x000a, B:9:0x000e, B:34:0x0051, B:36:0x0059, B:38:0x0065, B:39:0x0068, B:12:0x0015, B:14:0x001d, B:16:0x0023, B:17:0x0025, B:19:0x0029, B:21:0x002f, B:22:0x0031, B:25:0x0035, B:27:0x003d, B:30:0x0049), top: B:46:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0068 A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:7:0x000a, B:9:0x000e, B:34:0x0051, B:36:0x0059, B:38:0x0065, B:39:0x0068, B:12:0x0015, B:14:0x001d, B:16:0x0023, B:17:0x0025, B:19:0x0029, B:21:0x002f, B:22:0x0031, B:25:0x0035, B:27:0x003d, B:30:0x0049), top: B:46:0x0001 }] */
    private final synchronized int p(long j) {
        int iBi;
        int i;
        if (this.H) {
            i = this.J;
            if (i <= 0 && (this.am != 3 || (i = this.c.e) <= 0)) {
            }
        } else if (this.G.isInitialized()) {
            arja arjaVar = this.G.i;
            if (arjaVar == null) {
                arjaVar = arja.a;
            }
            if (arjaVar.g > 0) {
                arja arjaVar2 = this.G.i;
                if (arjaVar2 == null) {
                    arjaVar2 = arja.a;
                }
                i = arjaVar2.g;
            } else if (this.G.isInitialized()) {
            }
        } else if (this.G.isInitialized() || (iBi = a.bi(this.G.l)) == 0 || iBi != 3 || (i = this.c.e) <= 0) {
        }
        long j2 = this.U;
        if (j2 > 0) {
            long j3 = j - j2;
            wjn wjnVar = this.c;
            if (((int) o(j3)) < wjnVar.d) {
                i = wjnVar.c;
            } else {
                i = this.c.b;
            }
        } else {
            i = this.c.b;
        }
        return i;
    }

    private final long q() {
        abmt abmtVar = this.B;
        boolean z = this.ab;
        vyo vyoVar = abmtVar.a;
        long j = this.l;
        long j2 = this.k;
        if (!abmt.by(z, vyoVar) || j <= j2 || j2 <= 0) {
            return j;
        }
        ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/player/stats/VideoStats3Client", "getCurrentPlaybackPosition", 1715, "VideoStats3Client.java")).z("Reported playback position %d is greater than the duration of the video %d", j, j2);
        return j2;
    }

    private final synchronized void r() {
        ScheduledFuture scheduledFuture = this.f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f = null;
        }
    }

    private final synchronized void s(long j) {
        aihf aihfVar = this.an;
        if (!((arja) aihfVar.instance).d) {
            arjb arjbVar = (arjb) this.D.instance;
            if ((arjbVar.b & SemanticState.Hidden) != 0) {
                int iBi = a.bi(arjbVar.l);
                if (iBi == 0) {
                    iBi = 1;
                }
                if (iBi == 3) {
                    int i = this.c.e;
                    aihfVar.copyOnWrite();
                    arja arjaVar = (arja) aihfVar.instance;
                    arjaVar.b |= 32;
                    arjaVar.g = i;
                    return;
                }
                if (iBi != 7 && iBi != 9) {
                    long j2 = this.U;
                    if (j2 > 0) {
                        long j3 = j - j2;
                        wjn wjnVar = this.c;
                        int i2 = wjnVar.c;
                        if (i2 > 0) {
                            if (((int) o(j3)) < wjnVar.d) {
                                aihfVar.copyOnWrite();
                                arja arjaVar2 = (arja) aihfVar.instance;
                                arjaVar2.b |= 32;
                                arjaVar2.g = i2;
                                return;
                            }
                        }
                        int i3 = wjnVar.b;
                        aihfVar.copyOnWrite();
                        arja arjaVar3 = (arja) aihfVar.instance;
                        arjaVar3.b |= 32;
                        arjaVar3.g = i3;
                    }
                }
            }
        }
    }

    private final void t() {
        aihf aihfVar = this.an;
        aihfVar.copyOnWrite();
        arja arjaVar = (arja) aihfVar.instance;
        arja arjaVar2 = arja.a;
        arjaVar.b |= 64;
        arjaVar.h = this.L;
        aihf aihfVar2 = this.D;
        aihfVar2.copyOnWrite();
        arjb arjbVar = (arjb) aihfVar2.instance;
        arjb arjbVar2 = arjb.a;
        String str = this.V;
        str.getClass();
        arjbVar.b |= 1;
        arjbVar.d = str;
        aihfVar2.copyOnWrite();
        arjb arjbVar3 = (arjb) aihfVar2.instance;
        String str2 = this.W;
        str2.getClass();
        arjbVar3.b |= 2;
        arjbVar3.e = str2;
        ajuf ajufVar = ajuf.values()[this.al.a()];
        aihfVar2.copyOnWrite();
        arjb arjbVar4 = (arjb) aihfVar2.instance;
        arjbVar4.n = ajufVar.p;
        arjbVar4.b |= SemanticState.ReadOnly;
        float fO = o(this.k);
        aihfVar2.copyOnWrite();
        arjb arjbVar5 = (arjb) aihfVar2.instance;
        arjbVar5.b |= 16;
        arjbVar5.h = fO;
        int i = this.b.b;
        aihfVar2.copyOnWrite();
        arjb arjbVar6 = (arjb) aihfVar2.instance;
        arjbVar6.b |= SemanticState.Obscured;
        arjbVar6.p = i;
        aihfVar2.copyOnWrite();
        arjb arjbVar7 = (arjb) aihfVar2.instance;
        aigj aigjVar = this.K;
        aigjVar.getClass();
        arjbVar7.b |= 64;
        arjbVar7.j = aigjVar;
        abzj abzjVar = this.F;
        String str3 = abzjVar.a;
        if (!TextUtils.equals("-", str3)) {
            aihf aihfVar3 = this.D;
            aihfVar3.copyOnWrite();
            arjb arjbVar8 = (arjb) aihfVar3.instance;
            str3.getClass();
            arjbVar8.b |= 524288;
            arjbVar8.v = str3;
        }
        String str4 = abzjVar.b;
        if (!TextUtils.equals("-", str4)) {
            try {
                aihf aihfVar4 = this.D;
                aigj aigjVarV = aigj.v(Base64.decode(str4, 11));
                aihfVar4.copyOnWrite();
                arjb arjbVar9 = (arjb) aihfVar4.instance;
                aigjVarV.getClass();
                arjbVar9.b |= 1048576;
                arjbVar9.w = aigjVarV;
            } catch (IllegalArgumentException e) {
                ((agrc) ((agrc) ((agrc) a.c()).j(e)).k("com/google/android/libraries/youtube/player/stats/VideoStats3Client", "fillStaticWatchTimeSegmentFields", (char) 1220, "VideoStats3Client.java")).w("Failed to decode account link state (als): %s", str4);
            }
        }
        String str5 = this.X;
        if (!TextUtils.isEmpty(str5)) {
            aihf aihfVar5 = this.D;
            aihfVar5.copyOnWrite();
            arjb arjbVar10 = (arjb) aihfVar5.instance;
            str5.getClass();
            arjbVar10.b |= 536870912;
            arjbVar10.B = str5;
        }
        if (this.s == aboa.IS_UAO) {
            aihf aihfVar6 = this.D;
            aihfVar6.copyOnWrite();
            arjb arjbVar11 = (arjb) aihfVar6.instance;
            arjbVar11.b |= SemanticState.Multiline;
            arjbVar11.q = true;
        }
        if (this.h) {
            aihf aihfVar7 = this.D;
            aihfVar7.copyOnWrite();
            arjb arjbVar12 = (arjb) aihfVar7.instance;
            arjbVar12.b |= 16384;
            arjbVar12.r = true;
        }
        int i2 = this.t.a.i;
        if (i2 != abnr.REMOTE.i) {
            aihf aihfVar8 = this.D;
            int i3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 32}[i2];
            aihfVar8.copyOnWrite();
            arjb arjbVar13 = (arjb) aihfVar8.instance;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            arjbVar13.o = i4;
            arjbVar13.b |= SemanticState.Modal;
        }
        arif arifVar = this.O;
        if (arifVar != null && (arifVar.b & 1) != 0) {
            aihf aihfVar9 = this.D;
            aigj aigjVarX = aigj.x(arifVar.c);
            aihfVar9.copyOnWrite();
            arjb arjbVar14 = (arjb) aihfVar9.instance;
            aigjVarX.getClass();
            arjbVar14.b |= SemanticState.Focused;
            arjbVar14.k = aigjVarX;
        }
        int i5 = this.S;
        if (i5 > 0) {
            aihf aihfVar10 = this.D;
            aihfVar10.copyOnWrite();
            arjb arjbVar15 = (arjb) aihfVar10.instance;
            arjbVar15.b |= 1073741824;
            arjbVar15.C = i5;
        }
        int i6 = this.T;
        if (i6 > 0) {
            aihf aihfVar11 = this.D;
            aihfVar11.copyOnWrite();
            arjb arjbVar16 = (arjb) aihfVar11.instance;
            arjbVar16.b |= Integer.MIN_VALUE;
            arjbVar16.D = i6;
        }
        Iterator it = this.M.values().iterator();
        while (it.hasNext()) {
            ((abyl) it.next()).c();
        }
        int i7 = this.ag;
        if (i7 == 0) {
            aihf aihfVar12 = this.D;
            aihfVar12.copyOnWrite();
            arjb arjbVar17 = (arjb) aihfVar12.instance;
            arjbVar17.E = 1;
            arjbVar17.c |= 1;
        } else if (i7 == 1) {
            aihf aihfVar13 = this.D;
            aihfVar13.copyOnWrite();
            arjb arjbVar18 = (arjb) aihfVar13.instance;
            arjbVar18.E = 3;
            arjbVar18.c |= 1;
        } else if (i7 == 2) {
            aihf aihfVar14 = this.D;
            aihfVar14.copyOnWrite();
            arjb arjbVar19 = (arjb) aihfVar14.instance;
            arjbVar19.E = 2;
            arjbVar19.c |= 1;
        }
        String str6 = this.ak;
        if (!TextUtils.isEmpty(str6)) {
            aihf aihfVar15 = this.D;
            aihfVar15.copyOnWrite();
            arjb arjbVar20 = (arjb) aihfVar15.instance;
            str6.getClass();
            arjbVar20.c |= 2;
            arjbVar20.F = str6;
        }
        if (!TextUtils.isEmpty(this.ae)) {
            aihf aihfVar16 = this.D;
            String str7 = this.ae;
            aihfVar16.copyOnWrite();
            arjb arjbVar21 = (arjb) aihfVar16.instance;
            str7.getClass();
            arjbVar21.c |= 4;
            arjbVar21.G = str7;
        }
        if (TextUtils.isEmpty(this.af)) {
            return;
        }
        aihf aihfVar17 = this.D;
        String str8 = this.af;
        aihfVar17.copyOnWrite();
        arjb arjbVar22 = (arjb) aihfVar17.instance;
        str8.getClass();
        arjbVar22.c |= 8;
        arjbVar22.H = str8;
    }

    private final synchronized void u(int i) {
        try {
            if (i <= 0) {
                ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/player/stats/VideoStats3Client", "startMaxSegmentLengthTimerMillis", 1402, "VideoStats3Client.java")).u("ERROR: maxSegmentLengthMillis %d <= 0 and cannot be scheduled", i);
                return;
            }
            if (this.f == null) {
                long j = i;
                this.f = this.Q.scheduleAtFixedRate(this.e, j, j, TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void v(long j) {
        this.R = j;
        aihf aihfVarCreateBuilder = arjb.a.createBuilder();
        float fO = o(q());
        aihfVarCreateBuilder.copyOnWrite();
        arjb arjbVar = (arjb) aihfVarCreateBuilder.instance;
        arjbVar.b |= 4;
        arjbVar.f = fO;
        this.D = aihfVarCreateBuilder;
        arja arjaVar = arja.a;
        aihf aihfVarCreateBuilder2 = arjaVar.createBuilder();
        this.an = aihfVarCreateBuilder2;
        if (this.H) {
            int i = this.J;
            if (i > 0) {
                aihfVarCreateBuilder2.copyOnWrite();
                arja arjaVar2 = (arja) aihfVarCreateBuilder2.instance;
                arjaVar2.b |= 16;
                arjaVar2.f = i;
            }
        } else {
            arjb arjbVar2 = this.G;
            if ((arjbVar2.b & 32) != 0) {
                arja arjaVar3 = arjbVar2.i;
                if (arjaVar3 != null) {
                    arjaVar = arjaVar3;
                }
                int i2 = arjaVar.g;
                if (i2 > 0) {
                    aihf aihfVar = this.an;
                    aihfVar.copyOnWrite();
                    arja arjaVar4 = (arja) aihfVar.instance;
                    arjaVar4.b |= 16;
                    arjaVar4.f = i2;
                }
            }
        }
        u(p(j) * 1000);
        this.C = 2;
        this.i = true;
        t();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002b A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:7:0x0007, B:12:0x0013, B:14:0x001b, B:16:0x0022, B:18:0x002b), top: B:26:0x0005 }] */
    private final synchronized int w(long j, boolean z, int i) {
        int i2;
        i2 = 0;
        if (!z) {
            try {
                if (i == 3) {
                    i2 = this.c.e;
                } else if (i != 7 && i != 9) {
                    long j2 = this.U;
                    if (j2 > 0) {
                        long j3 = j - j2;
                        wjn wjnVar = this.c;
                        i2 = wjnVar.c;
                        if (i2 > 0) {
                            if (((int) o(j3)) >= wjnVar.d) {
                                i2 = wjnVar.b;
                            }
                        } else {
                            i2 = wjnVar.b;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i2;
    }

    public final synchronized abzg a() {
        arjb arjbVar;
        arjbVar = this.G;
        if (this.H && this.I > 0) {
            aihf aihfVarCreateBuilder = arja.a.createBuilder();
            int i = this.I;
            aihfVarCreateBuilder.copyOnWrite();
            arja arjaVar = (arja) aihfVarCreateBuilder.instance;
            arjaVar.b |= 1;
            arjaVar.c = i;
            int i2 = this.J;
            if (i2 > 0) {
                aihfVarCreateBuilder.copyOnWrite();
                arja arjaVar2 = (arja) aihfVarCreateBuilder.instance;
                arjaVar2.b |= 32;
                arjaVar2.g = i2;
            }
            aihf aihfVarCreateBuilder2 = arjb.a.createBuilder();
            int i3 = this.am;
            aihfVarCreateBuilder2.copyOnWrite();
            arjb arjbVar2 = (arjb) aihfVarCreateBuilder2.instance;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            arjbVar2.l = i4;
            arjbVar2.b |= SemanticState.Hidden;
            arja arjaVar3 = (arja) aihfVarCreateBuilder.build();
            aihfVarCreateBuilder2.copyOnWrite();
            arjb arjbVar3 = (arjb) aihfVarCreateBuilder2.instance;
            arjaVar3.getClass();
            arjbVar3.i = arjaVar3;
            arjbVar3.b |= 32;
            arjbVar = (arjb) aihfVarCreateBuilder2.build();
        }
        return new abzg(this.l, this.k, this.W, this.V, this.X, this.ak, this.p, this.h, this.m, this.n, this.q, this.r, this.o, this.Y, this.Z, this.x, this.z, this.ah, this.aa, this.y, this.ab, this.S, this.T, this.u, this.ag, this.c, this.v, this.P, this.an, this.D, arjbVar, this.R, this.ac, this.ad, this.C, this.ai, this.A, this.aj, this.ae, this.af);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        if (r19.v != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void b(boolean r20, long r21) {
        /*
            Method dump skipped, instruction units count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abzh.b(boolean, long):void");
    }

    public final synchronized void c(aawv aawvVar) {
        String str = ((aawp) aawvVar).a;
        int i = typ.a;
        String str2 = this.ae;
        String strC = typ.c(str);
        boolean zEquals = TextUtils.equals(str2, strC);
        String str3 = this.af;
        String strC2 = typ.c(((aawp) aawvVar).b);
        boolean zEquals2 = TextUtils.equals(str3, strC2);
        if (!zEquals) {
            long jB = this.d.b();
            if (this.i) {
                b(false, jB);
            }
            this.ae = strC;
            this.af = strC2;
            l(jB);
        } else if (!zEquals2) {
            this.af = strC2;
        }
    }

    public final synchronized void d() {
        if (this.v) {
            r();
            return;
        }
        mbc mbcVar = this.d;
        b(false, mbcVar.b());
        l(mbcVar.b());
    }

    public final synchronized void e(yvu yvuVar) {
        wgs wgsVar = yvuVar.c;
        int iE = wgsVar == null ? 0 : wgsVar.e();
        wgs wgsVar2 = yvuVar.f;
        int iE2 = wgsVar2 == null ? 0 : wgsVar2.e();
        boolean z = true;
        boolean z2 = (this.S == iE && this.T == iE2) ? false : true;
        String strV = wgsVar2 != null ? wgsVar2.v() : null;
        boolean z3 = (!this.Y.isPresent() || strV == null || ((String) this.Y.get()).equals(strV)) ? false : true;
        if (!this.i || (!z2 && !z3)) {
            z = false;
        }
        if (z) {
            b(false, this.d.b());
        }
        this.S = iE;
        this.T = iE2;
        if (z3) {
            this.Y = Optional.ofNullable(strV);
        }
        if (z) {
            l(this.d.b());
        }
    }

    public final synchronized void f() {
        this.g = false;
        this.C = 7;
        b(false, this.d.b());
        r();
    }

    public final synchronized void g(long j, appa appaVar) {
        this.C = 6;
        mbc mbcVar = this.d;
        b(false, mbcVar.b());
        this.l = j;
        this.Z = appaVar;
        l(mbcVar.b());
    }

    public final synchronized void h(long j) {
        if (this.g) {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/player/stats/VideoStats3Client", "onPlaybackStartedOrResumed", 861, "VideoStats3Client.java")).v("Warning: unexpected playback play %d suppressed", j);
            return;
        }
        long jB = this.d.b();
        this.g = true;
        if (!this.j) {
            this.j = true;
            this.U = jB;
        }
        this.C = 2;
        this.l = j;
        this.Z = appa.SEEK_SOURCE_UNKNOWN;
        avmm avmmVar = this.N;
        avmmVar.b();
        Map map = this.M;
        if (!map.isEmpty()) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                avmmVar.c(((abyl) it.next()).a().al(new abyr(this, 9), new abxq(4)));
            }
        }
        l(jB);
    }

    public final synchronized void i(long j) {
        if (this.g) {
            if (this.aj) {
                this.l = j;
            }
            this.C = 9;
            b(false, this.d.b());
            this.g = false;
        }
    }

    public final synchronized void j() {
        this.C = 9;
        b(false, this.d.b());
    }

    public final synchronized void k() {
        if (this.ad) {
            new Exception();
            return;
        }
        if (this.i) {
            new Exception();
            j();
        }
        this.ad = true;
        this.b.c();
        this.N.dispose();
    }

    public final synchronized void l(long j) {
        if (this.g && !this.i) {
            v(j);
        }
    }

    public final boolean n() {
        return this.r != -1;
    }

    public abzh(ScheduledExecutorService scheduledExecutorService, tfq tfqVar, tyw tywVar, mbc mbcVar, xeu xeuVar, abnc abncVar, arif arifVar, abmt abmtVar, Map map, abzj abzjVar, abzg abzgVar) {
        this(scheduledExecutorService, tfqVar, xeuVar, tywVar, mbcVar, arifVar, abmtVar, map, abzjVar, abzgVar.d, abzgVar.c, abzgVar.e, abzgVar.f, abzgVar.k, abzgVar.l, abzgVar.b, abzgVar.m, abzgVar.n, abzgVar.o, abzgVar.p, abzgVar.i, abzgVar.j, abzgVar.h, abzgVar.s, abzgVar.t, abzgVar.x, abzgVar.u, abzgVar.v, abncVar.r, abncVar.c(), abzgVar.y, abzgVar.z, abzgVar.A, abzgVar.L, abzgVar.M, abzgVar.B, abzgVar.C, abzgVar.D, abzgVar.E, abzgVar.K, abzgVar.F, abzgVar.G, abzgVar.H, abzgVar.q, abzgVar.r, abzgVar.w, abzgVar.I, abzgVar.J);
        this.p = abzgVar.g;
    }
}
