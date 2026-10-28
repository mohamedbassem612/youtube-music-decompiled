package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.graphics.SurfaceTexture;
import android.media.ImageReader;
import android.media.Spatializer;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.media3.decoder.av1.Libdav1dVideoRenderer;
import androidx.media3.decoder.opus.LibopusAudioRenderer;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.google.android.apps.youtube.proto.streaming.MediaCapabilitiesOuterClass$MediaCapabilities;
import com.google.android.apps.youtube.proto.streaming.SelectableFormatsOuterClass$SelectableFormats;
import com.google.android.apps.youtube.proto.streaming.SelectableFormatsOuterClass$SelectableVideoFormat;
import com.google.android.libraries.youtube.media.interfaces.BufferManager;
import com.google.android.libraries.youtube.media.interfaces.OnesieResponseSelector;
import com.google.android.libraries.youtube.media.interfaces.OnesieVideoData;
import com.google.android.libraries.youtube.media.interfaces.RestartPrefetchEvaluationSource;
import com.google.android.libraries.youtube.media.interfaces.SconeBitrateTracker;
import com.google.android.libraries.youtube.media.player.exo2.ImageReaderMediaGlRenderer;
import com.google.android.libraries.youtube.media.player.exo2.platypus.MetadataStoreImpl;
import com.google.android.libraries.youtube.media.player.exo2.platypus.OnesieMediaFetchIntegration;
import com.google.android.libraries.youtube.media.player.exo2.platypus.PlatypusEnablingManager;
import com.google.android.libraries.youtube.media.player.exo2.platypus.PlatypusOnesieMediaFetchIntegration;
import com.google.android.libraries.youtube.media.player.exo2.platypus.PlatypusOnesieVideoDataMediaFetchIntegration;
import com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.BufferManagerImpl;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.InnertubeDrmService$AuthorizedFormat;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.util.DesugarArrays;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import j$.util.stream.StreamSupport;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yyv implements Observer, zdo, zcg, yvj, cdt, zcj, tdz {
    final PlatypusEnablingManager A;
    final yzm B;
    public final twv C;
    final agfr D;
    public float E;
    public int F;
    final zeo G;
    public boolean H;
    public boolean I;
    public Optional J;
    public final ScheduledExecutorService K;
    public final ahey L;
    final avlh M;
    public final Object N;
    public final AtomicLong O;
    public ScheduledFuture P;
    public boolean Q;
    ces R;
    public final yha S;
    final tgr T;
    final ahud U;
    public final hed V;
    private final mbc X;
    private final bvd Y;
    private yzs Z;
    public final zlr a;
    private yzt aa;
    private yzr ab;
    private LibopusAudioRenderer ac;
    private LibopusAudioRenderer ad;
    private Libdav1dVideoRenderer ae;
    private cdp[] af;
    private yyg ag;
    private final yqy ah;
    private final btm ai;
    private final awmd aj;
    private final tre ak;
    private final awmd al;
    private cno am;
    private float an;
    private boolean ao;
    private boolean ap;
    private final xeu aq;
    private final yfo ar;
    private final zwb as;
    private final aaqc at;
    private zik au;
    private final zik av;
    public cbp b;
    public final yyi c;
    public final yup d;
    final zin e;
    public ExoPlayer f;
    final yzj g;
    public final yye h;
    final yyh i;
    final zeh j;
    public final Handler k;
    final Handler l;
    Handler m;
    public jux n;
    final yzl o;
    final yoz p;
    final awmd q;
    final yzz r;
    public String s;
    public final yzo t;
    public final yya u;
    public final yyb v;
    final cli w;
    final cli x;
    public final zfs y;
    public zab z;

    /* JADX WARN: Code duplicated, block: B:15:0x011e  */
    /* JADX WARN: Code duplicated, block: B:21:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:24:0x020f  */
    /* JADX WARN: Code duplicated, block: B:27:0x021c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0220  */
    /* JADX WARN: Code duplicated, block: B:31:0x0267  */
    /* JADX WARN: Code duplicated, block: B:34:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:37:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:38:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:41:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:49:0x0324  */
    /* JADX WARN: Code duplicated, block: B:52:0x0332  */
    /* JADX WARN: Code duplicated, block: B:60:0x0357  */
    /* JADX WARN: Code duplicated, block: B:61:0x0381  */
    /* JADX WARN: Code duplicated, block: B:64:0x038a  */
    public yyv(yup yupVar, mbc mbcVar, bvd bvdVar, zin zinVar, yza yzaVar, aunn aunnVar, ahey aheyVar, xeu xeuVar, zjr zjrVar, tfq tfqVar, Context context, tgr tgrVar, yos yosVar, hed hedVar, zkk zkkVar, aaqc aaqcVar, zeo zeoVar, agfr agfrVar, agfr agfrVar2, yha yhaVar, yfo yfoVar, awmd awmdVar, ahud ahudVar, yqy yqyVar, zeh zehVar, awmd awmdVar2, hed hedVar2, tgr tgrVar2, zfs zfsVar, agfr agfrVar3, tre treVar, zwb zwbVar, avlh avlhVar, abxv abxvVar, Optional optional, MetadataStoreImpl metadataStoreImpl, String str, aunn aunnVar2, Handler handler, zdt zdtVar, awmd awmdVar3) {
        boolean z;
        yyc yycVar;
        zjr zjrVar2;
        yye yyeVar;
        boolean z2;
        boolean z3;
        yys yysVar;
        jui juiVar;
        jui juiVar2;
        yya yyaVar;
        cbp cbpVar;
        String strEglQueryString;
        zik zikVar = new zik((byte[]) null);
        this.av = zikVar;
        this.ai = new btm();
        this.au = zikVar;
        this.an = 1.0f;
        this.E = 1.0f;
        this.J = Optional.empty();
        this.N = new Object();
        this.O = new AtomicLong(0L);
        this.k = handler;
        this.X = mbcVar;
        this.Y = bvdVar;
        this.R = new ces(bvdVar);
        this.d = yupVar;
        this.e = zinVar;
        this.ah = yqyVar;
        this.p = new yoz(context, mbcVar, zjrVar, handler, tfqVar);
        this.S = yhaVar;
        this.ar = yfoVar;
        this.as = zwbVar;
        this.at = aaqcVar;
        this.q = awmdVar2;
        this.ak = treVar;
        this.M = avlhVar;
        this.al = awmdVar3;
        int i = zic.a;
        Handler handler2 = (Handler) aunnVar2.io();
        this.l = handler2;
        zlg zlgVar = new zlg(zjrVar);
        final zle zleVar = new zle();
        int i2 = 1;
        if (zjrVar.i.m(277, 45727289L) && Build.VERSION.SDK_INT >= 29) {
            agke agkeVarR = agke.r("EGL_ANDROID_image_native_buffer", "EGL_KHR_image_base");
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            if (eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                z = false;
            } else {
                int[] iArr = new int[2];
                z = false;
                if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1) && (strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373)) != null) {
                    if (StreamSupport.stream(Iterable$EL.spliterator(agkeVarR), false).allMatch(new xdo(strEglQueryString, 17))) {
                        ImageReader imageReaderNewInstance = ImageReader.newInstance(2160, 3840, 35, Math.max(5, zjrVar.p()), 256L);
                        final ImageReaderMediaGlRenderer imageReaderMediaGlRenderer = new ImageReaderMediaGlRenderer(handler2, zlgVar, zleVar, imageReaderNewInstance, zjrVar);
                        imageReaderNewInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: yzd
                            @Override // android.media.ImageReader.OnImageAvailableListener
                            public final void onImageAvailable(ImageReader imageReader) {
                                ImageReaderMediaGlRenderer imageReaderMediaGlRenderer2 = imageReaderMediaGlRenderer;
                                try {
                                    imageReaderMediaGlRenderer2.l = true;
                                    imageReaderMediaGlRenderer2.g();
                                } catch (Exception e) {
                                    imageReaderMediaGlRenderer2.h(e);
                                }
                            }
                        }, handler2);
                        handler2.post(new Runnable() { // from class: yze
                            @Override // java.lang.Runnable
                            public final void run() {
                                ImageReaderMediaGlRenderer imageReaderMediaGlRenderer2 = imageReaderMediaGlRenderer;
                                imageReaderMediaGlRenderer2.k = zleVar.c;
                                imageReaderMediaGlRenderer2.n = true;
                            }
                        });
                        yycVar = new yyc(imageReaderMediaGlRenderer);
                        zjrVar2 = zjrVar;
                    } else {
                        z = false;
                    }
                }
            }
            this.B = yycVar;
            yyc yycVar2 = yycVar;
            yyeVar = new yye(yzaVar, yzaVar.g(aheyVar, aaqcVar, zjrVar2), new yzc(aheyVar, this, zjrVar2), zjrVar2, tfqVar, yosVar, zkkVar, hedVar, yupVar, agfrVar, agfrVar2, yycVar2);
            this.h = yyeVar;
            yzz yzzVar = new yzz(yyeVar, handler);
            this.r = yzzVar;
            this.o = new yzl(yyeVar);
            this.G = zeoVar;
            this.U = ahudVar;
            this.j = zehVar;
            this.y = zfsVar;
            yyi yyiVar = new yyi(yhaVar, yzaVar.b, zjrVar, handler, yyeVar, new yyp(this, i2));
            this.c = yyiVar;
            this.D = agfrVar3;
            jui juiVar3 = new jui(context, yyiVar, zjrVar, new yyp(yyeVar, 0), new yyp(this, 2));
            this.w = juiVar3;
            this.x = new clf(context);
            if (zjrVar.i.m(417, 45792771L)) {
                yzaVar.b.execute(afwl.i(new ywt(zjrVar, 4)));
            }
            yzj yzjVar = new yzj(yyeVar, zjrVar, tgrVar2, zehVar, new yyr(this));
            this.g = yzjVar;
            this.T = tgrVar;
            this.K = yzaVar.d;
            this.L = aheyVar;
            this.aq = xeuVar;
            if (zjrVar.fm()) {
                this.b = new yyt(this);
            }
            if (zjrVar.ei()) {
                z2 = true;
                this.F = 1;
            } else {
                z2 = true;
            }
            this.f = yzaVar.a(this, yzjVar, this.F);
            zkf.d(this.Z);
            zkf.d(this.aa);
            zkf.d(this.ab);
            zkf.d(this.ac);
            zkf.d(this.ad);
            zkf.d(this.ae);
            zkf.d(this.n);
            zkf.d(this.af);
            yyh yyhVar = new yyh(this, yyeVar, hedVar2);
            this.i = yyhVar;
            this.R.F(yyhVar);
            if (!yyeVar.d.bo()) {
                aN();
            }
            yyeVar.f.addObserver(this);
            this.m = new Handler(this.f.c());
            yyeVar.b.b = this.m;
            this.A = new PlatypusEnablingManager(zjrVar);
            z3 = z2;
            juiVar = juiVar3;
            yysVar = new yys(zjrVar, zdtVar, this, yzaVar, tgrVar2, abxvVar, metadataStoreImpl, str);
            this.C = yysVar;
            if (zjrVar.i.m(317, 45743854L)) {
                yysVar.io();
            }
            this.aj = awmdVar;
            if (z3 != (juiVar instanceof jui)) {
                juiVar2 = null;
            } else {
                juiVar2 = juiVar;
            }
            yyb yybVar = new yyb(yyeVar, handler, juiVar2);
            this.v = yybVar;
            yzo yzoVar = new yzo(this.f, yyeVar, zeoVar, yzzVar, this.aa, this.ab, this.ae, this.n, this, yysVar, yybVar, zjrVar, z3 != (juiVar instanceof jui) ? null : juiVar, optional, yycVar2);
            this.t = yzoVar;
            yyeVar.c.d = yzoVar;
            if (zjrVar.fm() && (cbpVar = this.b) != null) {
                this.f.K(cbpVar);
            }
            if (zjrVar.j.l(200, 45625151L, false)) {
                this.f.i(new csj());
            }
            if (zjrVar.y) {
                this.f.y(new dfk(context));
            }
            if (zjrVar.fz() && a.aM()) {
                this.z = new zab(zjrVar, this, context, aheyVar);
            }
            if (zjrVar.S().P) {
                this.a = new zlr(yzaVar.b, aunnVar, zjrVar, new ydm(this), new yyq(this, 0), new yyq(yyeVar, 2));
                yyaVar = null;
            } else {
                yyaVar = null;
                this.a = null;
            }
            this.u = zjrVar.an() ? yyaVar : new yya(aheyVar, yyeVar, new wkw(this, 20), new yyp(this, z3 ? 1 : 0));
            this.ap = z3;
            this.V = new hed(yyeVar.a.l, this.z);
        }
        z = false;
        SurfaceTexture surfaceTexture = new SurfaceTexture(z);
        final zae zaeVar = new zae(handler2, zlgVar, zleVar, surfaceTexture, zjrVar);
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: zac
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                zae zaeVar2 = zaeVar;
                zaeVar2.a.post(new ywt(zaeVar2, 12));
            }
        });
        zjrVar2 = zjrVar;
        handler2.post(new dzn((Object) zjrVar2, (Object) zaeVar, (Object) zleVar, 13, (byte[]) null));
        yycVar = new yyc(zaeVar);
        this.B = yycVar;
        yyc yycVar3 = yycVar;
        yyeVar = new yye(yzaVar, yzaVar.g(aheyVar, aaqcVar, zjrVar2), new yzc(aheyVar, this, zjrVar2), zjrVar2, tfqVar, yosVar, zkkVar, hedVar, yupVar, agfrVar, agfrVar2, yycVar3);
        this.h = yyeVar;
        yzz yzzVar2 = new yzz(yyeVar, handler);
        this.r = yzzVar2;
        this.o = new yzl(yyeVar);
        this.G = zeoVar;
        this.U = ahudVar;
        this.j = zehVar;
        this.y = zfsVar;
        yyi yyiVar2 = new yyi(yhaVar, yzaVar.b, zjrVar, handler, yyeVar, new yyp(this, i2));
        this.c = yyiVar2;
        this.D = agfrVar3;
        jui juiVar4 = new jui(context, yyiVar2, zjrVar, new yyp(yyeVar, 0), new yyp(this, 2));
        this.w = juiVar4;
        this.x = new clf(context);
        if (zjrVar.i.m(417, 45792771L)) {
            yzaVar.b.execute(afwl.i(new ywt(zjrVar, 4)));
        }
        yzj yzjVar2 = new yzj(yyeVar, zjrVar, tgrVar2, zehVar, new yyr(this));
        this.g = yzjVar2;
        this.T = tgrVar;
        this.K = yzaVar.d;
        this.L = aheyVar;
        this.aq = xeuVar;
        if (zjrVar.fm()) {
            this.b = new yyt(this);
        }
        if (zjrVar.ei()) {
            z2 = true;
            this.F = 1;
        } else {
            z2 = true;
        }
        this.f = yzaVar.a(this, yzjVar2, this.F);
        zkf.d(this.Z);
        zkf.d(this.aa);
        zkf.d(this.ab);
        zkf.d(this.ac);
        zkf.d(this.ad);
        zkf.d(this.ae);
        zkf.d(this.n);
        zkf.d(this.af);
        yyh yyhVar2 = new yyh(this, yyeVar, hedVar2);
        this.i = yyhVar2;
        this.R.F(yyhVar2);
        if (!yyeVar.d.bo()) {
            aN();
        }
        yyeVar.f.addObserver(this);
        this.m = new Handler(this.f.c());
        yyeVar.b.b = this.m;
        this.A = new PlatypusEnablingManager(zjrVar);
        z3 = z2;
        juiVar = juiVar4;
        yysVar = new yys(zjrVar, zdtVar, this, yzaVar, tgrVar2, abxvVar, metadataStoreImpl, str);
        this.C = yysVar;
        if (zjrVar.i.m(317, 45743854L)) {
            yysVar.io();
        }
        this.aj = awmdVar;
        if (z3 != (juiVar instanceof jui)) {
            juiVar2 = null;
        } else {
            juiVar2 = juiVar;
        }
        yyb yybVar2 = new yyb(yyeVar, handler, juiVar2);
        this.v = yybVar2;
        yzo yzoVar2 = new yzo(this.f, yyeVar, zeoVar, yzzVar2, this.aa, this.ab, this.ae, this.n, this, yysVar, yybVar2, zjrVar, z3 != (juiVar instanceof jui) ? null : juiVar, optional, yycVar3);
        this.t = yzoVar2;
        yyeVar.c.d = yzoVar2;
        if (zjrVar.fm()) {
            this.f.K(cbpVar);
        }
        if (zjrVar.j.l(200, 45625151L, false)) {
            this.f.i(new csj());
        }
        if (zjrVar.y) {
            this.f.y(new dfk(context));
        }
        if (zjrVar.fz()) {
            this.z = new zab(zjrVar, this, context, aheyVar);
        }
        if (zjrVar.S().P) {
            this.a = new zlr(yzaVar.b, aunnVar, zjrVar, new ydm(this), new yyq(this, 0), new yyq(yyeVar, 2));
            yyaVar = null;
        } else {
            yyaVar = null;
            this.a = null;
        }
        this.u = zjrVar.an() ? yyaVar : new yya(aheyVar, yyeVar, new wkw(this, 20), new yyp(this, z3 ? 1 : 0));
        this.ap = z3;
        this.V = new hed(yyeVar.a.l, this.z);
    }

    private final btm aJ() {
        btn btnVarW = this.f.w();
        if (btnVarW.n()) {
            return null;
        }
        int iL = this.f.l();
        btm btmVar = this.ai;
        btnVarW.e(iL, btmVar, 0L);
        twp twpVarD = zce.d(btmVar);
        return twpVarD != null ? ((btn) twpVarD.b).e(0, btmVar, 0L) : btmVar;
    }

    private final btm aK() {
        btn btnVarW = this.f.w();
        if (this.ao && !btnVarW.n()) {
            btm btmVar = this.ai;
            btnVarW.e(0, btmVar, 0L);
            twp twpVarD = zce.d(btmVar);
            if (twpVarD == null || twpVarD.a >= ((AtomicInteger) twpVarD.c).get()) {
                return btnVarW.e(this.f.l(), btmVar, 0L);
            }
        }
        return null;
    }

    private final zcb aL(String str, wja wjaVar, wiu wiuVar, agke agkeVar, ywn ywnVar, Integer num, boolean z) throws yof {
        yye yyeVar = this.h;
        boolean z2 = false;
        if (yyeVar.b.g() && yvq.e(agkeVar)) {
            z2 = true;
        }
        zjr zjrVar = yyeVar.d;
        abfv abfvVarN = zjb.n(wjaVar, wiuVar, zjrVar, z2, yyeVar.g);
        abfv abfvVarO = zjb.o(wjaVar, wiuVar, zjrVar, yyeVar.d(wiuVar), yyeVar.e.b.d(true, wiuVar, null, null).j);
        yod yodVarBc = bc(wjaVar, str, wiuVar, abfvVarN, abfvVarO, num, agkeVar, ywnVar, z);
        int i = zcb.d;
        return new zcb(yodVarBc, abfvVarO, abfvVarN);
    }

    private final zev aM(zev zevVar) {
        btm btmVarAK = aK();
        long j = zevVar.a;
        if (j == -1 || btmVarAK == null || btmVarAK.l) {
            return zevVar;
        }
        long jC = btmVarAK.c();
        if (j < jC) {
            String strCr = a.cr(jC, j, "transitionMs.", ";minPositionMs.");
            ywj ywjVar = zevVar.b.b;
            zhz zhzVar = new zhz("invalid.parameter", 0L, strCr);
            zhzVar.p();
            ywjVar.h(zhzVar);
        }
        long jZ = yno.z(jC, btmVarAK.b());
        if (btmVarAK.j || jZ == -9223372036854775807L || j <= jZ) {
            return zevVar;
        }
        String strCr2 = a.cr(jZ, j, "transitionMs.", ";maxPositionMs.");
        ywk ywkVar = zevVar.b;
        ywj ywjVar2 = ywkVar.b;
        zhz zhzVar2 = new zhz("invalid.parameter", 0L, strCr2);
        zhzVar2.p();
        ywjVar2.h(zhzVar2);
        return new zev(ywkVar, -1L);
    }

    private final void aN() {
        zjr zjrVar = this.h.d;
        zjrVar.addObserver(this);
        if (zjrVar.ft()) {
            ((tes) this.al.io()).b(this, tew.b, tew.c, tew.d, tew.e);
        }
    }

    private final void aO(boolean z, agke agkeVar, boolean z2) {
        yye yyeVar = this.h;
        zcf zcfVar = yyeVar.m;
        if (zcfVar != null) {
            zcd zcdVar = zcfVar.C;
            boolean zE = yvq.e(agkeVar);
            if (zE && zcdVar.b().ordinal() == 0) {
                zcb zcbVarA = zcdVar.a();
                wja wjaVar = zcfVar.A;
                wiu wiuVar = zcfVar.y;
                zjr zjrVar = zcfVar.H;
                wiu wiuVar2 = zcfVar.y;
                zcfVar.n(new zcb(zcbVarA.a, zcbVarA.c, zjb.n(wjaVar, wiuVar, zjrVar, z, yyeVar.g)));
            }
            if (!z) {
                aj(zcfVar.b, zhw.e, "hdunavailable", yyeVar.b.d(agkeVar));
            }
            akwm akwmVar = zcfVar.y.d.f;
            if (akwmVar == null) {
                akwmVar = akwm.b;
            }
            boolean z3 = false;
            boolean z4 = akwmVar.aD || zE;
            if (zcdVar.b() == zcc.b && z2 != zE) {
                z3 = true;
            }
            av(true, z4, z3);
            if (zE) {
                int iOrdinal = zcdVar.b().ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        throw new RuntimeException(null, null);
                    }
                } else if (!zcdVar.a().a.l()) {
                    yyeVar.c.c();
                    return;
                }
                yzc yzcVar = yyeVar.c;
                yzcVar.d(zcfVar);
                yzcVar.e(zcfVar);
                zlm zlmVar = yyeVar.l;
                if (zlmVar != null) {
                    this.t.n(zlmVar.B());
                }
            }
        }
    }

    private final void aP() {
        zjr zjrVar = this.h.d;
        if (zjrVar.bo()) {
            zjrVar.deleteObserver(this);
            if (zjrVar.ft()) {
                ((tes) this.al.io()).e(this);
            }
        }
    }

    private static boolean aQ(zjr zjrVar, wja wjaVar, wiu wiuVar, agfr agfrVar, boolean z) {
        if (z || wiuVar.aR()) {
            Iterator it = wir.b().iterator();
            while (it.hasNext()) {
                if (wjaVar.y(((Integer) it.next()).intValue())) {
                    return true;
                }
            }
        }
        agfr agfrVar2 = zjb.b;
        wit witVarER = zjrVar.ed() ? zjrVar.eR() : null;
        if (zjb.f(wjaVar, wiuVar, zjrVar, witVarER) || zjb.e(wjaVar, wiuVar, zjrVar, witVarER) || zjb.b(wjaVar, wiuVar, zjrVar, witVarER) || zjb.c(wiuVar, wjaVar, zjrVar, agfrVar2) || zjb.d(wiuVar, wjaVar, agfrVar2)) {
            return true;
        }
        if (zjb.g(wjaVar, wiuVar, zjrVar, zjrVar.ed() ? zjrVar.eR() : null)) {
            return true;
        }
        wit witVarER2 = zjrVar.ed() ? zjrVar.eR() : null;
        return zjb.m(wjaVar, wiuVar, zjrVar, witVarER2) || zjb.k(wjaVar, wiuVar, zjrVar, witVarER2) || zjb.l(wjaVar, wiuVar, zjrVar, agfrVar, witVarER2) || zjb.i(wjaVar, wiuVar, zjrVar, agfrVar, witVarER2) || zjb.h(wjaVar, wiuVar, zjrVar, false, witVarER2) || zjb.j(wjaVar, wiuVar, zjrVar, witVarER2);
    }

    private final boolean aR(zcd zcdVar) {
        if (zcdVar.b() == zcc.b) {
            yop yopVarC = zcdVar.c();
            boolean zCG = this.h.d.cG();
            if (!TextUtils.isEmpty(yopVarC.d())) {
                SelectableFormatsOuterClass$SelectableFormats selectableFormatsOuterClass$SelectableFormats = yopVarC.f;
                if (selectableFormatsOuterClass$SelectableFormats != null) {
                    Iterator it = selectableFormatsOuterClass$SelectableFormats.b.iterator();
                    while (it.hasNext()) {
                        FormatIdOuterClass$FormatId defaultInstance = ((SelectableFormatsOuterClass$SelectableVideoFormat) it.next()).b;
                        if (defaultInstance == null) {
                            defaultInstance = FormatIdOuterClass$FormatId.getDefaultInstance();
                        }
                        wgs wgsVarC = zic.c(defaultInstance, yopVarC.d);
                        if (wgsVarC != null && wgsVarC.r() != null && !TextUtils.isEmpty(wgsVarC.r().b) && TextUtils.equals(wgsVarC.r().b, yopVarC.d())) {
                            return true;
                        }
                    }
                }
                if (zCG) {
                    for (wgs wgsVar : yopVarC.d) {
                        if (wgsVar.af() && wgsVar.r() != null && !TextUtils.isEmpty(wgsVar.r().b) && TextUtils.equals(wgsVar.r().b, yopVarC.d())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean aS(long j, appa appaVar) {
        yye yyeVar = this.h;
        zcf zcfVar = yyeVar.m;
        if (zcfVar == null) {
            return false;
        }
        if (!zcfVar.A.H()) {
            zjr zjrVar = yyeVar.d;
            if (j != zjrVar.v()) {
                if (!zjrVar.aD()) {
                    return false;
                }
                zcfVar.Z.l("ivsk", zhf.d());
                return false;
            }
        }
        zcfVar.i = 0;
        zcfVar.m(j, appaVar);
        this.g.p();
        return true;
    }

    private final synchronized boolean aT(long j) {
        if (!(this.au instanceof yyu)) {
            return false;
        }
        long jE = e();
        return jE == -1 || (!this.h.d.j.m(245, 45659867L) ? (jE > j ? 1 : (jE == j ? 0 : -1)) >= 0 : !((j > (-1L) ? 1 : (j == (-1L) ? 0 : -1)) == 0 || (jE > (-1L) ? 1 : (jE == (-1L) ? 0 : -1)) == 0 || (jE > j ? 1 : (jE == j ? 0 : -1)) < 0));
    }

    private final cjz aU(final ywk ywkVar, yvh yvhVar) {
        final yyv yyvVar;
        wja wjaVar = ywkVar.d;
        final wiu wiuVar = ywkVar.i;
        try {
            yyvVar = this;
            try {
                return this.h.b.b(yvhVar, yyvVar, ywkVar.h, wjaVar, wiuVar, this.Y, ywkVar.b, ywkVar.c, ywkVar.o, ywkVar.a);
            } catch (cko e) {
                e = e;
                cko ckoVar = e;
                long jE = yyvVar.e();
                Throwable cause = ckoVar.getCause();
                StringBuilder sb = new StringBuilder("widevine;exo.2;reason.");
                sb.append(ckoVar.a);
                if (cause != null) {
                    sb.append(";exception.");
                    sb.append(zhf.g(cause));
                }
                final zhz zhzVar = new zhz(zhw.e, "unimplemented", jE, sb.toString());
                ywj ywjVar = ywkVar.b;
                if (wiuVar.ad()) {
                    ((lpo) yyvVar.q.io()).a().q(new low() { // from class: yym
                        @Override // defpackage.low
                        public final void e(Object obj) {
                            if (((yy) obj).a()) {
                                zah zahVar = this.a.h.b;
                                String strC = zahVar.c == null ? "" : yvq.c(zahVar.c);
                                if (strC.length() <= 0 || zhzVar.k()) {
                                    return;
                                }
                                if (Math.random() < wiuVar.a()) {
                                    ywkVar.a.l("drm", new yvg(strC).a(0L));
                                }
                            }
                        }
                    });
                }
                yyvVar.ah(ywjVar, zhzVar);
                return null;
            }
        } catch (cko e2) {
            e = e2;
            yyvVar = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private final zcf aV(ywk ywkVar, jsk jskVar) {
        yvh yvhVarA;
        ywn ywnVar;
        wiu wiuVar;
        zcd zbyVar;
        Object obj;
        wja wjaVar = ywkVar.d;
        if (wjaVar.A) {
            awmd awmdVar = this.aj;
            if (awmdVar.io() != null) {
                yvhVarA = ((yvi) awmdVar.io()).a(wjaVar.g);
            } else {
                yvhVarA = null;
            }
        } else {
            yvhVarA = null;
        }
        cjz cjzVarAU = aU(ywkVar, yvhVarA);
        if (cjzVarAU == null) {
            return null;
        }
        wiu wiuVar2 = ywkVar.i;
        ywn ywnVar2 = ywkVar.a;
        boolean zA = this.A.a(wiuVar2, wjaVar);
        if (zA && wiuVar2.aL()) {
            zbyVar = new zbz(this.h.a.e(this, ywkVar));
            ywnVar = ywnVar2;
            wiuVar = wiuVar2;
        } else {
            ywnVar = ywnVar2;
            wiuVar = wiuVar2;
            try {
                zbyVar = new zby(aL(ywkVar.h, wjaVar, wiuVar, wjaVar.n(), ywnVar, ywkVar.r, zA));
            } catch (yof e) {
                ah(ywkVar.b, hed.q(zhw.a, e, wjaVar, e()));
                return null;
            }
        }
        zcd zcdVar = zbyVar;
        aY(ywkVar, zcdVar);
        long j = ywkVar.e.a;
        yye yyeVar = this.h;
        wiu wiuVar3 = wiuVar;
        ywn ywnVar3 = ywnVar;
        zjr zjrVar = yyeVar.d;
        zcf zcfVar = new zcf(this, ywkVar, yyeVar.a.d(this, wiuVar3, wjaVar, ywnVar3, j == zjrVar.v()), zcdVar, this.K, zjrVar, cjzVarAU, this.A.b(wiuVar3, wjaVar, ywnVar3), jskVar);
        zcfVar.o = ywkVar.n;
        if (yvhVarA == null || (obj = yvhVarA.c) == null) {
            zcfVar.R = wjaVar.n();
        } else {
            zcfVar.R = (agke) obj;
        }
        return zcfVar;
    }

    private final agfp aW(ywk ywkVar) {
        yye yyeVar = this.h;
        zjr zjrVar = yyeVar.d;
        wgs.a = zjrVar.cP();
        String str = ywkVar.d.g;
        if (str != null) {
            zfs zfsVar = this.y;
            zh zhVar = new zh((byte[]) null, (char[]) null);
            zhVar.m(str);
            zfsVar.j(zhVar.l());
        }
        agfp agfpVarB = agfp.b(agdd.a);
        ywn ywnVar = ywkVar.a;
        ywkVar.a();
        wja wjaVar = ywkVar.d;
        String str2 = ywkVar.h;
        ywj ywjVar = ywkVar.b;
        ywjVar.b().v();
        yyeVar.t.x(ywnVar, str2);
        aZ(ywnVar, wjaVar, zjrVar);
        boolean zCN = zjrVar.cN();
        zeo zeoVar = this.G;
        if (zCN) {
            zeoVar.f(zsf.c);
        } else {
            ((zet) zeoVar).a = zjrVar.cT();
        }
        ywjVar.d(this.f.a());
        return agfpVarB;
    }

    private final void aX(ywk ywkVar, yyu yyuVar, agfp agfpVar, String str) {
        if (ywkVar.t != null) {
            ywkVar.t.bn(yyuVar.a.u());
        }
        this.f.M(false);
        this.h.i = ywkVar.s(2);
        Q(yyuVar);
        yoz yozVar = this.p;
        ywn ywnVar = ywkVar.a;
        try {
            zjr zjrVar = yozVar.b;
            if (zjrVar.L() > 0 && !yozVar.f.j(1) && (yozVar.d <= 0 || yozVar.a.f().toEpochMilli() - yozVar.d >= zjrVar.L())) {
                yozVar.d = yozVar.a.f().toEpochMilli();
                yozVar.c.postDelayed(new xoy(yozVar, ywnVar, 12), zjrVar.S().A);
            }
        } catch (RuntimeException unused) {
            zhq zhqVar = zhq.ABR;
        }
        agfp agfpVar2 = (agfp) yyuVar.a.ah.c;
        agfpVar2.d();
        agfpVar2.e();
        ywkVar.a.w("mlat", str + '.' + agfpVar.a(TimeUnit.MICROSECONDS));
        if (this.ap) {
            yye yyeVar = this.h;
            if (yyeVar.d.j.l(100, 45407279L, false)) {
                this.ap = false;
                trd trdVar = this.ak.h;
                int i = trd.x;
                int iA = trdVar.a(209);
                long jB = this.X.b() - ((Duration) trdVar.c.io()).toMillis();
                yyeVar.c().l("fpas", "cst." + iA + ";dur." + jB);
            }
        }
    }

    private final void aY(ywk ywkVar, zcd zcdVar) {
        zjr zjrVar = this.h.d;
        if (zjrVar.bJ()) {
            if (ywkVar.r == null && ywkVar.s == null) {
                return;
            }
            arfb arfbVar = ywkVar.s;
            zkd zkdVar = zjrVar.u;
            String str = ywkVar.h;
            if (arfbVar == null) {
                arfbVar = arfb.VIDEO_QUALITY_SETTING_ADVANCED_MENU;
            }
            zkdVar.j(str, arfbVar);
            if (ywkVar.r == null || zcdVar.b() != zcc.a) {
                return;
            }
            this.r.a(this.f, zcdVar.a().c(), 10002);
        }
    }

    private static final void aZ(ywn ywnVar, wja wjaVar, zjr zjrVar) {
        String str;
        if (zjrVar.j.m(235, 45650172L)) {
            Iterator it = wjaVar.u.iterator();
            while (it.hasNext()) {
                if (((wgs) it.next()).P()) {
                    str = "1";
                    ywnVar.l("drc", str);
                }
            }
            str = "0";
            ywnVar.l("drc", str);
        }
    }

    private static final boolean ba(zcf zcfVar) {
        return zcfVar == null || !zcfVar.H.j.m(258, 45670956L);
    }

    private final synchronized void bb(zik zikVar) {
        zik zikVar2 = this.au;
        this.au = zikVar;
        zikVar2.jr();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final yod bc(wja wjaVar, String str, wiu wiuVar, abfv abfvVar, abfv abfvVar2, Integer num, agke agkeVar, ywn ywnVar, boolean z) throws yof {
        yqi yqiVarD;
        int i;
        ?? r5 = abfvVar.a;
        Object obj = abfvVar.b;
        zjv zjvVar = zjv.c;
        int i2 = zic.a;
        yye yyeVar = this.h;
        boolean zG = yyeVar.b.g();
        int i3 = yvq.a;
        int i4 = 480;
        if (zG) {
            int size = agkeVar.size();
            int i5 = 480;
            for (int i6 = 0; i6 < size; i6++) {
                akvr akvrVarA = akvr.a(((InnertubeDrmService$AuthorizedFormat) agkeVar.get(i6)).c);
                if (akvrVarA == null) {
                    akvrVarA = akvr.DRM_TRACK_TYPE_UNSPECIFIED;
                }
                int iOrdinal = akvrVarA.ordinal();
                if (iOrdinal == 2) {
                    i = 480;
                } else if (iOrdinal != 3) {
                    i = iOrdinal != 4 ? 0 : 2160;
                } else {
                    i = 1080;
                }
                if (i > i5) {
                    i5 = i;
                }
            }
            i4 = i5;
        }
        if (!wjaVar.A || wjaVar.E()) {
            i4 = Integer.MAX_VALUE;
        }
        yqy yqyVar = this.ah;
        String str2 = wjaVar.g;
        agkz agkzVar = zkg.a;
        agkz agkzVarD = (str2 == null || (yqiVarD = yqyVar.d(str2)) == null) ? agpr.a : yqiVarD.d();
        yod yodVarA = yyeVar.e.a(wiuVar, wjaVar.t, wjaVar.w, null, r5, abfvVar2.a, zic.j(obj == zjvVar) | 4, i4, num, str, ywnVar, agkzVarD, z);
        if (yodVarA.i) {
            int iEN = yyeVar.d.eN();
            ywnVar.l("ssfr", (iEN != 2 ? iEN != 3 ? "UNRECOGNIZED" : "EXO_PLAYER_STICKY_SFR_FALLBACK_APP_CYCLE" : "EXO_PLAYER_STICKY_SFR_FALLBACK_UNSPECIFIED").replaceFirst("EXO_PLAYER_STICKY_SFR_FALLBACK_", ""));
        }
        return yodVarA;
    }

    @Override // defpackage.zew
    public final synchronized void A() {
        if (this.au instanceof yyu) {
            if (this.f.n() == 4) {
                aS(this.h.d.v(), appa.SEEK_SOURCE_START_PLAYBACK);
            }
            ay(true, false);
        }
    }

    @Override // defpackage.zew
    public final void B() {
        O(this.E);
    }

    @Override // defpackage.zew
    public final void D(ywn ywnVar) {
        zah zahVar;
        ckd ckdVar;
        yye yyeVar = this.h;
        if (yyeVar.b == null || (ckdVar = (zahVar = yyeVar.b).c) == null) {
            return;
        }
        zahVar.e(ckdVar, ywnVar);
        zahVar.c = null;
    }

    @Override // defpackage.zew
    public final void E() {
        av(false, true, false);
    }

    @Override // defpackage.zcj
    public final ListenableFuture F(zcf zcfVar) {
        return ahng.r(afwl.j(new wci(this, zcfVar, 14)), taf.a);
    }

    @Override // defpackage.zew
    public final void G() {
        yye yyeVar = this.h;
        if (yyeVar.b != null) {
            zah zahVar = yyeVar.b;
            zahVar.a.clear();
            ckd ckdVar = zahVar.c;
            if (ckdVar != null) {
                zahVar.e(ckdVar, null);
            }
        }
        zah zahVarG = yyeVar.a.g(this.L, this.at, yyeVar.d);
        zahVarG.b = this.m;
        yyeVar.b = zahVarG;
    }

    @Override // defpackage.zew
    public final void H(RestartPrefetchEvaluationSource restartPrefetchEvaluationSource, boolean z) {
        ((ytp) this.C.io()).m(restartPrefetchEvaluationSource, z);
    }

    @Override // defpackage.zew
    public final synchronized void I(long j, appa appaVar) {
        if (this.au instanceof yyu) {
            if (aS(j, appaVar)) {
                ax(false, appaVar);
            }
            yye yyeVar = this.h;
            if (yyeVar.j) {
                ay(true, false);
            } else if (yyeVar.i) {
                this.t.o(true);
            }
            zcf zcfVar = yyeVar.m;
            if (zcfVar != null) {
                zcfVar.ah.a(e(), 3);
            }
        }
    }

    @Override // defpackage.zew
    public final void J(boolean z, ajvs ajvsVar) {
        boolean z2 = true;
        if (ajvsVar.equals(ajvs.CODEC_INIT_REASON_PLAYER_SWITCH)) {
            yyb yybVar = this.v;
            if (z) {
                yybVar.b();
            } else {
                yybVar.c(6, ajvsVar);
                z2 = false;
            }
        } else {
            yyb yybVar2 = this.v;
            if (z) {
                yybVar2.d(3);
            } else {
                yybVar2.c(3, ajvsVar);
                z2 = false;
            }
        }
        if (!this.h.d.j.m(227, 45645392L) || z2) {
            return;
        }
        twv twvVar = this.C;
        if (twvVar.c()) {
            ((ytp) twvVar.io()).h();
        }
    }

    @Override // defpackage.zew
    public final synchronized void K(zlm zlmVar) {
        yye yyeVar = this.h;
        if (yyeVar.l != zlmVar) {
            if (zlmVar == null) {
                agfp agfpVarB = agfp.b(agdd.a);
                this.v.c(4, ajvs.CODEC_INIT_REASON_DETACH_MEDIA_VIEW);
                this.G.e(zsf.c);
                this.t.r(null, yyeVar.m, false, false);
                this.au.js(null);
                yyeVar.c().l("ldm", Long.toString(agfpVarB.a(TimeUnit.MILLISECONDS)));
                return;
            }
            this.v.d(4);
            this.G.h(zsf.c);
            if (!this.t.r(zlmVar, yyeVar.m, yyeVar.i && (this.au instanceof yyu), false)) {
                aD(false, true, true);
                return;
            }
            this.au.js(zlmVar);
            zlr zlrVar = this.a;
            if (zlrVar != null) {
                zlrVar.d();
            }
        }
    }

    @Override // defpackage.zew
    public final void L(int i, int i2) {
        this.t.l(i, i2);
    }

    @Override // defpackage.zew
    public final synchronized void M(float f) {
        az(f, false);
    }

    @Override // defpackage.zew
    public final void N(boolean z) {
        this.f.O(z);
    }

    @Override // defpackage.zew
    public final synchronized void O(float f) {
        hed hedVar = this.V;
        yye yyeVar = this.h;
        zcf zcfVar = yyeVar.m;
        yvy yvyVarS = hedVar.s(zcfVar, yyeVar.d, f, false);
        float f2 = yvyVarS.g;
        if (f2 != this.an) {
            zhq zhqVar = zhq.ABR;
            this.f.E(f2);
            this.an = f2;
        }
        this.E = f;
        if (zcfVar != null) {
            zcfVar.ad = yvyVarS;
            zcfVar.Z.z(f, yvyVarS.f);
        }
    }

    @Override // defpackage.zew
    public final void P(boolean z) {
        ((ytp) this.C.io()).p(z);
    }

    public final synchronized void Q(yyu yyuVar) {
        zjv zjvVarG;
        long j;
        long jV;
        wgs wgsVar;
        bb(yyuVar);
        if (this.h.d.bo()) {
            aN();
        }
        yyv yyvVar = yyuVar.i;
        zlm zlmVar = yyuVar.b;
        zcf zcfVar = yyuVar.a;
        yye yyeVar = yyvVar.h;
        if (!yyvVar.t.r(zlmVar, zcfVar, yyeVar.i, false)) {
            yyvVar.aD(false, true, true);
            return;
        }
        yyvVar.v.d(5);
        boolean z = zcfVar.t;
        boolean z2 = !z;
        if (!z) {
            if (zcfVar.g != yyeVar.d.v()) {
                yyvVar.f.N(yyuVar.d);
            } else {
                yyvVar.ad();
            }
            zlr zlrVar = yyvVar.a;
            if (zlrVar != null) {
                zlrVar.d();
            }
            yyuVar.e.r();
            zab zabVar = yyvVar.z;
            if (zabVar != null) {
                agfr agfrVarD = yyeVar.d(yyeVar.a());
                zabVar.a();
                if (a.aM() && zabVar.a.fz() && zabVar.d != null && zabVar.e == null) {
                    zabVar.e = new zaa(zabVar, zcfVar, agfrVarD);
                    zabVar.d.addOnSpatializerStateChangedListener(zabVar.c, zabVar.e);
                }
                zcfVar.Z.t(yyvVar.z.c(), yyvVar.z.b());
            }
            yyvVar.c.b(zcfVar, yyvVar.y, yyvVar.H, yyvVar.I);
        }
        try {
            zcm zcmVar = zcfVar.d;
            zcmVar.e = true;
            zjr zjrVar = yyeVar.d;
            if (zjrVar.ei()) {
                yyuVar.g(1 == (zcfVar.o & 1), zcfVar.y.J());
            }
            if (!z) {
                yyvVar.au(zcfVar, true);
                yup yupVar = yyvVar.d;
                yupVar.t();
                Map mapT = zcfVar.A.t();
                wgs wgsVar2 = zcfVar.q;
                if (wgsVar2 != null && (wgsVar = (wgs) mapT.get(wgsVar2.f)) != null) {
                    zcfVar.t(wgsVar);
                }
                wgs wgsVar3 = zcfVar.F;
                if (wgsVar3 != null) {
                    zcfVar.F = (wgs) mapT.get(wgsVar3.f);
                }
                zcfVar.t = true;
                yya yyaVar = yyvVar.u;
                if (yyaVar != null) {
                    yyaVar.a();
                }
                yyvVar.at(zcfVar, 1);
                if (zcfVar.A.A) {
                    zcfVar.Z.i("1");
                }
                yzj yzjVar = yyvVar.g;
                wiu wiuVar = zcfVar.y;
                ywn ywnVar = zcfVar.Z;
                yzjVar.l(wiuVar, ywnVar);
                yupVar.q(ywnVar, zjrVar.dy(), zcfVar.y);
                ExoPlayer exoPlayer = yyvVar.f;
                boolean z3 = zcfVar.P;
                byte[] bArr = null;
                exoPlayer.P(z3 ? null : yyvVar.T);
                if (zcfVar.H.x() > 0) {
                    zcmVar.i.c = new xxj(yyvVar, bArr);
                }
                if (!zcfVar.equals(yyeVar.m)) {
                    yyeVar.e(zcfVar);
                    afvx afvxVarAd = tym.ad(trx.EXOPLAYER_MEDIA_SOURCE_SETUP);
                    try {
                        cno cnoVarX = yyuVar.h;
                        if (cnoVarX != null) {
                            if (z3) {
                                ((ytp) yyvVar.C.io()).n(zcfVar, yyeVar.b.g());
                            }
                        } else if (z3) {
                            twv twvVar = yyvVar.C;
                            cnoVarX = ((ytp) twvVar.io()).a(zcfVar, yyuVar.b != null, yyvVar.m, yyvVar.y(zcfVar, false));
                            if (cnoVarX == null) {
                                afvxVarAd.close();
                                zcmVar.a();
                                return;
                            }
                            ((ytp) twvVar.io()).n(zcfVar, yyeVar.b.g());
                        } else {
                            cnoVarX = yyvVar.x(zcfVar);
                        }
                        ywj ywjVar = yyuVar.e;
                        yzx yzxVar = new yzx(cnoVarX, ywjVar, yyvVar.L, zjrVar);
                        long j2 = zcfVar.g;
                        if (j2 == zjrVar.v()) {
                            j = j2;
                        } else {
                            j = j2;
                            long jLongValue = zcfVar.e;
                            if (jLongValue == -1) {
                                Long lS = zcfVar.y.S();
                                jLongValue = lS != null ? lS.longValue() : -1L;
                            }
                            if (jLongValue != -1) {
                                long j3 = j - jLongValue;
                                jV = j3 <= 0 ? zjrVar.v() : j3;
                            }
                            yyvVar.aI(yzxVar, jV, ywjVar.b());
                            afvxVarAd.close();
                        }
                        jV = j;
                        yyvVar.aI(yzxVar, jV, ywjVar.b());
                        afvxVarAd.close();
                    } catch (Throwable th) {
                        try {
                            afvxVarAd.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                zcf zcfVar2 = yyuVar.a;
                if (!zcfVar2.P) {
                    yyuVar.i.aC(zcfVar2.Z);
                } else if (!zcfVar2.H.l.m(54, 45746785L)) {
                    yyv yyvVar2 = yyuVar.i;
                    ytp ytpVar = (ytp) yyvVar2.C.io();
                    boolean z4 = yyuVar.b != null;
                    yzz yzzVar = yyvVar2.r;
                    yzzVar.getClass();
                    if (ytpVar.v(z4, new ywt(yzzVar, 6), false)) {
                        yzzVar.r(null);
                    }
                }
            }
            yyv yyvVar3 = yyuVar.i;
            zcf zcfVar3 = yyuVar.a;
            yyvVar3.aE(zcfVar3);
            float f = yyuVar.c;
            if (f > 0.0f) {
                yyvVar3.az(f, true);
                yyuVar.c = -1.0f;
            }
            if (zcfVar3.H.ec() && yyuVar.g.isPresent()) {
                yyvVar3.N(((Boolean) yyuVar.g.get()).booleanValue());
                yyuVar.g = Optional.empty();
            }
            yyvVar3.ax(z2, appa.SEEK_SOURCE_UNKNOWN);
            yyvVar3.ay(yyvVar3.h.i, true);
            zcf zcfVar4 = yyuVar.a;
            zcfVar4.d.a();
            float f2 = yyuVar.f;
            if (f2 >= 0.0f) {
                yyuVar.i.O(f2);
                yyuVar.f = -1.0f;
            } else {
                yyv yyvVar4 = yyuVar.i;
                yyvVar4.O(yyvVar4.E);
            }
            yyv yyvVar5 = yyuVar.i;
            String str = zcfVar4.a;
            yyvVar5.s = str;
            yye yyeVar2 = yyvVar5.h;
            zjr zjrVar2 = yyeVar2.d;
            zjrVar2.u.h(new vnm(yyuVar, 16), str, true);
            vxz vxzVar = zjrVar2.i;
            if (vxzVar.m(133, 45644083L)) {
                yyeVar2.a.l.i = new uny(yyuVar, 19);
            }
            if (!zjrVar2.ei()) {
                yyuVar.g(1 == (zcfVar4.o & 1), zcfVar4.y.J());
            }
            yyvVar5.J = Optional.ofNullable(new zii(vxzVar.l(7, 45362389L, false), new cdv(zii.a(vxzVar.c(0, 45362390L, 0L)), zii.a(vxzVar.c(1, 45362391L, 0L))), new cdv(zii.a(vxzVar.c(2, 45362392L, 0L)), zii.a(vxzVar.c(3, 45362393L, 0L)))));
            if (zjrVar2.cv() && (zjvVarG = zcfVar4.g()) != null && !zcfVar4.y.i) {
                if (zjrVar2.et() && !zcfVar4.equals(yyeVar2.m)) {
                    cdn cdnVarD = yyvVar5.f.d(yyvVar5.n);
                    cdnVarD.g(10104);
                    cdnVarD.f(zjvVarG);
                    cdnVarD.e();
                    return;
                }
                cdn cdnVarD2 = yyvVar5.f.d(yyvVar5.n);
                cdnVarD2.g(10103);
                cdnVarD2.f(zjvVarG);
                cdnVarD2.e();
            }
        } catch (Throwable th3) {
            yyuVar.a.d.a();
            throw th3;
        }
    }

    @Override // defpackage.zew
    public final boolean R() {
        ccm ccmVar = (ccm) this.f;
        ccmVar.ae();
        return ccmVar.w;
    }

    @Override // defpackage.zew
    public final boolean S() {
        return this.f.n() == 2;
    }

    @Override // defpackage.zew
    public final boolean T(wja wjaVar, wiu wiuVar) {
        return true;
    }

    @Override // defpackage.zdo
    public final boolean U(wja wjaVar, wiu wiuVar, boolean z) {
        akwm akwmVar = wiuVar.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        if (!akwmVar.f) {
            return false;
        }
        yye yyeVar = this.h;
        return aQ(yyeVar.d, wjaVar, wiuVar, yyeVar.g, z);
    }

    @Override // defpackage.zdo
    public final boolean V() {
        return true;
    }

    @Override // defpackage.zew
    public final boolean W() {
        if (!this.f.G()) {
            return false;
        }
        int iN = this.f.n();
        return iN == 2 || iN == 3;
    }

    @Override // defpackage.zew
    public final synchronized boolean X(zev zevVar) {
        ywk ywkVar = zevVar.b;
        ywkVar.a();
        ywkVar.b.b().v();
        String str = ywkVar.d.g;
        if (str != null) {
            this.y.j(new zfe(str, 2));
        }
        yye yyeVar = this.h;
        zjr zjrVar = yyeVar.d;
        if (!(zjrVar.S().x ? aQ(zjrVar, ywkVar.d, ywkVar.i, yyeVar.g, ywkVar.s(8)) : U(ywkVar.d, ywkVar.i, ywkVar.s(8)))) {
            ((ytp) this.C.io()).w();
            return false;
        }
        zcf zcfVar = yyeVar.m;
        if (zcfVar == null) {
            ywj ywjVar = ywkVar.b;
            zhz zhzVar = new zhz("invalid.parameter", 0L, "queueVideo;playback.0");
            zhzVar.p();
            ywjVar.h(zhzVar);
            ((ytp) this.C.io()).w();
            return false;
        }
        if (this.am instanceof yzx) {
            akwm akwmVar = ywkVar.i.d.f;
            if (akwmVar == null) {
                akwmVar = akwm.b;
            }
            if (akwmVar.av) {
                boolean z = zcfVar.A.A;
                boolean z2 = ywkVar.d.A;
                if ((!z || !z2 || zjrVar.i.m(25, 45375216L)) && (z == z2 || zjrVar.er())) {
                    if (zcfVar.m == null || ((ytp) this.C.io()).t()) {
                        twv twvVar = this.C;
                        zcf zcfVarC = ((ytp) twvVar.io()).c(ywkVar.h, ywkVar.f, ywkVar.g);
                        boolean z3 = zcfVar.m != null;
                        boolean z4 = zcfVarC != null;
                        boolean zB = this.A.b(ywkVar.i, ywkVar.d, ywkVar.a);
                        if (!z3) {
                            if (z4) {
                                zev zevVarAM = aM(zevVar);
                                aZ(zcfVarC.Z, zcfVarC.A, zjrVar);
                                zcfVarC.ag = zevVarAM.b;
                                zcfVarC.l = zevVarAM.a;
                                zcfVar.m = zcfVarC;
                            } else {
                                zev zevVarAM2 = aM(zevVar);
                                ywk ywkVar2 = zevVarAM2.b;
                                aZ(ywkVar2.a, ywkVar2.d, zjrVar);
                                zcf zcfVarAV = aV(ywkVar2, zcfVar.I);
                                if (zcfVarAV == null) {
                                    ((ytp) twvVar.io()).w();
                                } else {
                                    if (zcfVarAV.P) {
                                        zcfVarAV.m(ywkVar2.e.a, appa.SEEK_SOURCE_UNKNOWN);
                                        cno cnoVarB = ((ytp) twvVar.io()).b(zevVarAM2.a, zcfVarAV, yyeVar.f(), this.m, y(zcfVarAV, true));
                                        if (cnoVarB == null) {
                                            ((ytp) twvVar.io()).w();
                                        } else {
                                            zcfVarAV.k = cnoVarB;
                                        }
                                    } else {
                                        ((ytp) twvVar.io()).w();
                                        zcfVarAV.k = x(zcfVarAV);
                                    }
                                    zcfVarAV.ag = ywkVar2;
                                    zcfVarAV.l = zevVarAM2.a;
                                    zcfVar.m = zcfVarAV;
                                }
                            }
                            aE(zcfVar);
                            return true;
                        }
                        if (!z4 && zB) {
                            zcf zcfVarAV2 = aV(ywkVar, zcfVar.I);
                            if (zcfVarAV2 == null) {
                                ((ytp) twvVar.io()).w();
                            } else {
                                zcfVarAV2.m(ywkVar.e.a, appa.SEEK_SOURCE_UNKNOWN);
                                cno cnoVarB2 = ((ytp) twvVar.io()).b(zevVar.a, zcfVarAV2, yyeVar.f(), this.m, y(zcfVarAV2, true));
                                if (cnoVarB2 == null) {
                                    ((ytp) twvVar.io()).w();
                                } else {
                                    zcfVarAV2.k = cnoVarB2;
                                }
                            }
                        } else if (!zjrVar.j.l(329, 45762922L, false) || !z4 || !zB) {
                            ((ytp) twvVar.io()).w();
                        }
                    }
                    return false;
                }
            }
        }
        ((ytp) this.C.io()).w();
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    @Override // defpackage.zew
    public final synchronized zsf Y(ywk ywkVar) throws Throwable {
        yvh yvhVarA;
        cjz cjzVarAU;
        ywn ywnVar;
        wiu wiuVar;
        zcd zbyVar;
        yvh yvhVarA2;
        try {
            PlatypusEnablingManager platypusEnablingManager = this.A;
            agfp agfpVarAW = aW(ywkVar);
            ywn ywnVar2 = ywkVar.a;
            wja wjaVar = ywkVar.d;
            String str = ywkVar.h;
            wiu wiuVar2 = ywkVar.i;
            ywj ywjVar = ywkVar.b;
            boolean zB = platypusEnablingManager.b(wiuVar2, wjaVar, ywnVar2);
            zsf zsfVar = zB ? zsf.d : zsf.c;
            yye yyeVar = this.h;
            zjr zjrVar = yyeVar.d;
            zjrVar.E.c(str, zsfVar);
            boolean zM = zjrVar.j.m(278, 45694262L);
            if (zM) {
                if (wjaVar.A) {
                    awmd awmdVar = this.aj;
                    if (awmdVar.io() != null) {
                        yvhVarA2 = ((yvi) awmdVar.io()).a(wjaVar.g);
                    } else {
                        yvhVarA2 = null;
                    }
                } else {
                    yvhVarA2 = null;
                }
                yvhVarA = yvhVarA2;
                cjzVarAU = aU(ywkVar, yvhVarA2);
            } else {
                yvhVarA = null;
                cjzVarAU = null;
            }
            if (zB && wiuVar2.aL()) {
                zbyVar = new zbz(yyeVar.a.e(this, ywkVar));
                ywnVar = ywnVar2;
                wiuVar = wiuVar2;
            } else {
                ywnVar = ywnVar2;
                wiuVar = wiuVar2;
                try {
                    zbyVar = new zby(aL(str, wjaVar, wiuVar, wjaVar.n(), ywnVar, ywkVar.r, zB));
                } catch (yof e) {
                    ah(ywjVar, hed.q(zhw.a, e, wjaVar, e()));
                }
            }
            zcd zcdVar = zbyVar;
            aY(ywkVar, zcdVar);
            if (!zM) {
                if (wjaVar.A) {
                    awmd awmdVar2 = this.aj;
                    if (awmdVar2.io() != null) {
                        yvhVarA = ((yvi) awmdVar2.io()).a(wjaVar.g);
                    } else {
                        yvhVarA = null;
                    }
                } else {
                    yvhVarA = null;
                }
                cjzVarAU = aU(ywkVar, yvhVarA);
            }
            if (cjzVarAU == null) {
                zsfVar = zB ? zsf.d : zsf.c;
            } else {
                yvh yvhVar = yvhVarA;
                long j = ywkVar.e.a;
                yye yyeVar2 = this.h;
                wiu wiuVar3 = wiuVar;
                ywn ywnVar3 = ywnVar;
                zjr zjrVar2 = yyeVar2.d;
                zcf zcfVar = new zcf(this, ywkVar, yyeVar2.a.d(this, wiuVar3, wjaVar, ywnVar3, j == zjrVar2.v()), zcdVar, this.K, zjrVar2, cjzVarAU, zB, this.ar.b(zjrVar2.aF() ? this.as.e() : null));
                if (yvhVar != null) {
                    try {
                        Object obj = yvhVar.c;
                        if (obj != null) {
                            zcfVar.R = (agke) obj;
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                aX(ywkVar, new yyu(this, ywkVar, zcfVar, false, null), agfpVarAW, "loadVideo");
            }
            return zsfVar;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.zew
    public final synchronized void Z(int i) {
        if (this.au instanceof yyu) {
            agfp agfpVarB = agfp.b(agdd.a);
            zcf zcfVar = this.h.m;
            if (zcfVar != null) {
                zcfVar.Z.A(i);
            }
            ay(false, false);
            if (zcfVar != null) {
                zcfVar.ah.a(e(), 1);
                long jA = agfpVarB.a(TimeUnit.MICROSECONDS);
                StringBuilder sb = new StringBuilder("pauseVideo.");
                sb.append(jA);
                sb.append(";r.");
                sb.append(i - 1);
                zcfVar.Z.w("mlat", sb.toString());
            }
        }
    }

    @Override // defpackage.zew
    public final float a() {
        return this.f.u().b;
    }

    public final void aA(long j) {
        synchronized (this.N) {
            if (this.Q && j == this.O.get()) {
                if (this.h.m == null) {
                    aB();
                } else {
                    this.L.execute(afwl.i(new jup(this, j, 15)));
                }
            }
        }
    }

    public final void aB() {
        if (this.h.d.bp()) {
            synchronized (this.N) {
                this.Q = false;
                this.O.incrementAndGet();
                ScheduledFuture scheduledFuture = this.P;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.P = null;
                }
            }
        }
    }

    public final void aC(ywn ywnVar) {
        twv twvVar = this.C;
        if (twvVar.c()) {
            ((ytp) twvVar.io()).q(ywnVar, this);
        }
    }

    public final synchronized void aD(boolean z, boolean z2, boolean z3) {
        Spatializer spatializer;
        zaa zaaVar;
        aP();
        aB();
        yye yyeVar = this.h;
        zcf zcfVar = yyeVar.m;
        if (!z2) {
            this.f.F();
            if (z) {
                this.t.s();
            }
        }
        aC(zcfVar != null ? zcfVar.Z : ywn.b);
        this.s = null;
        this.f.P(null);
        this.t.o(false);
        this.am = null;
        if (zcfVar != null) {
            an(zcfVar);
        }
        yyeVar.e(null);
        String strJ = zcfVar != null ? zcfVar.j() : null;
        yqt yqtVarE = strJ != null ? this.ah.e(strJ) : null;
        if (yqtVarE != null && z3) {
            yqtVarE.g();
            if (yyeVar.d.bE()) {
                zcfVar.Z.w("ocan", zhf.d());
            }
        }
        yyeVar.c.c();
        this.i.d();
        zab zabVar = this.z;
        if (zabVar != null) {
            zabVar.a();
            if (a.aM() && zabVar.a.fz() && (spatializer = zabVar.d) != null && (zaaVar = zabVar.e) != null) {
                spatializer.removeOnSpatializerStateChangedListener(zaaVar);
                zabVar.e = null;
            }
        }
        bb(this.av);
    }

    final synchronized void aE(zcf zcfVar) {
        zcf zcfVar2 = zcfVar.m;
        cno cnoVar = zcfVar2 != null ? zcfVar2.k : null;
        ywk ywkVar = zcfVar2 != null ? zcfVar2.ag : null;
        cno cnoVar2 = this.am;
        if (cnoVar2 instanceof yzx) {
            yye yyeVar = this.h;
            if (yyeVar.k) {
                ((yzx) cnoVar2).o();
                yyeVar.k = false;
            } else {
                if (zcfVar2 == null || cnoVar == null || ywkVar == null) {
                    ((yzx) cnoVar2).n();
                    return;
                }
                boolean zS = ywkVar.s(4);
                this.f.M(zS);
                zcfVar.d.h = zS;
                ((yzx) cnoVar2).q(cnoVar, zcfVar2.l, ywkVar.e.a, ywkVar.b);
                if (zS) {
                    zcfVar.Z.l("plf", "1");
                }
            }
        }
    }

    @Override // defpackage.zcg
    public final zcf aF(ywk ywkVar) {
        jsk jskVarB;
        yye yyeVar = this.h;
        zcf zcfVar = yyeVar.m;
        if (zcfVar != null) {
            jskVarB = zcfVar.I;
        } else {
            jskVarB = this.ar.b(yyeVar.d.aF() ? this.as.e() : null);
        }
        return aV(ywkVar, jskVarB);
    }

    @Override // defpackage.zcg
    public final synchronized zsf aG(zcf zcfVar, cno cnoVar, ywk ywkVar) throws Throwable {
        Throwable th;
        zsf zsfVar;
        try {
            try {
                boolean z = zcfVar.P;
                agfp agfpVarAW = aW(ywkVar);
                if (z) {
                    try {
                        zsfVar = zsf.d;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    zsfVar = zsf.c;
                }
                this.h.d.E.c(ywkVar.h, zsfVar);
                aX(ywkVar, new yyu(this, ywkVar, zcfVar, false, cnoVar), agfpVarAW, "loadPrecreatedPlayback");
                return zsfVar;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized void aH(cdy cdyVar, long j, long j2, int i) {
        this.au.jt(cdyVar, j, j2, i);
    }

    public final synchronized void aI(cno cnoVar, long j, zjd zjdVar) {
        this.am = cnoVar;
        LibopusAudioRenderer libopusAudioRenderer = this.ac;
        if (libopusAudioRenderer instanceof yzq) {
            cdn cdnVarD = this.f.d(libopusAudioRenderer);
            cdnVarD.g(10001);
            cdnVarD.f(new yxs(zjdVar, 1));
            cdnVarD.e();
        }
        LibopusAudioRenderer libopusAudioRenderer2 = this.ad;
        if (libopusAudioRenderer2 instanceof yzq) {
            cdn cdnVarD2 = this.f.d(libopusAudioRenderer2);
            cdnVarD2.g(10001);
            cdnVarD2.f(new yxs(zjdVar, 1));
            cdnVarD2.e();
        }
        cdn cdnVarD3 = this.f.d(this.Z);
        cdnVarD3.g(10001);
        cdnVarD3.f(new yxs(zjdVar, 1));
        cdnVarD3.e();
        cdn cdnVarD4 = this.f.d(this.ab);
        cdnVarD4.g(10001);
        cdnVarD4.f(new yxs(zjdVar, 2));
        cdnVarD4.e();
        cdn cdnVarD5 = this.f.d(this.aa);
        cdnVarD5.g(10001);
        cdnVarD5.f(new yxs(zjdVar, 2));
        cdnVarD5.e();
        if (j <= 0 || j == this.h.d.v()) {
            ExoPlayer exoPlayer = this.f;
            ((ccm) exoPlayer).ae();
            List listSingletonList = Collections.singletonList(cnoVar);
            ((ccm) exoPlayer).ae();
            ((ccm) exoPlayer).ag(listSingletonList);
        } else {
            ExoPlayer exoPlayer2 = this.f;
            ((ccm) exoPlayer2).ae();
            ((ccm) exoPlayer2).af(Collections.singletonList(cnoVar), j);
        }
        zjdVar.u();
        this.f.z();
        long jD = this.h.d.i.d(8, 45373696L);
        if (jD > 0) {
            yno.S(this.L, new tpo(14), jD, ywn.b, this.aq, "PTM lov lock removal failed.");
        }
    }

    @Override // defpackage.zew
    public final void aa(boolean z, int i) {
        agfp agfpVarB = agfp.b(agdd.a);
        yye yyeVar = this.h;
        zcf zcfVar = yyeVar.m;
        if (zcfVar != null) {
            zcfVar.Z.A(i);
        }
        this.G.n(zsf.c);
        ywj ywjVarB = yyeVar.b();
        if (z) {
            ywjVarB.y();
        }
        this.v.c(5, ajvs.CODEC_INIT_REASON_STOP);
        this.i.d();
        aD(false, false, ba(zcfVar));
        if (zcfVar != null) {
            zcfVar.ah.a(e(), 2);
            zcfVar.Z.w("mlat", "stopVideo." + agfpVarB.a(TimeUnit.MICROSECONDS));
        }
    }

    @Override // defpackage.zew
    public final void ab(int i) {
        yye yyeVar = this.h;
        zcf zcfVar = yyeVar.m;
        if (zcfVar != null) {
            zcfVar.Z.A(i);
        }
        this.G.c(zsf.c);
        this.v.c(5, ajvs.CODEC_INIT_REASON_STOP);
        yyeVar.b().y();
        aD(true, false, ba(zcfVar));
    }

    @Override // defpackage.zew
    public final void ac(acca accaVar) {
        yye yyeVar = this.h;
        zcf zcfVar = yyeVar.m;
        if (zcfVar != null && zcfVar.P) {
            ((ytp) this.C.io()).y(accaVar, zcfVar);
        } else {
            yyeVar.c().w(zcfVar == null ? "ctsnp" : "ctsmfu", "track:".concat(String.valueOf(accaVar != null ? accaVar.n : "null")));
        }
    }

    public final void ad() {
        this.f.N(cdv.a);
    }

    @Override // defpackage.zcj
    public final void ae(zcf zcfVar) {
        this.r.r(null);
    }

    public final synchronized void af(zcf zcfVar, appa appaVar) {
        yye yyeVar = this.h;
        if (zcfVar.equals(yyeVar.m)) {
            I(yyeVar.d.v(), appaVar);
        }
    }

    public final synchronized void ag(zcf zcfVar, boolean z) {
        aB();
        this.t.o(false);
        if (!z) {
            an(zcfVar);
            return;
        }
        yye yyeVar = this.h;
        yyeVar.i = false;
        yyeVar.j = true;
    }

    public final void ah(ywj ywjVar, zhz zhzVar) {
        ywjVar.h(zhzVar);
        if (ywjVar.equals(this.h.b()) && zhzVar.f) {
            aD(false, false, true);
        }
    }

    @Override // defpackage.zcj
    public final void ai(zcf zcfVar, ywj ywjVar, zhz zhzVar) {
        ah(ywjVar, zhzVar);
    }

    public final void aj(ywj ywjVar, zhw zhwVar, String str, String str2) {
        ah(ywjVar, new zhz(zhwVar, str, e(), str2));
    }

    public final synchronized void ak(ywj ywjVar, zhz zhzVar, zcf zcfVar, cbo cboVar) {
        if (zhzVar.f().equals("fmt.decode")) {
            zeo zeoVar = this.G;
            zeoVar.d(zsf.c, cboVar);
            zeoVar.b(zcfVar.Z);
        }
        zcf zcfVar2 = zcfVar.m;
        yye yyeVar = this.h;
        zcf zcfVar3 = yyeVar.m;
        boolean z = zcfVar3 != null && zcfVar3.w;
        Throwable cause = cboVar.getCause();
        if (zcfVar2 != null && zhzVar.f().equals("fmt.decode") && zcfVar.equals(zcfVar3) && (z || aT(zcfVar2.l))) {
            zhz zhzVar2 = new zhz("load.next", zhzVar.a(), "w." + zhzVar.f() + ";info." + zhzVar.e);
            zhzVar2.o();
            ywjVar.h(zhzVar2);
            return;
        }
        if (zhzVar.f().equals("offline.partial.nocontent")) {
            ywjVar.h(zhzVar);
            return;
        }
        if (cause instanceof bwj) {
            bwj bwjVar = (bwj) cause;
            if (zcfVar.H.i.m(294, 45732649L)) {
                ywj ywjVar2 = zcfVar.b;
                long jA = zhzVar.a();
                long jD = d();
                long jI = i();
                long jH = h();
                int i = bwjVar.a;
                String str = "stuckType." + i + ";timeout." + bwjVar.b + ";pos." + jA + ";buf." + jD + ";liveSq." + jI + ";liveMediaTimeMs." + jH;
                ywjVar2.h((i == 0 || i == 1) ? new zhz("android.stuck.buffering", jA, str) : new zhz("android.stuck.playing", jA, str));
                return;
            }
        }
        if (zhzVar.f().equals("player.timeout")) {
            if (!Objects.equals(zcfVar, zcfVar3)) {
                zcfVar.b.h(zhzVar);
                return;
            } else {
                zhzVar.o();
                ywjVar.h(zhzVar);
                return;
            }
        }
        if (!zhzVar.f().equals("staleconfig")) {
            zhzVar.o();
        }
        ywjVar.h(zhzVar);
        if (ywjVar.equals(yyeVar.b())) {
            aD(false, false, true);
        }
    }

    public final synchronized void al(zhz zhzVar) {
        zcf zcfVar = this.h.m;
        if (zcfVar != null) {
            ah(zcfVar.b, zhzVar);
        }
    }

    public final synchronized void am(zcf zcfVar) {
        if (zcfVar.H.y && !this.f.G() && this.f.o() == 3) {
            ay(false, false);
            return;
        }
        yye yyeVar = this.h;
        zjr zjrVar = yyeVar.d;
        if (zjrVar.j.m(105, 45408454L) && yyeVar.i) {
            ywj ywjVar = zcfVar.b;
            ywjVar.b().ad();
            zhv zhvVar = new zhv(true != zjrVar.an() ? "android.stuck.bufferfull" : "android.stuck.buffering");
            zhvVar.e(e());
            zhvVar.c = "invalid playWhenReady";
            zhz zhzVarA = zhvVar.a();
            zhzVarA.p();
            ah(ywjVar, zhzVarA);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public final void an(zcf zcfVar) {
        int i;
        int i2 = zjo.a;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        arrayList.add("video/x-vnd.on2.vp9");
        arrayList.add("video/av01");
        arrayList.add("video/avc");
        int size = arrayList.size();
        ?? r6 = 0;
        int i3 = 0;
        while (i3 < size) {
            String str = (String) arrayList.get(i3);
            Boolean[] boolArr = new Boolean[2];
            boolArr[r6] = Boolean.TRUE;
            boolean z = true;
            boolArr[1] = Boolean.FALSE;
            Iterator it = Arrays.asList(boolArr).iterator();
            while (true) {
                i = i3 + 1;
                if (it.hasNext()) {
                    try {
                        Iterator it2 = cma.e(str, ((Boolean) it.next()).booleanValue(), r6).iterator();
                        r6 = r6;
                        while (it2.hasNext()) {
                            clo cloVar = (clo) it2.next();
                            boolean z2 = cloVar.i;
                            int i4 = zic.a;
                            String str2 = "0";
                            String str3 = z != z2 ? "0" : "1";
                            String str4 = z != cloVar.j ? "0" : "1";
                            String str5 = z != cloVar.f ? "0" : "1";
                            Iterator it3 = it2;
                            String str6 = z != cloVar.h ? "0" : "1";
                            ArrayList arrayList2 = arrayList;
                            String str7 = z != cloVar.k ? "0" : "1";
                            int i5 = size;
                            if (z == cloVar.g) {
                                str2 = "1";
                            }
                            sb.append("hw." + str3 + "_sw." + str4 + "_a." + str5 + "_s." + str6 + "_v." + str7 + "_t." + str2 + ((String) DesugarArrays.stream(cloVar.k()).map(new yom(9)).collect(Collectors.joining(""))) + "_n." + cloVar.b);
                            sb.append("__");
                            it2 = it3;
                            arrayList = arrayList2;
                            size = i5;
                            r6 = 0;
                            z = true;
                        }
                    } catch (cly e) {
                        sb.append(e.getMessage());
                        arrayList = arrayList;
                        size = size;
                        r6 = 0;
                        z = true;
                    }
                }
            }
            i3 = i;
            r6 = r6;
        }
        ywn ywnVar = zcfVar.Z;
        ywnVar.l("decs", sb.toString());
        zjr zjrVar = this.h.d;
        vxz vxzVar = zjrVar.i;
        if (vxzVar.m(365, 45766780L)) {
            ywnVar.l("darch", zjrVar.x);
        }
        if (vxzVar.m(502, 45841020L)) {
            if (zjrVar.w == null) {
                ActivityManager activityManager = (ActivityManager) zjrVar.q.getSystemService("activity");
                ConfigurationInfo deviceConfigurationInfo = activityManager != null ? activityManager.getDeviceConfigurationInfo() : null;
                zjrVar.w = deviceConfigurationInfo != null ? deviceConfigurationInfo.getGlEsVersion() : "unknown";
            }
            ywnVar.l("opglesv", zjrVar.w);
        }
        zlr zlrVar = this.a;
        if (zlrVar != null) {
            String strA = zlrVar.a();
            if (!strA.isEmpty()) {
                ywnVar.l("scd", strA);
            }
        }
        zeo zeoVar = this.G;
        if (zeoVar.u()) {
            zeoVar.b(ywnVar);
        }
        au(zcfVar, false);
    }

    public final synchronized void ao(int i) {
        zcf zcfVar = this.h.m;
        if (zcfVar == null) {
            return;
        }
        ah(zcfVar.b, new zhz("player.exception", e(), a.bR(i, "pixelCopyErrorCode.")));
    }

    public final synchronized void ap(zlo zloVar) {
        yye yyeVar = this.h;
        zcf zcfVar = yyeVar.m;
        agke agkeVar = zcfVar != null ? zcfVar.R : agpi.a;
        if (yyeVar.b.h(zloVar, agkeVar)) {
            aO(false, agkeVar, yvq.e(agkeVar));
        }
        if (zcfVar != null && zcfVar.P) {
            ((ytp) this.C.io()).n(zcfVar, yyeVar.b.g());
        }
    }

    public final synchronized void aq(zcf zcfVar, int i) {
        this.ao = 1 == i;
        if (i != 0 && zcfVar != null) {
            yye yyeVar = this.h;
            if (zcfVar.equals(yyeVar.m)) {
                btm btmVarAJ = aJ();
                if (btmVarAJ != null && btmVarAJ.n != -9223372036854775807L) {
                    long jC = btmVarAJ.c();
                    zcfVar.b.k(jC, bwp.F(btmVarAJ.n) + jC);
                }
                if (!zcfVar.P || !yyeVar.d.dI()) {
                    ax(false, appa.SEEK_SOURCE_UNKNOWN);
                }
            }
        }
    }

    public final void ar(zcf zcfVar) {
        yye yyeVar = this.h;
        Object objIo = yyeVar.f.io();
        this.r.a(this.f, objIo, 10001);
        zkj zkjVar = (zkj) objIo;
        if (zkjVar.d > 0 || zkjVar.c > 0) {
            zcfVar.v(yyeVar.d, yyeVar.s, zkjVar, 10001, yyeVar.f());
        }
    }

    @Override // defpackage.zcj
    public final void as(boolean z) {
        yxi yxiVar;
        zcf zcfVar = this.h.m;
        if (zcfVar == null || (yxiVar = zcfVar.c) == null) {
            return;
        }
        yxiVar.bo(z);
    }

    public final void at(zcf zcfVar, int i) {
        this.r.a(this.f, zcfVar.c().c(), 10002);
        yye yyeVar = this.h;
        Object objIo = yyeVar.f.io();
        tfq tfqVar = yyeVar.s;
        boolean zF = yyeVar.f();
        zcfVar.v(yyeVar.d, tfqVar, (zkj) objIo, i, zF);
    }

    public final void au(zcf zcfVar, boolean z) {
        int iQ = q();
        if (zcfVar.G != iQ) {
            zcfVar.G = iQ;
        }
        ywn ywnVar = zcfVar.Z;
        ywnVar.j(iQ, z);
        zjr zjrVar = this.h.d;
        vxz vxzVar = zjrVar.i;
        if (vxzVar.l(186, 45681268L, false) || zjrVar.ey()) {
            ywnVar.q(this.i.b(), z);
        }
        if (vxzVar.m(436, 45799330L)) {
            ywnVar.s(this.i.c(), z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x014e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0150  */
    /* JADX WARN: Code duplicated, block: B:54:0x0155  */
    /* JADX WARN: Code duplicated, block: B:57:0x0170  */
    /* JADX WARN: Code duplicated, block: B:59:0x017e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0190  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:72:0x01cc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:85:0x0211  */
    /* JADX WARN: Code duplicated, block: B:90:0x0223  */
    /* JADX WARN: Code duplicated, block: B:92:0x0230 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0232  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5, types: [yoe] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final void av(boolean z, boolean z2, boolean z3) {
        bts btsVar;
        MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilities;
        ?? r4;
        boolean zEquals;
        boolean zJ;
        boolean zJ2;
        MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilitiesB;
        boolean zU;
        boolean z4;
        boolean z5;
        boolean z6;
        yzj yzjVar;
        yye yyeVar;
        wgs wgsVar;
        yye yyeVar2 = this.h;
        zcf zcfVar = yyeVar2.m;
        if (zcfVar != null) {
            yoe yoeVarC = zcfVar.c();
            boolean zAR = aR(zcfVar.C);
            boolean z7 = (!yyeVar2.d.cG() || (wgsVar = zcfVar.F) == null || wgsVar.r() == null || TextUtils.isEmpty(wgsVar.r().b)) ? false : true;
            MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilitiesB2 = zcfVar.b();
            zcd zcdVar = zcfVar.C;
            int iOrdinal = zcdVar.b().ordinal();
            if (iOrdinal == 0) {
                zcb zcbVarA = zcdVar.a();
                try {
                    try {
                        try {
                            try {
                                try {
                                    mediaCapabilitiesOuterClass$MediaCapabilities = mediaCapabilitiesOuterClass$MediaCapabilitiesB2;
                                    btsVar = null;
                                    try {
                                        yod yodVarBc = bc(zcfVar.A, zcfVar.a, zcfVar.y, zcbVarA.b, zcbVarA.c, null, zcfVar.R, zcfVar.Z, zcfVar.P);
                                        zcfVar.n(new zcb(yodVarBc, zcbVarA.c, zcbVarA.b));
                                        r4 = yodVarBc;
                                    } catch (yof e) {
                                        e = e;
                                        ah(zcfVar.b, hed.q(zhw.a, e, zcfVar.A, e()));
                                        r4 = btsVar;
                                    }
                                } catch (yof e2) {
                                    e = e2;
                                    mediaCapabilitiesOuterClass$MediaCapabilities = mediaCapabilitiesOuterClass$MediaCapabilitiesB2;
                                    btsVar = null;
                                    ah(zcfVar.b, hed.q(zhw.a, e, zcfVar.A, e()));
                                    r4 = btsVar;
                                    if (r4 != 0) {
                                        if (z) {
                                            at(zcfVar, 0);
                                        } else {
                                            this.r.a(this.f, r4.c(), 10002);
                                        }
                                        zEquals = Objects.equals(r4.d(), yoeVarC.d());
                                        if (!zEquals) {
                                            yzjVar = this.g;
                                            yyeVar = yzjVar.a;
                                            if (yyeVar.a().aD()) {
                                                yyeVar.c().w("mvas", "start");
                                                yzjVar.f = true;
                                            }
                                        }
                                        if (zcfVar.P) {
                                            if (z2) {
                                                this.r.r(btsVar);
                                                return;
                                            }
                                            return;
                                        }
                                        boolean zH = r4.h();
                                        boolean zH2 = yoeVarC.h();
                                        zJ = yoeVarC.j();
                                        zJ2 = r4.j();
                                        mediaCapabilitiesOuterClass$MediaCapabilitiesB = zcfVar.b();
                                        if (zJ != zJ2) {
                                            zU = true;
                                        } else {
                                            zU = yno.u(mediaCapabilitiesOuterClass$MediaCapabilities, mediaCapabilitiesOuterClass$MediaCapabilitiesB);
                                        }
                                        if (zEquals) {
                                            boolean zAR2 = aR(zcfVar.C);
                                            z4 = false;
                                            if (this.h.d.j.l(284, 45704336L, false)) {
                                                z5 = false;
                                            } else {
                                                z5 = false;
                                            }
                                            ((ytp) this.C.io()).i(zcfVar, z5);
                                        } else {
                                            boolean zAR3 = aR(zcfVar.C);
                                            z4 = false;
                                            if (this.h.d.j.l(284, 45704336L, false)) {
                                                z5 = false;
                                            } else {
                                                z5 = false;
                                            }
                                            ((ytp) this.C.io()).i(zcfVar, z5);
                                        }
                                        if (!this.h.d.i.m(375, 45773925L)) {
                                        }
                                        if (Objects.equals(r4.c(), yoeVarC.c())) {
                                        }
                                        if (zcfVar.A.A) {
                                            z6 = z4;
                                        } else {
                                            z6 = z4;
                                        }
                                        ((ytp) this.C.io()).k(zcfVar, z6);
                                    }
                                }
                            } catch (yof e3) {
                                e = e3;
                                mediaCapabilitiesOuterClass$MediaCapabilities = mediaCapabilitiesOuterClass$MediaCapabilitiesB2;
                            }
                        } catch (yof e4) {
                            e = e4;
                            mediaCapabilitiesOuterClass$MediaCapabilities = mediaCapabilitiesOuterClass$MediaCapabilitiesB2;
                        }
                    } catch (yof e5) {
                        e = e5;
                        mediaCapabilitiesOuterClass$MediaCapabilities = mediaCapabilitiesOuterClass$MediaCapabilitiesB2;
                    }
                } catch (yof e6) {
                    e = e6;
                    btsVar = null;
                    mediaCapabilitiesOuterClass$MediaCapabilities = mediaCapabilitiesOuterClass$MediaCapabilitiesB2;
                }
            } else {
                if (iOrdinal != 1) {
                    throw new RuntimeException(null, null);
                }
                yop yopVarC = zcdVar.c();
                yye yyeVar3 = this.h;
                yop yopVarN = yyeVar3.d.R().G ? yop.n(yyeVar3.a.b(zcfVar), yopVarC.b, yopVarC.c, yopVarC.d, yopVarC.e, yopVarC.f, zjo.a(zcfVar.y, zcfVar.H, yno.ct(zcfVar.A), yyeVar3.b.g(), zjb.c, zjb.a, zjb.b), yopVarC.l, false, false, yopVarC.m, yopVarC.n, yopVarC.o, yopVarC.p) : yop.n(yyeVar3.a.b(zcfVar), yopVarC.b, yopVarC.c, yopVarC.d, yopVarC.e, yopVarC.f, yopVarC.k, yopVarC.l, false, false, yopVarC.m, yopVarC.n, yopVarC.o, yopVarC.p);
                zcfVar.o(yopVarN);
                r4 = yopVarN;
                mediaCapabilitiesOuterClass$MediaCapabilities = mediaCapabilitiesOuterClass$MediaCapabilitiesB2;
                btsVar = null;
            }
            if (r4 != 0) {
                if (z) {
                    at(zcfVar, 0);
                } else {
                    this.r.a(this.f, r4.c(), 10002);
                }
                zEquals = Objects.equals(r4.d(), yoeVarC.d());
                if (!zEquals) {
                    yzjVar = this.g;
                    yyeVar = yzjVar.a;
                    if (yyeVar.a().aD()) {
                        yyeVar.c().w("mvas", "start");
                        yzjVar.f = true;
                    }
                }
                if (zcfVar.P) {
                    if (z2) {
                        this.r.r(btsVar);
                        return;
                    }
                    return;
                }
                boolean zH3 = r4.h();
                boolean zH4 = yoeVarC.h();
                zJ = yoeVarC.j();
                zJ2 = r4.j();
                mediaCapabilitiesOuterClass$MediaCapabilitiesB = zcfVar.b();
                if (zJ != zJ2) {
                    zU = true;
                } else {
                    zU = yno.u(mediaCapabilitiesOuterClass$MediaCapabilities, mediaCapabilitiesOuterClass$MediaCapabilitiesB);
                }
                if (zEquals || zU || zH3 != zH4) {
                    boolean zAR4 = aR(zcfVar.C);
                    z4 = false;
                    if (this.h.d.j.l(284, 45704336L, false) || zEquals || !(z7 || zAR || zAR4)) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    ((ytp) this.C.io()).i(zcfVar, z5);
                } else {
                    z4 = false;
                }
                if (!this.h.d.i.m(375, 45773925L) && z3) {
                    ((ytp) this.C.io()).k(zcfVar, true);
                    return;
                }
                if (Objects.equals(r4.c(), yoeVarC.c())) {
                    if (zcfVar.A.A || r4.l() == yoeVarC.l()) {
                        z6 = z4;
                    } else {
                        z6 = true;
                    }
                    ((ytp) this.C.io()).k(zcfVar, z6);
                }
            }
        }
    }

    public final void aw() {
        aP();
        aB();
        dje djeVar = this.R.g;
        yyh yyhVar = this.i;
        djeVar.g(yyhVar);
        this.f.L();
        this.R = new ces(this.Y);
        yye yyeVar = this.h;
        if (yyeVar.d.ei()) {
            this.F = 1;
        }
        this.f = yyeVar.a.a(this, this.g, this.F);
        this.R.F(yyhVar);
        this.m = new Handler(this.f.c());
        G();
        yzo yzoVar = this.t;
        ExoPlayer exoPlayer = this.f;
        yzt yztVar = this.aa;
        yzr yzrVar = this.ab;
        Libdav1dVideoRenderer libdav1dVideoRenderer = this.ae;
        jux juxVar = this.n;
        yzoVar.j = null;
        yzoVar.d = exoPlayer;
        yzoVar.e = yztVar;
        yzoVar.f = yzrVar;
        yzoVar.g = libdav1dVideoRenderer;
        yzoVar.h = juxVar;
        yzoVar.h.by(new dov(new tar(yzoVar, 19), (byte[]) null));
        yzoVar.k = null;
        yyb yybVar = this.v;
        yybVar.c(6, ajvs.CODEC_INIT_REASON_PLAYER_RESET);
        yybVar.b();
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0274  */
    /* JADX WARN: Code duplicated, block: B:117:0x0281  */
    /* JADX WARN: Code duplicated, block: B:118:0x0283  */
    /* JADX WARN: Code duplicated, block: B:121:0x0288 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x028c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0291  */
    /* JADX WARN: Code duplicated, block: B:129:0x0297  */
    /* JADX WARN: Code duplicated, block: B:132:0x029c  */
    /* JADX WARN: Code duplicated, block: B:134:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:136:0x02a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:140:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:143:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:146:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:148:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:154:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:155:0x0304  */
    /* JADX WARN: Code duplicated, block: B:159:0x0321  */
    /* JADX WARN: Code duplicated, block: B:160:0x032d  */
    /* JADX WARN: Code duplicated, block: B:162:0x0343  */
    /* JADX WARN: Code duplicated, block: B:165:0x034c  */
    /* JADX WARN: Code duplicated, block: B:167:0x0356  */
    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0082  */
    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:45:0x00be  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:57:0x011c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0162  */
    /* JADX WARN: Code duplicated, block: B:64:0x0166  */
    /* JADX WARN: Code duplicated, block: B:65:0x0170  */
    /* JADX WARN: Code duplicated, block: B:69:0x0181 A[ADDED_TO_REGION] */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d4, code lost:
    
        if (((r6.a() - r8) - ((long) r6.n)) > r6.i) goto L105;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:56:0x00f8, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ax(boolean r25, defpackage.appa r26) {
        /*
            Method dump skipped, instruction units count: 867
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yyv.ax(boolean, appa):void");
    }

    final synchronized void ay(boolean z, boolean z2) {
        yye yyeVar = this.h;
        if (yyeVar.i != z || z2) {
            yyeVar.i = z;
            if (z) {
                yyeVar.j = false;
                yyeVar.b().b().A();
                if (yyeVar.d.bp()) {
                    synchronized (this.N) {
                        try {
                            if (!this.Q) {
                                this.Q = true;
                                this.K.execute(afwl.i(new jup(this, this.O.incrementAndGet(), 16)));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (this.h.d.bn()) {
                    this.g.n();
                }
            } else {
                this.h.b().b().z();
                aB();
            }
            this.f.A(z);
            this.t.o(z);
        }
    }

    public final void az(float f, boolean z) {
        zcf zcfVar = this.h.m;
        if (zcfVar != null) {
            zjr zjrVar = zcfVar.H;
            if (zjrVar.fm() && !zjrVar.fn() && (z || f != a())) {
                yzz yzzVar = this.r;
                boolean z2 = !ahbd.c(f, 1.0d, 9.999999747378752E-6d);
                zcf zcfVar2 = yzzVar.a.m;
                if (zcfVar2 != null && zcfVar2.U != z2) {
                    zcfVar2.U = z2;
                    yzzVar.r(null);
                }
            }
            if (f != a()) {
                this.f.B(new btb(f, 1.0f));
                zcfVar.p = f;
                this.r.b(this.f, f);
                if (zcfVar.P) {
                    ((ytp) this.C.io()).o(zcfVar);
                    return;
                }
                return;
            }
            if (z) {
                zcfVar.b.p(f);
                if (ahbd.c(f, 1.0d, 9.999999747378752E-6d)) {
                    return;
                }
                this.r.b(this.f, f);
                zcfVar.p = f;
                if (zcfVar.P) {
                    ((ytp) this.C.io()).o(zcfVar);
                }
            }
        }
    }

    @Override // defpackage.zew
    public final int b(wja wjaVar, wiu wiuVar) {
        int i = true != yno.x(wjaVar, wiuVar.g) ? 4 : 5;
        if (this.h.d.bl()) {
            i |= 16;
        }
        if (wiuVar.aG()) {
            i |= 2;
        }
        ajar ajarVar = wiuVar.d.v;
        if (ajarVar == null) {
            ajarVar = ajar.a;
        }
        if (ajarVar.e && wjaVar.v()) {
            i |= 8;
        }
        return this.A.a(wiuVar, wjaVar) ? i | 32 : i;
    }

    @Override // defpackage.zew
    public final int c() {
        zcf zcfVar = this.h.m;
        if (zcfVar != null) {
            zfc zfcVar = zcfVar.x;
        } else {
            zfc zfcVar2 = zfc.a;
        }
        long jF = f();
        long epochMilli = this.X.f().toEpochMilli();
        if (jF <= 0 || epochMilli <= 0 || epochMilli <= jF) {
            return -1;
        }
        try {
            return ahng.K(epochMilli - jF);
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    @Override // defpackage.zew
    public final long d() {
        btm btmVarAJ = aJ();
        if (btmVarAJ == null) {
            return -1L;
        }
        return btmVarAJ.c() + this.f.q();
    }

    @Override // defpackage.zew
    public final long e() {
        btm btmVarAJ = aJ();
        if (btmVarAJ == null) {
            return -1L;
        }
        return btmVarAJ.c() + this.f.r();
    }

    @Override // defpackage.zew
    public final long f() {
        btm btmVarAJ = aJ();
        if (btmVarAJ != null) {
            long j = btmVarAJ.g;
            if (j != -9223372036854775807L) {
                return j + this.f.r();
            }
        }
        return -1L;
    }

    @Override // defpackage.zew
    public final long g() {
        btm btmVarAJ = aJ();
        if (btmVarAJ == null || btmVarAJ.n == -9223372036854775807L) {
            return -1L;
        }
        return btmVarAJ.c() + (btmVarAJ.n / 1000);
    }

    @Override // defpackage.zew
    public final long h() {
        zcf zcfVar = this.h.m;
        zfc zfcVar = zcfVar != null ? zcfVar.x : zfc.a;
        if (zfcVar.k == Long.MAX_VALUE) {
            return -1L;
        }
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        return zfcVar.k / 1000;
    }

    @Override // defpackage.zew
    public final long i() {
        zcf zcfVar = this.h.m;
        return (zcfVar != null ? zcfVar.x : zfc.a).j;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [cno, zap] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.zew
    public final long j(long j) {
        ?? r3 = this.am;
        if (!(r3 instanceof zap)) {
            return -1L;
        }
        long jJE = r3.jE(bwp.y(j));
        if (jJE != -1) {
            return jJE;
        }
        return -1L;
    }

    @Override // defpackage.cdt
    public final cdp[] jA(Handler handler, cty ctyVar, cfx cfxVar, cch cchVar, cch cchVar2) {
        yzq yzqVar;
        zeo zeoVar;
        yye yyeVar = this.h;
        zjr zjrVar = yyeVar.d;
        if (zjrVar.G() > 0) {
            zjrVar.G();
        }
        final yza yzaVar = yyeVar.a;
        cgz cgzVar = new cgz();
        cff cffVar = cff.a;
        cgzVar.b(cffVar);
        cgzVar.b = new che();
        cgzVar.f = new ayq(new buj[0], yza.f(zjrVar), new bup());
        cgzVar.d = new yxz(yyeVar, yzaVar.m);
        cgzVar.e = this.b;
        chd chdVarA = cgzVar.a();
        zht zhtVar = yzaVar.o;
        cgf zhsVar = zhtVar != null ? new zhs(chdVarA, zhtVar) : chdVarA;
        Context context = yzaVar.i;
        yzl yzlVar = this.o;
        this.Z = new yzs(context, cfxVar, yyeVar, handler, yzlVar, zhsVar, this.x);
        zeo zeoVar2 = this.G;
        long jN = zjrVar.n();
        cli cliVar = this.w;
        this.aa = new yzt(context, ctyVar, yyeVar, handler, yzlVar, zeoVar2, jN, cliVar);
        this.ab = new yzr(handler, ctyVar, Math.max(tym.G() + zjrVar.S().f, 1), zjrVar.S().g, zjrVar.S().h, yyeVar.c, zjrVar.n(), yyeVar);
        if (zhtVar != null || zjrVar.fm()) {
            cgz cgzVar2 = new cgz();
            cgzVar2.f = new ayq(new buj[0], yza.f(zjrVar), new bup());
            cgzVar2.e = this.b;
            cgf cgfVarA = cgzVar2.a();
            if (zhtVar != null) {
                cgfVarA = new zhs(cgfVarA, zhtVar);
            }
            yzqVar = new yzq(cfxVar, handler, yyeVar, cgfVarA);
        } else {
            cgz cgzVar3 = new cgz();
            cgzVar3.f = new ayq(new buj[0], yza.f(zjrVar), new bup());
            cgzVar3.b(cffVar);
            yzqVar = new yzq(cfxVar, handler, yyeVar, cgzVar3.a());
        }
        this.ac = yzqVar;
        buj[] bujVarArr = {new yxy(this.U, yyeVar)};
        cgz cgzVar4 = new cgz();
        cgzVar4.b(cffVar);
        cgzVar4.f = new ayq(bujVarArr, yza.f(zjrVar), new bup());
        this.ad = new yzq(cfxVar, handler, yyeVar, cgzVar4.a());
        this.ae = new yzp(handler, ctyVar, zjrVar.j(), zjrVar.g(), zjrVar.h(), zjrVar.i(), zjrVar.cK(), zjrVar.k(), yyeVar, zjrVar.n());
        yyg yygVar = this.ag;
        if (yygVar == null || !yygVar.c) {
            zeoVar = zeoVar2;
            this.ag = new yyg(yyeVar, zeoVar);
        } else {
            zeoVar = zeoVar2;
        }
        final yyg yygVar2 = this.ag;
        final dov dovVar = new dov(new yyp(this, 3), (byte[]) null);
        dov dovVar2 = new dov(zeoVar, (byte[]) null);
        cli jvcVar = zjrVar.cw() ? new jvc(cliVar) : cliVar;
        final cli cliVar2 = jvcVar;
        jux juxVar = new jux(handler, ctyVar, zjrVar.j(), zjrVar.g(), zjrVar.h(), zjrVar.i(), zjrVar.cK(), yygVar2, dovVar, zjrVar.n(), context, yzlVar, dovVar2, jvcVar, new awmd() { // from class: yyw
            @Override // defpackage.awmd, defpackage.awmc
            public final Object io() {
                return new jvd(yzaVar.i, dovVar, yygVar2, cliVar2, this.o);
            }
        });
        this.n = juxVar;
        cdp[] cdpVarArr = {this.Z, this.aa, this.ab, this.ac, this.ad, this.ae, juxVar};
        this.af = cdpVarArr;
        return cdpVarArr;
    }

    @Override // defpackage.tdz
    public final /* synthetic */ Object jC() {
        return nsi.l(this);
    }

    @Override // defpackage.yvj
    public final void jy(agke agkeVar, String str) {
        zcf zcfVar;
        yye yyeVar = this.h;
        zcf zcfVar2 = yyeVar.m;
        zcf zcfVar3 = zcfVar2 != null ? zcfVar2.m : null;
        if (zcfVar2 == null || !zcfVar2.a.equals(str)) {
            zcfVar = (zcfVar3 == null || !zcfVar3.a.equals(str)) ? null : zcfVar3;
        } else {
            zcfVar = zcfVar2;
        }
        if (zcfVar == null) {
            zhr.d(zhq.DRM, "LicenseResponse were received without any playback");
            return;
        }
        boolean zE = yvq.e(zcfVar.R);
        zcfVar.R = agkeVar;
        boolean z = zcfVar.P;
        if (z) {
            ((ytp) this.C.io()).s(zcfVar);
        }
        if (yvq.d(agkeVar)) {
            boolean zG = yyeVar.b.g();
            zcf zcfVar4 = yyeVar.m;
            String strD = yyeVar.b.d(agkeVar);
            if (zG) {
                ywn ywnVar = zcfVar.Z;
                ywnVar.w("hdallowed", strD);
                zjr zjrVar = yyeVar.d;
                if (zjrVar.j.m(305, 45736087L) && zcfVar.C.b() == zcc.b) {
                    yop yopVarC = zcfVar.C.c();
                    zcfVar.o(yop.n(yopVarC.a, yopVarC.b, yopVarC.c, yopVarC.d, yopVarC.e, yopVarC.f, zjo.a(zcfVar.y, zjrVar, yno.ct(zcfVar.A), true, zjb.c, zjb.a, zjb.b), yopVarC.l, false, false, yopVarC.m, yopVarC.n, yopVarC.o, yopVarC.p));
                }
                if (zcfVar.equals(zcfVar4)) {
                    aO(true, agkeVar, zE);
                } else if (zcfVar4 != null && zcfVar.equals(zcfVar4.m) && zcfVar4.C.b() != zcc.b) {
                    try {
                        zcfVar.n(aL(zcfVar.a, zcfVar.A, zcfVar.y, zcfVar.R, ywnVar, null, z));
                    } catch (yof e) {
                        ah(zcfVar.b, hed.q(zhw.a, e, zcfVar.A, 0L));
                    }
                }
            } else {
                aj(zcfVar.b, zhw.e, "hdunavailable", strD);
            }
        }
        if (!zcfVar.equals(zcfVar2) || zcfVar.r()) {
            return;
        }
        zcd zcdVar = zcfVar.C;
        if (zcdVar.b() == zcc.a && zcdVar.a().k() && !zcdVar.a().l()) {
            yyn yynVar = new yyn(3);
            zhv zhvVar = new zhv("keyerror");
            zhvVar.b = zhw.e;
            zhvVar.b(yynVar);
            zhvVar.e = true;
            ah(zcfVar.b, zhvVar.a());
        }
    }

    @Override // defpackage.tdz
    public final synchronized void jz() {
        yye yyeVar = this.h;
        if (yyeVar.d.bn() && !yyeVar.i) {
            this.g.k();
        }
    }

    @Override // defpackage.zew
    public final wgs k() {
        zcf zcfVar = this.h.m;
        if (zcfVar != null) {
            return zcfVar.q;
        }
        return null;
    }

    @Override // defpackage.zew
    public final wgs l() {
        zcf zcfVar = this.h.m;
        if (zcfVar != null) {
            return zcfVar.F;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.zew
    public final yod m(wja wjaVar, wiu wiuVar, boolean z, yoc yocVar, int i) {
        yye yyeVar = this.h;
        zjr zjrVar = yyeVar.d;
        abfv abfvVarN = zjb.n(wjaVar, wiuVar, zjrVar, false, yyeVar.g);
        HashSet hashSet = new HashSet((Collection) abfvVarN.a);
        HashSet hashSet2 = new HashSet((Collection) zjb.o(wjaVar.h(new wix(3)), wiuVar, zjrVar, yyeVar.d(wiuVar), yocVar == null ? yyeVar.e.b.d(true, wiuVar, null, null).j : yocVar.j).a);
        if (zjrVar.S().E) {
            hashSet.removeAll(wir.B());
            hashSet2.removeAll((Set) wir.l.io());
        }
        if (zjrVar.S().aj && zjrVar.aG()) {
            hashSet.remove(Integer.valueOf(wgq.DASH_WEBM_VP9_1080P_HQ.ep));
        }
        yos yosVar = yyeVar.e;
        List list = wjaVar.t;
        List list2 = wjaVar.w;
        int i2 = zic.a;
        return yosVar.a(wiuVar, list, list2, yocVar, hashSet, hashSet2, (true != z ? 2 : 0) | 5 | zic.j(abfvVarN.b == zjv.c), i, null, null, ywn.b, zkg.a, false);
    }

    @Override // defpackage.zew
    public final synchronized yve n() {
        yyd yydVar;
        long j;
        zcf zcfVar;
        long jT = t();
        yye yyeVar = this.h;
        yydVar = yyeVar.n;
        if (yydVar == null || jT != -1) {
            yyeVar.p = true;
        } else {
            jT = -1;
        }
        if (yydVar == null) {
            zcf zcfVar2 = yyeVar.m;
            yydVar = new yyd(zcfVar2 != null ? zcfVar2.h() : zsf.c);
            yyeVar.n = yydVar;
        }
        zcf zcfVar3 = yyeVar.m;
        if (yyeVar.b != null && zcfVar3 != null) {
            yyeVar.b.f(yydVar, zcfVar3.R, zcfVar3.y.aU());
            yvy yvyVar = zcfVar3.ad;
            if (yvyVar != null) {
                yydVar.h = new yvd(zik.aG(yvyVar.l), yvyVar.a, yvyVar.b, yvyVar.d, yvyVar.e, yvyVar.f);
            }
        }
        if (zcfVar3 != null && zcfVar3.H.j.l(365, 45815687L, false) && yyeVar.s.j(0)) {
            long minimumSconeKbps = SconeBitrateTracker.getMinimumSconeKbps();
            if (minimumSconeKbps <= 0) {
                minimumSconeKbps = -1;
            }
            if (yydVar.j != minimumSconeKbps) {
                yydVar.j = minimumSconeKbps;
                yyeVar.p = true;
            }
        }
        if (zcfVar3 != null) {
            String str = zcfVar3.s;
            if (!Objects.equals(yyeVar.r, str)) {
                yyeVar.r = str;
                yyeVar.p = true;
            }
        }
        boolean z = yyeVar.o;
        yzc yzcVar = yyeVar.c;
        boolean z2 = yyeVar.p;
        boolean z3 = yyeVar.q;
        if (zcfVar3 != null) {
            wja wjaVar = zcfVar3.A;
            if (yydVar.k != zcfVar3 || z2) {
                yydVar.e = wjaVar.s();
                String strConcat = "";
                if (wjaVar != null) {
                    strConcat = true == wjaVar.I() ? "S" : "";
                    j = -1;
                    if (wjaVar.g() == wiz.d || wjaVar.g() == wiz.c) {
                        strConcat = strConcat.concat("3");
                    }
                    zcfVar = zcfVar3;
                    if (zcfVar3.H.i.l(171, 45673427L, false) && wjaVar.D()) {
                        strConcat = strConcat.concat(String.valueOf(String.format(Locale.US, "C:%d", Integer.valueOf(wjaVar.b()))));
                    }
                } else {
                    j = -1;
                    zcfVar = zcfVar3;
                }
                if (z) {
                    strConcat = strConcat.concat("G");
                }
                if (z3) {
                    strConcat = strConcat.concat("O");
                }
                if (yzcVar.b) {
                    strConcat = strConcat.concat("D");
                    if (yzcVar.c) {
                        strConcat = strConcat.concat("H");
                    }
                }
                zcf zcfVar4 = zcfVar;
                if (zcfVar4.m != null) {
                    strConcat = strConcat.concat("Q");
                    if (jT != j) {
                        strConcat = strConcat.concat(String.valueOf(String.format(Locale.US, ":%.1fs;", Float.valueOf(jT / 1000.0f))));
                    }
                }
                if (zcfVar4.y.aS()) {
                    strConcat = strConcat.concat("A");
                }
                if (zcfVar4.g() == zjv.d) {
                    strConcat = strConcat.concat("vpx");
                }
                if (zcfVar4.g() == zjv.g) {
                    strConcat = strConcat.concat("d");
                }
                if (zcfVar4.H.j.m(199, 45625148L)) {
                    yydVar.f = zcfVar4.a;
                    yydVar.g = zcfVar4.j();
                }
                wiu wiuVar = zcfVar4.y;
                if (wiuVar.av()) {
                    String strConcat2 = strConcat.concat(true != wiuVar.ag() ? "CS" : "SS");
                    strConcat = wiuVar.aA() ? strConcat2.concat("LIFA,") : strConcat2.concat("DAI,");
                }
                if (wiuVar.az() && !wiuVar.aA()) {
                    strConcat = strConcat.concat("LIFAE,");
                }
                String str2 = zcfVar4.s;
                if (str2 != null) {
                    strConcat = strConcat + "tr:" + str2 + ';';
                }
                long j2 = yydVar.j;
                if (j2 != j) {
                    strConcat = strConcat.concat(String.valueOf(String.format(Locale.US, "SCB:%.2f;", Float.valueOf(j2 / 1000.0f))));
                }
                yydVar.i = strConcat;
                yydVar.k = zcfVar4;
            }
        }
        yyeVar.p = false;
        yyh yyhVar = this.i;
        yydVar.a = yyhVar.a();
        yydVar.b = yyhVar.b();
        return yydVar;
    }

    @Override // defpackage.zew
    public final /* synthetic */ zia o() {
        return yno.p(this);
    }

    @Override // defpackage.zew
    public final zia p(String str) {
        yye yyeVar = this.h;
        if (yyeVar.d.aV()) {
            return (yyeVar.m == null || !Objects.equals(str, r()) || aJ() == null) ? zia.a : yno.p(this);
        }
        return yno.p(this);
    }

    public final int q() {
        return this.i.a();
    }

    @Override // defpackage.zew
    public final String r() {
        yye yyeVar = this.h;
        if (yyeVar.d.S().z) {
            return this.s;
        }
        zcf zcfVar = yyeVar.m;
        if (zcfVar != null) {
            return zcfVar.a;
        }
        return null;
    }

    @Override // defpackage.zcj
    public final long s(zcf zcfVar) {
        return e();
    }

    public final synchronized long t() {
        long j;
        zcf zcfVar;
        zcf zcfVar2 = this.h.m;
        j = -1;
        if (zcfVar2 != null && (zcfVar = zcfVar2.m) != null) {
            long jG = zcfVar.l;
            if (jG == -1) {
                jG = g();
            }
            long jE = e();
            if (jG != -1 && jE != -1) {
                j = jG - jE;
            }
        }
        return j;
    }

    @Override // defpackage.zew
    public final synchronized void u() {
        if (this.au instanceof yyu) {
            ((ytp) this.C.io()).e();
            zcf zcfVar = this.h.m;
            if (zcfVar != null && zcfVar.m != null) {
                zcfVar.m = null;
                aE(zcfVar);
            }
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        zcf zcfVar;
        if (!(observable instanceof zjr)) {
            yye yyeVar = this.h;
            if (observable != yyeVar.f || (zcfVar = yyeVar.m) == null) {
                return;
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                ar(zcfVar);
                return;
            } else {
                this.k.post(new yts(this, zcfVar, 13));
                return;
            }
        }
        if ((obj instanceof Integer) && ((Integer) obj).intValue() == 2) {
            synchronized (this) {
                if (this.au instanceof yyu) {
                    yzo yzoVar = this.t;
                    yye yyeVar2 = this.h;
                    if (yzoVar.q(yyeVar2.m)) {
                        yzoVar.r(yyeVar2.l, yyeVar2.m, yyeVar2.i, false);
                    }
                }
            }
        }
    }

    @Override // defpackage.zew
    public final void v() {
        zlm zlmVar = this.h.l;
        if (zlmVar != null) {
            zlmVar.q();
        }
    }

    @Override // defpackage.zew
    public final void w(boolean z) {
        ((ytp) this.C.io()).f(z);
    }

    public final cno x(zcf zcfVar) {
        cno zdhVar;
        wiu wiuVar;
        wja wjaVar;
        yxb yxbVar;
        zfc zfcVar;
        zcf zcfVar2 = zcfVar;
        zkf.c(!zcfVar2.P);
        boolean z = zcfVar2.A.B;
        yza yzaVar = this.h.a;
        int i = 17;
        if (z) {
            zdhVar = new zbr(zcfVar2, new zil(this.e, yzaVar.j, false, new yyy(zcfVar2, 0), 3, new tar(zcfVar2, i)), yzaVar.c(this, zcfVar2), zcfVar2.aa, this.k, this.m, new yyz(this, zcfVar2.b, zcfVar2.Z), yzaVar.r, this.h.d);
        } else {
            if (zcfVar2.A.D()) {
                synchronized (zcfVar) {
                    wiuVar = zcfVar2.y;
                    wjaVar = zcfVar2.A;
                    yxbVar = zcfVar2.B;
                    zfcVar = zcfVar2.x;
                }
                zil zilVar = new zil(this.e, yzaVar.j, false, new yyy(zcfVar2, 1), 3, new tar(zcfVar2, i));
                Handler handler = this.k;
                Handler handler2 = this.m;
                yyz yyzVar = new yyz(this, zcfVar2.b, zcfVar2.Z);
                zce zceVar = new zce(null, zcfVar2);
                wjr wjrVar = yzaVar.r;
                xxj[] xxjVarArr = {new xxj(this.g)};
                yye yyeVar = this.h;
                return new zbh(zilVar, zcfVar2.aa, handler, handler2, wiuVar, wjaVar, yxbVar, zfcVar, yyzVar, zcfVar2.a, zceVar, wjrVar, xxjVarArr, yyeVar.s, yyeVar.d);
            }
            zdhVar = new zdh(yzaVar.b, zcfVar2.aa, yzaVar.c(this, zcfVar2), this.m, zcfVar2, zcfVar2.b.b(), yzaVar.r);
            zcfVar2 = zcfVar2;
        }
        cno cnoVar = zdhVar;
        long j = zcfVar2.e;
        if (j == -1) {
            if (zcfVar2.f == -1) {
                return cnoVar;
            }
            j = -1;
        }
        if (j == -1) {
            j = 0;
        }
        long j2 = zcfVar2.f;
        if (j2 == -1) {
            j2 = Long.MIN_VALUE;
        }
        int i2 = bwp.a;
        cmm cmmVar = new cmm(cnoVar);
        ahno.O(!cmmVar.d);
        cmmVar.b.b(bwp.y(j));
        ahno.O(!cmmVar.d);
        cmmVar.b.a(bwp.y(j2));
        return new cmp(cmmVar);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    public final OnesieMediaFetchIntegration y(zcf zcfVar, boolean z) {
        BufferManager bufferManager;
        OnesieMediaFetchIntegration platypusOnesieMediaFetchIntegration;
        OnesieMediaFetchIntegration onesieMediaFetchIntegration;
        zjr zjrVar;
        boolean z2;
        List list;
        BufferManager bufferManager2;
        yqy yqyVar = this.ah;
        String strJ = zcfVar.j();
        yqt yqtVarE = yqyVar.e(strJ);
        if (yqtVarE == null) {
            zhq zhqVar = zhq.ABR;
            return null;
        }
        ysm ysmVar = ((ysg) yqtVarE.j()).a;
        if (ysmVar.b() - 1 != 0) {
            OnesieVideoData onesieVideoDataC = ysmVar.c();
            synchronized (zik.class) {
                bufferManager2 = onesieVideoDataC.getBufferManager();
            }
            if (bufferManager2 instanceof BufferManagerImpl) {
                platypusOnesieMediaFetchIntegration = new PlatypusOnesieVideoDataMediaFetchIntegration(onesieVideoDataC, (BufferManagerImpl) bufferManager2);
                onesieMediaFetchIntegration = platypusOnesieMediaFetchIntegration;
            } else {
                onesieMediaFetchIntegration = null;
            }
        } else {
            OnesieResponseSelector onesieResponseSelectorA = ysmVar.a();
            synchronized (zik.class) {
                bufferManager = onesieResponseSelectorA.getBufferManager(strJ);
            }
            if (bufferManager instanceof BufferManagerImpl) {
                platypusOnesieMediaFetchIntegration = new PlatypusOnesieMediaFetchIntegration(onesieResponseSelectorA, (BufferManagerImpl) bufferManager, strJ);
                onesieMediaFetchIntegration = platypusOnesieMediaFetchIntegration;
            } else {
                onesieMediaFetchIntegration = null;
            }
        }
        if (onesieMediaFetchIntegration == null) {
            zhq zhqVar2 = zhq.ABR;
            return null;
        }
        zjr zjrVar2 = this.h.d;
        if (zjrVar2.l.m(30, 45672562L)) {
            this.ah.f(strJ);
        }
        if (z && zjrVar2.W().v && zcfVar.A.D() && zcfVar.A.z() && zcfVar.g == zjrVar2.v()) {
            zhq zhqVar3 = zhq.ABR;
            if (zjrVar2.aI()) {
                zcfVar.Z.l("excoi", "discard_queued_live_head");
            }
            onesieMediaFetchIntegration.d();
            return null;
        }
        if (zcfVar.A.q) {
            zhq zhqVar4 = zhq.ABR;
            if (zjrVar2.aI()) {
                zcfVar.Z.l("excoi", "offline");
            }
            onesieMediaFetchIntegration.d();
            return null;
        }
        long j = zcfVar.g;
        if (j == zjrVar2.v()) {
            long j2 = zcfVar.e;
            if (j2 != -1 && !zcfVar.A.z()) {
                j = j2;
            }
        }
        agke agkeVar = agpi.a;
        zcd zcdVar = zcfVar.C;
        int iOrdinal = zcdVar.b().ordinal();
        if (iOrdinal == 0) {
            zjrVar = zjrVar2;
            z2 = true;
            yod yodVar = zcfVar.C.a().a;
            agkeVar = (agke) Stream.CC.concat(DesugarArrays.stream(yodVar.b), DesugarArrays.stream(yodVar.c)).map(new yom(5)).collect(aghu.a);
        } else if (iOrdinal != 1) {
            zjrVar = zjrVar2;
            z2 = true;
        } else if (zjrVar2.cW()) {
            yop yopVarC = zcdVar.c();
            z2 = true;
            zjrVar = zjrVar2;
            yop yopVarN = yop.n(yopVarC.a, yopVarC.b, yopVarC.c, yopVarC.d, yopVarC.e, null, yopVarC.k, yopVarC.l, true, true, yopVarC.m, yopVarC.n, yopVarC.o, yopVarC.p);
            ArrayList arrayList = yopVarN.i;
            int i = 20;
            Stream map = arrayList.isEmpty() ? j$.util.Collection.EL.stream(yopVarN.d).filter(new xdn(16)).map(new xjh(i)) : j$.util.Collection.EL.stream(arrayList);
            ArrayList arrayList2 = yopVarN.j;
            agkeVar = (agke) Stream.CC.concat(map, arrayList2.isEmpty() ? j$.util.Collection.EL.stream(yopVarN.d).filter(new xdn(14)).map(new xjh(i)) : j$.util.Collection.EL.stream(arrayList2)).collect(aghu.a);
        } else {
            zjrVar = zjrVar2;
            z2 = true;
            yop yopVarC2 = zcdVar.c();
            SelectableFormatsOuterClass$SelectableFormats selectableFormatsOuterClass$SelectableFormatsA = onesieMediaFetchIntegration.a(strJ);
            if (selectableFormatsOuterClass$SelectableFormatsA != null) {
                yop yopVarN2 = yop.n(yopVarC2.a, yopVarC2.b, yopVarC2.c, yopVarC2.d, yopVarC2.e, selectableFormatsOuterClass$SelectableFormatsA, yopVarC2.k, yopVarC2.l, true, false, yopVarC2.m, yopVarC2.n, yopVarC2.o, yopVarC2.p);
                ArrayList arrayList3 = yopVarN2.i;
                if (arrayList3.isEmpty()) {
                    list = arrayList3;
                    list = (List) j$.util.Collection.EL.stream(selectableFormatsOuterClass$SelectableFormatsA.c).map(new xjh(18)).filter(new xdo(yopVarN2, 8)).collect(aghu.a);
                }
                list = arrayList3;
                ArrayList arrayList4 = yopVarN2.j;
                boolean zIsEmpty = arrayList4.isEmpty();
                List list2 = arrayList4;
                if (zIsEmpty) {
                    list2 = (List) j$.util.Collection.EL.stream(selectableFormatsOuterClass$SelectableFormatsA.b).map(new xjh(19)).filter(new xdo(yopVarN2, 9)).collect(aghu.a);
                }
                agkeVar = (agke) Stream.CC.concat(j$.util.Collection.EL.stream(list), j$.util.Collection.EL.stream(list2)).collect(aghu.a);
            }
        }
        boolean z3 = !zcdVar.d().k();
        boolean zD = zcfVar.A.D();
        boolean zF = zcfVar.A.F();
        wja wjaVar = zcfVar.A;
        Optional optionalO = wjaVar.o();
        if (z2 == optionalO.isPresent()) {
            optionalO = Optional.ofNullable(((Uri) optionalO.get()).getQueryParameter("id"));
        }
        String str = (String) optionalO.orElse("");
        if (str.isEmpty()) {
            Optional optionalFindAny = j$.util.Collection.EL.stream(wjaVar.u).findAny();
            if (true == optionalFindAny.isPresent()) {
                optionalFindAny = Optional.ofNullable(((wgs) optionalFindAny.get()).e.getQueryParameter("id"));
            }
            str = (String) optionalFindAny.orElse("");
        }
        if (onesieMediaFetchIntegration.g(strJ, j, agkeVar, zD, zF, str, zcfVar.A.k, zcfVar.A.z(), z3)) {
            return onesieMediaFetchIntegration;
        }
        if (zjrVar.aI()) {
            zcfVar.Z.l("excoi", "incompatible");
        }
        onesieMediaFetchIntegration.d();
        return null;
    }

    @Override // defpackage.zew
    public final synchronized void z() {
        yye yyeVar = this.h;
        zcf zcfVar = yyeVar.m;
        if (zcfVar != null && (this.au instanceof yyu)) {
            agfp agfpVarB = agfp.b(agdd.a);
            zcf zcfVar2 = zcfVar.m;
            if (zcfVar2 != null) {
                zcfVar2.w = true;
                zcfVar.n = e();
                yyeVar.e(zcfVar2);
                try {
                    if (!this.f.f(8)) {
                        throw new IllegalArgumentException("seek_to_next_not_available");
                    }
                    bth bthVar = this.f;
                    int iAq = ((brs) bthVar).aq();
                    if (iAq == -1) {
                        ((brs) bthVar).h(-1, -9223372036854775807L, false);
                    } else if (iAq == ((brs) bthVar).l()) {
                        ((brs) bthVar).h(((brs) bthVar).l(), -9223372036854775807L, true);
                    } else {
                        ((brs) bthVar).h(iAq, -9223372036854775807L, false);
                    }
                    this.f.M(false);
                    if (yyeVar.d.aD()) {
                        zcfVar.Z.l("seek", zhf.d());
                    }
                    zcfVar.ah.a(zcfVar.n, 4);
                    this.h.c().w("mlat", "playNextInQueue." + agfpVarB.a(TimeUnit.MICROSECONDS));
                } catch (IllegalArgumentException e) {
                    zcfVar2.w = false;
                    zcfVar.n = -1L;
                    zhz zhzVar = new zhz("gapless.seek.next", e(), e);
                    ywj ywjVar = zcfVar.b;
                    zhzVar.o();
                    ah(ywjVar, zhzVar);
                }
            }
        }
    }

    @Override // defpackage.zew
    public final void C() {
    }

    @Override // defpackage.cdt
    public final /* synthetic */ void jB(cdp cdpVar) {
    }
}
