package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oga {
    public int a;
    public int b;
    public boolean c;
    private int d;

    public oga() {
        this.a = 0;
        this.b = 0;
        this.d = 0;
    }

    private final void e(int i, boolean z) {
        int i2;
        int i3 = this.b;
        int i4 = 1 << i;
        if ((i3 & i4) != 0) {
            if (!z) {
                i2 = this.a & (~i4);
                this.a = i2;
            }
        } else if (z) {
            i2 = this.a | i4;
            this.a = i2;
        }
        this.b = i3 | i4;
    }

    final void a(int i, boolean z) {
        int i2 = this.d;
        int i3 = (i2 + i) / 1000;
        if (i3 < 32) {
            e(i3, z);
            for (int i4 = i2 / 1000; i4 < i3; i4++) {
                e(i4, this.c);
            }
            this.d += i;
            this.c = z;
        }
    }

    public final synchronized int b() {
        return this.d;
    }

    public final synchronized void c() {
        this.d--;
    }

    public final synchronized void d() {
        this.d++;
    }

    public oga(byte[] bArr) {
        this.b = 1;
    }
}
