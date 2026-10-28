package defpackage;

import android.graphics.Rect;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dcx {
    public boolean d;
    public boolean e;
    public int[] f;
    public int g;
    public int h;
    public Rect i;
    public long b = -9223372036854775807L;
    public long c = -9223372036854775807L;
    public final int[] a = new int[4];
    public int j = -1;
    public int k = -1;

    public static int a(int[] iArr, int i) {
        if (i >= iArr.length) {
            i = 0;
        }
        return iArr[i];
    }

    public final void b(dqp dqpVar, boolean z, Rect rect, int[] iArr) {
        int i;
        int i2;
        int i3 = !z ? 1 : 0;
        int iWidth = rect.width();
        int i4 = i3 * iWidth;
        int iHeight = rect.height();
        while (true) {
            int i5 = 0;
            do {
                int i6 = 1;
                int i7 = 0;
                while (true) {
                    if (i7 >= i6 || i6 > 64) {
                        i = i7 & 3;
                        if (i7 >= 4) {
                            i2 = i7 >> 2;
                            break;
                        } else {
                            i2 = iWidth;
                            break;
                        }
                    }
                    if (dqpVar.f() < 4) {
                        i = -1;
                        i2 = 0;
                        break;
                    } else {
                        i7 = (i7 << 4) | dqpVar.i(4);
                        i6 <<= 2;
                    }
                }
                int iMin = Math.min(i2, iWidth - i5);
                if (iMin > 0) {
                    int i8 = i4 + iMin;
                    Arrays.fill(iArr, i4, i8, this.a[i]);
                    i5 += iMin;
                    i4 = i8;
                }
            } while (i5 < iWidth);
            i3 += 2;
            if (i3 >= iHeight) {
                return;
            }
            i4 = i3 * iWidth;
            dqpVar.m();
        }
    }
}
