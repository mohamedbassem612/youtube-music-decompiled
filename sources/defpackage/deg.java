package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class deg {
    public boolean a;
    public byte[] b;
    public int c;
    private final int d;
    private boolean e;

    public deg(int i) {
        this.d = i;
        byte[] bArr = new byte[131];
        this.b = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.e) {
            int i3 = i2 - i;
            byte[] bArrCopyOf = this.b;
            int length = bArrCopyOf.length;
            int i4 = this.c + i3;
            if (length < i4) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i4 << 1);
                this.b = bArrCopyOf;
            }
            System.arraycopy(bArr, i, bArrCopyOf, this.c, i3);
            this.c += i3;
        }
    }

    public final void b() {
        this.e = false;
        this.a = false;
    }

    public final void c(int i) {
        ahno.O(!this.e);
        boolean z = i == this.d;
        this.e = z;
        if (z) {
            this.c = 3;
            this.a = false;
        }
    }

    public final boolean d(int i) {
        if (!this.e) {
            return false;
        }
        this.c -= i;
        this.e = false;
        this.a = true;
        return true;
    }
}
