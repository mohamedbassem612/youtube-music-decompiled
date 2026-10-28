package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class foo {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public foo(byte[] bArr) {
        this.c = 0;
    }

    static final int e(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i == i2 ? 2 : 4;
    }

    public final void a(int i) {
        this.c |= i;
    }

    public final void b() {
        this.c = 0;
    }

    public final void c(int i, int i2, int i3, int i4) {
        this.e = i;
        this.b = i2;
        this.d = i3;
        this.a = i4;
    }

    public final boolean d() {
        int i = this.c;
        if ((i & 7) != 0 && (e(this.d, this.e) & i) == 0) {
            return false;
        }
        if ((i & 112) != 0 && ((e(this.d, this.b) << 4) & i) == 0) {
            return false;
        }
        if ((i & 1792) == 0 || ((e(this.a, this.e) << 8) & i) != 0) {
            return (i & 28672) == 0 || (i & (e(this.a, this.b) << 12)) != 0;
        }
        return false;
    }

    public foo() {
    }
}
