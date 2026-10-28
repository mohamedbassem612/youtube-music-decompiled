package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vzq {
    public int a;
    public int b;
    public byte c;
    public Object d;

    public vzq() {
        this.d = Optional.empty();
    }

    public final void a(zwa zwaVar) {
        this.d = Optional.of(zwaVar);
    }

    public final qis b() {
        int i;
        Object obj;
        if (this.c == 7 && (i = this.a) != 0 && (obj = this.d) != null) {
            return new qis(i, this.b, (nrj) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" enablement");
        }
        if ((this.c & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if (this.d == null) {
            sb.append(" dynamicSampler");
        }
        if ((this.c & 2) == 0) {
            sb.append(" recordTimerDuration");
        }
        if ((this.c & 4) == 0) {
            sb.append(" sendEmptyTraces");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final ini c() {
        Object obj;
        if ((this.c & 1) == 0) {
            throw new IllegalStateException("Property \"index\" has not been set");
        }
        e(Math.max(this.a, 0));
        if ((this.c & 2) == 0) {
            throw new IllegalStateException("Property \"playbackPosition\" has not been set");
        }
        f(Math.max(this.b, -1));
        if (this.c == 3 && (obj = this.d) != null) {
            return new ini(this.a, this.b, (String) obj);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" index");
        }
        if ((this.c & 2) == 0) {
            sb.append(" playbackPosition");
        }
        if (this.d == null) {
            sb.append(" containerId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null containerId");
        }
        this.d = str;
    }

    public final void e(int i) {
        this.a = i;
        this.c = (byte) (this.c | 1);
    }

    public final void f(int i) {
        this.b = i;
        this.c = (byte) (this.c | 2);
    }

    public vzq(byte[] bArr) {
    }
}
