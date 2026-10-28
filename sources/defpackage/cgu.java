package defpackage;

import android.media.AudioDeviceInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import app.rive.semantics.SemanticState;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class cgu extends cav implements ccz, cal {
    private int A;
    private boolean B;
    private boolean C;
    private long D;
    private boolean E;
    private boolean F;
    private long G;
    private final long[] H;
    private int I;
    private boolean J;
    private long K;
    private long L;
    private long M;
    private long N;
    private boolean O;
    private Executor P;
    private qcb Q;
    public final cgf k;
    public bse l;
    public SimpleDecoderOutputBuffer m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final boy q;
    private final DecoderInputBuffer r;
    private cay s;
    private int t;
    private int u;
    private boolean v;
    private cam w;
    private DecoderInputBuffer x;
    private cju y;
    private cju z;

    public cgu(Handler handler, cfx cfxVar, cgf cgfVar) {
        super(1);
        this.q = new boy(handler, cfxVar);
        this.k = cgfVar;
        this.r = DecoderInputBuffer.newNoDataInstance();
        this.A = 0;
        this.C = true;
        ao(-9223372036854775807L);
        this.H = new long[10];
        this.K = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.M = -9223372036854775807L;
        this.N = -9223372036854775807L;
        this.O = false;
    }

    private final void aj() throws cbo {
        CryptoConfig cryptoConfigB;
        if (this.w == null) {
            an(this.z);
            cju cjuVar = this.y;
            if (cjuVar != null) {
                cryptoConfigB = cjuVar.b();
                if (cryptoConfigB == null && this.y.c() == null) {
                    return;
                }
            } else {
                cryptoConfigB = null;
            }
            try {
                if (this.P == null) {
                    this.P = new cck(new Handler(Looper.myLooper()), 3);
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                cam camVarG = g(this.l, cryptoConfigB);
                this.w = camVarG;
                camVarG.setOutputStartTimeUs(this.e);
                this.w.setCallback(this, this.P);
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                this.q.f(this.w.getName(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
                this.s.a++;
            } catch (can e) {
                bvx.d("DecoderAudioRenderer", "Audio codec error", e);
                this.q.c(e);
                throw q(e, this.l, false, 4001);
            } catch (OutOfMemoryError e2) {
                throw q(e2, this.l, false, 4001);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [cju, java.lang.Object] */
    private final void ak(ccu ccuVar) throws cbo {
        Object obj = ccuVar.b;
        obj.getClass();
        ap(ccuVar.a);
        bse bseVar = this.l;
        bse bseVar2 = (bse) obj;
        this.l = bseVar2;
        this.t = bseVar2.M;
        this.u = bseVar2.N;
        cam camVar = this.w;
        if (camVar == null) {
            aj();
            this.q.j(this.l, null);
            return;
        }
        caz cazVar = this.z != this.y ? new caz(camVar.getName(), bseVar, bseVar2, 0, SemanticState.Focused) : ai(camVar.getName(), bseVar, bseVar2);
        if (cazVar.d == 0) {
            if (this.B) {
                this.A = 1;
            } else {
                am();
                aj();
                this.C = true;
            }
        }
        this.q.j(this.l, cazVar);
    }

    private final void al() {
        this.F = true;
        this.k.m();
        this.M = this.L;
    }

    private final void am() {
        this.x = null;
        this.m = null;
        this.A = 0;
        this.B = false;
        this.K = -9223372036854775807L;
        this.L = -9223372036854775807L;
        cam camVar = this.w;
        if (camVar != null) {
            this.s.b++;
            camVar.release();
            this.q.g(this.w.getName());
            this.w = null;
        }
        an(null);
    }

    private final void an(cju cjuVar) {
        aup.o(this.y, cjuVar);
        this.y = cjuVar;
    }

    private final void ao(long j) {
        this.G = j;
        if (j != -9223372036854775807L) {
            this.k.x(j);
        }
    }

    private final void ap(cju cjuVar) {
        aup.o(this.z, cjuVar);
        this.z = cjuVar;
    }

    private final void aq() {
        long jC = this.k.c(ag());
        if (jC != Long.MIN_VALUE) {
            if (!this.n) {
                jC = Math.max(this.D, jC);
            }
            this.D = jC;
            this.n = false;
        }
    }

    @Override // defpackage.cav, defpackage.cdm
    public void A(int i, Object obj) {
        if (i == 2) {
            this.k.D(((Float) obj).floatValue());
        }
        if (i == 3) {
            this.k.p((brq) obj);
            return;
        }
        if (i == 6) {
            this.k.s((brr) obj);
            return;
        }
        if (i == 19) {
            cgf cgfVar = this.k;
            obj.getClass();
            cgfVar.C(((Integer) obj).intValue());
        } else {
            if (i == 20) {
                cgf cgfVar2 = this.k;
                obj.getClass();
                cgfVar2.q((cfu) obj);
                return;
            }
            switch (i) {
                case 9:
                    this.k.B(((Boolean) obj).booleanValue());
                    break;
                case 10:
                    this.k.r(((Integer) obj).intValue());
                    break;
                case 11:
                    this.Q = (qcb) obj;
                    break;
                case 12:
                    this.k.A((AudioDeviceInfo) obj);
                    break;
            }
        }
    }

    @Override // defpackage.cav
    protected final void D() {
        this.l = null;
        this.C = true;
        ao(-9223372036854775807L);
        this.o = false;
        this.p = false;
        this.M = -9223372036854775807L;
        try {
            ap(null);
            am();
            this.k.o();
        } finally {
            this.q.h(this.s);
        }
    }

    @Override // defpackage.cav
    protected void E(boolean z, boolean z2) {
        cay cayVar = new cay();
        this.s = cayVar;
        this.q.i(cayVar);
        u();
        cgf cgfVar = this.k;
        cgfVar.h();
        cgfVar.z(v());
        cgfVar.t(p());
        cgfVar.u(new cgt(this));
    }

    @Override // defpackage.cav
    protected final void G(long j, boolean z, boolean z2) throws cbo {
        this.k.i();
        this.D = j;
        this.M = -9223372036854775807L;
        this.N = -9223372036854775807L;
        this.O = false;
        this.o = false;
        this.p = false;
        this.n = true;
        this.E = false;
        this.F = false;
        if (this.w != null) {
            if (this.A != 0) {
                am();
                aj();
                return;
            }
            this.x = null;
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = this.m;
            if (simpleDecoderOutputBuffer != null) {
                simpleDecoderOutputBuffer.release();
                this.m = null;
            }
            cam camVar = this.w;
            camVar.getClass();
            camVar.flush();
            camVar.setOutputStartTimeUs(this.e);
            this.B = false;
        }
    }

    @Override // defpackage.cav
    protected void K() {
        this.k.l();
        this.J = true;
    }

    @Override // defpackage.cav
    protected final void L() {
        aq();
        this.k.k();
        this.J = false;
        this.p = false;
        this.N = -9223372036854775807L;
        this.O = false;
    }

    @Override // defpackage.cav
    protected final void M(bse[] bseVarArr, long j, long j2, cnm cnmVar) {
        this.v = false;
        if (this.G == -9223372036854775807L) {
            ao(j2);
            return;
        }
        int i = this.I;
        if (i == 10) {
            bvx.e("DecoderAudioRenderer", "Too many stream changes, so dropping offset: " + this.H[9]);
        } else {
            this.I = i + 1;
        }
        this.H[this.I - 1] = j2;
    }

    @Override // defpackage.ccz
    public final long a() {
        if (this.b == 2) {
            aq();
        }
        return this.D;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x018b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4 A[Catch: cge -> 0x01ff, cgb -> 0x0209, cga -> 0x0213, can -> 0x021b, EDGE_INSN: B:40:0x00a4->B:123:? BREAK  A[LOOP:0: B:23:0x0053->B:52:0x0138], TryCatch #5 {cge -> 0x01ff, blocks: (B:24:0x0055, B:26:0x0059, B:28:0x0067, B:30:0x006b, B:31:0x0077, B:33:0x007f, B:35:0x0088, B:54:0x014e, B:56:0x0152, B:58:0x0156, B:60:0x015a, B:62:0x015e, B:64:0x0168, B:66:0x016c, B:67:0x017f, B:70:0x018d, B:72:0x0193, B:73:0x0198, B:75:0x01a0, B:76:0x01b2, B:78:0x01b6, B:79:0x01bf, B:81:0x01cb, B:84:0x01d5, B:83:0x01d1, B:85:0x01f4, B:36:0x0098, B:38:0x00a0, B:40:0x00a4, B:41:0x00ae, B:45:0x00bb, B:46:0x00c3, B:47:0x00c4, B:49:0x00cf, B:50:0x012a, B:52:0x0138, B:53:0x0148), top: B:105:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae A[Catch: cge -> 0x01ff, cgb -> 0x0209, cga -> 0x0213, can -> 0x021b, TRY_LEAVE, TryCatch #5 {cge -> 0x01ff, blocks: (B:24:0x0055, B:26:0x0059, B:28:0x0067, B:30:0x006b, B:31:0x0077, B:33:0x007f, B:35:0x0088, B:54:0x014e, B:56:0x0152, B:58:0x0156, B:60:0x015a, B:62:0x015e, B:64:0x0168, B:66:0x016c, B:67:0x017f, B:70:0x018d, B:72:0x0193, B:73:0x0198, B:75:0x01a0, B:76:0x01b2, B:78:0x01b6, B:79:0x01bf, B:81:0x01cb, B:84:0x01d5, B:83:0x01d1, B:85:0x01f4, B:36:0x0098, B:38:0x00a0, B:40:0x00a4, B:41:0x00ae, B:45:0x00bb, B:46:0x00c3, B:47:0x00c4, B:49:0x00cf, B:50:0x012a, B:52:0x0138, B:53:0x0148), top: B:105:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4 A[Catch: cge -> 0x01ff, cgb -> 0x0209, cga -> 0x0213, can -> 0x021b, TryCatch #5 {cge -> 0x01ff, blocks: (B:24:0x0055, B:26:0x0059, B:28:0x0067, B:30:0x006b, B:31:0x0077, B:33:0x007f, B:35:0x0088, B:54:0x014e, B:56:0x0152, B:58:0x0156, B:60:0x015a, B:62:0x015e, B:64:0x0168, B:66:0x016c, B:67:0x017f, B:70:0x018d, B:72:0x0193, B:73:0x0198, B:75:0x01a0, B:76:0x01b2, B:78:0x01b6, B:79:0x01bf, B:81:0x01cb, B:84:0x01d5, B:83:0x01d1, B:85:0x01f4, B:36:0x0098, B:38:0x00a0, B:40:0x00a4, B:41:0x00ae, B:45:0x00bb, B:46:0x00c3, B:47:0x00c4, B:49:0x00cf, B:50:0x012a, B:52:0x0138, B:53:0x0148), top: B:105:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00cf A[Catch: cge -> 0x01ff, cgb -> 0x0209, cga -> 0x0213, can -> 0x021b, TryCatch #5 {cge -> 0x01ff, blocks: (B:24:0x0055, B:26:0x0059, B:28:0x0067, B:30:0x006b, B:31:0x0077, B:33:0x007f, B:35:0x0088, B:54:0x014e, B:56:0x0152, B:58:0x0156, B:60:0x015a, B:62:0x015e, B:64:0x0168, B:66:0x016c, B:67:0x017f, B:70:0x018d, B:72:0x0193, B:73:0x0198, B:75:0x01a0, B:76:0x01b2, B:78:0x01b6, B:79:0x01bf, B:81:0x01cb, B:84:0x01d5, B:83:0x01d1, B:85:0x01f4, B:36:0x0098, B:38:0x00a0, B:40:0x00a4, B:41:0x00ae, B:45:0x00bb, B:46:0x00c3, B:47:0x00c4, B:49:0x00cf, B:50:0x012a, B:52:0x0138, B:53:0x0148), top: B:105:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0138 A[Catch: cge -> 0x01ff, cgb -> 0x0209, cga -> 0x0213, can -> 0x021b, LOOP:0: B:23:0x0053->B:52:0x0138, LOOP_END, TryCatch #5 {cge -> 0x01ff, blocks: (B:24:0x0055, B:26:0x0059, B:28:0x0067, B:30:0x006b, B:31:0x0077, B:33:0x007f, B:35:0x0088, B:54:0x014e, B:56:0x0152, B:58:0x0156, B:60:0x015a, B:62:0x015e, B:64:0x0168, B:66:0x016c, B:67:0x017f, B:70:0x018d, B:72:0x0193, B:73:0x0198, B:75:0x01a0, B:76:0x01b2, B:78:0x01b6, B:79:0x01bf, B:81:0x01cb, B:84:0x01d5, B:83:0x01d1, B:85:0x01f4, B:36:0x0098, B:38:0x00a0, B:40:0x00a4, B:41:0x00ae, B:45:0x00bb, B:46:0x00c3, B:47:0x00c4, B:49:0x00cf, B:50:0x012a, B:52:0x0138, B:53:0x0148), top: B:105:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0168 A[Catch: cge -> 0x01ff, cgb -> 0x0209, cga -> 0x0213, can -> 0x021b, PHI: r5
      0x0168: PHI (r5v8 androidx.media3.decoder.DecoderInputBuffer) = (r5v7 androidx.media3.decoder.DecoderInputBuffer), (r5v19 androidx.media3.decoder.DecoderInputBuffer) binds: [B:61:0x015c, B:63:0x0166] A[DONT_GENERATE, DONT_INLINE], TryCatch #5 {cge -> 0x01ff, blocks: (B:24:0x0055, B:26:0x0059, B:28:0x0067, B:30:0x006b, B:31:0x0077, B:33:0x007f, B:35:0x0088, B:54:0x014e, B:56:0x0152, B:58:0x0156, B:60:0x015a, B:62:0x015e, B:64:0x0168, B:66:0x016c, B:67:0x017f, B:70:0x018d, B:72:0x0193, B:73:0x0198, B:75:0x01a0, B:76:0x01b2, B:78:0x01b6, B:79:0x01bf, B:81:0x01cb, B:84:0x01d5, B:83:0x01d1, B:85:0x01f4, B:36:0x0098, B:38:0x00a0, B:40:0x00a4, B:41:0x00ae, B:45:0x00bb, B:46:0x00c3, B:47:0x00c4, B:49:0x00cf, B:50:0x012a, B:52:0x0138, B:53:0x0148), top: B:105:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x017f A[Catch: cge -> 0x01ff, cgb -> 0x0209, cga -> 0x0213, can -> 0x021b, TryCatch #5 {cge -> 0x01ff, blocks: (B:24:0x0055, B:26:0x0059, B:28:0x0067, B:30:0x006b, B:31:0x0077, B:33:0x007f, B:35:0x0088, B:54:0x014e, B:56:0x0152, B:58:0x0156, B:60:0x015a, B:62:0x015e, B:64:0x0168, B:66:0x016c, B:67:0x017f, B:70:0x018d, B:72:0x0193, B:73:0x0198, B:75:0x01a0, B:76:0x01b2, B:78:0x01b6, B:79:0x01bf, B:81:0x01cb, B:84:0x01d5, B:83:0x01d1, B:85:0x01f4, B:36:0x0098, B:38:0x00a0, B:40:0x00a4, B:41:0x00ae, B:45:0x00bb, B:46:0x00c3, B:47:0x00c4, B:49:0x00cf, B:50:0x012a, B:52:0x0138, B:53:0x0148), top: B:105:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0193 A[Catch: cge -> 0x01ff, cgb -> 0x0209, cga -> 0x0213, can -> 0x021b, EDGE_INSN: B:72:0x0193->B:87:0x01f9 BREAK  A[LOOP:1: B:54:0x014e->B:120:0x014e], TryCatch #5 {cge -> 0x01ff, blocks: (B:24:0x0055, B:26:0x0059, B:28:0x0067, B:30:0x006b, B:31:0x0077, B:33:0x007f, B:35:0x0088, B:54:0x014e, B:56:0x0152, B:58:0x0156, B:60:0x015a, B:62:0x015e, B:64:0x0168, B:66:0x016c, B:67:0x017f, B:70:0x018d, B:72:0x0193, B:73:0x0198, B:75:0x01a0, B:76:0x01b2, B:78:0x01b6, B:79:0x01bf, B:81:0x01cb, B:84:0x01d5, B:83:0x01d1, B:85:0x01f4, B:36:0x0098, B:38:0x00a0, B:40:0x00a4, B:41:0x00ae, B:45:0x00bb, B:46:0x00c3, B:47:0x00c4, B:49:0x00cf, B:50:0x012a, B:52:0x0138, B:53:0x0148), top: B:105:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0198 A[Catch: cge -> 0x01ff, cgb -> 0x0209, cga -> 0x0213, can -> 0x021b, TryCatch #5 {cge -> 0x01ff, blocks: (B:24:0x0055, B:26:0x0059, B:28:0x0067, B:30:0x006b, B:31:0x0077, B:33:0x007f, B:35:0x0088, B:54:0x014e, B:56:0x0152, B:58:0x0156, B:60:0x015a, B:62:0x015e, B:64:0x0168, B:66:0x016c, B:67:0x017f, B:70:0x018d, B:72:0x0193, B:73:0x0198, B:75:0x01a0, B:76:0x01b2, B:78:0x01b6, B:79:0x01bf, B:81:0x01cb, B:84:0x01d5, B:83:0x01d1, B:85:0x01f4, B:36:0x0098, B:38:0x00a0, B:40:0x00a4, B:41:0x00ae, B:45:0x00bb, B:46:0x00c3, B:47:0x00c4, B:49:0x00cf, B:50:0x012a, B:52:0x0138, B:53:0x0148), top: B:105:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01b2 A[Catch: cge -> 0x01ff, cgb -> 0x0209, cga -> 0x0213, can -> 0x021b, TryCatch #5 {cge -> 0x01ff, blocks: (B:24:0x0055, B:26:0x0059, B:28:0x0067, B:30:0x006b, B:31:0x0077, B:33:0x007f, B:35:0x0088, B:54:0x014e, B:56:0x0152, B:58:0x0156, B:60:0x015a, B:62:0x015e, B:64:0x0168, B:66:0x016c, B:67:0x017f, B:70:0x018d, B:72:0x0193, B:73:0x0198, B:75:0x01a0, B:76:0x01b2, B:78:0x01b6, B:79:0x01bf, B:81:0x01cb, B:84:0x01d5, B:83:0x01d1, B:85:0x01f4, B:36:0x0098, B:38:0x00a0, B:40:0x00a4, B:41:0x00ae, B:45:0x00bb, B:46:0x00c3, B:47:0x00c4, B:49:0x00cf, B:50:0x012a, B:52:0x0138, B:53:0x0148), top: B:105:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b6 A[Catch: cge -> 0x01ff, cgb -> 0x0209, cga -> 0x0213, can -> 0x021b, TryCatch #5 {cge -> 0x01ff, blocks: (B:24:0x0055, B:26:0x0059, B:28:0x0067, B:30:0x006b, B:31:0x0077, B:33:0x007f, B:35:0x0088, B:54:0x014e, B:56:0x0152, B:58:0x0156, B:60:0x015a, B:62:0x015e, B:64:0x0168, B:66:0x016c, B:67:0x017f, B:70:0x018d, B:72:0x0193, B:73:0x0198, B:75:0x01a0, B:76:0x01b2, B:78:0x01b6, B:79:0x01bf, B:81:0x01cb, B:84:0x01d5, B:83:0x01d1, B:85:0x01f4, B:36:0x0098, B:38:0x00a0, B:40:0x00a4, B:41:0x00ae, B:45:0x00bb, B:46:0x00c3, B:47:0x00c4, B:49:0x00cf, B:50:0x012a, B:52:0x0138, B:53:0x0148), top: B:105:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01d1 A[Catch: cge -> 0x01ff, cgb -> 0x0209, cga -> 0x0213, can -> 0x021b, TryCatch #5 {cge -> 0x01ff, blocks: (B:24:0x0055, B:26:0x0059, B:28:0x0067, B:30:0x006b, B:31:0x0077, B:33:0x007f, B:35:0x0088, B:54:0x014e, B:56:0x0152, B:58:0x0156, B:60:0x015a, B:62:0x015e, B:64:0x0168, B:66:0x016c, B:67:0x017f, B:70:0x018d, B:72:0x0193, B:73:0x0198, B:75:0x01a0, B:76:0x01b2, B:78:0x01b6, B:79:0x01bf, B:81:0x01cb, B:84:0x01d5, B:83:0x01d1, B:85:0x01f4, B:36:0x0098, B:38:0x00a0, B:40:0x00a4, B:41:0x00ae, B:45:0x00bb, B:46:0x00c3, B:47:0x00c4, B:49:0x00cf, B:50:0x012a, B:52:0x0138, B:53:0x0148), top: B:105:0x0055 }] */
    @Override // defpackage.cdp
    public final void af(long j, long j2) throws cbo {
        cgf cgfVar;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer;
        ccu ccuVarR;
        int iK;
        if (this.F) {
            try {
                this.k.m();
                this.M = this.L;
                return;
            } catch (cge e) {
                throw q(e, e.c, e.b, 5002);
            }
        }
        if (this.l == null) {
            ccu ccuVarR2 = r();
            DecoderInputBuffer decoderInputBuffer = this.r;
            decoderInputBuffer.clear();
            int iK2 = k(ccuVarR2, decoderInputBuffer, 2);
            if (iK2 != -5) {
                if (iK2 == -4) {
                    ahno.O(decoderInputBuffer.isEndOfStream());
                    this.E = true;
                    try {
                        al();
                        return;
                    } catch (cge e2) {
                        throw q(e2, null, false, 5002);
                    }
                }
                return;
            }
            ak(ccuVarR2);
        }
        aj();
        if (this.w != null) {
            while (true) {
                try {
                    try {
                        if (this.m != null) {
                            if (this.m.isEndOfStream()) {
                                this.M = -9223372036854775807L;
                                if (this.C) {
                                    bsd bsdVar = new bsd(e(this.w));
                                    bsdVar.K = this.t;
                                    bsdVar.L = this.u;
                                    bse bseVar = this.l;
                                    bsdVar.l = bseVar.m;
                                    Object obj = bseVar.n;
                                    bsdVar.a = bseVar.a;
                                    bsdVar.b = bseVar.b;
                                    bsdVar.d(bseVar.c);
                                    bse bseVar2 = this.l;
                                    bsdVar.d = bseVar2.d;
                                    bsdVar.e = bseVar2.e;
                                    bsdVar.f = bseVar2.f;
                                    bse bseVar3 = new bse(bsdVar);
                                    cgf cgfVar2 = this.k;
                                    cfy cfyVar = new cfy(bseVar3);
                                    cfyVar.b = h(this.w);
                                    cfyVar.c = this.h;
                                    cfyVar.d = this.i;
                                    cgfVar2.g(cfyVar.a());
                                    this.C = false;
                                }
                                cgfVar = this.k;
                                simpleDecoderOutputBuffer = this.m;
                                if (cgfVar.E(simpleDecoderOutputBuffer.data, simpleDecoderOutputBuffer.timeUs, 1)) {
                                    this.M = this.m.timeUs;
                                    break;
                                }
                                this.s.e++;
                                this.m.release();
                                this.m = null;
                            } else if (this.A != 2) {
                                this.m.release();
                                this.m = null;
                                al();
                                break;
                            } else {
                                am();
                                aj();
                                this.C = true;
                                break;
                            }
                        } else {
                            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer2 = (SimpleDecoderOutputBuffer) ((cas) this.w).dequeueOutputBuffer();
                            this.m = simpleDecoderOutputBuffer2;
                            if (simpleDecoderOutputBuffer2 != null) {
                                int i = simpleDecoderOutputBuffer2.skippedOutputBufferCount;
                                if (i > 0) {
                                    this.s.f += i;
                                    this.k.j();
                                }
                                if (this.m.isFirstSample()) {
                                    this.k.j();
                                    if (this.I != 0) {
                                        long[] jArr = this.H;
                                        ao(jArr[0]);
                                        int i2 = this.I - 1;
                                        this.I = i2;
                                        System.arraycopy(jArr, 1, jArr, 0, i2);
                                    }
                                }
                                if (this.m.isEndOfStream()) {
                                    this.M = -9223372036854775807L;
                                    if (this.C) {
                                        bsd bsdVar2 = new bsd(e(this.w));
                                        bsdVar2.K = this.t;
                                        bsdVar2.L = this.u;
                                        bse bseVar4 = this.l;
                                        bsdVar2.l = bseVar4.m;
                                        Object obj2 = bseVar4.n;
                                        bsdVar2.a = bseVar4.a;
                                        bsdVar2.b = bseVar4.b;
                                        bsdVar2.d(bseVar4.c);
                                        bse bseVar5 = this.l;
                                        bsdVar2.d = bseVar5.d;
                                        bsdVar2.e = bseVar5.e;
                                        bsdVar2.f = bseVar5.f;
                                        bse bseVar6 = new bse(bsdVar2);
                                        cgf cgfVar3 = this.k;
                                        cfy cfyVar2 = new cfy(bseVar6);
                                        cfyVar2.b = h(this.w);
                                        cfyVar2.c = this.h;
                                        cfyVar2.d = this.i;
                                        cgfVar3.g(cfyVar2.a());
                                        this.C = false;
                                    }
                                    cgfVar = this.k;
                                    simpleDecoderOutputBuffer = this.m;
                                    if (cgfVar.E(simpleDecoderOutputBuffer.data, simpleDecoderOutputBuffer.timeUs, 1)) {
                                        this.M = this.m.timeUs;
                                        break;
                                    }
                                    this.s.e++;
                                    this.m.release();
                                    this.m = null;
                                } else if (this.A != 2) {
                                    am();
                                    aj();
                                    this.C = true;
                                    break;
                                } else {
                                    this.m.release();
                                    this.m = null;
                                    try {
                                        al();
                                        break;
                                    } catch (cge e3) {
                                        throw q(e3, e3.c, e3.b, 5002);
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                    } catch (cge e4) {
                        throw q(e4, e4.c, e4.b, 5002);
                    }
                } catch (can e5) {
                    bvx.d("DecoderAudioRenderer", "Audio codec error", e5);
                    this.q.c(e5);
                    throw q(e5, this.l, false, 4003);
                } catch (cga e6) {
                    throw q(e6, e6.a, false, 5001);
                } catch (cgb e7) {
                    throw q(e7, e7.b, e7.a, 5001);
                }
            }
            while (true) {
                cam camVar = this.w;
                if (camVar == null || this.A == 2 || this.E) {
                    break;
                }
                DecoderInputBuffer decoderInputBufferDequeueInputBuffer = this.x;
                if (decoderInputBufferDequeueInputBuffer == null) {
                    decoderInputBufferDequeueInputBuffer = ((cas) camVar).dequeueInputBuffer();
                    this.x = decoderInputBufferDequeueInputBuffer;
                    if (decoderInputBufferDequeueInputBuffer == null) {
                        break;
                    }
                    if (this.A == 1) {
                        decoderInputBufferDequeueInputBuffer.setFlags(4);
                        ((cas) this.w).queueInputBuffer(this.x);
                        this.x = null;
                        this.A = 2;
                        break;
                    }
                    ccuVarR = r();
                    iK = k(ccuVarR, this.x, 0);
                    if (iK != -5) {
                        ak(ccuVarR);
                    } else {
                        if (iK != -4) {
                            if (X()) {
                                break;
                            }
                            this.L = this.K;
                            break;
                        }
                        if (this.x.isEndOfStream()) {
                            this.E = true;
                            this.L = this.K;
                            ((cas) this.w).queueInputBuffer(this.x);
                            this.x = null;
                            break;
                        }
                        if (!this.v) {
                            this.v = true;
                            this.x.addFlag(134217728);
                        }
                        DecoderInputBuffer decoderInputBuffer2 = this.x;
                        this.K = decoderInputBuffer2.timeUs;
                        if (X() || decoderInputBuffer2.isLastSample()) {
                            this.L = this.K;
                        }
                        this.x.flip();
                        DecoderInputBuffer decoderInputBuffer3 = this.x;
                        decoderInputBuffer3.format = this.l;
                        ((cas) this.w).queueInputBuffer(decoderInputBuffer3);
                        this.B = true;
                        this.s.c++;
                        this.x = null;
                    }
                } else {
                    if (this.A == 1) {
                        decoderInputBufferDequeueInputBuffer.setFlags(4);
                        ((cas) this.w).queueInputBuffer(this.x);
                        this.x = null;
                        this.A = 2;
                        break;
                    }
                    ccuVarR = r();
                    iK = k(ccuVarR, this.x, 0);
                    if (iK != -5) {
                        ak(ccuVarR);
                    } else {
                        if (iK != -4) {
                            if (X()) {
                                break;
                            }
                            this.L = this.K;
                            break;
                        }
                        if (this.x.isEndOfStream()) {
                            this.E = true;
                            this.L = this.K;
                            ((cas) this.w).queueInputBuffer(this.x);
                            this.x = null;
                            break;
                        }
                        if (!this.v) {
                            this.v = true;
                            this.x.addFlag(134217728);
                        }
                        DecoderInputBuffer decoderInputBuffer4 = this.x;
                        this.K = decoderInputBuffer4.timeUs;
                        if (X()) {
                            this.L = this.K;
                        } else {
                            this.L = this.K;
                        }
                        this.x.flip();
                        DecoderInputBuffer decoderInputBuffer5 = this.x;
                        decoderInputBuffer5.format = this.l;
                        ((cas) this.w).queueInputBuffer(decoderInputBuffer5);
                        this.B = true;
                        this.s.c++;
                        this.x = null;
                    }
                }
            }
            this.s.a();
        }
    }

    @Override // defpackage.cdp
    public final boolean ag() {
        return this.F && this.k.G();
    }

    @Override // defpackage.cdp
    public boolean ah() {
        if (this.k.F()) {
            this.N = -9223372036854775807L;
            this.O = true;
            return true;
        }
        if (this.O && this.J && Z() && !X()) {
            long jB = p().b();
            long j = this.N;
            if (j == -9223372036854775807L) {
                this.N = jB;
                return true;
            }
            if (jB - j < 100) {
                return true;
            }
        }
        return false;
    }

    protected caz ai(String str, bse bseVar, bse bseVar2) {
        return new caz(str, bseVar, bseVar2, 0, 1);
    }

    @Override // defpackage.ccz
    public final btb b() {
        return this.k.d();
    }

    @Override // defpackage.cdq
    public final int c(bse bseVar) {
        if (!bsy.i(bseVar.q)) {
            return SemanticState.Focused;
        }
        int iD = d(bseVar);
        return iD <= 2 ? 128 | iD : iD | 168;
    }

    protected abstract int d(bse bseVar);

    protected abstract bse e(cam camVar);

    @Override // defpackage.cal
    public final void fZ() {
        qcb qcbVar = this.Q;
        if (qcbVar != null) {
            qcbVar.K();
        }
    }

    protected abstract cam g(bse bseVar, CryptoConfig cryptoConfig);

    @Override // defpackage.cal
    public final void ga() {
        qcb qcbVar = this.Q;
        if (qcbVar != null) {
            qcbVar.K();
        }
    }

    @Override // defpackage.ccz
    public final void gb(btb btbVar) {
        this.k.y(btbVar);
    }

    @Override // defpackage.ccz
    public final boolean gc() {
        boolean z = this.o;
        this.o = false;
        return z;
    }

    protected ahbo h(cam camVar) {
        throw null;
    }

    @Override // defpackage.cav, defpackage.cdp
    public final long n(long j, long j2) {
        cgf cgfVar = this.k;
        boolean z = false;
        if (cgfVar.F() && this.M != -9223372036854775807L) {
            z = true;
        }
        if (!this.J) {
            return (z || this.F) ? 1000000L : 10000L;
        }
        long jB = cgfVar.b();
        if (this.p && z && jB != -9223372036854775807L) {
            return Math.max(10000L, (long) ((Math.min(jB, this.M - j) / (b() != null ? b().b : 1.0f)) / 2.0f));
        }
        return 10000L;
    }

    @Override // defpackage.cav, defpackage.cdp
    public final ccz s() {
        return this;
    }

    public cgu(buj... bujVarArr) {
        cgz cgzVar = new cgz();
        cgzVar.b((cff) ahno.ad(null, cff.a));
        cgzVar.f = new ayq(bujVarArr);
        this(null, null, cgzVar.a());
    }

    public cgu() {
        this(new buj[0]);
    }
}
