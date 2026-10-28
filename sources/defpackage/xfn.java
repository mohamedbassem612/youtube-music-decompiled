package defpackage;

import android.app.Application;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.time.Duration;
import java.security.SecureRandom;
import java.util.Observable;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xfn implements xfp, tul, tcq, tcr {
    static final long a;
    static final long b;
    public static final /* synthetic */ int m = 0;
    private tbv A;
    private final Application C;
    private final ScheduledExecutorService D;
    private final awmd E;
    private final awmd F;
    private final tun G;
    private final Executor H;
    private final mbc I;
    private final awmd J;
    private final vyo K;
    private int M;
    private int N;
    private final tbt O;
    private final awmd P;
    private final zwb Q;
    private final awmd R;
    private final String S;
    private final awmd T;
    private final trf U;
    private final tqj V;
    private final xfo W;
    private final boolean X;
    private final vxz Y;
    public final awmd d;
    public final awmd e;
    tdd f;
    public volatile zwa g;
    public volatile zvh h;
    public final ci l;
    private final awmd v;
    private tcq w;
    private tcr x;
    private ScheduledFuture y;
    private tbv z;
    private boolean n = false;
    private boolean o = false;
    public boolean c = false;
    private boolean p = false;
    private boolean q = false;
    private volatile long r = -1;
    private long s = -1;
    private long t = -1;
    private long u = -1;
    public int k = 1;
    private int B = 0;
    public final Object i = new Object();
    private long L = 0;
    final Runnable j = new syd(this, 15);

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a = 30000L;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        b = 90000L;
    }

    public xfn(Application application, ScheduledExecutorService scheduledExecutorService, tun tunVar, awmd awmdVar, awmd awmdVar2, mbc mbcVar, vyo vyoVar, tbt tbtVar, awmd awmdVar3, zwb zwbVar, awmd awmdVar4, vxz vxzVar, txp txpVar, ci ciVar, awmd awmdVar5, tqj tqjVar, awmd awmdVar6, awmd awmdVar7, xfo xfoVar, trf trfVar, awmd awmdVar8, awmd awmdVar9, ztn ztnVar) {
        String strJ;
        boolean z = false;
        if (ztnVar.a()) {
            int i = tqr.a;
            if (tqjVar.k(1073829913)) {
                z = true;
            }
        }
        this.X = z;
        if (!z) {
            awmdVar6.io();
            awmdVar5.io();
            awmdVar3.io();
        }
        this.H = z ? new ahfg(scheduledExecutorService) : null;
        this.F = awmdVar6;
        this.E = awmdVar7;
        this.C = application;
        this.D = scheduledExecutorService;
        this.G = tunVar;
        this.I = mbcVar;
        this.J = awmdVar9;
        this.K = vyoVar;
        this.O = tbtVar;
        this.P = awmdVar3;
        this.Q = zwbVar;
        this.R = awmdVar4;
        if (vxzVar.m(24, 45388123L)) {
            int i2 = txpVar.b;
            strJ = txpVar.b(i2 <= 0 ? 4 : i2);
        } else {
            byte[] bArr = new byte[32];
            new SecureRandom().nextBytes(bArr);
            strJ = agyg.d.j(bArr);
        }
        this.S = strJ;
        this.l = ciVar;
        this.Y = vxzVar;
        this.V = tqjVar;
        this.T = awmdVar5;
        this.W = xfoVar;
        this.d = awmdVar;
        this.e = awmdVar2;
        int i3 = tqr.a;
        if (tqjVar.k(73350)) {
            awmdVar.io();
            awmdVar2.io();
        }
        this.U = trfVar;
        this.v = awmdVar8;
    }

    private final ListenableFuture n(long j) {
        return ((tpq) this.R.io()).b(new xfj(j, 0));
    }

    private final void o(String str, int i) {
        aihf aihfVarCreateBuilder = akot.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        akot akotVar = (akot) aihfVarCreateBuilder.instance;
        str.getClass();
        akotVar.b |= 4;
        akotVar.d = str;
        aihfVarCreateBuilder.copyOnWrite();
        akot akotVar2 = (akot) aihfVarCreateBuilder.instance;
        akotVar2.e = i - 1;
        akotVar2.b |= 8;
        aihfVarCreateBuilder.copyOnWrite();
        akot akotVar3 = (akot) aihfVarCreateBuilder.instance;
        akotVar3.b |= 1;
        akotVar3.c = true;
        if (this.X) {
            xff xffVarA = ((xeu) this.E.io()).a(aihfVarCreateBuilder, alot.DUMMY_PAYLOAD);
            int iA = zvb.a(akku.DELAYED_EVENT_TIER_IMMEDIATE);
            xffVarA.q = iA;
            ztf ztfVar = xffVarA.k.e;
            zvb zvbVarC = ztfVar.c();
            if (zvbVarC != null) {
                xffVarA.a = zvbVarC.b(iA);
            }
            xffVarA.l = ztfVar.a();
            ztfVar.l(xffVarA);
            return;
        }
        xeu xeuVar = (xeu) this.F.io();
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        akot akotVar4 = (akot) aihfVarCreateBuilder.build();
        akotVar4.getClass();
        alouVar.d = akotVar4;
        alouVar.c = 284;
        xeuVar.h((alou) alosVar.build(), akku.DELAYED_EVENT_TIER_IMMEDIATE);
    }

    private final void p(String str, int i) {
        this.D.execute(afwl.i(new adiu(this, this.I.f().toEpochMilli(), str, i, 1)));
    }

    @Override // defpackage.tcr
    public final void a() {
        h(false);
    }

    public final ListenableFuture c(long j) {
        ListenableFuture listenableFutureN;
        synchronized (this.i) {
            if (this.M != 0) {
                listenableFutureN = ahng.n(null);
                if (j > 1000000000) {
                    j = 0;
                }
                int i = this.N - 1;
                this.N = i;
                if (i <= 0) {
                    this.N = this.M;
                    listenableFutureN = n(j);
                }
                this.L = j;
            } else {
                listenableFutureN = n(j);
            }
        }
        return listenableFutureN;
    }

    @Override // defpackage.xfp
    public final String d() {
        return this.S;
    }

    @Override // defpackage.xfp
    public final void e() {
        amug amugVar;
        Object obj = this.i;
        synchronized (obj) {
            if (this.n) {
                i("HeartbeatClient.configure() have been called more than once.", new Exception());
                return;
            }
            alik alikVarB = this.K.b();
            if (alikVarB == null) {
                amugVar = null;
            } else {
                amuh amuhVar = alikVarB.n;
                if (amuhVar == null) {
                    amuhVar = amuh.a;
                }
                amugVar = amuhVar.f;
                if (amugVar == null) {
                    amugVar = amug.a;
                }
            }
            if (amugVar == null || !amugVar.b) {
                synchronized (obj) {
                    try {
                        tqj tqjVar = this.V;
                        int i = tqr.a;
                        if (tqjVar.k(1073830161)) {
                            ((oml) this.J.io()).h(this);
                        } else {
                            tdd tddVar = this.f;
                            if (tddVar != null) {
                                tddVar.c(this.C);
                                this.f.d(this.w);
                                this.f.d(this.x);
                                this.f = null;
                            }
                        }
                        boolean z = this.X;
                        tun tunVar = this.G;
                        if (z) {
                            tunVar.e(this);
                        } else {
                            tunVar.deleteObserver(this);
                        }
                        tbv tbvVar = this.z;
                        if (tbvVar != null) {
                            this.O.k(tbvVar);
                            this.z = null;
                        }
                        tbv tbvVar2 = this.A;
                        if (tbvVar2 != null) {
                            this.O.k(tbvVar2);
                            this.A = null;
                        }
                        k();
                        this.n = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            int i2 = amugVar.g;
            this.M = i2;
            if (i2 != 0) {
                long j = ((atox) ((tpq) this.R.io()).c()).c;
                if (j == -1) {
                    j = 0;
                }
                long j2 = j + (((long) this.M) << 2);
                this.N = 2;
                ListenableFuture listenableFutureC = c(j2);
                wuy wuyVar = new wuy(this, 4);
                Executor executor = taf.a;
                Executor executorDirectExecutor = MoreExecutors.directExecutor();
                taa taaVar = new taa(taf.c, null, wuyVar);
                long j3 = afwl.a;
                listenableFutureC.addListener(new ahei(listenableFutureC, new afwj(afty.c(false), taaVar, 0)), executorDirectExecutor);
            }
            synchronized (this.i) {
                try {
                    boolean z2 = this.X;
                    tun tunVar2 = this.G;
                    if (z2) {
                        tunVar2.b(this);
                    } else {
                        tunVar2.addObserver(this);
                    }
                    tbt tbtVar = this.O;
                    this.z = tbtVar.a(this, zwt.class, new xfm(this, 1));
                    this.A = tbtVar.a(this, zwu.class, new xfm(this, 0));
                    tqj tqjVar2 = this.V;
                    int i3 = tqr.a;
                    if (tqjVar2.k(1073830161)) {
                        ((oml) this.J.io()).g(this);
                    } else {
                        if (this.f == null) {
                            this.w = new twc(this, 2);
                            this.x = new twd(this, 2);
                            tdd tddVar2 = new tdd(tqjVar2);
                            this.f = tddVar2;
                            tddVar2.b(this.C);
                        }
                        this.f.a(this.w);
                        this.f.a(this.x);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.s = amugVar.c <= 0 ? a : TimeUnit.SECONDS.toMillis(amugVar.c);
            this.t = amugVar.d <= 0 ? b : TimeUnit.SECONDS.toMillis(amugVar.d);
            boolean z3 = amugVar.e;
            this.c = z3;
            this.p = amugVar.f;
            this.q = amugVar.h;
            this.g = z3 ? this.Q.e() : null;
            if (this.c) {
                ci ciVar = this.l;
                zwb zwbVar = this.Q;
                this.h = new zvh(ciVar.aD(zwbVar.e()), zwbVar.e().m());
            } else {
                this.h = null;
            }
            if (qel.d(this.C.getApplicationContext())) {
                h(true);
                tym.ag(tsa.FG_MARKER);
            } else {
                this.k = 3;
                g();
                tym.ag(tsa.BG_MARKER);
            }
            this.n = true;
        }
    }

    public final void f() {
        synchronized (this.i) {
            zwb zwbVar = this.Q;
            zwa zwaVarE = zwbVar.e();
            zvh zvhVar = new zvh(this.l.aD(zwbVar.e()), zwaVarE.m());
            if (zwaVarE.k().equals(this.g.k())) {
                return;
            }
            l(4, this.g, this.h, false);
            this.g = zwaVarE;
            this.h = zvhVar;
            taf.i(c(0L), MoreExecutors.directExecutor(), new wuy(this, 5), new ixb(this, 16), null);
        }
    }

    public final void g() {
        Runnable runnableI = afwl.i(new xfd(this, 2));
        if (this.X) {
            this.H.execute(runnableI);
        } else {
            ((tag) this.P.io()).b(tai.b, runnableI);
        }
    }

    public final void h(boolean z) {
        Runnable runnableI = afwl.i(new frz(this, z, 2));
        if (this.X) {
            this.H.execute(runnableI);
        } else {
            ((tag) this.P.io()).b(tai.b, runnableI);
        }
    }

    public final void i(String str, Throwable th) {
        if (!this.Y.m(33, 45399869L)) {
            zvp.b(zvn.b, zvm.m, str, th);
            return;
        }
        zvl zvlVar = (zvl) this.T.io();
        zvj zvjVarA = zvk.a();
        zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
        zvjVarA.j = 13;
        zvjVarA.d(str);
        zvjVarA.f(th);
        zvlVar.a(zvjVarA.a());
    }

    public final void j(boolean z) {
        Duration durationA;
        synchronized (this.i) {
            k();
            long epochMilli = this.s;
            if (epochMilli <= 0) {
                return;
            }
            tqj tqjVar = this.V;
            int i = tqr.a;
            if (tqjVar.k(1073828660) && z && (durationA = this.U.a()) != null) {
                epochMilli -= this.I.f().toEpochMilli() - durationA.plusMillis(tqjVar.c(1075860224)).toMillis();
            }
            this.y = this.D.scheduleAtFixedRate(this.j, epochMilli, this.s, TimeUnit.MILLISECONDS);
            this.o = true;
        }
    }

    @Override // defpackage.tul
    public final void jn(long j) {
        if (j >= 0) {
            if (this.r == -1) {
                synchronized (this.i) {
                    if (this.r == -1) {
                        this.r = j;
                    }
                }
            }
            if (this.k != 2 || this.o) {
                return;
            }
            j(false);
        }
    }

    public final void k() {
        synchronized (this.i) {
            ScheduledFuture scheduledFuture = this.y;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                this.y.cancel(!this.X);
            }
            this.o = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
    
        if (r5 >= r7) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(final int r12, final defpackage.zwa r13, final defpackage.zvh r14, final boolean r15) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xfn.l(int, zwa, zvh, boolean):void");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x009e  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b4 A[Catch: all -> 0x0285, TryCatch #0 {, blocks: (B:4:0x0009, B:8:0x001b, B:12:0x0038, B:14:0x0053, B:16:0x0063, B:21:0x0077, B:23:0x007f, B:27:0x0095, B:32:0x00a2, B:40:0x00c8, B:42:0x00d9, B:44:0x00dd, B:45:0x0104, B:48:0x010f, B:67:0x0214, B:69:0x021e, B:74:0x0228, B:93:0x027b, B:94:0x0281, B:75:0x0234, B:77:0x023d, B:81:0x024b, B:83:0x0251, B:88:0x0260, B:92:0x0273, B:89:0x0267, B:90:0x026e, B:35:0x00b4, B:37:0x00b8, B:39:0x00c0, B:51:0x011b, B:52:0x014e, B:54:0x0155, B:56:0x0184, B:58:0x0189, B:59:0x018c, B:61:0x019d, B:62:0x01d9, B:65:0x01e4, B:66:0x01e9, B:11:0x0034, B:7:0x0019), top: B:100:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b8 A[Catch: all -> 0x0285, TryCatch #0 {, blocks: (B:4:0x0009, B:8:0x001b, B:12:0x0038, B:14:0x0053, B:16:0x0063, B:21:0x0077, B:23:0x007f, B:27:0x0095, B:32:0x00a2, B:40:0x00c8, B:42:0x00d9, B:44:0x00dd, B:45:0x0104, B:48:0x010f, B:67:0x0214, B:69:0x021e, B:74:0x0228, B:93:0x027b, B:94:0x0281, B:75:0x0234, B:77:0x023d, B:81:0x024b, B:83:0x0251, B:88:0x0260, B:92:0x0273, B:89:0x0267, B:90:0x026e, B:35:0x00b4, B:37:0x00b8, B:39:0x00c0, B:51:0x011b, B:52:0x014e, B:54:0x0155, B:56:0x0184, B:58:0x0189, B:59:0x018c, B:61:0x019d, B:62:0x01d9, B:65:0x01e4, B:66:0x01e9, B:11:0x0034, B:7:0x0019), top: B:100:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c0 A[Catch: all -> 0x0285, TryCatch #0 {, blocks: (B:4:0x0009, B:8:0x001b, B:12:0x0038, B:14:0x0053, B:16:0x0063, B:21:0x0077, B:23:0x007f, B:27:0x0095, B:32:0x00a2, B:40:0x00c8, B:42:0x00d9, B:44:0x00dd, B:45:0x0104, B:48:0x010f, B:67:0x0214, B:69:0x021e, B:74:0x0228, B:93:0x027b, B:94:0x0281, B:75:0x0234, B:77:0x023d, B:81:0x024b, B:83:0x0251, B:88:0x0260, B:92:0x0273, B:89:0x0267, B:90:0x026e, B:35:0x00b4, B:37:0x00b8, B:39:0x00c0, B:51:0x011b, B:52:0x014e, B:54:0x0155, B:56:0x0184, B:58:0x0189, B:59:0x018c, B:61:0x019d, B:62:0x01d9, B:65:0x01e4, B:66:0x01e9, B:11:0x0034, B:7:0x0019), top: B:100:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d9 A[Catch: all -> 0x0285, TryCatch #0 {, blocks: (B:4:0x0009, B:8:0x001b, B:12:0x0038, B:14:0x0053, B:16:0x0063, B:21:0x0077, B:23:0x007f, B:27:0x0095, B:32:0x00a2, B:40:0x00c8, B:42:0x00d9, B:44:0x00dd, B:45:0x0104, B:48:0x010f, B:67:0x0214, B:69:0x021e, B:74:0x0228, B:93:0x027b, B:94:0x0281, B:75:0x0234, B:77:0x023d, B:81:0x024b, B:83:0x0251, B:88:0x0260, B:92:0x0273, B:89:0x0267, B:90:0x026e, B:35:0x00b4, B:37:0x00b8, B:39:0x00c0, B:51:0x011b, B:52:0x014e, B:54:0x0155, B:56:0x0184, B:58:0x0189, B:59:0x018c, B:61:0x019d, B:62:0x01d9, B:65:0x01e4, B:66:0x01e9, B:11:0x0034, B:7:0x0019), top: B:100:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00dd A[Catch: all -> 0x0285, TryCatch #0 {, blocks: (B:4:0x0009, B:8:0x001b, B:12:0x0038, B:14:0x0053, B:16:0x0063, B:21:0x0077, B:23:0x007f, B:27:0x0095, B:32:0x00a2, B:40:0x00c8, B:42:0x00d9, B:44:0x00dd, B:45:0x0104, B:48:0x010f, B:67:0x0214, B:69:0x021e, B:74:0x0228, B:93:0x027b, B:94:0x0281, B:75:0x0234, B:77:0x023d, B:81:0x024b, B:83:0x0251, B:88:0x0260, B:92:0x0273, B:89:0x0267, B:90:0x026e, B:35:0x00b4, B:37:0x00b8, B:39:0x00c0, B:51:0x011b, B:52:0x014e, B:54:0x0155, B:56:0x0184, B:58:0x0189, B:59:0x018c, B:61:0x019d, B:62:0x01d9, B:65:0x01e4, B:66:0x01e9, B:11:0x0034, B:7:0x0019), top: B:100:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0117  */
    /* JADX WARN: Code duplicated, block: B:51:0x011b A[Catch: all -> 0x0285, TryCatch #0 {, blocks: (B:4:0x0009, B:8:0x001b, B:12:0x0038, B:14:0x0053, B:16:0x0063, B:21:0x0077, B:23:0x007f, B:27:0x0095, B:32:0x00a2, B:40:0x00c8, B:42:0x00d9, B:44:0x00dd, B:45:0x0104, B:48:0x010f, B:67:0x0214, B:69:0x021e, B:74:0x0228, B:93:0x027b, B:94:0x0281, B:75:0x0234, B:77:0x023d, B:81:0x024b, B:83:0x0251, B:88:0x0260, B:92:0x0273, B:89:0x0267, B:90:0x026e, B:35:0x00b4, B:37:0x00b8, B:39:0x00c0, B:51:0x011b, B:52:0x014e, B:54:0x0155, B:56:0x0184, B:58:0x0189, B:59:0x018c, B:61:0x019d, B:62:0x01d9, B:65:0x01e4, B:66:0x01e9, B:11:0x0034, B:7:0x0019), top: B:100:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x014e A[Catch: all -> 0x0285, TryCatch #0 {, blocks: (B:4:0x0009, B:8:0x001b, B:12:0x0038, B:14:0x0053, B:16:0x0063, B:21:0x0077, B:23:0x007f, B:27:0x0095, B:32:0x00a2, B:40:0x00c8, B:42:0x00d9, B:44:0x00dd, B:45:0x0104, B:48:0x010f, B:67:0x0214, B:69:0x021e, B:74:0x0228, B:93:0x027b, B:94:0x0281, B:75:0x0234, B:77:0x023d, B:81:0x024b, B:83:0x0251, B:88:0x0260, B:92:0x0273, B:89:0x0267, B:90:0x026e, B:35:0x00b4, B:37:0x00b8, B:39:0x00c0, B:51:0x011b, B:52:0x014e, B:54:0x0155, B:56:0x0184, B:58:0x0189, B:59:0x018c, B:61:0x019d, B:62:0x01d9, B:65:0x01e4, B:66:0x01e9, B:11:0x0034, B:7:0x0019), top: B:100:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0155 A[Catch: all -> 0x0285, TryCatch #0 {, blocks: (B:4:0x0009, B:8:0x001b, B:12:0x0038, B:14:0x0053, B:16:0x0063, B:21:0x0077, B:23:0x007f, B:27:0x0095, B:32:0x00a2, B:40:0x00c8, B:42:0x00d9, B:44:0x00dd, B:45:0x0104, B:48:0x010f, B:67:0x0214, B:69:0x021e, B:74:0x0228, B:93:0x027b, B:94:0x0281, B:75:0x0234, B:77:0x023d, B:81:0x024b, B:83:0x0251, B:88:0x0260, B:92:0x0273, B:89:0x0267, B:90:0x026e, B:35:0x00b4, B:37:0x00b8, B:39:0x00c0, B:51:0x011b, B:52:0x014e, B:54:0x0155, B:56:0x0184, B:58:0x0189, B:59:0x018c, B:61:0x019d, B:62:0x01d9, B:65:0x01e4, B:66:0x01e9, B:11:0x0034, B:7:0x0019), top: B:100:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0184 A[Catch: all -> 0x0285, TryCatch #0 {, blocks: (B:4:0x0009, B:8:0x001b, B:12:0x0038, B:14:0x0053, B:16:0x0063, B:21:0x0077, B:23:0x007f, B:27:0x0095, B:32:0x00a2, B:40:0x00c8, B:42:0x00d9, B:44:0x00dd, B:45:0x0104, B:48:0x010f, B:67:0x0214, B:69:0x021e, B:74:0x0228, B:93:0x027b, B:94:0x0281, B:75:0x0234, B:77:0x023d, B:81:0x024b, B:83:0x0251, B:88:0x0260, B:92:0x0273, B:89:0x0267, B:90:0x026e, B:35:0x00b4, B:37:0x00b8, B:39:0x00c0, B:51:0x011b, B:52:0x014e, B:54:0x0155, B:56:0x0184, B:58:0x0189, B:59:0x018c, B:61:0x019d, B:62:0x01d9, B:65:0x01e4, B:66:0x01e9, B:11:0x0034, B:7:0x0019), top: B:100:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0189 A[Catch: all -> 0x0285, TryCatch #0 {, blocks: (B:4:0x0009, B:8:0x001b, B:12:0x0038, B:14:0x0053, B:16:0x0063, B:21:0x0077, B:23:0x007f, B:27:0x0095, B:32:0x00a2, B:40:0x00c8, B:42:0x00d9, B:44:0x00dd, B:45:0x0104, B:48:0x010f, B:67:0x0214, B:69:0x021e, B:74:0x0228, B:93:0x027b, B:94:0x0281, B:75:0x0234, B:77:0x023d, B:81:0x024b, B:83:0x0251, B:88:0x0260, B:92:0x0273, B:89:0x0267, B:90:0x026e, B:35:0x00b4, B:37:0x00b8, B:39:0x00c0, B:51:0x011b, B:52:0x014e, B:54:0x0155, B:56:0x0184, B:58:0x0189, B:59:0x018c, B:61:0x019d, B:62:0x01d9, B:65:0x01e4, B:66:0x01e9, B:11:0x0034, B:7:0x0019), top: B:100:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x019d A[Catch: all -> 0x0285, TryCatch #0 {, blocks: (B:4:0x0009, B:8:0x001b, B:12:0x0038, B:14:0x0053, B:16:0x0063, B:21:0x0077, B:23:0x007f, B:27:0x0095, B:32:0x00a2, B:40:0x00c8, B:42:0x00d9, B:44:0x00dd, B:45:0x0104, B:48:0x010f, B:67:0x0214, B:69:0x021e, B:74:0x0228, B:93:0x027b, B:94:0x0281, B:75:0x0234, B:77:0x023d, B:81:0x024b, B:83:0x0251, B:88:0x0260, B:92:0x0273, B:89:0x0267, B:90:0x026e, B:35:0x00b4, B:37:0x00b8, B:39:0x00c0, B:51:0x011b, B:52:0x014e, B:54:0x0155, B:56:0x0184, B:58:0x0189, B:59:0x018c, B:61:0x019d, B:62:0x01d9, B:65:0x01e4, B:66:0x01e9, B:11:0x0034, B:7:0x0019), top: B:100:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01e9 A[Catch: all -> 0x0285, TryCatch #0 {, blocks: (B:4:0x0009, B:8:0x001b, B:12:0x0038, B:14:0x0053, B:16:0x0063, B:21:0x0077, B:23:0x007f, B:27:0x0095, B:32:0x00a2, B:40:0x00c8, B:42:0x00d9, B:44:0x00dd, B:45:0x0104, B:48:0x010f, B:67:0x0214, B:69:0x021e, B:74:0x0228, B:93:0x027b, B:94:0x0281, B:75:0x0234, B:77:0x023d, B:81:0x024b, B:83:0x0251, B:88:0x0260, B:92:0x0273, B:89:0x0267, B:90:0x026e, B:35:0x00b4, B:37:0x00b8, B:39:0x00c0, B:51:0x011b, B:52:0x014e, B:54:0x0155, B:56:0x0184, B:58:0x0189, B:59:0x018c, B:61:0x019d, B:62:0x01d9, B:65:0x01e4, B:66:0x01e9, B:11:0x0034, B:7:0x0019), top: B:100:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x021e A[Catch: all -> 0x0285, TryCatch #0 {, blocks: (B:4:0x0009, B:8:0x001b, B:12:0x0038, B:14:0x0053, B:16:0x0063, B:21:0x0077, B:23:0x007f, B:27:0x0095, B:32:0x00a2, B:40:0x00c8, B:42:0x00d9, B:44:0x00dd, B:45:0x0104, B:48:0x010f, B:67:0x0214, B:69:0x021e, B:74:0x0228, B:93:0x027b, B:94:0x0281, B:75:0x0234, B:77:0x023d, B:81:0x024b, B:83:0x0251, B:88:0x0260, B:92:0x0273, B:89:0x0267, B:90:0x026e, B:35:0x00b4, B:37:0x00b8, B:39:0x00c0, B:51:0x011b, B:52:0x014e, B:54:0x0155, B:56:0x0184, B:58:0x0189, B:59:0x018c, B:61:0x019d, B:62:0x01d9, B:65:0x01e4, B:66:0x01e9, B:11:0x0034, B:7:0x0019), top: B:100:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0223 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0225  */
    /* JADX WARN: Code duplicated, block: B:73:0x0227  */
    /* JADX WARN: Code duplicated, block: B:75:0x0234 A[Catch: all -> 0x0285, TryCatch #0 {, blocks: (B:4:0x0009, B:8:0x001b, B:12:0x0038, B:14:0x0053, B:16:0x0063, B:21:0x0077, B:23:0x007f, B:27:0x0095, B:32:0x00a2, B:40:0x00c8, B:42:0x00d9, B:44:0x00dd, B:45:0x0104, B:48:0x010f, B:67:0x0214, B:69:0x021e, B:74:0x0228, B:93:0x027b, B:94:0x0281, B:75:0x0234, B:77:0x023d, B:81:0x024b, B:83:0x0251, B:88:0x0260, B:92:0x0273, B:89:0x0267, B:90:0x026e, B:35:0x00b4, B:37:0x00b8, B:39:0x00c0, B:51:0x011b, B:52:0x014e, B:54:0x0155, B:56:0x0184, B:58:0x0189, B:59:0x018c, B:61:0x019d, B:62:0x01d9, B:65:0x01e4, B:66:0x01e9, B:11:0x0034, B:7:0x0019), top: B:100:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x023d A[Catch: all -> 0x0285, TryCatch #0 {, blocks: (B:4:0x0009, B:8:0x001b, B:12:0x0038, B:14:0x0053, B:16:0x0063, B:21:0x0077, B:23:0x007f, B:27:0x0095, B:32:0x00a2, B:40:0x00c8, B:42:0x00d9, B:44:0x00dd, B:45:0x0104, B:48:0x010f, B:67:0x0214, B:69:0x021e, B:74:0x0228, B:93:0x027b, B:94:0x0281, B:75:0x0234, B:77:0x023d, B:81:0x024b, B:83:0x0251, B:88:0x0260, B:92:0x0273, B:89:0x0267, B:90:0x026e, B:35:0x00b4, B:37:0x00b8, B:39:0x00c0, B:51:0x011b, B:52:0x014e, B:54:0x0155, B:56:0x0184, B:58:0x0189, B:59:0x018c, B:61:0x019d, B:62:0x01d9, B:65:0x01e4, B:66:0x01e9, B:11:0x0034, B:7:0x0019), top: B:100:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0247  */
    /* JADX WARN: Code duplicated, block: B:83:0x0251 A[Catch: all -> 0x0285, TryCatch #0 {, blocks: (B:4:0x0009, B:8:0x001b, B:12:0x0038, B:14:0x0053, B:16:0x0063, B:21:0x0077, B:23:0x007f, B:27:0x0095, B:32:0x00a2, B:40:0x00c8, B:42:0x00d9, B:44:0x00dd, B:45:0x0104, B:48:0x010f, B:67:0x0214, B:69:0x021e, B:74:0x0228, B:93:0x027b, B:94:0x0281, B:75:0x0234, B:77:0x023d, B:81:0x024b, B:83:0x0251, B:88:0x0260, B:92:0x0273, B:89:0x0267, B:90:0x026e, B:35:0x00b4, B:37:0x00b8, B:39:0x00c0, B:51:0x011b, B:52:0x014e, B:54:0x0155, B:56:0x0184, B:58:0x0189, B:59:0x018c, B:61:0x019d, B:62:0x01d9, B:65:0x01e4, B:66:0x01e9, B:11:0x0034, B:7:0x0019), top: B:100:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x025b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x025d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0260 A[Catch: all -> 0x0285, TryCatch #0 {, blocks: (B:4:0x0009, B:8:0x001b, B:12:0x0038, B:14:0x0053, B:16:0x0063, B:21:0x0077, B:23:0x007f, B:27:0x0095, B:32:0x00a2, B:40:0x00c8, B:42:0x00d9, B:44:0x00dd, B:45:0x0104, B:48:0x010f, B:67:0x0214, B:69:0x021e, B:74:0x0228, B:93:0x027b, B:94:0x0281, B:75:0x0234, B:77:0x023d, B:81:0x024b, B:83:0x0251, B:88:0x0260, B:92:0x0273, B:89:0x0267, B:90:0x026e, B:35:0x00b4, B:37:0x00b8, B:39:0x00c0, B:51:0x011b, B:52:0x014e, B:54:0x0155, B:56:0x0184, B:58:0x0189, B:59:0x018c, B:61:0x019d, B:62:0x01d9, B:65:0x01e4, B:66:0x01e9, B:11:0x0034, B:7:0x0019), top: B:100:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0267 A[Catch: all -> 0x0285, TryCatch #0 {, blocks: (B:4:0x0009, B:8:0x001b, B:12:0x0038, B:14:0x0053, B:16:0x0063, B:21:0x0077, B:23:0x007f, B:27:0x0095, B:32:0x00a2, B:40:0x00c8, B:42:0x00d9, B:44:0x00dd, B:45:0x0104, B:48:0x010f, B:67:0x0214, B:69:0x021e, B:74:0x0228, B:93:0x027b, B:94:0x0281, B:75:0x0234, B:77:0x023d, B:81:0x024b, B:83:0x0251, B:88:0x0260, B:92:0x0273, B:89:0x0267, B:90:0x026e, B:35:0x00b4, B:37:0x00b8, B:39:0x00c0, B:51:0x011b, B:52:0x014e, B:54:0x0155, B:56:0x0184, B:58:0x0189, B:59:0x018c, B:61:0x019d, B:62:0x01d9, B:65:0x01e4, B:66:0x01e9, B:11:0x0034, B:7:0x0019), top: B:100:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x026e A[Catch: all -> 0x0285, TryCatch #0 {, blocks: (B:4:0x0009, B:8:0x001b, B:12:0x0038, B:14:0x0053, B:16:0x0063, B:21:0x0077, B:23:0x007f, B:27:0x0095, B:32:0x00a2, B:40:0x00c8, B:42:0x00d9, B:44:0x00dd, B:45:0x0104, B:48:0x010f, B:67:0x0214, B:69:0x021e, B:74:0x0228, B:93:0x027b, B:94:0x0281, B:75:0x0234, B:77:0x023d, B:81:0x024b, B:83:0x0251, B:88:0x0260, B:92:0x0273, B:89:0x0267, B:90:0x026e, B:35:0x00b4, B:37:0x00b8, B:39:0x00c0, B:51:0x011b, B:52:0x014e, B:54:0x0155, B:56:0x0184, B:58:0x0189, B:59:0x018c, B:61:0x019d, B:62:0x01d9, B:65:0x01e4, B:66:0x01e9, B:11:0x0034, B:7:0x0019), top: B:100:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0273 A[Catch: all -> 0x0285, TryCatch #0 {, blocks: (B:4:0x0009, B:8:0x001b, B:12:0x0038, B:14:0x0053, B:16:0x0063, B:21:0x0077, B:23:0x007f, B:27:0x0095, B:32:0x00a2, B:40:0x00c8, B:42:0x00d9, B:44:0x00dd, B:45:0x0104, B:48:0x010f, B:67:0x0214, B:69:0x021e, B:74:0x0228, B:93:0x027b, B:94:0x0281, B:75:0x0234, B:77:0x023d, B:81:0x024b, B:83:0x0251, B:88:0x0260, B:92:0x0273, B:89:0x0267, B:90:0x026e, B:35:0x00b4, B:37:0x00b8, B:39:0x00c0, B:51:0x011b, B:52:0x014e, B:54:0x0155, B:56:0x0184, B:58:0x0189, B:59:0x018c, B:61:0x019d, B:62:0x01d9, B:65:0x01e4, B:66:0x01e9, B:11:0x0034, B:7:0x0019), top: B:100:0x0009 }] */
    public final void m(int i, zwa zwaVar, zvh zvhVar, aihf aihfVar, boolean z) {
        int i2;
        int i3;
        long j;
        awmd awmdVar;
        xeu xeuVar;
        alou alouVar;
        xek xekVarA;
        String string;
        boolean z2;
        int iA;
        int i4;
        int i5;
        boolean z3;
        xeu xeuVar2;
        xff xffVarA;
        long j2;
        Duration durationA;
        synchronized (this.i) {
            mbc mbcVar = this.I;
            long jB = mbcVar.b();
            long j3 = this.u;
            long j4 = j3 == -1 ? -1L : jB - j3;
            aihfVar.copyOnWrite();
            alan alanVar = (alan) aihfVar.instance;
            alan alanVar2 = alan.a;
            alanVar.b |= 8;
            alanVar.f = j4;
            long j5 = this.r == -1 ? -1L : jB - this.r;
            aihfVar.copyOnWrite();
            alan alanVar3 = (alan) aihfVar.instance;
            alanVar3.b |= 1;
            alanVar3.c = j5;
            long jRound = this.c ? Math.round(mbcVar.f().toEpochMilli() / 1000.0d) * 1000 : -1L;
            tqj tqjVar = this.V;
            int i6 = tqr.a;
            if (tqjVar.k(1073828656)) {
                i2 = i;
                if (i2 == 3) {
                    if (z && (durationA = this.U.a()) != null) {
                        jRound = durationA.plusMillis(tqjVar.c(1075860224)).toMillis();
                    }
                    j = jRound;
                    i3 = 3;
                }
                if (this.X) {
                    if (i3 == 3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    xeuVar2 = (xeu) this.E.io();
                    xffVarA = xeuVar2.a(aihfVar, alot.FOREGROUND_HEARTBEAT);
                    if (z3 || i3 == 4) {
                        xffVarA.h = j;
                        if (zwaVar != null) {
                            xffVarA.n = zwaVar.k();
                        }
                        if (zvhVar != null) {
                            xffVarA.o = zvhVar.a;
                            xffVarA.p = zvhVar.b;
                        }
                    }
                    ztf ztfVar = xffVarA.k.e;
                    j2 = j;
                    xffVarA.l = ztfVar.a();
                    ztfVar.l(xffVarA);
                    if (z3) {
                        if (this.p) {
                            aihf aihfVarCreateBuilder = akot.a.createBuilder();
                            aihfVarCreateBuilder.copyOnWrite();
                            akot akotVar = (akot) aihfVarCreateBuilder.instance;
                            akotVar.b |= 1;
                            akotVar.c = true;
                            xff xffVarA2 = xeuVar2.a(aihfVarCreateBuilder, alot.DUMMY_PAYLOAD);
                            ztf ztfVar2 = xffVarA2.k.e;
                            xffVarA2.l = ztfVar2.a();
                            ztfVar2.k(xffVarA2);
                        }
                        if (tqjVar.k(1073815368) && z) {
                            this.W.a = j2;
                        }
                    }
                } else if (i3 == 4) {
                    xeu xeuVar3 = (xeu) this.F.io();
                    alos alosVar = (alos) alou.a.createBuilder();
                    alosVar.copyOnWrite();
                    alou alouVar2 = (alou) alosVar.instance;
                    alan alanVar4 = (alan) aihfVar.build();
                    alanVar4.getClass();
                    alouVar2.d = alanVar4;
                    alouVar2.c = 80;
                    xeuVar3.j((alou) alosVar.build(), zwaVar, j, zvhVar);
                } else {
                    awmdVar = this.F;
                    if (i3 == 3) {
                        xeuVar = (xeu) awmdVar.io();
                        alouVar = alou.a;
                        alos alosVar2 = (alos) alouVar.createBuilder();
                        alosVar2.copyOnWrite();
                        alou alouVar3 = (alou) alosVar2.instance;
                        alan alanVar5 = (alan) aihfVar.build();
                        alanVar5.getClass();
                        alouVar3.d = alanVar5;
                        alouVar3.c = 80;
                        xekVarA = xel.a();
                        xekVarA.d(j);
                        if (zwaVar != null) {
                            xekVarA.b(zwaVar);
                        }
                        if (zvhVar != null) {
                            xekVarA.e(zvhVar);
                        }
                        xeuVar.d((alou) alosVar2.build(), xekVarA.a());
                        if (this.p) {
                            aihf aihfVarCreateBuilder2 = akot.a.createBuilder();
                            aihfVarCreateBuilder2.copyOnWrite();
                            akot akotVar2 = (akot) aihfVarCreateBuilder2.instance;
                            akotVar2.b |= 1;
                            akotVar2.c = true;
                            alos alosVar3 = (alos) alouVar.createBuilder();
                            alosVar3.copyOnWrite();
                            alou alouVar4 = (alou) alosVar3.instance;
                            akot akotVar3 = (akot) aihfVarCreateBuilder2.build();
                            akotVar3.getClass();
                            alouVar4.d = akotVar3;
                            alouVar4.c = 284;
                            xeuVar.b((alou) alosVar3.build());
                        }
                        if (tqjVar.k(1073815368) && z) {
                            this.W.a = j;
                        }
                    } else {
                        xeu xeuVar4 = (xeu) awmdVar.io();
                        alos alosVar4 = (alos) alou.a.createBuilder();
                        alosVar4.copyOnWrite();
                        alou alouVar5 = (alou) alosVar4.instance;
                        alan alanVar6 = (alan) aihfVar.build();
                        alanVar6.getClass();
                        alouVar5.d = alanVar6;
                        alouVar5.c = 80;
                        xeuVar4.b((alou) alosVar4.build());
                    }
                }
                if (tqjVar.k(1073828985)) {
                    i4 = i3 - 1;
                    i5 = 3;
                    if (i4 != 2) {
                        if (i4 != 3) {
                            i5 = 5;
                        } else {
                            i5 = 4;
                        }
                    }
                    ((xkn) this.v.io()).a(i5);
                } else if (tqjVar.k(73350)) {
                    string = UUID.randomUUID().toString();
                    z2 = i3 == 2;
                    if (z2 || this.B < 10) {
                        iA = tqjVar.a(138887);
                        if (iA == 1) {
                            p(string, i3);
                        } else if (iA == 2) {
                            p(string, i3);
                            o(string, i3);
                        } else if (iA == 3) {
                            o(string, i3);
                            p(string, i3);
                        }
                        if (z2) {
                            this.B++;
                        }
                    }
                }
                this.r = -1L;
                this.u = jB;
            } else {
                i2 = i;
            }
            i3 = i2;
            j = jRound;
            if (this.X) {
                if (i3 == 3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                xeuVar2 = (xeu) this.E.io();
                xffVarA = xeuVar2.a(aihfVar, alot.FOREGROUND_HEARTBEAT);
                if (z3) {
                    xffVarA.h = j;
                    if (zwaVar != null) {
                        xffVarA.n = zwaVar.k();
                    }
                    if (zvhVar != null) {
                        xffVarA.o = zvhVar.a;
                        xffVarA.p = zvhVar.b;
                    }
                } else {
                    xffVarA.h = j;
                    if (zwaVar != null) {
                        xffVarA.n = zwaVar.k();
                    }
                    if (zvhVar != null) {
                        xffVarA.o = zvhVar.a;
                        xffVarA.p = zvhVar.b;
                    }
                }
                ztf ztfVar3 = xffVarA.k.e;
                j2 = j;
                xffVarA.l = ztfVar3.a();
                ztfVar3.l(xffVarA);
                if (z3) {
                    if (this.p) {
                        aihf aihfVarCreateBuilder3 = akot.a.createBuilder();
                        aihfVarCreateBuilder3.copyOnWrite();
                        akot akotVar4 = (akot) aihfVarCreateBuilder3.instance;
                        akotVar4.b |= 1;
                        akotVar4.c = true;
                        xff xffVarA3 = xeuVar2.a(aihfVarCreateBuilder3, alot.DUMMY_PAYLOAD);
                        ztf ztfVar4 = xffVarA3.k.e;
                        xffVarA3.l = ztfVar4.a();
                        ztfVar4.k(xffVarA3);
                    }
                    if (tqjVar.k(1073815368)) {
                        this.W.a = j2;
                    }
                }
            } else if (i3 == 4) {
                xeu xeuVar5 = (xeu) this.F.io();
                alos alosVar5 = (alos) alou.a.createBuilder();
                alosVar5.copyOnWrite();
                alou alouVar6 = (alou) alosVar5.instance;
                alan alanVar7 = (alan) aihfVar.build();
                alanVar7.getClass();
                alouVar6.d = alanVar7;
                alouVar6.c = 80;
                xeuVar5.j((alou) alosVar5.build(), zwaVar, j, zvhVar);
            } else {
                awmdVar = this.F;
                if (i3 == 3) {
                    xeuVar = (xeu) awmdVar.io();
                    alouVar = alou.a;
                    alos alosVar6 = (alos) alouVar.createBuilder();
                    alosVar6.copyOnWrite();
                    alou alouVar7 = (alou) alosVar6.instance;
                    alan alanVar8 = (alan) aihfVar.build();
                    alanVar8.getClass();
                    alouVar7.d = alanVar8;
                    alouVar7.c = 80;
                    xekVarA = xel.a();
                    xekVarA.d(j);
                    if (zwaVar != null) {
                        xekVarA.b(zwaVar);
                    }
                    if (zvhVar != null) {
                        xekVarA.e(zvhVar);
                    }
                    xeuVar.d((alou) alosVar6.build(), xekVarA.a());
                    if (this.p) {
                        aihf aihfVarCreateBuilder4 = akot.a.createBuilder();
                        aihfVarCreateBuilder4.copyOnWrite();
                        akot akotVar5 = (akot) aihfVarCreateBuilder4.instance;
                        akotVar5.b |= 1;
                        akotVar5.c = true;
                        alos alosVar7 = (alos) alouVar.createBuilder();
                        alosVar7.copyOnWrite();
                        alou alouVar8 = (alou) alosVar7.instance;
                        akot akotVar6 = (akot) aihfVarCreateBuilder4.build();
                        akotVar6.getClass();
                        alouVar8.d = akotVar6;
                        alouVar8.c = 284;
                        xeuVar.b((alou) alosVar7.build());
                    }
                    if (tqjVar.k(1073815368)) {
                        this.W.a = j;
                    }
                } else {
                    xeu xeuVar6 = (xeu) awmdVar.io();
                    alos alosVar8 = (alos) alou.a.createBuilder();
                    alosVar8.copyOnWrite();
                    alou alouVar9 = (alou) alosVar8.instance;
                    alan alanVar9 = (alan) aihfVar.build();
                    alanVar9.getClass();
                    alouVar9.d = alanVar9;
                    alouVar9.c = 80;
                    xeuVar6.b((alou) alosVar8.build());
                }
            }
            if (tqjVar.k(1073828985)) {
                i4 = i3 - 1;
                i5 = 3;
                if (i4 != 2) {
                    if (i4 != 3) {
                        i5 = 5;
                    } else {
                        i5 = 4;
                    }
                }
                ((xkn) this.v.io()).a(i5);
            } else if (tqjVar.k(73350)) {
                string = UUID.randomUUID().toString();
                if (i3 == 2) {
                }
                if (z2) {
                    iA = tqjVar.a(138887);
                    if (iA == 1) {
                        p(string, i3);
                    } else if (iA == 2) {
                        p(string, i3);
                        o(string, i3);
                    } else if (iA == 3) {
                        o(string, i3);
                        p(string, i3);
                    }
                    if (z2) {
                        this.B++;
                    }
                } else {
                    iA = tqjVar.a(138887);
                    if (iA == 1) {
                        p(string, i3);
                    } else if (iA == 2) {
                        p(string, i3);
                        o(string, i3);
                    } else if (iA == 3) {
                        o(string, i3);
                        p(string, i3);
                    }
                    if (z2) {
                        this.B++;
                    }
                }
            }
            this.r = -1L;
            this.u = jB;
        }
    }

    @Override // defpackage.tcq
    public final void t() {
        g();
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        synchronized (this.i) {
            if (observable == this.G && this.r == -1) {
                this.r = ((Long) obj).longValue();
            }
        }
        if (this.k != 2 || this.o) {
            return;
        }
        j(false);
    }
}
