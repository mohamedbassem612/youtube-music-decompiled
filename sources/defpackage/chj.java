package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.decoder.DecoderInputBuffer;
import app.rive.semantics.SemanticState;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class chj extends cls implements ccz {
    private final Context H;
    private int I;
    private boolean J;
    private bse K;
    private bse L;
    private long M;
    private boolean N;
    private int O;
    private boolean P;
    private long Q;
    private long R;
    private boolean S;
    public final cgf k;
    public final AtomicBoolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final boy p;
    public final mgk q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chj(Context context, cli cliVar, clu cluVar, boolean z, Handler handler, cfx cfxVar, cgf cgfVar) {
        super(context.getApplicationContext(), 1, cliVar, cluVar, z, 0.0f);
        mgk mgkVar = Build.VERSION.SDK_INT >= 35 ? new mgk((char[]) null, (byte[]) null) : null;
        this.H = context.getApplicationContext();
        this.k = cgfVar;
        this.q = mgkVar;
        this.O = -1000;
        this.p = new boy(handler, cfxVar);
        this.l = new AtomicBoolean();
        this.Q = -9223372036854775807L;
        this.R = -9223372036854775807L;
        this.S = false;
    }

    private final int aV(bse bseVar) {
        cfl cflVarF = this.k.f(bseVar);
        if (!cflVarF.b) {
            return 0;
        }
        int i = true != cflVarF.c ? SemanticState.LiveRegion : 1536;
        return cflVarF.d ? i | SemanticState.Modal : i;
    }

    private static List aW(clu cluVar, bse bseVar, boolean z, cgf cgfVar) {
        clo cloVarJ;
        if (bseVar.q == null) {
            return agpi.a;
        }
        return (!cgfVar.H(bseVar) || (cloVarJ = cma.j()) == null) ? cma.f(cluVar, bseVar, z, false) : agke.q(cloVarJ);
    }

    private final void aX() {
        long jC = this.k.c(ag());
        if (jC != Long.MIN_VALUE) {
            if (!this.m) {
                jC = Math.max(this.M, jC);
            }
            this.M = jC;
            this.m = false;
        }
    }

    @Override // defpackage.cls, defpackage.cav, defpackage.cdm
    public void A(int i, Object obj) {
        mgk mgkVar;
        if (i == 2) {
            cgf cgfVar = this.k;
            obj.getClass();
            cgfVar.D(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            brq brqVar = (brq) obj;
            cgf cgfVar2 = this.k;
            brqVar.getClass();
            cgfVar2.p(brqVar);
            return;
        }
        if (i == 6) {
            brr brrVar = (brr) obj;
            cgf cgfVar3 = this.k;
            brrVar.getClass();
            cgfVar3.s(brrVar);
            return;
        }
        if (i == 12) {
            this.k.A((AudioDeviceInfo) obj);
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.O = ((Integer) obj).intValue();
            clk clkVar = this.u;
            if (clkVar == null || Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.O));
            clkVar.m(bundle);
            return;
        }
        if (i == 9) {
            cgf cgfVar4 = this.k;
            obj.getClass();
            cgfVar4.B(((Boolean) obj).booleanValue());
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            this.k.r(iIntValue);
            if (Build.VERSION.SDK_INT < 35 || (mgkVar = this.q) == null) {
                return;
            }
            mgkVar.g(iIntValue);
            return;
        }
        if (i == 19) {
            cgf cgfVar5 = this.k;
            obj.getClass();
            cgfVar5.C(((Integer) obj).intValue());
        } else {
            if (i != 20) {
                super.A(i, obj);
                return;
            }
            cgf cgfVar6 = this.k;
            obj.getClass();
            cgfVar6.q((cfu) obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        r2.p.h(r2.D);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        throw r0;
     */
    @Override // defpackage.cls, defpackage.cav
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void D() {
        /*
            r2 = this;
            r0 = 1
            r2.N = r0
            r0 = 0
            r2.K = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.Q = r0
            r0 = 0
            r2.o = r0
            cgf r0 = r2.k     // Catch: java.lang.Throwable -> L20
            r0.i()     // Catch: java.lang.Throwable -> L20
            super.D()     // Catch: java.lang.Throwable -> L2c
            boy r0 = r2.p
            cay r2 = r2.D
            r0.h(r2)
            return
        L20:
            r0 = move-exception
            super.D()     // Catch: java.lang.Throwable -> L2c
            boy r1 = r2.p
            cay r2 = r2.D
            r1.h(r2)
            throw r0
        L2c:
            r0 = move-exception
            boy r1 = r2.p
            cay r2 = r2.D
            r1.h(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chj.D():void");
    }

    @Override // defpackage.cls, defpackage.cav
    protected void E(boolean z, boolean z2) {
        super.E(z, z2);
        this.p.i(this.D);
        u();
        cgf cgfVar = this.k;
        cgfVar.z(v());
        cgfVar.t(p());
        cgfVar.u(new chi(this));
    }

    @Override // defpackage.cls, defpackage.cav
    protected final void G(long j, boolean z, boolean z2) {
        super.G(j, z, z2);
        this.k.i();
        this.M = j;
        this.Q = -9223372036854775807L;
        this.R = -9223372036854775807L;
        this.S = false;
        this.n = false;
        this.o = false;
        this.m = true;
    }

    @Override // defpackage.cav
    protected final void H() {
        mgk mgkVar;
        this.k.n();
        if (Build.VERSION.SDK_INT < 35 || (mgkVar = this.q) == null) {
            return;
        }
        ((HashSet) mgkVar.a).clear();
        Object obj = mgkVar.b;
        if (obj != null) {
            qe$$ExternalSyntheticApiModelOutline1.m938m(obj).close();
        }
    }

    @Override // defpackage.cls, defpackage.cav
    protected final void J() {
        this.n = false;
        this.o = false;
        this.Q = -9223372036854775807L;
        try {
            super.J();
        } finally {
            if (this.N) {
                this.N = false;
                this.k.o();
            }
        }
    }

    @Override // defpackage.cav
    protected void K() {
        this.k.l();
        this.P = true;
    }

    @Override // defpackage.cav
    protected final void L() {
        aX();
        this.P = false;
        this.k.k();
        this.o = false;
        this.R = -9223372036854775807L;
        this.S = false;
    }

    @Override // defpackage.ccz
    public final long a() {
        if (this.b == 2) {
            aX();
        }
        return this.M;
    }

    @Override // defpackage.cls, defpackage.cdp
    public final boolean ag() {
        return this.B && this.k.G();
    }

    @Override // defpackage.cls, defpackage.cdp
    public boolean ah() {
        if (this.k.F()) {
            this.R = -9223372036854775807L;
            this.S = true;
            return true;
        }
        if (this.S && this.P && Z() && !X()) {
            long jB = p().b();
            long j = this.R;
            if (j == -9223372036854775807L) {
                this.R = jB;
                return true;
            }
            if (jB - j < 100) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cls
    protected final long ai(long j, long j2, boolean z) {
        cgf cgfVar = this.k;
        boolean z2 = false;
        if (cgfVar.F() && this.Q != -9223372036854775807L) {
            z2 = true;
        }
        if (!this.P) {
            return (z2 || this.B) ? 1000000L : 10000L;
        }
        long jB = cgfVar.b();
        if (this.o && z2 && jB != -9223372036854775807L) {
            return Math.max(10000L, (long) ((Math.min(jB, this.Q - j) / (b() != null ? b().b : 1.0f)) / 2.0f));
        }
        return 10000L;
    }

    @Override // defpackage.cls
    protected final caz aj(clo cloVar, bse bseVar, bse bseVar2, boolean z) {
        int i;
        int i2;
        caz cazVarC = cloVar.c(bseVar, bseVar2);
        int i3 = cazVarC.e;
        if (aL(bseVar2)) {
            i3 |= 32768;
        }
        if (bseVar2.r > this.I) {
            i3 |= 64;
        }
        String str = cloVar.b;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = cazVarC.d;
        }
        return new caz(str, bseVar, bseVar2, i2, i);
    }

    @Override // defpackage.cls
    protected final caz ak(ccu ccuVar) {
        Object obj = ccuVar.b;
        obj.getClass();
        bse bseVar = (bse) obj;
        this.K = bseVar;
        boy boyVar = this.p;
        caz cazVarAk = super.ak(ccuVar);
        boyVar.j(bseVar, cazVarAk);
        return cazVarAk;
    }

    @Override // defpackage.cls
    protected List al(clu cluVar, bse bseVar, boolean z) {
        return cma.h(this.H, aW(cluVar, bseVar, z, this.k), bseVar);
    }

    @Override // defpackage.cls
    protected final void am(DecoderInputBuffer decoderInputBuffer) {
        bse bseVar;
        if (Build.VERSION.SDK_INT < 29 || (bseVar = decoderInputBuffer.format) == null || !Objects.equals(bseVar.q, "audio/opus") || !this.y) {
            return;
        }
        ByteBuffer byteBuffer = decoderInputBuffer.supplementalData;
        byteBuffer.getClass();
        bse bseVar2 = decoderInputBuffer.format;
        bseVar2.getClass();
        if (byteBuffer.remaining() == 8) {
            this.k.v(bseVar2.M, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // defpackage.cls
    protected final void an(Exception exc) {
        bvx.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.p.c(exc);
    }

    @Override // defpackage.cls
    protected final void ao(caw cawVar) {
        boy boyVar = this.p;
        Object obj = boyVar.b;
        if (obj != null) {
            ((Handler) obj).post(new cfv(boyVar, cawVar, 1));
        }
    }

    @Override // defpackage.cls
    protected final void ap(String str) {
        this.p.g(str);
    }

    @Override // defpackage.cls
    protected final void aq(bse bseVar, MediaFormat mediaFormat) throws cbo {
        int iP;
        int integer;
        bse bseVar2 = this.L;
        ahbo ahboVarC = null;
        if (bseVar2 != null) {
            bseVar = bseVar2;
        } else if (this.u != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(bseVar.q)) {
                iP = bseVar.L;
            } else if (mediaFormat.containsKey("pcm-encoding")) {
                iP = mediaFormat.getInteger("pcm-encoding");
            } else {
                iP = mediaFormat.containsKey("v-bits-per-sample") ? bwp.p(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            }
            int integer2 = mediaFormat.getInteger("channel-count");
            int i = bseVar.J;
            if (i == -1 || bseVar.I != integer2) {
                i = -1;
            }
            if (mediaFormat.containsKey("channel-mask") && (integer = mediaFormat.getInteger("channel-mask")) != 0 && Integer.bitCount(integer) == integer2) {
                i = integer;
            }
            bsd bsdVar = new bsd();
            bsdVar.e("audio/raw");
            bsdVar.J = iP;
            bsdVar.K = bseVar.M;
            bsdVar.L = bseVar.N;
            bsdVar.l = bseVar.m;
            Object obj = bseVar.n;
            bsdVar.a = bseVar.a;
            bsdVar.b = bseVar.b;
            bsdVar.d(bseVar.c);
            bsdVar.d = bseVar.d;
            bsdVar.e = bseVar.e;
            bsdVar.f = bseVar.f;
            bsdVar.G = integer2;
            bsdVar.H = i;
            bsdVar.I = mediaFormat.getInteger("sample-rate");
            bseVar = new bse(bsdVar);
            if (this.J) {
                ahboVarC = cwk.c(bseVar.I);
            }
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                if (!this.y || u().b == 0) {
                    this.k.w(0);
                } else {
                    this.k.w(u().b);
                }
            }
            cgf cgfVar = this.k;
            cfy cfyVar = new cfy(bseVar);
            cfyVar.b = ahboVarC;
            cfyVar.c = this.h;
            cfyVar.d = this.i;
            cgfVar.g(cfyVar.a());
            aK();
        } catch (cga e) {
            throw q(e, e.a, false, 5001);
        }
    }

    @Override // defpackage.cls
    protected final void ar(long j) {
        this.k.x(j);
    }

    @Override // defpackage.cls
    protected final void as() {
        this.k.j();
    }

    @Override // defpackage.cls
    protected final void at() throws cbo {
        try {
            this.k.m();
            if (az() != -9223372036854775807L) {
                this.Q = az();
            }
        } catch (cge e) {
            throw q(e, e.c, e.b, true != this.y ? 5002 : 5003);
        }
    }

    @Override // defpackage.cls
    protected boolean au(long j, long j2, clk clkVar, final ByteBuffer byteBuffer, int i, int i2, final int i3, final long j3, boolean z, boolean z2, bse bseVar) {
        final chj chjVar;
        byteBuffer.getClass();
        this.Q = -9223372036854775807L;
        if (this.L != null && (i2 & 2) != 0) {
            clkVar.getClass();
            clkVar.k(i, false);
            return true;
        }
        if (z) {
            if (clkVar != null) {
                clkVar.k(i, false);
            }
            this.D.f += i3;
            this.k.j();
            return true;
        }
        try {
            try {
                chjVar = this;
                try {
                    bwm bwmVar = new bwm() { // from class: chh
                        @Override // defpackage.bwm
                        public final void a() {
                            chj chjVar2 = this.a;
                            chjVar2.l.set(chjVar2.k.E(byteBuffer, j3, i3));
                        }
                    };
                    if (clkVar != null) {
                        clkVar.q(bwmVar);
                    } else {
                        bwmVar.a();
                        clkVar = null;
                    }
                    if (!chjVar.l.get()) {
                        chjVar.Q = j3;
                        return false;
                    }
                    if (clkVar != null) {
                        clkVar.k(i, false);
                    }
                    chjVar.D.e += i3;
                    return true;
                } catch (cgb e) {
                    e = e;
                    cgb cgbVar = e;
                    bse bseVar2 = chjVar.K;
                    int i4 = 5001;
                    if (chjVar.y && chjVar.u().b != 0) {
                        i4 = 5004;
                    }
                    throw chjVar.q(cgbVar, bseVar2, cgbVar.a, i4);
                } catch (cge e2) {
                    e = e2;
                    cge cgeVar = e;
                    int i5 = 5002;
                    if (chjVar.y && chjVar.u().b != 0) {
                        i5 = 5003;
                    }
                    throw chjVar.q(cgeVar, bseVar, cgeVar.b, i5);
                }
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception e4) {
                throw new IllegalStateException(e4);
            }
        } catch (cgb e5) {
            e = e5;
            chjVar = this;
        } catch (cge e6) {
            e = e6;
            chjVar = this;
        }
    }

    @Override // defpackage.cls
    protected final boolean av(bse bseVar) {
        if (u().b != 0) {
            int iAV = aV(bseVar);
            if ((iAV & SemanticState.LiveRegion) != 0 && (u().b == 2 || (iAV & SemanticState.ReadOnly) != 0 || (bseVar.M == 0 && bseVar.N == 0))) {
                return true;
            }
        }
        return this.k.H(bseVar);
    }

    @Override // defpackage.cls
    protected final gmj aw(clo cloVar, bse bseVar, MediaCrypto mediaCrypto, float f) {
        bse[] bseVarArrAb = ab();
        int length = bseVarArrAb.length;
        int iMax = bseVar.r;
        if (length != 1) {
            for (bse bseVar2 : bseVarArrAb) {
                if (cloVar.c(bseVar, bseVar2).d != 0) {
                    iMax = Math.max(iMax, bseVar2.r);
                }
            }
        }
        this.I = iMax;
        String str = cloVar.b;
        this.J = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str2 = cloVar.d;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        int i = bseVar.I;
        mediaFormat.setInteger("channel-count", i);
        int i2 = bseVar.K;
        mediaFormat.setInteger("sample-rate", i2);
        atv.i(mediaFormat, bseVar.t);
        atv.h(mediaFormat, "max-input-size", iMax);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        String str3 = bseVar.q;
        if ("audio/ac4".equals(str3)) {
            Pair pairA = bvf.a(bseVar);
            if (pairA != null) {
                atv.h(mediaFormat, "profile", ((Integer) pairA.first).intValue());
                atv.h(mediaFormat, "level", ((Integer) pairA.second).intValue());
            }
            if (Build.VERSION.SDK_INT <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        cgf cgfVar = this.k;
        if (cgfVar.a(bwp.J(4, i, i2)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (Build.VERSION.SDK_INT >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.O));
        }
        if (Objects.equals(str3, "audio/iamf")) {
            cff cffVarE = cgfVar.e();
            int i3 = 12;
            if (cffVarE == null) {
                bvx.e("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                mediaFormat.setInteger("channel-mask", 12);
                mediaFormat.setInteger("max-output-channel-count", 2);
            } else {
                int iA = chg.a(cffVarE.d);
                if (iA != 0) {
                    i3 = iA;
                } else {
                    int iA2 = chg.a(cffVarE.c);
                    if (iA2 != 0) {
                        i3 = iA2;
                    }
                }
                int iBitCount = Integer.bitCount(i3);
                mediaFormat.setInteger("channel-mask", i3);
                mediaFormat.setInteger("max-output-channel-count", iBitCount);
            }
        }
        aD(mediaFormat);
        bse bseVar3 = null;
        if ("audio/raw".equals(cloVar.c) && !"audio/raw".equals(str3)) {
            bseVar3 = bseVar;
        }
        this.L = bseVar3;
        return new gmj(cloVar, mediaFormat, bseVar, (Surface) null, mediaCrypto, this.q);
    }

    @Override // defpackage.cls
    protected void ax(String str, gmj gmjVar, long j, long j2) {
        this.p.f(str, j, j2);
    }

    @Override // defpackage.ccz
    public final btb b() {
        return this.k.d();
    }

    @Override // defpackage.cls
    protected final float e(float f, bse bseVar, bse[] bseVarArr) {
        int integer = -1;
        for (bse bseVar2 : bseVarArr) {
            int i = bseVar2.K;
            if (i != -1) {
                integer = Math.max(integer, i);
            }
        }
        if (integer == -1) {
            MediaFormat mediaFormat = this.w;
            integer = (mediaFormat == null || !mediaFormat.containsKey("sample-rate")) ? -1 : mediaFormat.getInteger("sample-rate");
        }
        if (integer == -1) {
            return -1.0f;
        }
        return integer * f;
    }

    @Override // defpackage.cdp, defpackage.cdq
    public final String f() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.ccz
    public final void gb(btb btbVar) {
        this.k.y(btbVar);
    }

    @Override // defpackage.ccz
    public final boolean gc() {
        boolean z = this.n;
        this.n = false;
        return z;
    }

    @Override // defpackage.cls
    protected final int h(clu cluVar, bse bseVar) {
        int iAV;
        boolean z;
        String str = bseVar.q;
        boolean zI = bsy.i(str);
        int i = SemanticState.Focused;
        if (!zI) {
            return SemanticState.Focused;
        }
        int i2 = bseVar.S;
        boolean zAS = aS(bseVar);
        if (!zAS || (i2 != 0 && cma.j() == null)) {
            iAV = 0;
        } else {
            iAV = aV(bseVar);
            if (this.k.H(bseVar)) {
                return iAV | 172;
            }
        }
        if (!"audio/raw".equals(str) || this.k.H(bseVar)) {
            cgf cgfVar = this.k;
            if (cgfVar.H(bwp.J(2, bseVar.I, bseVar.K))) {
                List listAW = aW(cluVar, bseVar, false, cgfVar);
                if (!listAW.isEmpty()) {
                    if (!zAS) {
                        return 130;
                    }
                    clo cloVar = (clo) listAW.get(0);
                    Context context = this.H;
                    boolean zF = cloVar.f(context, bseVar);
                    if (!zF) {
                        int i3 = 1;
                        while (true) {
                            if (i3 >= ((agpi) listAW).d) {
                                z = true;
                                break;
                            }
                            clo cloVar2 = (clo) listAW.get(i3);
                            if (cloVar2.f(context, bseVar)) {
                                z = false;
                                zF = true;
                                cloVar = cloVar2;
                                break;
                            }
                            i3++;
                        }
                    } else {
                        z = true;
                        break;
                    }
                    int i4 = true != zF ? 3 : 4;
                    int i5 = 8;
                    if (zF && cloVar.i(bseVar)) {
                        i5 = 16;
                    }
                    int i6 = true != cloVar.i ? 0 : 64;
                    if (true != z) {
                        i = 0;
                    }
                    return i4 | i5 | 32 | i6 | i | iAV;
                }
            }
        }
        return 129;
    }

    @Override // defpackage.cav, defpackage.cdp
    public final ccz s() {
        return this;
    }
}
