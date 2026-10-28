package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adng {
    public adma a;
    public View b;
    private long c;
    private Runnable d;
    private Runnable e;
    private int f;
    private int g;
    private int h;
    private int i;
    private byte j;

    public final adnh a() {
        Runnable runnable;
        Runnable runnable2;
        if (this.j == 31 && (runnable = this.d) != null && (runnable2 = this.e) != null) {
            return new adnh(this.a, this.b, this.c, runnable, runnable2, this.f, this.g, this.h, this.i);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb.append(" duration");
        }
        if (this.d == null) {
            sb.append(" onStart");
        }
        if (this.e == null) {
            sb.append(" onEnd");
        }
        if ((this.j & 2) == 0) {
            sb.append(" fromX");
        }
        if ((this.j & 4) == 0) {
            sb.append(" fromY");
        }
        if ((this.j & 8) == 0) {
            sb.append(" toX");
        }
        if ((this.j & 16) == 0) {
            sb.append(" toY");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(long j) {
        this.c = j;
        this.j = (byte) (this.j | 1);
    }

    public final void c(int i) {
        this.f = i;
        this.j = (byte) (this.j | 2);
    }

    public final void d(int i) {
        this.g = i;
        this.j = (byte) (this.j | 4);
    }

    public final void e(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("Null onEnd");
        }
        this.e = runnable;
    }

    public final void f(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("Null onStart");
        }
        this.d = runnable;
    }

    public final void g(int i) {
        this.h = i;
        this.j = (byte) (this.j | 8);
    }

    public final void h(int i) {
        this.i = i;
        this.j = (byte) (this.j | 16);
    }
}
