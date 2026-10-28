package defpackage;

import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import androidx.media3.decoder.av1.Libdav1dVideoRenderer;
import androidx.media3.exoplayer.ExoPlayer;
import j$.util.Objects;
import j$.util.Optional;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yzo implements zll {
    final zeo a;
    public final yye b;
    final yzz c;
    public ExoPlayer d;
    public yzt e;
    public yzr f;
    public Libdav1dVideoRenderer g;
    public jux h;
    public ctm i;
    ctl j;
    boolean l;
    final yyv m;
    private final twv n;
    private final yyb o;
    private final zjr p;
    private final yzm q;
    private cdp r;
    private int t;
    private int u;
    private boolean v;
    private final Optional w;
    private final jui z;
    private boolean y = false;
    public Surface k = null;
    private cdp s = null;
    private zjv x = zjv.b;

    public yzo(ExoPlayer exoPlayer, yye yyeVar, zeo zeoVar, yzz yzzVar, yzt yztVar, yzr yzrVar, Libdav1dVideoRenderer libdav1dVideoRenderer, jux juxVar, yyv yyvVar, twv twvVar, yyb yybVar, zjr zjrVar, jui juiVar, Optional optional, yzm yzmVar) {
        this.d = exoPlayer;
        this.b = yyeVar;
        this.a = zeoVar;
        this.c = yzzVar;
        this.e = yztVar;
        this.f = yzrVar;
        this.g = libdav1dVideoRenderer;
        this.h = juxVar;
        this.m = yyvVar;
        this.n = twvVar;
        this.o = yybVar;
        this.z = juiVar;
        this.w = optional;
        this.r = yztVar;
        this.p = zjrVar;
        this.q = yzmVar;
        if (zjrVar.cv()) {
            this.r = juxVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    /* JADX WARN: Code duplicated, block: B:18:0x003c A[Catch: TimeoutException -> 0x012f, InterruptedException -> 0x0155, TryCatch #2 {InterruptedException -> 0x0155, TimeoutException -> 0x012f, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x0014, B:10:0x001a, B:12:0x0022, B:14:0x002d, B:16:0x0035, B:19:0x0040, B:21:0x0046, B:27:0x0059, B:29:0x005d, B:30:0x0064, B:49:0x00b0, B:51:0x00b4, B:53:0x00bd, B:55:0x00cc, B:57:0x00d0, B:58:0x00d6, B:60:0x00de, B:61:0x00e0, B:63:0x00ef, B:64:0x00f5, B:70:0x012c, B:65:0x0117, B:67:0x011f, B:69:0x0123, B:31:0x006e, B:33:0x0076, B:35:0x007e, B:37:0x0084, B:43:0x00a1, B:46:0x00a9, B:38:0x0092, B:40:0x0096, B:41:0x009b, B:18:0x003c, B:5:0x0006), top: B:80:0x0001 }] */
    private final Boolean t(zcf zcfVar) {
        Surface surfaceF;
        ctl ctlVarO;
        boolean z;
        boolean z2;
        ctm ctmVar;
        ctm ctmVarB;
        try {
            ywn ywnVar = zcfVar == null ? ywn.b : zcfVar.Z;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            zlo zloVarB = zlo.NONE;
            zlm zlmVar = this.b.l;
            if (zlmVar != null) {
                if (!zlmVar.m()) {
                    surfaceF = null;
                } else if (this.p.bd()) {
                    View viewP = ((zkt) zlmVar).p();
                    if (viewP instanceof zkn) {
                        SurfaceHolder surfaceHolderN = ((zkn) viewP).n();
                        if (surfaceHolderN != null) {
                            surfaceF = surfaceHolderN.getSurface();
                        } else {
                            surfaceF = null;
                        }
                    } else {
                        surfaceF = zlmVar.f();
                    }
                } else {
                    surfaceF = zlmVar.f();
                }
                if (zlmVar.m()) {
                    zloVarB = zlmVar.B();
                    ctlVarO = zlmVar.o();
                } else {
                    ctlVarO = null;
                }
            } else {
                surfaceF = null;
                ctlVarO = null;
            }
            if (surfaceF == null && ctlVarO == null) {
                if (this.v) {
                    yzm yzmVar = this.q;
                    this.v = false;
                    yzmVar.c(null);
                }
                z2 = z(null) | y(null, ywnVar);
            } else {
                yzm yzmVar2 = this.q;
                if (yzmVar2.f() && zlmVar.B() == zlo.SURFACE && zlmVar.o() == null) {
                    this.v = true;
                    z = z(yzmVar2.a());
                    yzmVar2.c(surfaceF);
                } else {
                    if (this.v) {
                        this.v = false;
                        yzmVar2.c(null);
                    }
                    z = z(surfaceF);
                }
                if (ctlVarO != null) {
                    z |= y(ctlVarO, ywnVar);
                }
                z2 = z;
                if (z2) {
                    x();
                }
            }
            if (zcfVar != null && (z2 || !zcfVar.K)) {
                ywnVar.v(zloVarB.k);
                zcfVar.K = true;
                if (surfaceF != null) {
                    zcfVar.b.b().at(jElapsedRealtime, SystemClock.elapsedRealtime());
                }
            }
            if (zlmVar != null) {
                if (this.v) {
                    ctmVarB = zlmVar;
                    ctmVarB = this.q.b();
                }
                ctmVarB = zlmVar;
                if (this.p.fg()) {
                    this.i = ctmVarB;
                }
                ExoPlayer exoPlayer = this.d;
                ((ccm) exoPlayer).ae();
                ctm ctmVar2 = ((ccm) exoPlayer).x;
                if (ctmVar2 != null) {
                    ((ccm) exoPlayer).X(ctmVar2);
                }
                ((ccm) exoPlayer).x = ctmVarB;
                ((ccm) exoPlayer).ae();
                cdn cdnVarT = ((ccm) exoPlayer).T(((ccm) exoPlayer).j);
                cdnVarT.g(10001);
                cdnVarT.f(ctmVarB);
                cdnVarT.e();
            } else if (this.p.fg() && (ctmVar = this.i) != null) {
                ((ccm) this.d).X(ctmVar);
                this.i = null;
            }
            return Boolean.TRUE;
        } catch (InterruptedException e) {
            v(zcfVar, "player.fatalexception", e);
            return Boolean.FALSE;
        } catch (TimeoutException e2) {
            this.k = null;
            yyv yyvVar = this.m;
            yyvVar.aw();
            if (zcfVar != null) {
                zhz zhzVar = new zhz(zhw.a, "player.timeout", yyvVar.e(), "c.MediaViewManager", e2, null);
                zhzVar.o();
                zcfVar.b.h(zhzVar);
            }
            return Boolean.FALSE;
        }
    }

    private final void u() {
        long jD = this.b.d.i.d(60, 45852455L);
        if (jD > 0) {
            cdn cdnVarD = this.d.d(new yzn());
            cdnVarD.g(10000);
            cdnVarD.e();
            try {
                cdnVarD.c(jD);
            } catch (TimeoutException e) {
                zhr.e(zhq.EXO, "Bounded wait for surface change elapsed after %dms; proceeding.", Long.valueOf(jD));
                v(this.b.m, "player.timeout", e);
            }
        }
    }

    private final void v(zcf zcfVar, String str, Exception exc) {
        if (zcfVar != null) {
            zcfVar.b.h(new zhz(zhw.a, str, this.m.e(), "c.MediaViewManager", exc, null));
        }
    }

    private final void w(cdp cdpVar, ctl ctlVar) {
        zjr zjrVar = this.b.d;
        if (zjrVar.cY() && ctlVar == null) {
            ccm ccmVar = (ccm) this.d;
            ccmVar.ae();
            ccmVar.Z(null);
            ccmVar.V(0, 0);
            return;
        }
        long jC = zjrVar.C();
        cdn cdnVarD = this.d.d(cdpVar);
        cdnVarD.g(1);
        cdnVarD.f(ctlVar);
        cdnVarD.e();
        try {
            cdnVarD.c(jC);
        } catch (InterruptedException | TimeoutException e) {
            if (this.b.d.au()) {
                cdnVarD.d();
            }
            throw e;
        }
    }

    private final void x() {
        zlm zlmVar = this.b.l;
        if (zlmVar == null || !zlmVar.m()) {
            return;
        }
        zlmVar.k(this.t, this.u);
        if (this.v) {
            this.q.e(this.t, this.u);
        }
    }

    private final boolean y(ctl ctlVar, ywn ywnVar) {
        if (this.j == ctlVar) {
            return false;
        }
        ywnVar.w("sobrd", "1");
        w(this.g, ctlVar);
        w(this.f, ctlVar);
        this.j = ctlVar;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f8  */
    private final boolean z(Surface surface) {
        long jC;
        zjr zjrVar;
        cdn cdnVar;
        cdm cdmVar;
        zki zkiVar;
        Object juuVar;
        cdn cdnVarD;
        View viewP;
        cdp cdpVar;
        Surface surface2;
        boolean z = false;
        if (this.k == surface && (!this.p.bf() || this.s == null)) {
            return false;
        }
        jui juiVar = this.z;
        if (juiVar != null && surface == null) {
            juiVar.a();
        }
        if (this.v && juiVar != null && surface != null && this.k != surface) {
            juiVar.a();
        }
        yye yyeVar = this.b;
        zjr zjrVar2 = yyeVar.d;
        boolean z2 = (zjrVar2.S().s && surface == null && (this.d.n() == 1 || this.d.n() == 4)) || (zjrVar2.i.m(485, 45831337L) && surface == null);
        boolean zCX = zjrVar2.cX();
        if (zjrVar2.j.m(283, 45703763L) && this.x == null) {
            z = true;
        }
        if (!zjrVar2.cY()) {
            jC = zjrVar2.C();
            zjrVar = this.p;
            cdnVar = null;
            if (zjrVar.bf() && (cdpVar = this.s) != null && cdpVar != this.r) {
                cdn cdnVarD2 = this.d.d(cdpVar);
                cdnVarD2.g(1);
                cdnVarD2.f(null);
                cdnVarD2.e();
                cdnVar = cdnVarD2;
            }
            if (zjrVar.bf()) {
                cdmVar = this.r;
            } else {
                cdmVar = this.e;
            }
            zkiVar = yyeVar.l;
            if (zkiVar instanceof zkt) {
                viewP = ((zkt) zkiVar).p();
                if (viewP instanceof zkn) {
                    zkiVar = (zkn) viewP;
                }
            }
            if (surface == null && zjrVar.bf() && zjrVar.be() && Objects.equals(cdmVar, this.h) && (zkiVar instanceof zkn)) {
                long j = ((zkn) zkiVar).g.get();
                if (j != 0) {
                    juuVar = new juu(surface, j);
                } else {
                    juuVar = surface;
                }
            } else {
                juuVar = surface;
            }
            cdnVarD = this.d.d(cdmVar);
            cdnVarD.g(1);
            cdnVarD.f(juuVar);
            cdnVarD.e();
            if (cdnVar != null && !zCX) {
                try {
                    cdnVar.c(jC);
                } catch (InterruptedException | TimeoutException e) {
                    if (this.p.au()) {
                        if (cdnVar != null) {
                            cdnVar.d();
                        }
                        cdnVarD.d();
                    }
                    throw e;
                }
            }
            if (!z2 && !zCX) {
                cdnVarD.c(jC);
            }
        } else if (zCX || !z2 || z) {
            this.d.D(surface);
        } else {
            z2 = true;
            jC = zjrVar2.C();
            zjrVar = this.p;
            cdnVar = null;
            if (zjrVar.bf()) {
                cdn cdnVarD3 = this.d.d(cdpVar);
                cdnVarD3.g(1);
                cdnVarD3.f(null);
                cdnVarD3.e();
                cdnVar = cdnVarD3;
            }
            if (zjrVar.bf()) {
                cdmVar = this.r;
            } else {
                cdmVar = this.e;
            }
            zkiVar = yyeVar.l;
            if (zkiVar instanceof zkt) {
                viewP = ((zkt) zkiVar).p();
                if (viewP instanceof zkn) {
                    zkiVar = (zkn) viewP;
                }
            }
            if (surface == null) {
                juuVar = surface;
            } else {
                juuVar = surface;
            }
            cdnVarD = this.d.d(cdmVar);
            cdnVarD.g(1);
            cdnVarD.f(juuVar);
            cdnVarD.e();
            if (cdnVar != null) {
                cdnVar.c(jC);
            }
            if (!z2) {
                cdnVarD.c(jC);
            }
        }
        if (zCX && (surface2 = this.k) != null && !surface2.equals(surface)) {
            u();
        }
        this.a.l(this.k, surface, zsf.c);
        this.k = surface;
        return true;
    }

    @Override // defpackage.zll
    public final void a(String str, String str2) {
        this.b.c().w(str, str2);
    }

    @Override // defpackage.zll
    public final void b() {
        t(this.b.m);
    }

    @Override // defpackage.zll
    public final void c() {
        this.a.o(zsf.c);
        this.o.d(7);
        t(this.b.m);
    }

    @Override // defpackage.zll
    public final void d() {
        h();
    }

    @Override // defpackage.zll
    public final void e(boolean z, String str) {
        this.a.q(zsf.c);
        if (this.b.m != null) {
            zhv zhvVar = new zhv("gl");
            yyv yyvVar = this.m;
            zhvVar.e(yyvVar.e());
            zhvVar.c = str;
            zhvVar.e = z;
            yyvVar.al(zhvVar.a());
        }
    }

    @Override // defpackage.zll
    public final void f(Surface surface, int i, int i2) {
        yye yyeVar = this.b;
        if (yyeVar.d.j.m(198, 45624386L)) {
            zlm zlmVar = yyeVar.l;
            if (zlmVar == null || zlmVar.B() == zlo.SURFACE) {
                zcf zcfVar = yyeVar.m;
                if (zcfVar != null) {
                    if (yyeVar.c() != null) {
                        yyeVar.c();
                    }
                    Object objIo = yyeVar.f.io();
                    zfd zfdVar = (zfd) this.w.get();
                    akwm akwmVar = zcfVar.y.d.f;
                    if (akwmVar == null) {
                        akwmVar = akwm.b;
                    }
                    zkj zkjVar = (zkj) objIo;
                    int i3 = zkjVar.c;
                    int i4 = zkjVar.d;
                    boolean z = akwmVar.aT;
                    zfdVar.a();
                }
                if (surface != null) {
                    this.d.D(surface);
                    cdn cdnVarD = this.d.d(this.e);
                    cdnVarD.g(14);
                    cdnVarD.f(new bwc(i, i2));
                    cdnVarD.e();
                }
            }
        }
    }

    public final void g() {
        cdn cdnVarD;
        cdp cdpVar;
        if (this.d != null) {
            try {
                zjr zjrVar = this.p;
                long jC = zjrVar.C();
                cdn cdnVar = null;
                if (!zjrVar.bf() || (cdpVar = this.s) == null || cdpVar.equals(this.r)) {
                    cdnVarD = null;
                } else {
                    cdnVarD = this.d.d(this.s);
                    cdnVarD.g(1);
                    cdnVarD.f(null);
                    cdnVarD.e();
                }
                cdm cdmVar = zjrVar.bf() ? this.r : this.e;
                if (cdmVar != null) {
                    cdn cdnVarD2 = this.d.d(cdmVar);
                    cdnVarD2.g(1);
                    cdnVarD2.f(null);
                    cdnVarD2.e();
                    cdnVar = cdnVarD2;
                }
                if (cdnVarD != null) {
                    try {
                        cdnVarD.c(jC);
                    } catch (InterruptedException | TimeoutException e) {
                        if (this.p.au()) {
                            if (cdnVarD != null) {
                                cdnVarD.d();
                            }
                            if (cdnVar != null) {
                                cdnVar.d();
                            }
                        }
                        throw e;
                    }
                }
                if (cdnVar != null) {
                    cdnVar.c(jC);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                this.m.aw();
            }
        }
    }

    public final void h() {
        this.a.p(zsf.c);
        this.o.c(7, ajvs.CODEC_INIT_REASON_BACKGROUND);
        t(this.b.m);
    }

    public final void i(Surface surface) {
        if (this.h == null) {
            if (surface == null || !this.p.ay()) {
                return;
            }
            surface.release();
            return;
        }
        zjr zjrVar = this.p;
        if (zjrVar.eD() || zjrVar.ay()) {
            jux juxVar = this.h;
            if (juxVar.ad.W() || juxVar.ad.p()) {
                juxVar.aj.set(false);
            }
            cdn cdnVarD = this.d.d(this.h);
            cdnVarD.g(10101);
            cdnVarD.f(surface);
            cdnVarD.e();
            return;
        }
        if (!zjrVar.i.m(411, 45791375L)) {
            cdn cdnVarD2 = this.d.d(this.h);
            cdnVarD2.g(10101);
            cdnVarD2.f(surface);
            cdnVarD2.e();
            return;
        }
        long jC = zjrVar.C();
        cdn cdnVarD3 = this.d.d(this.h);
        cdnVarD3.g(10101);
        cdnVarD3.f(surface);
        cdnVarD3.e();
        try {
            cdnVarD3.c(jC);
        } catch (InterruptedException unused) {
            if (this.p.au()) {
                cdnVarD3.d();
            }
            Thread.currentThread().interrupt();
        } catch (TimeoutException unused2) {
            if (this.p.au()) {
                cdnVarD3.d();
            }
            this.m.aw();
        }
    }

    public final void j(Surface surface, long j) {
        jux juxVar = this.h;
        if (juxVar != null) {
            ExoPlayer exoPlayer = this.d;
            if (j == 0) {
                cdn cdnVarD = exoPlayer.d(juxVar);
                cdnVarD.g(10100);
                cdnVarD.f(surface);
                cdnVarD.e();
                return;
            }
            cdn cdnVarD2 = exoPlayer.d(juxVar);
            cdnVarD2.g(10100);
            cdnVarD2.f(new juu(surface, j));
            cdnVarD2.e();
        }
    }

    public final void k(boolean z, long j, long j2, boolean z2) {
        StringBuilder sb = new StringBuilder("sf_swap.");
        sb.append(true != z ? "sec" : "pri");
        sb.append('_');
        sb.append(true != z2 ? "drop" : "fb");
        sb.append(";req.");
        sb.append(j);
        sb.append(";cur.");
        sb.append(j2);
        a("ecdi", sb.toString());
    }

    final void l(int i, int i2) {
        this.t = i;
        this.u = i2;
        x();
    }

    public final void m(boolean z, byte[] bArr, long j) {
        zlm zlmVar = this.b.l;
        if (zlmVar != null) {
            zlmVar.u(z, bArr, j, z ? 0L : this.m.e() * 1000);
        }
    }

    final void n(zlo zloVar) {
        zlm zlmVar = this.b.l;
        if (zlmVar != null) {
            this.a.i(zloVar, zsf.c);
            zlmVar.w(zloVar);
            this.m.ap(zloVar);
        }
    }

    final void o(boolean z) {
        zlm zlmVar = this.b.l;
        if (zlmVar != null) {
            if (z) {
                zlmVar.K(1);
                zhq zhqVar = zhq.ABR;
            } else {
                zlmVar.J(1);
                zhq zhqVar2 = zhq.ABR;
            }
        }
    }

    public final boolean p() {
        return this.b.l != null;
    }

    final boolean q(zcf zcfVar) {
        boolean z = false;
        if (zcfVar != null) {
            yye yyeVar = this.b;
            zjr zjrVar = yyeVar.d;
            yzc yzcVar = yyeVar.c;
            boolean z2 = yzcVar.b && !yzcVar.c;
            z = this.l != z2;
            this.l = z2;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01db  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:138:0x022b  */
    public final boolean r(zlm zlmVar, zcf zcfVar, boolean z, boolean z2) {
        int i;
        zlo zloVarB;
        zlo zloVarB2;
        int i2;
        wiz wizVar;
        boolean z3;
        boolean z4;
        zlo zloVarW;
        cdp cdpVar;
        zjv zjvVarG = null;
        if (this.h != null && !this.y) {
            this.h.by(new dov(new tar(this, 20), (byte[]) null));
            this.y = true;
        }
        yye yyeVar = this.b;
        zlm zlmVar2 = yyeVar.l;
        if (zlmVar2 != zlmVar) {
            if (zlmVar2 != null) {
                if (!yyeVar.d.S().Z) {
                    o(false);
                }
                zlmVar2.q();
                zlmVar2.v(null);
                this.a.g(null, zsf.c);
            }
            boolean z5 = zlmVar2 == null;
            boolean z6 = zlmVar == null;
            yyeVar.l = zlmVar;
            boolean z7 = zlmVar != null;
            boolean z8 = z5 ^ z6;
            int i3 = 7;
            if (this.p.dN()) {
                if (z8) {
                    twv twvVar = this.n;
                    if (twvVar.c()) {
                        ytp ytpVar = (ytp) twvVar.io();
                        yzz yzzVar = this.c;
                        yzzVar.getClass();
                        ytpVar.v(z7, new ywt(yzzVar, i3), true);
                    } else {
                        this.c.r(null);
                    }
                }
            } else if (z8) {
                twv twvVar2 = this.n;
                if (twvVar2.c()) {
                    ytp ytpVar2 = (ytp) twvVar2.io();
                    yzz yzzVar2 = this.c;
                    yzzVar2.getClass();
                    ytpVar2.v(z7, new ywt(yzzVar2, i3), false);
                }
                this.c.r(null);
            }
        }
        if (zlmVar != null) {
            zlmVar.v(this);
            zeo zeoVar = this.a;
            zeoVar.g(this, zsf.c);
            if (zcfVar != null) {
                ywn ywnVar = zcfVar.Z;
                zeoVar.a(ywnVar);
                if (!zcfVar.t || z2) {
                    yzc yzcVar = yyeVar.c;
                    yzcVar.c();
                    yzcVar.d(zcfVar);
                }
                q(zcfVar);
                zcd zcdVar = zcfVar.C;
                int iOrdinal = zcdVar.b().ordinal();
                if (iOrdinal == 0) {
                    zjvVarG = zcfVar.g();
                } else {
                    if (iOrdinal != 1) {
                        throw new AssertionError(zcdVar.b());
                    }
                    zcp zcpVarE = zcfVar.e();
                    if (zcpVarE != null) {
                        zjvVarG = ((zbv) zcpVarE).a;
                    }
                }
                this.x = zjvVarG;
                zjr zjrVar = this.p;
                if (zjrVar.bf()) {
                    zjv zjvVar = this.x;
                    if (zjvVar != null) {
                        zcp zcpVarE2 = zcfVar.e();
                        boolean z9 = zcpVarE2 != null ? !((zbv) zcpVarE2).c.N() : false;
                        boolean z10 = zcfVar.y.i;
                        if (!zjrVar.cv() || z10 || z9) {
                            int iOrdinal2 = zjvVar.ordinal();
                            if (iOrdinal2 != 3) {
                                cdpVar = iOrdinal2 != 6 ? this.e : this.g;
                            } else {
                                cdpVar = this.f;
                            }
                        } else {
                            cdpVar = this.h;
                        }
                        this.s = this.r;
                        this.r = cdpVar;
                    } else {
                        this.s = this.r;
                    }
                }
                zjr zjrVar2 = yyeVar.d;
                zcd zcdVar2 = zcfVar.C;
                int iOrdinal3 = zcdVar2.b().ordinal();
                if (iOrdinal3 == 0) {
                    i = 2;
                    if (zjrVar2.cZ()) {
                        ywnVar.w("mvc", "c;rt." + String.valueOf(zcfVar.g()) + ";vdgsv." + zjrVar2.eH());
                    }
                    wja wjaVar = zcfVar.A;
                    wiu wiuVar = zcfVar.y;
                    zjv zjvVarG2 = zcfVar.g();
                    boolean z11 = zcfVar.y.g;
                    boolean z12 = this.l;
                    if (wiuVar == null || wjaVar == null) {
                        zloVarB = zlmVar.B();
                    } else {
                        boolean z13 = z12 || wjaVar.g() != wiz.a || wiuVar.aM(wjaVar.g());
                        if ((yno.y(zjrVar2, wiuVar, zjvVarG2 == zjv.d) || z13) && yno.x(wjaVar, z11)) {
                            zloVarB = zlo.GL_CARDBOARD;
                        } else if (zjvVarG2 == zjv.g) {
                            zloVarB = yno.w(zjrVar2);
                        } else if (wjaVar.A) {
                            zloVarB = zlo.SECURE_SURFACE;
                        } else if (zjrVar2.bG()) {
                            zloVarB = zlo.GL_SURFACE;
                        } else {
                            zloVarB = (!zjrVar2.bf() || wiuVar.i) ? zlo.SURFACE : zlo.DUAL_SURFACE;
                        }
                    }
                    zloVarB2 = (zloVarB != zlo.SURFACE || (!zjrVar2.er() && (wiuVar == null || !wiuVar.aZ()))) ? zloVarB : zlo.SECURE_SURFACE;
                } else {
                    if (iOrdinal3 != 1) {
                        throw new AssertionError(zcdVar2.b());
                    }
                    zcp zcpVarE3 = zcfVar.e();
                    if (zcpVarE3 == null) {
                        zloVarB2 = zlmVar.B();
                        i = 2;
                    } else {
                        if (zjrVar2.cZ()) {
                            ywnVar.w("mvc", "s;rt." + ((zbv) zcpVarE3).a.toString() + ";vdgsv." + zjrVar2.eH());
                        }
                        zbv zbvVar = (zbv) zcpVarE3;
                        wgs wgsVar = zbvVar.c;
                        zjv zjvVar2 = zbvVar.a;
                        int iAn = wgsVar.an();
                        int iAo = wgsVar.ao();
                        boolean zAh = wgsVar.ah();
                        wiu wiuVar2 = zcfVar.y;
                        wiv wivVar = zcfVar.A.m;
                        boolean z14 = zcfVar.y.g;
                        boolean z15 = this.l;
                        if (wivVar.a == 1) {
                            wizVar = wiz.d;
                        } else if (iAn == 3) {
                            wizVar = wiz.b;
                        } else if (iAn == 4) {
                            wizVar = wiz.c;
                        } else {
                            if (iAn == 5) {
                                wizVar = wiz.f;
                            } else {
                                i2 = 2;
                                wizVar = (iAn == 2 && (iAo == 2 || iAo == 3)) ? wiz.d : wiz.a;
                            }
                            if (z15 && wizVar == wiz.a && !wiuVar2.aM(wizVar)) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            if (zjvVar2 == zjv.d) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if ((yno.y(zjrVar2, wiuVar2, z4) && !z3) || zAh || z14) {
                                if (zjvVar2 == zjv.g) {
                                    zloVarW = yno.w(zjrVar2);
                                } else if (zAh) {
                                    zloVarW = zlo.SECURE_SURFACE;
                                } else if (zjrVar2.bG()) {
                                    zloVarW = zlo.GL_SURFACE;
                                } else {
                                    zloVarW = (!zjrVar2.bf() || wiuVar2.i) ? zlo.SURFACE : zlo.DUAL_SURFACE;
                                }
                            }
                            if (zloVarW == zlo.SURFACE || !(zjrVar2.er() || wiuVar2.aZ())) {
                                zloVarB2 = zloVarW;
                            } else {
                                zloVarB2 = zlo.SECURE_SURFACE;
                            }
                            i = i2;
                        }
                        i2 = 2;
                        if (z15) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (zjvVar2 == zjv.d) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zloVarW = yno.y(zjrVar2, wiuVar2, z4) ? zlo.GL_CARDBOARD : zlo.GL_CARDBOARD;
                        if (zloVarW == zlo.SURFACE) {
                            zloVarB2 = zloVarW;
                        } else {
                            zloVarB2 = zloVarW;
                        }
                        i = i2;
                    }
                }
                yyeVar.c.e(zcfVar);
                n(zloVarB2);
                if (zlmVar.B().equals(zlo.GL_CARDBOARD)) {
                    zlmVar.A((zcfVar.g() == zjv.d || zcfVar.g() == zjv.g) ? i : 1);
                }
                o(z && zcfVar.d.c != 4);
            }
            x();
        } else {
            this.m.ap(zlo.NONE);
        }
        return t(zcfVar).booleanValue();
    }

    final void s() {
        zcf zcfVar = this.b.m;
        try {
            if (this.v) {
                yzm yzmVar = this.q;
                this.v = false;
                yzmVar.c(null);
            }
            z(null);
        } catch (InterruptedException e) {
            v(zcfVar, "player.fatalexception", e);
        } catch (TimeoutException e2) {
            this.k = null;
            v(zcfVar, "player.timeout", e2);
        }
    }
}
