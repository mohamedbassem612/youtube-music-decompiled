package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.decoder.DecoderInputBuffer;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.MoreExecutors;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ctb extends cls implements cto {
    private static final int[] n = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean o;
    private static boolean p;
    private final boolean H;
    private final int I;
    private final boolean J;
    private final ctn K;
    private final csw L;
    private final cso M;
    private final long N;
    private final ctq O;
    private final PriorityQueue P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private cuc U;
    private boolean V;
    private int W;
    private List X;
    private ctd Y;
    private bwc Z;
    private boolean aa;
    private int ab;
    private int ac;
    private long ad;
    private int ae;
    private int af;
    private int ag;
    private cdu ah;
    private long ai;
    private boolean aj;
    private long ak;
    private int al;
    private btz am;
    private int an;
    private int ao;
    private ctm ap;
    private long aq;
    private boolean ar;
    private int as;
    private long at;
    private aamu au;
    private final pj av;
    public final ctp k;
    public Surface l;
    public btz m;
    private final Context q;

    public ctb(cta ctaVar) {
        super(ctaVar.a.getApplicationContext(), 2, ctaVar.d, ctaVar.c, ctaVar.f, ctaVar.j);
        Context applicationContext = ctaVar.a.getApplicationContext();
        this.q = applicationContext;
        this.I = ctaVar.i;
        this.U = null;
        this.av = new pj(ctaVar.g, ctaVar.h);
        int i = 1;
        this.H = this.U == null;
        ctp ctpVar = new ctp(applicationContext, this, ctaVar.e);
        this.k = ctpVar;
        ctpVar.a = ctaVar.l;
        this.K = new ctn();
        this.L = new csw(new juo(this, i));
        int i2 = bst.a;
        this.J = "NVIDIA".equals(Build.MANUFACTURER);
        this.Z = bwc.a;
        this.ab = 1;
        this.ac = 0;
        this.m = btz.a;
        this.ao = 0;
        this.am = null;
        this.an = -1000;
        this.aq = -9223372036854775807L;
        this.M = new cso();
        this.P = new PriorityQueue();
        this.N = -ctaVar.k;
        this.O = new ctq();
        this.at = -9223372036854775807L;
        this.ah = null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(clo cloVar, bse bseVar) {
        int i = bseVar.w;
        int i2 = bseVar.x;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        String str = bseVar.q;
        str.getClass();
        if ("video/dolby-vision".equals(str)) {
            Pair pairA = bvf.a(bseVar);
            if (pairA == null) {
                str = "video/hevc";
            } else {
                int iIntValue = ((Integer) pairA.first).intValue();
                if (iIntValue == 512 || iIntValue == 1 || iIntValue == 2) {
                    str = "video/avc";
                } else if (iIntValue == 1024) {
                    str = "video/av01";
                } else {
                    str = "video/hevc";
                }
            }
        }
        int i3 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (!str.equals("video/3gpp")) {
                    return -1;
                }
                break;
            case -1662735862:
                if (!str.equals("video/av01")) {
                    return -1;
                }
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    return Math.max(2097152, ((i * i2) * 3) / 4);
                }
                return -1;
            case 1187890754:
                if (!str.equals("video/mp4v-es")) {
                    return -1;
                }
                break;
            case 1331836730:
                if (!str.equals("video/avc")) {
                    return -1;
                }
                int i4 = bst.a;
                if ("BRAVIA 4K 2015".equals(Build.MODEL)) {
                    return -1;
                }
                if ("Amazon".equals(Build.MANUFACTURER)) {
                    if ("KFSOWI".equals(Build.MODEL)) {
                        return -1;
                    }
                    if ("AFTS".equals(Build.MODEL) && cloVar.h) {
                        return -1;
                    }
                }
                int i5 = bwp.a;
                return ((((i + 15) / 16) * ((i2 + 15) / 16)) * 768) / 4;
            case 1599127256:
                if (!str.equals("video/x-vnd.on2.vp8")) {
                    return -1;
                }
                break;
            case 1599127257:
                if (!str.equals("video/x-vnd.on2.vp9")) {
                    return -1;
                }
                i3 = 8;
                break;
                break;
            default:
                return -1;
        }
        return ((i * i2) * 3) / i3;
    }

    protected static int b(clo cloVar, bse bseVar) {
        int i = bseVar.r;
        if (i == -1) {
            return a(cloVar, bseVar);
        }
        List list = bseVar.t;
        int size = list.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += ((byte[]) list.get(i2)).length;
        }
        return i + length;
    }

    private final Surface bn(clo cloVar) {
        cuc cucVar = this.U;
        if (cucVar != null) {
            return cucVar.a();
        }
        Surface surface = this.l;
        if (surface == null) {
            if (bi(cloVar)) {
                return null;
            }
            ahno.O(bj(cloVar));
            ctd ctdVar = this.Y;
            if (ctdVar != null) {
                if (ctdVar.a != cloVar.h) {
                    bs();
                }
            }
            surface = this.Y;
            if (surface == null) {
                ctd ctdVarB = ctd.b(cloVar.h);
                this.Y = ctdVarB;
                return ctdVarB;
            }
        }
        return surface;
    }

    private static List bo(Context context, clu cluVar, bse bseVar, boolean z, boolean z2) {
        String str = bseVar.q;
        if (str == null) {
            return agpi.a;
        }
        if (str.equals("video/dolby-vision") && !azq.d(context)) {
            List listD = cma.d(context, cluVar, bseVar, z, z2);
            if (listD.isEmpty()) {
                listD = cma.c(cluVar, bseVar, z, z2);
            }
            if (!listD.isEmpty()) {
                return listD;
            }
        }
        return str.equals("video/dolby-vision") ? cma.g(context, cluVar, bseVar, z, z2) : cma.f(cluVar, bseVar, z, z2);
    }

    private final void bp() {
        if (this.ae > 0) {
            long jB = p().b();
            this.av.F(this.ae, jB - this.ad);
            this.ae = 0;
            this.ad = jB;
        }
    }

    private final void bq() {
        btz btzVar = this.am;
        if (btzVar != null) {
            this.av.L(btzVar);
        }
    }

    private final void br(long j, long j2, bse bseVar) {
        ctm ctmVar = this.ap;
        if (ctmVar != null) {
            ctmVar.c(j, j2, bseVar, this.w);
        }
    }

    private final void bs() {
        ctd ctdVar = this.Y;
        if (ctdVar != null) {
            ctdVar.release();
            this.Y = null;
        }
    }

    private final void bt(Object obj) {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.l == surface) {
            if (surface != null) {
                bq();
                Surface surface2 = this.l;
                if (surface2 == null || !this.aa) {
                    return;
                }
                this.av.I(surface2);
                return;
            }
            return;
        }
        this.l = surface;
        if (this.U == null) {
            this.k.j(surface);
        }
        boolean z = false;
        this.aa = false;
        int i = this.b;
        clk clkVar = this.u;
        if (clkVar != null) {
            if (this.U == null) {
                clo cloVar = this.x;
                cloVar.getClass();
                if (!bb(cloVar) || this.Q) {
                    aH();
                    aE();
                } else {
                    Surface surfaceBn = bn(cloVar);
                    if (surfaceBn != null) {
                        aW(clkVar, surfaceBn);
                    } else {
                        if (Build.VERSION.SDK_INT < 35) {
                            throw new IllegalStateException();
                        }
                        clkVar.g();
                    }
                    z = true;
                }
            } else {
                z = true;
            }
        }
        if (surface != null) {
            bq();
        } else {
            this.am = null;
            cuc cucVar = this.U;
            if (cucVar != null) {
                cucVar.c();
            }
        }
        if (i == 2) {
            cuc cucVar2 = this.U;
            if (cucVar2 != null) {
                cucVar2.e(z);
            } else {
                this.k.d(z);
            }
        }
    }

    private final boolean bu(DecoderInputBuffer decoderInputBuffer) {
        return decoderInputBuffer.timeUs < this.e;
    }

    private final boolean bv(DecoderInputBuffer decoderInputBuffer) {
        if (X() || decoderInputBuffer.isLastSample() || this.j == -9223372036854775807L) {
            return true;
        }
        return this.j - (decoderInputBuffer.timeUs - aA()) <= 100000;
    }

    @Override // defpackage.cls, defpackage.cav, defpackage.cdm
    public void A(int i, Object obj) {
        if (i == 1) {
            bt(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            ctm ctmVar = (ctm) obj;
            this.ap = ctmVar;
            cuc cucVar = this.U;
            if (cucVar != null) {
                cucVar.o(ctmVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.ao != iIntValue) {
                this.ao = iIntValue;
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.ab = iIntValue2;
            clk clkVar = this.u;
            if (clkVar != null) {
                clkVar.n(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.ac = iIntValue3;
            cuc cucVar2 = this.U;
            if (cucVar2 != null) {
                cucVar2.j(iIntValue3);
                return;
            } else {
                this.k.i(iIntValue3);
                return;
            }
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(btx.a)) {
                cuc cucVar3 = this.U;
                if (cucVar3 == null || !cucVar3.t()) {
                    return;
                }
                cucVar3.f();
                return;
            }
            this.X = list;
            cuc cucVar4 = this.U;
            if (cucVar4 != null) {
                cucVar4.n(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            bwc bwcVar = (bwc) obj;
            if (bwcVar.b == 0 || bwcVar.c == 0) {
                return;
            }
            this.Z = bwcVar;
            cuc cucVar5 = this.U;
            if (cucVar5 != null) {
                Surface surface = this.l;
                surface.getClass();
                cucVar5.l(surface, bwcVar);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.an = ((Integer) obj).intValue();
                clk clkVar2 = this.u;
                if (clkVar2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.an));
                    clkVar2.m(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.l;
                bt(null);
                obj.getClass();
                ((ctb) obj).A(1, surface2);
                break;
            case 18:
                boolean z = this.ah != null;
                cdu cduVar = (cdu) obj;
                this.ah = cduVar;
                if (z != (cduVar != null)) {
                    aK();
                }
                break;
            default:
                super.A(i, obj);
                break;
        }
    }

    @Override // defpackage.cls, defpackage.cav
    protected final void D() {
        this.am = null;
        this.aa = false;
        this.aj = aO();
        this.at = -9223372036854775807L;
        try {
            super.D();
        } finally {
            pj pjVar = this.av;
            pjVar.E(this.D);
            pjVar.L(btz.a);
        }
    }

    @Override // defpackage.cls, defpackage.cav
    protected void E(boolean z, boolean z2) {
        cuc cucVar;
        super.E(z, z2);
        u();
        this.av.G(this.D);
        if (!this.V) {
            if (this.X != null && this.U == null) {
                ctf ctfVar = new ctf(this.q, this.k);
                ctfVar.c = true;
                ctfVar.f = -this.N;
                ctfVar.d = p();
                ahno.O(!ctfVar.e);
                if (ctfVar.h == null) {
                    ctfVar.h = new zs((char[]) null);
                }
                cti ctiVar = new cti(ctfVar);
                ctfVar.e = true;
                ctiVar.q = 1;
                SparseArray sparseArray = ctiVar.c;
                if (bwp.X(sparseArray, 0)) {
                    cucVar = (cuc) sparseArray.get(0);
                } else {
                    ctg ctgVar = new ctg(ctiVar, ctiVar.b);
                    ctiVar.g.add(ctgVar);
                    sparseArray.put(0, ctgVar);
                    cucVar = ctgVar;
                }
                this.U = cucVar;
            }
            this.V = true;
        }
        int i = !z2 ? 1 : 0;
        cuc cucVar2 = this.U;
        if (cucVar2 == null) {
            ctp ctpVar = this.k;
            ctpVar.b = p();
            ctpVar.g(i);
            return;
        }
        cucVar2.k(new csy(this), MoreExecutors.directExecutor());
        ctm ctmVar = this.ap;
        if (ctmVar != null) {
            this.U.o(ctmVar);
        }
        if (this.l != null && !this.Z.equals(bwc.a)) {
            this.U.l(this.l, this.Z);
        }
        this.U.j(this.ac);
        this.U.m(this.t);
        List list = this.X;
        if (list != null) {
            this.U.n(list);
        }
        this.W = i;
    }

    @Override // defpackage.cls, defpackage.cav
    protected void G(long j, boolean z, boolean z2) {
        cuc cucVar = this.U;
        if (cucVar != null && !z) {
            cucVar.d(true);
        }
        if (z2) {
            this.ai = j;
        }
        super.G(j, z, z2);
        if (this.U == null) {
            this.k.h();
        }
        ctq ctqVar = this.O;
        if (ctqVar != null) {
            ctqVar.c();
        }
        if (z) {
            cuc cucVar2 = this.U;
            if (cucVar2 != null) {
                cucVar2.e(false);
            } else {
                this.k.d(false);
            }
        }
        this.af = 0;
        this.at = -9223372036854775807L;
    }

    @Override // defpackage.cav
    protected final void H() {
        cuc cucVar = this.U;
        if (cucVar == null || !this.H) {
            return;
        }
        cucVar.g();
    }

    @Override // defpackage.cls, defpackage.cav
    protected final void J() {
        try {
            super.J();
        } finally {
            this.V = false;
            this.aq = -9223372036854775807L;
            this.at = -9223372036854775807L;
            this.T = false;
            bs();
        }
    }

    @Override // defpackage.cav
    protected void K() {
        this.ae = 0;
        this.ad = p().b();
        this.ak = 0L;
        this.al = 0;
        cuc cucVar = this.U;
        if (cucVar != null) {
            cucVar.q();
        } else {
            this.k.e();
        }
    }

    @Override // defpackage.cav
    protected final void L() {
        bp();
        int i = this.al;
        if (i != 0) {
            this.av.J(this.ak, i);
            this.ak = 0L;
            this.al = 0;
        }
        cuc cucVar = this.U;
        if (cucVar != null) {
            cucVar.r();
        } else {
            this.k.f();
        }
        ctq ctqVar = this.O;
        if (ctqVar != null) {
            ctqVar.c();
        }
    }

    @Override // defpackage.cls, defpackage.cav
    protected void M(bse[] bseVarArr, long j, long j2, cnm cnmVar) {
        super.M(bseVarArr, j, j2, cnmVar);
        ctq ctqVar = this.O;
        if (ctqVar != null) {
            ctqVar.c();
        }
    }

    @Override // defpackage.cls, defpackage.cav, defpackage.cdp
    public final void T(float f, float f2) {
        super.T(f, f2);
        cuc cucVar = this.U;
        if (cucVar != null) {
            cucVar.m(f);
        } else {
            this.k.k(f);
        }
        ctq ctqVar = this.O;
        if (ctqVar != null) {
            ctqVar.d(f);
        }
    }

    @Override // defpackage.cls
    protected final clm aC(Throwable th, clo cloVar) {
        return new csx(th, cloVar, this.l);
    }

    @Override // defpackage.cls
    protected void aF(long j) {
        super.aF(j);
        this.ag--;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    @Override // defpackage.cls
    protected void aG(DecoderInputBuffer decoderInputBuffer) {
        bru bruVar;
        clo cloVar = this.x;
        cloVar.getClass();
        ByteBuffer byteBuffer = decoderInputBuffer.data;
        if (byteBuffer != null) {
            String str = cloVar.c;
            boolean zEquals = str.equals("video/av01");
            if (!byteBuffer.isReadOnly()) {
                bse bseVar = this.v;
                boolean z = (bseVar == null || (bruVar = bseVar.G) == null || bruVar.f <= 8) ? false : true;
                boolean zEquals2 = str.equals("video/hevc");
                if (this.T) {
                    if (zEquals) {
                        azq.e(byteBuffer, false);
                        if (decoderInputBuffer.isKeyFrame()) {
                            this.M.b(byteBuffer);
                        }
                    } else if (zEquals2) {
                        azy.l(byteBuffer, false);
                    }
                } else if (z && this.R) {
                    if (zEquals) {
                        azq.e(byteBuffer, true);
                        if (decoderInputBuffer.isKeyFrame()) {
                            this.M.b(byteBuffer);
                        }
                    } else if (zEquals2) {
                        azy.l(byteBuffer, true);
                    }
                } else if (Build.VERSION.SDK_INT < 37 || !z) {
                    if (zEquals) {
                        if (decoderInputBuffer.isKeyFrame()) {
                            this.M.b(byteBuffer);
                        }
                    }
                } else if (zEquals) {
                    byte[] bArrF = azq.f(byteBuffer);
                    if (bArrF != null) {
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr-st2094-50-info", bArrF);
                        clk clkVar = this.u;
                        clkVar.getClass();
                        clkVar.m(bundle);
                    }
                    if (decoderInputBuffer.isKeyFrame()) {
                        this.M.b(byteBuffer);
                    }
                }
            } else if (zEquals) {
                if (decoderInputBuffer.isKeyFrame()) {
                    this.M.b(byteBuffer);
                }
            }
        }
        this.as = 0;
        int iAy = ay(decoderInputBuffer);
        if (Build.VERSION.SDK_INT < 34 || (iAy & 32) == 0) {
            this.ag++;
        }
    }

    @Override // defpackage.cls
    protected final void aI() {
        super.aI();
        this.P.clear();
        this.ag = 0;
        this.as = 0;
        this.aj = false;
        this.at = -9223372036854775807L;
        this.M.c();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:40:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0092  */
    @Override // defpackage.cls
    protected boolean aN(DecoderInputBuffer decoderInputBuffer) {
        boolean z;
        ByteBuffer byteBuffer;
        boolean z2 = false;
        if (!bv(decoderInputBuffer)) {
            boolean zBu = bu(decoderInputBuffer);
            ctq ctqVar = this.O;
            if (ctqVar != null) {
                long jA = ctqVar.a(decoderInputBuffer.timeUs);
                if (jA == -9223372036854775807L || jA >= this.N) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if ((zBu || z) && !decoderInputBuffer.hasSupplementalData()) {
                if (decoderInputBuffer.notDependedOn()) {
                    decoderInputBuffer.clear();
                } else {
                    clo cloVar = this.x;
                    cloVar.getClass();
                    if (cloVar.c.equals("video/av01") && (byteBuffer = decoderInputBuffer.data) != null) {
                        boolean z3 = zBu || this.as <= 0;
                        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                        byteBufferAsReadOnlyBuffer.flip();
                        int iA = this.M.a(byteBufferAsReadOnlyBuffer, z3);
                        if (iA == 0) {
                            decoderInputBuffer.clear();
                        } else if (iA != byteBufferAsReadOnlyBuffer.limit()) {
                            aamu aamuVar = this.au;
                            aamuVar.getClass();
                            if (aamuVar.a + iA < byteBufferAsReadOnlyBuffer.capacity() && !decoderInputBuffer.isEncrypted()) {
                                ByteBuffer byteBuffer2 = decoderInputBuffer.data;
                                byteBuffer2.getClass();
                                byteBuffer2.position(iA);
                            }
                        }
                    }
                    if (z2) {
                        if (!zBu) {
                            this.as++;
                        }
                        this.P.add(Long.valueOf(decoderInputBuffer.timeUs));
                    }
                }
                z2 = true;
                if (z2) {
                    if (!zBu) {
                        this.as++;
                    }
                    this.P.add(Long.valueOf(decoderInputBuffer.timeUs));
                }
            }
        }
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    @Override // defpackage.cls
    protected final boolean aO() {
        boolean z;
        if (!this.z) {
            return false;
        }
        bse bseVar = this.v;
        long j = this.j;
        if (j != -9223372036854775807L) {
            if (this.F + 1 + j <= Long.MAX_VALUE - (aA() + j)) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        return this.ah == null || this.aj || (bseVar != null && bseVar.s > 0) || z || az() != -9223372036854775807L;
    }

    @Override // defpackage.cls
    protected boolean aP(clo cloVar) {
        return bb(cloVar);
    }

    @Override // defpackage.cls
    protected final boolean aQ() {
        return this.U != null;
    }

    @Override // defpackage.cls
    protected final boolean aR() {
        clo cloVar = this.x;
        if (this.U != null && cloVar != null) {
            int i = bst.a;
            String str = cloVar.b;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder") || str.equals("c2.mtk.vp9.decoder")) {
                return true;
            }
        }
        return super.aR();
    }

    @Override // defpackage.cls
    protected final void aU(bse bseVar) throws cbo {
        cuc cucVar = this.U;
        if (cucVar == null || cucVar.t()) {
            return;
        }
        try {
            cucVar.x(bseVar);
        } catch (cub e) {
            throw q(e, bseVar, false, 7000);
        }
    }

    protected void aV(clk clkVar, int i, long j, long j2) {
        clkVar.j(i, j2);
        this.D.e++;
        this.af = 0;
        if (this.U == null) {
            btz btzVar = this.m;
            if (!btzVar.equals(btz.a) && !btzVar.equals(this.am)) {
                this.am = btzVar;
                this.av.L(btzVar);
            }
            if (!this.k.o() || this.l == null) {
                return;
            }
            g();
        }
    }

    protected void aW(clk clkVar, Surface surface) {
        clkVar.l(surface);
    }

    protected void aX(clk clkVar, int i, long j) {
        clkVar.k(i, false);
        this.D.f++;
    }

    protected final void aY(int i, int i2) {
        cay cayVar = this.D;
        cayVar.h += i;
        int i3 = i + i2;
        cayVar.g += i3;
        this.ae += i3;
        int i4 = this.af + i3;
        this.af = i4;
        cayVar.i = Math.max(i4, cayVar.i);
        int i5 = this.I;
        if (i5 <= 0 || this.ae < i5) {
            return;
        }
        bp();
    }

    protected final void aZ(long j) {
        this.D.b(j);
        this.ak += j;
        this.al++;
    }

    @Override // defpackage.cav, defpackage.cdp
    public final boolean aa(long j) {
        if (this.A == -9223372036854775807L || j < this.ai) {
            return false;
        }
        long j2 = this.E;
        return j2 == -9223372036854775807L || j > j2;
    }

    @Override // defpackage.cls, defpackage.cdp
    public void af(long j, long j2) throws cbo {
        cuc cucVar = this.U;
        if (cucVar != null) {
            try {
                cucVar.h(j, j2);
            } catch (cub e) {
                throw q(e, e.a, false, 7001);
            }
        }
        super.af(j, j2);
    }

    @Override // defpackage.cls, defpackage.cdp
    public boolean ag() {
        if (!this.B) {
            return false;
        }
        cuc cucVar = this.U;
        return cucVar == null || cucVar.s();
    }

    @Override // defpackage.cls, defpackage.cdp
    public boolean ah() {
        boolean zAM = aM();
        cuc cucVar = this.U;
        if (cucVar != null) {
            return cucVar.u(zAM);
        }
        if (zAM && this.u == null) {
            return true;
        }
        return this.k.n(zAM);
    }

    @Override // defpackage.cls
    protected final long ai(long j, long j2, boolean z) {
        if (!bsc.c(7) || !z) {
            return aub.f(this);
        }
        if (this.b != 2) {
            return (ah() || ag()) ? 1000000L : 10000L;
        }
        if (this.at == -9223372036854775807L || this.U != null) {
            return 10000L;
        }
        if (ag()) {
            return Math.max(10000L, (long) (((this.at - j) / this.t) / 2.0f));
        }
        ctp ctpVar = this.k;
        long j3 = this.at;
        long jAB = aB();
        csw cswVar = this.L;
        ctn ctnVar = this.K;
        if (ctpVar.b(j3, j, j2, jAB, cswVar.a(), cswVar.a, ctnVar) == 5) {
            return Math.max(0L, (ctnVar.a + (bwp.y(p().b()) - j2)) - 25000);
        }
        return 0L;
    }

    @Override // defpackage.cls
    protected caz aj(clo cloVar, bse bseVar, bse bseVar2, boolean z) {
        int i;
        int i2;
        caz cazVarC = cloVar.c(bseVar, bseVar2);
        int i3 = cazVarC.e;
        aamu aamuVar = this.au;
        aamuVar.getClass();
        if (bseVar2.w > aamuVar.c || bseVar2.x > aamuVar.b) {
            i3 |= SemanticState.Hidden;
        }
        if (b(cloVar, bseVar2) > aamuVar.a) {
            i3 |= 64;
        }
        if (this.ac != Integer.MIN_VALUE && Build.VERSION.SDK_INT < 31 && (Build.VERSION.SDK_INT != 30 || Build.MODEL.startsWith("MiTV"))) {
            float f = bseVar.A;
            if (f != -1.0f) {
                float f2 = bseVar2.A;
                if (f2 != -1.0f && (!cloVar.h || !z)) {
                    float fMax = Math.max(f2, f) / Math.min(f2, f);
                    if (Math.abs(fMax - Math.round(fMax)) > 0.01f) {
                        i3 |= 65536;
                    }
                }
            }
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
        caz cazVarAk = super.ak(ccuVar);
        this.T = false;
        Object obj = ccuVar.b;
        obj.getClass();
        this.av.H((bse) obj, cazVarAk);
        ctq ctqVar = this.O;
        if (ctqVar != null) {
            ctqVar.c();
        }
        return cazVarAk;
    }

    @Override // defpackage.cls
    protected List al(clu cluVar, bse bseVar, boolean z) {
        Context context = this.q;
        return cma.h(context, bo(context, cluVar, bseVar, z, false), bseVar);
    }

    @Override // defpackage.cls
    protected void am(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer = decoderInputBuffer.supplementalData;
        if (byteBuffer == null || byteBuffer.remaining() < 7) {
            return;
        }
        byte b = byteBuffer.get();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        byteBuffer.position(0);
        if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && (b3 == 0 || b3 == 1)) {
            if (this.S) {
                byte[] bArr = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr);
                byteBuffer.position(0);
                clk clkVar = this.u;
                clkVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putByteArray("hdr10-plus-info", bArr);
                clkVar.m(bundle);
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT < 37 || !bvf.h(byteBuffer)) {
            return;
        }
        byteBuffer.position(bvf.b);
        int iRemaining = byteBuffer.remaining();
        byte[] bArr2 = new byte[iRemaining];
        byteBuffer.get(bArr2);
        byteBuffer.position(0);
        boolean z = iRemaining > 0;
        this.T = z;
        if (z) {
            Bundle bundle2 = new Bundle();
            bundle2.putByteArray("hdr-st2094-50-info", bArr2);
            clk clkVar2 = this.u;
            clkVar2.getClass();
            clkVar2.m(bundle2);
        }
    }

    @Override // defpackage.cls
    protected final void an(Exception exc) {
        bvx.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.av.K(exc);
    }

    @Override // defpackage.cls
    protected final void ao(caw cawVar) {
        pj pjVar = this.av;
        Object obj = pjVar.a;
        if (obj != null) {
            ((Handler) obj).post(new cfv(pjVar, cawVar, 20));
        }
    }

    @Override // defpackage.cls
    protected final void ap(String str) {
        this.av.D(str);
    }

    @Override // defpackage.cls
    protected void aq(bse bseVar, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        clk clkVar = this.u;
        if (clkVar != null) {
            clkVar.n(this.ab);
        }
        mediaFormat.getClass();
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
            integer2 = mediaFormat.getInteger("height");
        }
        float f = bseVar.D;
        int i = bseVar.B;
        if (i == 90 || i == 270) {
            f = 1.0f / f;
            int i2 = integer2;
            integer2 = integer;
            integer = i2;
        }
        this.m = new btz(integer, integer2, f);
        cuc cucVar = this.U;
        if (cucVar == null || !this.ar) {
            this.L.b(bseVar.A);
        } else {
            if (integer <= 0 || integer2 <= 0) {
                return;
            }
            bsd bsdVar = new bsd(bseVar);
            bsdVar.u = integer;
            bsdVar.v = integer2;
            bsdVar.B = f;
            bse bseVar2 = new bse(bsdVar);
            int i3 = this.W;
            List list = this.X;
            if (list == null) {
                list = agpi.a;
            }
            cucVar.v(bseVar2, aB(), i3, list);
            this.W = 2;
        }
        this.ar = false;
    }

    @Override // defpackage.cls
    protected void as() {
        cuc cucVar = this.U;
        if (cucVar != null) {
            cucVar.p();
            if (this.aq == -9223372036854775807L) {
                this.aq = aB();
            }
            this.U.i(d());
        } else {
            this.k.g(2);
        }
        this.ar = true;
    }

    @Override // defpackage.cls
    protected final void at() {
        cuc cucVar = this.U;
        if (cucVar != null) {
            cucVar.p();
        } else if (az() != -9223372036854775807L) {
            this.at = az();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (r20.ar == false) goto L22;
     */
    @Override // defpackage.cls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean au(long r21, long r23, defpackage.clk r25, java.nio.ByteBuffer r26, int r27, int r28, int r29, long r30, boolean r32, boolean r33, defpackage.bse r34) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctb.au(long, long, clk, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, bse):boolean");
    }

    @Override // defpackage.cls
    protected final gmj aw(clo cloVar, bse bseVar, MediaCrypto mediaCrypto, float f) {
        this.au = bl(cloVar, bseVar, ab());
        MediaFormat mediaFormatBm = bm(bseVar, cloVar.d, this.au, f, this.J);
        Surface surfaceBn = bn(cloVar);
        if (this.U != null && !bwp.ac(this.q)) {
            mediaFormatBm.setInteger("allow-frame-drop", 0);
        }
        return new gmj(cloVar, mediaFormatBm, bseVar, surfaceBn, mediaCrypto, (mgk) null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x003d  */
    @Override // defpackage.cls
    protected void ax(String str, gmj gmjVar, long j, long j2) {
        this.av.C(str, j, j2);
        this.Q = ba(str);
        clo cloVar = this.x;
        cloVar.getClass();
        this.S = cloVar.g();
        boolean z = false;
        if (Build.VERSION.SDK_INT < 37) {
            clo cloVar2 = this.x;
            cloVar2.getClass();
            if (cloVar2.c.equals("video/av01")) {
                z = true;
            } else {
                clo cloVar3 = this.x;
                cloVar3.getClass();
                if (cloVar3.c.equals("video/hevc")) {
                    z = true;
                }
            }
        }
        this.R = z;
    }

    @Override // defpackage.cls
    protected final int ay(DecoderInputBuffer decoderInputBuffer) {
        return (Build.VERSION.SDK_INT < 34 || (!bsc.c(6) && this.ah == null) || !bu(decoderInputBuffer) || bv(decoderInputBuffer)) ? 0 : 32;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0139  */
    /* JADX WARN: Code duplicated, block: B:103:0x0143  */
    /* JADX WARN: Code duplicated, block: B:106:0x014d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0157  */
    /* JADX WARN: Code duplicated, block: B:112:0x0161  */
    /* JADX WARN: Code duplicated, block: B:115:0x016b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0175  */
    /* JADX WARN: Code duplicated, block: B:121:0x017f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0189  */
    /* JADX WARN: Code duplicated, block: B:127:0x0193  */
    /* JADX WARN: Code duplicated, block: B:130:0x019d  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:139:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:142:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:145:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:154:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:157:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:160:0x0201  */
    /* JADX WARN: Code duplicated, block: B:163:0x020b  */
    /* JADX WARN: Code duplicated, block: B:166:0x0215  */
    /* JADX WARN: Code duplicated, block: B:169:0x021f  */
    /* JADX WARN: Code duplicated, block: B:172:0x0229  */
    /* JADX WARN: Code duplicated, block: B:175:0x0233  */
    /* JADX WARN: Code duplicated, block: B:178:0x023d  */
    /* JADX WARN: Code duplicated, block: B:181:0x0247  */
    /* JADX WARN: Code duplicated, block: B:184:0x0251  */
    /* JADX WARN: Code duplicated, block: B:187:0x025b  */
    /* JADX WARN: Code duplicated, block: B:190:0x0265  */
    /* JADX WARN: Code duplicated, block: B:193:0x026f  */
    /* JADX WARN: Code duplicated, block: B:196:0x0279  */
    /* JADX WARN: Code duplicated, block: B:199:0x0283  */
    /* JADX WARN: Code duplicated, block: B:202:0x028d  */
    /* JADX WARN: Code duplicated, block: B:205:0x0297  */
    /* JADX WARN: Code duplicated, block: B:208:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:211:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:214:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:217:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:220:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:223:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:226:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:229:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:232:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:235:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:238:0x0305  */
    /* JADX WARN: Code duplicated, block: B:241:0x030f  */
    /* JADX WARN: Code duplicated, block: B:244:0x0319  */
    /* JADX WARN: Code duplicated, block: B:247:0x0323  */
    /* JADX WARN: Code duplicated, block: B:250:0x032d  */
    /* JADX WARN: Code duplicated, block: B:253:0x0337  */
    /* JADX WARN: Code duplicated, block: B:256:0x0341  */
    /* JADX WARN: Code duplicated, block: B:259:0x034b  */
    /* JADX WARN: Code duplicated, block: B:262:0x0355  */
    /* JADX WARN: Code duplicated, block: B:265:0x035f  */
    /* JADX WARN: Code duplicated, block: B:268:0x0369  */
    /* JADX WARN: Code duplicated, block: B:271:0x0373  */
    /* JADX WARN: Code duplicated, block: B:274:0x037d  */
    /* JADX WARN: Code duplicated, block: B:277:0x0387  */
    /* JADX WARN: Code duplicated, block: B:280:0x0391  */
    /* JADX WARN: Code duplicated, block: B:283:0x039b  */
    /* JADX WARN: Code duplicated, block: B:286:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:289:0x03af  */
    /* JADX WARN: Code duplicated, block: B:292:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:295:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:298:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:301:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:304:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:307:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:310:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:313:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:316:0x0409  */
    /* JADX WARN: Code duplicated, block: B:319:0x0413  */
    /* JADX WARN: Code duplicated, block: B:322:0x041d  */
    /* JADX WARN: Code duplicated, block: B:325:0x0427  */
    /* JADX WARN: Code duplicated, block: B:328:0x0431  */
    /* JADX WARN: Code duplicated, block: B:331:0x043b  */
    /* JADX WARN: Code duplicated, block: B:334:0x0445  */
    /* JADX WARN: Code duplicated, block: B:337:0x044f  */
    /* JADX WARN: Code duplicated, block: B:340:0x0459  */
    /* JADX WARN: Code duplicated, block: B:343:0x0463  */
    /* JADX WARN: Code duplicated, block: B:346:0x046d  */
    /* JADX WARN: Code duplicated, block: B:349:0x0477  */
    /* JADX WARN: Code duplicated, block: B:352:0x0481  */
    /* JADX WARN: Code duplicated, block: B:355:0x048b  */
    /* JADX WARN: Code duplicated, block: B:358:0x0495  */
    /* JADX WARN: Code duplicated, block: B:361:0x049f  */
    /* JADX WARN: Code duplicated, block: B:364:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:367:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:370:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:373:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:376:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:379:0x04db  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c A[Catch: all -> 0x0674, TRY_ENTER, TryCatch #0 {, blocks: (B:6:0x000c, B:8:0x0010, B:10:0x0019, B:502:0x066a, B:37:0x006c, B:39:0x0072, B:41:0x007c, B:71:0x00d8, B:73:0x00de, B:496:0x0656, B:503:0x066e), top: B:510:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:382:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:385:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:388:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:391:0x0503  */
    /* JADX WARN: Code duplicated, block: B:394:0x050d  */
    /* JADX WARN: Code duplicated, block: B:397:0x0517  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072 A[Catch: all -> 0x0674, TryCatch #0 {, blocks: (B:6:0x000c, B:8:0x0010, B:10:0x0019, B:502:0x066a, B:37:0x006c, B:39:0x0072, B:41:0x007c, B:71:0x00d8, B:73:0x00de, B:496:0x0656, B:503:0x066e), top: B:510:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:400:0x0521  */
    /* JADX WARN: Code duplicated, block: B:403:0x052b  */
    /* JADX WARN: Code duplicated, block: B:406:0x0535  */
    /* JADX WARN: Code duplicated, block: B:409:0x053f  */
    /* JADX WARN: Code duplicated, block: B:412:0x0549  */
    /* JADX WARN: Code duplicated, block: B:415:0x0553  */
    /* JADX WARN: Code duplicated, block: B:418:0x055d  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c A[Catch: all -> 0x0674, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x000c, B:8:0x0010, B:10:0x0019, B:502:0x066a, B:37:0x006c, B:39:0x0072, B:41:0x007c, B:71:0x00d8, B:73:0x00de, B:496:0x0656, B:503:0x066e), top: B:510:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:421:0x0567  */
    /* JADX WARN: Code duplicated, block: B:424:0x0571  */
    /* JADX WARN: Code duplicated, block: B:427:0x057b  */
    /* JADX WARN: Code duplicated, block: B:430:0x0585  */
    /* JADX WARN: Code duplicated, block: B:433:0x058f  */
    /* JADX WARN: Code duplicated, block: B:436:0x0599  */
    /* JADX WARN: Code duplicated, block: B:439:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:442:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:445:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:448:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:451:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:454:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:457:0x05df  */
    /* JADX WARN: Code duplicated, block: B:460:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:463:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:466:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:469:0x0605  */
    /* JADX WARN: Code duplicated, block: B:472:0x060e  */
    /* JADX WARN: Code duplicated, block: B:475:0x0617  */
    /* JADX WARN: Code duplicated, block: B:478:0x0620  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:481:0x0629  */
    /* JADX WARN: Code duplicated, block: B:484:0x0632  */
    /* JADX WARN: Code duplicated, block: B:487:0x063b  */
    /* JADX WARN: Code duplicated, block: B:490:0x0644  */
    /* JADX WARN: Code duplicated, block: B:493:0x064d  */
    /* JADX WARN: Code duplicated, block: B:496:0x0656 A[Catch: all -> 0x0674, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x000c, B:8:0x0010, B:10:0x0019, B:502:0x066a, B:37:0x006c, B:39:0x0072, B:41:0x007c, B:71:0x00d8, B:73:0x00de, B:496:0x0656, B:503:0x066e), top: B:510:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:499:0x0661  */
    /* JADX WARN: Code duplicated, block: B:501:0x0669  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d8 A[Catch: all -> 0x0674, TRY_ENTER, TryCatch #0 {, blocks: (B:6:0x000c, B:8:0x0010, B:10:0x0019, B:502:0x066a, B:37:0x006c, B:39:0x0072, B:41:0x007c, B:71:0x00d8, B:73:0x00de, B:496:0x0656, B:503:0x066e), top: B:510:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:73:0x00de A[Catch: all -> 0x0674, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x000c, B:8:0x0010, B:10:0x0019, B:502:0x066a, B:37:0x006c, B:39:0x0072, B:41:0x007c, B:71:0x00d8, B:73:0x00de, B:496:0x0656, B:503:0x066e), top: B:510:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:76:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:85:0x0107  */
    /* JADX WARN: Code duplicated, block: B:88:0x0111  */
    /* JADX WARN: Code duplicated, block: B:91:0x011b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0125  */
    /* JADX WARN: Code duplicated, block: B:97:0x012f  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:499:0x0661
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    protected boolean ba(java.lang.String r5) {
        /*
            Method dump skipped, instruction units count: 2288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctb.ba(java.lang.String):boolean");
    }

    public final boolean bb(clo cloVar) {
        Surface surface;
        return this.U != null || ((surface = this.l) != null && surface.isValid()) || bi(cloVar) || bj(cloVar);
    }

    protected boolean bc(long j, boolean z) {
        int iL = l(j);
        if (iL == 0) {
            return false;
        }
        this.ai = j;
        ctp ctpVar = this.k;
        PriorityQueue priorityQueue = this.P;
        boolean zM = ctpVar.m();
        Iterator it = priorityQueue.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            if (((Long) it.next()).longValue() < this.e || zM) {
                i2++;
            } else {
                i++;
            }
        }
        priorityQueue.clear();
        cay cayVar = this.D;
        if (z) {
            int i3 = cayVar.d + iL;
            cayVar.d = i3;
            cayVar.f += this.ag;
            int i4 = i3 + i;
            cayVar.d = i4;
            cayVar.d = i4 + i2;
        } else {
            cayVar.j++;
            aY(iL + i, this.ag);
            this.D.d += i2;
        }
        aT();
        cuc cucVar = this.U;
        if (cucVar != null) {
            cucVar.d(false);
        }
        return true;
    }

    protected boolean bd(long j, long j2, boolean z) {
        return j < -500000 && !z;
    }

    @Override // defpackage.cto
    public final boolean be(long j, long j2, boolean z) {
        return bf(j, j2, z);
    }

    protected boolean bf(long j, long j2, boolean z) {
        return j < -30000 && !z;
    }

    @Override // defpackage.cto
    public final boolean bg(long j, long j2) {
        return rpi.E(j, j2);
    }

    @Override // defpackage.cto
    public final boolean bh(long j, long j2, long j3, boolean z, boolean z2) {
        if (this.U != null && this.H) {
            j2 -= d();
        }
        return bd(j, j3, z) && bc(j2, z2);
    }

    protected boolean bi(clo cloVar) {
        return Build.VERSION.SDK_INT >= 35 && cloVar.l;
    }

    protected final boolean bj(clo cloVar) {
        if (ba(cloVar.b)) {
            return false;
        }
        return !cloVar.h || ctd.a();
    }

    protected final void bk(clk clkVar, int i) {
        clkVar.k(i, false);
        aY(0, 1);
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0143  */
    protected aamu bl(clo cloVar, bse bseVar, bse[] bseVarArr) {
        Point pointB;
        int i;
        int i2;
        bru bruVar;
        int i3;
        int i4;
        int i5;
        byte[] bArr;
        int i6;
        int i7;
        int iA;
        int length = bseVarArr.length;
        int iB = b(cloVar, bseVar);
        int iMax = bseVar.x;
        int iMax2 = bseVar.w;
        int i8 = -1;
        if (length != 1) {
            int iMax3 = iMax;
            int iMax4 = iMax2;
            int i9 = 0;
            boolean z = false;
            while (i9 < length) {
                bse bseVar2 = bseVarArr[i9];
                bru bruVar2 = bseVar.G;
                if (bruVar2 != null && ((bruVar = bseVar2.G) == null || (((i3 = bruVar.b) == i8 || i3 == bruVar2.b) && (((i4 = bruVar.c) == -1 || i4 == bruVar2.c) && (((i5 = bruVar.d) == -1 || i5 == bruVar2.d) && (((bArr = bruVar.e) == null || Arrays.equals(bArr, bruVar2.e)) && (((i6 = bruVar.f) == -1 || i6 == bruVar2.f) && ((i7 = bruVar.g) == -1 || i7 == bruVar2.g)))))))) {
                    bsd bsdVar = new bsd(bseVar2);
                    bsdVar.E = bruVar2;
                    bseVar2 = new bse(bsdVar);
                }
                if (cloVar.c(bseVar, bseVar2).d != 0) {
                    int i10 = bseVar2.w;
                    i2 = -1;
                    z |= i10 == -1 || bseVar2.x == -1;
                    iMax4 = Math.max(iMax4, i10);
                    iMax3 = Math.max(iMax3, bseVar2.x);
                    iB = Math.max(iB, b(cloVar, bseVar2));
                } else {
                    i2 = -1;
                }
                i9++;
                i8 = i2;
            }
            if (z) {
                bvx.e("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax4 + 'x' + iMax3);
                boolean z2 = iMax > iMax2;
                int i11 = z2 ? iMax : iMax2;
                if (true == z2) {
                    iMax = iMax2;
                }
                int[] iArr = n;
                int i12 = 0;
                while (true) {
                    if (i12 < 9) {
                        float f = i11;
                        float f2 = iMax;
                        int i13 = iArr[i12];
                        float f3 = i13;
                        if (i13 > i11 && (i = (int) (f3 * (f2 / f))) > iMax) {
                            int i14 = true != z2 ? i13 : i;
                            if (true != z2) {
                                i13 = i;
                            }
                            pointB = cloVar.b(i14, i13);
                            float f4 = bseVar.A;
                            if (pointB != null) {
                                if (cloVar.j(pointB.x, pointB.y, f4)) {
                                    break;
                                }
                            }
                            i12++;
                        }
                    }
                    pointB = null;
                    break;
                }
                if (pointB != null) {
                    iMax2 = Math.max(iMax4, pointB.x);
                    iMax = Math.max(iMax3, pointB.y);
                    bsd bsdVar2 = new bsd(bseVar);
                    bsdVar2.u = iMax2;
                    bsdVar2.v = iMax;
                    iB = Math.max(iB, a(cloVar, new bse(bsdVar2)));
                    bvx.e("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax2 + 'x' + iMax);
                } else {
                    iMax = iMax3;
                    iMax2 = iMax4;
                }
            } else {
                iMax = iMax3;
                iMax2 = iMax4;
            }
        } else if (iB != -1 && (iA = a(cloVar, bseVar)) != -1) {
            iB = Math.min((int) (iB * 1.5f), iA);
        }
        return new aamu(iMax2, iMax, iB, (char[]) null);
    }

    protected MediaFormat bm(bse bseVar, String str, aamu aamuVar, float f, boolean z) {
        Pair pairA;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", bseVar.w);
        mediaFormat.setInteger("height", bseVar.x);
        atv.i(mediaFormat, bseVar.t);
        atv.k(mediaFormat, bseVar.A);
        atv.h(mediaFormat, "rotation-degrees", bseVar.B);
        atv.g(mediaFormat, bseVar.G);
        if ("video/dolby-vision".equals(bseVar.q) && (pairA = bvf.a(bseVar)) != null) {
            atv.h(mediaFormat, "profile", ((Integer) pairA.first).intValue());
        }
        mediaFormat.setInteger("max-width", aamuVar.c);
        mediaFormat.setInteger("max-height", aamuVar.b);
        atv.h(mediaFormat, "max-input-size", aamuVar.a);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.an));
        }
        aD(mediaFormat);
        return mediaFormat;
    }

    protected final long d() {
        return -this.aq;
    }

    @Override // defpackage.cls
    protected float e(float f, bse bseVar, bse[] bseVarArr) {
        clo cloVar;
        float fA = -1.0f;
        for (bse bseVar2 : bseVarArr) {
            float f2 = bseVar2.A;
            if (f2 != -1.0f) {
                fA = Math.max(fA, f2);
            }
        }
        if (fA == -1.0f && this.u != null) {
            csw cswVar = this.L;
            if (cswVar.a() != -9223372036854775807L) {
                fA = 1.0E9f / cswVar.a();
            }
        }
        float f3 = fA == -1.0f ? -1.0f : fA * f;
        if (this.ah == null || (cloVar = this.x) == null) {
            return f3;
        }
        float fA2 = cloVar.a(bseVar.w, bseVar.x);
        return f3 != -1.0f ? Math.max(f3, fA2) : fA2;
    }

    @Override // defpackage.cdp, defpackage.cdq
    public final String f() {
        return "MediaCodecVideoRenderer";
    }

    public final void g() {
        this.av.I(this.l);
        this.aa = true;
    }

    @Override // defpackage.cls
    protected final int h(clu cluVar, bse bseVar) {
        boolean z;
        String str = bseVar.q;
        boolean zN = bsy.n(str);
        int i = SemanticState.Focused;
        if (!zN) {
            return SemanticState.Focused;
        }
        Context context = this.q;
        int i2 = 0;
        boolean z2 = bseVar.u != null;
        List listBo = bo(context, cluVar, bseVar, z2, false);
        if (z2 && listBo.isEmpty()) {
            listBo = bo(context, cluVar, bseVar, false, false);
        }
        if (listBo.isEmpty()) {
            return 129;
        }
        if (!aS(bseVar)) {
            return 130;
        }
        clo cloVar = (clo) listBo.get(0);
        boolean zF = cloVar.f(context, bseVar);
        if (!zF) {
            int i3 = 1;
            while (true) {
                if (i3 >= listBo.size()) {
                    z = true;
                    break;
                }
                clo cloVar2 = (clo) listBo.get(i3);
                if (cloVar2.f(context, bseVar)) {
                    zF = true;
                    z = false;
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
        int i5 = true != cloVar.i(bseVar) ? 8 : 16;
        int i6 = true != cloVar.i ? 0 : 64;
        if (true != z) {
            i = 0;
        }
        if ("video/dolby-vision".equals(str) && !azq.d(context)) {
            i = SemanticState.Hidden;
        }
        if (zF) {
            List listBo2 = bo(context, cluVar, bseVar, z2, true);
            if (!listBo2.isEmpty()) {
                clo cloVar3 = (clo) cma.h(context, listBo2, bseVar).get(0);
                if (cloVar3.f(context, bseVar) && cloVar3.i(bseVar)) {
                    i2 = 32;
                }
            }
        }
        return i | i4 | i5 | i2 | i6;
    }

    @Override // defpackage.cav, defpackage.cdp
    public final void z() {
        cuc cucVar = this.U;
        if (cucVar == null) {
            this.k.c();
            return;
        }
        int i = this.W;
        if (i == 0 || i == 1) {
            this.W = 0;
        } else {
            cucVar.b();
        }
    }

    @Override // defpackage.cav
    protected final void F() {
    }
}
