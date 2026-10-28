package defpackage;

import android.graphics.Path;
import android.os.Build;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nur {
    public static void a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        if (!yno.G(f7) || f7 <= 0.0f) {
            path.lineTo(f5, f6);
            return;
        }
        if (i <= 0 || Math.abs((-1.0f) + f7) < 1.0E-5f) {
            path.quadTo(f3, f4, f5, f6);
            return;
        }
        float f8 = f7 * f3;
        float f9 = f7 * f4;
        float f10 = 1.0f / (f7 + 1.0f);
        float f11 = (f + f8) * f10;
        float f12 = (f2 + f9) * f10;
        float f13 = (f8 + f5) * f10;
        float f14 = (f9 + f6) * f10;
        float f15 = (f11 + f13) * 0.5f;
        float f16 = 0.5f * (f12 + f14);
        float fSqrt = (float) Math.sqrt((((double) f7) + 1.0d) * 0.5d);
        int i2 = i - 1;
        a(path, f, f2, f11, f12, f15, f16, fSqrt, i2);
        a(path, f15, f16, f13, f14, f5, f6, fSqrt, i2);
    }

    public static boolean b(ByteBuffer byteBuffer, Path path) {
        ByteBuffer byteBuffer2;
        int i;
        float f;
        path.rewind();
        if (byteBuffer == null || byteBuffer.remaining() < 16) {
            return false;
        }
        ByteBuffer byteBufferOrder = byteBuffer.slice().order(ByteOrder.LITTLE_ENDIAN);
        int iRemaining = byteBufferOrder.remaining();
        char c = (char) byteBufferOrder.getShort(0);
        if (c <= 0 || c > 242) {
            return false;
        }
        char c2 = (char) byteBufferOrder.getShort(2);
        int i2 = byteBufferOrder.getInt(4);
        int i3 = byteBufferOrder.getInt(8);
        int i4 = byteBufferOrder.getInt(12);
        if (c2 <= 0 || i2 < 0 || i3 < 0 || i4 < c2 + 16) {
            return false;
        }
        ByteBuffer byteBuffer3 = byteBufferOrder;
        if (((long) i4) + (((((long) i2) << 1) + ((long) i3)) << 2) > iRemaining) {
            return false;
        }
        int i5 = (i2 << 3) + i4;
        int i6 = i2;
        int i7 = i3;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i8 = 0;
        while (i8 < c2) {
            ByteBuffer byteBuffer4 = byteBuffer3;
            byte b = byteBuffer4.get(i8 + 16);
            if (b != 0) {
                if (b == 1) {
                    byteBuffer2 = byteBuffer4;
                    if (i6 <= 0) {
                        path.rewind();
                        return false;
                    }
                    i = i4 + 8;
                    int i9 = i4 + 4;
                    float f6 = byteBuffer2.getFloat(i4);
                    f = byteBuffer2.getFloat(i9);
                    path.lineTo(f6, f);
                    i6--;
                    f2 = f6;
                } else if (b == 2) {
                    i8 = i8;
                    byteBuffer2 = byteBuffer4;
                    if (i6 < 2) {
                        path.rewind();
                        return false;
                    }
                    int i10 = i4 + 16;
                    int i11 = i4 + 12;
                    int i12 = i4 + 8;
                    int i13 = i4 + 4;
                    float f7 = byteBuffer2.getFloat(i4);
                    float f8 = byteBuffer2.getFloat(i13);
                    float f9 = byteBuffer2.getFloat(i12);
                    f = byteBuffer2.getFloat(i11);
                    path.quadTo(f7, f8, f9, f);
                    i6 -= 2;
                    i4 = i10;
                    f2 = f9;
                } else if (b == 3) {
                    i8 = i8;
                    if (i6 < 2 || i7 <= 0) {
                        path.rewind();
                        return false;
                    }
                    int i14 = i4 + 16;
                    int i15 = i4 + 12;
                    int i16 = i4 + 8;
                    int i17 = i4 + 4;
                    float f10 = byteBuffer4.getFloat(i4);
                    float f11 = byteBuffer4.getFloat(i17);
                    float f12 = byteBuffer4.getFloat(i16);
                    int i18 = i6 - 2;
                    float f13 = byteBuffer4.getFloat(i15);
                    float f14 = f12;
                    float f15 = byteBuffer4.getFloat(i5);
                    int i19 = i5 + 4;
                    i7--;
                    if (Build.VERSION.SDK_INT >= 34) {
                        path.conicTo(f10, f11, f14, f13, f15);
                        byteBuffer2 = byteBuffer4;
                    } else {
                        float f16 = f5;
                        byteBuffer2 = byteBuffer4;
                        a(path, f2, f16, f10, f11, f14, f13, f15, 2);
                        f14 = f14;
                        f13 = f13;
                    }
                    f2 = f14;
                    f = f13;
                    i4 = i14;
                    i6 = i18;
                    i5 = i19;
                } else if (b != 4) {
                    if (b != 5) {
                        path.rewind();
                        return false;
                    }
                    path.close();
                    i8 = i8;
                    byteBuffer2 = byteBuffer4;
                    f = f3;
                    f2 = f4;
                } else {
                    if (i6 < 3) {
                        path.rewind();
                        return false;
                    }
                    float f17 = byteBuffer4.getFloat(i4);
                    float f18 = byteBuffer4.getFloat(i4 + 4);
                    float f19 = byteBuffer4.getFloat(i4 + 8);
                    float f20 = byteBuffer4.getFloat(i4 + 12);
                    float f21 = byteBuffer4.getFloat(i4 + 16);
                    float f22 = byteBuffer4.getFloat(i4 + 20);
                    i8 = i8;
                    path.cubicTo(f17, f18, f19, f20, f21, f22);
                    i6 -= 3;
                    f = f22;
                    byteBuffer2 = byteBuffer4;
                    i4 += 24;
                    f2 = f21;
                }
                i8++;
                byteBuffer3 = byteBuffer2;
                f5 = f;
            } else {
                byteBuffer2 = byteBuffer4;
                if (i6 <= 0) {
                    path.rewind();
                    return false;
                }
                i = i4 + 8;
                int i20 = i4 + 4;
                float f23 = byteBuffer2.getFloat(i4);
                f = byteBuffer2.getFloat(i20);
                path.moveTo(f23, f);
                i6--;
                f3 = f;
                f2 = f23;
                f4 = f2;
            }
            i4 = i;
            i8++;
            byteBuffer3 = byteBuffer2;
            f5 = f;
        }
        return true;
    }
}
