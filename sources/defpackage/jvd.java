package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.decoder.DecoderInputBuffer;
import app.rive.semantics.SemanticState;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jvd extends cav {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private long H;
    private long I;
    private long J;
    private long K;
    private long L;
    private boolean M;
    private jva N;
    private jva O;
    private Surface P;
    private Surface Q;
    private bse R;
    private bse[] S;
    private cju T;
    private jva U;
    private long V;
    private boolean W;
    private long X;
    private long Y;
    private long Z;
    private long aa;
    private long ab;
    private long ac;
    private zjv ad;
    private btz ae;
    private boolean af;
    private boolean ag;
    private int ah;
    private int ai;
    private long aj;
    private long ak;
    private long al;
    private int am;
    private long an;
    private final mqd ao;
    public cay k;
    public zjv l;
    public final Context m;
    public final clu n;
    public final yyg o;
    public pj p;
    public dov q;
    private final DecoderInputBuffer r;
    private boolean s;
    private boolean t;
    private boolean u;
    private final boolean v;
    private volatile boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public jvd(Context context, dov dovVar, yyg yygVar, cli cliVar, clu cluVar) {
        super(2);
        this.H = -9223372036854775807L;
        this.ab = 0L;
        this.ac = 0L;
        this.am = 1;
        this.an = -9223372036854775807L;
        this.m = context;
        this.q = dovVar;
        this.o = yygVar;
        this.n = cluVar;
        this.k = new cay();
        this.r = new DecoderInputBuffer(2);
        this.v = true;
        this.ao = new mqd(this, cliVar);
    }

    private final void ai(bse bseVar, cju cjuVar) throws cbo {
        jva jvaVar = this.N;
        boolean z = false;
        if (jvaVar != null && (jvaVar instanceof jug) != au(bseVar)) {
            z = true;
        }
        if (this.N != null) {
            jva jvaVar2 = this.U;
            if (jvaVar2 != null) {
                jvaVar2.e();
            }
            jva jvaVar3 = this.N;
            this.U = jvaVar3;
            jvaVar3.l();
            this.N = null;
        }
        this.an = -9223372036854775807L;
        this.B = z;
        h(bseVar, cjuVar);
    }

    private final void aj() {
        if (this.ah <= 0 || this.p == null) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.p.F(this.ah, jElapsedRealtime - this.aj);
        this.ah = 0;
        this.aj = jElapsedRealtime;
    }

    private final void ak(Surface surface) {
        if (!this.af && surface != null) {
            this.af = true;
            pj pjVar = this.p;
            if (pjVar != null) {
                pjVar.I(surface);
            }
        }
        if (this.q == null || surface == null || this.u) {
            return;
        }
        if (Objects.equals(surface, this.Q) && !this.ag) {
            this.ag = true;
            this.q.O(this.ac);
        } else if (Objects.equals(surface, this.P) && this.ag) {
            this.ag = false;
            this.q.N(this.ab);
        }
    }

    private final void al(bse bseVar) {
        int i;
        int i2 = bseVar.w;
        if (i2 <= 0 || (i = bseVar.x) <= 0) {
            return;
        }
        float f = bseVar.D;
        if (f == -1.0f) {
            f = 1.0f;
        }
        btz btzVar = new btz(i2, i, f);
        if (btzVar.equals(this.ae)) {
            return;
        }
        this.ae = btzVar;
        pj pjVar = this.p;
        if (pjVar != null) {
            pjVar.L(btzVar);
        }
    }

    private final void am() throws cbo {
        if (this.N == null || this.G || this.Z <= 0) {
            return;
        }
        DecoderInputBuffer decoderInputBufferNewNoDataInstance = DecoderInputBuffer.newNoDataInstance();
        decoderInputBufferNewNoDataInstance.setFlags(4);
        try {
            if (this.N.n(decoderInputBufferNewNoDataInstance)) {
                this.G = true;
            }
        } catch (RuntimeException e) {
            throw q(e, this.N.b() != null ? this.N.b() : this.R, false, 4003);
        }
    }

    private final void an() {
        if (this.O != null) {
            if (this.N != null) {
                jva jvaVar = this.U;
                if (jvaVar != null) {
                    jvaVar.e();
                }
                jva jvaVar2 = this.N;
                this.U = jvaVar2;
                jvaVar2.l();
            }
            jva jvaVar3 = this.O;
            this.N = jvaVar3;
            jvaVar3.g(-9223372036854775807L);
            this.O = null;
            this.u = false;
            this.A = false;
            this.y = false;
            this.z = false;
            this.G = false;
            if (this.N.q()) {
                ak(d(this.N));
            }
            this.an = -9223372036854775807L;
        }
    }

    private final void ao() {
        jva jvaVar = this.N;
        if (jvaVar != null) {
            jvaVar.e();
            this.N = null;
        }
    }

    private final void ap() {
        jva jvaVar = this.O;
        if (jvaVar != null) {
            jvaVar.e();
            this.O = null;
        }
    }

    private final void aq() {
        this.Z = 0L;
        this.aa = 0L;
        this.I = 0L;
        this.J = 0L;
        this.K = 0L;
        this.L = 0L;
        this.M = false;
        this.D = false;
        this.C = false;
        this.G = false;
    }

    private final void ar() {
        this.H = -9223372036854775807L;
        this.F = false;
        this.E = false;
    }

    private final void as(Surface surface, boolean z) {
        jva jvaVar = this.N;
        if (jvaVar != null && (jvaVar instanceof jug) == z) {
            jvaVar.h(surface);
        }
        jva jvaVar2 = this.O;
        if (jvaVar2 == null || (jvaVar2 instanceof jug) != z) {
            return;
        }
        jvaVar2.h(surface);
    }

    private final boolean at(jva jvaVar, bse bseVar) {
        if (jvaVar == null || jvaVar.b() == null || (jvaVar instanceof jug) != au(bseVar)) {
            return false;
        }
        return Objects.equals(jvaVar.b(), bseVar) || (aw(jvaVar.b(), bseVar) && jvaVar.r(bseVar));
    }

    private final boolean au(bse bseVar) {
        clu cluVar;
        zjv zjvVar;
        if (bseVar == null) {
            return false;
        }
        String str = bseVar.q;
        if (!"video/av01".equalsIgnoreCase(str) || bseVar.S != 0) {
            return false;
        }
        yyg yygVar = this.o;
        if (yygVar != null) {
            if ((yygVar.U() && (zjvVar = this.l) != null && zjvVar != zjv.g) || !yygVar.M()) {
                return false;
            }
            if (yygVar.N() && !zic.i()) {
                return false;
            }
        }
        if (yygVar != null && yygVar.J() && (cluVar = this.n) != null) {
            try {
                if (!cluVar.a(str, false, false).isEmpty()) {
                    return false;
                }
            } catch (Exception unused) {
            }
        }
        return true;
    }

    private final boolean av(jva jvaVar) {
        yyg yygVar = this.o;
        if (yygVar == null || jvaVar == null) {
            return false;
        }
        return jvaVar instanceof jug ? yygVar.H() : yygVar.I();
    }

    private static final boolean aw(bse bseVar, bse bseVar2) {
        String str;
        String str2 = bseVar.q;
        if (str2 == null || (str = bseVar2.q) == null) {
            return false;
        }
        return str2.equals(str);
    }

    private final Surface d(jva jvaVar) {
        if (jvaVar == null) {
            return null;
        }
        return jvaVar instanceof jug ? this.Q : this.P;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Type inference failed for: r0v2, types: [cli, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [cli, java.lang.Object] */
    private final jva e(bse bseVar) {
        boolean z;
        zjv zjvVar;
        clu cluVar;
        mqd mqdVar = this.ao;
        if (mqdVar == null) {
            return null;
        }
        boolean z2 = this.w;
        jvd jvdVar = (jvd) mqdVar.b;
        yyg yygVar = jvdVar.o;
        if (yygVar == null || !yygVar.J() || (cluVar = jvdVar.n) == null) {
            z = false;
        } else {
            String str = bseVar.q;
            if ("video/av01".equalsIgnoreCase(str)) {
                try {
                    z = !cluVar.a(str, false, false).isEmpty();
                } catch (Exception unused) {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        if (!"video/av01".equalsIgnoreCase(bseVar.q) || z) {
            jvd jvdVar2 = (jvd) mqdVar.b;
            return new jul(jvdVar2.m, jvdVar2.o, mqdVar.a, jvdVar2.n);
        }
        jvd jvdVar3 = (jvd) mqdVar.b;
        yyg yygVar2 = jvdVar3.o;
        if (yygVar2 != null && yygVar2.U() && (zjvVar = jvdVar3.l) != null && zjvVar != zjv.g) {
            return new jul(jvdVar3.m, yygVar2, mqdVar.a, jvdVar3.n);
        }
        jug jugVar = new jug(yygVar2);
        jugVar.a = z2 && yygVar2 != null && yygVar2.F();
        return jugVar;
    }

    private final String g(String str) {
        StringBuilder sb = new StringBuilder(";sf_valid.");
        Surface surface = Objects.equals(str, "dav1d") ? this.Q : this.P;
        int i = 0;
        if (surface != null && surface.isValid()) {
            i = 1;
        }
        sb.append(i);
        yyg yygVar = this.o;
        if (yygVar != null && yygVar.O()) {
            sb.append(";sf_wk.1");
        }
        return sb.toString();
    }

    private final void h(bse bseVar, cju cjuVar) throws cbo {
        jva jvaVarE = e(bseVar);
        this.N = jvaVarE;
        if (jvaVarE == null) {
            throw q(new IllegalStateException("Failed to create decoder engine for format: ".concat(String.valueOf(String.valueOf(bseVar)))), bseVar, false, 4001);
        }
        jvaVarE.k(this.ak);
        this.N.i(this.am);
        this.N.j(b());
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        jva jvaVar = this.N;
        int iA = jvaVar.a(bseVar, d(jvaVar), cjuVar, this.k);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        if (iA == 2) {
            this.w = true;
        } else if (iA != 0) {
            throw q(new IllegalStateException(enb.b(bseVar, "Failed to initialize decoder engine for format: ", ", result=1")), bseVar, false, 4001);
        }
        pj pjVar = this.p;
        if (pjVar != null) {
            pjVar.C(this.N.c(), SystemClock.elapsedRealtime(), jElapsedRealtime2);
        }
        yyg yygVar = this.o;
        if (yygVar == null || !yygVar.S()) {
            return;
        }
        String str = true != this.u ? "codec_created.v" : "warmup_codec_created.v";
        yygVar.n("ecdi", str + ";name." + this.N.c());
    }

    @Override // defpackage.cav, defpackage.cdm
    public final void A(int i, Object obj) throws cbo {
        yyg yygVar;
        yyg yygVar2;
        jva jvaVar;
        if (i != 1) {
            if (i == 4) {
                int iIntValue = ((Integer) obj).intValue();
                this.am = iIntValue;
                jva jvaVar2 = this.N;
                if (jvaVar2 != null) {
                    jvaVar2.i(iIntValue);
                }
                jva jvaVar3 = this.O;
                if (jvaVar3 != null) {
                    jvaVar3.i(this.am);
                    return;
                }
                return;
            }
            if (i != 10004) {
                if (i == 10008) {
                    Surface surfaceX = hna.X(obj);
                    if (surfaceX != null) {
                        if (Objects.equals(this.P, surfaceX)) {
                            this.P = null;
                            this.af = false;
                            as(null, false);
                        }
                        if (Objects.equals(this.Q, surfaceX)) {
                            this.Q = null;
                            this.ag = false;
                            as(null, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == 10100) {
                    hna.Y(obj);
                    Surface surfaceX2 = hna.X(obj);
                    if (!Objects.equals(this.Q, surfaceX2)) {
                        this.ag = false;
                        this.af = false;
                    }
                    this.Q = surfaceX2;
                    this.ac = hna.W(obj);
                    if (this.Q != null && (yygVar2 = this.o) != null && yygVar2.S()) {
                        yygVar2.n("ecdi", "sf_swap.dav1d;sf_swap.attached:sec");
                    }
                    as(this.Q, true);
                    return;
                }
                switch (i) {
                    case 10102:
                        if (this.u) {
                            yyg yygVar3 = this.o;
                            if (yygVar3 != null && yygVar3.S()) {
                                yygVar3.n("ecdi", true != (this.O instanceof jug) ? "sf_swap.mc;sf_swap.done:pri" : "sf_swap.dav1d;sf_swap.done:sec");
                            }
                            an();
                            if (this.Z > 0) {
                                this.M = true;
                            }
                        }
                        break;
                    case 10103:
                        zjv zjvVar = this.l;
                        zjv zjvVar2 = (zjv) obj;
                        this.l = zjvVar2;
                        jva jvaVar4 = this.N;
                        if (jvaVar4 != null && this.R != null && zjvVar != zjvVar2) {
                            yyg yygVar4 = this.o;
                            if (yygVar4 != null && yygVar4.K() && this.u && (jvaVar = this.O) != null) {
                                jvaVar4 = jvaVar;
                            }
                            if ((jvaVar4 instanceof jug) != au(this.R)) {
                                ai(this.R, this.T);
                            }
                            break;
                        }
                        break;
                    case 10104:
                        this.ad = (zjv) obj;
                        break;
                }
                return;
            }
        } else if (obj == null) {
            this.P = null;
            this.Q = null;
            as(null, false);
            as(null, true);
            this.ag = false;
            this.af = false;
            return;
        }
        hna.Y(obj);
        Surface surfaceX3 = hna.X(obj);
        if (!Objects.equals(this.P, surfaceX3)) {
            this.af = false;
        }
        this.P = surfaceX3;
        this.ab = hna.W(obj);
        if (this.P != null && (yygVar = this.o) != null && yygVar.S()) {
            yygVar.n("ecdi", "sf_swap.mc;sf_swap.attached:pri");
        }
        as(this.P, false);
    }

    @Override // defpackage.cav
    protected final void D() {
        this.r.clear();
        this.x = false;
        this.y = false;
        this.z = false;
        this.s = false;
        this.t = false;
        this.A = false;
        aj();
        pj pjVar = this.p;
        if (pjVar != null) {
            pjVar.E(this.k);
        }
        yyg yygVar = this.o;
        if (yygVar != null && yygVar.E()) {
            this.k = new cay();
            this.ai = 0;
        }
        ar();
        aq();
        jva jvaVar = this.N;
        if (jvaVar != null) {
            jvaVar.e();
            this.N = null;
        }
        jva jvaVar2 = this.O;
        if (jvaVar2 != null) {
            jvaVar2.e();
            this.O = null;
        }
        jva jvaVar3 = this.U;
        if (jvaVar3 != null) {
            jvaVar3.e();
            this.U = null;
        }
        this.R = null;
        this.S = null;
        this.T = null;
        this.al = 0L;
        this.u = false;
        this.B = false;
        this.ad = null;
        this.ae = null;
        this.af = false;
        this.ag = false;
    }

    @Override // defpackage.cav
    public final void E(boolean z, boolean z2) {
        this.r.clear();
        this.af = false;
        this.ah = 0;
        this.aj = SystemClock.elapsedRealtime();
        pj pjVar = this.p;
        if (pjVar != null) {
            pjVar.G(this.k);
        }
    }

    @Override // defpackage.cav
    protected final void G(long j, boolean z, boolean z2) throws cbo {
        boolean z3;
        jva jvaVar;
        this.r.clear();
        this.x = false;
        this.y = false;
        this.z = false;
        this.s = false;
        this.t = false;
        this.af = false;
        aj();
        this.ai = this.k.g;
        ar();
        aq();
        boolean z4 = this.u;
        boolean z5 = this.B;
        jva jvaVar2 = this.N;
        boolean z6 = jvaVar2 instanceof jug;
        if (!z4 || j >= this.al) {
            bse[] bseVarArr = this.S;
            bse bseVar = (bseVarArr == null || bseVarArr.length <= 0) ? null : bseVarArr[0];
            if (bseVar == null) {
                ap();
            } else if (at(jvaVar2, bseVar)) {
                ap();
                this.R = bseVar;
            } else {
                if (at(this.O, bseVar)) {
                    ao();
                    this.N = this.O;
                    this.O = null;
                    this.R = bseVar;
                } else {
                    ao();
                    ap();
                    h(bseVar, this.T);
                    this.R = bseVar;
                    z3 = true;
                }
                this.u = false;
                this.A = false;
                this.B = false;
            }
            z3 = false;
            this.u = false;
            this.A = false;
            this.B = false;
        } else {
            ap();
            this.u = false;
            this.al = 0L;
            this.A = false;
            jva jvaVar3 = this.N;
            if (jvaVar3 == null || jvaVar3.b() == null) {
                this.R = null;
                this.S = null;
            } else {
                bse bseVarB = jvaVar3.b();
                this.R = bseVarB;
                this.S = new bse[]{bseVarB};
            }
            z3 = false;
        }
        dov dovVar = this.q;
        if (dovVar != null && (jvaVar = this.N) != null) {
            boolean z7 = jvaVar instanceof jug;
            boolean z8 = (jvaVar2 == null || z6 == z7) ? false : true;
            if (z4 || z5 || z8 || (this.ag && !z7)) {
                this.ag = z7;
                if (z7) {
                    dovVar.O(this.ac);
                } else {
                    dovVar.N(this.ab);
                }
            }
        }
        jva jvaVar4 = this.N;
        if (jvaVar4 != null && !z3) {
            jvaVar4.d();
        }
        this.V = 0L;
        this.W = false;
        this.X = 0L;
        this.Y = 0L;
        this.Z = 0L;
        this.aa = 0L;
        jva jvaVar5 = this.U;
        if (jvaVar5 != null) {
            jvaVar5.e();
            this.U = null;
        }
    }

    @Override // defpackage.cav
    protected final void H() {
        jva jvaVar = this.N;
        if (jvaVar != null) {
            jvaVar.e();
            this.N = null;
        }
        jva jvaVar2 = this.O;
        if (jvaVar2 != null) {
            jvaVar2.e();
            this.O = null;
        }
        jva jvaVar3 = this.U;
        if (jvaVar3 != null) {
            jvaVar3.e();
            this.U = null;
        }
    }

    @Override // defpackage.cav
    protected final void J() {
        ar();
        aq();
        jva jvaVar = this.N;
        if (jvaVar != null) {
            jvaVar.e();
            this.N = null;
        }
        jva jvaVar2 = this.O;
        if (jvaVar2 != null) {
            jvaVar2.e();
            this.O = null;
        }
        jva jvaVar3 = this.U;
        if (jvaVar3 != null) {
            jvaVar3.e();
            this.U = null;
        }
        this.R = null;
        this.S = null;
        this.T = null;
        this.al = 0L;
        this.u = false;
        this.A = false;
        this.B = false;
        this.af = false;
        this.ag = false;
    }

    @Override // defpackage.cav
    protected final void M(bse[] bseVarArr, long j, long j2, cnm cnmVar) throws cbo {
        zjv zjvVar;
        if (bseVarArr.length != 0) {
            this.S = bseVarArr;
            this.al = j;
            this.ak = j2;
            jva jvaVar = this.N;
            if (jvaVar != null) {
                jvaVar.k(j2);
                this.N.j(bseVarArr);
            }
            jva jvaVar2 = this.O;
            if (jvaVar2 != null) {
                jvaVar2.k(j2);
                this.O.j(bseVarArr);
            }
            jva jvaVar3 = this.U;
            if (jvaVar3 != null) {
                jvaVar3.k(j2);
            }
            yyg yygVar = this.o;
            if (yygVar != null && yygVar.V() && (zjvVar = this.ad) != null) {
                this.l = zjvVar;
                this.ad = null;
            }
            a(bseVarArr[0], this.T);
        }
    }

    @Override // defpackage.cav, defpackage.cdp
    public final void T(float f, float f2) {
        jva jvaVar = this.N;
        if (jvaVar != null) {
            jvaVar.s(f2);
        }
        jva jvaVar2 = this.O;
        if (jvaVar2 != null) {
            jvaVar2.s(f2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00b6  */
    final void a(bse bseVar, cju cjuVar) throws cbo {
        boolean z;
        List list;
        yyg yygVar;
        boolean zEquals = Objects.equals(this.T, cjuVar);
        this.T = cjuVar;
        if (Objects.equals(bseVar.q, "video/av01") && (list = bseVar.t) != null && !list.isEmpty() && (yygVar = this.o) != null && (!yygVar.s() || !au(bseVar))) {
            bsd bsdVar = new bsd(bseVar);
            bsdVar.r = null;
            bseVar = new bse(bsdVar);
        }
        yyg yygVar2 = this.o;
        if (yygVar2 != null && yygVar2.S()) {
            yygVar2.n("ecdi", "fmt_chg.".concat(true != au(bseVar) ? "mc" : "dav1d"));
        }
        this.C = true;
        bse bseVar2 = this.R;
        if (bseVar2 == null) {
            this.R = bseVar;
            h(bseVar, cjuVar);
            al(bseVar);
            return;
        }
        if (bseVar2.q == null || bseVar.q == null || au(bseVar2) == au(bseVar)) {
            if (!aw(this.R, bseVar)) {
                this.R = bseVar;
                ai(bseVar, cjuVar);
                al(bseVar);
                return;
            }
            if (zEquals) {
                if (!Objects.equals(this.R, bseVar)) {
                    this.R = bseVar;
                    jva jvaVar = this.N;
                    if (jvaVar != null && !jvaVar.r(bseVar)) {
                        ai(bseVar, cjuVar);
                    }
                }
                al(bseVar);
                return;
            }
            this.R = bseVar;
            jva jvaVar2 = this.N;
            if (jvaVar2 != null) {
                if (jvaVar2 instanceof jug) {
                    jvaVar2.f(cjuVar);
                } else {
                    ai(bseVar, cjuVar);
                }
            }
            al(bseVar);
            return;
        }
        bse bseVar3 = this.R;
        this.R = bseVar;
        jva jvaVar3 = this.O;
        if (jvaVar3 != null) {
            jvaVar3.e();
            this.O = null;
        }
        if (bseVar3 == null) {
            z = false;
        } else {
            if (yygVar2 != null) {
                boolean zAu = au(bseVar3);
                boolean zAu2 = au(bseVar);
                if (!zAu ? !zAu2 || (!yygVar2.v() && !yygVar2.u()) : zAu2 || (!yygVar2.v() && !yygVar2.t())) {
                    z = false;
                }
            }
            z = true;
        }
        boolean z2 = this.w && yygVar2 != null && yygVar2.F();
        Surface surface = au(bseVar) ? this.Q : this.P;
        if (!z || z2 || surface == null) {
            ai(bseVar, cjuVar);
        } else {
            this.u = true;
            this.an = SystemClock.elapsedRealtime();
            this.A = false;
            this.V = 0L;
            this.W = true;
            this.D = true;
            this.I = 0L;
            this.J = 0L;
            this.K = 0L;
            this.L = 0L;
            this.M = false;
            this.Z = this.X;
            long j = this.Y;
            if (j == 0) {
                j = 41000;
            }
            this.aa = j;
            this.G = false;
            am();
            ar();
            jva jvaVar4 = this.U;
            if (jvaVar4 != null) {
                jvaVar4.e();
                this.U = null;
            }
            jva jvaVarE = e(bseVar);
            this.O = jvaVarE;
            if (jvaVarE != null) {
                Surface surfaceD = d(jvaVarE);
                jvaVarE.k(this.ak);
                this.O.i(this.am);
                this.O.j(b());
                if (this.O.a(bseVar, surfaceD, cjuVar, this.k) != 0) {
                    this.O.e();
                    this.O = null;
                    this.u = false;
                    this.A = false;
                    this.an = -9223372036854775807L;
                } else if (yygVar2 != null && yygVar2.S()) {
                    yygVar2.n("ecdi", "warmup_codec_created.v;name.".concat(String.valueOf(this.O.c())));
                }
            }
        }
        al(bseVar);
    }

    /* JADX WARN: Code duplicated, block: B:227:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0082  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:42:0x016e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0170  */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x0082, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x00ec, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44, types: [cju, java.lang.Object] */
    @Override // defpackage.cdp
    public final void af(long j, long j2) {
        String str;
        char c;
        long j3;
        long j4;
        long j5;
        long j6;
        String str2;
        jva jvaVar;
        yyg yygVar;
        jva jvaVar2;
        jva jvaVar3;
        boolean z;
        jva jvaVar4;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        if (this.t) {
            return;
        }
        if (this.M) {
            this.M = false;
            this.L = j;
            long j14 = this.Z + this.aa;
            long j15 = this.K + j;
            j3 = -9223372036854775807L;
            long j16 = this.I;
            yyg yygVar2 = this.o;
            if (yygVar2 == null || !yygVar2.A()) {
                c = 0;
                j7 = j14;
            } else {
                c = 0;
                j7 = j14;
                long j17 = this.ak;
                if (j17 == 0 || j17 == -9223372036854775807L) {
                    j17 = this.d;
                }
                if (j17 != -9223372036854775807L && j17 > 0) {
                    j8 = j7 >= j17 ? j7 - j17 : j7;
                    if (j16 >= j17) {
                        j16 -= j17;
                    }
                }
                j9 = j15 / 2;
                j10 = this.J - j9;
                if (yygVar2 != null) {
                    j11 = j16 - j9;
                    j12 = j9 - j8;
                    j4 = 0;
                    if (j12 <= 0 || j10 > 0 || j11 > 0) {
                        Locale locale = Locale.US;
                        Object[] objArr = new Object[1];
                        objArr[c] = Double.valueOf(j12 / 1000.0d);
                        String str3 = String.format(locale, "%.2f", objArr);
                        Locale locale2 = Locale.US;
                        j13 = j10;
                        Object[] objArr2 = new Object[1];
                        objArr2[c] = Double.valueOf(j13 / 1000.0d);
                        String str4 = String.format(locale2, "%.2f", objArr2);
                        Locale locale3 = Locale.US;
                        Object[] objArr3 = new Object[1];
                        objArr3[c] = Double.valueOf(j11 / 1000.0d);
                        yygVar2.l("eftss." + str3 + ";rg." + str4 + ";nfpg." + String.format(locale3, "%.2f", objArr3));
                    } else {
                        j13 = j10;
                    }
                    if (yygVar2.S()) {
                        long j18 = j16 - j8;
                        str = "ecdi";
                        yygVar2.n(str, "splice.v;pts_gap." + (j18 / 1000) + ";eftss." + (j12 / 1000) + ";rg." + (j13 / 1000) + ";nfpg." + (j11 / 1000) + ";old_end." + (j7 / 1000) + ";new_pts." + (this.I / 1000) + ";sw_req." + (this.K / 1000) + ";sw_done." + (this.L / 1000) + ";new_rend." + (this.J / 1000));
                    } else {
                        str = "ecdi";
                    }
                } else {
                    str = "ecdi";
                    j4 = 0;
                }
            }
            j8 = j7;
            j9 = j15 / 2;
            j10 = this.J - j9;
            if (yygVar2 != null) {
                j11 = j16 - j9;
                j12 = j9 - j8;
                j4 = 0;
                if (j12 <= 0) {
                    Locale locale4 = Locale.US;
                    Object[] objArr4 = new Object[1];
                    objArr4[c] = Double.valueOf(j12 / 1000.0d);
                    String str5 = String.format(locale4, "%.2f", objArr4);
                    Locale locale5 = Locale.US;
                    j13 = j10;
                    Object[] objArr5 = new Object[1];
                    objArr5[c] = Double.valueOf(j13 / 1000.0d);
                    String str6 = String.format(locale5, "%.2f", objArr5);
                    Locale locale6 = Locale.US;
                    Object[] objArr6 = new Object[1];
                    objArr6[c] = Double.valueOf(j11 / 1000.0d);
                    yygVar2.l("eftss." + str5 + ";rg." + str6 + ";nfpg." + String.format(locale6, "%.2f", objArr6));
                } else {
                    Locale locale7 = Locale.US;
                    Object[] objArr7 = new Object[1];
                    objArr7[c] = Double.valueOf(j12 / 1000.0d);
                    String str7 = String.format(locale7, "%.2f", objArr7);
                    Locale locale8 = Locale.US;
                    j13 = j10;
                    Object[] objArr8 = new Object[1];
                    objArr8[c] = Double.valueOf(j13 / 1000.0d);
                    String str8 = String.format(locale8, "%.2f", objArr8);
                    Locale locale9 = Locale.US;
                    Object[] objArr9 = new Object[1];
                    objArr9[c] = Double.valueOf(j11 / 1000.0d);
                    yygVar2.l("eftss." + str7 + ";rg." + str8 + ";nfpg." + String.format(locale9, "%.2f", objArr9));
                }
                if (yygVar2.S()) {
                    long j19 = j16 - j8;
                    str = "ecdi";
                    yygVar2.n(str, "splice.v;pts_gap." + (j19 / 1000) + ";eftss." + (j12 / 1000) + ";rg." + (j13 / 1000) + ";nfpg." + (j11 / 1000) + ";old_end." + (j7 / 1000) + ";new_pts." + (this.I / 1000) + ";sw_req." + (this.K / 1000) + ";sw_done." + (this.L / 1000) + ";new_rend." + (this.J / 1000));
                } else {
                    str = "ecdi";
                }
            } else {
                str = "ecdi";
                j4 = 0;
            }
        } else {
            str = "ecdi";
            c = 0;
            j3 = -9223372036854775807L;
            j4 = 0;
        }
        if (this.u && !this.G) {
            am();
        }
        jva jvaVar5 = this.N;
        String str9 = "mc";
        String str10 = "dav1d";
        if (jvaVar5 == null || (av(jvaVar5) && this.B && (jvaVar4 = this.U) != null && !jvaVar4.p())) {
            j5 = j;
            j6 = j2;
        } else {
            while (true) {
                try {
                    j5 = j;
                    j6 = j2;
                    if (!this.N.m(j5, j6)) {
                        break;
                    } else {
                        c = 0;
                    }
                } catch (RuntimeException e) {
                    throw q(e, this.N.b() != null ? this.N.b() : this.R, false, 4003);
                }
            }
            if (this.N.q()) {
                ak(d(this.N));
                if (!av(this.N)) {
                    this.B = c;
                }
            }
            if (this.N.p() && !this.u) {
                this.t = true;
            }
            if (this.C && this.N.q()) {
                this.C = false;
                yyg yygVar3 = this.o;
                if (yygVar3 != null && yygVar3.S()) {
                    yygVar3.n(str, "first_buf.".concat(true != (this.N instanceof jug) ? "mc" : "dav1d"));
                }
            }
        }
        if (this.U != null) {
            do {
                try {
                } catch (RuntimeException e2) {
                    yyg yygVar4 = this.o;
                    if (yygVar4 == null || !yygVar4.y()) {
                        throw e2;
                    }
                    bvx.f("UnifiedSwitchingVR", "Exception during splice drain, forcing immediate release of draining decoder", e2);
                    jva jvaVar6 = this.U;
                    if (jvaVar6 != null) {
                        jvaVar6.e();
                        this.U = null;
                    }
                }
            } while (this.U.m(j5, j6));
            if (this.U.p()) {
                this.U.e();
                this.U = null;
            }
        }
        if (this.B && this.U == null && av(this.N)) {
            if (!this.N.q()) {
                do {
                    try {
                    } catch (RuntimeException e3) {
                        throw q(e3, this.N.b() != null ? this.N.b() : this.R, false, 4003);
                    }
                } while (this.N.m(j5, j6));
                if (this.N.q()) {
                    ak(d(this.N));
                }
            }
            if (this.N.q()) {
                dov dovVar = this.q;
                if (dovVar == null) {
                    z = false;
                } else if (this.N instanceof jug) {
                    this.ag = true;
                    dovVar.O(this.ac);
                    z = false;
                } else {
                    z = false;
                    this.ag = false;
                    dovVar.N(this.ab);
                }
                this.B = z;
            }
        }
        int i = this.k.g;
        int i2 = this.ai;
        if (i > i2) {
            this.ai = i;
            this.ah += i - i2;
            aj();
        }
        if (this.c == null || this.s) {
            str2 = "mc";
        } else {
            while (true) {
                try {
                    if (this.x) {
                        yyg yygVar5 = this.o;
                        boolean z2 = (yygVar5 != null && yygVar5.A() && this.u) ? false : true;
                        DecoderInputBuffer decoderInputBuffer = this.r;
                        long j20 = decoderInputBuffer.timeUs;
                        str2 = str9;
                        long j21 = this.X;
                        if (j20 > j21 && z2) {
                            this.X = j20;
                            if (j21 > j4) {
                                this.Y = j20 - j21;
                            }
                        }
                        if (!this.y && (jvaVar3 = this.N) != null && !this.u) {
                            this.y = jvaVar3.n(decoderInputBuffer);
                        } else if (this.N == null || this.u) {
                            this.y = true;
                        }
                        if (this.z || this.O == null || !this.u) {
                            str10 = str10;
                            decoderInputBuffer = decoderInputBuffer;
                            if (this.O == null || !this.u) {
                                this.z = true;
                            }
                        } else {
                            if (this.W && decoderInputBuffer.timeUs != j4) {
                                if (yygVar5 == null || !yygVar5.r()) {
                                    this.V = decoderInputBuffer.timeUs;
                                } else {
                                    long j22 = this.Z;
                                    this.V = j22 > j4 ? Math.max(decoderInputBuffer.timeUs, this.aa + j22) : decoderInputBuffer.timeUs;
                                }
                                if (yygVar5 != null && (yygVar5.C() || yygVar5.D())) {
                                    long j23 = this.Z;
                                    if (j23 <= j4) {
                                        j23 = this.V;
                                    }
                                    this.O.g(j23);
                                }
                            }
                            boolean zN = this.O.n(decoderInputBuffer);
                            this.z = zN;
                            if (zN && this.W) {
                                long j24 = decoderInputBuffer.timeUs;
                                if (j24 != j4) {
                                    this.I = j24;
                                    long j25 = this.Z;
                                    if (j25 > j4 && j24 < j25 && yygVar5 != null && yygVar5.S()) {
                                        String str11 = au(this.R) ? str10 : str2;
                                        yygVar5.n(str, "ts_regress." + str11 + ";prev." + this.Z + ";curr." + decoderInputBuffer.timeUs);
                                    }
                                    this.W = false;
                                } else {
                                    str10 = str10;
                                    decoderInputBuffer = decoderInputBuffer;
                                }
                            } else {
                                str10 = str10;
                                decoderInputBuffer = decoderInputBuffer;
                            }
                        }
                        if (this.y && this.z) {
                            if (decoderInputBuffer.isEndOfStream()) {
                                this.s = true;
                                decoderInputBuffer.clear();
                                this.x = false;
                                this.y = false;
                                this.z = false;
                            } else {
                                decoderInputBuffer.clear();
                                this.x = false;
                                this.y = false;
                                this.z = false;
                                str10 = str10;
                                str9 = str2;
                            }
                        }
                        str10 = str10;
                        break;
                    }
                    str2 = str9;
                    str10 = str10;
                    ccu ccuVarR = r();
                    DecoderInputBuffer decoderInputBuffer2 = this.r;
                    int iK = k(ccuVarR, decoderInputBuffer2, 0);
                    if (iK == -5) {
                        str10 = str10;
                        Object obj = ccuVarR.b;
                        if (obj == null) {
                            bvx.c("UnifiedSwitchingVR", "formatHolder.format is null upon RESULT_FORMAT_READ");
                            break;
                        } else {
                            a((bse) obj, ccuVarR.a);
                            str9 = str2;
                        }
                    } else {
                        if (iK != -4) {
                            str10 = str10;
                            break;
                        }
                        this.x = true;
                        decoderInputBuffer2.flip();
                        yyg yygVar6 = this.o;
                        boolean z3 = (yygVar6 != null && yygVar6.A() && this.u) ? false : true;
                        long j26 = decoderInputBuffer2.timeUs;
                        str10 = str10;
                        long j27 = this.X;
                        if (j26 > j27 && z3) {
                            this.X = j26;
                            if (j27 > j4) {
                                this.Y = j26 - j27;
                            }
                        }
                        this.y = this.u || (jvaVar2 = this.N) == null || jvaVar2.n(decoderInputBuffer2);
                        if (this.O != null && this.u && this.W && decoderInputBuffer2.timeUs != j4) {
                            if (yygVar6 == null || !yygVar6.r()) {
                                this.V = decoderInputBuffer2.timeUs;
                            } else {
                                long j28 = this.Z;
                                this.V = j28 > j4 ? Math.max(decoderInputBuffer2.timeUs, this.aa + j28) : decoderInputBuffer2.timeUs;
                            }
                            if (yygVar6 != null && (yygVar6.C() || yygVar6.D())) {
                                long j29 = this.Z;
                                if (j29 <= j4) {
                                    j29 = this.V;
                                }
                                this.O.g(j29);
                            }
                        }
                        jva jvaVar7 = this.O;
                        boolean z4 = jvaVar7 == null || !this.u || jvaVar7.n(decoderInputBuffer2);
                        this.z = z4;
                        if (this.O != null && this.u && z4 && this.W) {
                            long j30 = decoderInputBuffer2.timeUs;
                            if (j30 != j4) {
                                this.I = j30;
                                this.W = false;
                            }
                        }
                        if (!this.y || !z4) {
                            break;
                        }
                        if (decoderInputBuffer2.isEndOfStream()) {
                            this.s = true;
                            decoderInputBuffer2.clear();
                            this.x = false;
                            this.y = false;
                            this.z = false;
                            break;
                        }
                        decoderInputBuffer2.clear();
                        this.x = false;
                        this.y = false;
                        this.z = false;
                        str9 = str2;
                    }
                } catch (RuntimeException e4) {
                    throw q(e4, this.R, false, 4003);
                }
            }
        }
        if (this.O != null && this.u) {
            do {
                try {
                } catch (RuntimeException e5) {
                    bvx.d("UnifiedSwitchingVR", "Exception during pending decoder warmup drain, aborting splice", e5);
                    an();
                }
            } while (this.O.m(j5, j6));
            jva jvaVar8 = this.O;
            if (jvaVar8 != null) {
                if (jvaVar8.q() && this.D) {
                    this.D = false;
                    this.J = j5;
                    yyg yygVar7 = this.o;
                    if (yygVar7 != null && yygVar7.S()) {
                        yygVar7.n("rbrd", "dec_warm.".concat(true != (this.O instanceof jug) ? str2 : str10));
                    }
                }
                if (!this.O.q()) {
                    yyg yygVar8 = this.o;
                    if (yygVar8 != null && yygVar8.w() && this.an != j3) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.an;
                        if (jElapsedRealtime > yygVar8.f()) {
                            if (yygVar8.S()) {
                                yygVar8.n(str, true != (this.O instanceof jug) ? "sf_swap.mc;sf_swap.timeout:pri" : "sf_swap.dav1d;sf_swap.timeout:sec");
                            }
                            bvx.e("UnifiedSwitchingVR", "Dual surface splice timed out waiting for first frame (" + jElapsedRealtime + "ms > " + yygVar8.f() + "ms). Forcing promotion to recover playback.");
                            an();
                        }
                    }
                } else if (this.V == j4 || (yygVar = this.o) == null || yygVar.g() + j5 >= this.V) {
                    this.K = j5;
                    if (this.q == null) {
                        an();
                        if (this.Z > j4) {
                            this.M = true;
                        }
                    } else if (!this.A) {
                        this.A = true;
                        yyg yygVar9 = this.o;
                        if (yygVar9 != null && yygVar9.S()) {
                            boolean z5 = this.O instanceof jug;
                            long j31 = z5 ? this.ac : this.ab;
                            String strBS = j31 != j4 ? a.bS(j31, ";tok.") : "";
                            yygVar9.n(str, z5 ? "sf_swap.dav1d;sf_swap.show:sec".concat(strBS) : "sf_swap.mc;sf_swap.show:pri".concat(strBS));
                        }
                        if (this.O instanceof jug) {
                            this.ag = true;
                            this.q.O(this.ac);
                        } else {
                            this.ag = false;
                            this.q.N(this.ab);
                        }
                    }
                }
            }
        }
        yyg yygVar10 = this.o;
        if (yygVar10 == null || !yygVar10.S() || this.b != 2 || this.u || (jvaVar = this.N) == null) {
            return;
        }
        boolean z6 = (this.c == null || this.s) ? false : true;
        boolean zQ = jvaVar.q();
        if (!z6 || zQ) {
            this.H = j3;
            this.F = false;
            return;
        }
        if (this.H == j3) {
            this.H = SystemClock.elapsedRealtime();
            return;
        }
        if (SystemClock.elapsedRealtime() - this.H <= 500 || this.F) {
            return;
        }
        this.F = true;
        String str12 = true != (this.N instanceof jug) ? str2 : str10;
        yygVar10.n("rbrd", "steady_state_stall." + str12 + g(str12));
    }

    @Override // defpackage.cdp
    public final boolean ag() {
        return X() && this.t;
    }

    @Override // defpackage.cdp
    public final boolean ah() {
        jva jvaVar;
        jva jvaVar2;
        yyg yygVar;
        jva jvaVar3;
        jva jvaVar4;
        coo cooVar = this.c;
        boolean z = cooVar == null || cooVar.f() || X();
        jva jvaVar5 = this.N;
        boolean z2 = !this.u ? ((jvaVar = this.U) == null || jvaVar.p()) && !(jvaVar5 != null && jvaVar5.q() && (z || (jvaVar5 != null && jvaVar5.o()) || this.t)) : ((yygVar = this.o) == null || !yygVar.z() || (jvaVar4 = this.N) == null || jvaVar4.p()) && ((jvaVar3 = this.O) == null || !jvaVar3.q());
        yyg yygVar2 = this.o;
        if (yygVar2 == null || !yygVar2.S() || z2 || !z || !this.u || (jvaVar2 = this.O) == null || jvaVar2.q() || this.E) {
            return z2;
        }
        this.E = true;
        String str = true != (jvaVar2 instanceof jug) ? "mc" : "dav1d";
        yygVar2.n("rbrd", "warmup_stall." + str + g(str));
        return false;
    }

    final bse[] b() {
        bse[] bseVarArr = this.S;
        if (bseVarArr != null) {
            return bseVarArr;
        }
        try {
            return ab();
        } catch (IllegalStateException | NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.cdq
    public final int c(bse bseVar) {
        String str = bseVar.q;
        if (str == null || !bsy.n(str)) {
            return SemanticState.Focused;
        }
        if (!"video/av01".equalsIgnoreCase(str) && !"video/avc".equalsIgnoreCase(str) && !"video/x-vnd.on2.vp9".equalsIgnoreCase(str) && !"video/hevc".equalsIgnoreCase(str)) {
            return 129;
        }
        if (bseVar.S != 0) {
            clu cluVar = this.n;
            if (cluVar != null) {
                try {
                    if (cluVar.a(str, true, false).isEmpty()) {
                    }
                } catch (Exception unused) {
                }
            }
            return 130;
        }
        return 148;
    }

    @Override // defpackage.cdp, defpackage.cdq
    public final String f() {
        return "UnifiedSwitchingVideoRenderer";
    }

    @Override // defpackage.cav
    public final void K() {
    }

    @Override // defpackage.cav
    public final void L() {
    }
}
