package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jxd {
    public int a = 0;
    public int b = 0;
    public final int[] c;
    public final byte[] d;

    public jxd(int[] iArr, byte[] bArr) {
        this.c = iArr;
        this.d = bArr;
    }

    public final void a(int i) {
        if (i < this.a) {
            this.a = 0;
            this.b = 0;
        }
        while (true) {
            int i2 = this.a;
            if (i2 >= i) {
                return;
            }
            this.b += this.c[i2];
            this.a = i2 + 1;
        }
    }
}
