package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abno {
    public xir a;
    public zkj b;
    private boolean c;
    private int d;
    private int e;
    private boolean f;
    private Optional g;
    private Optional h;
    private int i;
    private Optional j;
    private abxz k;
    private boolean l;
    private jrj m;
    private byte n;

    public abno(byte[] bArr) {
        this.g = Optional.empty();
        this.h = Optional.empty();
        this.j = Optional.empty();
    }

    public final abnp a() {
        if (this.n == 127 && this.k != null && this.m != null) {
            return new abnp(this.a, this.c, this.d, this.e, this.f, this.b, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.n & 1) == 0) {
            sb.append(" shouldUseQueuedVideoForNavigation");
        }
        if ((this.n & 2) == 0) {
            sb.append(" watchNextResponseProcessingDelay");
        }
        if ((this.n & 4) == 0) {
            sb.append(" watchNextResponseParsingDelay");
        }
        if ((this.n & 8) == 0) {
            sb.append(" shouldPauseOnLastFrame");
        }
        if ((this.n & 16) == 0) {
            sb.append(" mediaSessionDisabled");
        }
        if ((this.n & 32) == 0) {
            sb.append(" loopState");
        }
        if (this.k == null) {
            sb.append(" playbackStartSettingsParameters");
        }
        if ((this.n & 64) == 0) {
            sb.append(" autoAdvance");
        }
        if (this.m == null) {
            sb.append(" audioRoute");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(jrj jrjVar) {
        if (jrjVar == null) {
            throw new NullPointerException("Null audioRoute");
        }
        this.m = jrjVar;
    }

    public final void c(boolean z) {
        this.l = z;
        this.n = (byte) (this.n | 64);
    }

    public final void d(arfb arfbVar) {
        this.g = Optional.of(arfbVar);
    }

    public final void e(int i) {
        this.h = Optional.of(Integer.valueOf(i));
    }

    public final void f(int i) {
        this.i = i;
        this.n = (byte) (this.n | 32);
    }

    public final void g(abxz abxzVar) {
        if (abxzVar == null) {
            throw new NullPointerException("Null playbackStartSettingsParameters");
        }
        this.k = abxzVar;
    }

    public final void h(boolean z) {
        this.f = z;
        this.n = (byte) (this.n | 8);
    }

    public final void i(boolean z) {
        this.c = z;
        this.n = (byte) (this.n | 1);
    }

    public final void j(zgp zgpVar) {
        this.j = Optional.of(zgpVar);
    }

    public final void k(int i) {
        this.e = i;
        this.n = (byte) (this.n | 4);
    }

    public final void l(int i) {
        this.d = i;
        this.n = (byte) (this.n | 2);
    }

    public final void m() {
        this.n = (byte) (this.n | 16);
    }

    public abno() {
        throw null;
    }
}
