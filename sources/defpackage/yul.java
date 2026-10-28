package defpackage;

import android.content.Context;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yul extends HandlerThread implements Handler.Callback {
    public static final /* synthetic */ int w = 0;
    private volatile ytr A;
    private boolean B;
    private final abte C;
    public final yuo a;
    public final Context b;
    public final zjr c;
    public zsf d;
    final yuk e;
    public Surface f;
    public Handler g;
    public volatile float h;
    public volatile float i;
    public volatile long j;
    public volatile boolean k;
    public volatile boolean l;
    public ywh m;
    public zlm n;
    public wiu o;
    public yui p;
    public volatile boolean q;
    public volatile boolean r;
    public volatile boolean s;
    public volatile boolean t;
    public volatile boolean u;
    public final hed v;
    private final PlaybackParams x;
    private final zeo y;
    private final ywn z;

    public yul(yuo yuoVar, Context context, zeo zeoVar, abte abteVar, zjr zjrVar, hed hedVar) {
        super("Medialib.AndroidFrameworkPlayer");
        this.h = 1.0f;
        this.i = 1.0f;
        this.B = false;
        this.a = yuoVar;
        this.b = context;
        this.y = zeoVar;
        zkf.d(abteVar);
        this.C = abteVar;
        this.c = zjrVar;
        this.v = hedVar;
        this.z = yuoVar.d;
        this.e = new yuk(this);
        this.x = new PlaybackParams();
    }

    private final void l() {
        this.k = true;
        if (this.A != null) {
            try {
                if (k()) {
                    this.A.P();
                    zlm zlmVar = this.n;
                    if (zlmVar != null) {
                        zlmVar.s(500);
                    }
                    this.s = true;
                    this.g.sendEmptyMessage(11);
                    if (!this.u) {
                        this.m.q();
                        this.m.s(-1L);
                    }
                }
                this.u = false;
            } catch (IllegalStateException e) {
                ((agrc) ((agrc) ((agrc) yuo.a.b()).j(e)).k("com/google/android/libraries/youtube/media/player/androidframework/AndroidFrameworkPlayerWrapper$MediaPlayerThread", "blockingPlayVideo", (char) 1510, "AndroidFrameworkPlayerWrapper.java")).t("AndroidFwPlayer: ISE calling start");
                this.z.k(new zhz("android.fw.ise", 0L, e));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008c A[Catch: InstantiationException -> 0x0175, TryCatch #1 {InstantiationException -> 0x0175, blocks: (B:6:0x0027, B:8:0x0037, B:10:0x003d, B:12:0x0041, B:27:0x0091, B:13:0x0052, B:14:0x0058, B:20:0x0066, B:22:0x006a, B:25:0x0077, B:23:0x0073, B:26:0x008c), top: B:51:0x0027 }] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, zgy] */
    /* JADX WARN: Type inference failed for: r3v9, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [awmd, java.lang.Object] */
    private final void m(yui yuiVar) {
        ytr ytoVar;
        this.p = yuiVar;
        this.i = yuiVar.j;
        this.h = yuiVar.k;
        this.l = yuiVar.n;
        c(this.m);
        Boolean bool = yuiVar.l;
        if (bool != null) {
            this.k = bool.booleanValue();
        }
        try {
            abte abteVar = this.C;
            wgs wgsVar = yuiVar.b;
            zjr zjrVar = this.c;
            boolean z = yuiVar.m;
            long j = yuiVar.i;
            long j2 = wgsVar.j();
            if (z) {
                if (!zjrVar.eF() || wgsVar.c == null) {
                    ytoVar = new yto();
                } else {
                    ytoVar = new ytm((Context) abteVar.d, abteVar.c, wgsVar, j, zjrVar);
                }
            } else if (wgsVar.c == null || (j2 <= 0 && j2 != -1)) {
                ytoVar = new yto();
            } else {
                Object obj = abteVar.a ? (abtd) abteVar.b.io() : abteVar.f;
                if (obj != null) {
                    ytoVar = new absy(new yto(), (abtd) obj, wgsVar, (ytx) abteVar.e.io());
                } else {
                    ytoVar = new yto();
                }
            }
            this.A = ytoVar;
            this.B = yuiVar.b.e() == wgq.RAW.ep;
            ytr ytrVar = this.A;
            yuo yuoVar = this.a;
            ytrVar.H(1 != (yuoVar.p & 1) ? 3 : 4);
            this.A.K(this.e);
            zs zsVarAq = yuiVar.b.aq();
            zsVarAq.y(yuiVar.a);
            zsVarAq.z(yno.az(yuiVar.b, yuiVar.e, 2, 6));
            Uri uriX = zsVarAq.x();
            this.m = yuiVar.c;
            this.o = yuiVar.e;
            try {
                if (!this.u) {
                    this.m.r();
                }
                ytr ytrVar2 = this.A;
                n(yuiVar.d);
                Context context = this.b;
                HashMap map = new HashMap();
                map.put("x-disconnect-at-highwatermark", "1");
                map.put("User-Agent", yuoVar.b);
                ytrVar2.I(context, uriX, map, this.o);
                ytrVar2.F();
                this.m.d(ytrVar2.B());
                d(true);
            } catch (IOException e) {
                ((agrc) ((agrc) ((agrc) yuo.a.b()).j(e)).k("com/google/android/libraries/youtube/media/player/androidframework/AndroidFrameworkPlayerWrapper$MediaPlayerThread", "blockingPrepare", (char) 1417, "AndroidFrameworkPlayerWrapper.java")).t("AndroidFwPlayer: IOE preparing video");
                this.z.k(new zhz("android.fw.prepare", 0L, e));
            } catch (IllegalArgumentException e2) {
                ((agrc) ((agrc) ((agrc) yuo.a.b()).j(e2)).k("com/google/android/libraries/youtube/media/player/androidframework/AndroidFrameworkPlayerWrapper$MediaPlayerThread", "blockingPrepare", (char) 1422, "AndroidFrameworkPlayerWrapper.java")).t("AndroidFwPlayer: IAE preparing video");
                this.z.k(new zhz("android.fw.ise", 0L, e2));
            } catch (IllegalStateException e3) {
                ((agrc) ((agrc) ((agrc) yuo.a.b()).j(e3)).k("com/google/android/libraries/youtube/media/player/androidframework/AndroidFrameworkPlayerWrapper$MediaPlayerThread", "blockingPrepare", (char) 1426, "AndroidFrameworkPlayerWrapper.java")).t("AndroidFwPlayer: ISE preparing video");
                this.z.k(new zhz("android.fw.ise", 0L, e3));
            }
        } catch (InstantiationException e4) {
            ((agrc) ((agrc) yuo.a.b()).k("com/google/android/libraries/youtube/media/player/androidframework/AndroidFrameworkPlayerWrapper$MediaPlayerThread", "blockingPrepare", 1390, "AndroidFrameworkPlayerWrapper.java")).t("AndroidFwPlayer: Factory failed to create a MediaPlayer for the stream");
            this.z.k(new zhz("android.fw.create", 0L, e4));
        }
    }

    private final void n(zlm zlmVar) {
        if (zlmVar == null) {
            this.n = null;
            return;
        }
        if (this.A == null || this.n == zlmVar) {
            return;
        }
        ytr ytrVar = this.A;
        if (zlmVar.m()) {
            SurfaceHolder surfaceHolderN = zlmVar.n();
            if (surfaceHolderN != null) {
                try {
                    this.y.m(this.d);
                    ytrVar.J(surfaceHolderN);
                } catch (IllegalArgumentException e) {
                    ((agrc) ((agrc) ((agrc) yuo.a.b()).j(e)).k("com/google/android/libraries/youtube/media/player/androidframework/AndroidFrameworkPlayerWrapper$MediaPlayerThread", "setMediaViewInternal", (char) 1456, "AndroidFrameworkPlayerWrapper.java")).t("AndroidFwPlayer: IAE attaching Surface.");
                    this.z.k(new zhz("player.fatalexception", ytrVar.C(), e));
                    return;
                }
            } else if (zlmVar.m()) {
                Surface surfaceF = zlmVar.f();
                this.f = surfaceF;
                this.y.k(surfaceF, this.d);
                ytrVar.N(this.f);
            }
            this.n = zlmVar;
        }
    }

    private final void o(zjp zjpVar) {
        this.p = null;
        this.r = false;
        this.s = false;
        this.t = false;
        c(this.m);
        this.m = ywh.a;
        this.n = null;
        this.o = null;
        if (zjpVar != null) {
            zjpVar.run();
        }
    }

    final void a() {
        zjp zjpVar = new zjp();
        Handler handler = this.g;
        handler.sendMessage(handler.obtainMessage(13, zjpVar));
        try {
            zjpVar.get(this.c.C(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            if (this.m != null) {
                this.z.k(new zhz("player.timeout", this.j, e));
            }
            this.a.F();
        } catch (Exception e2) {
            zhr.c(zhq.FWP, e2, "Exception in AndroidFw.MediaFuture.get.", new Object[0]);
            this.z.k(new zhz("android.fw", this.j, e2));
        }
    }

    final void b() {
        this.g.sendEmptyMessage(2);
    }

    final void c(ywh ywhVar) {
        if (this.A != null) {
            if (ywhVar != null) {
                ywhVar.c(this.A.B());
            }
            this.A.G();
            this.A = null;
            this.l = false;
        }
    }

    public final void d(boolean z) {
        if (this.t != z) {
            this.t = z;
            boolean z2 = this.k;
            if (z) {
                ywh ywhVar = this.m;
                if (z2) {
                    ywhVar.e();
                    return;
                } else {
                    ywhVar.n();
                    return;
                }
            }
            if (!z2) {
                this.m.m();
                return;
            }
            yui yuiVar = this.p;
            if (yuiVar == null || !yuiVar.m || this.s) {
                this.m.q();
                this.m.s(-1L);
            }
        }
    }

    final void e(zlm zlmVar) {
        Handler handler = this.g;
        handler.sendMessage(Message.obtain(handler, 9, zlmVar));
    }

    final void f(float f) {
        Handler handler = this.g;
        handler.sendMessage(Message.obtain(handler, 10, Float.valueOf(f)));
    }

    final void g(boolean z) {
        Handler handler = this.g;
        handler.sendMessage(Message.obtain(handler, 14, Boolean.valueOf(z)));
    }

    final void h(float f) {
        Handler handler = this.g;
        handler.sendMessage(Message.obtain(handler, 12, Float.valueOf(f)));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        PlaybackParams playbackParams;
        switch (message.what) {
            case 1:
                m((yui) message.obj);
                break;
            case 2:
                l();
                break;
            case 3:
                if (this.A != null) {
                    if (k()) {
                        try {
                            this.A.E();
                            this.s = false;
                            this.k = false;
                            this.m.m();
                            d(false);
                        } catch (IllegalStateException e) {
                            ((agrc) ((agrc) ((agrc) yuo.a.b()).j(e)).k("com/google/android/libraries/youtube/media/player/androidframework/AndroidFrameworkPlayerWrapper$MediaPlayerThread", "blockingPauseVideo", (char) 1529, "AndroidFrameworkPlayerWrapper.java")).t("AndroidFwPlayer: ISE calling pause");
                            this.z.k(new zhz("android.fw", this.j, e));
                        }
                    } else if (this.k) {
                        this.k = false;
                        this.m.m();
                    }
                }
                break;
            case 4:
                yun yunVar = (yun) message.obj;
                boolean z = this.k;
                ywh ywhVar = this.m;
                if (z) {
                    ywhVar.v(yunVar.a, yunVar.b);
                } else {
                    ywhVar.o(yunVar.a, yunVar.b);
                }
                if (this.A != null && k()) {
                    try {
                        this.A.Q(yunVar.a, yunVar.c);
                        if (!this.s && this.k) {
                            l();
                            this.a.Q(true);
                        }
                    } catch (IllegalStateException e2) {
                        ((agrc) ((agrc) ((agrc) yuo.a.b()).j(e2)).k("com/google/android/libraries/youtube/media/player/androidframework/AndroidFrameworkPlayerWrapper$MediaPlayerThread", "blockingSeekTo", (char) 1555, "AndroidFrameworkPlayerWrapper.java")).t("AndroidFwPlayer: ISE calling seek");
                        this.z.k(new zhz("android.fw.ise", this.j, e2));
                    }
                } else {
                    yui yuiVar = this.p;
                    if (yuiVar != null) {
                        wgs wgsVar = yuiVar.b;
                        ywn ywnVar = yuiVar.g;
                        if (ywnVar == null) {
                            ywnVar = ywn.b;
                        }
                        this.a.g.post(new xhv(this, wgsVar, yunVar, ywnVar, 5));
                    }
                }
                break;
            case 5:
                o((zjp) message.obj);
                break;
            case 6:
                o(null);
                getLooper().quit();
                this.g.removeCallbacksAndMessages(null);
                break;
            case 7:
            case 8:
            default:
                return false;
            case 9:
                n((zlm) message.obj);
                break;
            case 10:
                float fFloatValue = ((Float) message.obj).floatValue();
                zsf zsfVar = this.d;
                zsf zsfVar2 = zsf.f;
                if ((this.r || zsfVar == zsfVar2) && this.A != null && (playbackParams = this.x) != null) {
                    playbackParams.setSpeed(fFloatValue);
                    this.a.i = 0.0f;
                    try {
                        this.A.L(playbackParams);
                        this.h = fFloatValue;
                        this.m.p(fFloatValue);
                    } catch (Exception unused) {
                        this.z.k(new zhz(zhw.d, "player.exception", 0L, "info.varispeed." + fFloatValue));
                    }
                }
                break;
            case 11:
                if (this.A != null && this.r) {
                    long jC = this.A.C();
                    if (jC > this.j) {
                        this.a.s.set(0);
                    }
                    this.j = jC;
                }
                if (this.s) {
                    this.g.sendEmptyMessageDelayed(11, 250L);
                }
                break;
            case 12:
                float fFloatValue2 = ((Float) message.obj).floatValue();
                this.i = fFloatValue2;
                if (this.r && this.A != null) {
                    this.A.O(fFloatValue2, fFloatValue2);
                }
                break;
            case 13:
                zjp zjpVar = (zjp) message.obj;
                if (this.n != null) {
                    if (this.A != null) {
                        this.y.k(null, this.d);
                        ytr ytrVar = this.A;
                        ytrVar.N(null);
                        ytrVar.J(null);
                    }
                    this.y.g(null, this.d);
                    this.n = null;
                }
                zjpVar.run();
                break;
            case 14:
                boolean zBooleanValue = ((Boolean) message.obj).booleanValue();
                if (this.A != null) {
                    this.l = zBooleanValue;
                    this.A.M(zBooleanValue);
                }
                break;
        }
        return true;
    }

    final void i() {
        this.g.removeMessages(1);
        this.g.sendEmptyMessage(5);
    }

    final void j() {
        this.g.removeMessages(1);
        zjp zjpVar = new zjp();
        Handler handler = this.g;
        handler.sendMessage(handler.obtainMessage(5, zjpVar));
        try {
            zjpVar.get(this.c.B(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            if (this.m != null) {
                this.z.k(new zhz("player.timeout", this.j, e));
            }
            this.a.F();
        } catch (Exception e2) {
            zhr.c(zhq.FWP, e2, "Exception in AndroidFw.MediaFuture.get.", new Object[0]);
            this.z.k(new zhz("android.fw", this.j, e2));
        }
    }

    public final boolean k() {
        if (this.r) {
            return this.q || this.B;
        }
        return false;
    }

    @Override // android.os.HandlerThread
    public final boolean quit() {
        if (getLooper() == null) {
            return false;
        }
        this.g.sendEmptyMessage(6);
        return true;
    }

    @Override // java.lang.Thread
    public final synchronized void start() {
        super.start();
        this.g = new Handler(getLooper(), this);
    }
}
