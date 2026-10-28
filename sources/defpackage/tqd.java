package defpackage;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tqd {
    public boolean a;
    public int b;
    public ScheduledFuture c;
    public byte d = 63;
    private long[] e;
    private long[] f;
    private int g;
    private int h;
    private int i;
    private int j;

    public tqd(tqe tqeVar) {
        this.e = tqeVar.a;
        this.f = tqeVar.b;
        this.a = tqeVar.c;
        this.g = tqeVar.d;
        this.h = tqeVar.e;
        this.i = tqeVar.f;
        this.j = tqeVar.g;
        this.b = tqeVar.h;
        this.c = tqeVar.i;
    }

    final tqe a() {
        long[] jArr;
        long[] jArr2;
        if ((this.d & 8) == 0) {
            throw new IllegalStateException("Property \"changeCount\" has not been set");
        }
        e(this.i + 1);
        if (this.d == 63 && (jArr = this.e) != null && (jArr2 = this.f) != null) {
            return new tqe(jArr, jArr2, this.a, this.g, this.h, this.i, this.j, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == null) {
            sb.append(" active");
        }
        if (this.f == null) {
            sb.append(" serialized");
        }
        if ((this.d & 1) == 0) {
            sb.append(" isDirty");
        }
        if ((this.d & 2) == 0) {
            sb.append(" disposed");
        }
        if ((this.d & 4) == 0) {
            sb.append(" maskedLikely");
        }
        if ((this.d & 8) == 0) {
            sb.append(" changeCount");
        }
        if ((this.d & 16) == 0) {
            sb.append(" serialDelaySec");
        }
        if ((this.d & 32) == 0) {
            sb.append(" serializationFailures");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    final boolean b() {
        if ((this.d & 4) != 0) {
            return tqe.b(this.h);
        }
        throw new IllegalStateException("Property \"maskedLikely\" has not been set");
    }

    public final int c() {
        if ((this.d & 2) != 0) {
            return this.g;
        }
        throw new IllegalStateException("Property \"disposed\" has not been set");
    }

    public final int d() {
        if ((this.d & 16) != 0) {
            return this.j;
        }
        throw new IllegalStateException("Property \"serialDelaySec\" has not been set");
    }

    public final void e(int i) {
        this.i = i;
        this.d = (byte) (this.d | 8);
    }

    public final void f(int i) {
        this.g = i;
        this.d = (byte) (this.d | 2);
    }

    public final void g(boolean z) {
        this.a = z;
        this.d = (byte) (this.d | 1);
    }

    public final void h(int i) {
        this.h = i;
        this.d = (byte) (this.d | 4);
    }

    public final void i(int i) {
        this.j = i;
        this.d = (byte) (this.d | 16);
    }

    public final void j(int i) {
        this.b = i;
        this.d = (byte) (this.d | 32);
    }

    public final void k(long[] jArr) {
        if (jArr == null) {
            throw new NullPointerException("Null serialized");
        }
        this.f = jArr;
    }

    public final void l(long[] jArr) {
        if (jArr == null) {
            throw new NullPointerException("Null active");
        }
        this.e = jArr;
    }
}
