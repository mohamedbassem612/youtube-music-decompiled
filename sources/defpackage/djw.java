package defpackage;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class djw {
    private static final Comparator e = new aqv(3);
    final int[] a;
    final int[] b;
    public final List c;
    final vz[] d;
    private final float[] f = new float[3];

    public djw(int[] iArr, int i, vz[] vzVarArr) {
        djv djvVar;
        int iMin;
        this.d = vzVarArr;
        int[] iArr2 = new int[32768];
        this.b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            int iC = (c(Color.red(i3), 8, 5) << 10) | (c(Color.green(i3), 8, 5) << 5) | c(Color.blue(i3), 8, 5);
            iArr[i2] = iC;
            iArr2[iC] = iArr2[iC] + 1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0) {
                int iA = a((i5 >> 10) & 31, (i5 >> 5) & 31, i5 & 31);
                float[] fArr = this.f;
                int i6 = avv.a;
                avv.g(Color.red(iA), Color.green(iA), Color.blue(iA), fArr);
                if (d(this.f)) {
                    iArr2[i5] = 0;
                }
            }
            if (iArr2[i5] > 0) {
                i4++;
            }
        }
        int[] iArr3 = new int[i4];
        this.a = iArr3;
        int i7 = 0;
        for (int i8 = 0; i8 < 32768; i8++) {
            if (iArr2[i8] > 0) {
                iArr3[i7] = i8;
                i7++;
            }
        }
        if (i4 <= 1) {
            this.c = new ArrayList();
            for (int i9 = 0; i9 < i4; i9++) {
                int i10 = iArr3[i9];
                this.c.add(new djx(a((i10 >> 10) & 31, (i10 >> 5) & 31, i10 & 31), iArr2[i10]));
            }
            return;
        }
        PriorityQueue<djv> priorityQueue = new PriorityQueue(1, e);
        priorityQueue.offer(new djv(this, 0, this.a.length - 1));
        while (priorityQueue.size() <= 0 && (djvVar = (djv) priorityQueue.poll()) != null && djvVar.c()) {
            if (!djvVar.c()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int i11 = djvVar.e - djvVar.d;
            int i12 = djvVar.g - djvVar.f;
            int i13 = djvVar.i - djvVar.h;
            int i14 = (i11 < i12 || i11 < i13) ? (i12 < i11 || i12 < i13) ? -1 : -2 : -3;
            djw djwVar = djvVar.j;
            int[] iArr4 = djwVar.a;
            int[] iArr5 = djwVar.b;
            b(iArr4, i14, djvVar.a, djvVar.b);
            Arrays.sort(iArr4, djvVar.a, djvVar.b + 1);
            b(iArr4, i14, djvVar.a, djvVar.b);
            int i15 = djvVar.c / 2;
            int i16 = djvVar.a;
            int i17 = 0;
            while (true) {
                int i18 = djvVar.b;
                if (i16 > i18) {
                    iMin = djvVar.a;
                    break;
                }
                i17 += iArr5[iArr4[i16]];
                if (i17 >= i15) {
                    iMin = Math.min(i18 - 1, i16);
                    break;
                }
                i16++;
            }
            djv djvVar2 = new djv(djvVar.j, iMin + 1, djvVar.b);
            djvVar.b = iMin;
            djvVar.b();
            priorityQueue.offer(djvVar2);
            priorityQueue.offer(djvVar);
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        for (djv djvVar3 : priorityQueue) {
            djw djwVar2 = djvVar3.j;
            int[] iArr6 = djwVar2.a;
            int[] iArr7 = djwVar2.b;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            for (int i23 = djvVar3.a; i23 <= djvVar3.b; i23++) {
                int i24 = iArr6[i23];
                int i25 = iArr7[i24];
                i20 += i25;
                i19 += ((i24 >> 10) & 31) * i25;
                i21 += ((i24 >> 5) & 31) * i25;
                i22 += i25 * (i24 & 31);
            }
            float f = i20;
            djx djxVar = new djx(a(Math.round(i19 / f), Math.round(i21 / f), Math.round(i22 / f)), i20);
            if (!d(djxVar.a())) {
                arrayList.add(djxVar);
            }
        }
        this.c = arrayList;
    }

    static int a(int i, int i2, int i3) {
        return Color.rgb(c(i, 5, 8), c(i2, 5, 8), c(i3, 5, 8));
    }

    static void b(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5) | (i4 & 31);
                i2++;
            }
            return;
        }
        if (i == -1) {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5) | ((i5 >> 10) & 31);
                i2++;
            }
        }
    }

    private static int c(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    private final boolean d(float[] fArr) {
        vz[] vzVarArr = this.d;
        if (vzVarArr == null || (vzVarArr.length) <= 0) {
            return false;
        }
        for (vz vzVar : vzVarArr) {
            float f = fArr[2];
            if (f < 0.95f && f > 0.05f) {
                float f2 = fArr[0];
                if (f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f) {
                }
            }
            return true;
        }
        return false;
    }
}
