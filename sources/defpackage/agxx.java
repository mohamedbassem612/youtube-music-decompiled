package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agxx extends agxa {
    private int a;
    private long b;
    private int c;
    private int d = 0;
    private boolean e = false;

    public agxx(int i) {
        this.a = i;
    }

    public final void b(int i, long j) {
        long j2 = this.b;
        int i2 = this.c;
        long j3 = j2 | ((j & 4294967295L) << i2);
        this.b = j3;
        int i3 = i2 + (i << 3);
        this.c = i3;
        this.d += i;
        if (i3 >= 32) {
            int i4 = this.a;
            int i5 = (int) j3;
            agxj agxjVar = agxy.a;
            this.a = (Integer.rotateLeft(i4 ^ (Integer.rotateLeft(i5 * (-862048943), 15) * 461845907), 13) * 5) - 430675100;
            this.b >>>= 32;
            this.c -= 32;
        }
    }

    @Override // defpackage.agxa
    public final void c(char c) {
        b(2, c);
    }

    public final void d(byte b) {
        b(1, b & 255);
    }

    @Override // defpackage.agxa, defpackage.agxk
    public final void f(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder = byteBuffer.order();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        while (byteBuffer.remaining() >= 4) {
            k(byteBuffer.getInt());
        }
        while (byteBuffer.hasRemaining()) {
            d(byteBuffer.get());
        }
        byteBuffer.order(byteOrderOrder);
    }

    @Override // defpackage.agxa, defpackage.agxk
    public final void g(byte[] bArr, int i) {
        int i2 = 0;
        ahno.N(0, i, bArr.length);
        while (true) {
            int i3 = i2 + 4;
            if (i3 > i) {
                break;
            }
            b(4, agxy.g(bArr, i2));
            i2 = i3;
        }
        while (i2 < i) {
            d(bArr[i2]);
            i2++;
        }
    }

    @Override // defpackage.agxa, defpackage.agxk
    public final agxk i(CharSequence charSequence, Charset charset) {
        if (!charset.equals(StandardCharsets.UTF_8)) {
            return super.i(charSequence, charset);
        }
        int length = charSequence.length();
        int i = 0;
        while (true) {
            int i2 = i + 4;
            if (i2 > length) {
                break;
            }
            char cCharAt = charSequence.charAt(i);
            char cCharAt2 = charSequence.charAt(i + 1);
            char cCharAt3 = charSequence.charAt(i + 2);
            char cCharAt4 = charSequence.charAt(i + 3);
            if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                break;
            }
            b(4, cCharAt | (cCharAt2 << '\b') | (cCharAt3 << 16) | (cCharAt4 << 24));
            i = i2;
        }
        while (i < length) {
            char cCharAt5 = charSequence.charAt(i);
            if (cCharAt5 < 128) {
                b(1, cCharAt5);
            } else if (cCharAt5 < 2048) {
                b(2, agxy.i(cCharAt5));
            } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                b(3, agxy.h(cCharAt5));
            } else {
                int iCodePointAt = Character.codePointAt(charSequence, i);
                if (iCodePointAt == cCharAt5) {
                    h(charSequence.subSequence(i, length).toString().getBytes(charset));
                    return this;
                }
                b(4, agxy.j(iCodePointAt));
                i++;
            }
            i++;
        }
        return this;
    }

    @Override // defpackage.agxa, defpackage.agxk
    public final void k(int i) {
        b(4, i);
    }

    @Override // defpackage.agxk
    public final agxi o() {
        if (this.e) {
            throw new IllegalStateException();
        }
        this.e = true;
        int i = this.a;
        int i2 = (int) this.b;
        agxj agxjVar = agxy.a;
        int iRotateLeft = i ^ (Integer.rotateLeft(i2 * (-862048943), 15) * 461845907);
        this.a = iRotateLeft;
        return agxy.k(iRotateLeft, this.d);
    }
}
