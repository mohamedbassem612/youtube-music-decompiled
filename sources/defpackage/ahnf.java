package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahnf {
    private final byte[] a;

    private ahnf(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static ahnf b(byte[] bArr) {
        if (bArr != null) {
            return new ahnf(bArr, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final int a() {
        return this.a.length;
    }

    public final byte[] c() {
        byte[] bArr = this.a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ahnf) {
            return Arrays.equals(((ahnf) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        byte[] bArr = this.a;
        StringBuilder sb = new StringBuilder(bArr.length << 1);
        for (byte b : bArr) {
            sb.append("0123456789abcdef".charAt((b & 255) >> 4));
            sb.append("0123456789abcdef".charAt(b & 15));
        }
        return a.bU((byte) 41, sb.toString(), "Bytes(");
    }
}
