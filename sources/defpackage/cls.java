package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.DecoderInputBuffer;
import app.rive.semantics.SemanticState;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class cls extends cav {
    public long A;
    public boolean B;
    public cbo C;
    public cay D;
    public long E;
    public long F;
    public qcb G;
    private final cle H;
    private final MediaCodec.BufferInfo I;
    private final ArrayDeque J;
    private final chk K;
    private bse L;
    private bse M;
    private cju N;
    private cju O;
    private MediaCrypto P;
    private float Q;
    private boolean R;
    private float S;
    private ArrayDeque T;
    private clq U;
    private boolean V;
    private boolean W;
    private long X;
    private boolean Y;
    private long Z;
    private int aa;
    private int ab;
    private ByteBuffer ac;
    private boolean ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    private boolean ah;
    private int ai;
    private int aj;
    private int ak;
    private boolean al;
    private boolean am;
    private long an;
    private boolean ao;
    private boolean ap;
    private clr aq;
    private boolean ar;
    private boolean as;
    private long at;
    private caw au;
    private caw av;
    private agkz aw;
    private final Context k;
    private final cli l;
    private final clu m;
    private final boolean n;
    private final float o;
    private final DecoderInputBuffer p;
    private final DecoderInputBuffer q;
    public final DecoderInputBuffer r;
    public final AtomicInteger s;
    public float t;
    public clk u;
    public bse v;
    public MediaFormat w;
    public clo x;
    public boolean y;
    public boolean z;

    public cls(Context context, int i, cli cliVar, clu cluVar, boolean z, float f) {
        super(i);
        this.k = context.getApplicationContext();
        this.l = cliVar;
        cluVar.getClass();
        this.m = cluVar;
        this.n = z;
        this.o = f;
        this.s = new AtomicInteger();
        this.p = DecoderInputBuffer.newNoDataInstance();
        this.r = new DecoderInputBuffer(0);
        this.q = new DecoderInputBuffer(2);
        cle cleVar = new cle();
        this.H = cleVar;
        this.I = new MediaCodec.BufferInfo();
        this.t = 1.0f;
        this.Q = 1.0f;
        this.J = new ArrayDeque();
        this.aq = clr.a;
        cleVar.ensureSpaceForWrite(0);
        cleVar.data.order(ByteOrder.nativeOrder());
        this.K = new chk();
        this.S = -1.0f;
        this.ai = 0;
        this.aa = -1;
        this.ab = -1;
        this.Z = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.an = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.X = -9223372036854775807L;
        this.aj = 0;
        this.ak = 0;
        this.D = new cay();
        this.as = false;
        this.F = 0L;
        this.at = -9223372036854775807L;
        this.aw = agpr.a;
        caw cawVar = caw.a;
        this.au = cawVar;
        this.av = cawVar;
    }

    private final long a() {
        return b().a() ? this.an : this.A;
    }

    protected static boolean aS(bse bseVar) {
        int i = bseVar.S;
        return i == 0 || i == 2;
    }

    private final void aV() {
        try {
            clk clkVar = this.u;
            clkVar.getClass();
            clkVar.h();
        } finally {
            aI();
        }
    }

    private final void aW() throws cbo {
        int i = this.ak;
        if (i == 1) {
            aV();
            return;
        }
        if (i == 2) {
            aV();
            bg();
        } else if (i == 3) {
            aX();
        } else {
            this.B = true;
            at();
        }
    }

    private final void aX() {
        aH();
        aE();
    }

    private final void aY() {
        aZ();
        this.ag = false;
        this.H.clear();
        this.q.clear();
        this.af = false;
        chk chkVar = this.K;
        chkVar.c = buj.a;
        chkVar.e = 0;
        chkVar.d = 2;
    }

    private final void aZ() {
        this.A = -9223372036854775807L;
        this.an = -9223372036854775807L;
        b().i = -9223372036854775807L;
        this.E = -9223372036854775807L;
    }

    private final clr b() {
        ArrayDeque arrayDeque = this.J;
        return !arrayDeque.isEmpty() ? (clr) arrayDeque.getLast() : this.aq;
    }

    private final void ba() {
        this.aa = -1;
        this.r.data = null;
    }

    private final void bb() {
        this.ab = -1;
        this.ac = null;
    }

    private final void bc(cju cjuVar) {
        aup.o(this.N, cjuVar);
        this.N = cjuVar;
    }

    private final void bd(clr clrVar) {
        this.aq = clrVar;
        long j = clrVar.d;
        if (j != -9223372036854775807L) {
            this.ar = true;
            ar(j);
        }
    }

    private final void be(cju cjuVar) {
        aup.o(this.O, cjuVar);
        this.O = cjuVar;
    }

    private final void bf(bse bseVar) {
        if (this.u == null || this.ak == 3 || this.b == 0) {
            return;
        }
        float f = this.Q;
        bseVar.getClass();
        float fE = e(f, bseVar, ab());
        float f2 = this.S;
        if (f2 == fE || fE == -1.0f) {
            return;
        }
        if (f2 != -1.0f || fE > this.o) {
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fE);
            clk clkVar = this.u;
            clkVar.getClass();
            clkVar.m(bundle);
            this.S = fE;
        }
    }

    private final void bg() throws cbo {
        cju cjuVar = this.O;
        cjuVar.getClass();
        CryptoConfig cryptoConfigB = cjuVar.b();
        if (cryptoConfigB instanceof cke) {
            try {
                MediaCrypto mediaCrypto = this.P;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((cke) cryptoConfigB).c);
            } catch (MediaCryptoException e) {
                throw q(e, this.L, false, 6006);
            }
        }
        bc(this.O);
        this.aj = 0;
        this.ak = 0;
    }

    private final boolean bh() throws cbo {
        if (!this.z) {
            bg();
            return true;
        }
        this.aj = 1;
        if (aR()) {
            this.ak = 3;
            return false;
        }
        this.ak = 2;
        return true;
    }

    private final boolean bi() {
        if (this.u != null) {
            if (aR()) {
                aH();
                return true;
            }
            if (aO()) {
                aV();
            } else if (this.z) {
                this.as = true;
            }
        }
        return false;
    }

    private final boolean bj() {
        return this.ab >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0036 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:26:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    private final boolean bk() throws cbo {
        ahno.O(this.P == null);
        cju cjuVar = this.N;
        CryptoConfig cryptoConfigB = cjuVar.b();
        int i = bst.a;
        if (cke.a && (cryptoConfigB instanceof cke)) {
            int iA = cjuVar.a();
            if (iA == 1) {
                cjt cjtVarC = cjuVar.c();
                cjtVarC.getClass();
                throw q(cjtVarC, this.L, false, cjtVarC.a);
            }
            if (iA == 4) {
                if (cryptoConfigB == null) {
                    this.P = new MediaCrypto(((cke) cryptoConfigB).b, ((cke) cryptoConfigB).c);
                    return true;
                }
                if (cjuVar.c() != null) {
                    return true;
                }
            }
        } else {
            if (cryptoConfigB == null) {
                try {
                    this.P = new MediaCrypto(((cke) cryptoConfigB).b, ((cke) cryptoConfigB).c);
                    return true;
                } catch (MediaCryptoException e) {
                    throw q(e, this.L, false, 6006);
                }
            }
            if (cjuVar.c() != null) {
                return true;
            }
        }
        return false;
    }

    private final boolean bl(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        bse bseVar = this.M;
        return (bseVar != null && Objects.equals(bseVar.q, "audio/opus") && atz.e(j, j2)) ? false : true;
    }

    private final boolean bm(int i) throws cbo {
        ccu ccuVarR = r();
        DecoderInputBuffer decoderInputBuffer = this.p;
        decoderInputBuffer.clear();
        int iK = k(ccuVarR, decoderInputBuffer, i | 4);
        if (iK == -5) {
            ak(ccuVarR);
            return true;
        }
        if (iK == -4 && decoderInputBuffer.isEndOfStream()) {
            this.ao = true;
            aW();
        }
        return false;
    }

    private final void d() {
        this.y = false;
        aY();
    }

    private final void g() {
        if (!this.z) {
            aX();
        } else {
            this.aj = 1;
            this.ak = 3;
        }
    }

    @Override // defpackage.cav, defpackage.cdm
    public void A(int i, Object obj) {
        if (i == 11) {
            qcb qcbVar = (qcb) obj;
            qcbVar.getClass();
            this.G = qcbVar;
            return;
        }
        if (i != 21) {
            if (i != 22 || Build.VERSION.SDK_INT < 29) {
                return;
            }
            obj.getClass();
            agkz agkzVar = (agkz) obj;
            if (this.aw.equals(agkzVar)) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 31) {
                HashSet hashSet = new HashSet(agkzVar);
                HashSet hashSet2 = new HashSet();
                agqr it = this.aw.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!hashSet.remove(str)) {
                        hashSet2.add(str);
                    }
                }
                clk clkVar = this.u;
                if (clkVar != null) {
                    if (!hashSet2.isEmpty()) {
                        clkVar.p(new ArrayList(hashSet2));
                    }
                    if (!hashSet.isEmpty()) {
                        clkVar.o(new ArrayList(hashSet));
                    }
                }
            }
            this.aw = agkzVar;
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            obj.getClass();
            caw cawVar = (caw) obj;
            this.au = cawVar;
            clk clkVar2 = this.u;
            if (clkVar2 != null) {
                Bundle bundle = new Bundle();
                for (Map.Entry entry : cawVar.b.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        if (value instanceof Integer) {
                            bundle.putInt(str2, ((Integer) value).intValue());
                        } else if (value instanceof Long) {
                            bundle.putLong(str2, ((Long) value).longValue());
                        } else if (value instanceof Float) {
                            bundle.putFloat(str2, ((Float) value).floatValue());
                        } else if (value instanceof String) {
                            bundle.putString(str2, (String) value);
                        } else if (value instanceof ByteBuffer) {
                            ByteBuffer byteBuffer = (ByteBuffer) value;
                            byte[] bArr = new byte[byteBuffer.remaining()];
                            byteBuffer.duplicate().get(bArr);
                            bundle.putByteArray(str2, bArr);
                        }
                    }
                }
                clkVar2.m(bundle);
            }
        }
    }

    @Override // defpackage.cav
    protected void D() {
        this.L = null;
        bd(clr.a);
        this.J.clear();
        if (this.y) {
            d();
        } else {
            bi();
        }
    }

    @Override // defpackage.cav
    protected void E(boolean z, boolean z2) {
        this.D = new cay();
    }

    @Override // defpackage.cav
    protected void G(long j, boolean z, boolean z2) {
        ArrayDeque arrayDeque = this.J;
        if (!arrayDeque.isEmpty()) {
            this.aq = (clr) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z2) {
            this.ao = false;
            this.B = false;
            if (this.y) {
                aY();
            } else {
                aT();
            }
            bwn bwnVar = this.aq.e;
            if (bwnVar.a() > 0) {
                this.ap = true;
            }
            bwnVar.f();
            this.aq.h = false;
        }
    }

    @Override // defpackage.cav
    protected void J() {
        try {
            d();
            aH();
        } finally {
            be(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r2 >= r0) goto L17;
     */
    @Override // defpackage.cav
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void M(defpackage.bse[] r13, long r14, long r16, defpackage.cnm r18) {
        /*
            r12 = this;
            long r7 = r12.j
            coo r13 = r12.c
            r13.getClass()
            int r9 = r13.a()
            clr r13 = r12.aq
            long r0 = r13.d
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r13 != 0) goto L39
            clr r0 = new clr
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = r14
            r5 = r16
            r0.<init>(r1, r3, r5, r7, r9)
            r12.bd(r0)
            boolean r13 = r12.aQ()
            if (r13 != 0) goto L35
            r13 = 2
            boolean r13 = defpackage.bsc.c(r13)
            if (r13 == 0) goto L7a
        L35:
            r12.as()
            goto L7a
        L39:
            java.util.ArrayDeque r13 = r12.J
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L6d
            long r0 = r12.A
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 == 0) goto L51
            long r2 = r12.E
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 == 0) goto L6d
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L6d
        L51:
            clr r0 = new clr
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = r14
            r5 = r16
            r0.<init>(r1, r3, r5, r7, r9)
            r12.bd(r0)
            clr r13 = r12.aq
            long r0 = r13.d
            int r13 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r13 == 0) goto L7a
            r12.as()
            goto L7a
        L6d:
            clr r0 = new clr
            long r1 = r12.A
            r3 = r14
            r5 = r16
            r0.<init>(r1, r3, r5, r7, r9)
            r13.add(r0)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cls.M(bse[], long, long, cnm):void");
    }

    @Override // defpackage.cav, defpackage.cdp
    public void T(float f, float f2) {
        this.t = f;
        this.Q = f2;
        bf(this.v);
    }

    protected final long aA() {
        return this.aq.d;
    }

    protected final long aB() {
        return this.aq.c;
    }

    protected clm aC(Throwable th, clo cloVar) {
        return new clm(th, cloVar);
    }

    protected final void aD(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            for (Map.Entry entry : this.au.b.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    mediaFormat.setString(str, null);
                } else if (value instanceof Integer) {
                    mediaFormat.setInteger(str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    mediaFormat.setLong(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    mediaFormat.setFloat(str, ((Float) value).floatValue());
                } else if (value instanceof String) {
                    mediaFormat.setString(str, (String) value);
                } else if (value instanceof ByteBuffer) {
                    mediaFormat.setByteBuffer(str, (ByteBuffer) value);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:162:0x02e5 A[Catch: clq -> 0x0356, TryCatch #11 {clq -> 0x0356, blocks: (B:160:0x02b2, B:162:0x02e5, B:164:0x02ef, B:166:0x02fb, B:168:0x031f, B:172:0x032e, B:173:0x0330, B:167:0x02fe, B:174:0x0331, B:181:0x034c, B:182:0x0355), top: B:211:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:166:0x02fb A[Catch: clq -> 0x0356, TryCatch #11 {clq -> 0x0356, blocks: (B:160:0x02b2, B:162:0x02e5, B:164:0x02ef, B:166:0x02fb, B:168:0x031f, B:172:0x032e, B:173:0x0330, B:167:0x02fe, B:174:0x0331, B:181:0x034c, B:182:0x0355), top: B:211:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x02fe A[Catch: clq -> 0x0356, TryCatch #11 {clq -> 0x0356, blocks: (B:160:0x02b2, B:162:0x02e5, B:164:0x02ef, B:166:0x02fb, B:168:0x031f, B:172:0x032e, B:173:0x0330, B:167:0x02fe, B:174:0x0331, B:181:0x034c, B:182:0x0355), top: B:211:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x0325  */
    /* JADX WARN: Code duplicated, block: B:214:0x032e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0076  */
    /* JADX WARN: Code duplicated, block: B:82:0x0171  */
    /* JADX WARN: Multi-variable type inference failed */
    protected final void aE() {
        bse bseVar;
        boolean z;
        cls clsVar;
        ArrayDeque arrayDeque;
        char c;
        Exception exc;
        clq clqVar;
        String diagnosticInfo;
        boolean z2;
        clq clqVar2;
        MediaCrypto mediaCrypto;
        cls clsVar2 = this;
        if (clsVar2.u != null || clsVar2.y || (bseVar = clsVar2.L) == null) {
            return;
        }
        if (clsVar2.aL(bseVar)) {
            clsVar2.d();
            String str = bseVar.q;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                clsVar2.H.c = 32;
            } else {
                clsVar2.H.c = 1;
            }
            clsVar2.y = true;
            return;
        }
        clsVar2.bc(clsVar2.O);
        cls clsVar3 = null;
        if (clsVar2.N != null && !clsVar2.bk()) {
            cls clsVar4 = clsVar3;
            clsVar = clsVar2;
            mediaCrypto = clsVar4;
            break;
        }
        char c2 = 0;
        try {
            cju cjuVar = clsVar2.N;
            if (cjuVar == null || !(cjuVar.a() == 3 || clsVar2.N.a() == 4)) {
                z = false;
            } else {
                cju cjuVar2 = clsVar2.N;
                String str2 = bseVar.q;
                str2.getClass();
                if (cjuVar2.n(str2)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            MediaCrypto mediaCrypto2 = clsVar2.P;
            bse bseVar2 = clsVar2.L;
            bseVar2.getClass();
            if (clsVar2.T == null) {
                try {
                    bseVar2.getClass();
                    clu cluVar = clsVar2.m;
                    List listAl = clsVar2.al(cluVar, bseVar2, z);
                    if (listAl.isEmpty() && z) {
                        listAl = clsVar2.al(cluVar, bseVar2, false);
                        if (!listAl.isEmpty()) {
                            bvx.e("MediaCodecRenderer", "Drm session requires secure decoder for " + bseVar2.q + ", but no secure decoder available. Trying to proceed with " + String.valueOf(listAl) + '.');
                        }
                    }
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    clsVar2.T = arrayDeque2;
                    if (clsVar2.n) {
                        arrayDeque2.addAll(listAl);
                    } else if (!listAl.isEmpty()) {
                        clsVar2.T.add((clo) listAl.get(0));
                    }
                    clsVar2.U = null;
                } catch (cly e) {
                    throw new clq(bseVar2, e, z, -49998);
                }
            }
            try {
                if (!clsVar2.T.isEmpty()) {
                    ArrayDeque arrayDeque3 = clsVar2.T;
                    arrayDeque3.getClass();
                    while (true) {
                        if (clsVar2.u != null) {
                            cls clsVar5 = clsVar3;
                            clsVar = clsVar2;
                            ArrayDeque arrayDeque4 = clsVar5;
                            clsVar.T = arrayDeque4;
                            mediaCrypto = arrayDeque4;
                            break;
                        }
                        clo cloVar = (clo) arrayDeque3.peekFirst();
                        cloVar.getClass();
                        clsVar2.aU(bseVar2);
                        if (!clsVar2.aP(cloVar)) {
                            cls clsVar6 = clsVar3;
                            clsVar = clsVar2;
                            mediaCrypto = clsVar6;
                            break;
                        }
                        try {
                            clsVar2.x = cloVar;
                            bse bseVar3 = clsVar2.L;
                            bseVar3.getClass();
                            ArrayDeque arrayDeque5 = arrayDeque3;
                            try {
                                String str3 = cloVar.b;
                                float fE = clsVar2.e(clsVar2.Q, bseVar3, clsVar2.ab());
                                if (fE <= clsVar2.o) {
                                    fE = -1.0f;
                                }
                                long jB = clsVar2.p().b();
                                c = c2;
                                try {
                                    gmj gmjVarAw = clsVar2.aw(cloVar, bseVar3, mediaCrypto2, fE);
                                    if (Build.VERSION.SDK_INT >= 31) {
                                        try {
                                            LogSessionId logSessionIdA = clsVar2.v().a();
                                            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                                                arrayDeque = arrayDeque5;
                                            } else {
                                                arrayDeque = arrayDeque5;
                                                try {
                                                    ((MediaFormat) gmjVarAw.d).setString("log-session-id", logSessionIdA.getStringId());
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    clsVar2 = clsVar2;
                                                    cloVar = cloVar;
                                                    exc = e;
                                                    String str4 = cloVar.b;
                                                    bvx.f("MediaCodecRenderer", "Failed to initialize decoder: ".concat(str4), exc);
                                                    arrayDeque.removeFirst();
                                                    String str5 = "Decoder init failed: " + str4 + ", " + bseVar2.toString();
                                                    String str6 = bseVar2.q;
                                                    if (exc instanceof MediaCodec.CodecException) {
                                                        diagnosticInfo = ((MediaCodec.CodecException) exc).getDiagnosticInfo();
                                                    } else {
                                                        diagnosticInfo = null;
                                                    }
                                                    z2 = z;
                                                    clqVar = new clq(str5, exc, str6, z2, cloVar, diagnosticInfo);
                                                    clsVar2.an(clqVar);
                                                    clqVar2 = clsVar2.U;
                                                    if (clqVar2 == null) {
                                                        clsVar2.U = clqVar;
                                                    } else {
                                                        clsVar2.U = new clq(clqVar2.getMessage(), clqVar2.getCause(), clqVar2.a, clqVar2.b, clqVar2.c, clqVar2.d);
                                                    }
                                                    if (!arrayDeque.isEmpty()) {
                                                        throw clsVar2.U;
                                                    }
                                                    z = z2;
                                                    clsVar2 = clsVar2;
                                                    c2 = c;
                                                    arrayDeque3 = arrayDeque;
                                                    clsVar3 = null;
                                                }
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            arrayDeque = arrayDeque5;
                                        }
                                    } else {
                                        arrayDeque = arrayDeque5;
                                    }
                                    try {
                                        clk clkVarB = clsVar2.l.b(gmjVarAw);
                                        clsVar2.u = clkVarB;
                                        try {
                                            clsVar2.Y = clkVarB.s(new jus(clsVar2, 1));
                                            long jB2 = clsVar2.p().b();
                                            if (!cloVar.f(clsVar2.k, bseVar3)) {
                                                Object[] objArr = new Object[2];
                                                objArr[c] = bse.c(bseVar3);
                                                objArr[1] = str3;
                                                bvx.e("MediaCodecRenderer", bwp.K("Format exceeds selected codec's capabilities [%s, %s]", objArr));
                                            }
                                            clsVar2.S = fE;
                                            clsVar2.v = bseVar3;
                                            int i = bst.a;
                                            clsVar2.V = (Build.VERSION.SDK_INT == 29 && "c2.android.aac.decoder".equals(str3)) ? 1 : c;
                                            String str7 = cloVar.b;
                                            clsVar2.W = ((Build.VERSION.SDK_INT > 29 || !(str7.equals("OMX.broadcom.video_decoder.tunnel") || str7.equals("OMX.broadcom.video_decoder.tunnel.secure") || str7.equals("OMX.bcm.vdec.avc.tunnel") || str7.equals("OMX.bcm.vdec.avc.tunnel.secure") || str7.equals("OMX.bcm.vdec.hevc.tunnel") || str7.equals("OMX.bcm.vdec.hevc.tunnel.secure") || (Build.MANUFACTURER.equals("Amazon") && Build.MODEL.startsWith("AFT") && str7.equals("OMX.dolby.ac3.decoder")))) && !(Build.MANUFACTURER.equals("Amazon") && Build.MODEL.equals("AFTS") && cloVar.h)) ? c : 1;
                                            clk clkVar = clsVar2.u;
                                            clkVar.getClass();
                                            if (clkVar.r()) {
                                                clsVar2.ah = true;
                                                clsVar2.ai = 1;
                                            }
                                            if (clsVar2.b == 2) {
                                                clsVar2.Z = clsVar2.p().b() + 1000;
                                            }
                                            clsVar2.D.a++;
                                            long j = jB2 - jB;
                                            if (Build.VERSION.SDK_INT >= 31 && !clsVar2.aw.isEmpty()) {
                                                clk clkVar2 = clsVar2.u;
                                                clkVar2.getClass();
                                                clkVar2.o(new ArrayList(clsVar2.aw));
                                            }
                                            cloVar = cloVar;
                                            try {
                                                clsVar2.ax(str3, gmjVarAw, jB2, j);
                                                clsVar2 = clsVar2;
                                            } catch (Exception e4) {
                                                e = e4;
                                                clsVar2 = clsVar2;
                                                exc = e;
                                                String str8 = cloVar.b;
                                                bvx.f("MediaCodecRenderer", "Failed to initialize decoder: ".concat(str8), exc);
                                                arrayDeque.removeFirst();
                                                String str9 = "Decoder init failed: " + str8 + ", " + bseVar2.toString();
                                                String str10 = bseVar2.q;
                                                if (exc instanceof MediaCodec.CodecException) {
                                                    diagnosticInfo = ((MediaCodec.CodecException) exc).getDiagnosticInfo();
                                                } else {
                                                    diagnosticInfo = null;
                                                }
                                                z2 = z;
                                                clqVar = new clq(str9, exc, str10, z2, cloVar, diagnosticInfo);
                                                clsVar2.an(clqVar);
                                                clqVar2 = clsVar2.U;
                                                if (clqVar2 == null) {
                                                    clsVar2.U = clqVar;
                                                } else {
                                                    clsVar2.U = new clq(clqVar2.getMessage(), clqVar2.getCause(), clqVar2.a, clqVar2.b, clqVar2.c, clqVar2.d);
                                                }
                                                if (!arrayDeque.isEmpty()) {
                                                    throw clsVar2.U;
                                                }
                                                z = z2;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            try {
                                                throw th;
                                            } catch (Exception e5) {
                                                e = e5;
                                                exc = e;
                                                String str11 = cloVar.b;
                                                bvx.f("MediaCodecRenderer", "Failed to initialize decoder: ".concat(str11), exc);
                                                arrayDeque.removeFirst();
                                                String str12 = "Decoder init failed: " + str11 + ", " + bseVar2.toString();
                                                String str13 = bseVar2.q;
                                                if (exc instanceof MediaCodec.CodecException) {
                                                    diagnosticInfo = ((MediaCodec.CodecException) exc).getDiagnosticInfo();
                                                } else {
                                                    diagnosticInfo = null;
                                                }
                                                z2 = z;
                                                clqVar = new clq(str12, exc, str13, z2, cloVar, diagnosticInfo);
                                                clsVar2.an(clqVar);
                                                clqVar2 = clsVar2.U;
                                                if (clqVar2 == null) {
                                                    clsVar2.U = clqVar;
                                                } else {
                                                    clsVar2.U = new clq(clqVar2.getMessage(), clqVar2.getCause(), clqVar2.a, clqVar2.b, clqVar2.c, clqVar2.d);
                                                }
                                                if (!arrayDeque.isEmpty()) {
                                                    throw clsVar2.U;
                                                }
                                                z = z2;
                                                clsVar2 = clsVar2;
                                                c2 = c;
                                                arrayDeque3 = arrayDeque;
                                                clsVar3 = null;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (Exception e6) {
                                    e = e6;
                                    clsVar2 = clsVar2;
                                    arrayDeque = arrayDeque5;
                                }
                            } catch (Exception e7) {
                                e = e7;
                                arrayDeque = arrayDeque5;
                                c = c2;
                                cloVar = cloVar;
                                exc = e;
                                String str14 = cloVar.b;
                                bvx.f("MediaCodecRenderer", "Failed to initialize decoder: ".concat(str14), exc);
                                arrayDeque.removeFirst();
                                String str15 = "Decoder init failed: " + str14 + ", " + bseVar2.toString();
                                String str16 = bseVar2.q;
                                if (exc instanceof MediaCodec.CodecException) {
                                    diagnosticInfo = ((MediaCodec.CodecException) exc).getDiagnosticInfo();
                                } else {
                                    diagnosticInfo = null;
                                }
                                z2 = z;
                                clqVar = new clq(str15, exc, str16, z2, cloVar, diagnosticInfo);
                                clsVar2.an(clqVar);
                                clqVar2 = clsVar2.U;
                                if (clqVar2 == null) {
                                    clsVar2.U = clqVar;
                                } else {
                                    clsVar2.U = new clq(clqVar2.getMessage(), clqVar2.getCause(), clqVar2.a, clqVar2.b, clqVar2.c, clqVar2.d);
                                }
                                if (!arrayDeque.isEmpty()) {
                                    throw clsVar2.U;
                                }
                                z = z2;
                                clsVar2 = clsVar2;
                                c2 = c;
                                arrayDeque3 = arrayDeque;
                                clsVar3 = null;
                            }
                        } catch (Exception e8) {
                            e = e8;
                            arrayDeque = arrayDeque3;
                        }
                        clsVar2 = clsVar2;
                        c2 = c;
                        arrayDeque3 = arrayDeque;
                        clsVar3 = null;
                    }
                } else {
                    throw new clq(bseVar2, null, z, -49999);
                }
            } catch (clq e9) {
                e = e9;
                throw clsVar3.q(e, bseVar, false, 4001);
            }
        } catch (clq e10) {
            e = e10;
            clsVar3 = clsVar2;
            throw clsVar3.q(e, bseVar, false, 4001);
        }
        MediaCrypto mediaCrypto3 = clsVar.P;
        if (mediaCrypto3 == null || clsVar.u != null) {
            return;
        }
        mediaCrypto3.release();
        clsVar.P = mediaCrypto;
    }

    protected void aF(long j) {
        this.E = Math.max(j, this.E);
        while (true) {
            ArrayDeque arrayDeque = this.J;
            if (arrayDeque.isEmpty() || j < ((clr) arrayDeque.peek()).b) {
                return;
            }
            clr clrVar = (clr) arrayDeque.poll();
            clrVar.getClass();
            bd(clrVar);
            as();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        r3.P = null;
        bc(null);
        aJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        throw r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void aH() {
        /*
            r3 = this;
            r0 = 0
            clk r1 = r3.u     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L1a
            r1.i()     // Catch: java.lang.Throwable -> L2c
            cay r1 = r3.D     // Catch: java.lang.Throwable -> L2c
            int r2 = r1.b     // Catch: java.lang.Throwable -> L2c
            int r2 = r2 + 1
            r1.b = r2     // Catch: java.lang.Throwable -> L2c
            clo r1 = r3.x     // Catch: java.lang.Throwable -> L2c
            r1.getClass()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = r1.b     // Catch: java.lang.Throwable -> L2c
            r3.ap(r1)     // Catch: java.lang.Throwable -> L2c
        L1a:
            r3.u = r0
            android.media.MediaCrypto r1 = r3.P     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L23
            r1.release()     // Catch: java.lang.Throwable -> L3f
        L23:
            r3.P = r0
            r3.bc(r0)
            r3.aJ()
            return
        L2c:
            r1 = move-exception
            r3.u = r0
            android.media.MediaCrypto r2 = r3.P     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L36
            r2.release()     // Catch: java.lang.Throwable -> L3f
        L36:
            r3.P = r0
            r3.bc(r0)
            r3.aJ()
            throw r1
        L3f:
            r1 = move-exception
            r3.P = r0
            r3.bc(r0)
            r3.aJ()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cls.aH():void");
    }

    protected void aI() {
        ba();
        bb();
        aZ();
        this.Z = -9223372036854775807L;
        this.al = false;
        this.X = -9223372036854775807L;
        this.z = false;
        this.ae = false;
        this.ad = false;
        this.aj = 0;
        this.ak = 0;
        this.ai = this.ah ? 1 : 0;
        this.as = false;
        this.F = 0L;
        this.at = -9223372036854775807L;
    }

    protected final void aJ() {
        aI();
        this.C = null;
        this.T = null;
        this.x = null;
        this.v = null;
        this.w = null;
        this.R = false;
        this.am = false;
        this.S = -1.0f;
        this.V = false;
        this.W = false;
        this.Y = false;
        this.ah = false;
        this.ai = 0;
    }

    public final void aK() {
        bf(this.v);
    }

    protected final boolean aL(bse bseVar) {
        return this.O == null && av(bseVar);
    }

    protected final boolean aM() {
        if (this.L != null) {
            return Z() || bj() || (this.Z != -9223372036854775807L && p().b() < this.Z);
        }
        return false;
    }

    protected boolean aN(DecoderInputBuffer decoderInputBuffer) {
        return false;
    }

    protected boolean aO() {
        return this.z;
    }

    protected boolean aP(clo cloVar) {
        return true;
    }

    protected boolean aQ() {
        return false;
    }

    protected boolean aR() {
        int i = this.ak;
        if (i == 3) {
            return true;
        }
        if (this.V && !this.am) {
            return true;
        }
        if (i == 2) {
            try {
                bg();
            } catch (cbo e) {
                bvx.f("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                return true;
            }
        }
        return false;
    }

    protected final void aT() {
        if (bi()) {
            aE();
        }
    }

    @Override // defpackage.cav
    protected final void ae() {
        b().f = this.j;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01bf A[Catch: IllegalStateException -> 0x073d, CryptoException -> 0x078b, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x01cc A[Catch: IllegalStateException -> 0x073d, CryptoException -> 0x078b, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x01d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x01db A[Catch: IllegalStateException -> 0x073d, CryptoException -> 0x078b, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x020c A[Catch: IllegalStateException -> 0x073d, CryptoException -> 0x078b, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0219  */
    /* JADX WARN: Code duplicated, block: B:112:0x0227 A[Catch: IllegalStateException -> 0x073d, CryptoException -> 0x078b, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x022c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0252  */
    /* JADX WARN: Code duplicated, block: B:118:0x0256 A[Catch: IllegalStateException -> 0x073d, CryptoException -> 0x078b, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x025e A[Catch: IllegalStateException -> 0x073d, CryptoException -> 0x078b, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0268 A[Catch: IllegalStateException -> 0x073d, CryptoException -> 0x078b, LOOP:3: B:121:0x0266->B:122:0x0268, LOOP_END, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0281 A[Catch: IllegalStateException -> 0x073d, CryptoException -> 0x078b, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x02a1 A[Catch: IllegalStateException -> 0x073d, CryptoException -> 0x078b, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x02e0 A[Catch: IllegalStateException -> 0x073d, CryptoException -> 0x078b, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x02f0 A[Catch: IllegalStateException -> 0x073d, CryptoException -> 0x078b, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x02f6 A[LOOP:1: B:38:0x009d->B:134:0x02f6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x0307 A[Catch: IllegalStateException -> 0x073d, CryptoException -> 0x078b, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0310 A[Catch: IllegalStateException -> 0x073d, CryptoException -> 0x078b, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:238:0x04a9 A[Catch: IllegalStateException -> 0x0723, CryptoException -> 0x078b, TryCatch #2 {IllegalStateException -> 0x0723, blocks: (B:157:0x0343, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:226:0x0484, B:228:0x0488), top: B:411:0x0343 }] */
    /* JADX WARN: Code duplicated, block: B:243:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:246:0x04c9 A[Catch: IllegalStateException -> 0x0723, CryptoException -> 0x078b, TryCatch #2 {IllegalStateException -> 0x0723, blocks: (B:157:0x0343, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:226:0x0484, B:228:0x0488), top: B:411:0x0343 }] */
    /* JADX WARN: Code duplicated, block: B:252:0x04db  */
    /* JADX WARN: Code duplicated, block: B:255:0x04e6 A[Catch: IllegalStateException -> 0x0723, CryptoException -> 0x078b, TryCatch #2 {IllegalStateException -> 0x0723, blocks: (B:157:0x0343, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:226:0x0484, B:228:0x0488), top: B:411:0x0343 }] */
    /* JADX WARN: Code duplicated, block: B:259:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:266:0x0513 A[Catch: IllegalStateException -> 0x073d, CryptoException -> 0x078b, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:268:0x051e  */
    /* JADX WARN: Code duplicated, block: B:269:0x0520  */
    /* JADX WARN: Code duplicated, block: B:271:0x0523 A[Catch: IllegalStateException -> 0x073d, CryptoException -> 0x078b, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:33:0x007c A[Catch: IllegalStateException -> 0x01a8, CryptoException -> 0x078b, TRY_ENTER, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0082 A[Catch: IllegalStateException -> 0x01a8, CryptoException -> 0x078b, TRY_LEAVE, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008e A[Catch: IllegalStateException -> 0x073d, CryptoException -> 0x078b, TRY_ENTER, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:412:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:421:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:0x071d A[EDGE_INSN: B:422:0x071d->B:368:0x071d BREAK  A[LOOP:0: B:15:0x0021->B:146:0x0318], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:424:0x0318 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:425:0x0318 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:0x02fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:429:0x02fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:430:0x02fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:431:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:437:0x053b A[EDGE_INSN: B:437:0x053b->B:491:? BREAK  A[LOOP:4: B:150:0x0326->B:444:0x0326], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:438:0x0538 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:446:0x0326 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0 A[Catch: IllegalStateException -> 0x01a8, CryptoException -> 0x078b, EDGE_INSN: B:45:0x00b0->B:137:0x0301 BREAK  A[LOOP:1: B:38:0x009d->B:134:0x02f6], TRY_LEAVE, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ba A[Catch: IllegalStateException -> 0x073d, CryptoException -> 0x078b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00cc A[Catch: IllegalStateException -> 0x073d, CryptoException -> 0x078b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00dc A[Catch: IllegalStateException -> 0x01a8, CryptoException -> 0x078b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e2 A[Catch: IllegalStateException -> 0x073d, CryptoException -> 0x078b, TRY_ENTER, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f0 A[Catch: IllegalStateException -> 0x01a8, CryptoException -> 0x078b, TRY_ENTER, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ff A[Catch: IllegalStateException -> 0x01a8, CryptoException -> 0x078b, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0130  */
    /* JADX WARN: Code duplicated, block: B:69:0x0138 A[Catch: IllegalStateException -> 0x073d, CryptoException -> 0x078b, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0146 A[Catch: IllegalStateException -> 0x01a8, CryptoException -> 0x078b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0157 A[Catch: IllegalStateException -> 0x073d, CryptoException -> 0x078b, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x016f A[Catch: IllegalStateException -> 0x073d, CryptoException -> 0x078b, TRY_LEAVE, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0174 A[Catch: IllegalStateException -> 0x01a8, CryptoException -> 0x078b, TRY_ENTER, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0188  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x01a4 A[Catch: IllegalStateException -> 0x01a8, CryptoException -> 0x078b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {CryptoException -> 0x078b, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:15:0x0021, B:17:0x002f, B:19:0x0054, B:374:0x0735, B:20:0x005c, B:23:0x0061, B:26:0x0066, B:28:0x006a, B:31:0x0078, B:33:0x007c, B:35:0x0082, B:37:0x008e, B:38:0x009d, B:43:0x00aa, B:45:0x00b0, B:137:0x0301, B:139:0x0307, B:140:0x030a, B:142:0x0310, B:144:0x0314, B:47:0x00ba, B:49:0x00c0, B:51:0x00cc, B:53:0x00dc, B:56:0x00ea, B:59:0x00f0, B:61:0x00ff, B:63:0x0109, B:64:0x0127, B:67:0x0131, B:69:0x0138, B:71:0x0140, B:73:0x0146, B:74:0x014d, B:76:0x0157, B:78:0x016f, B:81:0x0174, B:83:0x017a, B:85:0x0181, B:88:0x0189, B:91:0x01a4, B:99:0x01b7, B:101:0x01bf, B:103:0x01d1, B:106:0x01db, B:108:0x0213, B:110:0x021b, B:112:0x0227, B:114:0x022d, B:118:0x0256, B:120:0x0263, B:119:0x025e, B:122:0x0268, B:123:0x0272, B:125:0x0281, B:127:0x02ba, B:126:0x02a1, B:107:0x020c, B:102:0x01cc, B:128:0x02da, B:130:0x02e0, B:135:0x02fa, B:132:0x02f0, B:55:0x00e2, B:136:0x02fe, B:147:0x031b, B:149:0x031f, B:150:0x0326, B:153:0x0337, B:157:0x0343, B:158:0x0345, B:161:0x0354, B:163:0x035c, B:164:0x0369, B:166:0x036f, B:168:0x037b, B:177:0x038d, B:179:0x0393, B:180:0x0398, B:181:0x03ae, B:182:0x03b6, B:183:0x03c2, B:184:0x03ce, B:185:0x03da, B:187:0x03e7, B:188:0x03ec, B:190:0x03ef, B:191:0x03f3, B:193:0x03f7, B:195:0x03fb, B:197:0x0400, B:198:0x0403, B:200:0x0409, B:202:0x0418, B:278:0x053b, B:280:0x054e, B:282:0x0553, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:289:0x056e, B:292:0x0573, B:294:0x0577, B:295:0x0585, B:296:0x0589, B:299:0x058e, B:301:0x059b, B:302:0x05b2, B:303:0x05b4, B:304:0x05c3, B:305:0x05cc, B:307:0x05d5, B:309:0x05db, B:312:0x05ea, B:314:0x05ee, B:315:0x05f5, B:316:0x05fa, B:318:0x0602, B:320:0x0610, B:321:0x0615, B:323:0x061b, B:324:0x0620, B:326:0x0624, B:327:0x0634, B:329:0x0638, B:331:0x063e, B:333:0x064c, B:334:0x0650, B:336:0x0658, B:338:0x065e, B:339:0x0663, B:341:0x0667, B:342:0x0679, B:344:0x067d, B:346:0x0689, B:347:0x0690, B:348:0x0697, B:350:0x06a5, B:353:0x06b9, B:355:0x06bf, B:358:0x06cf, B:360:0x06d8, B:361:0x06db, B:363:0x06e9, B:365:0x06ff, B:364:0x06f1, B:357:0x06c5, B:352:0x06b1, B:367:0x0711, B:203:0x041d, B:205:0x0424, B:209:0x042f, B:211:0x043c, B:213:0x0441, B:214:0x0446, B:216:0x0450, B:217:0x045f, B:219:0x046d, B:221:0x0471, B:223:0x0475, B:225:0x0481, B:230:0x048c, B:236:0x04a1, B:238:0x04a9, B:240:0x04b1, B:244:0x04c5, B:246:0x04c9, B:248:0x04cd, B:253:0x04dc, B:255:0x04e6, B:260:0x04f3, B:262:0x04fd, B:264:0x050d, B:266:0x0513, B:271:0x0523, B:274:0x0529, B:275:0x0533, B:277:0x0538, B:226:0x0484, B:228:0x0488, B:373:0x0726), top: B:410:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [int] */
    /* JADX WARN: Type inference failed for: r27v0, types: [cav, cls, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v45, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r6v37, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v29, types: [int] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.util.List] */
    @Override // defpackage.cdp
    public void af(long j, long j2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j3;
        boolean z6;
        ByteBuffer byteBuffer;
        int i;
        MediaCodec.BufferInfo bufferInfo;
        int i2;
        boolean z7;
        long j4;
        boolean z8;
        bse bseVar;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        ccu ccuVarR;
        DecoderInputBuffer decoderInputBuffer;
        ?? r3;
        int iK;
        byte[] bArr;
        bse bseVar2;
        long j5;
        chk chkVar;
        ByteBuffer byteBuffer2;
        byte[] bArr2;
        ByteBuffer byteBuffer3;
        int iPosition;
        int iLimit;
        int i3;
        int i4;
        int i5;
        ?? r12;
        int i6;
        ByteBuffer byteBuffer4;
        ?? r26;
        byte b;
        int i7;
        int length;
        bse bseVar3;
        cbo cboVar = this.C;
        if (cboVar != null) {
            this.C = null;
            throw cboVar;
        }
        boolean z13 = true;
        try {
            try {
                if (this.B) {
                    at();
                    return;
                }
                if (this.L == null && !bm(2)) {
                    return;
                }
                aE();
                try {
                    try {
                        if (this.y) {
                            while (true) {
                                ahno.O(this.B ^ z13);
                                cle cleVar = this.H;
                                if (cleVar.b()) {
                                    ByteBuffer byteBuffer5 = cleVar.data;
                                    int i8 = this.ab;
                                    int i9 = cleVar.b;
                                    long j6 = cleVar.timeUs;
                                    boolean zBl = bl(this.e, cleVar.a);
                                    boolean zIsEndOfStream = cleVar.isEndOfStream();
                                    bse bseVar4 = this.M;
                                    bseVar4.getClass();
                                    if (!au(j, j2, null, byteBuffer5, i8, 0, i9, j6, zBl, zIsEndOfStream, bseVar4)) {
                                        break;
                                    }
                                    aF(cleVar.a);
                                    cleVar.clear();
                                    if (this.ao) {
                                        z11 = true;
                                        this.B = true;
                                        break;
                                    }
                                    z11 = true;
                                    if (this.af) {
                                        try {
                                            ahno.O(cleVar.a(this.q));
                                            z12 = false;
                                            this.af = false;
                                        } catch (IllegalStateException e) {
                                            e = e;
                                            z = z11;
                                        }
                                    } else {
                                        z12 = false;
                                    }
                                    if (!this.ag) {
                                        ahno.O(!this.ao);
                                        ccuVarR = r();
                                        decoderInputBuffer = this.q;
                                        decoderInputBuffer.clear();
                                        r3 = z12;
                                        while (true) {
                                            decoderInputBuffer.clear();
                                            iK = k(ccuVarR, decoderInputBuffer, r3);
                                            if (iK != -5) {
                                                ak(ccuVarR);
                                                break;
                                            }
                                            if (iK != -4) {
                                                if (decoderInputBuffer.isEndOfStream()) {
                                                    this.A = Math.max(this.A, decoderInputBuffer.timeUs);
                                                    if (X() || decoderInputBuffer.isLastSample()) {
                                                        b().i = this.A;
                                                    }
                                                    if (this.ap) {
                                                        bseVar3 = this.L;
                                                        bseVar3.getClass();
                                                        this.M = bseVar3;
                                                        if (Objects.equals(bseVar3.q, "audio/opus") && !this.M.t.isEmpty()) {
                                                            int iB = atz.b((byte[]) this.M.t.get(r3));
                                                            bsd bsdVar = new bsd(this.M);
                                                            bsdVar.K = iB;
                                                            this.M = new bse(bsdVar);
                                                        }
                                                        bArr = null;
                                                        aq(this.M, null);
                                                        this.ap = r3;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    decoderInputBuffer.flip();
                                                    bseVar2 = this.M;
                                                    if (bseVar2 != null && Objects.equals(bseVar2.q, "audio/opus")) {
                                                        if (decoderInputBuffer.hasSupplementalData()) {
                                                            decoderInputBuffer.format = this.M;
                                                            am(decoderInputBuffer);
                                                        }
                                                        if (atz.e(this.e, decoderInputBuffer.timeUs)) {
                                                            chkVar = this.K;
                                                            ?? r8 = this.M.t;
                                                            byteBuffer2 = decoderInputBuffer.data;
                                                            byteBuffer2.getClass();
                                                            if (byteBuffer2.limit() - decoderInputBuffer.data.position() != 0) {
                                                                if (chkVar.d == 2 || !(r8.size() == z11 || r8.size() == 3)) {
                                                                    bArr2 = bArr;
                                                                } else {
                                                                    bArr2 = (byte[]) r8.get(r3);
                                                                }
                                                                byteBuffer3 = decoderInputBuffer.data;
                                                                iPosition = byteBuffer3.position();
                                                                iLimit = byteBuffer3.limit();
                                                                i3 = iLimit - iPosition;
                                                                i4 = (i3 + 255) / 255;
                                                                i5 = i4 + 27 + i3;
                                                                if (chkVar.d == 2) {
                                                                    if (bArr2 != null) {
                                                                        length = bArr2.length + 28;
                                                                    } else {
                                                                        length = 47;
                                                                    }
                                                                    i5 += (length == true ? 1 : 0) + 44;
                                                                    r12 = length;
                                                                } else {
                                                                    r12 = r3;
                                                                }
                                                                i6 = i5;
                                                                if (chkVar.c.capacity() < i6) {
                                                                    chkVar.c = ByteBuffer.allocate(i6).order(ByteOrder.LITTLE_ENDIAN);
                                                                } else {
                                                                    chkVar.c.clear();
                                                                }
                                                                byteBuffer4 = chkVar.c;
                                                                if (chkVar.d == 2) {
                                                                    if (bArr2 != null) {
                                                                        chk.a(byteBuffer4, 0L, 0, 1, true);
                                                                        int length2 = bArr2.length;
                                                                        byteBuffer4.put(afxw.G(length2));
                                                                        byteBuffer4.put(bArr2);
                                                                        int i10 = length2 + 28;
                                                                        byteBuffer4.putInt(22, bwp.e(byteBuffer4.array(), byteBuffer4.arrayOffset(), i10, 0));
                                                                        byteBuffer4.position(i10);
                                                                    } else {
                                                                        byteBuffer4.put(chk.a);
                                                                    }
                                                                    byteBuffer4.put(chk.b);
                                                                    r26 = r12;
                                                                } else {
                                                                    r26 = r12 == true ? 1 : 0;
                                                                }
                                                                byte b2 = byteBuffer3.get(0);
                                                                if (byteBuffer3.limit() > 1) {
                                                                    b = byteBuffer3.get(1);
                                                                } else {
                                                                    b = 0;
                                                                }
                                                                int iC = chkVar.e + ((int) ((atz.c(b2, b) * 48000) / 1000000));
                                                                chkVar.e = iC;
                                                                chk.a(byteBuffer4, iC, chkVar.d, i4, false);
                                                                for (i7 = 0; i7 < i4; i7++) {
                                                                    if (i3 >= 255) {
                                                                        byteBuffer4.put((byte) -1);
                                                                        i3 -= 255;
                                                                    } else {
                                                                        byteBuffer4.put((byte) i3);
                                                                        i3 = 0;
                                                                    }
                                                                }
                                                                while (iPosition < iLimit) {
                                                                    byteBuffer4.put(byteBuffer3.get(iPosition));
                                                                    iPosition++;
                                                                }
                                                                byteBuffer3.position(byteBuffer3.limit());
                                                                byteBuffer4.flip();
                                                                if (chkVar.d == 2) {
                                                                    byteBuffer4.putInt(r26 + 66, bwp.e(byteBuffer4.array(), byteBuffer4.arrayOffset() + r26 + 44, byteBuffer4.limit() - byteBuffer4.position(), 0));
                                                                } else {
                                                                    byteBuffer4.putInt(22, bwp.e(byteBuffer4.array(), byteBuffer4.arrayOffset(), byteBuffer4.limit() - byteBuffer4.position(), 0));
                                                                }
                                                                chkVar.d++;
                                                                chkVar.c = byteBuffer4;
                                                                decoderInputBuffer.clear();
                                                                decoderInputBuffer.ensureSpaceForWrite(chkVar.c.remaining());
                                                                decoderInputBuffer.data.put(chkVar.c);
                                                                decoderInputBuffer.flip();
                                                            }
                                                        }
                                                    }
                                                    if (cleVar.b()) {
                                                        j5 = this.e;
                                                        if (bl(j5, cleVar.a) == bl(j5, decoderInputBuffer.timeUs)) {
                                                            if (cleVar.a(decoderInputBuffer)) {
                                                                z11 = true;
                                                                r3 = 0;
                                                            }
                                                        }
                                                    } else if (cleVar.a(decoderInputBuffer)) {
                                                        z11 = true;
                                                        r3 = 0;
                                                    }
                                                    this.af = true;
                                                    break;
                                                }
                                                this.ao = z11;
                                                b().i = this.A;
                                                break;
                                            }
                                            if (X()) {
                                                break;
                                            }
                                            b().i = this.A;
                                            break;
                                        }
                                        if (cleVar.b()) {
                                            cleVar.flip();
                                        }
                                        if (!cleVar.b() && !this.ao && !this.ag) {
                                            break;
                                        } else {
                                            z13 = true;
                                        }
                                    } else {
                                        if (!cleVar.b()) {
                                            d();
                                            this.ag = z12;
                                            aE();
                                            if (this.y) {
                                                break;
                                            }
                                            ahno.O(!this.ao);
                                            ccuVarR = r();
                                            decoderInputBuffer = this.q;
                                            decoderInputBuffer.clear();
                                            r3 = z12;
                                            while (true) {
                                                decoderInputBuffer.clear();
                                                iK = k(ccuVarR, decoderInputBuffer, r3);
                                                if (iK != -5) {
                                                    ak(ccuVarR);
                                                    break;
                                                }
                                                if (iK != -4) {
                                                    if (decoderInputBuffer.isEndOfStream()) {
                                                        this.A = Math.max(this.A, decoderInputBuffer.timeUs);
                                                        if (X()) {
                                                            b().i = this.A;
                                                        } else {
                                                            b().i = this.A;
                                                        }
                                                        if (this.ap) {
                                                            bseVar3 = this.L;
                                                            bseVar3.getClass();
                                                            this.M = bseVar3;
                                                            if (Objects.equals(bseVar3.q, "audio/opus")) {
                                                                int iB2 = atz.b((byte[]) this.M.t.get(r3));
                                                                bsd bsdVar2 = new bsd(this.M);
                                                                bsdVar2.K = iB2;
                                                                this.M = new bse(bsdVar2);
                                                            }
                                                            bArr = null;
                                                            aq(this.M, null);
                                                            this.ap = r3;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        decoderInputBuffer.flip();
                                                        bseVar2 = this.M;
                                                        if (bseVar2 != null) {
                                                            if (decoderInputBuffer.hasSupplementalData()) {
                                                                decoderInputBuffer.format = this.M;
                                                                am(decoderInputBuffer);
                                                            }
                                                            if (atz.e(this.e, decoderInputBuffer.timeUs)) {
                                                                chkVar = this.K;
                                                                ?? r9 = this.M.t;
                                                                byteBuffer2 = decoderInputBuffer.data;
                                                                byteBuffer2.getClass();
                                                                if (byteBuffer2.limit() - decoderInputBuffer.data.position() != 0) {
                                                                    if (chkVar.d == 2) {
                                                                        bArr2 = bArr;
                                                                    } else {
                                                                        bArr2 = bArr;
                                                                    }
                                                                    byteBuffer3 = decoderInputBuffer.data;
                                                                    iPosition = byteBuffer3.position();
                                                                    iLimit = byteBuffer3.limit();
                                                                    i3 = iLimit - iPosition;
                                                                    i4 = (i3 + 255) / 255;
                                                                    i5 = i4 + 27 + i3;
                                                                    if (chkVar.d == 2) {
                                                                        if (bArr2 != null) {
                                                                            length = bArr2.length + 28;
                                                                        } else {
                                                                            length = 47;
                                                                        }
                                                                        i5 += (length == true ? 1 : 0) + 44;
                                                                        r12 = length;
                                                                    } else {
                                                                        r12 = r3;
                                                                    }
                                                                    i6 = i5;
                                                                    if (chkVar.c.capacity() < i6) {
                                                                        chkVar.c = ByteBuffer.allocate(i6).order(ByteOrder.LITTLE_ENDIAN);
                                                                    } else {
                                                                        chkVar.c.clear();
                                                                    }
                                                                    byteBuffer4 = chkVar.c;
                                                                    if (chkVar.d == 2) {
                                                                        if (bArr2 != null) {
                                                                            chk.a(byteBuffer4, 0L, 0, 1, true);
                                                                            int length3 = bArr2.length;
                                                                            byteBuffer4.put(afxw.G(length3));
                                                                            byteBuffer4.put(bArr2);
                                                                            int i11 = length3 + 28;
                                                                            byteBuffer4.putInt(22, bwp.e(byteBuffer4.array(), byteBuffer4.arrayOffset(), i11, 0));
                                                                            byteBuffer4.position(i11);
                                                                        } else {
                                                                            byteBuffer4.put(chk.a);
                                                                        }
                                                                        byteBuffer4.put(chk.b);
                                                                        r26 = r12;
                                                                    } else {
                                                                        r26 = r12 == true ? 1 : 0;
                                                                    }
                                                                    byte b3 = byteBuffer3.get(0);
                                                                    if (byteBuffer3.limit() > 1) {
                                                                        b = byteBuffer3.get(1);
                                                                    } else {
                                                                        b = 0;
                                                                    }
                                                                    int iC2 = chkVar.e + ((int) ((atz.c(b3, b) * 48000) / 1000000));
                                                                    chkVar.e = iC2;
                                                                    chk.a(byteBuffer4, iC2, chkVar.d, i4, false);
                                                                    while (i7 < i4) {
                                                                        if (i3 >= 255) {
                                                                            byteBuffer4.put((byte) -1);
                                                                            i3 -= 255;
                                                                        } else {
                                                                            byteBuffer4.put((byte) i3);
                                                                            i3 = 0;
                                                                        }
                                                                    }
                                                                    while (iPosition < iLimit) {
                                                                        byteBuffer4.put(byteBuffer3.get(iPosition));
                                                                        iPosition++;
                                                                    }
                                                                    byteBuffer3.position(byteBuffer3.limit());
                                                                    byteBuffer4.flip();
                                                                    if (chkVar.d == 2) {
                                                                        byteBuffer4.putInt(r26 + 66, bwp.e(byteBuffer4.array(), byteBuffer4.arrayOffset() + r26 + 44, byteBuffer4.limit() - byteBuffer4.position(), 0));
                                                                    } else {
                                                                        byteBuffer4.putInt(22, bwp.e(byteBuffer4.array(), byteBuffer4.arrayOffset(), byteBuffer4.limit() - byteBuffer4.position(), 0));
                                                                    }
                                                                    chkVar.d++;
                                                                    chkVar.c = byteBuffer4;
                                                                    decoderInputBuffer.clear();
                                                                    decoderInputBuffer.ensureSpaceForWrite(chkVar.c.remaining());
                                                                    decoderInputBuffer.data.put(chkVar.c);
                                                                    decoderInputBuffer.flip();
                                                                }
                                                            }
                                                        }
                                                        if (cleVar.b()) {
                                                            j5 = this.e;
                                                            if (bl(j5, cleVar.a) == bl(j5, decoderInputBuffer.timeUs)) {
                                                                if (cleVar.a(decoderInputBuffer)) {
                                                                    z11 = true;
                                                                    r3 = 0;
                                                                }
                                                            }
                                                        } else if (cleVar.a(decoderInputBuffer)) {
                                                            z11 = true;
                                                            r3 = 0;
                                                        }
                                                        this.af = true;
                                                        break;
                                                    }
                                                    this.ao = z11;
                                                    b().i = this.A;
                                                    break;
                                                }
                                                if (X()) {
                                                    break;
                                                }
                                                b().i = this.A;
                                                break;
                                            }
                                            if (cleVar.b()) {
                                                cleVar.flip();
                                            }
                                            if (!cleVar.b()) {
                                                continue;
                                            }
                                        } else {
                                            continue;
                                        }
                                        z13 = true;
                                    }
                                } else {
                                    if (this.ao) {
                                        z11 = true;
                                        this.B = true;
                                        break;
                                    }
                                    z11 = true;
                                    if (this.af) {
                                        ahno.O(cleVar.a(this.q));
                                        z12 = false;
                                        this.af = false;
                                    } else {
                                        z12 = false;
                                    }
                                    if (!this.ag) {
                                        ahno.O(!this.ao);
                                        ccuVarR = r();
                                        decoderInputBuffer = this.q;
                                        decoderInputBuffer.clear();
                                        r3 = z12;
                                        while (true) {
                                            decoderInputBuffer.clear();
                                            iK = k(ccuVarR, decoderInputBuffer, r3);
                                            if (iK != -5) {
                                                ak(ccuVarR);
                                                break;
                                            }
                                            if (iK != -4) {
                                                if (decoderInputBuffer.isEndOfStream()) {
                                                    this.A = Math.max(this.A, decoderInputBuffer.timeUs);
                                                    if (X()) {
                                                        b().i = this.A;
                                                    } else {
                                                        b().i = this.A;
                                                    }
                                                    if (this.ap) {
                                                        bseVar3 = this.L;
                                                        bseVar3.getClass();
                                                        this.M = bseVar3;
                                                        if (Objects.equals(bseVar3.q, "audio/opus")) {
                                                            int iB3 = atz.b((byte[]) this.M.t.get(r3));
                                                            bsd bsdVar3 = new bsd(this.M);
                                                            bsdVar3.K = iB3;
                                                            this.M = new bse(bsdVar3);
                                                        }
                                                        bArr = null;
                                                        aq(this.M, null);
                                                        this.ap = r3;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    decoderInputBuffer.flip();
                                                    bseVar2 = this.M;
                                                    if (bseVar2 != null) {
                                                        if (decoderInputBuffer.hasSupplementalData()) {
                                                            decoderInputBuffer.format = this.M;
                                                            am(decoderInputBuffer);
                                                        }
                                                        if (atz.e(this.e, decoderInputBuffer.timeUs)) {
                                                            chkVar = this.K;
                                                            ?? r10 = this.M.t;
                                                            byteBuffer2 = decoderInputBuffer.data;
                                                            byteBuffer2.getClass();
                                                            if (byteBuffer2.limit() - decoderInputBuffer.data.position() != 0) {
                                                                if (chkVar.d == 2) {
                                                                    bArr2 = bArr;
                                                                } else {
                                                                    bArr2 = bArr;
                                                                }
                                                                byteBuffer3 = decoderInputBuffer.data;
                                                                iPosition = byteBuffer3.position();
                                                                iLimit = byteBuffer3.limit();
                                                                i3 = iLimit - iPosition;
                                                                i4 = (i3 + 255) / 255;
                                                                i5 = i4 + 27 + i3;
                                                                if (chkVar.d == 2) {
                                                                    if (bArr2 != null) {
                                                                        length = bArr2.length + 28;
                                                                    } else {
                                                                        length = 47;
                                                                    }
                                                                    i5 += (length == true ? 1 : 0) + 44;
                                                                    r12 = length;
                                                                } else {
                                                                    r12 = r3;
                                                                }
                                                                i6 = i5;
                                                                if (chkVar.c.capacity() < i6) {
                                                                    chkVar.c = ByteBuffer.allocate(i6).order(ByteOrder.LITTLE_ENDIAN);
                                                                } else {
                                                                    chkVar.c.clear();
                                                                }
                                                                byteBuffer4 = chkVar.c;
                                                                if (chkVar.d == 2) {
                                                                    if (bArr2 != null) {
                                                                        chk.a(byteBuffer4, 0L, 0, 1, true);
                                                                        int length4 = bArr2.length;
                                                                        byteBuffer4.put(afxw.G(length4));
                                                                        byteBuffer4.put(bArr2);
                                                                        int i12 = length4 + 28;
                                                                        byteBuffer4.putInt(22, bwp.e(byteBuffer4.array(), byteBuffer4.arrayOffset(), i12, 0));
                                                                        byteBuffer4.position(i12);
                                                                    } else {
                                                                        byteBuffer4.put(chk.a);
                                                                    }
                                                                    byteBuffer4.put(chk.b);
                                                                    r26 = r12;
                                                                } else {
                                                                    r26 = r12 == true ? 1 : 0;
                                                                }
                                                                byte b4 = byteBuffer3.get(0);
                                                                if (byteBuffer3.limit() > 1) {
                                                                    b = byteBuffer3.get(1);
                                                                } else {
                                                                    b = 0;
                                                                }
                                                                int iC3 = chkVar.e + ((int) ((atz.c(b4, b) * 48000) / 1000000));
                                                                chkVar.e = iC3;
                                                                chk.a(byteBuffer4, iC3, chkVar.d, i4, false);
                                                                while (i7 < i4) {
                                                                    if (i3 >= 255) {
                                                                        byteBuffer4.put((byte) -1);
                                                                        i3 -= 255;
                                                                    } else {
                                                                        byteBuffer4.put((byte) i3);
                                                                        i3 = 0;
                                                                    }
                                                                }
                                                                while (iPosition < iLimit) {
                                                                    byteBuffer4.put(byteBuffer3.get(iPosition));
                                                                    iPosition++;
                                                                }
                                                                byteBuffer3.position(byteBuffer3.limit());
                                                                byteBuffer4.flip();
                                                                if (chkVar.d == 2) {
                                                                    byteBuffer4.putInt(r26 + 66, bwp.e(byteBuffer4.array(), byteBuffer4.arrayOffset() + r26 + 44, byteBuffer4.limit() - byteBuffer4.position(), 0));
                                                                } else {
                                                                    byteBuffer4.putInt(22, bwp.e(byteBuffer4.array(), byteBuffer4.arrayOffset(), byteBuffer4.limit() - byteBuffer4.position(), 0));
                                                                }
                                                                chkVar.d++;
                                                                chkVar.c = byteBuffer4;
                                                                decoderInputBuffer.clear();
                                                                decoderInputBuffer.ensureSpaceForWrite(chkVar.c.remaining());
                                                                decoderInputBuffer.data.put(chkVar.c);
                                                                decoderInputBuffer.flip();
                                                            }
                                                        }
                                                    }
                                                    if (cleVar.b()) {
                                                        j5 = this.e;
                                                        if (bl(j5, cleVar.a) == bl(j5, decoderInputBuffer.timeUs)) {
                                                            if (cleVar.a(decoderInputBuffer)) {
                                                                z11 = true;
                                                                r3 = 0;
                                                            }
                                                        }
                                                    } else if (cleVar.a(decoderInputBuffer)) {
                                                        z11 = true;
                                                        r3 = 0;
                                                    }
                                                    this.af = true;
                                                    break;
                                                }
                                                this.ao = z11;
                                                b().i = this.A;
                                                break;
                                            }
                                            if (X()) {
                                                break;
                                            }
                                            b().i = this.A;
                                            break;
                                        }
                                        if (cleVar.b()) {
                                            cleVar.flip();
                                        }
                                        if (!cleVar.b()) {
                                            continue;
                                        }
                                        z13 = true;
                                    } else {
                                        if (!cleVar.b()) {
                                            d();
                                            this.ag = z12;
                                            aE();
                                            if (this.y) {
                                                break;
                                                break;
                                            }
                                            ahno.O(!this.ao);
                                            ccuVarR = r();
                                            decoderInputBuffer = this.q;
                                            decoderInputBuffer.clear();
                                            r3 = z12;
                                            while (true) {
                                                decoderInputBuffer.clear();
                                                iK = k(ccuVarR, decoderInputBuffer, r3);
                                                if (iK != -5) {
                                                    ak(ccuVarR);
                                                    break;
                                                }
                                                if (iK != -4) {
                                                    if (decoderInputBuffer.isEndOfStream()) {
                                                        this.A = Math.max(this.A, decoderInputBuffer.timeUs);
                                                        if (X()) {
                                                            b().i = this.A;
                                                        } else {
                                                            b().i = this.A;
                                                        }
                                                        if (this.ap) {
                                                            bseVar3 = this.L;
                                                            bseVar3.getClass();
                                                            this.M = bseVar3;
                                                            if (Objects.equals(bseVar3.q, "audio/opus")) {
                                                                int iB4 = atz.b((byte[]) this.M.t.get(r3));
                                                                bsd bsdVar4 = new bsd(this.M);
                                                                bsdVar4.K = iB4;
                                                                this.M = new bse(bsdVar4);
                                                            }
                                                            bArr = null;
                                                            aq(this.M, null);
                                                            this.ap = r3;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        decoderInputBuffer.flip();
                                                        bseVar2 = this.M;
                                                        if (bseVar2 != null) {
                                                            if (decoderInputBuffer.hasSupplementalData()) {
                                                                decoderInputBuffer.format = this.M;
                                                                am(decoderInputBuffer);
                                                            }
                                                            if (atz.e(this.e, decoderInputBuffer.timeUs)) {
                                                                chkVar = this.K;
                                                                ?? r11 = this.M.t;
                                                                byteBuffer2 = decoderInputBuffer.data;
                                                                byteBuffer2.getClass();
                                                                if (byteBuffer2.limit() - decoderInputBuffer.data.position() != 0) {
                                                                    if (chkVar.d == 2) {
                                                                        bArr2 = bArr;
                                                                    } else {
                                                                        bArr2 = bArr;
                                                                    }
                                                                    byteBuffer3 = decoderInputBuffer.data;
                                                                    iPosition = byteBuffer3.position();
                                                                    iLimit = byteBuffer3.limit();
                                                                    i3 = iLimit - iPosition;
                                                                    i4 = (i3 + 255) / 255;
                                                                    i5 = i4 + 27 + i3;
                                                                    if (chkVar.d == 2) {
                                                                        if (bArr2 != null) {
                                                                            length = bArr2.length + 28;
                                                                        } else {
                                                                            length = 47;
                                                                        }
                                                                        i5 += (length == true ? 1 : 0) + 44;
                                                                        r12 = length;
                                                                    } else {
                                                                        r12 = r3;
                                                                    }
                                                                    i6 = i5;
                                                                    if (chkVar.c.capacity() < i6) {
                                                                        chkVar.c = ByteBuffer.allocate(i6).order(ByteOrder.LITTLE_ENDIAN);
                                                                    } else {
                                                                        chkVar.c.clear();
                                                                    }
                                                                    byteBuffer4 = chkVar.c;
                                                                    if (chkVar.d == 2) {
                                                                        if (bArr2 != null) {
                                                                            chk.a(byteBuffer4, 0L, 0, 1, true);
                                                                            int length5 = bArr2.length;
                                                                            byteBuffer4.put(afxw.G(length5));
                                                                            byteBuffer4.put(bArr2);
                                                                            int i13 = length5 + 28;
                                                                            byteBuffer4.putInt(22, bwp.e(byteBuffer4.array(), byteBuffer4.arrayOffset(), i13, 0));
                                                                            byteBuffer4.position(i13);
                                                                        } else {
                                                                            byteBuffer4.put(chk.a);
                                                                        }
                                                                        byteBuffer4.put(chk.b);
                                                                        r26 = r12;
                                                                    } else {
                                                                        r26 = r12 == true ? 1 : 0;
                                                                    }
                                                                    byte b5 = byteBuffer3.get(0);
                                                                    if (byteBuffer3.limit() > 1) {
                                                                        b = byteBuffer3.get(1);
                                                                    } else {
                                                                        b = 0;
                                                                    }
                                                                    int iC4 = chkVar.e + ((int) ((atz.c(b5, b) * 48000) / 1000000));
                                                                    chkVar.e = iC4;
                                                                    chk.a(byteBuffer4, iC4, chkVar.d, i4, false);
                                                                    while (i7 < i4) {
                                                                        if (i3 >= 255) {
                                                                            byteBuffer4.put((byte) -1);
                                                                            i3 -= 255;
                                                                        } else {
                                                                            byteBuffer4.put((byte) i3);
                                                                            i3 = 0;
                                                                        }
                                                                    }
                                                                    while (iPosition < iLimit) {
                                                                        byteBuffer4.put(byteBuffer3.get(iPosition));
                                                                        iPosition++;
                                                                    }
                                                                    byteBuffer3.position(byteBuffer3.limit());
                                                                    byteBuffer4.flip();
                                                                    if (chkVar.d == 2) {
                                                                        byteBuffer4.putInt(r26 + 66, bwp.e(byteBuffer4.array(), byteBuffer4.arrayOffset() + r26 + 44, byteBuffer4.limit() - byteBuffer4.position(), 0));
                                                                    } else {
                                                                        byteBuffer4.putInt(22, bwp.e(byteBuffer4.array(), byteBuffer4.arrayOffset(), byteBuffer4.limit() - byteBuffer4.position(), 0));
                                                                    }
                                                                    chkVar.d++;
                                                                    chkVar.c = byteBuffer4;
                                                                    decoderInputBuffer.clear();
                                                                    decoderInputBuffer.ensureSpaceForWrite(chkVar.c.remaining());
                                                                    decoderInputBuffer.data.put(chkVar.c);
                                                                    decoderInputBuffer.flip();
                                                                }
                                                            }
                                                        }
                                                        if (cleVar.b()) {
                                                            j5 = this.e;
                                                            if (bl(j5, cleVar.a) == bl(j5, decoderInputBuffer.timeUs)) {
                                                                if (cleVar.a(decoderInputBuffer)) {
                                                                    z11 = true;
                                                                    r3 = 0;
                                                                }
                                                            }
                                                        } else if (cleVar.a(decoderInputBuffer)) {
                                                            z11 = true;
                                                            r3 = 0;
                                                        }
                                                        this.af = true;
                                                        break;
                                                    }
                                                    this.ao = z11;
                                                    b().i = this.A;
                                                    break;
                                                }
                                                if (X()) {
                                                    break;
                                                }
                                                b().i = this.A;
                                                break;
                                            }
                                            if (cleVar.b()) {
                                                cleVar.flip();
                                            }
                                            if (!cleVar.b()) {
                                                continue;
                                            }
                                        } else {
                                            continue;
                                        }
                                        z13 = true;
                                    }
                                }
                            }
                            z = true;
                        } else if (this.u != null) {
                            p().b();
                            while (true) {
                                clk clkVar = this.u;
                                clkVar.getClass();
                                try {
                                    if (bj()) {
                                        z2 = true;
                                    } else {
                                        try {
                                            MediaCodec.BufferInfo bufferInfo2 = this.I;
                                            int iB5 = clkVar.b(bufferInfo2);
                                            if (iB5 < 0) {
                                                z10 = true;
                                                if (iB5 != -2) {
                                                    if (this.W && (this.ao || this.aj == 2)) {
                                                        aW();
                                                    }
                                                    long j7 = this.X;
                                                    if (j7 != -9223372036854775807L && j7 + 100 < p().a()) {
                                                        aW();
                                                        break;
                                                    } else {
                                                        break;
                                                        break;
                                                    }
                                                }
                                                try {
                                                    this.am = true;
                                                    clk clkVar2 = this.u;
                                                    clkVar2.getClass();
                                                    MediaFormat mediaFormatC = clkVar2.c();
                                                    if (Build.VERSION.SDK_INT >= 29 && !this.aw.isEmpty()) {
                                                        agkz<String> agkzVar = this.aw;
                                                        caw cawVar = caw.a;
                                                        HashMap map = new HashMap();
                                                        for (String str : agkzVar) {
                                                            if (mediaFormatC.containsKey(str)) {
                                                                int valueTypeForKey = mediaFormatC.getValueTypeForKey(str);
                                                                if (valueTypeForKey == 1) {
                                                                    map.put(str, Integer.valueOf(mediaFormatC.getInteger(str)));
                                                                } else if (valueTypeForKey == 2) {
                                                                    map.put(str, Long.valueOf(mediaFormatC.getLong(str)));
                                                                } else if (valueTypeForKey == 3) {
                                                                    map.put(str, Float.valueOf(mediaFormatC.getFloat(str)));
                                                                } else if (valueTypeForKey == 4) {
                                                                    map.put(str, mediaFormatC.getString(str));
                                                                } else if (valueTypeForKey == 5) {
                                                                    ByteBuffer byteBuffer6 = mediaFormatC.getByteBuffer(str);
                                                                    if (byteBuffer6 == null) {
                                                                        map.put(str, null);
                                                                    } else {
                                                                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer6.remaining());
                                                                        byteBufferAllocate.put(byteBuffer6.duplicate());
                                                                        byteBufferAllocate.flip();
                                                                        map.put(str, byteBufferAllocate);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        caw cawVar2 = new caw(map);
                                                        if (!cawVar2.equals(this.av)) {
                                                            this.av = cawVar2;
                                                            ao(cawVar2);
                                                        }
                                                    }
                                                    this.w = mediaFormatC;
                                                    this.R = true;
                                                } catch (IllegalStateException e2) {
                                                    e = e2;
                                                }
                                                z = z10;
                                                boolean z14 = e instanceof MediaCodec.CodecException;
                                                if (!z14) {
                                                    StackTraceElement[] stackTrace = e.getStackTrace();
                                                    if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                                                        throw e;
                                                    }
                                                }
                                                an(e);
                                                boolean z15 = (z14 && ((MediaCodec.CodecException) e).isRecoverable()) ? z : false;
                                                if (z15) {
                                                    aH();
                                                }
                                                clm clmVarAC = aC(e, this.x);
                                                throw q(clmVarAC, this.L, z15, clmVarAC.b == 1101 ? 4006 : 4003);
                                            }
                                            z2 = true;
                                            this.ae = this.at != -9223372036854775807L && bufferInfo2.presentationTimeUs <= this.at;
                                            bufferInfo2.presentationTimeUs -= this.F;
                                            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                                                aW();
                                                break;
                                            }
                                            this.ab = iB5;
                                            ByteBuffer byteBufferF = clkVar.f(iB5);
                                            this.ac = byteBufferF;
                                            if (byteBufferF != null) {
                                                byteBufferF.position(bufferInfo2.offset);
                                                this.ac.limit(bufferInfo2.offset + bufferInfo2.size);
                                            }
                                            bse bseVar5 = (bse) this.aq.e.d(bufferInfo2.presentationTimeUs);
                                            if (bseVar5 == null && this.ar && this.w != null) {
                                                bseVar5 = (bse) this.aq.e.c();
                                            }
                                            if (bseVar5 == null) {
                                                if (!this.R || (bseVar5 = this.M) == null) {
                                                }
                                                if (this.aq.a() || this.aq.f == -9223372036854775807L || this.I.presentationTimeUs - aA() < this.aq.f) {
                                                    z4 = z3;
                                                } else {
                                                    z4 = z2;
                                                }
                                                if (!this.ae || this.as || this.I.presentationTimeUs < this.e || z4) {
                                                    z5 = z2;
                                                } else {
                                                    z5 = z3;
                                                }
                                                this.ad = z5;
                                                j3 = this.aq.i;
                                                if (j3 != -9223372036854775807L || j3 > this.I.presentationTimeUs || z4) {
                                                    z6 = z3;
                                                } else {
                                                    z6 = z2;
                                                }
                                                byteBuffer = this.ac;
                                                i = this.ab;
                                                bufferInfo = this.I;
                                                i2 = bufferInfo.flags;
                                                z7 = z2;
                                                j4 = bufferInfo.presentationTimeUs;
                                                z8 = this.ad;
                                                bseVar = this.M;
                                                bseVar.getClass();
                                                if (!au(j, j2, clkVar, byteBuffer, i, i2, 1, j4, z8, z6, bseVar)) {
                                                    break;
                                                }
                                                aF(bufferInfo.presentationTimeUs);
                                                if ((bufferInfo.flags & 4) != 0) {
                                                    z9 = true;
                                                } else {
                                                    z9 = false;
                                                }
                                                if (!z9 && this.al && z6) {
                                                    this.X = p().a();
                                                }
                                                bb();
                                                if (z9) {
                                                    aW();
                                                    break;
                                                }
                                            } else {
                                                this.M = bseVar5;
                                            }
                                            bseVar5.getClass();
                                            aq(bseVar5, this.w);
                                            z3 = false;
                                            this.R = false;
                                            this.ar = false;
                                            if (this.aq.a()) {
                                                z4 = z3;
                                            } else {
                                                z4 = z3;
                                            }
                                            if (this.ae) {
                                                z5 = z2;
                                            } else {
                                                z5 = z2;
                                            }
                                            this.ad = z5;
                                            j3 = this.aq.i;
                                            if (j3 != -9223372036854775807L) {
                                                z6 = z3;
                                            } else {
                                                z6 = z3;
                                            }
                                            byteBuffer = this.ac;
                                            i = this.ab;
                                            bufferInfo = this.I;
                                            i2 = bufferInfo.flags;
                                            z7 = z2;
                                            j4 = bufferInfo.presentationTimeUs;
                                            z8 = this.ad;
                                            bseVar = this.M;
                                            bseVar.getClass();
                                            if (!au(j, j2, clkVar, byteBuffer, i, i2, 1, j4, z8, z6, bseVar)) {
                                                break;
                                                break;
                                            }
                                            aF(bufferInfo.presentationTimeUs);
                                            if ((bufferInfo.flags & 4) != 0) {
                                                z9 = true;
                                            } else {
                                                z9 = false;
                                            }
                                            if (!z9) {
                                                this.X = p().a();
                                            }
                                            bb();
                                            if (z9) {
                                                aW();
                                                break;
                                            }
                                        } catch (IllegalStateException e3) {
                                            e = e3;
                                            z10 = true;
                                        }
                                    }
                                    j4 = bufferInfo.presentationTimeUs;
                                    z8 = this.ad;
                                    bseVar = this.M;
                                    bseVar.getClass();
                                    if (!au(j, j2, clkVar, byteBuffer, i, i2, 1, j4, z8, z6, bseVar)) {
                                        break;
                                        break;
                                    }
                                    aF(bufferInfo.presentationTimeUs);
                                    if ((bufferInfo.flags & 4) != 0) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    if (!z9) {
                                        this.X = p().a();
                                    }
                                    bb();
                                    if (z9) {
                                        aW();
                                        break;
                                    }
                                } catch (IllegalStateException e4) {
                                    e = e4;
                                    z = z7;
                                }
                                z3 = false;
                                if (this.aq.a()) {
                                    z4 = z3;
                                } else {
                                    z4 = z3;
                                }
                                if (this.ae) {
                                    z5 = z2;
                                } else {
                                    z5 = z2;
                                }
                                this.ad = z5;
                                j3 = this.aq.i;
                                if (j3 != -9223372036854775807L) {
                                    z6 = z3;
                                } else {
                                    z6 = z3;
                                }
                                byteBuffer = this.ac;
                                i = this.ab;
                                bufferInfo = this.I;
                                i2 = bufferInfo.flags;
                                z7 = z2;
                            }
                            while (true) {
                                clr clrVarB = b();
                                coo cooVar = this.c;
                                cooVar.getClass();
                                clrVarB.g = cooVar.a();
                                clk clkVar3 = this.u;
                                if (clkVar3 == null || this.aj == 2 || this.ao) {
                                    break;
                                }
                                if (this.aa < 0) {
                                    int iA = clkVar3.a();
                                    this.aa = iA;
                                    if (iA < 0) {
                                        break;
                                    }
                                    DecoderInputBuffer decoderInputBuffer2 = this.r;
                                    decoderInputBuffer2.data = clkVar3.e(iA);
                                    decoderInputBuffer2.clear();
                                }
                                z = true;
                                if (this.aj == 1) {
                                    if (!this.W) {
                                        this.al = true;
                                        clkVar3.t(this.aa, 0, 0L, 4);
                                        ba();
                                    }
                                    this.aj = 2;
                                } else {
                                    if (this.ai == 1) {
                                        int i14 = 0;
                                        while (true) {
                                            bse bseVar6 = this.v;
                                            bseVar6.getClass();
                                            if (i14 >= bseVar6.t.size()) {
                                                break;
                                            }
                                            byte[] bArr3 = (byte[]) this.v.t.get(i14);
                                            ByteBuffer byteBuffer7 = this.r.data;
                                            byteBuffer7.getClass();
                                            byteBuffer7.put(bArr3);
                                            i14++;
                                        }
                                        this.ai = 2;
                                    }
                                    ByteBuffer byteBuffer8 = this.r.data;
                                    byteBuffer8.getClass();
                                    int iPosition2 = byteBuffer8.position();
                                    ccu ccuVarR2 = r();
                                    try {
                                        clkVar3.q(new clp(this, ccuVarR2, 0));
                                        int i15 = this.s.get();
                                        if (i15 == -3) {
                                            if (X()) {
                                                b().i = a();
                                            }
                                        } else if (i15 == -5) {
                                            if (this.ai == 2) {
                                                this.r.clear();
                                                this.ai = 1;
                                            }
                                            ak(ccuVarR2);
                                        } else {
                                            DecoderInputBuffer decoderInputBuffer3 = this.r;
                                            if (decoderInputBuffer3.isEndOfStream()) {
                                                b().i = a();
                                                if (this.ai == 2) {
                                                    decoderInputBuffer3.clear();
                                                    this.ai = 1;
                                                }
                                                this.ao = true;
                                                if (!this.z) {
                                                    aW();
                                                } else if (!this.W) {
                                                    this.al = true;
                                                    clkVar3.t(this.aa, 0, 0L, 4);
                                                    ba();
                                                }
                                            } else if (this.z || decoderInputBuffer3.isKeyFrame()) {
                                                long j8 = decoderInputBuffer3.timeUs;
                                                if (!aN(decoderInputBuffer3)) {
                                                    boolean zIsEncrypted = decoderInputBuffer3.isEncrypted();
                                                    if (zIsEncrypted) {
                                                        decoderInputBuffer3.cryptoInfo.a(iPosition2);
                                                    }
                                                    if (this.ap) {
                                                        clr clrVarB2 = b();
                                                        bwn bwnVar = clrVarB2.e;
                                                        bse bseVar7 = this.L;
                                                        bseVar7.getClass();
                                                        bwnVar.e(j8, bseVar7);
                                                        clrVarB2.h = true;
                                                        this.ap = false;
                                                    }
                                                    if (this.as) {
                                                        long j9 = this.A;
                                                        long j10 = this.F;
                                                        this.at = j9 + j10;
                                                        if (j8 <= j9) {
                                                            this.F = j10 + (j9 - j8) + 1;
                                                        }
                                                        this.A = j8;
                                                        this.an = j8;
                                                        this.as = false;
                                                    }
                                                    this.A = Math.max(this.A, j8);
                                                    long j11 = this.j;
                                                    if (j11 == -9223372036854775807L || j8 - b().d < j11) {
                                                        this.an = Math.max(this.an, j8);
                                                    }
                                                    if (X() || decoderInputBuffer3.isLastSample()) {
                                                        b().i = a();
                                                    }
                                                    decoderInputBuffer3.flip();
                                                    if (decoderInputBuffer3.hasSupplementalData()) {
                                                        am(decoderInputBuffer3);
                                                    }
                                                    aG(decoderInputBuffer3);
                                                    int iAy = ay(decoderInputBuffer3);
                                                    long j12 = j8 + this.F;
                                                    int i16 = this.aa;
                                                    if (zIsEncrypted) {
                                                        clkVar3.u(i16, decoderInputBuffer3.cryptoInfo, j12, iAy);
                                                    } else {
                                                        ByteBuffer byteBuffer9 = decoderInputBuffer3.data;
                                                        byteBuffer9.getClass();
                                                        clkVar3.t(i16, byteBuffer9.limit(), j12, iAy);
                                                    }
                                                    ba();
                                                    this.z = true;
                                                    this.ai = 0;
                                                    this.D.c++;
                                                }
                                            } else {
                                                decoderInputBuffer3.clear();
                                                this.D.d++;
                                                if (this.ai == 2) {
                                                    this.ai = 1;
                                                }
                                            }
                                        }
                                    } catch (cao e5) {
                                        an(e5);
                                        bm(0);
                                        aV();
                                    }
                                }
                            }
                            z = true;
                        } else {
                            z = true;
                            this.D.d += l(j);
                            bm(1);
                        }
                        this.D.a();
                    } catch (IllegalStateException e6) {
                        e = e6;
                    }
                } catch (IllegalStateException e7) {
                    e = e7;
                    z = true;
                }
            } catch (IllegalStateException e8) {
                e = e8;
                z = true;
            }
        } catch (MediaCodec.CryptoException e9) {
            throw q(e9, this.L, false, bwp.k(e9.getErrorCode()));
        }
    }

    @Override // defpackage.cdp
    public boolean ag() {
        throw null;
    }

    @Override // defpackage.cdp
    public boolean ah() {
        throw null;
    }

    protected long ai(long j, long j2, boolean z) {
        throw null;
    }

    protected caz aj(clo cloVar, bse bseVar, bse bseVar2, boolean z) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0175  */
    /* JADX WARN: Code duplicated, block: B:102:0x0179  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x0072  */
    /* JADX WARN: Code duplicated, block: B:36:0x007a  */
    /* JADX WARN: Code duplicated, block: B:73:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x012c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x012e  */
    /* JADX WARN: Code duplicated, block: B:80:0x013c  */
    /* JADX WARN: Code duplicated, block: B:85:0x014e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0155  */
    /* JADX WARN: Code duplicated, block: B:90:0x015c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0160  */
    /* JADX WARN: Code duplicated, block: B:94:0x0168  */
    /* JADX WARN: Code duplicated, block: B:95:0x016a  */
    /* JADX WARN: Code duplicated, block: B:96:0x016c  */
    /* JADX WARN: Code duplicated, block: B:97:0x016f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2, types: [cju, java.lang.Object] */
    protected caz ak(ccu ccuVar) {
        cju cjuVar;
        cju cjuVar2;
        caz cazVarAj;
        int i;
        int i2;
        caz cazVar;
        CryptoConfig cryptoConfigB;
        CryptoConfig cryptoConfigB2;
        String str;
        Pair pairA;
        this.ap = true;
        Object bseVar = ccuVar.b;
        bseVar.getClass();
        bse bseVar2 = (bse) bseVar;
        String str2 = bseVar2.q;
        if (str2 == null) {
            throw q(new IllegalArgumentException("Sample MIME type is null."), bseVar2, false, 4005);
        }
        if (Objects.equals(str2, "video/av01") || Objects.equals(str2, "video/x-vnd.on2.vp9") || Objects.equals(str2, "audio/eac3") || Objects.equals(str2, "audio/eac3-joc")) {
            if (!bseVar2.t.isEmpty()) {
                bsd bsdVar = new bsd(bseVar2);
                bsdVar.r = null;
                bseVar = new bse(bsdVar);
            }
        } else if (Objects.equals(str2, "video/dolby-vision")) {
            byte[] bArr = bvf.a;
            if (!Objects.equals(str2, "video/dolby-vision") || (pairA = bvf.a(bseVar2)) == null) {
                str = null;
            } else {
                int iIntValue = ((Integer) pairA.first).intValue();
                if (iIntValue == 16 || iIntValue == 32 || iIntValue == 256) {
                    str = "video/hevc";
                } else if (iIntValue == 512) {
                    str = "video/avc";
                } else if (iIntValue != 1024) {
                    str = null;
                } else {
                    str = "video/av01";
                }
            }
            if (Objects.equals(str, "video/av01")) {
                if (!bseVar2.t.isEmpty()) {
                    bsd bsdVar2 = new bsd(bseVar2);
                    bsdVar2.r = null;
                    bseVar = new bse(bsdVar2);
                }
            }
        }
        be(ccuVar.a);
        bse bseVar3 = (bse) bseVar;
        this.L = bseVar3;
        if (this.y) {
            this.ag = true;
            return null;
        }
        clk clkVar = this.u;
        if (clkVar == null) {
            this.T = null;
            aE();
            return null;
        }
        clo cloVar = this.x;
        cloVar.getClass();
        bse bseVar4 = this.v;
        bseVar4.getClass();
        cju cjuVar3 = this.N;
        cju cjuVar4 = this.O;
        if (cjuVar3 == cjuVar4) {
            cjuVar = this.O;
            cjuVar2 = this.N;
            cazVarAj = aj(cloVar, bseVar4, bseVar3, b().h);
            i = cazVarAj.d;
            if (i != 0) {
                if (i != 1) {
                    bf(bseVar3);
                    this.v = bseVar3;
                    if (cjuVar != cjuVar2) {
                        if (!bh()) {
                            i2 = 2;
                        }
                    } else if (this.z) {
                        this.aj = 1;
                        if (aR()) {
                            this.ak = 3;
                            i2 = 2;
                        } else {
                            this.ak = 1;
                        }
                    }
                } else if (i != 2) {
                    bf(bseVar3);
                    this.v = bseVar3;
                    if (cjuVar == cjuVar2 && !bh()) {
                        i2 = 2;
                    }
                } else {
                    bf(bseVar3);
                    this.ah = true;
                    this.ai = 1;
                    this.v = bseVar3;
                    if (cjuVar == cjuVar2 && !bh()) {
                        i2 = 2;
                    }
                }
                if (i != 0) {
                    return cazVarAj;
                }
                if (this.u != clkVar && this.ak != 3) {
                    return cazVarAj;
                }
                cazVar = new caz(cloVar.b, bseVar4, bseVar3, 0, i2);
            } else {
                g();
            }
            i2 = 0;
            if (i != 0) {
                return cazVarAj;
            }
            if (this.u != clkVar) {
            }
            cazVar = new caz(cloVar.b, bseVar4, bseVar3, 0, i2);
        } else {
            if (cjuVar4 != null && cjuVar3 != null && (cryptoConfigB = cjuVar4.b()) != null && (cryptoConfigB2 = cjuVar3.b()) != null && cryptoConfigB.getClass().equals(cryptoConfigB2.getClass()) && cjuVar4.e().equals(cjuVar3.e())) {
                UUID uuid = brt.e;
                if (!uuid.equals(cjuVar3.e()) && !uuid.equals(cjuVar4.e())) {
                    if (!cloVar.h) {
                        if (cjuVar4.a() != 2) {
                            if (cjuVar4.a() == 3 || cjuVar4.a() == 4) {
                                String str3 = bseVar3.q;
                                str3.getClass();
                                if (!cjuVar4.n(str3)) {
                                }
                            }
                        }
                    }
                    cjuVar = this.O;
                    cjuVar2 = this.N;
                    cazVarAj = aj(cloVar, bseVar4, bseVar3, b().h);
                    i = cazVarAj.d;
                    if (i != 0) {
                        if (i != 1) {
                            bf(bseVar3);
                            this.v = bseVar3;
                            if (cjuVar != cjuVar2) {
                                if (!bh()) {
                                    i2 = 2;
                                }
                            } else if (this.z) {
                                this.aj = 1;
                                if (aR()) {
                                    this.ak = 3;
                                    i2 = 2;
                                } else {
                                    this.ak = 1;
                                }
                            }
                        } else if (i != 2) {
                            bf(bseVar3);
                            this.v = bseVar3;
                            if (cjuVar == cjuVar2) {
                            }
                        } else {
                            bf(bseVar3);
                            this.ah = true;
                            this.ai = 1;
                            this.v = bseVar3;
                            if (cjuVar == cjuVar2) {
                            }
                        }
                        if (i != 0) {
                            return cazVarAj;
                        }
                        if (this.u != clkVar) {
                        }
                        cazVar = new caz(cloVar.b, bseVar4, bseVar3, 0, i2);
                    } else {
                        g();
                    }
                    i2 = 0;
                    if (i != 0) {
                        return cazVarAj;
                    }
                    if (this.u != clkVar) {
                    }
                    cazVar = new caz(cloVar.b, bseVar4, bseVar3, 0, i2);
                }
            }
            g();
            cazVar = new caz(cloVar.b, bseVar4, bseVar3, 0, SemanticState.Focused);
        }
        return cazVar;
    }

    protected abstract List al(clu cluVar, bse bseVar, boolean z);

    protected void am(DecoderInputBuffer decoderInputBuffer) {
        throw null;
    }

    protected void an(Exception exc) {
        throw null;
    }

    protected abstract void ao(caw cawVar);

    protected void ap(String str) {
        throw null;
    }

    protected void aq(bse bseVar, MediaFormat mediaFormat) {
        throw null;
    }

    protected void at() {
        throw null;
    }

    protected abstract boolean au(long j, long j2, clk clkVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, bse bseVar);

    protected boolean av(bse bseVar) {
        return false;
    }

    protected abstract gmj aw(clo cloVar, bse bseVar, MediaCrypto mediaCrypto, float f);

    protected void ax(String str, gmj gmjVar, long j, long j2) {
        throw null;
    }

    protected int ay(DecoderInputBuffer decoderInputBuffer) {
        return 0;
    }

    protected final long az() {
        return this.aq.i;
    }

    @Override // defpackage.cdq
    public final int c(bse bseVar) throws cbo {
        try {
            return h(this.m, bseVar);
        } catch (cly e) {
            throw q(e, bseVar, false, 4002);
        }
    }

    protected float e(float f, bse bseVar, bse[] bseVarArr) {
        throw null;
    }

    protected abstract int h(clu cluVar, bse bseVar);

    @Override // defpackage.cav, defpackage.cdq
    public final int m() {
        return 8;
    }

    @Override // defpackage.cav, defpackage.cdp
    public final long n(long j, long j2) {
        return ai(j, j2, this.Y);
    }

    protected void as() {
    }

    protected void aG(DecoderInputBuffer decoderInputBuffer) {
    }

    protected void aU(bse bseVar) {
    }

    protected void ar(long j) {
    }
}
