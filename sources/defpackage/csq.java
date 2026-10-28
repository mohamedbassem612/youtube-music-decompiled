package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import app.rive.semantics.SemanticState;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class csq extends cav implements cal {
    private ctl A;
    private ctm B;
    private cju C;
    private cju D;
    private int E;
    private boolean F;
    private int G;
    private long H;
    private long I;
    private boolean J;
    private boolean K;
    private boolean L;
    private btz M;
    private long N;
    private int O;
    private int P;
    private int Q;
    private long R;
    private Executor S;
    private final pj T;
    private qcb U;
    protected cay k;
    private final long l;
    private final int m;
    private final bwn n;
    private final ArrayDeque o;
    private final DecoderInputBuffer p;
    private bse q;
    private bse r;
    private csp s;
    private cam t;
    private DecoderInputBuffer u;
    private long v;
    private VideoDecoderOutputBuffer w;
    private int x;
    private Object y;
    private Surface z;

    protected csq(long j, Handler handler, cty ctyVar, int i) {
        super(2);
        this.l = j;
        this.m = i;
        this.I = -9223372036854775807L;
        this.n = new bwn();
        this.o = new ArrayDeque();
        this.p = DecoderInputBuffer.newNoDataInstance();
        this.T = new pj(handler, ctyVar);
        this.E = 0;
        this.v = -9223372036854775807L;
        this.x = -1;
        this.G = 0;
        this.k = new cay();
    }

    public static boolean ap(long j) {
        return j < -30000;
    }

    private final csp ar() {
        ArrayDeque arrayDeque = this.o;
        return !arrayDeque.isEmpty() ? (csp) arrayDeque.getLast() : this.s;
    }

    private final void as(int i) {
        this.G = Math.min(this.G, i);
    }

    private final void at() throws cbo {
        CryptoConfig cryptoConfigB;
        if (this.t == null) {
            aw(this.D);
            cju cjuVar = this.C;
            if (cjuVar != null) {
                cryptoConfigB = cjuVar.b();
                if (cryptoConfigB == null && this.C.c() == null) {
                    return;
                }
            } else {
                cryptoConfigB = null;
            }
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (this.S == null) {
                    Looper looperMyLooper = Looper.myLooper();
                    looperMyLooper.getClass();
                    this.S = new cck(new Handler(looperMyLooper), 5);
                }
                bse bseVar = this.q;
                bseVar.getClass();
                cam camVarD = d(bseVar, cryptoConfigB);
                this.t = camVarD;
                camVarD.setOutputStartTimeUs(this.e);
                this.t.setCallback(this, this.S);
                h(this.x);
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                pj pjVar = this.T;
                cam camVar = this.t;
                camVar.getClass();
                pjVar.C(camVar.getName(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
                this.k.a++;
            } catch (can e) {
                bvx.d("DecoderVideoRenderer", "Video codec error", e);
                this.T.K(e);
                throw q(e, this.q, false, 4001);
            } catch (OutOfMemoryError e2) {
                throw q(e2, this.q, false, 4001);
            }
        }
    }

    private final void au() {
        if (this.O > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.T.F(this.O, jElapsedRealtime - this.N);
            this.O = 0;
            this.N = jElapsedRealtime;
        }
    }

    private final void av() {
        btz btzVar = this.M;
        if (btzVar != null) {
            this.T.L(btzVar);
        }
    }

    private final void aw(cju cjuVar) {
        aup.o(this.C, cjuVar);
        this.C = cjuVar;
    }

    private final void ax() {
        long j = this.l;
        this.I = j > 0 ? SystemClock.elapsedRealtime() + j : -9223372036854775807L;
    }

    private final void ay(cju cjuVar) {
        aup.o(this.D, cjuVar);
        this.D = cjuVar;
    }

    private final boolean az() {
        return this.x != -1;
    }

    @Override // defpackage.cav, defpackage.cdm
    public void A(int i, Object obj) {
        int i2;
        Object obj2;
        if (i != 1) {
            if (i == 7) {
                this.B = (ctm) obj;
                return;
            } else {
                if (i == 11) {
                    this.U = (qcb) obj;
                    return;
                }
                return;
            }
        }
        if (obj instanceof Surface) {
            this.z = (Surface) obj;
            this.A = null;
            this.x = 1;
            i2 = 1;
        } else if (obj instanceof ctl) {
            this.z = null;
            this.A = (ctl) obj;
            i2 = 0;
            this.x = 0;
        } else {
            this.z = null;
            this.A = null;
            i2 = -1;
            this.x = -1;
            obj = null;
        }
        if (this.y == obj) {
            if (obj != null) {
                av();
                if (this.G != 3 || (obj2 = this.y) == null) {
                    return;
                }
                this.T.I(obj2);
                return;
            }
            return;
        }
        this.y = obj;
        if (obj == null) {
            this.M = null;
            as(1);
            return;
        }
        if (this.t != null) {
            h(i2);
        }
        av();
        as(1);
        if (this.b == 2) {
            ax();
        }
    }

    @Override // defpackage.cav
    protected final void D() {
        this.q = null;
        this.s = null;
        this.o.clear();
        this.v = -9223372036854775807L;
        this.M = null;
        as(0);
        try {
            ay(null);
            al();
        } finally {
            this.T.E(this.k);
        }
    }

    @Override // defpackage.cav
    protected final void E(boolean z, boolean z2) {
        cay cayVar = new cay();
        this.k = cayVar;
        this.T.G(cayVar);
        this.G = z2 ? 1 : 0;
    }

    @Override // defpackage.cav
    protected void G(long j, boolean z, boolean z2) throws cbo {
        this.K = false;
        this.L = false;
        ArrayDeque arrayDeque = this.o;
        if (!arrayDeque.isEmpty()) {
            this.s = (csp) arrayDeque.getLast();
        }
        arrayDeque.clear();
        this.v = -9223372036854775807L;
        as(1);
        this.H = -9223372036854775807L;
        this.P = 0;
        if (this.t != null) {
            aj();
        }
        if (z) {
            ax();
        } else {
            this.I = -9223372036854775807L;
        }
        bwn bwnVar = this.n;
        if (bwnVar.a() > 0) {
            this.J = true;
        }
        bwnVar.f();
    }

    @Override // defpackage.cav
    protected void K() {
        this.O = 0;
        this.N = SystemClock.elapsedRealtime();
        this.R = bwp.y(SystemClock.elapsedRealtime());
    }

    @Override // defpackage.cav
    protected final void L() {
        this.I = -9223372036854775807L;
        au();
    }

    @Override // defpackage.cav
    protected final void M(bse[] bseVarArr, long j, long j2, cnm cnmVar) {
        coo cooVar = this.c;
        cooVar.getClass();
        int iA = cooVar.a();
        if (this.s != null) {
            ArrayDeque arrayDeque = this.o;
            if (!arrayDeque.isEmpty() || this.Q != 0) {
                arrayDeque.add(new csp(this.v, j2, this.j, iA));
                return;
            }
        }
        this.s = new csp(-9223372036854775807L, j2, this.j, iA);
    }

    @Override // defpackage.cav
    protected final void ae() {
        csp cspVarAr = ar();
        if (cspVarAr != null) {
            cspVarAr.c = this.j;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01b9 A[Catch: can -> 0x0242, PHI: r2
      0x01b9: PHI (r2v9 androidx.media3.decoder.DecoderInputBuffer) = (r2v8 androidx.media3.decoder.DecoderInputBuffer), (r2v12 androidx.media3.decoder.DecoderInputBuffer) binds: [B:100:0x01ac, B:102:0x01b7] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {can -> 0x0242, blocks: (B:14:0x0038, B:16:0x003d, B:18:0x004c, B:93:0x018c, B:95:0x01a2, B:97:0x01a6, B:99:0x01aa, B:101:0x01ae, B:103:0x01b9, B:105:0x01c0, B:106:0x01d1, B:110:0x01e0, B:112:0x01e6, B:113:0x01f4, B:115:0x01f8, B:116:0x0207, B:117:0x0233, B:19:0x005c, B:21:0x0062, B:23:0x0066, B:24:0x006d, B:26:0x007a, B:28:0x008c, B:29:0x008e, B:31:0x0099, B:33:0x009f, B:85:0x0162, B:86:0x0168, B:88:0x0170, B:90:0x017c, B:91:0x0188, B:36:0x00a7, B:38:0x00b7, B:42:0x00c1, B:44:0x00c8, B:46:0x00d2, B:50:0x00e1, B:55:0x00ec, B:57:0x00fb, B:82:0x0157, B:67:0x0114, B:69:0x0118, B:73:0x0125, B:75:0x012b, B:76:0x013c, B:78:0x0144, B:81:0x014e, B:62:0x0109, B:63:0x010e, B:47:0x00d5, B:49:0x00d9), top: B:125:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01d1 A[Catch: can -> 0x0242, TryCatch #0 {can -> 0x0242, blocks: (B:14:0x0038, B:16:0x003d, B:18:0x004c, B:93:0x018c, B:95:0x01a2, B:97:0x01a6, B:99:0x01aa, B:101:0x01ae, B:103:0x01b9, B:105:0x01c0, B:106:0x01d1, B:110:0x01e0, B:112:0x01e6, B:113:0x01f4, B:115:0x01f8, B:116:0x0207, B:117:0x0233, B:19:0x005c, B:21:0x0062, B:23:0x0066, B:24:0x006d, B:26:0x007a, B:28:0x008c, B:29:0x008e, B:31:0x0099, B:33:0x009f, B:85:0x0162, B:86:0x0168, B:88:0x0170, B:90:0x017c, B:91:0x0188, B:36:0x00a7, B:38:0x00b7, B:42:0x00c1, B:44:0x00c8, B:46:0x00d2, B:50:0x00e1, B:55:0x00ec, B:57:0x00fb, B:82:0x0157, B:67:0x0114, B:69:0x0118, B:73:0x0125, B:75:0x012b, B:76:0x013c, B:78:0x0144, B:81:0x014e, B:62:0x0109, B:63:0x010e, B:47:0x00d5, B:49:0x00d9), top: B:125:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x01e0 A[Catch: can -> 0x0242, TryCatch #0 {can -> 0x0242, blocks: (B:14:0x0038, B:16:0x003d, B:18:0x004c, B:93:0x018c, B:95:0x01a2, B:97:0x01a6, B:99:0x01aa, B:101:0x01ae, B:103:0x01b9, B:105:0x01c0, B:106:0x01d1, B:110:0x01e0, B:112:0x01e6, B:113:0x01f4, B:115:0x01f8, B:116:0x0207, B:117:0x0233, B:19:0x005c, B:21:0x0062, B:23:0x0066, B:24:0x006d, B:26:0x007a, B:28:0x008c, B:29:0x008e, B:31:0x0099, B:33:0x009f, B:85:0x0162, B:86:0x0168, B:88:0x0170, B:90:0x017c, B:91:0x0188, B:36:0x00a7, B:38:0x00b7, B:42:0x00c1, B:44:0x00c8, B:46:0x00d2, B:50:0x00e1, B:55:0x00ec, B:57:0x00fb, B:82:0x0157, B:67:0x0114, B:69:0x0118, B:73:0x0125, B:75:0x012b, B:76:0x013c, B:78:0x0144, B:81:0x014e, B:62:0x0109, B:63:0x010e, B:47:0x00d5, B:49:0x00d9), top: B:125:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01f4 A[Catch: can -> 0x0242, TryCatch #0 {can -> 0x0242, blocks: (B:14:0x0038, B:16:0x003d, B:18:0x004c, B:93:0x018c, B:95:0x01a2, B:97:0x01a6, B:99:0x01aa, B:101:0x01ae, B:103:0x01b9, B:105:0x01c0, B:106:0x01d1, B:110:0x01e0, B:112:0x01e6, B:113:0x01f4, B:115:0x01f8, B:116:0x0207, B:117:0x0233, B:19:0x005c, B:21:0x0062, B:23:0x0066, B:24:0x006d, B:26:0x007a, B:28:0x008c, B:29:0x008e, B:31:0x0099, B:33:0x009f, B:85:0x0162, B:86:0x0168, B:88:0x0170, B:90:0x017c, B:91:0x0188, B:36:0x00a7, B:38:0x00b7, B:42:0x00c1, B:44:0x00c8, B:46:0x00d2, B:50:0x00e1, B:55:0x00ec, B:57:0x00fb, B:82:0x0157, B:67:0x0114, B:69:0x0118, B:73:0x0125, B:75:0x012b, B:76:0x013c, B:78:0x0144, B:81:0x014e, B:62:0x0109, B:63:0x010e, B:47:0x00d5, B:49:0x00d9), top: B:125:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x01f8 A[Catch: can -> 0x0242, TryCatch #0 {can -> 0x0242, blocks: (B:14:0x0038, B:16:0x003d, B:18:0x004c, B:93:0x018c, B:95:0x01a2, B:97:0x01a6, B:99:0x01aa, B:101:0x01ae, B:103:0x01b9, B:105:0x01c0, B:106:0x01d1, B:110:0x01e0, B:112:0x01e6, B:113:0x01f4, B:115:0x01f8, B:116:0x0207, B:117:0x0233, B:19:0x005c, B:21:0x0062, B:23:0x0066, B:24:0x006d, B:26:0x007a, B:28:0x008c, B:29:0x008e, B:31:0x0099, B:33:0x009f, B:85:0x0162, B:86:0x0168, B:88:0x0170, B:90:0x017c, B:91:0x0188, B:36:0x00a7, B:38:0x00b7, B:42:0x00c1, B:44:0x00c8, B:46:0x00d2, B:50:0x00e1, B:55:0x00ec, B:57:0x00fb, B:82:0x0157, B:67:0x0114, B:69:0x0118, B:73:0x0125, B:75:0x012b, B:76:0x013c, B:78:0x0144, B:81:0x014e, B:62:0x0109, B:63:0x010e, B:47:0x00d5, B:49:0x00d9), top: B:125:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x01c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0239 A[EDGE_INSN: B:133:0x0239->B:119:0x0239 BREAK  A[LOOP:1: B:93:0x018c->B:137:0x018c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0062 A[Catch: can -> 0x0242, TryCatch #0 {can -> 0x0242, blocks: (B:14:0x0038, B:16:0x003d, B:18:0x004c, B:93:0x018c, B:95:0x01a2, B:97:0x01a6, B:99:0x01aa, B:101:0x01ae, B:103:0x01b9, B:105:0x01c0, B:106:0x01d1, B:110:0x01e0, B:112:0x01e6, B:113:0x01f4, B:115:0x01f8, B:116:0x0207, B:117:0x0233, B:19:0x005c, B:21:0x0062, B:23:0x0066, B:24:0x006d, B:26:0x007a, B:28:0x008c, B:29:0x008e, B:31:0x0099, B:33:0x009f, B:85:0x0162, B:86:0x0168, B:88:0x0170, B:90:0x017c, B:91:0x0188, B:36:0x00a7, B:38:0x00b7, B:42:0x00c1, B:44:0x00c8, B:46:0x00d2, B:50:0x00e1, B:55:0x00ec, B:57:0x00fb, B:82:0x0157, B:67:0x0114, B:69:0x0118, B:73:0x0125, B:75:0x012b, B:76:0x013c, B:78:0x0144, B:81:0x014e, B:62:0x0109, B:63:0x010e, B:47:0x00d5, B:49:0x00d9), top: B:125:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0066 A[Catch: can -> 0x0242, TryCatch #0 {can -> 0x0242, blocks: (B:14:0x0038, B:16:0x003d, B:18:0x004c, B:93:0x018c, B:95:0x01a2, B:97:0x01a6, B:99:0x01aa, B:101:0x01ae, B:103:0x01b9, B:105:0x01c0, B:106:0x01d1, B:110:0x01e0, B:112:0x01e6, B:113:0x01f4, B:115:0x01f8, B:116:0x0207, B:117:0x0233, B:19:0x005c, B:21:0x0062, B:23:0x0066, B:24:0x006d, B:26:0x007a, B:28:0x008c, B:29:0x008e, B:31:0x0099, B:33:0x009f, B:85:0x0162, B:86:0x0168, B:88:0x0170, B:90:0x017c, B:91:0x0188, B:36:0x00a7, B:38:0x00b7, B:42:0x00c1, B:44:0x00c8, B:46:0x00d2, B:50:0x00e1, B:55:0x00ec, B:57:0x00fb, B:82:0x0157, B:67:0x0114, B:69:0x0118, B:73:0x0125, B:75:0x012b, B:76:0x013c, B:78:0x0144, B:81:0x014e, B:62:0x0109, B:63:0x010e, B:47:0x00d5, B:49:0x00d9), top: B:125:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x006d A[Catch: can -> 0x0242, TryCatch #0 {can -> 0x0242, blocks: (B:14:0x0038, B:16:0x003d, B:18:0x004c, B:93:0x018c, B:95:0x01a2, B:97:0x01a6, B:99:0x01aa, B:101:0x01ae, B:103:0x01b9, B:105:0x01c0, B:106:0x01d1, B:110:0x01e0, B:112:0x01e6, B:113:0x01f4, B:115:0x01f8, B:116:0x0207, B:117:0x0233, B:19:0x005c, B:21:0x0062, B:23:0x0066, B:24:0x006d, B:26:0x007a, B:28:0x008c, B:29:0x008e, B:31:0x0099, B:33:0x009f, B:85:0x0162, B:86:0x0168, B:88:0x0170, B:90:0x017c, B:91:0x0188, B:36:0x00a7, B:38:0x00b7, B:42:0x00c1, B:44:0x00c8, B:46:0x00d2, B:50:0x00e1, B:55:0x00ec, B:57:0x00fb, B:82:0x0157, B:67:0x0114, B:69:0x0118, B:73:0x0125, B:75:0x012b, B:76:0x013c, B:78:0x0144, B:81:0x014e, B:62:0x0109, B:63:0x010e, B:47:0x00d5, B:49:0x00d9), top: B:125:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x007a A[Catch: can -> 0x0242, TryCatch #0 {can -> 0x0242, blocks: (B:14:0x0038, B:16:0x003d, B:18:0x004c, B:93:0x018c, B:95:0x01a2, B:97:0x01a6, B:99:0x01aa, B:101:0x01ae, B:103:0x01b9, B:105:0x01c0, B:106:0x01d1, B:110:0x01e0, B:112:0x01e6, B:113:0x01f4, B:115:0x01f8, B:116:0x0207, B:117:0x0233, B:19:0x005c, B:21:0x0062, B:23:0x0066, B:24:0x006d, B:26:0x007a, B:28:0x008c, B:29:0x008e, B:31:0x0099, B:33:0x009f, B:85:0x0162, B:86:0x0168, B:88:0x0170, B:90:0x017c, B:91:0x0188, B:36:0x00a7, B:38:0x00b7, B:42:0x00c1, B:44:0x00c8, B:46:0x00d2, B:50:0x00e1, B:55:0x00ec, B:57:0x00fb, B:82:0x0157, B:67:0x0114, B:69:0x0118, B:73:0x0125, B:75:0x012b, B:76:0x013c, B:78:0x0144, B:81:0x014e, B:62:0x0109, B:63:0x010e, B:47:0x00d5, B:49:0x00d9), top: B:125:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x008c A[Catch: can -> 0x0242, TryCatch #0 {can -> 0x0242, blocks: (B:14:0x0038, B:16:0x003d, B:18:0x004c, B:93:0x018c, B:95:0x01a2, B:97:0x01a6, B:99:0x01aa, B:101:0x01ae, B:103:0x01b9, B:105:0x01c0, B:106:0x01d1, B:110:0x01e0, B:112:0x01e6, B:113:0x01f4, B:115:0x01f8, B:116:0x0207, B:117:0x0233, B:19:0x005c, B:21:0x0062, B:23:0x0066, B:24:0x006d, B:26:0x007a, B:28:0x008c, B:29:0x008e, B:31:0x0099, B:33:0x009f, B:85:0x0162, B:86:0x0168, B:88:0x0170, B:90:0x017c, B:91:0x0188, B:36:0x00a7, B:38:0x00b7, B:42:0x00c1, B:44:0x00c8, B:46:0x00d2, B:50:0x00e1, B:55:0x00ec, B:57:0x00fb, B:82:0x0157, B:67:0x0114, B:69:0x0118, B:73:0x0125, B:75:0x012b, B:76:0x013c, B:78:0x0144, B:81:0x014e, B:62:0x0109, B:63:0x010e, B:47:0x00d5, B:49:0x00d9), top: B:125:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0099 A[Catch: can -> 0x0242, TryCatch #0 {can -> 0x0242, blocks: (B:14:0x0038, B:16:0x003d, B:18:0x004c, B:93:0x018c, B:95:0x01a2, B:97:0x01a6, B:99:0x01aa, B:101:0x01ae, B:103:0x01b9, B:105:0x01c0, B:106:0x01d1, B:110:0x01e0, B:112:0x01e6, B:113:0x01f4, B:115:0x01f8, B:116:0x0207, B:117:0x0233, B:19:0x005c, B:21:0x0062, B:23:0x0066, B:24:0x006d, B:26:0x007a, B:28:0x008c, B:29:0x008e, B:31:0x0099, B:33:0x009f, B:85:0x0162, B:86:0x0168, B:88:0x0170, B:90:0x017c, B:91:0x0188, B:36:0x00a7, B:38:0x00b7, B:42:0x00c1, B:44:0x00c8, B:46:0x00d2, B:50:0x00e1, B:55:0x00ec, B:57:0x00fb, B:82:0x0157, B:67:0x0114, B:69:0x0118, B:73:0x0125, B:75:0x012b, B:76:0x013c, B:78:0x0144, B:81:0x014e, B:62:0x0109, B:63:0x010e, B:47:0x00d5, B:49:0x00d9), top: B:125:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x009f A[Catch: can -> 0x0242, TryCatch #0 {can -> 0x0242, blocks: (B:14:0x0038, B:16:0x003d, B:18:0x004c, B:93:0x018c, B:95:0x01a2, B:97:0x01a6, B:99:0x01aa, B:101:0x01ae, B:103:0x01b9, B:105:0x01c0, B:106:0x01d1, B:110:0x01e0, B:112:0x01e6, B:113:0x01f4, B:115:0x01f8, B:116:0x0207, B:117:0x0233, B:19:0x005c, B:21:0x0062, B:23:0x0066, B:24:0x006d, B:26:0x007a, B:28:0x008c, B:29:0x008e, B:31:0x0099, B:33:0x009f, B:85:0x0162, B:86:0x0168, B:88:0x0170, B:90:0x017c, B:91:0x0188, B:36:0x00a7, B:38:0x00b7, B:42:0x00c1, B:44:0x00c8, B:46:0x00d2, B:50:0x00e1, B:55:0x00ec, B:57:0x00fb, B:82:0x0157, B:67:0x0114, B:69:0x0118, B:73:0x0125, B:75:0x012b, B:76:0x013c, B:78:0x0144, B:81:0x014e, B:62:0x0109, B:63:0x010e, B:47:0x00d5, B:49:0x00d9), top: B:125:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a7 A[Catch: can -> 0x0242, TryCatch #0 {can -> 0x0242, blocks: (B:14:0x0038, B:16:0x003d, B:18:0x004c, B:93:0x018c, B:95:0x01a2, B:97:0x01a6, B:99:0x01aa, B:101:0x01ae, B:103:0x01b9, B:105:0x01c0, B:106:0x01d1, B:110:0x01e0, B:112:0x01e6, B:113:0x01f4, B:115:0x01f8, B:116:0x0207, B:117:0x0233, B:19:0x005c, B:21:0x0062, B:23:0x0066, B:24:0x006d, B:26:0x007a, B:28:0x008c, B:29:0x008e, B:31:0x0099, B:33:0x009f, B:85:0x0162, B:86:0x0168, B:88:0x0170, B:90:0x017c, B:91:0x0188, B:36:0x00a7, B:38:0x00b7, B:42:0x00c1, B:44:0x00c8, B:46:0x00d2, B:50:0x00e1, B:55:0x00ec, B:57:0x00fb, B:82:0x0157, B:67:0x0114, B:69:0x0118, B:73:0x0125, B:75:0x012b, B:76:0x013c, B:78:0x0144, B:81:0x014e, B:62:0x0109, B:63:0x010e, B:47:0x00d5, B:49:0x00d9), top: B:125:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b7 A[Catch: can -> 0x0242, TryCatch #0 {can -> 0x0242, blocks: (B:14:0x0038, B:16:0x003d, B:18:0x004c, B:93:0x018c, B:95:0x01a2, B:97:0x01a6, B:99:0x01aa, B:101:0x01ae, B:103:0x01b9, B:105:0x01c0, B:106:0x01d1, B:110:0x01e0, B:112:0x01e6, B:113:0x01f4, B:115:0x01f8, B:116:0x0207, B:117:0x0233, B:19:0x005c, B:21:0x0062, B:23:0x0066, B:24:0x006d, B:26:0x007a, B:28:0x008c, B:29:0x008e, B:31:0x0099, B:33:0x009f, B:85:0x0162, B:86:0x0168, B:88:0x0170, B:90:0x017c, B:91:0x0188, B:36:0x00a7, B:38:0x00b7, B:42:0x00c1, B:44:0x00c8, B:46:0x00d2, B:50:0x00e1, B:55:0x00ec, B:57:0x00fb, B:82:0x0157, B:67:0x0114, B:69:0x0118, B:73:0x0125, B:75:0x012b, B:76:0x013c, B:78:0x0144, B:81:0x014e, B:62:0x0109, B:63:0x010e, B:47:0x00d5, B:49:0x00d9), top: B:125:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d2 A[Catch: can -> 0x0242, TryCatch #0 {can -> 0x0242, blocks: (B:14:0x0038, B:16:0x003d, B:18:0x004c, B:93:0x018c, B:95:0x01a2, B:97:0x01a6, B:99:0x01aa, B:101:0x01ae, B:103:0x01b9, B:105:0x01c0, B:106:0x01d1, B:110:0x01e0, B:112:0x01e6, B:113:0x01f4, B:115:0x01f8, B:116:0x0207, B:117:0x0233, B:19:0x005c, B:21:0x0062, B:23:0x0066, B:24:0x006d, B:26:0x007a, B:28:0x008c, B:29:0x008e, B:31:0x0099, B:33:0x009f, B:85:0x0162, B:86:0x0168, B:88:0x0170, B:90:0x017c, B:91:0x0188, B:36:0x00a7, B:38:0x00b7, B:42:0x00c1, B:44:0x00c8, B:46:0x00d2, B:50:0x00e1, B:55:0x00ec, B:57:0x00fb, B:82:0x0157, B:67:0x0114, B:69:0x0118, B:73:0x0125, B:75:0x012b, B:76:0x013c, B:78:0x0144, B:81:0x014e, B:62:0x0109, B:63:0x010e, B:47:0x00d5, B:49:0x00d9), top: B:125:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5 A[Catch: can -> 0x0242, TryCatch #0 {can -> 0x0242, blocks: (B:14:0x0038, B:16:0x003d, B:18:0x004c, B:93:0x018c, B:95:0x01a2, B:97:0x01a6, B:99:0x01aa, B:101:0x01ae, B:103:0x01b9, B:105:0x01c0, B:106:0x01d1, B:110:0x01e0, B:112:0x01e6, B:113:0x01f4, B:115:0x01f8, B:116:0x0207, B:117:0x0233, B:19:0x005c, B:21:0x0062, B:23:0x0066, B:24:0x006d, B:26:0x007a, B:28:0x008c, B:29:0x008e, B:31:0x0099, B:33:0x009f, B:85:0x0162, B:86:0x0168, B:88:0x0170, B:90:0x017c, B:91:0x0188, B:36:0x00a7, B:38:0x00b7, B:42:0x00c1, B:44:0x00c8, B:46:0x00d2, B:50:0x00e1, B:55:0x00ec, B:57:0x00fb, B:82:0x0157, B:67:0x0114, B:69:0x0118, B:73:0x0125, B:75:0x012b, B:76:0x013c, B:78:0x0144, B:81:0x014e, B:62:0x0109, B:63:0x010e, B:47:0x00d5, B:49:0x00d9), top: B:125:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d9 A[Catch: can -> 0x0242, TryCatch #0 {can -> 0x0242, blocks: (B:14:0x0038, B:16:0x003d, B:18:0x004c, B:93:0x018c, B:95:0x01a2, B:97:0x01a6, B:99:0x01aa, B:101:0x01ae, B:103:0x01b9, B:105:0x01c0, B:106:0x01d1, B:110:0x01e0, B:112:0x01e6, B:113:0x01f4, B:115:0x01f8, B:116:0x0207, B:117:0x0233, B:19:0x005c, B:21:0x0062, B:23:0x0066, B:24:0x006d, B:26:0x007a, B:28:0x008c, B:29:0x008e, B:31:0x0099, B:33:0x009f, B:85:0x0162, B:86:0x0168, B:88:0x0170, B:90:0x017c, B:91:0x0188, B:36:0x00a7, B:38:0x00b7, B:42:0x00c1, B:44:0x00c8, B:46:0x00d2, B:50:0x00e1, B:55:0x00ec, B:57:0x00fb, B:82:0x0157, B:67:0x0114, B:69:0x0118, B:73:0x0125, B:75:0x012b, B:76:0x013c, B:78:0x0144, B:81:0x014e, B:62:0x0109, B:63:0x010e, B:47:0x00d5, B:49:0x00d9), top: B:125:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ec A[Catch: can -> 0x0242, TryCatch #0 {can -> 0x0242, blocks: (B:14:0x0038, B:16:0x003d, B:18:0x004c, B:93:0x018c, B:95:0x01a2, B:97:0x01a6, B:99:0x01aa, B:101:0x01ae, B:103:0x01b9, B:105:0x01c0, B:106:0x01d1, B:110:0x01e0, B:112:0x01e6, B:113:0x01f4, B:115:0x01f8, B:116:0x0207, B:117:0x0233, B:19:0x005c, B:21:0x0062, B:23:0x0066, B:24:0x006d, B:26:0x007a, B:28:0x008c, B:29:0x008e, B:31:0x0099, B:33:0x009f, B:85:0x0162, B:86:0x0168, B:88:0x0170, B:90:0x017c, B:91:0x0188, B:36:0x00a7, B:38:0x00b7, B:42:0x00c1, B:44:0x00c8, B:46:0x00d2, B:50:0x00e1, B:55:0x00ec, B:57:0x00fb, B:82:0x0157, B:67:0x0114, B:69:0x0118, B:73:0x0125, B:75:0x012b, B:76:0x013c, B:78:0x0144, B:81:0x014e, B:62:0x0109, B:63:0x010e, B:47:0x00d5, B:49:0x00d9), top: B:125:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x010f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0111  */
    /* JADX WARN: Code duplicated, block: B:67:0x0114 A[Catch: can -> 0x0242, PHI: r15
      0x0114: PHI (r15v7 ??) = (r15v36 ??), (r15v37 ??), (r15v38 ??), (r15v39 ??) binds: [B:66:0x0112, B:56:0x00f9, B:58:0x00ff, B:60:0x0106] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {can -> 0x0242, blocks: (B:14:0x0038, B:16:0x003d, B:18:0x004c, B:93:0x018c, B:95:0x01a2, B:97:0x01a6, B:99:0x01aa, B:101:0x01ae, B:103:0x01b9, B:105:0x01c0, B:106:0x01d1, B:110:0x01e0, B:112:0x01e6, B:113:0x01f4, B:115:0x01f8, B:116:0x0207, B:117:0x0233, B:19:0x005c, B:21:0x0062, B:23:0x0066, B:24:0x006d, B:26:0x007a, B:28:0x008c, B:29:0x008e, B:31:0x0099, B:33:0x009f, B:85:0x0162, B:86:0x0168, B:88:0x0170, B:90:0x017c, B:91:0x0188, B:36:0x00a7, B:38:0x00b7, B:42:0x00c1, B:44:0x00c8, B:46:0x00d2, B:50:0x00e1, B:55:0x00ec, B:57:0x00fb, B:82:0x0157, B:67:0x0114, B:69:0x0118, B:73:0x0125, B:75:0x012b, B:76:0x013c, B:78:0x0144, B:81:0x014e, B:62:0x0109, B:63:0x010e, B:47:0x00d5, B:49:0x00d9), top: B:125:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0118 A[Catch: can -> 0x0242, TryCatch #0 {can -> 0x0242, blocks: (B:14:0x0038, B:16:0x003d, B:18:0x004c, B:93:0x018c, B:95:0x01a2, B:97:0x01a6, B:99:0x01aa, B:101:0x01ae, B:103:0x01b9, B:105:0x01c0, B:106:0x01d1, B:110:0x01e0, B:112:0x01e6, B:113:0x01f4, B:115:0x01f8, B:116:0x0207, B:117:0x0233, B:19:0x005c, B:21:0x0062, B:23:0x0066, B:24:0x006d, B:26:0x007a, B:28:0x008c, B:29:0x008e, B:31:0x0099, B:33:0x009f, B:85:0x0162, B:86:0x0168, B:88:0x0170, B:90:0x017c, B:91:0x0188, B:36:0x00a7, B:38:0x00b7, B:42:0x00c1, B:44:0x00c8, B:46:0x00d2, B:50:0x00e1, B:55:0x00ec, B:57:0x00fb, B:82:0x0157, B:67:0x0114, B:69:0x0118, B:73:0x0125, B:75:0x012b, B:76:0x013c, B:78:0x0144, B:81:0x014e, B:62:0x0109, B:63:0x010e, B:47:0x00d5, B:49:0x00d9), top: B:125:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0125 A[Catch: can -> 0x0242, TryCatch #0 {can -> 0x0242, blocks: (B:14:0x0038, B:16:0x003d, B:18:0x004c, B:93:0x018c, B:95:0x01a2, B:97:0x01a6, B:99:0x01aa, B:101:0x01ae, B:103:0x01b9, B:105:0x01c0, B:106:0x01d1, B:110:0x01e0, B:112:0x01e6, B:113:0x01f4, B:115:0x01f8, B:116:0x0207, B:117:0x0233, B:19:0x005c, B:21:0x0062, B:23:0x0066, B:24:0x006d, B:26:0x007a, B:28:0x008c, B:29:0x008e, B:31:0x0099, B:33:0x009f, B:85:0x0162, B:86:0x0168, B:88:0x0170, B:90:0x017c, B:91:0x0188, B:36:0x00a7, B:38:0x00b7, B:42:0x00c1, B:44:0x00c8, B:46:0x00d2, B:50:0x00e1, B:55:0x00ec, B:57:0x00fb, B:82:0x0157, B:67:0x0114, B:69:0x0118, B:73:0x0125, B:75:0x012b, B:76:0x013c, B:78:0x0144, B:81:0x014e, B:62:0x0109, B:63:0x010e, B:47:0x00d5, B:49:0x00d9), top: B:125:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x013c A[Catch: can -> 0x0242, TryCatch #0 {can -> 0x0242, blocks: (B:14:0x0038, B:16:0x003d, B:18:0x004c, B:93:0x018c, B:95:0x01a2, B:97:0x01a6, B:99:0x01aa, B:101:0x01ae, B:103:0x01b9, B:105:0x01c0, B:106:0x01d1, B:110:0x01e0, B:112:0x01e6, B:113:0x01f4, B:115:0x01f8, B:116:0x0207, B:117:0x0233, B:19:0x005c, B:21:0x0062, B:23:0x0066, B:24:0x006d, B:26:0x007a, B:28:0x008c, B:29:0x008e, B:31:0x0099, B:33:0x009f, B:85:0x0162, B:86:0x0168, B:88:0x0170, B:90:0x017c, B:91:0x0188, B:36:0x00a7, B:38:0x00b7, B:42:0x00c1, B:44:0x00c8, B:46:0x00d2, B:50:0x00e1, B:55:0x00ec, B:57:0x00fb, B:82:0x0157, B:67:0x0114, B:69:0x0118, B:73:0x0125, B:75:0x012b, B:76:0x013c, B:78:0x0144, B:81:0x014e, B:62:0x0109, B:63:0x010e, B:47:0x00d5, B:49:0x00d9), top: B:125:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0144 A[Catch: can -> 0x0242, TryCatch #0 {can -> 0x0242, blocks: (B:14:0x0038, B:16:0x003d, B:18:0x004c, B:93:0x018c, B:95:0x01a2, B:97:0x01a6, B:99:0x01aa, B:101:0x01ae, B:103:0x01b9, B:105:0x01c0, B:106:0x01d1, B:110:0x01e0, B:112:0x01e6, B:113:0x01f4, B:115:0x01f8, B:116:0x0207, B:117:0x0233, B:19:0x005c, B:21:0x0062, B:23:0x0066, B:24:0x006d, B:26:0x007a, B:28:0x008c, B:29:0x008e, B:31:0x0099, B:33:0x009f, B:85:0x0162, B:86:0x0168, B:88:0x0170, B:90:0x017c, B:91:0x0188, B:36:0x00a7, B:38:0x00b7, B:42:0x00c1, B:44:0x00c8, B:46:0x00d2, B:50:0x00e1, B:55:0x00ec, B:57:0x00fb, B:82:0x0157, B:67:0x0114, B:69:0x0118, B:73:0x0125, B:75:0x012b, B:76:0x013c, B:78:0x0144, B:81:0x014e, B:62:0x0109, B:63:0x010e, B:47:0x00d5, B:49:0x00d9), top: B:125:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0148  */
    /* JADX WARN: Code duplicated, block: B:81:0x014e A[Catch: can -> 0x0242, TryCatch #0 {can -> 0x0242, blocks: (B:14:0x0038, B:16:0x003d, B:18:0x004c, B:93:0x018c, B:95:0x01a2, B:97:0x01a6, B:99:0x01aa, B:101:0x01ae, B:103:0x01b9, B:105:0x01c0, B:106:0x01d1, B:110:0x01e0, B:112:0x01e6, B:113:0x01f4, B:115:0x01f8, B:116:0x0207, B:117:0x0233, B:19:0x005c, B:21:0x0062, B:23:0x0066, B:24:0x006d, B:26:0x007a, B:28:0x008c, B:29:0x008e, B:31:0x0099, B:33:0x009f, B:85:0x0162, B:86:0x0168, B:88:0x0170, B:90:0x017c, B:91:0x0188, B:36:0x00a7, B:38:0x00b7, B:42:0x00c1, B:44:0x00c8, B:46:0x00d2, B:50:0x00e1, B:55:0x00ec, B:57:0x00fb, B:82:0x0157, B:67:0x0114, B:69:0x0118, B:73:0x0125, B:75:0x012b, B:76:0x013c, B:78:0x0144, B:81:0x014e, B:62:0x0109, B:63:0x010e, B:47:0x00d5, B:49:0x00d9), top: B:125:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0157 A[Catch: can -> 0x0242, PHI: r15
      0x0157: PHI (r15v9 ??) = (r15v31 ??), (r15v10 ??), (r15v32 ??) binds: [B:66:0x0112, B:64:0x010f, B:61:0x0108] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {can -> 0x0242, blocks: (B:14:0x0038, B:16:0x003d, B:18:0x004c, B:93:0x018c, B:95:0x01a2, B:97:0x01a6, B:99:0x01aa, B:101:0x01ae, B:103:0x01b9, B:105:0x01c0, B:106:0x01d1, B:110:0x01e0, B:112:0x01e6, B:113:0x01f4, B:115:0x01f8, B:116:0x0207, B:117:0x0233, B:19:0x005c, B:21:0x0062, B:23:0x0066, B:24:0x006d, B:26:0x007a, B:28:0x008c, B:29:0x008e, B:31:0x0099, B:33:0x009f, B:85:0x0162, B:86:0x0168, B:88:0x0170, B:90:0x017c, B:91:0x0188, B:36:0x00a7, B:38:0x00b7, B:42:0x00c1, B:44:0x00c8, B:46:0x00d2, B:50:0x00e1, B:55:0x00ec, B:57:0x00fb, B:82:0x0157, B:67:0x0114, B:69:0x0118, B:73:0x0125, B:75:0x012b, B:76:0x013c, B:78:0x0144, B:81:0x014e, B:62:0x0109, B:63:0x010e, B:47:0x00d5, B:49:0x00d9), top: B:125:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0162 A[Catch: can -> 0x0242, TryCatch #0 {can -> 0x0242, blocks: (B:14:0x0038, B:16:0x003d, B:18:0x004c, B:93:0x018c, B:95:0x01a2, B:97:0x01a6, B:99:0x01aa, B:101:0x01ae, B:103:0x01b9, B:105:0x01c0, B:106:0x01d1, B:110:0x01e0, B:112:0x01e6, B:113:0x01f4, B:115:0x01f8, B:116:0x0207, B:117:0x0233, B:19:0x005c, B:21:0x0062, B:23:0x0066, B:24:0x006d, B:26:0x007a, B:28:0x008c, B:29:0x008e, B:31:0x0099, B:33:0x009f, B:85:0x0162, B:86:0x0168, B:88:0x0170, B:90:0x017c, B:91:0x0188, B:36:0x00a7, B:38:0x00b7, B:42:0x00c1, B:44:0x00c8, B:46:0x00d2, B:50:0x00e1, B:55:0x00ec, B:57:0x00fb, B:82:0x0157, B:67:0x0114, B:69:0x0118, B:73:0x0125, B:75:0x012b, B:76:0x013c, B:78:0x0144, B:81:0x014e, B:62:0x0109, B:63:0x010e, B:47:0x00d5, B:49:0x00d9), top: B:125:0x0038 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r20v0, types: [cav, csq] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v15 */
    @Override // defpackage.cdp
    public final void af(long j, long j2) throws cbo {
        VideoDecoderOutputBuffer videoDecoderOutputBuffer;
        long j3;
        long j4;
        csp cspVar;
        long j5;
        bwn bwnVar;
        bse bseVar;
        int i;
        int i2;
        ?? r15;
        ?? r16;
        int iL;
        ?? r17;
        ?? r0;
        ?? r18;
        ?? r19;
        long j6;
        ?? r110;
        ?? r111;
        ArrayDeque arrayDeque;
        ccu ccuVarR;
        int iK;
        if (this.L) {
            return;
        }
        ?? r7 = 1;
        if (this.q == null) {
            ccu ccuVarR2 = r();
            DecoderInputBuffer decoderInputBuffer = this.p;
            decoderInputBuffer.clear();
            int iK2 = k(ccuVarR2, decoderInputBuffer, 2);
            if (iK2 != -5) {
                if (iK2 == -4) {
                    ahno.O(decoderInputBuffer.isEndOfStream());
                    this.K = true;
                    this.L = true;
                    return;
                }
                return;
            }
            ak(ccuVarR2);
        }
        at();
        if (this.t == null) {
            return;
        }
        while (true) {
            try {
                VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.w;
                if (videoDecoderOutputBuffer2 == null) {
                    cam camVar = this.t;
                    camVar.getClass();
                    videoDecoderOutputBuffer2 = (VideoDecoderOutputBuffer) camVar.dequeueOutputBuffer();
                    this.w = videoDecoderOutputBuffer2;
                    if (videoDecoderOutputBuffer2 != null) {
                        this.k.f += videoDecoderOutputBuffer2.skippedOutputBufferCount;
                        this.Q -= videoDecoderOutputBuffer2.skippedOutputBufferCount;
                        if (videoDecoderOutputBuffer2.isEndOfStream()) {
                            if (this.E == 2) {
                                al();
                                at();
                            } else {
                                this.w.release();
                                this.w = null;
                                this.L = r7;
                            }
                            r111 = r7;
                            r0 = 0;
                        } else {
                            videoDecoderOutputBuffer = this.w;
                            videoDecoderOutputBuffer.getClass();
                            j3 = videoDecoderOutputBuffer.timeUs;
                            if (this.H == -9223372036854775807L) {
                                this.H = j;
                            }
                            videoDecoderOutputBuffer.getClass();
                            j4 = j3 - j;
                            if (!az()) {
                                cspVar = this.s;
                                cspVar.getClass();
                                j5 = j3 - cspVar.b;
                                if ((cspVar.d & r7) != 0) {
                                    j6 = cspVar.c;
                                    if (j6 == -9223372036854775807L && j5 >= j6) {
                                        an(videoDecoderOutputBuffer);
                                        ?? r1 = r7;
                                        r111 = r1 == true ? 1 : 0;
                                        r0 = r1;
                                    }
                                }
                                bwnVar = this.n;
                                bseVar = (bse) bwnVar.d(j3);
                                if (bseVar != null) {
                                    this.r = bseVar;
                                } else if (this.r == null) {
                                    this.r = (bse) bwnVar.c();
                                }
                                i = this.b;
                                i2 = this.G;
                                if (i2 != 0) {
                                    if (i2 != r7) {
                                        r18 = r7;
                                    } else {
                                        if (i2 == 3) {
                                            throw new IllegalStateException();
                                        }
                                        r19 = r7;
                                        long jY = bwp.y(SystemClock.elapsedRealtime()) - this.R;
                                        if (i == 2 || !ap(j4) || jY <= 100000) {
                                            r18 = r15;
                                            r16 = r15;
                                            r16 = r19;
                                            r16 = r19;
                                            r16 = r19;
                                            r16 = r19;
                                            r16 = r19;
                                            r16 = r19;
                                            r110 = r16;
                                            if (this.b == 2 && j != this.H) {
                                                if (j4 < -500000 || (iL = l(j)) == 0) {
                                                    r110 = r16;
                                                    r110 = r16;
                                                    if (aq(j4, j2)) {
                                                        ai(videoDecoderOutputBuffer);
                                                        r17 = r16;
                                                    } else if (j4 < 30000) {
                                                        r110 = r16;
                                                        bse bseVar2 = this.r;
                                                        bseVar2.getClass();
                                                        am(videoDecoderOutputBuffer, j5, bseVar2);
                                                        r17 = r16;
                                                    }
                                                } else {
                                                    r110 = r16;
                                                    this.k.j += r16 == true ? 1 : 0;
                                                    ao(iL, this.Q);
                                                    aj();
                                                    r110 = r16;
                                                }
                                            }
                                            r110 = r16;
                                            r110 = r16;
                                            r0 = 0;
                                            r111 = r110;
                                        } else {
                                            r16 = r19;
                                            r16 = r19;
                                            r16 = r19;
                                            r18 = r19;
                                        }
                                        r0 = r17 == true ? 1 : 0;
                                        r111 = r17;
                                    }
                                    r18 = r15;
                                    r16 = r15;
                                    bse bseVar3 = this.r;
                                    bseVar3.getClass();
                                    am(videoDecoderOutputBuffer, j5, bseVar3);
                                    r17 = r18;
                                    r0 = r17 == true ? 1 : 0;
                                    r111 = r17;
                                } else {
                                    r15 = r7;
                                    if (i != 2) {
                                        r18 = r15;
                                        r16 = r15;
                                        r16 = r19;
                                        r16 = r19;
                                        r16 = r19;
                                        r16 = r19;
                                        r16 = r19;
                                        r16 = r19;
                                        r110 = r16;
                                        if (this.b == 2) {
                                            if (j4 < -500000) {
                                                r110 = r16;
                                                r110 = r16;
                                                if (aq(j4, j2)) {
                                                    ai(videoDecoderOutputBuffer);
                                                    r17 = r16;
                                                } else if (j4 < 30000) {
                                                    r110 = r16;
                                                    bse bseVar4 = this.r;
                                                    bseVar4.getClass();
                                                    am(videoDecoderOutputBuffer, j5, bseVar4);
                                                    r17 = r16;
                                                }
                                            } else {
                                                r110 = r16;
                                                r110 = r16;
                                                if (aq(j4, j2)) {
                                                    ai(videoDecoderOutputBuffer);
                                                    r17 = r16;
                                                } else if (j4 < 30000) {
                                                    r110 = r16;
                                                    bse bseVar5 = this.r;
                                                    bseVar5.getClass();
                                                    am(videoDecoderOutputBuffer, j5, bseVar5);
                                                    r17 = r16;
                                                }
                                            }
                                        }
                                        r110 = r16;
                                        r110 = r16;
                                        r0 = 0;
                                        r111 = r110;
                                    } else {
                                        r18 = r15;
                                        r16 = r15;
                                        bse bseVar6 = this.r;
                                        bseVar6.getClass();
                                        am(videoDecoderOutputBuffer, j5, bseVar6);
                                        r17 = r18;
                                    }
                                    r0 = r17 == true ? 1 : 0;
                                    r111 = r17;
                                }
                            } else if (ap(j4)) {
                                an(videoDecoderOutputBuffer);
                                ?? r2 = r7;
                                r111 = r2 == true ? 1 : 0;
                                r0 = r2;
                            } else {
                                r110 = r7;
                                r110 = r16;
                                r110 = r16;
                                r0 = 0;
                                r111 = r110;
                            }
                            if (r0 != 0) {
                                this.Q--;
                                while (true) {
                                    arrayDeque = this.o;
                                    if (!!arrayDeque.isEmpty() || j3 < ((csp) arrayDeque.peek()).a) {
                                        break;
                                    }
                                    csp cspVar2 = (csp) arrayDeque.poll();
                                    cspVar2.getClass();
                                    this.s = cspVar2;
                                }
                                this.w = null;
                            }
                        }
                    } else {
                        r111 = r7;
                        r0 = 0;
                    }
                } else if (videoDecoderOutputBuffer2.isEndOfStream()) {
                    if (this.E == 2) {
                        al();
                        at();
                    } else {
                        this.w.release();
                        this.w = null;
                        this.L = r7;
                    }
                    r111 = r7;
                    r0 = 0;
                } else {
                    videoDecoderOutputBuffer = this.w;
                    videoDecoderOutputBuffer.getClass();
                    j3 = videoDecoderOutputBuffer.timeUs;
                    if (this.H == -9223372036854775807L) {
                        this.H = j;
                    }
                    videoDecoderOutputBuffer.getClass();
                    j4 = j3 - j;
                    if (!az()) {
                        cspVar = this.s;
                        cspVar.getClass();
                        j5 = j3 - cspVar.b;
                        if ((cspVar.d & r7) != 0) {
                            j6 = cspVar.c;
                            if (j6 == -9223372036854775807L) {
                            }
                        }
                        bwnVar = this.n;
                        bseVar = (bse) bwnVar.d(j3);
                        if (bseVar != null) {
                            this.r = bseVar;
                        } else if (this.r == null) {
                            this.r = (bse) bwnVar.c();
                        }
                        i = this.b;
                        i2 = this.G;
                        if (i2 != 0) {
                            if (i2 != r7) {
                                r18 = r7;
                            } else {
                                if (i2 == 3) {
                                    throw new IllegalStateException();
                                }
                                r19 = r7;
                                long jY2 = bwp.y(SystemClock.elapsedRealtime()) - this.R;
                                if (i == 2) {
                                }
                                r18 = r15;
                                r16 = r15;
                                r16 = r19;
                                r16 = r19;
                                r16 = r19;
                                r16 = r19;
                                r16 = r19;
                                r16 = r19;
                                r110 = r16;
                                if (this.b == 2) {
                                    if (j4 < -500000) {
                                        r110 = r16;
                                        r110 = r16;
                                        if (aq(j4, j2)) {
                                            ai(videoDecoderOutputBuffer);
                                            r17 = r16;
                                        } else if (j4 < 30000) {
                                            r110 = r16;
                                            bse bseVar7 = this.r;
                                            bseVar7.getClass();
                                            am(videoDecoderOutputBuffer, j5, bseVar7);
                                            r17 = r16;
                                        }
                                        r0 = r17 == true ? 1 : 0;
                                        r111 = r17;
                                    } else {
                                        r110 = r16;
                                        r110 = r16;
                                        if (aq(j4, j2)) {
                                            ai(videoDecoderOutputBuffer);
                                            r17 = r16;
                                        } else if (j4 < 30000) {
                                            r110 = r16;
                                            bse bseVar8 = this.r;
                                            bseVar8.getClass();
                                            am(videoDecoderOutputBuffer, j5, bseVar8);
                                            r17 = r16;
                                        }
                                        r0 = r17 == true ? 1 : 0;
                                        r111 = r17;
                                    }
                                }
                                r110 = r16;
                                r110 = r16;
                                r0 = 0;
                                r111 = r110;
                            }
                            r18 = r15;
                            r16 = r15;
                            bse bseVar9 = this.r;
                            bseVar9.getClass();
                            am(videoDecoderOutputBuffer, j5, bseVar9);
                            r17 = r18;
                            r0 = r17 == true ? 1 : 0;
                            r111 = r17;
                        } else {
                            r15 = r7;
                            if (i != 2) {
                                r18 = r15;
                                r16 = r15;
                                r16 = r19;
                                r16 = r19;
                                r16 = r19;
                                r16 = r19;
                                r16 = r19;
                                r16 = r19;
                                r110 = r16;
                                if (this.b == 2) {
                                    if (j4 < -500000) {
                                        r110 = r16;
                                        r110 = r16;
                                        if (aq(j4, j2)) {
                                            ai(videoDecoderOutputBuffer);
                                            r17 = r16;
                                        } else if (j4 < 30000) {
                                            r110 = r16;
                                            bse bseVar10 = this.r;
                                            bseVar10.getClass();
                                            am(videoDecoderOutputBuffer, j5, bseVar10);
                                            r17 = r16;
                                        }
                                    } else {
                                        r110 = r16;
                                        r110 = r16;
                                        if (aq(j4, j2)) {
                                            ai(videoDecoderOutputBuffer);
                                            r17 = r16;
                                        } else if (j4 < 30000) {
                                            r110 = r16;
                                            bse bseVar11 = this.r;
                                            bseVar11.getClass();
                                            am(videoDecoderOutputBuffer, j5, bseVar11);
                                            r17 = r16;
                                        }
                                    }
                                }
                                r110 = r16;
                                r110 = r16;
                                r0 = 0;
                                r111 = r110;
                            } else {
                                r18 = r15;
                                r16 = r15;
                                bse bseVar12 = this.r;
                                bseVar12.getClass();
                                am(videoDecoderOutputBuffer, j5, bseVar12);
                                r17 = r18;
                            }
                            r0 = r17 == true ? 1 : 0;
                            r111 = r17;
                        }
                    } else if (ap(j4)) {
                        an(videoDecoderOutputBuffer);
                        ?? r3 = r7;
                        r111 = r3 == true ? 1 : 0;
                        r0 = r3;
                    } else {
                        r110 = r7;
                        r110 = r16;
                        r110 = r16;
                        r0 = 0;
                        r111 = r110;
                    }
                    if (r0 != 0) {
                        this.Q--;
                        while (true) {
                            arrayDeque = this.o;
                            if (!arrayDeque.isEmpty()) {
                                break;
                            }
                            break;
                            break;
                            csp cspVar3 = (csp) arrayDeque.poll();
                            cspVar3.getClass();
                            this.s = cspVar3;
                        }
                        this.w = null;
                    }
                }
                if (r0 == 0) {
                    while (true) {
                        csp cspVarAr = ar();
                        cspVarAr.getClass();
                        coo cooVar = this.c;
                        cooVar.getClass();
                        cspVarAr.d = cooVar.a();
                        cam camVar2 = this.t;
                        if (camVar2 == null || this.E == 2 || this.K) {
                            break;
                        }
                        DecoderInputBuffer decoderInputBuffer2 = this.u;
                        if (decoderInputBuffer2 == null) {
                            decoderInputBuffer2 = (DecoderInputBuffer) camVar2.dequeueInputBuffer();
                            this.u = decoderInputBuffer2;
                            if (decoderInputBuffer2 == null) {
                                break;
                            }
                            decoderInputBuffer2.getClass();
                            if (this.E == r111) {
                                decoderInputBuffer2.setFlags(4);
                                cam camVar3 = this.t;
                                camVar3.getClass();
                                camVar3.queueInputBuffer(decoderInputBuffer2);
                                this.u = null;
                                this.E = 2;
                                break;
                            }
                            ccuVarR = r();
                            iK = k(ccuVarR, decoderInputBuffer2, 0);
                            if (iK != -5) {
                                r111 = 1;
                                ak(ccuVarR);
                            } else {
                                if (iK != -4) {
                                    break;
                                }
                                if (decoderInputBuffer2.isEndOfStream()) {
                                    this.K = true;
                                    cam camVar4 = this.t;
                                    camVar4.getClass();
                                    camVar4.queueInputBuffer(decoderInputBuffer2);
                                    this.u = null;
                                    break;
                                }
                                if (this.J) {
                                    bwn bwnVar2 = this.n;
                                    long j7 = decoderInputBuffer2.timeUs;
                                    bse bseVar13 = this.q;
                                    bseVar13.getClass();
                                    bwnVar2.e(j7, bseVar13);
                                    this.J = false;
                                }
                                decoderInputBuffer2.flip();
                                decoderInputBuffer2.format = this.q;
                                cam camVar5 = this.t;
                                camVar5.getClass();
                                camVar5.queueInputBuffer(decoderInputBuffer2);
                                r111 = 1;
                                this.Q++;
                                this.F = true;
                                this.k.c++;
                                this.v = Math.max(this.v, decoderInputBuffer2.timeUs);
                                this.u = null;
                            }
                        } else {
                            decoderInputBuffer2.getClass();
                            if (this.E == r111) {
                                decoderInputBuffer2.setFlags(4);
                                cam camVar6 = this.t;
                                camVar6.getClass();
                                camVar6.queueInputBuffer(decoderInputBuffer2);
                                this.u = null;
                                this.E = 2;
                                break;
                            }
                            ccuVarR = r();
                            iK = k(ccuVarR, decoderInputBuffer2, 0);
                            if (iK != -5) {
                                r111 = 1;
                                ak(ccuVarR);
                            } else {
                                if (iK != -4) {
                                    break;
                                    break;
                                }
                                if (decoderInputBuffer2.isEndOfStream()) {
                                    this.K = true;
                                    cam camVar7 = this.t;
                                    camVar7.getClass();
                                    camVar7.queueInputBuffer(decoderInputBuffer2);
                                    this.u = null;
                                    break;
                                }
                                if (this.J) {
                                    bwn bwnVar3 = this.n;
                                    long j8 = decoderInputBuffer2.timeUs;
                                    bse bseVar14 = this.q;
                                    bseVar14.getClass();
                                    bwnVar3.e(j8, bseVar14);
                                    this.J = false;
                                }
                                decoderInputBuffer2.flip();
                                decoderInputBuffer2.format = this.q;
                                cam camVar8 = this.t;
                                camVar8.getClass();
                                camVar8.queueInputBuffer(decoderInputBuffer2);
                                r111 = 1;
                                this.Q++;
                                this.F = true;
                                this.k.c++;
                                this.v = Math.max(this.v, decoderInputBuffer2.timeUs);
                                this.u = null;
                            }
                        }
                    }
                    this.k.a();
                    return;
                }
                r7 = r111;
            } catch (can e) {
                bvx.d("DecoderVideoRenderer", "Video codec error", e);
                this.T.K(e);
                throw q(e, this.q, false, 4003);
            }
        }
    }

    @Override // defpackage.cdp
    public final boolean ag() {
        return this.L;
    }

    @Override // defpackage.cdp
    public boolean ah() {
        if (this.q != null && ((Z() || this.w != null) && (this.G == 3 || !az()))) {
            this.I = -9223372036854775807L;
            return true;
        }
        if (this.I != -9223372036854775807L) {
            if (SystemClock.elapsedRealtime() < this.I) {
                return true;
            }
            this.I = -9223372036854775807L;
        }
        return false;
    }

    protected final void ai(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        ao(0, 1);
        videoDecoderOutputBuffer.release();
    }

    protected final void aj() throws cbo {
        this.Q = 0;
        if (this.E != 0) {
            al();
            at();
            return;
        }
        this.u = null;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.w;
        if (videoDecoderOutputBuffer != null) {
            videoDecoderOutputBuffer.release();
            this.w = null;
        }
        cam camVar = this.t;
        camVar.getClass();
        camVar.flush();
        camVar.setOutputStartTimeUs(this.e);
        this.F = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [cju, java.lang.Object] */
    protected final void ak(ccu ccuVar) throws cbo {
        caz cazVarE;
        this.J = true;
        Object obj = ccuVar.b;
        obj.getClass();
        ay(ccuVar.a);
        bse bseVar = this.q;
        bse bseVar2 = (bse) obj;
        this.q = bseVar2;
        cam camVar = this.t;
        if (camVar == null) {
            at();
            pj pjVar = this.T;
            bse bseVar3 = this.q;
            bseVar3.getClass();
            pjVar.H(bseVar3, null);
            return;
        }
        if (this.D != this.C) {
            String name = camVar.getName();
            bseVar.getClass();
            cazVarE = new caz(name, bseVar, bseVar2, 0, SemanticState.Focused);
        } else {
            String name2 = camVar.getName();
            bseVar.getClass();
            cazVarE = e(name2, bseVar, bseVar2);
        }
        if (cazVarE.d == 0) {
            if (this.F) {
                this.E = 1;
            } else {
                al();
                at();
            }
        }
        pj pjVar2 = this.T;
        bse bseVar4 = this.q;
        bseVar4.getClass();
        pjVar2.H(bseVar4, cazVarE);
    }

    protected final void al() {
        this.u = null;
        this.w = null;
        this.E = 0;
        this.F = false;
        this.Q = 0;
        cam camVar = this.t;
        if (camVar != null) {
            this.k.b++;
            camVar.release();
            this.T.D(this.t.getName());
            this.t = null;
        }
        aw(null);
    }

    protected void am(VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j, bse bseVar) {
        boolean z;
        ctm ctmVar = this.B;
        if (ctmVar != null) {
            ctmVar.c(j, p().c(), bseVar, null);
        }
        this.R = bwp.y(SystemClock.elapsedRealtime());
        int i = videoDecoderOutputBuffer.mode;
        if (i != 1) {
            z = false;
        } else if (this.z != null) {
            i = 1;
            z = true;
        } else {
            z = false;
            i = 1;
        }
        boolean z2 = i == 0 && this.A != null;
        if (!z2 && !z) {
            ai(videoDecoderOutputBuffer);
            return;
        }
        int i2 = videoDecoderOutputBuffer.width;
        int i3 = videoDecoderOutputBuffer.height;
        btz btzVar = this.M;
        if (btzVar == null || btzVar.b != i2 || btzVar.c != i3) {
            btz btzVar2 = new btz(i2, i3, 1.0f);
            this.M = btzVar2;
            this.T.L(btzVar2);
        }
        if (z2) {
            ctl ctlVar = this.A;
            ctlVar.getClass();
            ctlVar.jL(videoDecoderOutputBuffer);
        } else {
            Surface surface = this.z;
            surface.getClass();
            g(videoDecoderOutputBuffer, surface);
        }
        this.P = 0;
        this.k.e++;
        if (this.G != 3) {
            this.G = 3;
            Object obj = this.y;
            if (obj != null) {
                this.T.I(obj);
            }
        }
    }

    protected final void an(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        this.k.f++;
        videoDecoderOutputBuffer.release();
    }

    protected final void ao(int i, int i2) {
        cay cayVar = this.k;
        cayVar.h += i;
        int i3 = i + i2;
        cayVar.g += i3;
        this.O += i3;
        int i4 = this.P + i3;
        this.P = i4;
        cayVar.i = Math.max(i4, cayVar.i);
        int i5 = this.m;
        if (i5 <= 0 || this.O < i5) {
            return;
        }
        au();
    }

    protected boolean aq(long j, long j2) {
        return ap(j);
    }

    protected abstract cam d(bse bseVar, CryptoConfig cryptoConfig);

    protected caz e(String str, bse bseVar, bse bseVar2) {
        throw null;
    }

    @Override // defpackage.cal
    public final void fZ() {
        qcb qcbVar = this.U;
        if (qcbVar != null) {
            qcbVar.K();
        }
    }

    protected abstract void g(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface);

    @Override // defpackage.cal
    public final void ga() {
        qcb qcbVar = this.U;
        if (qcbVar != null) {
            qcbVar.K();
        }
    }

    protected abstract void h(int i);

    @Override // defpackage.cav, defpackage.cdp
    public final void z() {
        if (this.G == 0) {
            this.G = 1;
        }
    }
}
