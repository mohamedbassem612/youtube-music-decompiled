package defpackage;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bxt {
    private final Cipher a;
    private final int b;
    private final byte[] c;
    private final byte[] d;
    private int e;

    public bxt(int i, byte[] bArr, long j, long j2) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            this.a = cipher;
            int blockSize = cipher.getBlockSize();
            this.b = blockSize;
            this.c = new byte[blockSize];
            this.d = new byte[blockSize];
            long j3 = blockSize;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            String algorithm = cipher.getAlgorithm();
            int i3 = bwp.a;
            cipher.init(i, new SecretKeySpec(bArr, algorithm.split("/", 2)[0]), new IvParameterSpec(ByteBuffer.allocate(16).putLong(j).putLong(j4).array()));
            if (i2 != 0) {
                byte[] bArr2 = new byte[i2];
                a(bArr2, 0, i2, bArr2, 0);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new RuntimeException(e);
        }
    }

    private final int b(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        try {
            return this.a.update(bArr, i, i2, bArr2, i3);
        } catch (ShortBufferException e) {
            throw new RuntimeException(e);
        }
    }

    public final void a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        do {
            int i4 = this.e;
            if (i4 <= 0) {
                int iB = b(bArr, i, i2, bArr2, i3);
                if (i2 != iB) {
                    int i5 = this.b;
                    int i6 = i2 - iB;
                    int i7 = 0;
                    ahno.O(i6 < i5);
                    int i8 = i3 + iB;
                    int i9 = i5 - i6;
                    this.e = i9;
                    byte[] bArr3 = this.c;
                    byte[] bArr4 = this.d;
                    ahno.O(b(bArr3, 0, i9, bArr4, 0) == i5);
                    while (i7 < i6) {
                        bArr2[i8] = bArr4[i7];
                        i7++;
                        i8++;
                    }
                    return;
                }
                return;
            }
            bArr2[i3] = (byte) (bArr[i] ^ this.d[this.b - i4]);
            i3++;
            i++;
            this.e = i4 - 1;
            i2--;
        } while (i2 != 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public bxt(int i, byte[] bArr, String str, long j) {
        long j2 = 0;
        if (str != null) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                long jCharAt = j2 ^ ((long) str.charAt(i2));
                j2 = jCharAt + (jCharAt << 1) + (jCharAt << 4) + (jCharAt << 5) + (jCharAt << 7) + (jCharAt << 8) + (jCharAt << 40);
            }
        }
        this(i, bArr, j2, j);
    }
}
