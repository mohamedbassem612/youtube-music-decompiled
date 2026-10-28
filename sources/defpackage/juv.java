package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.DecoderInputBuffer;
import app.rive.semantics.SemanticState;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class juv extends cav implements cto {
    private static final Handler ah = new Handler(Looper.getMainLooper());
    private static final AtomicInteger ai = new AtomicInteger(0);
    private static final int[] aj = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static volatile boolean ak;
    private static boolean al;
    protected zjv A;
    protected volatile boolean B;
    public long C;
    public long D;
    protected boolean E;
    protected boolean F;
    protected boolean G;
    protected long H;
    protected long I;
    protected long J;
    protected long K;
    protected long L;
    protected long M;
    protected long N;
    protected final ctp O;
    protected final csw P;
    protected final cso Q;
    protected boolean R;
    public final MediaCodec.BufferInfo S;
    protected bse T;
    public volatile clk U;
    public clo V;
    public int W;
    public ByteBuffer X;
    public boolean Y;
    public boolean Z;
    private boolean aA;
    private int aB;
    private long aC;
    private int aD;
    private int aE;
    private int aF;
    private long aG;
    private int aH;
    private btz aI;
    private btz aJ;
    private int aK;
    private ctm aL;
    private long aM;
    private boolean aN;
    private int aO;
    private final cli aP;
    private final clu aQ;
    private final float aR;
    private final DecoderInputBuffer aS;
    private final DecoderInputBuffer aT;
    private final ArrayDeque aU;
    private bse aV;
    private cju aW;
    private cju aX;
    private MediaCrypto aY;
    private float aZ;
    public long aa;
    public boolean ab;
    protected cay ac;
    public yyg ad;
    public dov ae;
    protected dov af;
    public qcb ag;
    private long am;
    private long an;
    private boolean ao;
    private final Context ap;
    private final int aq;
    private final boolean ar;
    private final ctn as;
    private final long at;
    private final PriorityQueue au;
    private long av;
    private boolean aw;
    private boolean ax;
    private boolean ay;
    private ctd az;
    private aamu bA;
    private final pj bB;
    private float ba;
    private bse bb;
    private MediaFormat bc;
    private boolean bd;
    private float be;
    private ArrayDeque bf;
    private jur bg;
    private boolean bh;
    private boolean bi;
    private long bj;
    private boolean bk;
    private long bl;
    private int bm;
    private boolean bn;
    private int bo;
    private int bp;
    private int bq;
    private boolean br;
    private boolean bs;
    private boolean bt;
    private long bu;
    private boolean bv;
    private boolean bw;
    private jut bx;
    private long by;
    private boolean bz;
    protected boolean k;
    protected boolean l;
    protected boolean m;
    protected boolean n;
    protected boolean o;
    protected bse p;
    protected boolean q;
    protected boolean r;
    protected long s;
    protected boolean t;
    protected Surface u;
    protected Surface v;
    protected long w;
    protected long x;
    protected long y;
    protected boolean z;

    public juv(juq juqVar) {
        super(2);
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.s = -9223372036854775807L;
        this.w = 0L;
        this.x = 0L;
        this.B = true;
        this.aP = juqVar.c;
        clu cluVar = juqVar.b;
        cluVar.getClass();
        this.aQ = cluVar;
        this.aR = juqVar.h;
        this.ae = juqVar.k;
        this.aS = DecoderInputBuffer.newNoDataInstance();
        this.aT = new DecoderInputBuffer(0);
        this.S = new MediaCodec.BufferInfo();
        this.aZ = 1.0f;
        this.ba = 1.0f;
        this.aU = new ArrayDeque();
        this.bx = jut.a;
        this.be = -1.0f;
        this.bo = 0;
        this.bm = -1;
        this.W = -1;
        this.bl = -9223372036854775807L;
        this.bu = -9223372036854775807L;
        this.aa = -9223372036854775807L;
        this.by = -9223372036854775807L;
        this.bj = -9223372036854775807L;
        this.bp = 0;
        this.bq = 0;
        this.ac = new cay();
        Context applicationContext = juqVar.a.getApplicationContext();
        this.ap = applicationContext;
        this.aq = juqVar.g;
        this.bB = new pj(juqVar.e, juqVar.f);
        ctp ctpVar = new ctp(applicationContext, this, juqVar.d);
        this.O = ctpVar;
        this.as = new ctn();
        this.P = new csw(new juo(this, 0));
        this.ar = Objects.equals(Build.MANUFACTURER, "NVIDIA");
        bwc bwcVar = bwc.a;
        this.aB = 1;
        this.aI = btz.a;
        this.aJ = null;
        this.aK = -1000;
        this.aM = -9223372036854775807L;
        this.Q = new cso();
        this.au = new PriorityQueue();
        long j = juqVar.i;
        this.at = j != -9223372036854775807L ? -j : -9223372036854775807L;
        ctpVar.a = juqVar.j;
        this.av = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int b(clo cloVar, bse bseVar, boolean z) {
        int i = bseVar.w;
        int i2 = bseVar.x;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        String str = bseVar.q;
        str.getClass();
        if (Objects.equals(str, "video/dolby-vision")) {
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
                if (z) {
                    if (Objects.equals(Build.MODEL, "BRAVIA 4K 2015")) {
                        return -1;
                    }
                    if (Objects.equals(Build.MANUFACTURER, "Amazon") && Objects.equals(Build.MODEL, "KFSOWI")) {
                        return -1;
                    }
                    if (cloVar.h && Objects.equals(Build.MANUFACTURER, "Amazon") && Objects.equals(Build.MODEL, "AFTS")) {
                        return -1;
                    }
                    return ((((i + 15) >> 4) * ((i2 + 15) >> 4)) * 768) / 4;
                }
                if (Objects.equals(Build.MODEL, "BRAVIA 4K 2015")) {
                    return -1;
                }
                if (Objects.equals(Build.MANUFACTURER, "Amazon")) {
                    if (Objects.equals(Build.MODEL, "KFSOWI")) {
                        return -1;
                    }
                    if (Objects.equals(Build.MODEL, "AFTS") && cloVar.h) {
                        return -1;
                    }
                }
                int i4 = bwp.a;
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

    private final void bA() {
        this.W = -1;
        this.X = null;
    }

    private final void bB(cju cjuVar) {
        aup.o(this.aW, cjuVar);
        this.aW = cjuVar;
    }

    private final void bC(jut jutVar) {
        this.bx = jutVar;
        if (jutVar.d != -9223372036854775807L) {
            this.bz = true;
        }
    }

    private void bD(cju cjuVar) {
        aup.o(this.aX, cjuVar);
        this.aX = cjuVar;
    }

    private final void bE(bse bseVar) {
        if (this.U == null || this.bq == 3 || this.b == 0) {
            return;
        }
        float f = this.ba;
        bseVar.getClass();
        float fA = a(f, bseVar, ab());
        float f2 = this.be;
        if (f2 == fA || fA == -1.0f) {
            return;
        }
        if (f2 != -1.0f || fA > this.aR) {
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fA);
            clk clkVar = this.U;
            clkVar.getClass();
            clkVar.m(bundle);
            this.be = fA;
        }
    }

    private final void bF() throws cbo {
        cju cjuVar = this.aX;
        cjuVar.getClass();
        CryptoConfig cryptoConfigB = cjuVar.b();
        if (cryptoConfigB instanceof cke) {
            try {
                MediaCrypto mediaCrypto = this.aY;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((cke) cryptoConfigB).c);
            } catch (MediaCryptoException e) {
                throw q(e, this.T, false, 6006);
            }
        }
        bB(this.aX);
        this.bp = 0;
        this.bq = 0;
    }

    private final boolean bG(bse bseVar) {
        if (bseVar == null) {
            return false;
        }
        if (this.ad.G()) {
            if ((!zic.i() && this.ad.N()) || !this.ad.M() || !Objects.equals(bseVar.q, "video/av01")) {
                return false;
            }
        } else if ((this.ad.N() && !zic.i()) || !this.ad.M() || !ahno.ag("video/av01", bseVar.q)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:489:0x05c9  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static boolean bH() {
        if (Build.VERSION.SDK_INT <= 28) {
            String str = Build.DEVICE;
            switch (str.hashCode()) {
                case -1339091551:
                    if (str.equals("dangal")) {
                        return true;
                    }
                    break;
                case -1220081023:
                    if (str.equals("dangalFHD")) {
                        return true;
                    }
                    break;
                case -1220066608:
                    if (str.equals("dangalUHD")) {
                        return true;
                    }
                    break;
                case -1012436106:
                    if (str.equals("oneday")) {
                        return true;
                    }
                    break;
                case -760312546:
                    if (str.equals("aquaman")) {
                        return true;
                    }
                    break;
                case -64886864:
                    if (str.equals("magnolia")) {
                        return true;
                    }
                    break;
                case 3415681:
                    if (str.equals("once")) {
                        return true;
                    }
                    break;
                case 825323514:
                    if (str.equals("machuca")) {
                        return true;
                    }
                    break;
            }
        }
        if (Build.VERSION.SDK_INT <= 27 && Objects.equals(Build.DEVICE, "HWEML")) {
            return true;
        }
        String str2 = Build.MODEL;
        switch (str2.hashCode()) {
            case -349662828:
                if (str2.equals("AFTJMST12")) {
                    return true;
                }
                break;
            case -321033677:
                if (str2.equals("AFTKMST12")) {
                    return true;
                }
                break;
            case 2006354:
                if (str2.equals("AFTA")) {
                    return true;
                }
                break;
            case 2006367:
                if (str2.equals("AFTN")) {
                    return true;
                }
                break;
            case 2006371:
                if (str2.equals("AFTR")) {
                    return true;
                }
                break;
            case 1785421873:
                if (str2.equals("AFTEU011")) {
                    return true;
                }
                break;
            case 1785421876:
                if (str2.equals("AFTEU014")) {
                    return true;
                }
                break;
            case 1798172390:
                if (str2.equals("AFTSO001")) {
                    return true;
                }
                break;
            case 2119412532:
                if (str2.equals("AFTEUFF014")) {
                    return true;
                }
                break;
        }
        if (Build.VERSION.SDK_INT <= 26) {
            String str3 = Build.DEVICE;
            switch (str3) {
                case "GIONEE_SWW1609":
                    return true;
                case "GIONEE_SWW1627":
                    return true;
                case "GIONEE_SWW1631":
                    return true;
                case "K50a40":
                    return true;
                case "CP8676_I02":
                    return true;
                case "NX541J":
                    return true;
                case "NX573J":
                    return true;
                case "PGN528":
                    return true;
                case "PGN610":
                    return true;
                case "PGN611":
                    return true;
                case "AquaPowerM":
                    return true;
                case "RAIJIN":
                    return true;
                case "XT1663":
                    return true;
                case "ComioS1":
                    return true;
                case "Phantom6":
                    return true;
                case "pacificrim":
                    return true;
                case "vernee_M5":
                    return true;
                case "panell_dl":
                    return true;
                case "panell_ds":
                    return true;
                case "panell_dt":
                    return true;
                case "GiONEE_GBL7319":
                    return true;
                case "BRAVIA_ATV2":
                    return true;
                case "iris60":
                    return true;
                case "Slate_Pro":
                    return true;
                case "namath":
                    return true;
                case "A10-70F":
                    return true;
                case "A10-70L":
                    return true;
                case "s905x018":
                    return true;
                case "ELUGA_Ray_X":
                    return true;
                case "tcl_eu":
                    return true;
                case "nicklaus_f":
                    return true;
                case "A7000-a":
                    return true;
                case "SVP-DTV15":
                    return true;
                case "watson":
                    return true;
                case "whyred":
                    return true;
                case "OnePlus5T":
                    return true;
                case "GiONEE_CBL7513":
                    return true;
                case "GIONEE_GBL7360":
                    return true;
                case "Pixi4-7_3G":
                    return true;
                case "taido_row":
                    return true;
                case "BLACK-1X":
                    return true;
                case "Z12_PRO":
                    return true;
                case "ELUGA_A3_Pro":
                    return true;
                case "woods_fn":
                    return true;
                case "C1":
                    return true;
                case "Q5":
                    return true;
                case "V1":
                    return true;
                case "V5":
                    return true;
                case "b5":
                    return true;
                case "mh":
                    return true;
                case "JGZ":
                    return true;
                case "M04":
                    return true;
                case "M5c":
                    return true;
                case "MX6":
                    return true;
                case "P85":
                    return true;
                case "PLE":
                    return true;
                case "QX1":
                    return true;
                case "Z80":
                    return true;
                case "cv1":
                    return true;
                case "cv3":
                    return true;
                case "deb":
                    return true;
                case "flo":
                    return true;
                case "1601":
                    return true;
                case "1713":
                    return true;
                case "1714":
                    return true;
                case "F01H":
                    return true;
                case "F01J":
                    return true;
                case "F02H":
                    return true;
                case "F03H":
                    return true;
                case "F04H":
                    return true;
                case "F04J":
                    return true;
                case "P681":
                    return true;
                case "Q350":
                    return true;
                case "Q427":
                    return true;
                case "XE2X":
                    return true;
                case "fugu":
                    return true;
                case "kate":
                    return true;
                case "mido":
                    return true;
                case "p212":
                    return true;
                case "MEIZU_M5":
                    return true;
                case "601LV":
                    return true;
                case "602LV":
                    return true;
                case "Aura_Note_2":
                    return true;
                case "A1601":
                    return true;
                case "E5643":
                    return true;
                case "F3111":
                    return true;
                case "F3113":
                    return true;
                case "F3116":
                    return true;
                case "F3211":
                    return true;
                case "F3213":
                    return true;
                case "F3215":
                    return true;
                case "F3311":
                    return true;
                case "PRO7S":
                    return true;
                case "Q4260":
                    return true;
                case "Q4310":
                    return true;
                case "V23GB":
                    return true;
                case "X3_HK":
                    return true;
                case "i9031":
                    return true;
                case "l5460":
                    return true;
                case "le_x6":
                    return true;
                case "A2016a40":
                    return true;
                case "CPY83_I00":
                    return true;
                case "marino_f":
                    return true;
                case "griffin":
                    return true;
                case "A7010a48":
                    return true;
                case "A7020a48":
                    return true;
                case "TB3-730F":
                    return true;
                case "TB3-730X":
                    return true;
                case "TB3-850F":
                    return true;
                case "TB3-850M":
                    return true;
                case "Pixi5-10_4G":
                    return true;
                case "QM16XE_U":
                    return true;
                case "GIONEE_WBL5708":
                    return true;
                case "GIONEE_WBL7365":
                    return true;
                case "GIONEE_WBL7519":
                    return true;
                case "manning":
                    return true;
                case "A7000plus":
                    return true;
                case "j2xlteins":
                    return true;
                case "panell_d":
                    return true;
                case "LS-5017":
                    return true;
                case "itel_S41":
                    return true;
                case "hwALE-H":
                    return true;
                case "EverStar_S":
                    return true;
                case "htc_e56ml_dtul":
                    return true;
                case "woods_f":
                    return true;
                case "CPH1609":
                    return true;
                case "CPH1715":
                    return true;
                case "iball8735_9806":
                    return true;
                case "santoni":
                    return true;
                case "PB2-670M":
                    return true;
                case "Infinix-X572":
                    return true;
                case "BRAVIA_ATV3_4K":
                    return true;
                case "DM-01K":
                    return true;
                case "HWBLN-H":
                    return true;
                case "HWCAM-H":
                    return true;
                case "ASUS_X00AD_2":
                    return true;
                case "ELUGA_Note":
                    return true;
                case "ELUGA_Prim":
                    return true;
                case "HWVNS-H":
                    return true;
                case "HWWAS-H":
                    return true;
                default:
                    if (str3.equals("GIONEE_SWW1609")) {
                        return true;
                    }
                    String str4 = Build.MODEL;
                    if (str4.hashCode() != -594534941 && str4.equals("JSN-L21")) {
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    private final boolean bI(clo cloVar) {
        Surface surface = this.u;
        return (surface != null && surface.isValid()) || bj(cloVar) || bk(cloVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    /* JADX WARN: Code duplicated, block: B:26:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    private final boolean bJ() throws cbo {
        ahno.O(this.aY == null);
        cju cjuVar = this.aW;
        CryptoConfig cryptoConfigB = cjuVar.b();
        if (cke.a && (cryptoConfigB instanceof cke)) {
            int iA = cjuVar.a();
            if (iA == 1) {
                cjt cjtVarC = cjuVar.c();
                cjtVarC.getClass();
                throw q(cjtVarC, this.T, false, cjtVarC.a);
            }
            if (iA == 4) {
                if (cryptoConfigB == null) {
                    this.aY = new MediaCrypto(((cke) cryptoConfigB).b, ((cke) cryptoConfigB).c);
                    return true;
                }
                if (cjuVar.c() != null) {
                    return true;
                }
            }
        } else {
            if (cryptoConfigB == null) {
                try {
                    this.aY = new MediaCrypto(((cke) cryptoConfigB).b, ((cke) cryptoConfigB).c);
                    return true;
                } catch (MediaCryptoException e) {
                    throw q(e, this.T, false, 6006);
                }
            }
            if (cjuVar.c() != null) {
                return true;
            }
        }
        return false;
    }

    private final boolean bK(DecoderInputBuffer decoderInputBuffer) {
        return decoderInputBuffer.timeUs < this.e;
    }

    private final boolean bL(int i) throws cbo {
        ccu ccuVarR = r();
        DecoderInputBuffer decoderInputBuffer = this.aS;
        decoderInputBuffer.clear();
        int iK = k(ccuVarR, decoderInputBuffer, i | 4);
        if (iK == -5) {
            bm(ccuVarR);
            return true;
        }
        if (iK == -4 && decoderInputBuffer.isEndOfStream()) {
            this.bv = true;
            aw(0L);
        }
        return false;
    }

    private final void bM() throws cbo {
        if (!this.br) {
            bF();
        } else {
            this.bp = 1;
            this.bq = 2;
        }
    }

    static boolean ba(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return true;
        }
        String message = illegalStateException.getMessage();
        if (message != null && message.contains("MediaCodec")) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        if (stackTrace.length > 0) {
            String className = stackTrace[0].getClassName();
            if (className.equals("android.media.MediaCodec") || className.contains("MediaCodecAdapter")) {
                return true;
            }
        }
        return false;
    }

    private final Surface bp(clo cloVar) {
        boolean zT = this.ad.T();
        Surface surface = this.u;
        if (!zT) {
            if (surface != null) {
                if (surface.isValid()) {
                    return surface;
                }
                yyg yygVar = this.ad;
                yyf yyfVar = yygVar.d;
                if (yyfVar != null ? yyfVar.M : yygVar.a.d.ce()) {
                    return surface;
                }
            }
            if (bk(cloVar)) {
                ctd ctdVar = this.az;
                if (ctdVar != null) {
                    if (ctdVar.a != cloVar.h) {
                        by();
                    }
                }
                ctd ctdVar2 = this.az;
                if (ctdVar2 != null) {
                    return ctdVar2;
                }
                try {
                    ctd ctdVarB = ctd.b(cloVar.h);
                    this.az = ctdVarB;
                    return ctdVarB;
                } catch (IllegalStateException e) {
                    bvx.d("CODEC_SPLICE_MEDIACODEC", "Failed to create PlaceholderSurface", e);
                }
            }
        } else {
            if (surface != null) {
                return surface;
            }
            if (!bj(cloVar)) {
                ahno.O(bk(cloVar));
                ctd ctdVar3 = this.az;
                if (ctdVar3 != null) {
                    if (ctdVar3.a != cloVar.h) {
                        by();
                    }
                }
                ctd ctdVar4 = this.az;
                if (ctdVar4 != null) {
                    return ctdVar4;
                }
                ctd ctdVarB2 = ctd.b(cloVar.h);
                this.az = ctdVarB2;
                return ctdVarB2;
            }
        }
        return null;
    }

    private final String bq(String str) {
        StringBuilder sb = new StringBuilder(";sys_ld.");
        sb.append(ai.get());
        Surface surface = Objects.equals(str, "dav1d") ? this.v : this.u;
        int i = 0;
        if (surface != null && surface.isValid()) {
            i = 1;
        }
        sb.append(";sf_valid.");
        sb.append(i);
        if (this.aw) {
            sb.append(";sf_wk.1");
        }
        return sb.toString();
    }

    private static List br(Context context, clu cluVar, bse bseVar, boolean z) {
        String str = bseVar.q;
        if (str == null) {
            return agpi.a;
        }
        if (str.equals("video/dolby-vision") && !hna.Z(context)) {
            List listD = cma.d(context, cluVar, bseVar, z, false);
            if (listD.isEmpty()) {
                listD = cma.c(cluVar, bseVar, z, false);
            }
            if (!listD.isEmpty()) {
                return listD;
            }
        }
        return str.equals("video/dolby-vision") ? cma.g(context, cluVar, bseVar, z, false) : cma.f(cluVar, bseVar, z, false);
    }

    private final void bs() {
        if (!this.br) {
            bx();
        } else {
            this.bp = 1;
            this.bq = 3;
        }
    }

    private final void bt() {
        try {
            clk clkVar = this.U;
            clkVar.getClass();
            clkVar.h();
        } finally {
            aE();
        }
    }

    private void bu() {
        if (this.aD > 0) {
            long jB = p().b();
            this.bB.F(this.aD, jB - this.aC);
            this.aD = 0;
            this.aC = jB;
        }
    }

    private void bv() {
        btz btzVar = this.aJ;
        if (btzVar != null) {
            this.bB.L(btzVar);
        }
    }

    private final void bw(long j, long j2, bse bseVar) {
        ctm ctmVar = this.aL;
        if (ctmVar != null) {
            ctmVar.c(j, j2, bseVar, this.bc);
        }
    }

    private final void bx() {
        ay();
        al();
    }

    private final void by() {
        ctd ctdVar = this.az;
        if (ctdVar != null) {
            ctdVar.release();
            this.az = null;
        }
    }

    private final void bz() {
        this.bm = -1;
        this.aT.data = null;
    }

    protected static int d(clo cloVar, bse bseVar, boolean z) {
        int i;
        int length;
        int i2 = 0;
        if (z) {
            i = bseVar.r;
            if (i == -1) {
                return b(cloVar, bseVar, true);
            }
            List list = bseVar.t;
            int size = list.size();
            if (size == 0) {
                return i;
            }
            length = 0;
            while (i2 < size) {
                length += ((byte[]) list.get(i2)).length;
                i2++;
            }
        } else {
            i = bseVar.r;
            if (i == -1) {
                return b(cloVar, bseVar, false);
            }
            List list2 = bseVar.t;
            int size2 = list2.size();
            length = 0;
            while (i2 < size2) {
                length += ((byte[]) list2.get(i2)).length;
                i2++;
            }
        }
        return i + length;
    }

    @Override // defpackage.cav, defpackage.cdm
    public void A(int i, Object obj) {
        if (i == 1) {
            Object objY = hna.Y(obj);
            this.w = hna.W(obj);
            if (objY == null || this.u != objY) {
                if (!(objY instanceof Surface) || ((Surface) objY).isValid()) {
                    aI(objY);
                    return;
                } else {
                    aI(null);
                    return;
                }
            }
            return;
        }
        if (i == 7) {
            obj.getClass();
            this.aL = (ctm) obj;
            return;
        }
        if (i == 11) {
            obj.getClass();
            this.ag = (qcb) obj;
            return;
        }
        if (i == 14) {
            obj.getClass();
            return;
        }
        if (i == 4) {
            obj.getClass();
            this.aB = ((Integer) obj).intValue();
            clk clkVar = this.U;
            if (clkVar != null) {
                clkVar.n(this.aB);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            this.O.i(((Integer) obj).intValue());
            return;
        }
        if (i != 16) {
            if (i == 17) {
                Surface surface = this.u;
                aI(null);
                obj.getClass();
                ((ctb) obj).A(1, surface);
                return;
            }
            return;
        }
        obj.getClass();
        this.aK = ((Integer) obj).intValue();
        clk clkVar2 = this.U;
        if (clkVar2 == null || Build.VERSION.SDK_INT < 35) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("importance", Math.max(0, -this.aK));
        clkVar2.m(bundle);
    }

    @Override // defpackage.cav
    protected void D() {
        aq(true);
    }

    @Override // defpackage.cav
    protected void E(boolean z, boolean z2) {
        cay cayVar = new cay();
        this.ac = cayVar;
        this.bB.G(cayVar);
        if (!this.ay) {
            this.ay = true;
        }
        int i = !z2 ? 1 : 0;
        ctp ctpVar = this.O;
        ctpVar.b = p();
        ctpVar.g(i);
    }

    @Override // defpackage.cav
    protected void G(long j, boolean z, boolean z2) {
        this.bv = false;
        this.bw = false;
        bl();
        bwn bwnVar = this.bx.e;
        if (bwnVar.a() > 0) {
            this.ab = true;
        }
        bwnVar.f();
        this.aU.clear();
        ctp ctpVar = this.O;
        ctpVar.h();
        this.av = -9223372036854775807L;
        if (z) {
            ctpVar.d(false);
        }
        this.aE = 0;
        aG();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cav
    protected void J() {
        try {
            ay();
        } finally {
            bD(null);
            this.ay = false;
            by();
            this.p = null;
        }
    }

    @Override // defpackage.cav
    protected void K() {
        this.aD = 0;
        this.aC = p().b();
        this.aG = 0L;
        this.aH = 0;
        this.O.e();
        this.av = -9223372036854775807L;
        aG();
    }

    @Override // defpackage.cav
    protected void L() {
        bu();
        int i = this.aH;
        if (i != 0) {
            this.bB.J(this.aG, i);
            this.aG = 0L;
            this.aH = 0;
        }
        this.O.f();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    @Override // defpackage.cav
    protected void M(bse[] bseVarArr, long j, long j2, cnm cnmVar) {
        if (this.bx.d == -9223372036854775807L) {
            bC(new jut(-9223372036854775807L, j, j2));
        } else {
            ArrayDeque arrayDeque = this.aU;
            if (arrayDeque.isEmpty()) {
                long j3 = this.bu;
                if (j3 != -9223372036854775807L) {
                    long j4 = this.by;
                    if (j4 == -9223372036854775807L || j4 < j3) {
                        arrayDeque.add(new jut(this.bu, j, j2));
                    }
                }
                bC(new jut(-9223372036854775807L, j, j2));
                if (this.bx.d != -9223372036854775807L) {
                    at();
                }
            } else {
                arrayDeque.add(new jut(this.bu, j, j2));
            }
        }
        btn btnVar = this.h;
        if (btnVar.n()) {
            this.aM = -9223372036854775807L;
            return;
        }
        cnmVar.getClass();
        this.aM = btnVar.m(cnmVar.a, new btl()).d;
    }

    @Override // defpackage.cav, defpackage.cdp
    public void T(float f, float f2) {
        this.aZ = f;
        this.ba = f2;
        bE(this.bb);
        this.O.k(f);
    }

    protected float a(float f, bse bseVar, bse[] bseVarArr) {
        float fA = -1.0f;
        for (bse bseVar2 : bseVarArr) {
            float f2 = bseVar2.A;
            if (f2 != -1.0f) {
                fA = Math.max(fA, f2);
            }
        }
        if (fA == -1.0f && this.U != null) {
            csw cswVar = this.P;
            if (cswVar.a() != -9223372036854775807L) {
                fA = 1.0E9f / cswVar.a();
            }
        }
        if (fA != -1.0f) {
            return fA * f;
        }
        return -1.0f;
    }

    protected void aA() {
        long j = this.aa;
        if (j != -9223372036854775807L) {
            this.av = j;
        }
    }

    protected final void aB() {
        if (this.ae != null) {
            if (this.ad.S()) {
                this.ad.n("ecdi", "sf_swap.mc;sf_swap.req:pri");
            }
            ah.post(new kcx(this, 1));
        }
    }

    protected final void aC() {
        if (this.ae != null) {
            if (this.ad.S()) {
                this.ad.n("ecdi", "sf_swap.dav1d;sf_swap.req:sec");
            }
            ah.post(new ixe(this, 20));
        }
    }

    protected final void aD() {
        this.am = 0L;
        this.C = 0L;
        this.D = 0L;
        this.an = 0L;
        this.E = false;
        this.F = false;
        this.G = false;
        this.ao = false;
        this.o = false;
        this.bq = 0;
    }

    protected final void aE() {
        bz();
        bA();
        this.bl = -9223372036854775807L;
        this.bs = false;
        this.bj = -9223372036854775807L;
        this.br = false;
        this.Y = false;
        this.Z = false;
        this.bu = -9223372036854775807L;
        this.aa = -9223372036854775807L;
        this.by = -9223372036854775807L;
        this.av = -9223372036854775807L;
        this.bp = 0;
        this.bq = 0;
        this.bo = this.bn ? 1 : 0;
        this.au.clear();
        this.aN = false;
        this.aF = 0;
        this.aO = 0;
        this.Q.c();
    }

    protected final void aF() {
        aE();
        this.G = false;
        this.E = false;
        this.F = false;
        this.bf = null;
        this.V = null;
        this.bb = null;
        this.bc = null;
        this.bd = false;
        this.bt = false;
        this.be = -1.0f;
        this.bh = false;
        this.bi = false;
        this.bk = false;
        this.bn = false;
        this.bo = 0;
    }

    protected final void aG() {
        this.G = false;
        if (this.ad.S()) {
            this.s = -9223372036854775807L;
            this.t = false;
            this.r = false;
        }
    }

    protected final void aI(Object obj) {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (surface != null && !surface.isValid() && !this.ad.T()) {
            bvx.e("CODEC_SPLICE_MEDIACODEC", "MediaCodec setOutput: provided surface is invalid");
            surface = null;
        }
        if (this.u == surface) {
            if (surface != null) {
                bv();
                Surface surface2 = this.u;
                if (surface2 == null || !this.aA) {
                    return;
                }
                this.bB.I(surface2);
                return;
            }
            return;
        }
        this.u = surface;
        if (surface == null) {
            surface = null;
        } else if (this.ad.S()) {
            this.ad.n("ecdi", "sf_swap.mc;sf_swap.attached:pri");
        }
        ctp ctpVar = this.O;
        ctpVar.j(surface);
        this.aA = false;
        if (this.l && this.az != null) {
            by();
        }
        int i = this.b;
        clk clkVar = this.U;
        if (clkVar != null) {
            clo cloVar = this.V;
            cloVar.getClass();
            if (!bI(cloVar) || this.aw) {
                ay();
                al();
            } else {
                Surface surfaceBp = bp(cloVar);
                if (surfaceBp != null) {
                    aJ(clkVar, surfaceBp);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    clkVar.g();
                }
            }
        }
        if (surface != null) {
            bv();
        } else {
            this.aJ = null;
        }
        if (i == 2) {
            ctpVar.d(true);
        }
    }

    protected void aJ(clk clkVar, Surface surface) {
        clkVar.l(surface);
    }

    protected final void aL() {
        bse bseVar = this.T;
        if (bseVar != null) {
            if (aU(bseVar)) {
                aK(zjv.g);
            } else {
                aK(zjv.c);
            }
        }
    }

    protected final void aM() {
        if (this.ae == null || this.v == null) {
            return;
        }
        if (this.ad.S()) {
            long j = this.x;
            this.ad.n("ecdi", j != 0 ? a.bS(j, "sf_swap.dav1d;sf_swap.show:sec;tok.") : "sf_swap.dav1d;sf_swap.show:sec");
        }
        ah.post(new jup(this, this.x, 0));
    }

    protected final void aN() {
        if (this.ae == null || this.u == null) {
            return;
        }
        if (this.ad.S()) {
            long j = this.w;
            this.ad.n("ecdi", j != 0 ? a.bS(j, "sf_swap.mc;sf_swap.show:pri;tok.") : "sf_swap.mc;sf_swap.show:pri");
        }
        ah.post(new jup(this, this.w, 2));
    }

    protected void aO(bse bseVar) {
        this.r = false;
    }

    protected final void aP() {
        bE(this.bb);
    }

    protected final void aQ(int i, int i2) {
        cay cayVar = this.ac;
        cayVar.h += i;
        int i3 = i + i2;
        cayVar.g += i3;
        this.aD += i3;
        int i4 = this.aE + i3;
        this.aE = i4;
        cayVar.i = Math.max(i4, cayVar.i);
        int i5 = this.aq;
        if (i5 <= 0 || this.aD < i5) {
            return;
        }
        bu();
    }

    protected final void aR(long j) {
        int integer;
        int integer2;
        bse bseVar = (bse) this.bx.e.d(j);
        if (bseVar == null && this.bz && this.bc != null) {
            bseVar = (bse) this.bx.e.c();
        }
        if (bseVar != null) {
            this.aV = bseVar;
        } else if (!this.bd || (bseVar = this.aV) == null) {
            return;
        }
        bseVar.getClass();
        MediaFormat mediaFormat = this.bc;
        clk clkVar = this.U;
        if (clkVar != null) {
            clkVar.n(this.aB);
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
        this.aI = new btz(integer, integer2, f);
        this.P.b(bseVar.A);
        this.G = true;
        if (this.ad.S()) {
            this.ad.n("ecdi", "fmt_chg.mc");
        }
        this.bd = false;
        this.bz = false;
    }

    protected final void aS(long j) {
        this.ac.b(j);
        this.aG += j;
        this.aH++;
    }

    protected boolean aT(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        if (!this.ad.G()) {
            synchronized (juv.class) {
                if (!ak) {
                    al = bH();
                    ak = true;
                }
            }
        } else if (!ak) {
            synchronized (juv.class) {
                if (!ak) {
                    al = bH();
                    ak = true;
                }
            }
        }
        return al;
    }

    protected final boolean aU(bse bseVar) {
        if (this.ad.G()) {
            if (bseVar != null && (this.B || this.A == zjv.g || !this.ad.U())) {
                return bG(bseVar);
            }
        } else if (!this.ad.U() || this.B || this.A == zjv.g) {
            return bG(bseVar);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [boolean, int] */
    protected final boolean aV(long j, long j2) {
        boolean z;
        boolean z2;
        clk clkVar = this.U;
        clkVar.getClass();
        if (!aY()) {
            MediaCodec.BufferInfo bufferInfo = this.S;
            int iB = clkVar.b(bufferInfo);
            if (iB < 0) {
                if (iB == -2) {
                    ax();
                    return true;
                }
                if (this.bi && (this.bv || this.bp == 2)) {
                    aw(j);
                }
                long j3 = this.bj;
                if (j3 != -9223372036854775807L && j3 + 100 < p().a()) {
                    aw(j);
                }
            } else if (bufferInfo.size != 0 || (bufferInfo.flags & 4) == 0) {
                try {
                    ByteBuffer byteBufferF = clkVar.f(iB);
                    this.X = byteBufferF;
                    this.W = iB;
                    if (byteBufferF != null) {
                        MediaCodec.BufferInfo bufferInfo2 = this.S;
                        byteBufferF.position(bufferInfo2.offset);
                        this.X.limit(bufferInfo2.offset + bufferInfo2.size);
                    }
                    MediaCodec.BufferInfo bufferInfo3 = this.S;
                    this.Y = (bufferInfo3.presentationTimeUs > this.e ? 1 : (bufferInfo3.presentationTimeUs == this.e ? 0 : -1)) >>> 31;
                    long j4 = this.aa;
                    this.Z = j4 != -9223372036854775807L && j4 <= bufferInfo3.presentationTimeUs;
                    aR(bufferInfo3.presentationTimeUs);
                } catch (IllegalStateException e) {
                    if (!this.ad.y() || !ba(e)) {
                        throw e;
                    }
                    ao(e);
                    if (this.l) {
                        ay();
                        bvx.f("CODEC_SPLICE_MEDIACODEC", "Codec error during splice drain, forcing splice transition", e);
                        this.n = true;
                        this.J = j;
                        this.bq = 5;
                        aj();
                    } else {
                        bvx.f("CODEC_SPLICE_MEDIACODEC", "Codec error during drain, reinitializing codec", e);
                        bx();
                    }
                }
            } else {
                aw(j);
            }
            return false;
        }
        int i = this.W;
        MediaCodec.BufferInfo bufferInfo4 = this.S;
        int i2 = bufferInfo4.flags;
        long j5 = bufferInfo4.presentationTimeUs;
        boolean z3 = this.Y;
        boolean z4 = this.Z;
        bse bseVar = this.aV;
        bseVar.getClass();
        if (this.ad.B()) {
            this.R = false;
        }
        long jE = j5 - e();
        int i3 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.au;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j5) {
                break;
            }
            priorityQueue.poll();
            boolean z5 = z3;
            this.P.c(l.longValue() * 1000);
            long jLongValue = l.longValue();
            bse bseVar2 = bseVar;
            if (jLongValue >= this.e) {
                i3++;
            }
            bseVar = bseVar2;
            z3 = z5;
        }
        bse bseVar3 = bseVar;
        aQ(i3, 0);
        csw cswVar = this.P;
        cswVar.c(j5 * 1000);
        ctp ctpVar = this.O;
        long jG = g();
        ctn ctnVar = this.as;
        int iA = ctpVar.a(j5, j, j2, jG, z3, z4, cswVar.a(), cswVar.a, false, ctnVar);
        if (iA != 5) {
            j5 = -9223372036854775807L;
        }
        this.av = j5;
        if (iA != 0) {
            z = true;
            if (iA == 1) {
                z2 = false;
                long j6 = ctnVar.b;
                long j7 = ctnVar.a;
                bw(jE, j6, bseVar3);
                az(clkVar, i, jE, j6);
                aS(j7);
            } else {
                if (iA != 2) {
                    if (iA != 3) {
                        z2 = false;
                    } else {
                        z2 = false;
                        clkVar.k(i, false);
                        this.ac.f++;
                        aS(ctnVar.a);
                    }
                    return z2;
                }
                z2 = false;
                clkVar.k(i, false);
                aQ(0, 1);
                aS(ctnVar.a);
            }
        } else {
            z = true;
            z2 = false;
            long jC = p().c();
            bw(jE, jC, bseVar3);
            az(clkVar, i, jE, jC);
            aS(ctnVar.a);
        }
        as(bufferInfo4.presentationTimeUs);
        boolean z6 = (bufferInfo4.flags & 4) != 0 ? z : z2;
        if (!z6 && this.bs && this.Z) {
            this.bj = p().a();
        }
        long j8 = bufferInfo4.presentationTimeUs;
        bA();
        if (z6) {
            if (!this.l || !this.ao) {
                aw(j);
                return z2;
            }
        } else if (!this.ad.B() || this.R) {
            boolean z7 = (!this.ad.B() || bb() || this.n) ? z : z2;
            boolean z8 = (this.ad.L() || this.ad.B()) ? this.E : this.F;
            if (this.l && z8 && z7) {
                this.E = z2;
                this.F = z2;
                this.L = j;
                yyg yygVar = this.ad;
                if (yygVar == null || !yygVar.A() || this.K == 0) {
                    this.K = j8;
                }
                if (this.ad.S()) {
                    this.ad.n("rbrd", "dec_warm.mc");
                }
                if (this.ad.B() && this.n && !this.q) {
                    this.y = 0L;
                    av(j);
                }
            }
            if (this.G) {
                this.G = z2;
                if (this.ad.S()) {
                    this.ad.n("ecdi", "first_buf.mc");
                }
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:154:0x027f  */
    /* JADX WARN: Code duplicated, block: B:156:0x0285  */
    /* JADX WARN: Code duplicated, block: B:159:0x0290  */
    /* JADX WARN: Code duplicated, block: B:161:0x0298  */
    /* JADX WARN: Code duplicated, block: B:162:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:166:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:168:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:171:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:174:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:179:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:182:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:183:0x02fe  */
    protected final boolean aW() throws cbo {
        boolean zIsEncrypted;
        long j;
        long jMax;
        int i;
        int i2;
        ArrayDeque arrayDeque;
        boolean zBK;
        ByteBuffer byteBuffer;
        yyg yygVar;
        if (this.bq == 5 || this.U == null || this.bp == 2 || this.bv) {
            return false;
        }
        clk clkVar = this.U;
        clkVar.getClass();
        if (this.bm < 0) {
            int iA = clkVar.a();
            this.bm = iA;
            if (iA < 0) {
                return false;
            }
            DecoderInputBuffer decoderInputBuffer = this.aT;
            decoderInputBuffer.data = clkVar.e(iA);
            decoderInputBuffer.clear();
        }
        if (this.bp == 1) {
            if (!this.bi) {
                this.bs = true;
                clkVar.t(this.bm, 0, 0L, 4);
                bz();
            }
            this.bp = 2;
            return false;
        }
        if (this.bq == 4) {
            long j2 = this.C;
            if (j2 == 0) {
                return false;
            }
            this.H = j2;
            long j3 = this.D;
            this.I = j3;
            if (j3 == 0) {
                this.I = 41000L;
            }
            this.bs = true;
            clkVar.t(this.bm, 0, 0L, 4);
            bz();
            this.an = this.C;
            this.ao = true;
            yyg yygVar2 = this.ad;
            if (yygVar2 != null && yygVar2.H()) {
                this.o = true;
            }
            this.C = 0L;
            return false;
        }
        if (this.bo == 1) {
            int i3 = 0;
            while (true) {
                bse bseVar = this.bb;
                bseVar.getClass();
                if (i3 >= bseVar.t.size()) {
                    break;
                }
                byte[] bArr = (byte[]) this.bb.t.get(i3);
                ByteBuffer byteBuffer2 = this.aT.data;
                byteBuffer2.getClass();
                byteBuffer2.put(bArr);
                i3++;
            }
            this.bo = 2;
        }
        DecoderInputBuffer decoderInputBuffer2 = this.aT;
        ByteBuffer byteBuffer3 = decoderInputBuffer2.data;
        byteBuffer3.getClass();
        int iPosition = byteBuffer3.position();
        ccu ccuVarR = r();
        try {
            int iK = k(ccuVarR, decoderInputBuffer2, 0);
            if (iK == -3) {
                if (!X()) {
                    return false;
                }
                this.aa = this.bu;
                return false;
            }
            if (iK == -5) {
                if (this.bo == 2) {
                    this.aT.clear();
                    this.bo = 1;
                }
                bm(ccuVarR);
            } else {
                if (this.l && this.am == 0) {
                    DecoderInputBuffer decoderInputBuffer3 = this.aT;
                    long j4 = decoderInputBuffer3.timeUs;
                    this.am = j4;
                    this.K = j4;
                    long j5 = this.H;
                    if (j5 > 0 && j4 < j5 && (yygVar = this.ad) != null && yygVar.S()) {
                        this.ad.n("ecdi", "ts_regress.mc;prev." + this.H + ";curr." + decoderInputBuffer3.timeUs);
                    }
                    yyg yygVar3 = this.ad;
                    if (yygVar3 == null || !yygVar3.r()) {
                        this.y = decoderInputBuffer3.timeUs;
                    } else {
                        long j6 = this.H;
                        this.y = j6 > 0 ? Math.max(decoderInputBuffer3.timeUs, this.I + j6) : decoderInputBuffer3.timeUs;
                    }
                }
                yyg yygVar4 = this.ad;
                boolean z = (yygVar4 != null && yygVar4.A() && this.l) ? false : true;
                DecoderInputBuffer decoderInputBuffer4 = this.aT;
                long j7 = decoderInputBuffer4.timeUs;
                long j8 = this.C;
                if (j7 > j8 && z) {
                    this.C = j7;
                    if (j8 > 0) {
                        this.D = j7 - j8;
                    }
                }
                if (decoderInputBuffer4.isEndOfStream()) {
                    this.aa = this.bu;
                    if (this.bo == 2) {
                        decoderInputBuffer4.clear();
                        this.bo = 1;
                    }
                    this.bv = true;
                    if (!this.br) {
                        aw(0L);
                        return false;
                    }
                    if (this.bi) {
                        return false;
                    }
                    this.bs = true;
                    clkVar.t(this.bm, 0, 0L, 4);
                    bz();
                    return false;
                }
                if (!this.br && !decoderInputBuffer4.isKeyFrame()) {
                    decoderInputBuffer4.clear();
                    if (this.bo == 2) {
                        this.bo = 1;
                    }
                } else if (X() || decoderInputBuffer4.isLastSample() || this.aM == -9223372036854775807L) {
                    zIsEncrypted = decoderInputBuffer4.isEncrypted();
                    if (zIsEncrypted) {
                        decoderInputBuffer4.cryptoInfo.a(iPosition);
                    }
                    j = decoderInputBuffer4.timeUs;
                    if (this.ab) {
                        arrayDeque = this.aU;
                        if (arrayDeque.isEmpty()) {
                            bwn bwnVar = this.bx.e;
                            bse bseVar2 = this.T;
                            bseVar2.getClass();
                            bwnVar.e(j, bseVar2);
                        } else {
                            bwn bwnVar2 = ((jut) arrayDeque.peekLast()).e;
                            bse bseVar3 = this.T;
                            bseVar3.getClass();
                            bwnVar2.e(j, bseVar3);
                        }
                        this.ab = false;
                    }
                    jMax = Math.max(this.bu, j);
                    this.bu = jMax;
                    if (X() || decoderInputBuffer4.isLastSample()) {
                        this.aa = jMax;
                    }
                    decoderInputBuffer4.flip();
                    if (decoderInputBuffer4.hasSupplementalData()) {
                        ak(decoderInputBuffer4);
                    }
                    au(decoderInputBuffer4);
                    if (Build.VERSION.SDK_INT < 34 && bsc.c(6) && bK(decoderInputBuffer4)) {
                        i = 32;
                    } else {
                        i = 0;
                    }
                    i2 = this.bm;
                    if (zIsEncrypted) {
                        clkVar.u(i2, decoderInputBuffer4.cryptoInfo, j, i);
                    } else {
                        ByteBuffer byteBuffer4 = decoderInputBuffer4.data;
                        byteBuffer4.getClass();
                        clkVar.t(i2, byteBuffer4.limit(), j, i);
                    }
                    bz();
                    this.br = true;
                    this.bo = 0;
                    this.ac.c++;
                } else if (this.aM - (j7 - e()) <= 100000 || decoderInputBuffer4.isEncrypted() || (!((zBK = bK(decoderInputBuffer4)) || this.aN) || decoderInputBuffer4.hasSupplementalData())) {
                    zIsEncrypted = decoderInputBuffer4.isEncrypted();
                    if (zIsEncrypted) {
                        decoderInputBuffer4.cryptoInfo.a(iPosition);
                    }
                    j = decoderInputBuffer4.timeUs;
                    if (this.ab) {
                        arrayDeque = this.aU;
                        if (arrayDeque.isEmpty()) {
                            bwn bwnVar3 = ((jut) arrayDeque.peekLast()).e;
                            bse bseVar4 = this.T;
                            bseVar4.getClass();
                            bwnVar3.e(j, bseVar4);
                        } else {
                            bwn bwnVar4 = this.bx.e;
                            bse bseVar5 = this.T;
                            bseVar5.getClass();
                            bwnVar4.e(j, bseVar5);
                        }
                        this.ab = false;
                    }
                    jMax = Math.max(this.bu, j);
                    this.bu = jMax;
                    if (X()) {
                        this.aa = jMax;
                    } else {
                        this.aa = jMax;
                    }
                    decoderInputBuffer4.flip();
                    if (decoderInputBuffer4.hasSupplementalData()) {
                        ak(decoderInputBuffer4);
                    }
                    au(decoderInputBuffer4);
                    if (Build.VERSION.SDK_INT < 34) {
                        i = 0;
                    } else {
                        i = 0;
                    }
                    i2 = this.bm;
                    if (zIsEncrypted) {
                        clkVar.u(i2, decoderInputBuffer4.cryptoInfo, j, i);
                    } else {
                        ByteBuffer byteBuffer5 = decoderInputBuffer4.data;
                        byteBuffer5.getClass();
                        clkVar.t(i2, byteBuffer5.limit(), j, i);
                    }
                    bz();
                    this.br = true;
                    this.bo = 0;
                    this.ac.c++;
                } else if (decoderInputBuffer4.notDependedOn()) {
                    decoderInputBuffer4.clear();
                    if (zBK) {
                        this.ac.d++;
                    } else {
                        this.aO++;
                    }
                    this.au.add(Long.valueOf(decoderInputBuffer4.timeUs));
                } else {
                    clo cloVar = this.V;
                    cloVar.getClass();
                    if (!cloVar.c.equals("video/av01") || (byteBuffer = decoderInputBuffer4.data) == null) {
                        zIsEncrypted = decoderInputBuffer4.isEncrypted();
                        if (zIsEncrypted) {
                            decoderInputBuffer4.cryptoInfo.a(iPosition);
                        }
                        j = decoderInputBuffer4.timeUs;
                        if (this.ab) {
                            arrayDeque = this.aU;
                            if (arrayDeque.isEmpty()) {
                                bwn bwnVar5 = ((jut) arrayDeque.peekLast()).e;
                                bse bseVar6 = this.T;
                                bseVar6.getClass();
                                bwnVar5.e(j, bseVar6);
                            } else {
                                bwn bwnVar6 = this.bx.e;
                                bse bseVar7 = this.T;
                                bseVar7.getClass();
                                bwnVar6.e(j, bseVar7);
                            }
                            this.ab = false;
                        }
                        jMax = Math.max(this.bu, j);
                        this.bu = jMax;
                        if (X()) {
                            this.aa = jMax;
                        } else {
                            this.aa = jMax;
                        }
                        decoderInputBuffer4.flip();
                        if (decoderInputBuffer4.hasSupplementalData()) {
                            ak(decoderInputBuffer4);
                        }
                        au(decoderInputBuffer4);
                        if (Build.VERSION.SDK_INT < 34) {
                            i = 0;
                        } else {
                            i = 0;
                        }
                        i2 = this.bm;
                        if (zIsEncrypted) {
                            clkVar.u(i2, decoderInputBuffer4.cryptoInfo, j, i);
                        } else {
                            ByteBuffer byteBuffer6 = decoderInputBuffer4.data;
                            byteBuffer6.getClass();
                            clkVar.t(i2, byteBuffer6.limit(), j, i);
                        }
                        bz();
                        this.br = true;
                        this.bo = 0;
                        this.ac.c++;
                    } else {
                        boolean z2 = zBK || this.aO <= 0;
                        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                        byteBufferAsReadOnlyBuffer.flip();
                        int iA2 = this.Q.a(byteBufferAsReadOnlyBuffer, z2);
                        aamu aamuVar = this.bA;
                        aamuVar.getClass();
                        int i4 = aamuVar.a + iA2;
                        int iCapacity = byteBufferAsReadOnlyBuffer.capacity();
                        if (iA2 == byteBufferAsReadOnlyBuffer.limit() || i4 >= iCapacity) {
                            zIsEncrypted = decoderInputBuffer4.isEncrypted();
                            if (zIsEncrypted) {
                                decoderInputBuffer4.cryptoInfo.a(iPosition);
                            }
                            j = decoderInputBuffer4.timeUs;
                            if (this.ab) {
                                arrayDeque = this.aU;
                                if (arrayDeque.isEmpty()) {
                                    bwn bwnVar7 = ((jut) arrayDeque.peekLast()).e;
                                    bse bseVar8 = this.T;
                                    bseVar8.getClass();
                                    bwnVar7.e(j, bseVar8);
                                } else {
                                    bwn bwnVar8 = this.bx.e;
                                    bse bseVar9 = this.T;
                                    bseVar9.getClass();
                                    bwnVar8.e(j, bseVar9);
                                }
                                this.ab = false;
                            }
                            jMax = Math.max(this.bu, j);
                            this.bu = jMax;
                            if (X()) {
                                this.aa = jMax;
                            } else {
                                this.aa = jMax;
                            }
                            decoderInputBuffer4.flip();
                            if (decoderInputBuffer4.hasSupplementalData()) {
                                ak(decoderInputBuffer4);
                            }
                            au(decoderInputBuffer4);
                            if (Build.VERSION.SDK_INT < 34) {
                                i = 0;
                            } else {
                                i = 0;
                            }
                            i2 = this.bm;
                            if (zIsEncrypted) {
                                clkVar.u(i2, decoderInputBuffer4.cryptoInfo, j, i);
                            } else {
                                ByteBuffer byteBuffer7 = decoderInputBuffer4.data;
                                byteBuffer7.getClass();
                                clkVar.t(i2, byteBuffer7.limit(), j, i);
                            }
                            bz();
                            this.br = true;
                            this.bo = 0;
                            this.ac.c++;
                        } else {
                            ByteBuffer byteBuffer8 = decoderInputBuffer4.data;
                            byteBuffer8.getClass();
                            byteBuffer8.position(iA2);
                            if (zBK) {
                                this.ac.d++;
                            } else {
                                this.aO++;
                            }
                            this.au.add(Long.valueOf(decoderInputBuffer4.timeUs));
                        }
                    }
                }
            }
            return true;
        } catch (cao e) {
            ao(e);
            bL(0);
            bt();
        }
    }

    protected final boolean aX() {
        if (this.U == null) {
            return false;
        }
        int i = this.bq;
        if (i == 3 || (this.bh && !this.bt)) {
            ay();
        } else {
            if (i == 2) {
                try {
                    bF();
                } catch (cbo unused) {
                    ay();
                }
            }
            try {
                bt();
                return false;
            } catch (IllegalStateException e) {
                if (!ba(e)) {
                    throw e;
                }
                bvx.d("CODEC_SPLICE_MEDIACODEC", "Failed to flush codec, releasing instead", e);
                this.aT.clear();
                ay();
                if (this.l || this.m) {
                    aD();
                    this.l = false;
                    this.m = false;
                }
            }
        }
        return true;
    }

    final boolean aY() {
        return this.W >= 0;
    }

    protected boolean aZ() {
        return false;
    }

    @Override // defpackage.cdp
    public void af(long j, long j2) {
        Surface surface;
        if (this.U != null && (surface = this.u) != null && !surface.isValid()) {
            bvx.e("CODEC_SPLICE_MEDIACODEC", "render: mediaCodecSurface is invalid");
            ar();
        }
        try {
            if (this.bw) {
                aA();
                return;
            }
            if (this.T != null || bL(2)) {
                al();
                if (this.U != null) {
                    if (this.b == 2 && !this.l && (this.bl == -9223372036854775807L || p().b() >= this.bl)) {
                        am(Z(), aY(), "mc");
                    }
                    if (this.z) {
                        this.z = false;
                        aH(j);
                    }
                    p().b();
                    while (aV(j, j2)) {
                    }
                    boolean z = (this.ad.L() || this.ad.B()) ? this.E : this.F;
                    if (this.l && !z && !this.q && (this.y != 0 || (this.ad.B() && this.n))) {
                        long jG = this.ad.g();
                        if ((this.ad.B() && this.n) || jG + j >= this.y) {
                            this.y = 0L;
                            this.M = j;
                            av(j);
                        }
                    }
                    while (aW()) {
                    }
                } else {
                    this.ac.d += l(j);
                    bL(1);
                }
                this.ac.a();
            }
        } catch (MediaCodec.CryptoException e) {
            throw q(e, this.T, false, bwp.k(e.getErrorCode()));
        } catch (IllegalStateException e2) {
            if (!ba(e2)) {
                throw e2;
            }
            ao(e2);
            boolean z2 = (e2 instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e2).isRecoverable();
            if (z2) {
                ay();
            }
            clm clmVar = new clm(e2, this.V);
            throw q(clmVar, this.T, z2, clmVar.b == 1101 ? 4006 : 4003);
        }
    }

    @Override // defpackage.cdp
    public boolean ag() {
        return this.bw;
    }

    @Override // defpackage.cdp
    public boolean ah() {
        boolean z = false;
        if (this.T != null && (Z() || aY() || (this.bl != -9223372036854775807L && p().b() < this.bl))) {
            z = true;
        }
        boolean zN = (z && this.U == null) ? true : this.O.n(z);
        an(zN, (this.ad.L() || this.ad.B()) ? this.E : this.F, "mc");
        return zN;
    }

    protected final List ai(clu cluVar, bse bseVar, boolean z) {
        Context context = this.ap;
        return cma.h(context, br(context, cluVar, bseVar, z), bseVar);
    }

    protected void ak(DecoderInputBuffer decoderInputBuffer) {
        if (this.ax) {
            ByteBuffer byteBuffer = decoderInputBuffer.supplementalData;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        clk clkVar = this.U;
                        clkVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        clkVar.m(bundle);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:148:0x02ec A[Catch: jur -> 0x0390, TryCatch #4 {jur -> 0x0390, blocks: (B:146:0x02e8, B:148:0x02ec, B:149:0x02ef, B:151:0x031b, B:153:0x0327, B:155:0x0339, B:157:0x0359, B:161:0x0369, B:162:0x036b, B:156:0x033c, B:163:0x036c, B:170:0x0386, B:171:0x038f), top: B:189:0x00d4 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x031b A[Catch: jur -> 0x0390, TryCatch #4 {jur -> 0x0390, blocks: (B:146:0x02e8, B:148:0x02ec, B:149:0x02ef, B:151:0x031b, B:153:0x0327, B:155:0x0339, B:157:0x0359, B:161:0x0369, B:162:0x036b, B:156:0x033c, B:163:0x036c, B:170:0x0386, B:171:0x038f), top: B:189:0x00d4 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0325  */
    /* JADX WARN: Code duplicated, block: B:155:0x0339 A[Catch: jur -> 0x0390, TryCatch #4 {jur -> 0x0390, blocks: (B:146:0x02e8, B:148:0x02ec, B:149:0x02ef, B:151:0x031b, B:153:0x0327, B:155:0x0339, B:157:0x0359, B:161:0x0369, B:162:0x036b, B:156:0x033c, B:163:0x036c, B:170:0x0386, B:171:0x038f), top: B:189:0x00d4 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x033c A[Catch: jur -> 0x0390, TryCatch #4 {jur -> 0x0390, blocks: (B:146:0x02e8, B:148:0x02ec, B:149:0x02ef, B:151:0x031b, B:153:0x0327, B:155:0x0339, B:157:0x0359, B:161:0x0369, B:162:0x036b, B:156:0x033c, B:163:0x036c, B:170:0x0386, B:171:0x038f), top: B:189:0x00d4 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x035f  */
    /* JADX WARN: Code duplicated, block: B:198:0x0369 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [clo] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r17v0, types: [clo] */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v20 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r22v0, types: [cav, juv] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r2v57, types: [android.media.MediaCrypto] */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.media.MediaFormat] */
    protected final void al() {
        bse bseVar;
        boolean z;
        bse bseVar2;
        MediaCrypto mediaCrypto;
        ?? r19;
        boolean z2;
        jur jurVar;
        String diagnosticInfo;
        String str;
        ArrayDeque arrayDeque;
        jur jurVar2;
        Pair pairA;
        ?? r2;
        if (this.U == null) {
            bse bseVar3 = this.T;
            if (bseVar3 == null || aU(bseVar3)) {
                yyg yygVar = this.ad;
                if (yygVar == null || !yygVar.I() || (bseVar = this.p) == null || bseVar.u != null || this.aX != null || aU(bseVar)) {
                    if (bseVar3 != null) {
                        aL();
                        return;
                    }
                    return;
                }
                bseVar3 = this.p;
            }
            bse bseVar4 = bseVar3;
            bB(this.aX);
            bse bseVar5 = null;
            if (this.aW != null && !bJ()) {
                r2 = bseVar5;
                break;
            }
            ?? r10 = 0;
            try {
                cju cjuVar = this.aW;
                if (cjuVar == null || !(cjuVar.a() == 3 || this.aW.a() == 4)) {
                    z = false;
                } else {
                    cju cjuVar2 = this.aW;
                    String str2 = bseVar4.q;
                    str2.getClass();
                    if (cjuVar2.n(str2)) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                MediaCrypto mediaCrypto2 = this.aY;
                String str3 = "CODEC_SPLICE_MEDIACODEC";
                if (this.bf == null) {
                    try {
                        clu cluVar = this.aQ;
                        List listAi = ai(cluVar, bseVar4, z);
                        if (listAi.isEmpty() && z) {
                            listAi = ai(cluVar, bseVar4, false);
                            if (!listAi.isEmpty()) {
                                bvx.e("CODEC_SPLICE_MEDIACODEC", "Drm session requires secure decoder for " + bseVar4.q + ", but no secure decoder available. Trying to proceed with " + listAi.toString() + '.');
                            }
                        }
                        this.bf = new ArrayDeque();
                        if (!listAi.isEmpty()) {
                            this.bf.add((clo) listAi.get(0));
                        }
                        this.bg = null;
                    } catch (cly e) {
                        throw new jur(bseVar4, e, z, -49998);
                    }
                }
                try {
                    if (!this.bf.isEmpty()) {
                        ArrayDeque arrayDeque2 = this.bf;
                        arrayDeque2.getClass();
                        while (true) {
                            if (this.U != null) {
                                ?? r3 = bseVar5;
                                this.bf = r3;
                                r2 = r3;
                                break;
                            }
                            clo cloVar = (clo) arrayDeque2.peekFirst();
                            cloVar.getClass();
                            if (!bI(cloVar)) {
                                r2 = bseVar5;
                                break;
                            }
                            try {
                                yyg yygVar2 = this.ad;
                                if (yygVar2 != null && yygVar2.a() > 0.0f) {
                                    this.V = cloVar;
                                }
                                String str4 = cloVar.b;
                                float fA = a(this.ba, bseVar4, ab());
                                float f = fA <= this.aR ? -1.0f : fA;
                                long jB = p().b();
                                String str5 = cloVar.d;
                                aamu aamuVarBn = bn(cloVar, bseVar4, ab());
                                this.bA = aamuVarBn;
                                boolean z3 = this.ar;
                                ?? mediaFormat = new MediaFormat();
                                mediaFormat.setString("mime", str5);
                                mediaFormat.setInteger("width", bseVar4.w);
                                mediaFormat.setInteger("height", bseVar4.x);
                                atv.i(mediaFormat, bseVar4.t);
                                atv.k(mediaFormat, bseVar4.A);
                                atv.h(mediaFormat, "rotation-degrees", bseVar4.B);
                                atv.g(mediaFormat, bseVar4.G);
                                if (Objects.equals(bseVar4.q, "video/dolby-vision") && (pairA = bvf.a(bseVar4)) != null) {
                                    atv.h(mediaFormat, "profile", ((Integer) pairA.first).intValue());
                                }
                                mediaFormat.setInteger("max-width", aamuVarBn.c);
                                mediaFormat.setInteger("max-height", aamuVarBn.b);
                                atv.h(mediaFormat, "max-input-size", aamuVarBn.a);
                                mediaFormat.setInteger("priority", r10);
                                if (f != -1.0f) {
                                    mediaFormat.setFloat("operating-rate", f);
                                }
                                if (z3) {
                                    mediaFormat.setInteger("no-post-process", 1);
                                    mediaFormat.setInteger("auto-frc", r10);
                                }
                                if (Build.VERSION.SDK_INT >= 35) {
                                    mediaFormat.setInteger("importance", Math.max((int) r10, -this.aK));
                                }
                                gmj gmjVar = new gmj(cloVar, (MediaFormat) mediaFormat, bseVar4, bp(cloVar), mediaCrypto2, (mgk) null);
                                bseVar2 = bseVar4;
                                mediaCrypto = mediaCrypto2;
                                try {
                                    if (Build.VERSION.SDK_INT >= 31) {
                                        LogSessionId logSessionIdA = v().a();
                                        if (!logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                                            ((MediaFormat) gmjVar.d).setString("log-session-id", logSessionIdA.getStringId());
                                        }
                                    }
                                    try {
                                        this.U = this.aP.b(gmjVar);
                                        ai.incrementAndGet();
                                        this.bk = this.U.s(new jus(this, r10));
                                        long jB2 = p().b();
                                        if (cloVar.f(this.ap, bseVar2)) {
                                            r19 = r10;
                                        } else {
                                            ?? r110 = r10;
                                            try {
                                                Object[] objArr = new Object[2];
                                                objArr[r110 == true ? 1 : 0] = bse.c(bseVar2);
                                                objArr[1] = str4;
                                                bvx.e(str3, bwp.K("Format exceeds selected codec's capabilities [%s, %s]", objArr));
                                                r19 = r110;
                                            } catch (Exception e2) {
                                                e = e2;
                                                r19 = r110;
                                                r10 = cloVar;
                                                if (this.U != null) {
                                                    ay();
                                                }
                                                arrayDeque2.removeFirst();
                                                z2 = z;
                                                String str6 = "Decoder init failed: " + r10.b + ", " + String.valueOf(bseVar2);
                                                String str7 = bseVar2.q;
                                                if (e instanceof MediaCodec.CodecException) {
                                                    diagnosticInfo = ((MediaCodec.CodecException) e).getDiagnosticInfo();
                                                } else {
                                                    diagnosticInfo = null;
                                                }
                                                str = str3;
                                                arrayDeque = arrayDeque2;
                                                jurVar = new jur(str6, e, str7, z2, r10, diagnosticInfo);
                                                ao(jurVar);
                                                jurVar2 = this.bg;
                                                if (jurVar2 == null) {
                                                    this.bg = jurVar;
                                                } else {
                                                    this.bg = new jur(jurVar2.getMessage(), jurVar2.getCause(), jurVar2.a, jurVar2.b, jurVar2.c, jurVar2.d);
                                                }
                                                if (!arrayDeque.isEmpty()) {
                                                    throw this.bg;
                                                }
                                                arrayDeque2 = arrayDeque;
                                                str3 = str;
                                                mediaCrypto2 = mediaCrypto;
                                                bseVar4 = bseVar2;
                                                z = z2;
                                            }
                                        }
                                        this.V = cloVar;
                                        this.be = f;
                                        this.bb = bseVar2;
                                        this.bh = (Build.VERSION.SDK_INT == 29 && Objects.equals(str4, "c2.android.aac.decoder")) ? true : r19 == true ? 1 : 0;
                                        String str8 = cloVar.b;
                                        this.bi = ((Build.VERSION.SDK_INT > 29 || !(Objects.equals(str8, "OMX.broadcom.video_decoder.tunnel") || Objects.equals(str8, "OMX.broadcom.video_decoder.tunnel.secure") || Objects.equals(str8, "OMX.bcm.vdec.avc.tunnel") || Objects.equals(str8, "OMX.bcm.vdec.avc.tunnel.secure") || Objects.equals(str8, "OMX.bcm.vdec.hevc.tunnel") || Objects.equals(str8, "OMX.bcm.vdec.hevc.tunnel.secure"))) && !(Objects.equals(Build.MANUFACTURER, "Amazon") && Objects.equals(Build.MODEL, "AFTS") && cloVar.h)) ? r19 == true ? 1 : 0 : true;
                                        clk clkVar = this.U;
                                        clkVar.getClass();
                                        if (clkVar.r()) {
                                            this.bn = true;
                                            this.bo = 1;
                                        }
                                        if (this.b == 2) {
                                            this.bl = p().b() + 1000;
                                        }
                                        this.ac.a++;
                                        r10 = cloVar;
                                        try {
                                            bo(str4, gmjVar, jB2, jB2 - jB);
                                            mediaCrypto2 = mediaCrypto;
                                            bseVar4 = bseVar2;
                                        } catch (Exception e3) {
                                            e = e3;
                                            if (this.U != null) {
                                                ay();
                                            }
                                            arrayDeque2.removeFirst();
                                            z2 = z;
                                            String str9 = "Decoder init failed: " + r10.b + ", " + String.valueOf(bseVar2);
                                            String str10 = bseVar2.q;
                                            if (e instanceof MediaCodec.CodecException) {
                                                diagnosticInfo = ((MediaCodec.CodecException) e).getDiagnosticInfo();
                                            } else {
                                                diagnosticInfo = null;
                                            }
                                            str = str3;
                                            arrayDeque = arrayDeque2;
                                            jurVar = new jur(str9, e, str10, z2, r10, diagnosticInfo);
                                            ao(jurVar);
                                            jurVar2 = this.bg;
                                            if (jurVar2 == null) {
                                                this.bg = jurVar;
                                            } else {
                                                this.bg = new jur(jurVar2.getMessage(), jurVar2.getCause(), jurVar2.a, jurVar2.b, jurVar2.c, jurVar2.d);
                                            }
                                            if (!arrayDeque.isEmpty()) {
                                                throw this.bg;
                                            }
                                            arrayDeque2 = arrayDeque;
                                            str3 = str;
                                            mediaCrypto2 = mediaCrypto;
                                            bseVar4 = bseVar2;
                                            z = z2;
                                        }
                                    } catch (Throwable th) {
                                        r19 = r10;
                                        r10 = cloVar;
                                        throw th;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    r19 = r10;
                                }
                            } catch (Exception e5) {
                                e = e5;
                                bseVar2 = bseVar4;
                                mediaCrypto = mediaCrypto2;
                                r19 = r10;
                                r10 = cloVar;
                            }
                            r10 = r19 == true ? 1 : 0;
                            bseVar5 = null;
                        }
                    } else {
                        throw new jur(bseVar4, null, z, -49999);
                    }
                } catch (jur e6) {
                    e = e6;
                    throw q(e, bseVar5, false, 4001);
                }
            } catch (jur e7) {
                e = e7;
                bseVar5 = bseVar4;
                throw q(e, bseVar5, false, 4001);
            }
            if (this.aY == null || this.U != null) {
                return;
            }
            this.aY.release();
            this.aY = r2;
        }
    }

    protected final void am(boolean z, boolean z2, String str) {
        if (this.ad.S()) {
            if (!z || z2) {
                this.s = -9223372036854775807L;
                this.t = false;
                return;
            }
            if (this.s == -9223372036854775807L) {
                this.s = p().b();
                return;
            }
            if (p().b() - this.s <= 500 || this.t) {
                return;
            }
            this.t = true;
            this.ad.n("rbrd", "steady_state_stall." + str + bq(str));
        }
    }

    protected final void an(boolean z, boolean z2, String str) {
        if (this.ad.S() && !z && Z() && this.l && z2 && !this.r) {
            this.r = true;
            this.ad.n("rbrd", "warmup_stall." + str + bq(str));
        }
    }

    protected final void ao(Exception exc) {
        String simpleName;
        this.bB.K(exc);
        if (this.ad.S()) {
            Throwable cause = exc instanceof jur ? exc.getCause() : exc;
            Exception exc2 = exc;
            if (cause instanceof MediaCodec.CodecException) {
                MediaCodec.CodecException codecException = (MediaCodec.CodecException) cause;
                simpleName = codecException.getDiagnosticInfo();
                if (simpleName == null || simpleName.isEmpty()) {
                    simpleName = String.valueOf(codecException.getErrorCode());
                }
            } else {
                if (cause != null) {
                    exc2 = cause;
                }
                simpleName = exc2.getClass().getSimpleName();
            }
            this.ad.n("ecdi", "codec_err.mc;res_err." + simpleName + ";sys_ld." + ai.get());
        }
    }

    protected final void ap(String str) {
        this.bB.D(str);
        ai.decrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:26:0x0064 A[FINALLY_INSNS] */
    protected final void aq(boolean z) {
        aG();
        this.aJ = null;
        this.aM = -9223372036854775807L;
        boolean z2 = false;
        this.aA = false;
        this.av = -9223372036854775807L;
        try {
            bC(jut.a);
            this.aU.clear();
            aX();
        } finally {
            this.p = null;
            yyg yygVar = this.ad;
            if (yygVar != null && yygVar.E()) {
                z2 = true;
            }
            if (!z2 || z) {
                this.bB.E(this.ac);
                if (z2) {
                    this.ac = new cay();
                }
            } else {
                this.ac = new cay();
            }
            this.bB.L(btz.a);
        }
    }

    protected final void ar() {
        try {
            aI(null);
        } catch (cbo e) {
            bvx.d("CODEC_SPLICE_MEDIACODEC", "Error clearing MediaCodec output", e);
        }
    }

    protected void as(long j) {
        this.by = j;
        while (true) {
            ArrayDeque arrayDeque = this.aU;
            if (arrayDeque.isEmpty() || j < ((jut) arrayDeque.peek()).b) {
                break;
            }
            jut jutVar = (jut) arrayDeque.poll();
            jutVar.getClass();
            bC(jutVar);
            at();
        }
        this.aF--;
    }

    protected final void at() {
        if (!this.ad.B() || !this.l) {
            this.E = false;
            this.F = false;
        }
        ctp ctpVar = this.O;
        ctpVar.g(2);
        if (this.ad.B() && aZ()) {
            ctpVar.o();
        }
    }

    protected void au(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        bru bruVar;
        clo cloVar = this.V;
        cloVar.getClass();
        if (cloVar.c.equals("video/av01") && (byteBuffer = decoderInputBuffer.data) != null) {
            bse bseVar = this.bb;
            if (bseVar != null && (bruVar = bseVar.G) != null && bruVar.f > 8 && Build.VERSION.SDK_INT < 37) {
                azq.e(byteBuffer, true);
            }
            if (decoderInputBuffer.isKeyFrame()) {
                this.Q.b(byteBuffer);
            }
        }
        this.aO = 0;
    }

    protected void av(long j) {
        if (this.k) {
            aM();
        } else {
            aN();
        }
    }

    public final void aw(long j) {
        this.G = false;
        this.E = false;
        if (!this.ad.B() || this.bq != 4) {
            this.F = false;
        }
        int i = this.bq;
        if (i == 1) {
            bt();
            return;
        }
        if (i == 2) {
            bt();
            bF();
            return;
        }
        if (i == 3) {
            bx();
            return;
        }
        if (i != 4) {
            if (i != 5) {
                this.bw = true;
                aA();
                return;
            }
            return;
        }
        ay();
        this.n = true;
        this.J = j;
        this.bq = 5;
        aj();
    }

    public final void ax() {
        this.bt = true;
        clk clkVar = this.U;
        clkVar.getClass();
        this.bc = clkVar.c();
        this.bd = true;
    }

    protected final void ay() {
        try {
            try {
                if (this.U != null) {
                    try {
                        this.U.i();
                        this.ac.b++;
                        clo cloVar = this.V;
                        ap(cloVar != null ? cloVar.b : "unknown");
                    } catch (Throwable th) {
                        this.ac.b++;
                        clo cloVar2 = this.V;
                        ap(cloVar2 != null ? cloVar2.b : "unknown");
                        throw th;
                    }
                }
                this.U = null;
                MediaCrypto mediaCrypto = this.aY;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
                this.aY = null;
                bB(null);
                aF();
            } catch (Throwable th2) {
                this.U = null;
                MediaCrypto mediaCrypto2 = this.aY;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                this.aY = null;
                bB(null);
                aF();
                throw th2;
            }
        } catch (Throwable th3) {
            this.aY = null;
            bB(null);
            aF();
            throw th3;
        }
    }

    protected void az(clk clkVar, int i, long j, long j2) {
        Surface surface;
        if (this.ad.B()) {
            this.R = true;
        }
        if (this.l && j == this.an) {
            this.ao = false;
        }
        clkVar.j(i, j2);
        this.ac.e++;
        this.aE = 0;
        btz btzVar = this.aI;
        if (!btzVar.equals(btz.a) && !btzVar.equals(this.aJ)) {
            this.aJ = btzVar;
            this.bB.L(btzVar);
        }
        if (!this.O.o() || (surface = this.u) == null) {
            return;
        }
        this.bB.I(surface);
        this.aA = true;
        if (this.B || this.k || this.u == null) {
            return;
        }
        aN();
    }

    protected boolean bb() {
        return false;
    }

    protected boolean bc(long j, boolean z) {
        int iL = l(j);
        int i = 0;
        if (iL == 0) {
            return false;
        }
        Iterator it = this.au.iterator();
        while (it.hasNext()) {
            if (((Long) it.next()).longValue() >= this.e) {
                i++;
            }
        }
        cay cayVar = this.ac;
        if (z) {
            int i2 = cayVar.d + iL;
            cayVar.d = i2;
            cayVar.f += this.aF;
            cayVar.d = i2 + i;
        } else {
            cayVar.j++;
            aQ(iL + i, this.aF);
        }
        bl();
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
        return bi(j, j2);
    }

    @Override // defpackage.cto
    public final boolean bh(long j, long j2, long j3, boolean z, boolean z2) {
        long j4 = this.at;
        if (j4 != -9223372036854775807L) {
            this.aN = j2 > this.e + 200000 && j < j4;
        }
        return bd(j, j3, z) && bc(j2, z2);
    }

    protected boolean bi(long j, long j2) {
        return rpi.E(j, j2);
    }

    protected boolean bj(clo cloVar) {
        return Build.VERSION.SDK_INT >= 35 && cloVar.l;
    }

    protected final boolean bk(clo cloVar) {
        if (aT(cloVar.b)) {
            return false;
        }
        return !cloVar.h || ctd.a();
    }

    protected final void bl() {
        if (aX()) {
            al();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011d, code lost:
    
        if (r5.n(r2) == false) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [cju, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void bm(defpackage.ccu r18) throws defpackage.cbo {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.juv.bm(ccu):void");
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00f3  */
    protected aamu bn(clo cloVar, bse bseVar, bse[] bseVarArr) {
        Point pointB;
        int i;
        int iB;
        boolean zG = this.ad.G();
        int iMax = bseVar.w;
        int iMax2 = bseVar.x;
        int iD = d(cloVar, bseVar, zG);
        int length = bseVarArr.length;
        if (length != 1) {
            int iMax3 = iMax;
            int iMax4 = iMax2;
            boolean z = false;
            for (int i2 = 0; i2 < length; i2++) {
                bse bseVar2 = bseVarArr[i2];
                bru bruVar = bseVar.G;
                if (bruVar != null && bseVar2.G == null) {
                    bsd bsdVar = new bsd(bseVar2);
                    bsdVar.E = bruVar;
                    bseVar2 = new bse(bsdVar);
                }
                if (cloVar.c(bseVar, bseVar2).d != 0) {
                    int i3 = bseVar2.w;
                    z |= i3 == -1 || bseVar2.x == -1;
                    iMax3 = Math.max(iMax3, i3);
                    iMax4 = Math.max(iMax4, bseVar2.x);
                    iD = Math.max(iD, d(cloVar, bseVar2, zG));
                }
            }
            if (z) {
                boolean z2 = iMax2 > iMax;
                int i4 = z2 ? iMax2 : iMax;
                if (true != z2) {
                    iMax = iMax2;
                }
                int[] iArr = aj;
                int length2 = iArr.length;
                int i5 = 0;
                while (true) {
                    if (i5 < 9) {
                        float f = i4;
                        float f2 = iMax;
                        int i6 = iArr[i5];
                        float f3 = i6;
                        if (i6 > i4 && (i = (int) (f3 * (f2 / f))) > iMax) {
                            int i7 = true != z2 ? i6 : i;
                            if (true != z2) {
                                i6 = i;
                            }
                            pointB = cloVar.b(i7, i6);
                            float f4 = bseVar.A;
                            if (pointB != null) {
                                if (cloVar.j(pointB.x, pointB.y, f4)) {
                                    break;
                                }
                            }
                            i5++;
                        }
                    }
                    pointB = null;
                    break;
                }
                if (pointB != null) {
                    iMax = Math.max(iMax3, pointB.x);
                    iMax2 = Math.max(iMax4, pointB.y);
                    bsd bsdVar2 = new bsd(bseVar);
                    bsdVar2.u = iMax;
                    bsdVar2.v = iMax2;
                    iD = Math.max(iD, b(cloVar, new bse(bsdVar2), zG));
                } else {
                    iMax2 = iMax4;
                    iMax = iMax3;
                }
            } else {
                iMax2 = iMax4;
                iMax = iMax3;
            }
        } else if (iD != -1 && (iB = b(cloVar, bseVar, zG)) != -1) {
            yyg yygVar = this.ad;
            yyf yyfVar = yygVar.d;
            float fC = yyfVar != null ? yyfVar.R : yygVar.a.d.c();
            if (fC <= 0.0f) {
                fC = 1.5f;
            }
            iD = Math.min((int) (iD * fC), iB);
        }
        return new aamu(iMax, iMax2, iD, (char[]) null);
    }

    protected void bo(String str, gmj gmjVar, long j, long j2) {
        String str2 = str;
        this.bB.C(str2, j, j2);
        this.aw = aT(str2);
        clo cloVar = this.V;
        cloVar.getClass();
        this.ax = cloVar.g();
        if (this.ad.S()) {
            String str3 = true != this.l ? "codec_created.v" : "warmup_codec_created.v";
            if (true == str2.isEmpty()) {
                str2 = "unknown";
            }
            this.ad.n("ecdi", str3 + ";name." + str2 + ";sys_ld." + ai.get());
        }
    }

    @Override // defpackage.cdq
    public int c(bse bseVar) throws cbo {
        boolean z;
        try {
            clu cluVar = this.aQ;
            Context context = this.ap;
            String str = bseVar.q;
            boolean zN = bsy.n(str);
            int i = SemanticState.Focused;
            if (!zN) {
                return SemanticState.Focused;
            }
            boolean z2 = bseVar.u != null;
            List listBr = br(context, cluVar, bseVar, z2);
            if (z2 && listBr.isEmpty()) {
                listBr = br(context, cluVar, bseVar, false);
            }
            if (listBr.isEmpty()) {
                return 129;
            }
            int i2 = bseVar.S;
            if (i2 != 0 && i2 != 2) {
                return 130;
            }
            clo cloVar = (clo) listBr.get(0);
            boolean zF = cloVar.f(context, bseVar);
            if (!zF) {
                int i3 = 1;
                while (true) {
                    if (i3 >= listBr.size()) {
                        z = true;
                        break;
                    }
                    clo cloVar2 = (clo) listBr.get(i3);
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
            int i5 = true != cloVar.i(bseVar) ? 8 : 16;
            int i6 = true != cloVar.i ? 0 : 64;
            if (true != z) {
                i = 0;
            }
            if (Objects.equals(str, "video/dolby-vision") && !hna.Z(context)) {
                i = SemanticState.Hidden;
            }
            return i | i4 | i5 | i6;
        } catch (cly e) {
            throw q(e, bseVar, false, 4002);
        }
    }

    protected final long e() {
        return this.bx.d;
    }

    @Override // defpackage.cdp, defpackage.cdq
    public String f() {
        return "";
    }

    protected final long g() {
        return this.bx.c;
    }

    protected caz h(clo cloVar, bse bseVar, bse bseVar2) {
        int i;
        int i2;
        caz cazVarC = cloVar.c(bseVar, bseVar2);
        int i3 = cazVarC.e;
        aamu aamuVar = this.bA;
        aamuVar.getClass();
        int i4 = (bseVar2.w > aamuVar.c || bseVar2.x > aamuVar.b) ? i3 | SemanticState.Hidden : i3;
        boolean zG = this.ad.G();
        if (d(cloVar, bseVar2, zG) > aamuVar.a) {
            i4 |= 64;
        }
        int i5 = i4;
        if (zG) {
            return i5 != i3 ? new caz(cloVar.b, bseVar, bseVar2, 0, i5) : cazVarC;
        }
        String str = cloVar.b;
        if (i5 != 0) {
            i2 = 0;
            i = i5;
        } else {
            i = 0;
            i2 = cazVarC.d;
        }
        return new caz(str, bseVar, bseVar2, i2, i);
    }

    @Override // defpackage.cav, defpackage.cdq
    public final int m() {
        return 8;
    }

    @Override // defpackage.cav, defpackage.cdp
    public final long n(long j, long j2) {
        boolean z = this.bk;
        if (!bsc.c(7) || !z) {
            return aub.f(this);
        }
        if (this.b != 2) {
            return (ah() || ag()) ? 1000000L : 10000L;
        }
        long j3 = this.av;
        if (j3 == -9223372036854775807L) {
            return 10000L;
        }
        if (ag()) {
            return Math.max(10000L, (long) (((j3 - j) / this.aZ) / 2.0f));
        }
        ctp ctpVar = this.O;
        long jG = g();
        csw cswVar = this.P;
        ctn ctnVar = this.as;
        int iB = ctpVar.b(j3, j, j2, jG, cswVar.a(), cswVar.a, ctnVar);
        if (iB == 0 || iB == 3 || iB == 2) {
            return 0L;
        }
        if (iB == 5 || iB == 4) {
            return 10000L;
        }
        long j4 = ctnVar.a;
        if (j4 > 0) {
            j4 = (long) (j4 / this.aZ);
        }
        return Math.max(10000L, j4);
    }

    @Override // defpackage.cav, defpackage.cdp
    public void z() {
        this.O.c();
    }

    @Override // defpackage.cav
    protected void H() {
    }

    protected void aj() {
    }

    protected void aH(long j) {
    }

    public void aK(zjv zjvVar) {
    }
}
