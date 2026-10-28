package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import androidx.car.app.model.Alert;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import androidx.media3.decoder.av1.Dav1dDecoder;
import androidx.media3.decoder.av1.Dav1dDecoderException;
import androidx.media3.decoder.av1.Dav1dLibrary;
import app.rive.semantics.SemanticState;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jux extends juv {
    private static final int as;
    private static final wgq at;
    private yxu aA;
    private final int aB;
    private final int aC;
    private final int aD;
    private final int aE;
    private final boolean aF;
    private cnm aG;
    private long aH;
    private final long aI;
    private final int aJ;
    private final bwn aK;
    private final DecoderInputBuffer aL;
    private bse aM;
    private DecoderInputBuffer aN;
    private VideoDecoderOutputBuffer aO;
    private int aP;
    private Object aQ;
    private ctl aR;
    private ctm aS;
    private cju aT;
    private cju aU;
    private int aV;
    private long aW;
    private long aX;
    private boolean aY;
    private boolean aZ;
    boolean ah;
    boolean ai;
    public final AtomicBoolean aj;
    int ak;
    boolean al;
    boolean am;
    boolean an;
    boolean ao;
    boolean ap;
    cay aq;
    juw ar;
    private long au;
    private long av;
    private zjv aw;
    private long ax;
    private long ay;
    private final long az;
    private boolean ba;
    private btz bb;
    private long bc;
    private int bd;
    private int be;
    private int bf;
    private boolean bg;
    private boolean bh;
    private boolean bi;
    private boolean bj;
    private final float bk;
    private final boolean bl;
    private final jvd bm;
    private boolean bn;
    private boolean bo;
    private boolean bp;
    private final pj bq;

    static {
        int i = bwp.a;
        as = 737280;
        at = wgq.DASH_WEBM_VP9_720P;
    }

    public jux(Handler handler, cty ctyVar, int i, int i2, int i3, int i4, boolean z, yyg yygVar, dov dovVar, long j, Context context, clu cluVar, dov dovVar2, cli cliVar, awmd awmdVar) {
        juq juqVar = new juq(context);
        juqVar.c = cliVar;
        juqVar.b = cluVar;
        juqVar.d = 5000L;
        juqVar.e = handler;
        juqVar.f = ctyVar;
        juqVar.g = 10;
        yyf yyfVar = yygVar.d;
        juqVar.h = true != (yyfVar != null ? yyfVar.k : yygVar.a.d.ez()) ? 30.0f : 0.0f;
        juqVar.k = dovVar;
        juqVar.i = 15000L;
        long jH = yygVar.h();
        if (jH > 0) {
            juqVar.j = jH;
        }
        super(juqVar);
        this.ax = -9223372036854775807L;
        this.aH = -9223372036854775807L;
        this.aj = new AtomicBoolean(true);
        this.aI = 5000L;
        this.aJ = 10;
        this.aX = -9223372036854775807L;
        this.aK = new bwn();
        this.aL = DecoderInputBuffer.newNoDataInstance();
        pj pjVar = new pj(handler, ctyVar);
        this.bq = pjVar;
        this.ak = 0;
        this.aP = -1;
        this.aV = 0;
        this.aq = new cay();
        this.aD = i;
        this.aE = i2;
        this.aB = i3;
        this.aC = i4;
        this.aF = z;
        this.aA = yxu.a;
        this.ad = yygVar;
        this.az = j;
        this.af = dovVar2;
        this.bj = yygVar.O();
        this.bk = yygVar.c();
        yyf yyfVar2 = yygVar.d;
        boolean zCx = yyfVar2 != null ? yyfVar2.a : yygVar.a.d.cx();
        this.bl = zCx;
        jvd jvdVar = (jvd) (zCx ? awmdVar.io() : null);
        this.bm = jvdVar;
        if (jvdVar != null) {
            jvdVar.p = pjVar;
            jvdVar.q = dovVar;
        }
    }

    private final void bA() {
        if (e() != -9223372036854775807L || this.d == -9223372036854775807L) {
            return;
        }
        if (this.aG != null || this.h.n()) {
            bse bseVar = this.T;
            super.M(bseVar != null ? new bse[]{bseVar} : new bse[0], this.e, this.d, this.aG);
        }
    }

    private final void bB() throws cbo {
        this.bf = 0;
        int i = this.ak;
        if (i != 0 && i != 4) {
            bP();
            bD();
            return;
        }
        this.aN = null;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.aO;
        if (videoDecoderOutputBuffer != null) {
            videoDecoderOutputBuffer.release();
            this.aO = null;
        }
        juw juwVar = this.ar;
        juwVar.getClass();
        juwVar.flush();
        juwVar.setOutputStartTimeUs(this.e);
        this.al = false;
        cso csoVar = this.Q;
        if (csoVar != null) {
            csoVar.c();
        }
    }

    private final void bC(int i) {
        this.aV = Math.min(this.aV, i);
    }

    private final void bD() throws cbo {
        if (this.ar == null) {
            bse bseVar = this.T;
            if (bseVar == null || !aU(bseVar)) {
                if (this.T != null) {
                    aL();
                    return;
                }
                return;
            }
            bT(this.aU);
            cju cjuVar = this.aT;
            if (cjuVar != null && cjuVar.b() == null && this.aT.c() == null) {
                return;
            }
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                bse bseVar2 = this.T;
                bseVar2.getClass();
                int i = bseVar2.r;
                if (i == -1) {
                    i = as;
                }
                int i2 = i;
                yyg yygVar = this.ad;
                int iAa = (yygVar == null || !yygVar.o()) ? this.aE : hna.aa(this.aE, this.aD, this.aB, this.aC);
                int i3 = this.aB;
                int i4 = this.aC;
                int i5 = this.aD;
                boolean z = this.aF;
                yyg yygVar2 = this.ad;
                juw juwVar = new juw(new Dav1dDecoder(i3, i4, i2, i5, iAa, z, yygVar2 != null ? yygVar2.e() : -99));
                this.ar = juwVar;
                juwVar.setOutputStartTimeUs(this.e);
                bU(this.aP);
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                String name = this.ar.getName();
                this.bq.C(name, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
                if (this.ad.S()) {
                    String str = this.l ? "warmup_codec_created.v" : "codec_created.v";
                    if (name.isEmpty()) {
                        name = "unknown";
                    }
                    this.ad.n("ecdi", a.cd(name, str, ";name."));
                }
                this.aq.a++;
            } catch (can e) {
                bvx.d("CODEC_SPLICE_DAV1D", "Video codec error", e);
                this.bq.K(e);
                throw q(e, this.T, false, 4001);
            } catch (OutOfMemoryError e2) {
                throw q(e2, this.T, false, 4001);
            }
        }
    }

    private final void bE() {
        if (this.bd > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.bq.F(this.bd, jElapsedRealtime - this.bc);
            this.bd = 0;
            this.bc = jElapsedRealtime;
        }
    }

    private final void bF() {
        btz btzVar = this.bb;
        if (btzVar != null) {
            this.bq.L(btzVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0047 A[FINALLY_INSNS] */
    private final void bG(boolean z) {
        this.bb = null;
        boolean z2 = false;
        bC(0);
        try {
            bV(null);
            bP();
        } finally {
            yyg yygVar = this.ad;
            if (yygVar != null && yygVar.E()) {
                z2 = true;
            }
            if (!z2 || z) {
                this.bq.E(this.aq);
                if (z2) {
                    this.aq = new cay();
                }
            } else {
                this.aq = new cay();
            }
        }
    }

    private final void bH() {
        yyg yygVar;
        if (this.ar == null || (yygVar = this.ad) == null || !yygVar.H()) {
            this.aq = new cay();
        }
        this.bq.G(this.aq);
        if (this.ad.B() && this.l) {
            return;
        }
        this.aV = 1;
    }

    private final void bI() {
        this.bd = 0;
        this.bc = SystemClock.elapsedRealtime();
        this.ay = bwp.y(SystemClock.elapsedRealtime());
        this.aA.d();
        this.ad.m(zhc.b("video/av01", true, f()));
    }

    private final void bJ() {
        this.aX = -9223372036854775807L;
        bE();
    }

    private final void bK() {
        if (this.ad.W() || this.ad.p()) {
            this.aj.set(false);
        }
        bS(null);
    }

    private final void bL(boolean z) {
        super.aq(z);
        ay();
    }

    private final void bM() throws cbo {
        try {
            super.E(true, true);
            if (this.ad.B()) {
                bA();
                if (this.am) {
                    this.O.o();
                }
            }
            this.aA.a();
            this.bh = this.ad.a.c.c;
        } catch (cbo e) {
            bvx.d("CODEC_SPLICE_DAV1D", "enable MediaCodec error", e);
            throw e;
        }
    }

    private final void bN() {
        this.bi = this.ad.a.a().Z();
        super.K();
        this.aA.d();
    }

    private final void bO() {
        yyg yygVar;
        boolean z = this.ap;
        boolean z2 = this.k;
        if (z) {
            if (z2) {
                bJ();
                bG(true);
                this.ac = new cay();
                this.bq.G(this.ac);
                long jH = this.ad.h();
                this.O.a = jH > 0 ? jH : 50000L;
                bN();
            } else {
                super.L();
                bL(true);
                bH();
                long jH2 = this.ad.h();
                this.O.a = jH2 > 0 ? jH2 : 50000L;
                bI();
            }
        } else if (z2) {
            bJ();
            bG(true);
            try {
                bM();
            } catch (cbo e) {
                bvx.d("CODEC_SPLICE_DAV1D", "enable media codec error during codec splice: ", e);
            }
            bN();
            if (this.ad.B() && this.am) {
                this.O.o();
            }
        } else {
            super.L();
            bL(true);
            bH();
            bI();
        }
        this.k = !this.k;
        if (this.ad.B()) {
            this.ap = false;
            boolean z3 = this.ad.L() || this.ad.B() ? !(!this.k ? !this.E : !this.ao) : !this.F;
            if (z3 && !this.q) {
                this.y = 0L;
                av(this.J);
            } else if (!this.k && !z3) {
                this.y = 0L;
                ctp ctpVar = this.O;
                ctpVar.g(0);
                if (this.am) {
                    ctpVar.o();
                }
            }
        }
        if (this.ap || (yygVar = this.ad) == null || this.k || !yygVar.I() || !aY() || this.q) {
            return;
        }
        long j = this.J;
        if (j == 0) {
            j = this.y;
        }
        av(j);
        this.q = true;
        this.y = 0L;
    }

    private final void bP() {
        this.aN = null;
        this.aO = null;
        this.ak = 0;
        this.al = false;
        this.bf = 0;
        juw juwVar = this.ar;
        if (juwVar != null) {
            this.aq.b++;
            juwVar.release();
            this.bq.D(this.ar.getName());
            this.ar = null;
        }
        bT(null);
    }

    private final void bQ(long j, long j2) throws cbo {
        if (this.ba) {
            return;
        }
        if (this.T == null) {
            ccu ccuVarR = r();
            DecoderInputBuffer decoderInputBuffer = this.aL;
            decoderInputBuffer.clear();
            int iK = k(ccuVarR, decoderInputBuffer, 2);
            if (iK != -5) {
                if (iK == -4) {
                    ahno.O(decoderInputBuffer.isEndOfStream());
                    this.aZ = true;
                    this.ba = true;
                    return;
                }
                return;
            }
            br(ccuVarR);
        }
        if (this.ar != null && this.v != null && (this.ad.W() || this.ad.p() ? !this.aj.get() || !this.v.isValid() : !this.v.isValid())) {
            bK();
        }
        if (this.v == null) {
            if (this.b == 2) {
                aC();
                return;
            }
            return;
        }
        bD();
        if (this.ar != null) {
            if (this.z) {
                this.z = false;
                aH(j);
            }
            do {
                try {
                } catch (can e) {
                    bvx.d("CODEC_SPLICE_DAV1D", "Video codec error", e);
                    this.bq.K(e);
                    throw q(e, this.T, false, 4003);
                }
            } while (bw(j, j2));
            if (this.b == 2 && !this.l) {
                am(Z(), this.aO != null, "dav1d");
            }
            boolean z = (this.ad.L() || this.ad.B()) ? this.ao : this.F;
            if (this.l && !z && this.y != 0 && this.ad.g() + j >= this.y) {
                this.y = 0L;
                this.M = j;
                av(j);
            }
            do {
            } while (bx());
            this.aq.a();
        }
    }

    private final void bR() {
        this.H = 0L;
        this.I = 0L;
        this.J = 0L;
        this.K = 0L;
        this.L = 0L;
        this.M = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    private final void bS(Object obj) {
        Object obj2;
        boolean z = obj instanceof Surface;
        boolean z2 = z && ((Surface) obj).isValid() && !Objects.equals(this.aQ, obj);
        if (z) {
            Surface surface = (Surface) obj;
            if (surface.isValid()) {
                this.v = surface;
                if (this.ad.W() || this.ad.p()) {
                    this.aj.set(true);
                }
                this.aR = null;
                this.aP = 1;
            } else if (obj instanceof ctl) {
                this.v = null;
                this.aR = (ctl) obj;
                this.aP = 0;
            } else {
                this.v = null;
                this.aR = null;
                this.aP = -1;
                obj = null;
            }
        } else if (obj instanceof ctl) {
            this.v = null;
            this.aR = (ctl) obj;
            this.aP = 0;
        } else {
            this.v = null;
            this.aR = null;
            this.aP = -1;
            obj = null;
        }
        if (Objects.equals(this.aQ, obj)) {
            if (obj != null) {
                bF();
                if (this.aV != 3 || (obj2 = this.aQ) == null) {
                    return;
                }
                this.bq.I(obj2);
                return;
            }
            return;
        }
        if (z2 && this.ad.S()) {
            this.ad.n("ecdi", "sf_swap.dav1d;sf_swap.attached:sec");
        }
        this.aQ = obj;
        if (obj == null) {
            this.bb = null;
            bC(1);
            return;
        }
        if (this.ar != null) {
            bU(this.aP);
        }
        bF();
        bC(1);
        if (this.b == 2) {
            bv(true);
        }
    }

    private final void bT(cju cjuVar) {
        aup.o(this.aT, cjuVar);
        this.aT = cjuVar;
    }

    private final void bU(int i) {
        juw juwVar = this.ar;
        if (juwVar != null) {
            juwVar.e(i);
        }
    }

    private final void bV(cju cjuVar) {
        aup.o(this.aU, cjuVar);
        this.aU = cjuVar;
    }

    private final void bW(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        this.aq.f++;
        videoDecoderOutputBuffer.release();
    }

    private final void bX(int i, int i2) {
        cay cayVar = this.aq;
        cayVar.h += i;
        int i3 = i + i2;
        cayVar.g += i3;
        this.bd += i3;
        int i4 = this.be + i3;
        this.be = i4;
        cayVar.i = Math.max(i4, cayVar.i);
        int i5 = this.aJ;
        if (i5 <= 0 || this.bd < i5) {
            return;
        }
        bE();
    }

    private final boolean bY() {
        return this.aP != -1;
    }

    private static boolean bZ(long j) {
        return j < -30000;
    }

    private final void bz(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        bX(0, 1);
        videoDecoderOutputBuffer.release();
    }

    private final boolean ca() {
        return this.aX != -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0084  */
    /* JADX WARN: Code duplicated, block: B:79:0x00bc  */
    @Override // defpackage.juv, defpackage.cav, defpackage.cdm
    public final void A(int i, Object obj) {
        bse bseVar;
        boolean z;
        jvd jvdVar;
        if (this.bl && (jvdVar = this.bm) != null) {
            jvdVar.A(i, obj);
            return;
        }
        if (i == 10103) {
            aK((zjv) obj);
            return;
        }
        if (i == 10104) {
            this.aw = (zjv) obj;
            return;
        }
        Object obj2 = null;
        boolean z2 = false;
        if (i == 10100) {
            if (obj == null) {
                obj = null;
            } else if (!(obj instanceof Surface) && !(obj instanceof juu)) {
                return;
            }
            Surface surfaceX = hna.X(obj);
            this.x = hna.W(obj);
            if (this.v != surfaceX) {
                if (surfaceX == null) {
                    bS(obj2);
                } else if (surfaceX.isValid()) {
                    obj2 = surfaceX;
                    bS(obj2);
                }
            }
            yyg yygVar = this.ad;
            yyf yyfVar = yygVar.d;
            if ((yyfVar != null ? yyfVar.Z : yygVar.a.d.be()) && (z = this.l) && surfaceX != null) {
                boolean z3 = z && !this.an && this.y == 0;
                boolean z4 = this.n;
                boolean z5 = this.k;
                if (z3) {
                    if (z4) {
                        z2 = z5;
                    } else if (z5) {
                    }
                    if (!z2) {
                        return;
                    }
                } else {
                    if (!z4) {
                        z2 = z5;
                    } else if (z5) {
                    }
                    if (!z2) {
                        return;
                    }
                }
                aM();
                return;
            }
            return;
        }
        if (i == 10101) {
            if (obj == null) {
                obj = null;
            } else if (!(obj instanceof Surface)) {
                return;
            }
            Surface surface = (Surface) obj;
            if (surface != null) {
                if (this.u == surface) {
                    ar();
                    z2 = true;
                }
                if (this.v != surface) {
                    if (z2) {
                    }
                    if (this.ad.p()) {
                        surface.release();
                        return;
                    }
                    return;
                }
                bK();
                if (this.l) {
                    bu();
                }
                if (this.ad.p()) {
                    surface.release();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 10102) {
            if (this.l) {
                if (this.ad.B() && this.m) {
                    this.q = true;
                    this.n = true;
                    this.m = false;
                    bO();
                }
                if (this.ad.S()) {
                    this.ad.n("ecdi", true != this.k ? "sf_swap.mc;sf_swap.done:pri" : "sf_swap.dav1d;sf_swap.done:sec");
                }
                bu();
                if (this.H > 0) {
                    this.z = true;
                    return;
                }
                return;
            }
            return;
        }
        if (i != 1) {
            if (this.k) {
                bp(i, obj);
                return;
            } else {
                super.A(i, obj);
                return;
            }
        }
        if (obj == null) {
            super.A(1, null);
            bp(1, null);
            return;
        }
        super.A(1, obj);
        if ((this.B || this.A == null) && (bseVar = this.T) != null) {
            if (aU(bseVar)) {
                aK(zjv.g);
            } else {
                aK(zjv.c);
            }
        }
    }

    @Override // defpackage.juv, defpackage.cav
    protected final void D() {
        jvd jvdVar;
        if (this.ad.B()) {
            this.am = false;
            this.aG = null;
            this.aH = -9223372036854775807L;
        }
        if (this.bl && (jvdVar = this.bm) != null) {
            this.bn = false;
            if (jvdVar.b == 1) {
                jvdVar.y();
                return;
            } else {
                jvdVar.D();
                return;
            }
        }
        if (this.l) {
            bu();
        }
        this.T = null;
        this.A = null;
        this.B = true;
        bG(this.k);
        bL(!this.k);
    }

    @Override // defpackage.juv, defpackage.cav
    protected final void E(boolean z, boolean z2) throws cbo {
        if (this.ad.B()) {
            this.am = false;
        }
        if (this.bl && this.bm != null) {
            this.bn = true;
            this.bo = z;
            this.bp = z2;
        } else if (this.B) {
            this.ah = true;
        } else {
            bs();
        }
    }

    @Override // defpackage.cav
    protected final void F() {
        jvd jvdVar;
        if (!this.bl || (jvdVar = this.bm) == null) {
            return;
        }
        jvdVar.B(this.a, v(), p());
    }

    @Override // defpackage.juv, defpackage.cav
    public final void G(long j, boolean z, boolean z2) throws cbo {
        jvd jvdVar;
        if (this.ad.B()) {
            this.am = false;
            this.aH = -9223372036854775807L;
        }
        if (this.bl && (jvdVar = this.bm) != null) {
            super.R(j, false, z2);
            return;
        }
        if (this.l) {
            bu();
        }
        bR();
        super.G(j, z, z2);
        this.aZ = false;
        this.ba = false;
        bC(1);
        this.aW = -9223372036854775807L;
        this.be = 0;
        if (this.ar != null) {
            bB();
        }
        if (z) {
            bv(false);
        } else {
            this.aX = -9223372036854775807L;
        }
        this.aK.f();
        this.ay = 0L;
        this.au = 0L;
        this.av = 0L;
        this.ai = false;
    }

    @Override // defpackage.juv, defpackage.cav
    protected final void H() {
        jvd jvdVar;
        if (!this.bl || (jvdVar = this.bm) == null) {
            return;
        }
        this.bn = false;
        if (jvdVar.b == 0) {
            jvdVar.N();
        } else {
            jvdVar.H();
        }
    }

    @Override // defpackage.juv, defpackage.cav
    protected final void J() {
        jvd jvdVar;
        if (this.ad.B()) {
            this.am = false;
            this.aH = -9223372036854775807L;
        }
        if (this.bl && (jvdVar = this.bm) != null) {
            this.bn = false;
            jvdVar.J();
        }
        super.J();
        bR();
    }

    @Override // defpackage.juv, defpackage.cav
    protected final void K() {
        jvd jvdVar;
        if (this.bl && (jvdVar = this.bm) != null) {
            try {
                if (jvdVar.b == 1) {
                    jvdVar.V();
                    return;
                }
                return;
            } catch (cbo e) {
                throw new IllegalStateException("Failed to start unified renderer", e);
            }
        }
        if (this.k) {
            bI();
        } else {
            bN();
        }
        if (this.v == null) {
            aC();
        }
        if (this.u == null) {
            aB();
        }
    }

    @Override // defpackage.juv, defpackage.cav
    protected final void L() {
        jvd jvdVar;
        if (!this.bl || (jvdVar = this.bm) == null) {
            bJ();
            super.L();
        } else if (jvdVar.b == 2) {
            jvdVar.W();
        }
    }

    @Override // defpackage.juv, defpackage.cav
    protected final void M(bse[] bseVarArr, long j, long j2, cnm cnmVar) {
        boolean z;
        zjv zjvVar;
        jvd jvdVar;
        if (this.ad.B()) {
            cnm cnmVar2 = this.aG;
            z = true;
            if (cnmVar2 != null && cnmVar2.equals(cnmVar)) {
                z = false;
            }
            this.aG = cnmVar;
        } else {
            z = false;
        }
        if (this.bl && (jvdVar = this.bm) != null) {
            if (this.bn) {
                this.bn = false;
                jvdVar.ad(this.b != 0 ? u() : cdr.a, bseVarArr, this.c, this.bo, this.bp, j, j2, cnmVar);
            } else {
                jvdVar.O(bseVarArr, this.c, j, j2, cnmVar);
            }
            this.ac = jvdVar.k;
            return;
        }
        if (!this.ad.V() || (zjvVar = this.aw) == null) {
            boolean zAU = aU(bseVarArr.length > 0 ? bseVarArr[0] : null);
            boolean z2 = this.k;
            if (this.B || zAU != z2) {
                aK(zAU ? zjv.g : zjv.c);
            }
        } else {
            aK(zjvVar);
            this.aw = null;
        }
        if (this.ad.B() || !this.k) {
            super.M(bseVarArr, j, j2, cnmVar);
            if (!this.ad.B() || z || this.k || !this.am) {
                return;
            }
            this.O.o();
        }
    }

    @Override // defpackage.juv, defpackage.cav, defpackage.cdp
    public final void T(float f, float f2) {
        jvd jvdVar;
        if (!this.bl || (jvdVar = this.bm) == null) {
            super.T(f, f2);
        } else {
            jvdVar.T(f, f2);
        }
    }

    @Override // defpackage.juv
    protected final float a(float f, bse bseVar, bse[] bseVarArr) {
        int i;
        int i2;
        if (this.ad.P()) {
            return -1.0f;
        }
        float fA = this.ad.a();
        if (fA <= 0.0f) {
            if (this.ad.x()) {
                return Math.min(super.a(f, bseVar, bseVarArr), this.bk);
            }
            float fB = this.ad.b();
            return fB > 0.0f ? Math.min(fB * f, this.bk) : Math.min(super.a(f, bseVar, bseVarArr), this.bk);
        }
        float f2 = this.bk;
        float fMin = f2 > 0.0f ? Math.min(fA, f2) : fA;
        clo cloVar = this.V;
        if (cloVar != null && (i = bseVar.w) != -1 && (i2 = bseVar.x) != -1) {
            float fA2 = cloVar.a(i, i2);
            if (fA2 > 0.0f) {
                return Math.min(fMin, fA2);
            }
        }
        return fMin;
    }

    @Override // defpackage.juv
    protected final void aA() {
        super.aA();
        if (this.ap && this.l && !this.k) {
            this.n = true;
            aj();
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    @Override // defpackage.juv
    protected final void aH(long j) {
        long j2;
        this.N = j;
        long j3 = this.H + this.I;
        long j4 = j + this.M;
        long j5 = this.K;
        yyg yygVar = this.ad;
        if (yygVar == null || !yygVar.A()) {
            j2 = j3;
        } else {
            long j6 = this.d;
            if (j6 == -9223372036854775807L || j6 <= 0) {
                j2 = j3;
            } else {
                j2 = j3 >= j6 ? j3 - j6 : j3;
                if (j5 >= j6) {
                    j5 -= j6;
                }
            }
        }
        long j7 = j4 / 2;
        long j8 = this.L - j7;
        long j9 = j7 - j2;
        long j10 = j5 - j7;
        if (j9 > 0 || j8 > 0 || j10 > 0) {
            this.ad.l("eftss." + String.format(Locale.US, "%.2f", Double.valueOf(j9 / 1000.0d)) + ";rg." + String.format(Locale.US, "%.2f", Double.valueOf(j8 / 1000.0d)) + ";nfpg." + String.format(Locale.US, "%.2f", Double.valueOf(j10 / 1000.0d)));
        }
        long j11 = j5 - j2;
        if (this.ad.S()) {
            this.ad.n("ecdi", "splice.v;pts_gap." + (j11 / 1000) + ";eftss." + (j9 / 1000) + ";rg." + (j8 / 1000) + ";nfpg." + (j10 / 1000) + ";old_end." + (j3 / 1000) + ";new_pts." + (this.K / 1000) + ";sw_req." + (this.M / 1000) + ";sw_done." + (this.N / 1000) + ";new_rend." + (this.L / 1000));
        }
    }

    @Override // defpackage.juv
    protected final void aJ(clk clkVar, Surface surface) {
        try {
            clkVar.l(surface);
            this.af.P(surface, null);
        } catch (RuntimeException e) {
            this.af.P(surface, e);
            this.bj = true;
            taf.j(this.ad.i(true), new iul(4));
            throw e;
        }
    }

    @Override // defpackage.juv
    public final void aK(zjv zjvVar) {
        bse bseVar;
        boolean z;
        bse bseVar2;
        bse bseVar3;
        this.A = zjvVar;
        jvd jvdVar = this.bm;
        if (jvdVar != null) {
            try {
                jvdVar.A(10103, zjvVar);
            } catch (cbo e) {
                bvx.d("CODEC_SPLICE_DAV1D", "Error propagating track renderer type to unified renderer", e);
            }
        }
        this.B = false;
        boolean z2 = zjvVar == zjv.g;
        boolean z3 = this.l && this.ad.K() && (bseVar3 = this.T) != null && z2 == aU(bseVar3) && z2 != this.k;
        if (!z3) {
            boolean z4 = this.k;
            this.k = z2;
            yyg yygVar = this.ad;
            yyf yyfVar = yygVar.d;
            if ((yyfVar != null ? yyfVar.V : yygVar.a.d.cp()) && z4 != (z = this.k) && (bseVar2 = this.T) != null && z != aU(bseVar2)) {
                this.T = null;
            }
            if (this.ah) {
                this.ah = false;
                try {
                    bs();
                } catch (cbo e2) {
                    bvx.d("CODEC_SPLICE_DAV1D", "Error trying to perform onEnabled from setTrackRendererType:", e2);
                }
            }
        }
        if (this.bm == null) {
            yyg yygVar2 = this.ad;
            yyf yyfVar2 = yygVar2.d;
            if ((yyfVar2 != null ? yyfVar2.i : yygVar2.a.d.cr()) && this.b > 0) {
                if (z2) {
                    if (this.v == null) {
                        aC();
                    }
                } else if (this.u == null) {
                    aB();
                }
            }
        }
        if (z3 || !this.l) {
            return;
        }
        if (this.ad.K() && (bseVar = this.T) != null && this.k == aU(bseVar)) {
            return;
        }
        bu();
    }

    /* JADX WARN: Code duplicated, block: B:104:0x016c  */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    @Override // defpackage.juv
    protected final void aO(bse bseVar) {
        long jH;
        yyg yygVar = this.ad;
        if (yygVar != null && yygVar.I()) {
            this.p = bseVar;
        }
        if (this.ad.S()) {
            super.aO(bseVar);
        }
        if (this.B) {
            this.k = aU(bseVar);
            this.B = false;
            return;
        }
        if (this.ad.B()) {
            if (this.aV == 3 || this.aq.e > 0 || this.ac.e > 0) {
                this.am = true;
            } else {
                ctp ctpVar = this.O;
                if (ctpVar.n(true) && !ctpVar.m()) {
                    this.am = true;
                }
            }
        }
        this.l = true;
        this.m = true;
        this.z = false;
        boolean z = this.k;
        yyg yygVar2 = this.ad;
        this.ap = !z ? !(yygVar2.B() || this.ad.v() || this.ad.u()) : !(yygVar2.B() || this.ad.v() || this.ad.t());
        if (this.k) {
            this.ab = true;
            this.E = true;
            this.F = true;
        } else {
            this.an = true;
            this.ao = true;
            this.F = true;
            this.al = false;
            if (this.ad.B()) {
                this.ay = bwp.y(SystemClock.elapsedRealtime());
            }
            this.aV = (this.ad.B() && this.am) ? 3 : 1;
        }
        this.ax = p().b();
        bR();
        yyg yygVar3 = this.ad;
        if (yygVar3 != null && (yygVar3.A() || this.ad.B())) {
            boolean z2 = this.k;
            this.H = z2 ? this.au : this.C;
            long j = z2 ? this.av : this.D;
            this.I = j;
            if (j == 0) {
                this.I = 41000L;
            }
        }
        if (this.ap) {
            try {
                if (!this.k) {
                    try {
                        if (this.ar == null) {
                            bD();
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        bvx.d("CODEC_SPLICE_DAV1D", "ERROR on initializing Dav1dDecoder for warmup: ", e);
                        throw e;
                    }
                }
                try {
                    if (this.ad.B()) {
                        bA();
                    } else {
                        al();
                    }
                    ctp ctpVar2 = this.O;
                    ctpVar2.a = 30000L;
                    ctpVar2.b = p();
                    ctpVar2.g(0);
                    if (this.ad.B()) {
                        if (this.am) {
                            ctpVar2.o();
                        }
                        if (this.b == 2) {
                            ctpVar2.e();
                        }
                        al();
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    bvx.d("CODEC_SPLICE_DAV1D", "ERROR on initializing MediaCodec for warmup: ", e2);
                    throw e2;
                }
            } catch (Exception e3) {
                bvx.d("CODEC_SPLICE_DAV1D", "Failed to warmup new decoder, falling back to sequential splice", e3);
                this.ap = false;
                jH = this.ad.h();
                ctp ctpVar3 = this.O;
                if (jH <= 0) {
                    jH = 50000;
                }
                ctpVar3.a = jH;
            }
            bvx.d("CODEC_SPLICE_DAV1D", "Failed to warmup new decoder, falling back to sequential splice", e3);
            this.ap = false;
            jH = this.ad.h();
            ctp ctpVar4 = this.O;
            if (jH <= 0) {
                jH = 50000;
            }
            ctpVar4.a = jH;
        }
        if (this.k) {
            try {
                al();
                return;
            } catch (Exception e4) {
                bvx.d("CODEC_SPLICE_DAV1D", "ERROR on initializing MediaCodec: ", e4);
                return;
            }
        }
        try {
            if (this.ar == null) {
                bD();
            }
        } catch (Exception e5) {
            bvx.d("CODEC_SPLICE_DAV1D", "ERROR on initializing Dav1dDecoder: ", e5);
        }
    }

    @Override // defpackage.juv
    protected final boolean aT(String str) {
        if (this.l) {
            yyg yygVar = this.ad;
            yyf yyfVar = yygVar.d;
            if (!(yyfVar != null ? yyfVar.I : yygVar.a.d.bV())) {
                return false;
            }
        }
        yyg yygVar2 = this.ad;
        yyf yyfVar2 = yygVar2.d;
        int iEM = yyfVar2 != null ? yyfVar2.q : yygVar2.a.d.eM() - 1;
        if (iEM == 0 || iEM == 1) {
            return super.aT(str);
        }
        if (iEM == 2) {
            this.ad.i(true);
            return true;
        }
        if (iEM == 3) {
            this.ad.i(false);
            return false;
        }
        boolean z = this.bj || super.aT(str);
        this.ad.i(z);
        return z;
    }

    @Override // defpackage.juv
    protected final boolean aZ() {
        return this.am;
    }

    /* JADX WARN: Type inference failed for: r10v9, types: [boolean, int] */
    @Override // defpackage.juv, defpackage.cdp
    public final void af(long j, long j2) throws cbo {
        yyg yygVar;
        yyg yygVar2;
        jvd jvdVar;
        if (this.ad.B()) {
            this.aH = j;
        }
        if (this.bl && (jvdVar = this.bm) != null) {
            jvdVar.af(j, j2);
            this.ac = jvdVar.k;
            return;
        }
        if (this.B) {
            return;
        }
        if (this.ap && this.l) {
            if (this.k) {
                if (this.ar != null) {
                    do {
                        try {
                        } catch (can e) {
                            throw q(e, this.T, false, 4003);
                        }
                    } while (bw(j, j2));
                    if (this.ad.B() && this.ak == 3 && !this.ai) {
                        bx();
                    }
                    if (this.ad.B() && this.n) {
                        super.af(j, j2);
                        return;
                    }
                }
                if (this.U != null) {
                    try {
                        p().b();
                        while (aV(j, j2)) {
                        }
                        do {
                        } while (aW());
                    } catch (Exception e2) {
                        bvx.d("CODEC_SPLICE_DAV1D", "Error running pending MediaCodec in dual render", e2);
                        this.n = true;
                        aj();
                    }
                }
            } else {
                if (this.U != null) {
                    try {
                        p().b();
                        do {
                        } while (aV(j, j2));
                        if (this.ad.B() && this.n) {
                            bQ(j, j2);
                            return;
                        }
                    } catch (Exception e3) {
                        throw q(e3, this.T, false, 4003);
                    }
                }
                if (this.ar != null) {
                    do {
                        try {
                        } catch (can e4) {
                            bvx.d("CODEC_SPLICE_DAV1D", "Error running pending Dav1d in dual render", e4);
                            this.n = true;
                            aj();
                        }
                    } while (bw(j, j2));
                    do {
                    } while (bx());
                }
            }
            boolean z = this.ad.L() || this.ad.B() ? !(!this.k ? !this.ao : !this.E) : !(!this.k ? !this.F : !this.F);
            if (this.l) {
                if (this.ad.w()) {
                    if (!z) {
                        if (this.ax != -9223372036854775807L) {
                            long jB = p().b() - this.ax;
                            if (jB > this.ad.f()) {
                                if (this.ad.S()) {
                                    this.ad.n("ecdi", true != this.k ? "sf_swap.mc;sf_swap.timeout:pri" : "sf_swap.dav1d;sf_swap.timeout:sec");
                                }
                                bvx.e("CODEC_SPLICE_DAV1D", "Dual surface splice timed out waiting for first frame (" + jB + "ms > " + this.ad.f() + "ms). Stopping old decoder, re-initializing target decoder, and resetting splice state.");
                                bse bseVar = this.p;
                                if (bseVar != null) {
                                    this.T = bseVar;
                                    aL();
                                }
                                if (this.ap) {
                                    if (this.k) {
                                        super.L();
                                        bL(true);
                                        ay();
                                        try {
                                            al();
                                        } catch (cbo e5) {
                                            throw e5;
                                        } catch (Exception e6) {
                                            throw q(e6, this.T, false, 4001);
                                        }
                                    } else {
                                        bJ();
                                        bG(true);
                                        bP();
                                        try {
                                            bD();
                                        } catch (cbo e7) {
                                            throw e7;
                                        } catch (Exception e8) {
                                            throw q(e8, this.T, false, 4001);
                                        }
                                    }
                                }
                                bu();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } else if (!z) {
                    return;
                }
                if (this.y == 0 || this.ad.g() + j < this.y) {
                    return;
                }
                this.y = 0L;
                this.M = j;
                av(j);
                return;
            }
            return;
        }
        if (!this.k) {
            super.af(j, j2);
            yyg yygVar3 = this.ad;
            if (yygVar3 != null && yygVar3.H() && this.k) {
                bQ(j, j2);
                return;
            }
            yyg yygVar4 = this.ad;
            if (yygVar4 == null || !yygVar4.H() || !this.l || this.ap || (yygVar = this.ad) == null || !yygVar.H() || this.bg || !this.o || this.n) {
                return;
            }
            if (this.ar == null) {
                try {
                    bD();
                } catch (Exception e9) {
                    this.bg = true;
                    bvx.d("CODEC_SPLICE_DAV1D", "Error initializing Dav1dDecoder for pipelined pre-decode: ", e9);
                    return;
                }
            }
            if (this.ar != null) {
                do {
                    try {
                    } catch (can e10) {
                        this.bg = true;
                        bvx.d("CODEC_SPLICE_DAV1D", "Error feeding Dav1d in pipelined pre-decode", e10);
                        return;
                    }
                } while (bx());
                if (this.aO == null) {
                    try {
                        VideoDecoderOutputBuffer videoDecoderOutputBufferDequeueOutputBuffer = this.ar.dequeueOutputBuffer();
                        this.aO = videoDecoderOutputBufferDequeueOutputBuffer;
                        if (videoDecoderOutputBufferDequeueOutputBuffer != null) {
                            if (videoDecoderOutputBufferDequeueOutputBuffer.isEndOfStream()) {
                                videoDecoderOutputBufferDequeueOutputBuffer.release();
                                this.aO = null;
                            } else {
                                this.aq.f += videoDecoderOutputBufferDequeueOutputBuffer.skippedOutputBufferCount;
                                this.bf -= videoDecoderOutputBufferDequeueOutputBuffer.skippedOutputBufferCount;
                            }
                        }
                        return;
                    } catch (can e11) {
                        this.bg = true;
                        bvx.d("CODEC_SPLICE_DAV1D", "Error dequeuing Dav1d output buffer during pipelined pre-decode", e11);
                        return;
                    }
                }
                return;
            }
            return;
        }
        bQ(j, j2);
        yyg yygVar5 = this.ad;
        if (yygVar5 != null && yygVar5.I() && !this.k) {
            super.af(j, j2);
            return;
        }
        yyg yygVar6 = this.ad;
        if (yygVar6 == null || !yygVar6.I() || !this.l || this.ap || (yygVar2 = this.ad) == null || !yygVar2.I() || this.bg || !this.o || this.n) {
            return;
        }
        bse bseVar2 = this.p;
        if (bseVar2 == null || bseVar2.u == null) {
            if (this.U == null) {
                try {
                    al();
                } catch (cbo e12) {
                    this.bg = true;
                    ay();
                    bvx.d("CODEC_SPLICE_DAV1D", "Error initializing MediaCodec for pipelined pre-decode: ", e12);
                    return;
                }
            }
            if (this.U != null) {
                do {
                    try {
                    } catch (cbo e13) {
                        e = e13;
                        this.bg = true;
                        bvx.d("CODEC_SPLICE_DAV1D", "Error feeding MediaCodec in pipelined pre-decode", e);
                        return;
                    } catch (IllegalStateException e14) {
                        e = e14;
                        this.bg = true;
                        bvx.d("CODEC_SPLICE_DAV1D", "Error feeding MediaCodec in pipelined pre-decode", e);
                        return;
                    }
                } while (aW());
                if (aY()) {
                    return;
                }
                try {
                    try {
                        if (this.U == null || aY()) {
                            return;
                        }
                        clk clkVar = this.U;
                        MediaCodec.BufferInfo bufferInfo = this.S;
                        int iB = clkVar.b(bufferInfo);
                        while (iB == -2) {
                            super.ax();
                            iB = clkVar.b(bufferInfo);
                        }
                        if (iB >= 0) {
                            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                                super.aw(this.e);
                                clkVar.k(iB, false);
                                return;
                            }
                            try {
                                this.X = clkVar.f(iB);
                                this.W = iB;
                                ByteBuffer byteBuffer = this.X;
                                if (byteBuffer != null) {
                                    MediaCodec.BufferInfo bufferInfo2 = this.S;
                                    byteBuffer.position(bufferInfo2.offset);
                                    this.X.limit(bufferInfo2.offset + bufferInfo2.size);
                                }
                                MediaCodec.BufferInfo bufferInfo3 = this.S;
                                this.Y = (bufferInfo3.presentationTimeUs > this.e ? 1 : (bufferInfo3.presentationTimeUs == this.e ? 0 : -1)) >>> 31;
                                long j3 = this.aa;
                                this.Z = j3 != -9223372036854775807L && j3 <= bufferInfo3.presentationTimeUs;
                                aR(bufferInfo3.presentationTimeUs);
                                this.E = false;
                                this.F = false;
                                yyg yygVar7 = this.ad;
                                if (yygVar7 == null || !yygVar7.S()) {
                                    return;
                                }
                                this.ad.n("rbrd", "dec_warm.mc");
                            } catch (IllegalStateException e15) {
                                yyg yygVar8 = this.ad;
                                if (yygVar8 != null && yygVar8.y() && juv.ba(e15)) {
                                    ao(e15);
                                }
                                try {
                                    clkVar.k(iB, false);
                                } catch (RuntimeException unused) {
                                }
                                throw e15;
                            }
                        }
                    } catch (cbo e16) {
                        e = e16;
                        this.bg = true;
                        bvx.d("CODEC_SPLICE_DAV1D", "Error dequeuing MediaCodec output buffer during pipelined pre-decode", e);
                    }
                } catch (IllegalStateException e17) {
                    e = e17;
                    this.bg = true;
                    bvx.d("CODEC_SPLICE_DAV1D", "Error dequeuing MediaCodec output buffer during pipelined pre-decode", e);
                }
            }
        }
    }

    @Override // defpackage.juv, defpackage.cdp
    public final boolean ag() {
        jvd jvdVar;
        if (!this.bl || (jvdVar = this.bm) == null) {
            return this.k ? this.ba : super.ag();
        }
        return jvdVar.ag();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0067  */
    /* JADX WARN: Code duplicated, block: B:44:0x006c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x0074  */
    /* JADX WARN: Code duplicated, block: B:49:0x007b  */
    /* JADX WARN: Code duplicated, block: B:60:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    @Override // defpackage.juv, defpackage.cdp
    public final boolean ah() {
        boolean z;
        yyg yygVar;
        jvd jvdVar;
        if (this.bl && (jvdVar = this.bm) != null) {
            return jvdVar.ah();
        }
        boolean z2 = true;
        if ((!this.ad.B() || !this.l || (this.n && (!this.am || !Z()))) && (!this.ad.z() || !this.l || this.n)) {
            if (!this.l || (yygVar = this.ad) == null) {
                if (!this.k) {
                    if (this.T == null && ((Z() || this.aO != null) && (this.aV == 3 || !bY()))) {
                        this.aX = -9223372036854775807L;
                    } else if (this.aX == -9223372036854775807L) {
                        z2 = false;
                    } else if (p().b() >= this.aX) {
                        this.aX = -9223372036854775807L;
                        z2 = false;
                    }
                    if (!this.ad.L() || this.ad.B()) {
                        z = this.ao;
                    } else {
                        z = this.F;
                    }
                    an(z2, z, "dav1d");
                } else {
                    if (!super.ah()) {
                        return false;
                    }
                    this.aA.c();
                }
            } else if (!this.k || !yygVar.H() || this.aO == null) {
                if (!this.k && this.ad.I() && aY()) {
                    this.aA.c();
                } else if (!this.k) {
                    if (this.T == null) {
                        if (this.aX == -9223372036854775807L) {
                            z2 = false;
                        } else if (p().b() >= this.aX) {
                            this.aX = -9223372036854775807L;
                            z2 = false;
                        }
                    } else if (this.aX == -9223372036854775807L) {
                        z2 = false;
                    } else if (p().b() >= this.aX) {
                        this.aX = -9223372036854775807L;
                        z2 = false;
                    }
                    if (this.ad.L()) {
                        z = this.ao;
                    } else {
                        z = this.ao;
                    }
                    an(z2, z, "dav1d");
                } else {
                    if (!super.ah()) {
                        return false;
                    }
                    this.aA.c();
                }
            }
        }
        return z2;
    }

    @Override // defpackage.juv
    protected final void aj() {
        if (this.m && this.n) {
            this.m = false;
            bO();
        }
    }

    @Override // defpackage.juv
    protected final void ak(DecoderInputBuffer decoderInputBuffer) {
        if (this.bh) {
            super.ak(decoderInputBuffer);
            return;
        }
        long jE = e();
        this.ad.a.c.a(decoderInputBuffer.supplementalData, jE != -9223372036854775807L ? decoderInputBuffer.timeUs - jE : decoderInputBuffer.timeUs);
    }

    @Override // defpackage.juv
    protected final void as(long j) {
        if (this.k) {
            this.bf--;
        } else {
            super.as(j);
        }
    }

    @Override // defpackage.juv
    protected final void au(DecoderInputBuffer decoderInputBuffer) {
        if (!this.k || (this.ad.B() && this.ap)) {
            if (!this.ad.B() ? this.ap : this.l) {
                if (this.an) {
                    this.an = false;
                    if (this.l) {
                        this.K = decoderInputBuffer.timeUs;
                        if (this.ad.r()) {
                            long j = this.H;
                            this.y = j > 0 ? Math.max(decoderInputBuffer.timeUs, this.I + j) : decoderInputBuffer.timeUs;
                        } else {
                            this.y = decoderInputBuffer.timeUs;
                        }
                    }
                }
            }
            super.au(decoderInputBuffer);
            this.aA.b();
        }
    }

    @Override // defpackage.juv
    protected final void av(long j) {
        yyg yygVar = this.ad;
        if (yygVar != null && (yygVar.B() || this.ad.I())) {
            this.q = true;
        }
        if (this.n) {
            super.av(j);
        } else if (this.k) {
            aN();
        } else {
            aM();
        }
    }

    @Override // defpackage.juv
    protected final void az(clk clkVar, int i, long j, long j2) {
        super.az(clkVar, i, j, j2);
        if (this.ad.B()) {
            this.am = true;
            this.ay = bwp.y(SystemClock.elapsedRealtime());
            if (!this.l || this.k || !this.n || this.q) {
                return;
            }
            this.y = 0L;
            av(j);
        }
    }

    @Override // defpackage.juv
    protected final boolean bb() {
        return this.k;
    }

    @Override // defpackage.juv
    protected final boolean bc(long j, boolean z) {
        if (!this.bi) {
            return super.bc(j, z);
        }
        int iL = l(j);
        if (iL == 0) {
            return false;
        }
        cay cayVar = this.aq;
        if (z) {
            cayVar.d += iL;
            return false;
        }
        cayVar.j++;
        aQ(iL, 0);
        return false;
    }

    @Override // defpackage.juv
    protected final boolean bd(long j, long j2, boolean z) {
        if (this.bi) {
            return true;
        }
        return super.bd(j, j2, z);
    }

    @Override // defpackage.juv
    protected final boolean bf(long j, long j2, boolean z) {
        long j3 = this.az;
        if ((j3 <= 0 || j2 - this.ay <= j3) && super.bf(j, j2, z)) {
            return true;
        }
        this.ay = j2;
        return false;
    }

    @Override // defpackage.juv
    public final boolean bi(long j, long j2) {
        if (this.k) {
            return bZ(j) && j2 > 100000;
        }
        return rpi.E(j, j2);
    }

    @Override // defpackage.juv
    protected final boolean bj(clo cloVar) {
        return false;
    }

    @Override // defpackage.juv
    protected final aamu bn(clo cloVar, bse bseVar, bse[] bseVarArr) {
        int iIntValue;
        int i;
        int i2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = cloVar.e;
        int iIntValue2 = Alert.DURATION_SHOW_INDEFINITELY;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            iIntValue = Integer.MAX_VALUE;
        } else {
            iIntValue2 = ((Integer) videoCapabilities.getSupportedWidths().getUpper()).intValue();
            iIntValue = ((Integer) videoCapabilities.getSupportedHeights().getUpper()).intValue();
        }
        aamu aamuVarBn = super.bn(cloVar, bseVar, bseVarArr);
        int i3 = aamuVarBn.c;
        int i4 = aamuVarBn.b;
        boolean z = i3 >= i4;
        wgq wgqVar = at;
        if (z) {
            i = wgqVar.er;
            i2 = wgqVar.es;
        } else {
            i = wgqVar.es;
            i2 = wgqVar.er;
        }
        int iMin = Math.min(Math.max(i3, i), iIntValue2);
        int iMin2 = Math.min(Math.max(i4, i2), iIntValue);
        yyg yygVar = this.ad;
        yyf yyfVar = yygVar.d;
        if (yyfVar != null ? yyfVar.r : yygVar.a.d.am()) {
            iMin = Math.max(i3, Math.min(i, iIntValue2));
            iMin2 = Math.max(i4, Math.min(i2, iIntValue));
        }
        bsd bsdVar = new bsd();
        bsdVar.u = iMin;
        bsdVar.v = iMin2;
        bsdVar.e(bseVar.q);
        return new aamu(iMin, iMin2, juv.d(cloVar, new bse(bsdVar), false), (char[]) null);
    }

    @Override // defpackage.juv
    protected final void bo(String str, gmj gmjVar, long j, long j2) {
        super.bo(str, gmjVar, j, j2);
        this.ad.m(zhc.a(this.V));
    }

    public final void bp(int i, Object obj) {
        if (i == 1) {
            if (obj == null || this.v != obj) {
                bS(obj);
                return;
            }
            return;
        }
        if (i == 7) {
            this.aS = (ctm) obj;
            return;
        }
        if (i != 10001) {
            if (i != 10003) {
                super.A(i, obj);
                return;
            } else {
                aP();
                return;
            }
        }
        yxu yxuVar = (yxu) obj;
        if (yxuVar == null) {
            yxuVar = yxu.a;
        }
        this.aA = yxuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [cju, java.lang.Object] */
    protected final void br(ccu ccuVar) throws cbo {
        caz cazVar;
        String str;
        this.an = true;
        Object obj = ccuVar.b;
        obj.getClass();
        bV(ccuVar.a);
        bse bseVar = this.T;
        bse bseVar2 = (bse) obj;
        this.T = bseVar2;
        if (this.ar == null) {
            bD();
            this.bq.H(bseVar2, null);
            return;
        }
        if (bseVar == null) {
            this.bq.H(bseVar2, null);
            return;
        }
        if (this.ad.K() && this.l && !this.k && Objects.equals(this.aU, this.aT) && aU(bseVar2) && !aU(bseVar)) {
            this.bq.H(bseVar2, null);
            return;
        }
        if (this.aU != this.aT) {
            cazVar = new caz(this.ar.getName(), bseVar, bseVar2, 0, SemanticState.Focused);
        } else {
            String name = this.ar.getName();
            String str2 = bseVar.q;
            cazVar = (str2 == null || (str = bseVar2.q) == null || str2.equals(str)) ? new caz(name, bseVar, bseVar2, 3, 0) : new caz(name, bseVar, bseVar2, 0, 8);
        }
        if (cazVar.d == 0 || !aU(this.T)) {
            if (!aU(this.T)) {
                aO(this.T);
                this.ak = 3;
            } else if (this.al) {
                this.ak = 1;
            } else {
                bP();
                bD();
            }
        }
        this.bq.H(bseVar2, cazVar);
    }

    final void bs() throws cbo {
        if (this.ad.B()) {
            this.am = false;
        }
        if (this.k) {
            bH();
            return;
        }
        try {
            bM();
        } catch (cbo e) {
            bvx.d("CODEC_SPLICE_DAV1D", "enable MediaCodec error", e);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0184 A[PHI: r10
      0x0184: PHI (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v3 java.lang.String) binds: [B:121:0x017e, B:123:0x0182] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0109, code lost:
    
        if (r8 == (-17)) goto L83;
     */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, ywn] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void bt(androidx.media3.decoder.VideoDecoderOutputBuffer r18, long r19, defpackage.bse r21) throws androidx.media3.decoder.av1.Dav1dDecoderException {
        /*
            Method dump skipped, instruction units count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jux.bt(androidx.media3.decoder.VideoDecoderOutputBuffer, long, bse):void");
    }

    final void bu() {
        VideoDecoderOutputBuffer videoDecoderOutputBuffer;
        this.ak = 0;
        this.au = 0L;
        this.av = 0L;
        this.ai = false;
        this.ao = false;
        this.F = false;
        yyg yygVar = this.ad;
        if (yygVar != null && yygVar.H() && !this.k && (videoDecoderOutputBuffer = this.aO) != null) {
            videoDecoderOutputBuffer.release();
            this.aO = null;
            int i = this.bf;
            if (i > 0) {
                this.bf = i - 1;
            }
        }
        aD();
        this.l = false;
        this.ax = -9223372036854775807L;
        this.m = false;
        this.n = false;
        this.o = false;
        this.ap = false;
        this.p = null;
        this.q = false;
        this.bg = false;
        this.y = 0L;
        this.z = false;
        yyg yygVar2 = this.ad;
        int i2 = 1;
        if (yygVar2 == null || !yygVar2.B()) {
            this.aV = 1;
        } else {
            boolean z = this.k;
            if (z && this.am) {
                i2 = 3;
            }
            this.aV = i2;
            if (!z && this.am) {
                this.O.o();
            }
        }
        yyg yygVar3 = this.ad;
        long jH = yygVar3 != null ? yygVar3.h() : 0L;
        ctp ctpVar = this.O;
        if (jH <= 0) {
            jH = 50000;
        }
        ctpVar.a = jH;
    }

    protected final void bv(boolean z) {
        this.aY = z;
        long j = this.aI;
        this.aX = j > 0 ? SystemClock.elapsedRealtime() + j : -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00e8 A[PHI: r7 r24
      0x00e8: PHI (r7v14 int) = (r7v7 int), (r7v12 int), (r7v12 int), (r7v12 int), (r7v12 int), (r7v18 int) binds: [B:88:0x0156, B:91:0x015f, B:93:0x0165, B:126:0x01e3, B:106:0x01a1, B:57:0x00e5] A[DONT_GENERATE, DONT_INLINE]
      0x00e8: PHI (r24v7 long) = (r24v1 long), (r24v5 long), (r24v5 long), (r24v5 long), (r24v5 long), (r24v9 long) binds: [B:88:0x0156, B:91:0x015f, B:93:0x0165, B:126:0x01e3, B:106:0x01a1, B:57:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x0158  */
    /* JADX WARN: Multi-variable type inference failed */
    final boolean bw(long j, long j2) throws cbo, Dav1dDecoderException {
        int i;
        long j3;
        int i2;
        bse bseVar;
        int iL;
        juw juwVar = this.ar;
        if (juwVar == null) {
            return false;
        }
        VideoDecoderOutputBuffer videoDecoderOutputBufferDequeueOutputBuffer = this.aO;
        int i3 = 1;
        if (videoDecoderOutputBufferDequeueOutputBuffer == null) {
            videoDecoderOutputBufferDequeueOutputBuffer = juwVar.dequeueOutputBuffer();
            this.aO = videoDecoderOutputBufferDequeueOutputBuffer;
            if (videoDecoderOutputBufferDequeueOutputBuffer == null) {
                if (this.ak != 3) {
                    return false;
                }
                if (this.ad.B()) {
                    if (!this.ai) {
                        return false;
                    }
                    if (this.bf > 0) {
                        long j4 = this.H;
                        if (j4 <= 0 || j < j4) {
                            return false;
                        }
                    }
                }
                this.n = true;
                this.J = -1L;
                this.ak = 4;
                bB();
                aj();
                return false;
            }
            this.aq.f += videoDecoderOutputBufferDequeueOutputBuffer.skippedOutputBufferCount;
            this.bf -= videoDecoderOutputBufferDequeueOutputBuffer.skippedOutputBufferCount;
        }
        if (videoDecoderOutputBufferDequeueOutputBuffer.isEndOfStream()) {
            this.ao = false;
            if (!this.ad.B() || this.ak != 3) {
                this.F = false;
            }
            int i4 = this.ak;
            if (i4 == 2) {
                bP();
                bD();
                return false;
            }
            if (i4 != 3) {
                this.aO.release();
                this.aO = null;
                this.ba = true;
                return false;
            }
            this.n = true;
            this.J = j;
            this.ak = 4;
            bB();
            aj();
            return false;
        }
        long j5 = this.aO.timeUs;
        if (this.ad.B()) {
            this.R = false;
        }
        if (this.aW == -9223372036854775807L) {
            this.aW = (this.ad.B() && this.am) ? j - 1 : j;
        }
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.aO;
        videoDecoderOutputBuffer.getClass();
        long j6 = videoDecoderOutputBuffer.timeUs;
        long j7 = j6 - j;
        if (bY()) {
            bwn bwnVar = this.aK;
            bse bseVar2 = (bse) bwnVar.d(j6);
            if (bseVar2 != null) {
                this.aM = bseVar2;
            } else if (this.aM == null) {
                this.aM = (bse) bwnVar.c();
            }
            long j8 = j6 - this.d;
            if (this.ad.R() && ca() && !this.aY) {
                i = 1;
                j3 = j5;
                i2 = 2;
            } else {
                int i5 = this.b;
                int i6 = this.aV;
                if (i6 != 0) {
                    if (i6 == 1) {
                        i = 1;
                        j3 = j5;
                    } else {
                        if (i6 != 3) {
                            throw new IllegalStateException();
                        }
                        i = 1;
                        j3 = j5;
                        long jY = bwp.y(SystemClock.elapsedRealtime()) - this.ay;
                        i2 = 2;
                        if (i5 != 2 || !bi(j7, jY)) {
                        }
                    }
                    bseVar = this.aM;
                    if (bseVar != null) {
                        bt(videoDecoderOutputBuffer, j8, bseVar);
                        i3 = i;
                    } else {
                        i3 = 0;
                    }
                } else {
                    i = 1;
                    j3 = j5;
                    i2 = 2;
                    if (i5 == 2) {
                        bseVar = this.aM;
                        if (bseVar != null) {
                            bt(videoDecoderOutputBuffer, j8, bseVar);
                            i3 = i;
                        } else {
                            i3 = 0;
                        }
                    }
                }
            }
            if (this.b == i2 && j != this.aW) {
                if (j7 >= -500000 || (iL = l(j)) == 0) {
                    long j9 = this.az;
                    if ((j9 > 0 && j2 - this.ay > j9) || !bZ(j7)) {
                        this.ay = j2;
                        if (j7 < (i != this.l ? 30000 : 40000)) {
                            bse bseVar3 = this.aM;
                            bseVar3.getClass();
                            bt(videoDecoderOutputBuffer, j8, bseVar3);
                        }
                    } else if (this.ad.R() && ca() && !this.aY) {
                        bW(videoDecoderOutputBuffer);
                    } else {
                        bz(videoDecoderOutputBuffer);
                    }
                    i3 = i;
                } else {
                    if (this.ad.R() && ca() && !this.aY) {
                        cay cayVar = this.aq;
                        cayVar.d += iL;
                        cayVar.f += this.bf;
                    } else {
                        this.aq.j += i;
                        bX(iL, this.bf);
                    }
                    bB();
                }
            }
            i3 = 0;
        } else if (bZ(j7)) {
            bW(videoDecoderOutputBuffer);
            i = 1;
            j3 = j5;
        } else {
            i = 1;
            j3 = j5;
            i3 = 0;
        }
        long j10 = j3;
        if (i3 != 0) {
            as(j10);
            this.aO = null;
        }
        if (this.ad.B() && this.k && !this.n) {
            i = 0;
        }
        boolean z = (this.ad.L() || this.ad.B()) ? this.ao : this.F;
        if (i3 != 0 && ((!this.ad.B() || this.R) && this.l && z && i != 0)) {
            this.ao = false;
            this.F = false;
            this.L = j;
            yyg yygVar = this.ad;
            if (yygVar == null || !yygVar.A() || this.K == 0) {
                this.K = j10;
            }
            if (this.ad.S()) {
                this.ad.n("rbrd", "dec_warm.dav1d");
            }
        }
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x018c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0192  */
    /* JADX WARN: Code duplicated, block: B:153:0x0237  */
    /* JADX WARN: Code duplicated, block: B:155:0x0246  */
    final boolean bx() throws cbo {
        ByteBuffer byteBuffer;
        long j;
        if (this.ak == 4) {
            return false;
        }
        bse bseVar = this.T;
        if (bseVar != null && !Objects.equals(bseVar.q, "video/av01")) {
            if (this.ak == 0) {
                ccu ccuVarR = r();
                ccuVarR.a();
                ccuVarR.b = bseVar;
                ccuVarR.a = this.aU;
                br(ccuVarR);
            }
            if ((!this.ad.B() && !this.ad.q()) || this.ak != 3 || this.ai) {
                return false;
            }
        }
        juw juwVar = this.ar;
        if (juwVar == null || this.ak == 2 || this.aZ) {
            return false;
        }
        DecoderInputBuffer decoderInputBufferDequeueInputBuffer = this.aN;
        if (decoderInputBufferDequeueInputBuffer == null) {
            decoderInputBufferDequeueInputBuffer = juwVar.dequeueInputBuffer();
            this.aN = decoderInputBufferDequeueInputBuffer;
            if (decoderInputBufferDequeueInputBuffer == null) {
                return false;
            }
        }
        decoderInputBufferDequeueInputBuffer.getClass();
        int i = this.ak;
        if (i == 1) {
            decoderInputBufferDequeueInputBuffer.setFlags(4);
            juw juwVar2 = this.ar;
            juwVar2.getClass();
            juwVar2.queueInputBuffer(decoderInputBufferDequeueInputBuffer);
            this.aN = null;
            this.ak = 2;
            return false;
        }
        if (i == 3) {
            if (this.ai) {
                return false;
            }
            this.H = this.au;
            long j2 = this.av;
            this.I = j2;
            if (j2 == 0) {
                this.I = 41000L;
            }
            if (this.ad.q()) {
                decoderInputBufferDequeueInputBuffer.clear();
                decoderInputBufferDequeueInputBuffer.addFlag(4);
            } else {
                decoderInputBufferDequeueInputBuffer.setFlags(4);
            }
            juw juwVar3 = this.ar;
            if (juwVar3 != null) {
                juwVar3.queueInputBuffer(decoderInputBufferDequeueInputBuffer);
            }
            this.aN = null;
            this.ai = true;
            yyg yygVar = this.ad;
            if (yygVar == null || !yygVar.I()) {
                return false;
            }
            this.o = true;
            return false;
        }
        ccu ccuVarR2 = r();
        int iK = k(ccuVarR2, decoderInputBufferDequeueInputBuffer, 0);
        if (iK == -5) {
            br(ccuVarR2);
        } else {
            if (iK != -4) {
                return false;
            }
            yyg yygVar2 = this.ad;
            boolean z = (yygVar2 != null && yygVar2.A() && this.l) ? false : true;
            long j3 = decoderInputBufferDequeueInputBuffer.timeUs;
            long j4 = this.au;
            if (j3 > j4 && z) {
                this.au = j3;
                if (j4 > 0) {
                    this.av = j3 - j4;
                }
            }
            if (decoderInputBufferDequeueInputBuffer.isEndOfStream()) {
                this.aZ = true;
                juw juwVar4 = this.ar;
                juwVar4.getClass();
                juwVar4.queueInputBuffer(decoderInputBufferDequeueInputBuffer);
                this.aN = null;
                return false;
            }
            if (this.an) {
                bwn bwnVar = this.aK;
                bse bseVar2 = this.T;
                bseVar2.getClass();
                bwnVar.e(j3, bseVar2);
                this.aM = this.T;
                this.an = false;
                if (this.l) {
                    long j5 = decoderInputBufferDequeueInputBuffer.timeUs;
                    this.K = j5;
                    long j6 = this.H;
                    if (j6 > 0 && j5 < j6 && this.ad.S()) {
                        this.ad.n("ecdi", "ts_regress.dav1d;prev." + this.H + ";curr." + decoderInputBufferDequeueInputBuffer.timeUs);
                    }
                    if (this.ad.r()) {
                        long j7 = this.H;
                        this.y = j7 > 0 ? Math.max(decoderInputBufferDequeueInputBuffer.timeUs, this.I + j7) : decoderInputBufferDequeueInputBuffer.timeUs;
                    } else {
                        this.y = decoderInputBufferDequeueInputBuffer.timeUs;
                    }
                    if ((this.ad.C() || this.ad.B()) && this.ar != null) {
                        if (this.ad.B()) {
                            j = this.aH;
                            if (j == -9223372036854775807L || decoderInputBufferDequeueInputBuffer.timeUs >= j) {
                                j = this.H;
                                if (j <= 0) {
                                    j = this.y;
                                }
                            } else {
                                this.y = j;
                            }
                        } else {
                            j = this.H;
                            if (j <= 0) {
                                j = this.y;
                            }
                        }
                        this.ar.setOutputStartTimeUs(j);
                    }
                }
            }
            if (!this.ad.D() || !this.ad.D() || decoderInputBufferDequeueInputBuffer.isEndOfStream() || decoderInputBufferDequeueInputBuffer.hasSupplementalData() || decoderInputBufferDequeueInputBuffer.isEncrypted()) {
                decoderInputBufferDequeueInputBuffer.flip();
                decoderInputBufferDequeueInputBuffer.format = this.T;
                if (!this.ad.B()) {
                    au(decoderInputBufferDequeueInputBuffer);
                }
                juw juwVar5 = this.ar;
                juwVar5.getClass();
                juwVar5.queueInputBuffer(decoderInputBufferDequeueInputBuffer);
                this.bf++;
                this.al = true;
                this.aq.c++;
                this.aN = null;
            } else {
                long j8 = this.H;
                if (j8 <= 0) {
                    j8 = this.y;
                }
                boolean z2 = (this.ad.L() || this.ad.B()) ? this.ao : this.F;
                if (!this.l || (j8 <= 0 ? !z2 : decoderInputBufferDequeueInputBuffer.timeUs >= j8)) {
                    decoderInputBufferDequeueInputBuffer.flip();
                    decoderInputBufferDequeueInputBuffer.format = this.T;
                    if (!this.ad.B()) {
                        au(decoderInputBufferDequeueInputBuffer);
                    }
                    juw juwVar6 = this.ar;
                    juwVar6.getClass();
                    juwVar6.queueInputBuffer(decoderInputBufferDequeueInputBuffer);
                    this.bf++;
                    this.al = true;
                    this.aq.c++;
                    this.aN = null;
                } else {
                    if (!decoderInputBufferDequeueInputBuffer.notDependedOn()) {
                        cso csoVar = this.Q;
                        if (csoVar != null && (byteBuffer = decoderInputBufferDequeueInputBuffer.data) != null) {
                            if (decoderInputBufferDequeueInputBuffer.isKeyFrame()) {
                                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                                byteBufferDuplicate.flip();
                                csoVar.b(byteBufferDuplicate);
                            }
                            ByteBuffer byteBufferAsReadOnlyBuffer = decoderInputBufferDequeueInputBuffer.data.asReadOnlyBuffer();
                            byteBufferAsReadOnlyBuffer.flip();
                            int iA = csoVar.a(byteBufferAsReadOnlyBuffer, true);
                            if (iA != byteBufferAsReadOnlyBuffer.position()) {
                                if (iA != byteBufferAsReadOnlyBuffer.limit() && iA < byteBufferAsReadOnlyBuffer.capacity()) {
                                    decoderInputBufferDequeueInputBuffer.data.position(iA);
                                }
                            }
                        }
                        decoderInputBufferDequeueInputBuffer.flip();
                        decoderInputBufferDequeueInputBuffer.format = this.T;
                        if (!this.ad.B()) {
                            au(decoderInputBufferDequeueInputBuffer);
                        }
                        juw juwVar7 = this.ar;
                        juwVar7.getClass();
                        juwVar7.queueInputBuffer(decoderInputBufferDequeueInputBuffer);
                        this.bf++;
                        this.al = true;
                        this.aq.c++;
                        this.aN = null;
                    }
                    decoderInputBufferDequeueInputBuffer.clear();
                    this.aq.d++;
                }
            }
        }
        return true;
    }

    public final void by(dov dovVar) {
        this.ae = dovVar;
        jvd jvdVar = this.bm;
        if (jvdVar != null) {
            jvdVar.q = dovVar;
        }
    }

    @Override // defpackage.juv, defpackage.cdq
    public final int c(bse bseVar) {
        jvd jvdVar;
        if (this.bl && (jvdVar = this.bm) != null) {
            return jvdVar.c(bseVar);
        }
        if (!this.k) {
            return super.c(bseVar);
        }
        if (aU(bseVar) && Dav1dLibrary.isAvailable()) {
            return bseVar.S != 0 ? 130 : 148;
        }
        return SemanticState.Focused;
    }

    @Override // defpackage.juv, defpackage.cdp, defpackage.cdq
    public final String f() {
        return (!this.bl || this.bm == null) ? "CODEC_SPLICE_DAV1D" : "UnifiedSwitchingVideoRenderer";
    }

    @Override // defpackage.juv
    protected final caz h(clo cloVar, bse bseVar, bse bseVar2) {
        return this.ad.Q() ? super.h(cloVar, bseVar, bseVar2) : new caz(cloVar.b, bseVar, bseVar2, 0, 4);
    }

    @Override // defpackage.juv, defpackage.cav, defpackage.cdp
    public final void z() {
        if (this.aV == 0) {
            this.aV = 1;
        }
    }
}
