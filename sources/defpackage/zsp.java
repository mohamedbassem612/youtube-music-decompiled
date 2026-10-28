package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class zsp extends ztq {
    private boolean A;
    private boolean B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private boolean S;
    private int T;
    private int U;
    private int V;
    private int W;
    private int X;
    private int Y;
    private int Z;
    public ahbo a;
    private int aA;
    private int aB;
    private int aC;
    private int aD;
    private int aE;
    private int aF;
    private int aG;
    private int aH;
    private int aI;
    private long aJ;
    private int aK;
    private int aL = -1;
    private int aM = -1;
    private int aN = 524287;
    private long aa;
    private long ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private int ai;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private boolean an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private int as;
    private int at;
    private int au;
    private int av;
    private int aw;
    private int ax;
    private int ay;
    private int az;
    public ahbo b;
    public ahbn c;
    public ahbo d;
    public ahbo e;
    public ahbo f;
    private int g;
    private int h;
    private int i;
    private int j;
    private double k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public zsp(ztr ztrVar) {
        this.g = ztrVar.a;
        this.h = ztrVar.b;
        this.i = ztrVar.c;
        this.j = ztrVar.d;
        this.k = ztrVar.e;
        this.l = ztrVar.f;
        this.m = ztrVar.g;
        this.n = ztrVar.h;
        this.o = ztrVar.i;
        this.p = ztrVar.j;
        this.q = ztrVar.k;
        this.r = ztrVar.l;
        this.s = ztrVar.m;
        this.t = ztrVar.n;
        this.u = ztrVar.o;
        this.v = ztrVar.p;
        this.w = ztrVar.q;
        this.x = ztrVar.r;
        this.y = ztrVar.s;
        this.z = ztrVar.t;
        this.A = ztrVar.u;
        this.B = ztrVar.v;
        this.a = ztrVar.w;
        this.b = ztrVar.x;
        this.c = ztrVar.y;
        this.C = ztrVar.z;
        this.D = ztrVar.A;
        this.E = ztrVar.B;
        this.F = ztrVar.C;
        this.G = ztrVar.D;
        this.H = ztrVar.E;
        this.I = ztrVar.F;
        this.J = ztrVar.G;
        this.K = ztrVar.H;
        this.L = ztrVar.I;
        this.M = ztrVar.J;
        this.N = ztrVar.K;
        this.O = ztrVar.L;
        this.P = ztrVar.M;
        this.Q = ztrVar.N;
        this.R = ztrVar.O;
        this.S = ztrVar.P;
        this.T = ztrVar.Q;
        this.U = ztrVar.R;
        this.V = ztrVar.S;
        this.W = ztrVar.T;
        this.d = ztrVar.U;
        this.e = ztrVar.V;
        this.X = ztrVar.W;
        this.Y = ztrVar.X;
        this.f = ztrVar.Y;
        this.Z = ztrVar.Z;
        this.aa = ztrVar.aa;
        this.ab = ztrVar.ab;
        this.ac = ztrVar.ac;
        this.ad = ztrVar.ad;
        this.ae = ztrVar.ae;
        this.af = ztrVar.af;
        this.ag = ztrVar.ag;
        this.ah = ztrVar.ah;
        this.ai = ztrVar.ai;
        this.aj = ztrVar.aj;
        this.ak = ztrVar.ak;
        this.al = ztrVar.al;
        this.am = ztrVar.am;
        this.an = ztrVar.an;
        this.ao = ztrVar.ao;
        this.ap = ztrVar.ap;
        this.aq = ztrVar.aq;
        this.ar = ztrVar.ar;
        this.as = ztrVar.as;
        this.at = ztrVar.at;
        this.au = ztrVar.au;
        this.av = ztrVar.av;
        this.aw = ztrVar.aw;
        this.ax = ztrVar.ax;
        this.ay = ztrVar.ay;
        this.az = ztrVar.az;
        this.aA = ztrVar.aA;
        this.aB = ztrVar.aB;
        this.aC = ztrVar.aC;
        this.aD = ztrVar.aD;
        this.aE = ztrVar.aE;
        this.aF = ztrVar.aF;
        this.aG = ztrVar.aG;
        this.aH = ztrVar.aH;
        this.aI = ztrVar.aI;
        this.aJ = ztrVar.aJ;
        this.aK = ztrVar.aK;
    }

    @Override // defpackage.ztq
    public final int A() {
        if ((this.aL & SemanticState.Modal) != 0) {
            return this.r;
        }
        throw new IllegalStateException("Property \"maxPagesInRamBoostBehind\" has not been set");
    }

    @Override // defpackage.ztq
    public final int B() {
        if ((this.aL & SemanticState.ReadOnly) != 0) {
            return this.q;
        }
        throw new IllegalStateException("Property \"maxPagesInRamBoostDispatchAll\" has not been set");
    }

    @Override // defpackage.ztq
    public final int C() {
        if ((this.aL & 32) != 0) {
            return this.l;
        }
        throw new IllegalStateException("Property \"maxPagesInRamDuringBoot\" has not been set");
    }

    @Override // defpackage.ztq
    public final int D() {
        if ((this.aL & SemanticState.Hidden) != 0) {
            return this.o;
        }
        throw new IllegalStateException("Property \"maxPagesOnDisk\" has not been set");
    }

    @Override // defpackage.ztq
    public final int E() {
        if ((this.aL & SemanticState.LiveRegion) != 0) {
            return this.p;
        }
        throw new IllegalStateException("Property \"maxPagesOnDiskLowSpace\" has not been set");
    }

    @Override // defpackage.ztq
    public final int F() {
        if ((this.aM & SemanticState.Multiline) != 0) {
            return this.Z;
        }
        throw new IllegalStateException("Property \"maxResponseTimeoutMs\" has not been set");
    }

    @Override // defpackage.ztq
    public final int G() {
        if ((this.aL & 16777216) != 0) {
            return this.E;
        }
        throw new IllegalStateException("Property \"maxRetryInFlight\" has not been set");
    }

    @Override // defpackage.ztq
    public final int H() {
        if ((this.aL & 1073741824) != 0) {
            return this.K;
        }
        throw new IllegalStateException("Property \"maxRetryInFlightBadNet\" has not been set");
    }

    @Override // defpackage.ztq
    public final int I() {
        if ((this.aM & 4) != 0) {
            return this.O;
        }
        throw new IllegalStateException("Property \"maxRetryInFlightBehind\" has not been set");
    }

    @Override // defpackage.ztq
    public final int J() {
        if ((this.aM & 32) != 0) {
            return this.R;
        }
        throw new IllegalStateException("Property \"maxRetryInFlightDispatchAll\" has not been set");
    }

    @Override // defpackage.ztq
    public final int K() {
        if ((this.aL & 134217728) != 0) {
            return this.H;
        }
        throw new IllegalStateException("Property \"maxRetryInFlightTurtle\" has not been set");
    }

    @Override // defpackage.ztq
    public final int L() {
        if ((this.aL & 8388608) != 0) {
            return this.D;
        }
        throw new IllegalStateException("Property \"maxStaleInFlight\" has not been set");
    }

    @Override // defpackage.ztq
    public final int M() {
        if ((this.aL & 536870912) != 0) {
            return this.J;
        }
        throw new IllegalStateException("Property \"maxStaleInFlightBadNet\" has not been set");
    }

    @Override // defpackage.ztq
    public final int N() {
        if ((this.aM & 1) != 0) {
            return this.M;
        }
        throw new IllegalStateException("Property \"maxStaleInFlightBehind\" has not been set");
    }

    @Override // defpackage.ztq
    public final int O() {
        if ((this.aL & 67108864) != 0) {
            return this.G;
        }
        throw new IllegalStateException("Property \"maxStaleInFlightTurtle\" has not been set");
    }

    @Override // defpackage.ztq
    public final int P() {
        if ((this.aM & SemanticState.Modal) != 0) {
            return this.X;
        }
        throw new IllegalStateException("Property \"minEventCount\" has not been set");
    }

    @Override // defpackage.ztq
    public final int Q() {
        if ((this.aL & SemanticState.Focused) != 0) {
            return this.n;
        }
        throw new IllegalStateException("Property \"minPagesInRamTurtle\" has not been set");
    }

    @Override // defpackage.ztq
    public final int R() {
        if ((this.aM & SemanticState.ReadOnly) != 0) {
            return this.W;
        }
        throw new IllegalStateException("Property \"minSpaceBeforeAttemptingDispatchCreation\" has not been set");
    }

    @Override // defpackage.ztq
    public final int S() {
        if ((this.aN & 65536) != 0) {
            return this.aI;
        }
        throw new IllegalStateException("Property \"netHealthDispatchableFailRate\" has not been set");
    }

    @Override // defpackage.ztq
    public final int T() {
        if ((this.aN & 32768) != 0) {
            return this.aH;
        }
        throw new IllegalStateException("Property \"netHealthFailRateMinDataPoints\" has not been set");
    }

    @Override // defpackage.ztq
    public final int U() {
        if ((this.aN & SemanticState.Modal) != 0) {
            return this.aD;
        }
        throw new IllegalStateException("Property \"netHealthGoodDataSecs\" has not been set");
    }

    @Override // defpackage.ztq
    public final int V() {
        if ((this.aN & 16384) != 0) {
            return this.aG;
        }
        throw new IllegalStateException("Property \"netHealthManySuccess\" has not been set");
    }

    @Override // defpackage.ztq
    public final int W() {
        if ((this.aN & SemanticState.Obscured) != 0) {
            return this.aE;
        }
        throw new IllegalStateException("Property \"netHealthNewFailSecs\" has not been set");
    }

    @Override // defpackage.ztq
    public final int X() {
        if ((this.aN & SemanticState.ReadOnly) != 0) {
            return this.aC;
        }
        throw new IllegalStateException("Property \"netHealthObservationGranularitySecs\" has not been set");
    }

    @Override // defpackage.ztq
    public final int Y() {
        if ((this.aN & SemanticState.LiveRegion) != 0) {
            return this.aB;
        }
        throw new IllegalStateException("Property \"netHealthObservationWindowSecs\" has not been set");
    }

    @Override // defpackage.ztq
    public final int Z() {
        if ((this.aN & SemanticState.Multiline) != 0) {
            return this.aF;
        }
        throw new IllegalStateException("Property \"netHealthSomeSuccess\" has not been set");
    }

    @Override // defpackage.ztq
    public final double a() {
        if ((this.aL & 16) != 0) {
            return this.k;
        }
        throw new IllegalStateException("Property \"estimatedCompressionRatio\" has not been set");
    }

    @Override // defpackage.ztq
    public final ahbo aA() {
        ahbo ahboVar = this.d;
        if (ahboVar != null) {
            return ahboVar;
        }
        throw new IllegalStateException("Property \"maxEventCount\" has not been set");
    }

    @Override // defpackage.ztq
    public final ahbo aB() {
        ahbo ahboVar = this.f;
        if (ahboVar != null) {
            return ahboVar;
        }
        throw new IllegalStateException("Property \"maxRetryCount\" has not been set");
    }

    @Override // defpackage.ztq
    public final ahbo aC() {
        ahbo ahboVar = this.a;
        if (ahboVar != null) {
            return ahboVar;
        }
        throw new IllegalStateException("Property \"maxRetryDelaySec\" has not been set");
    }

    @Override // defpackage.ztq
    public final ahbo aD() {
        ahbo ahboVar = this.b;
        if (ahboVar != null) {
            return ahboVar;
        }
        throw new IllegalStateException("Property \"minRetryDelaySec\" has not been set");
    }

    @Override // defpackage.ztq
    public final void aE(int i) {
        this.am = i;
        this.aM |= 67108864;
    }

    @Override // defpackage.ztq
    public final void aF(int i) {
        this.aA = i;
        this.aN |= SemanticState.Hidden;
    }

    @Override // defpackage.ztq
    public final void aG(int i) {
        this.ay = i;
        this.aN |= 64;
    }

    @Override // defpackage.ztq
    public final void aH(int i) {
        this.az = i;
        this.aN |= SemanticState.Focused;
    }

    @Override // defpackage.ztq
    public final void aI(int i) {
        this.aK = i;
        this.aN |= 262144;
    }

    @Override // defpackage.ztq
    public final void aJ(int i) {
        this.U = i;
        this.aM |= SemanticState.Hidden;
    }

    @Override // defpackage.ztq
    public final void aK(int i) {
        this.T = i;
        this.aM |= SemanticState.Focused;
    }

    @Override // defpackage.ztq
    public final void aL(boolean z) {
        this.an = z;
        this.aM |= 134217728;
    }

    @Override // defpackage.ztq
    public final void aM(double d) {
        this.k = d;
        this.aL |= 16;
    }

    @Override // defpackage.ztq
    public final void aN(int i) {
        this.j = i;
        this.aL |= 8;
    }

    @Override // defpackage.ztq
    public final void aO(int i) {
        this.ar = i;
        this.aM |= Integer.MIN_VALUE;
    }

    @Override // defpackage.ztq
    public final void aP(int i) {
        this.ah = i;
        this.aM |= 2097152;
    }

    @Override // defpackage.ztq
    public final void aQ(boolean z) {
        this.w = z;
        this.aL |= 65536;
    }

    @Override // defpackage.ztq
    public final void aR(boolean z) {
        this.x = z;
        this.aL |= 131072;
    }

    @Override // defpackage.ztq
    public final void aS(int i) {
        this.N = i;
        this.aM |= 2;
    }

    @Override // defpackage.ztq
    public final void aT(boolean z) {
        this.y = z;
        this.aL |= 262144;
    }

    @Override // defpackage.ztq
    public final void aU(long j) {
        this.aJ = j;
        this.aN |= 131072;
    }

    @Override // defpackage.ztq
    public final void aV(int i) {
        this.s = i;
        this.aL |= SemanticState.Obscured;
    }

    @Override // defpackage.ztq
    public final void aW(int i) {
        this.t = i;
        this.aL |= SemanticState.Multiline;
    }

    @Override // defpackage.ztq
    public final void aX(int i) {
        this.V = i;
        this.aM |= SemanticState.LiveRegion;
    }

    @Override // defpackage.ztq
    public final void aY(ahbo ahboVar) {
        this.e = ahboVar;
    }

    @Override // defpackage.ztq
    public final void aZ(int i) {
        this.u = i;
        this.aL |= 16384;
    }

    @Override // defpackage.ztq
    public final int aa() {
        if ((this.aM & 16777216) != 0) {
            return this.ak;
        }
        throw new IllegalStateException("Property \"offlineLongMs\" has not been set");
    }

    @Override // defpackage.ztq
    public final int ab() {
        if ((this.aM & 33554432) != 0) {
            return this.al;
        }
        throw new IllegalStateException("Property \"offlineRecentlyMs\" has not been set");
    }

    @Override // defpackage.ztq
    public final int ac() {
        if ((this.aM & 8388608) != 0) {
            return this.aj;
        }
        throw new IllegalStateException("Property \"oldPageWakeupMs\" has not been set");
    }

    @Override // defpackage.ztq
    public final int ad() {
        if ((this.aM & 1048576) != 0) {
            return this.ag;
        }
        throw new IllegalStateException("Property \"periodicTaskDespamMs\" has not been set");
    }

    @Override // defpackage.ztq
    public final int ae() {
        if ((this.aM & 524288) != 0) {
            return this.af;
        }
        throw new IllegalStateException("Property \"responseTimeoutDespamMs\" has not been set");
    }

    @Override // defpackage.ztq
    public final int af() {
        if ((this.aM & 8) != 0) {
            return this.P;
        }
        throw new IllegalStateException("Property \"retryInFlightBehindThreshold\" has not been set");
    }

    @Override // defpackage.ztq
    public final int ag() {
        if ((this.aM & 536870912) != 0) {
            return this.ap;
        }
        throw new IllegalStateException("Property \"shutdownLikelyMask\" has not been set");
    }

    @Override // defpackage.ztq
    public final int ah() {
        if ((this.aM & 262144) != 0) {
            return this.ae;
        }
        throw new IllegalStateException("Property \"stackDespamMs\" has not been set");
    }

    @Override // defpackage.ztq
    public final int ai() {
        if ((this.aM & 4194304) != 0) {
            return this.ai;
        }
        throw new IllegalStateException("Property \"staleDispatchMs\" has not been set");
    }

    @Override // defpackage.ztq
    public final int aj() {
        if ((this.aN & 4) != 0) {
            return this.au;
        }
        throw new IllegalStateException("Property \"turtleCooldownSec\" has not been set");
    }

    @Override // defpackage.ztq
    public final int ak() {
        if ((this.aM & 268435456) != 0) {
            return this.ao;
        }
        throw new IllegalStateException("Property \"turtleMask\" has not been set");
    }

    @Override // defpackage.ztq
    public final int al() {
        if ((this.aN & 1) != 0) {
            return this.as;
        }
        throw new IllegalStateException("Property \"turtleMaxPercent\" has not been set");
    }

    @Override // defpackage.ztq
    public final int am() {
        if ((this.aN & 2) != 0) {
            return this.at;
        }
        throw new IllegalStateException("Property \"turtleWindowSec\" has not been set");
    }

    @Override // defpackage.ztq
    public final int an() {
        if ((this.aL & 2) != 0) {
            return this.h;
        }
        throw new IllegalStateException("Property \"workManagerLowPriorityTaskIntervalSecs\" has not been set");
    }

    @Override // defpackage.ztq
    public final int ao() {
        if ((this.aL & 4) != 0) {
            return this.i;
        }
        throw new IllegalStateException("Property \"workManagerLowPriorityThreshold\" has not been set");
    }

    @Override // defpackage.ztq
    public final int ap() {
        if ((this.aL & 1) != 0) {
            return this.g;
        }
        throw new IllegalStateException("Property \"workManagerTaskIntervalSecs\" has not been set");
    }

    @Override // defpackage.ztq
    public final int aq() {
        if ((this.aN & 32) != 0) {
            return this.ax;
        }
        throw new IllegalStateException("Property \"xtraNoDispatchCooldownSec\" has not been set");
    }

    @Override // defpackage.ztq
    public final int ar() {
        if ((this.aM & 1073741824) != 0) {
            return this.aq;
        }
        throw new IllegalStateException("Property \"xtraNoDispatchMask\" has not been set");
    }

    @Override // defpackage.ztq
    public final int as() {
        if ((this.aN & 8) != 0) {
            return this.av;
        }
        throw new IllegalStateException("Property \"xtraNoDispatchMaxPercent\" has not been set");
    }

    @Override // defpackage.ztq
    public final int at() {
        if ((this.aN & 16) != 0) {
            return this.aw;
        }
        throw new IllegalStateException("Property \"xtraNoDispatchWindowSec\" has not been set");
    }

    @Override // defpackage.ztq
    public final long au() {
        if ((this.aN & 131072) != 0) {
            return this.aJ;
        }
        throw new IllegalStateException("Property \"lowDiskSpaceThresholdBytes\" has not been set");
    }

    @Override // defpackage.ztq
    public final long av() {
        if ((this.aM & 16384) != 0) {
            return this.aa;
        }
        throw new IllegalStateException("Property \"maxEventAgeMs\" has not been set");
    }

    @Override // defpackage.ztq
    public final long aw() {
        if ((this.aM & 32768) != 0) {
            return this.ab;
        }
        throw new IllegalStateException("Property \"maxWaitToSendMs\" has not been set");
    }

    @Override // defpackage.ztq
    public final ztr ax() {
        ahbo ahboVar;
        ahbo ahboVar2;
        ahbn ahbnVar;
        ahbo ahboVar3;
        ahbo ahboVar4;
        ahbo ahboVar5;
        if (this.aL == -1 && this.aM == -1 && this.aN == 524287 && (ahboVar = this.a) != null && (ahboVar2 = this.b) != null && (ahbnVar = this.c) != null && (ahboVar3 = this.d) != null && (ahboVar4 = this.e) != null && (ahboVar5 = this.f) != null) {
            return new ztr(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, ahboVar, ahboVar2, ahbnVar, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, ahboVar3, ahboVar4, this.X, this.Y, ahboVar5, this.Z, this.aa, this.ab, this.ac, this.ad, this.ae, this.af, this.ag, this.ah, this.ai, this.aj, this.ak, this.al, this.am, this.an, this.ao, this.ap, this.aq, this.ar, this.as, this.at, this.au, this.av, this.aw, this.ax, this.ay, this.az, this.aA, this.aB, this.aC, this.aD, this.aE, this.aF, this.aG, this.aH, this.aI, this.aJ, this.aK);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.aL & 1) == 0) {
            sb.append(" workManagerTaskIntervalSecs");
        }
        if ((this.aL & 2) == 0) {
            sb.append(" workManagerLowPriorityTaskIntervalSecs");
        }
        if ((this.aL & 4) == 0) {
            sb.append(" workManagerLowPriorityThreshold");
        }
        if ((this.aL & 8) == 0) {
            sb.append(" eventCompressionThresholdBytes");
        }
        if ((this.aL & 16) == 0) {
            sb.append(" estimatedCompressionRatio");
        }
        if ((this.aL & 32) == 0) {
            sb.append(" maxPagesInRamDuringBoot");
        }
        if ((this.aL & 64) == 0) {
            sb.append(" maxPagesInRamAfterBoot");
        }
        if ((this.aL & SemanticState.Focused) == 0) {
            sb.append(" minPagesInRamTurtle");
        }
        if ((this.aL & SemanticState.Hidden) == 0) {
            sb.append(" maxPagesOnDisk");
        }
        if ((this.aL & SemanticState.LiveRegion) == 0) {
            sb.append(" maxPagesOnDiskLowSpace");
        }
        if ((this.aL & SemanticState.ReadOnly) == 0) {
            sb.append(" maxPagesInRamBoostDispatchAll");
        }
        if ((this.aL & SemanticState.Modal) == 0) {
            sb.append(" maxPagesInRamBoostBehind");
        }
        if ((this.aL & SemanticState.Obscured) == 0) {
            sb.append(" managePagesDespamMs");
        }
        if ((this.aL & SemanticState.Multiline) == 0) {
            sb.append(" managePagesDespamTurtleMs");
        }
        if ((this.aL & 16384) == 0) {
            sb.append(" maxDispatchesPerPage");
        }
        if ((this.aL & 32768) == 0) {
            sb.append(" maxDispatchesPerPageDispatchAll");
        }
        if ((this.aL & 65536) == 0) {
            sb.append(" immediateDispatchesCanExceedMaxInFlight");
        }
        if ((this.aL & 131072) == 0) {
            sb.append(" immediateRetryDispatchesCanExceedMaxInFlight");
        }
        if ((this.aL & 262144) == 0) {
            sb.append(" infRetryNoNet");
        }
        if ((this.aL & 524288) == 0) {
            sb.append(" retryNonNetworkErrors");
        }
        if ((this.aL & 1048576) == 0) {
            sb.append(" retryOnGoodNet");
        }
        if ((this.aL & 2097152) == 0) {
            sb.append(" retryOnFailRate");
        }
        if (this.a == null) {
            sb.append(" maxRetryDelaySec");
        }
        if (this.b == null) {
            sb.append(" minRetryDelaySec");
        }
        if (this.c == null) {
            sb.append(" retryDelayScalingFactor");
        }
        if ((this.aL & 4194304) == 0) {
            sb.append(" maxInFlight");
        }
        if ((this.aL & 8388608) == 0) {
            sb.append(" maxStaleInFlight");
        }
        if ((this.aL & 16777216) == 0) {
            sb.append(" maxRetryInFlight");
        }
        if ((this.aL & 33554432) == 0) {
            sb.append(" maxInFlightTurtle");
        }
        if ((this.aL & 67108864) == 0) {
            sb.append(" maxStaleInFlightTurtle");
        }
        if ((this.aL & 134217728) == 0) {
            sb.append(" maxRetryInFlightTurtle");
        }
        if ((this.aL & 268435456) == 0) {
            sb.append(" maxInFlightBadNet");
        }
        if ((this.aL & 536870912) == 0) {
            sb.append(" maxStaleInFlightBadNet");
        }
        if ((this.aL & 1073741824) == 0) {
            sb.append(" maxRetryInFlightBadNet");
        }
        if ((this.aL & Integer.MIN_VALUE) == 0) {
            sb.append(" maxInFlightBehind");
        }
        if ((this.aM & 1) == 0) {
            sb.append(" maxStaleInFlightBehind");
        }
        if ((this.aM & 2) == 0) {
            sb.append(" inFlightBehindThreshold");
        }
        if ((this.aM & 4) == 0) {
            sb.append(" maxRetryInFlightBehind");
        }
        if ((this.aM & 8) == 0) {
            sb.append(" retryInFlightBehindThreshold");
        }
        if ((this.aM & 16) == 0) {
            sb.append(" maxInFlightDispatchAll");
        }
        if ((this.aM & 32) == 0) {
            sb.append(" maxRetryInFlightDispatchAll");
        }
        if ((this.aM & 64) == 0) {
            sb.append(" useBadNetInFlightWhenDispatchAll");
        }
        if ((this.aM & SemanticState.Focused) == 0) {
            sb.append(" dispatchAllWakeupMs");
        }
        if ((this.aM & SemanticState.Hidden) == 0) {
            sb.append(" dispatchAllTimeoutMs");
        }
        if ((this.aM & SemanticState.LiveRegion) == 0) {
            sb.append(" maxAgeBeforeStaleMs");
        }
        if ((this.aM & SemanticState.ReadOnly) == 0) {
            sb.append(" minSpaceBeforeAttemptingDispatchCreation");
        }
        if (this.d == null) {
            sb.append(" maxEventCount");
        }
        if (this.e == null) {
            sb.append(" maxDispatchSize");
        }
        if ((this.aM & SemanticState.Modal) == 0) {
            sb.append(" minEventCount");
        }
        if ((this.aM & SemanticState.Obscured) == 0) {
            sb.append(" maxPackingFactorSkipCount");
        }
        if (this.f == null) {
            sb.append(" maxRetryCount");
        }
        if ((this.aM & SemanticState.Multiline) == 0) {
            sb.append(" maxResponseTimeoutMs");
        }
        if ((this.aM & 16384) == 0) {
            sb.append(" maxEventAgeMs");
        }
        if ((this.aM & 32768) == 0) {
            sb.append(" maxWaitToSendMs");
        }
        if ((this.aM & 65536) == 0) {
            sb.append(" maxIngestionDelayMs");
        }
        if ((this.aM & 131072) == 0) {
            sb.append(" maxIngestionDelayWhenShutdownLikelyMs");
        }
        if ((this.aM & 262144) == 0) {
            sb.append(" stackDespamMs");
        }
        if ((this.aM & 524288) == 0) {
            sb.append(" responseTimeoutDespamMs");
        }
        if ((this.aM & 1048576) == 0) {
            sb.append(" periodicTaskDespamMs");
        }
        if ((this.aM & 2097152) == 0) {
            sb.append(" freshDispatchMs");
        }
        if ((this.aM & 4194304) == 0) {
            sb.append(" staleDispatchMs");
        }
        if ((this.aM & 8388608) == 0) {
            sb.append(" oldPageWakeupMs");
        }
        if ((this.aM & 16777216) == 0) {
            sb.append(" offlineLongMs");
        }
        if ((this.aM & 33554432) == 0) {
            sb.append(" offlineRecentlyMs");
        }
        if ((this.aM & 67108864) == 0) {
            sb.append(" backgroundRecentlyMs");
        }
        if ((this.aM & 134217728) == 0) {
            sb.append(" enablePageReEpoch");
        }
        if ((this.aM & 268435456) == 0) {
            sb.append(" turtleMask");
        }
        if ((this.aM & 536870912) == 0) {
            sb.append(" shutdownLikelyMask");
        }
        if ((this.aM & 1073741824) == 0) {
            sb.append(" xtraNoDispatchMask");
        }
        if ((this.aM & Integer.MIN_VALUE) == 0) {
            sb.append(" forceDefaultTierMask");
        }
        if ((this.aN & 1) == 0) {
            sb.append(" turtleMaxPercent");
        }
        if ((this.aN & 2) == 0) {
            sb.append(" turtleWindowSec");
        }
        if ((this.aN & 4) == 0) {
            sb.append(" turtleCooldownSec");
        }
        if ((this.aN & 8) == 0) {
            sb.append(" xtraNoDispatchMaxPercent");
        }
        if ((this.aN & 16) == 0) {
            sb.append(" xtraNoDispatchWindowSec");
        }
        if ((this.aN & 32) == 0) {
            sb.append(" xtraNoDispatchCooldownSec");
        }
        if ((this.aN & 64) == 0) {
            sb.append(" badNetMaxPercent");
        }
        if ((this.aN & SemanticState.Focused) == 0) {
            sb.append(" badNetWindowSec");
        }
        if ((this.aN & SemanticState.Hidden) == 0) {
            sb.append(" badNetCooldownSec");
        }
        if ((this.aN & SemanticState.LiveRegion) == 0) {
            sb.append(" netHealthObservationWindowSecs");
        }
        if ((this.aN & SemanticState.ReadOnly) == 0) {
            sb.append(" netHealthObservationGranularitySecs");
        }
        if ((this.aN & SemanticState.Modal) == 0) {
            sb.append(" netHealthGoodDataSecs");
        }
        if ((this.aN & SemanticState.Obscured) == 0) {
            sb.append(" netHealthNewFailSecs");
        }
        if ((this.aN & SemanticState.Multiline) == 0) {
            sb.append(" netHealthSomeSuccess");
        }
        if ((this.aN & 16384) == 0) {
            sb.append(" netHealthManySuccess");
        }
        if ((this.aN & 32768) == 0) {
            sb.append(" netHealthFailRateMinDataPoints");
        }
        if ((this.aN & 65536) == 0) {
            sb.append(" netHealthDispatchableFailRate");
        }
        if ((this.aN & 131072) == 0) {
            sb.append(" lowDiskSpaceThresholdBytes");
        }
        if ((this.aN & 262144) == 0) {
            sb.append(" diskSpaceCheckIntervalMs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ztq
    public final ahbn ay() {
        ahbn ahbnVar = this.c;
        if (ahbnVar != null) {
            return ahbnVar;
        }
        throw new IllegalStateException("Property \"retryDelayScalingFactor\" has not been set");
    }

    @Override // defpackage.ztq
    public final ahbo az() {
        ahbo ahboVar = this.e;
        if (ahboVar != null) {
            return ahboVar;
        }
        throw new IllegalStateException("Property \"maxDispatchSize\" has not been set");
    }

    @Override // defpackage.ztq
    public final int b() {
        if ((this.aM & 67108864) != 0) {
            return this.am;
        }
        throw new IllegalStateException("Property \"backgroundRecentlyMs\" has not been set");
    }

    @Override // defpackage.ztq
    public final void bA(int i) {
        this.J = i;
        this.aL |= 536870912;
    }

    @Override // defpackage.ztq
    public final void bB(int i) {
        this.M = i;
        this.aM |= 1;
    }

    @Override // defpackage.ztq
    public final void bC(int i) {
        this.G = i;
        this.aL |= 67108864;
    }

    @Override // defpackage.ztq
    public final void bD(long j) {
        this.ab = j;
        this.aM |= 32768;
    }

    @Override // defpackage.ztq
    public final void bE(int i) {
        this.X = i;
        this.aM |= SemanticState.Modal;
    }

    @Override // defpackage.ztq
    public final void bF(int i) {
        this.n = i;
        this.aL |= SemanticState.Focused;
    }

    @Override // defpackage.ztq
    public final void bG(ahbo ahboVar) {
        this.b = ahboVar;
    }

    @Override // defpackage.ztq
    public final void bH(int i) {
        this.W = i;
        this.aM |= SemanticState.ReadOnly;
    }

    @Override // defpackage.ztq
    public final void bI(int i) {
        this.aI = i;
        this.aN |= 65536;
    }

    @Override // defpackage.ztq
    public final void bJ(int i) {
        this.aH = i;
        this.aN |= 32768;
    }

    @Override // defpackage.ztq
    public final void bK(int i) {
        this.aD = i;
        this.aN |= SemanticState.Modal;
    }

    @Override // defpackage.ztq
    public final void bL(int i) {
        this.aG = i;
        this.aN |= 16384;
    }

    @Override // defpackage.ztq
    public final void bM(int i) {
        this.aE = i;
        this.aN |= SemanticState.Obscured;
    }

    @Override // defpackage.ztq
    public final void bN(int i) {
        this.aC = i;
        this.aN |= SemanticState.ReadOnly;
    }

    @Override // defpackage.ztq
    public final void bO(int i) {
        this.aB = i;
        this.aN |= SemanticState.LiveRegion;
    }

    @Override // defpackage.ztq
    public final void bP(int i) {
        this.aF = i;
        this.aN |= SemanticState.Multiline;
    }

    @Override // defpackage.ztq
    public final void bQ(int i) {
        this.ak = i;
        this.aM |= 16777216;
    }

    @Override // defpackage.ztq
    public final void bR(int i) {
        this.al = i;
        this.aM |= 33554432;
    }

    @Override // defpackage.ztq
    public final void bS(int i) {
        this.aj = i;
        this.aM |= 8388608;
    }

    @Override // defpackage.ztq
    public final void bT(int i) {
        this.ag = i;
        this.aM |= 1048576;
    }

    @Override // defpackage.ztq
    public final void bU(int i) {
        this.af = i;
        this.aM |= 524288;
    }

    @Override // defpackage.ztq
    public final void bV(ahbn ahbnVar) {
        this.c = ahbnVar;
    }

    @Override // defpackage.ztq
    public final void bW(int i) {
        this.P = i;
        this.aM |= 8;
    }

    @Override // defpackage.ztq
    public final void bX(boolean z) {
        this.z = z;
        this.aL |= 524288;
    }

    @Override // defpackage.ztq
    public final void bY(boolean z) {
        this.B = z;
        this.aL |= 2097152;
    }

    @Override // defpackage.ztq
    public final void bZ(boolean z) {
        this.A = z;
        this.aL |= 1048576;
    }

    @Override // defpackage.ztq
    public final void ba(int i) {
        this.v = i;
        this.aL |= 32768;
    }

    @Override // defpackage.ztq
    public final void bb(long j) {
        this.aa = j;
        this.aM |= 16384;
    }

    @Override // defpackage.ztq
    public final void bc(ahbo ahboVar) {
        this.d = ahboVar;
    }

    @Override // defpackage.ztq
    public final void bd(int i) {
        this.C = i;
        this.aL |= 4194304;
    }

    @Override // defpackage.ztq
    public final void be(int i) {
        this.I = i;
        this.aL |= 268435456;
    }

    @Override // defpackage.ztq
    public final void bf(int i) {
        this.L = i;
        this.aL |= Integer.MIN_VALUE;
    }

    @Override // defpackage.ztq
    public final void bg(int i) {
        this.Q = i;
        this.aM |= 16;
    }

    @Override // defpackage.ztq
    public final void bh(int i) {
        this.F = i;
        this.aL |= 33554432;
    }

    @Override // defpackage.ztq
    public final void bi(int i) {
        this.ac = i;
        this.aM |= 65536;
    }

    @Override // defpackage.ztq
    public final void bj(int i) {
        this.ad = i;
        this.aM |= 131072;
    }

    @Override // defpackage.ztq
    public final void bk(int i) {
        this.Y = i;
        this.aM |= SemanticState.Obscured;
    }

    @Override // defpackage.ztq
    public final void bl(int i) {
        this.m = i;
        this.aL |= 64;
    }

    @Override // defpackage.ztq
    public final void bm(int i) {
        this.r = i;
        this.aL |= SemanticState.Modal;
    }

    @Override // defpackage.ztq
    public final void bn(int i) {
        this.q = i;
        this.aL |= SemanticState.ReadOnly;
    }

    @Override // defpackage.ztq
    public final void bo(int i) {
        this.l = i;
        this.aL |= 32;
    }

    @Override // defpackage.ztq
    public final void bp(int i) {
        this.o = i;
        this.aL |= SemanticState.Hidden;
    }

    @Override // defpackage.ztq
    public final void bq(int i) {
        this.p = i;
        this.aL |= SemanticState.LiveRegion;
    }

    @Override // defpackage.ztq
    public final void br(int i) {
        this.Z = i;
        this.aM |= SemanticState.Multiline;
    }

    @Override // defpackage.ztq
    public final void bs(ahbo ahboVar) {
        this.f = ahboVar;
    }

    @Override // defpackage.ztq
    public final void bt(ahbo ahboVar) {
        this.a = ahboVar;
    }

    @Override // defpackage.ztq
    public final void bu(int i) {
        this.E = i;
        this.aL |= 16777216;
    }

    @Override // defpackage.ztq
    public final void bv(int i) {
        this.K = i;
        this.aL |= 1073741824;
    }

    @Override // defpackage.ztq
    public final void bw(int i) {
        this.O = i;
        this.aM |= 4;
    }

    @Override // defpackage.ztq
    public final void bx(int i) {
        this.R = i;
        this.aM |= 32;
    }

    @Override // defpackage.ztq
    public final void by(int i) {
        this.H = i;
        this.aL |= 134217728;
    }

    @Override // defpackage.ztq
    public final void bz(int i) {
        this.D = i;
        this.aL |= 8388608;
    }

    @Override // defpackage.ztq
    public final int c() {
        if ((this.aN & SemanticState.Hidden) != 0) {
            return this.aA;
        }
        throw new IllegalStateException("Property \"badNetCooldownSec\" has not been set");
    }

    @Override // defpackage.ztq
    public final void ca(int i) {
        this.ap = i;
        this.aM |= 536870912;
    }

    @Override // defpackage.ztq
    public final void cb(int i) {
        this.ae = i;
        this.aM |= 262144;
    }

    @Override // defpackage.ztq
    public final void cc(int i) {
        this.ai = i;
        this.aM |= 4194304;
    }

    @Override // defpackage.ztq
    public final void cd(int i) {
        this.au = i;
        this.aN |= 4;
    }

    @Override // defpackage.ztq
    public final void ce(int i) {
        this.ao = i;
        this.aM |= 268435456;
    }

    @Override // defpackage.ztq
    public final void cf(int i) {
        this.as = i;
        this.aN |= 1;
    }

    @Override // defpackage.ztq
    public final void cg(int i) {
        this.at = i;
        this.aN |= 2;
    }

    @Override // defpackage.ztq
    public final void ch(boolean z) {
        this.S = z;
        this.aM |= 64;
    }

    @Override // defpackage.ztq
    public final void ci(int i) {
        this.h = i;
        this.aL |= 2;
    }

    @Override // defpackage.ztq
    public final void cj(int i) {
        this.i = i;
        this.aL |= 4;
    }

    @Override // defpackage.ztq
    public final void ck(int i) {
        this.g = i;
        this.aL |= 1;
    }

    @Override // defpackage.ztq
    public final void cl(int i) {
        this.ax = i;
        this.aN |= 32;
    }

    @Override // defpackage.ztq
    public final void cm(int i) {
        this.aq = i;
        this.aM |= 1073741824;
    }

    @Override // defpackage.ztq
    public final void cn(int i) {
        this.av = i;
        this.aN |= 8;
    }

    @Override // defpackage.ztq
    public final void co(int i) {
        this.aw = i;
        this.aN |= 16;
    }

    @Override // defpackage.ztq
    public final int d() {
        if ((this.aN & 64) != 0) {
            return this.ay;
        }
        throw new IllegalStateException("Property \"badNetMaxPercent\" has not been set");
    }

    @Override // defpackage.ztq
    public final int e() {
        if ((this.aN & SemanticState.Focused) != 0) {
            return this.az;
        }
        throw new IllegalStateException("Property \"badNetWindowSec\" has not been set");
    }

    @Override // defpackage.ztq
    public final int f() {
        if ((this.aN & 262144) != 0) {
            return this.aK;
        }
        throw new IllegalStateException("Property \"diskSpaceCheckIntervalMs\" has not been set");
    }

    @Override // defpackage.ztq
    public final int g() {
        if ((this.aM & SemanticState.Hidden) != 0) {
            return this.U;
        }
        throw new IllegalStateException("Property \"dispatchAllTimeoutMs\" has not been set");
    }

    @Override // defpackage.ztq
    public final int h() {
        if ((this.aM & SemanticState.Focused) != 0) {
            return this.T;
        }
        throw new IllegalStateException("Property \"dispatchAllWakeupMs\" has not been set");
    }

    @Override // defpackage.ztq
    public final int i() {
        if ((this.aL & 8) != 0) {
            return this.j;
        }
        throw new IllegalStateException("Property \"eventCompressionThresholdBytes\" has not been set");
    }

    @Override // defpackage.ztq
    public final int j() {
        if ((this.aM & Integer.MIN_VALUE) != 0) {
            return this.ar;
        }
        throw new IllegalStateException("Property \"forceDefaultTierMask\" has not been set");
    }

    @Override // defpackage.ztq
    public final int k() {
        if ((this.aM & 2097152) != 0) {
            return this.ah;
        }
        throw new IllegalStateException("Property \"freshDispatchMs\" has not been set");
    }

    @Override // defpackage.ztq
    public final int l() {
        if ((this.aM & 2) != 0) {
            return this.N;
        }
        throw new IllegalStateException("Property \"inFlightBehindThreshold\" has not been set");
    }

    @Override // defpackage.ztq
    public final int m() {
        if ((this.aL & SemanticState.Obscured) != 0) {
            return this.s;
        }
        throw new IllegalStateException("Property \"managePagesDespamMs\" has not been set");
    }

    @Override // defpackage.ztq
    public final int n() {
        if ((this.aL & SemanticState.Multiline) != 0) {
            return this.t;
        }
        throw new IllegalStateException("Property \"managePagesDespamTurtleMs\" has not been set");
    }

    @Override // defpackage.ztq
    public final int o() {
        if ((this.aM & SemanticState.LiveRegion) != 0) {
            return this.V;
        }
        throw new IllegalStateException("Property \"maxAgeBeforeStaleMs\" has not been set");
    }

    @Override // defpackage.ztq
    public final int p() {
        if ((this.aL & 16384) != 0) {
            return this.u;
        }
        throw new IllegalStateException("Property \"maxDispatchesPerPage\" has not been set");
    }

    @Override // defpackage.ztq
    public final int q() {
        if ((this.aL & 32768) != 0) {
            return this.v;
        }
        throw new IllegalStateException("Property \"maxDispatchesPerPageDispatchAll\" has not been set");
    }

    @Override // defpackage.ztq
    public final int r() {
        if ((this.aL & 4194304) != 0) {
            return this.C;
        }
        throw new IllegalStateException("Property \"maxInFlight\" has not been set");
    }

    @Override // defpackage.ztq
    public final int s() {
        if ((this.aL & 268435456) != 0) {
            return this.I;
        }
        throw new IllegalStateException("Property \"maxInFlightBadNet\" has not been set");
    }

    @Override // defpackage.ztq
    public final int t() {
        if ((this.aL & Integer.MIN_VALUE) != 0) {
            return this.L;
        }
        throw new IllegalStateException("Property \"maxInFlightBehind\" has not been set");
    }

    @Override // defpackage.ztq
    public final int u() {
        if ((this.aM & 16) != 0) {
            return this.Q;
        }
        throw new IllegalStateException("Property \"maxInFlightDispatchAll\" has not been set");
    }

    @Override // defpackage.ztq
    public final int v() {
        if ((this.aL & 33554432) != 0) {
            return this.F;
        }
        throw new IllegalStateException("Property \"maxInFlightTurtle\" has not been set");
    }

    @Override // defpackage.ztq
    public final int w() {
        if ((this.aM & 65536) != 0) {
            return this.ac;
        }
        throw new IllegalStateException("Property \"maxIngestionDelayMs\" has not been set");
    }

    @Override // defpackage.ztq
    public final int x() {
        if ((this.aM & 131072) != 0) {
            return this.ad;
        }
        throw new IllegalStateException("Property \"maxIngestionDelayWhenShutdownLikelyMs\" has not been set");
    }

    @Override // defpackage.ztq
    public final int y() {
        if ((this.aM & SemanticState.Obscured) != 0) {
            return this.Y;
        }
        throw new IllegalStateException("Property \"maxPackingFactorSkipCount\" has not been set");
    }

    @Override // defpackage.ztq
    public final int z() {
        if ((this.aL & 64) != 0) {
            return this.m;
        }
        throw new IllegalStateException("Property \"maxPagesInRamAfterBoot\" has not been set");
    }
}
