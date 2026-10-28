package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class soy {
    private apzz a;
    private spb b;
    private sgn c;
    private int d;
    private boolean e;
    private int f;
    private int g;
    private slm h;
    private boolean i;
    private boolean j;
    private boolean k;
    private float l;
    private int m;
    private amud n;
    private boolean o;
    private boolean p;
    private Duration q;
    private boolean r;
    private short s;

    public final soz a() {
        apzz apzzVar;
        spb spbVar;
        sgn sgnVar;
        slm slmVar;
        amud amudVar;
        Duration duration;
        if (this.s == 16383 && (apzzVar = this.a) != null && (spbVar = this.b) != null && (sgnVar = this.c) != null && (slmVar = this.h) != null && (amudVar = this.n) != null && (duration = this.q) != null) {
            return new soz(apzzVar, spbVar, sgnVar, this.d, this.e, this.f, this.g, slmVar, this.i, this.j, this.k, this.l, this.m, amudVar, this.o, this.p, duration, this.r);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" skipAdRenderer");
        }
        if (this.b == null) {
            sb.append(" contentMetadata");
        }
        if (this.c == null) {
            sb.append(" adCountMetadata");
        }
        if ((this.s & 1) == 0) {
            sb.append(" skipState");
        }
        if ((this.s & 2) == 0) {
            sb.append(" hidden");
        }
        if ((this.s & 4) == 0) {
            sb.append(" swipeToSkipProgress");
        }
        if ((this.s & 8) == 0) {
            sb.append(" timeRemainingUntilSkippableMillis");
        }
        if ((this.s & 16) == 0) {
            sb.append(" timeRemainingInAdMillis");
        }
        if (this.h == null) {
            sb.append(" breakType");
        }
        if ((this.s & 32) == 0) {
            sb.append(" DRCtaEnabled");
        }
        if ((this.s & 64) == 0) {
            sb.append(" fullscreen");
        }
        if ((this.s & 128) == 0) {
            sb.append(" countdownOnThumbnail");
        }
        if ((this.s & 256) == 0) {
            sb.append(" countdownNextToThumbnail");
        }
        if ((this.s & 512) == 0) {
            sb.append(" preskipScalingFactor");
        }
        if ((this.s & 1024) == 0) {
            sb.append(" preskipPadding");
        }
        if (this.n == null) {
            sb.append(" clientVeLoggingDirectives");
        }
        if ((this.s & 2048) == 0) {
            sb.append(" autoskipCountdownEnabled");
        }
        if ((this.s & 4096) == 0) {
            sb.append(" keepWatchingButtonEnabled");
        }
        if (this.q == null) {
            sb.append(" timeRemainingUntilAutoskip");
        }
        if ((this.s & 8192) == 0) {
            sb.append(" ctaRendersInPortraitNonFullscreen");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(sgn sgnVar) {
        if (sgnVar == null) {
            throw new NullPointerException("Null adCountMetadata");
        }
        this.c = sgnVar;
    }

    public final void c(boolean z) {
        this.o = z;
        this.s = (short) (this.s | 2048);
    }

    public final void d(slm slmVar) {
        if (slmVar == null) {
            throw new NullPointerException("Null breakType");
        }
        this.h = slmVar;
    }

    public final void e(amud amudVar) {
        if (amudVar == null) {
            throw new NullPointerException("Null clientVeLoggingDirectives");
        }
        this.n = amudVar;
    }

    public final void f(spb spbVar) {
        if (spbVar == null) {
            throw new NullPointerException("Null contentMetadata");
        }
        this.b = spbVar;
    }

    public final void g(boolean z) {
        this.k = z;
        this.s = (short) (this.s | 256);
    }

    public final void h(boolean z) {
        this.r = z;
        this.s = (short) (this.s | 8192);
    }

    public final void i(boolean z) {
        this.i = z;
        this.s = (short) (this.s | 32);
    }

    public final void j(boolean z) {
        this.j = z;
        this.s = (short) (this.s | 64);
    }

    public final void k(boolean z) {
        this.e = z;
        this.s = (short) (this.s | 2);
    }

    public final void l(boolean z) {
        this.p = z;
        this.s = (short) (this.s | 4096);
    }

    public final void m(int i) {
        this.m = i;
        this.s = (short) (this.s | 1024);
    }

    public final void n(float f) {
        this.l = f;
        this.s = (short) (this.s | 512);
    }

    public final void o(apzz apzzVar) {
        if (apzzVar == null) {
            throw new NullPointerException("Null skipAdRenderer");
        }
        this.a = apzzVar;
    }

    public final void p(int i) {
        this.d = i;
        this.s = (short) (this.s | 1);
    }

    public final void q(int i) {
        this.g = i;
        this.s = (short) (this.s | 16);
    }

    public final void r(Duration duration) {
        if (duration == null) {
            throw new NullPointerException("Null timeRemainingUntilAutoskip");
        }
        this.q = duration;
    }

    public final void s(int i) {
        this.f = i;
        this.s = (short) (this.s | 8);
    }

    public final void t() {
        this.s = (short) (this.s | 128);
    }

    public final void u() {
        this.s = (short) (this.s | 4);
    }
}
