package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class yv {
    public Object a;
    public Object b;

    public final void a() {
        Object obj = this.b;
        if (obj != null) {
            Arrays.fill((int[]) obj, -1);
        }
        this.a = null;
    }

    public final void b(int i) {
        Object obj = this.b;
        if (obj == null) {
            int[] iArr = new int[Math.max(i, 10) + 1];
            this.b = iArr;
            Arrays.fill(iArr, -1);
            return;
        }
        int[] iArr2 = (int[]) obj;
        int length = iArr2.length;
        if (i >= length) {
            while (length <= i) {
                length <<= 1;
            }
            int[] iArr3 = new int[length];
            this.b = iArr3;
            int length2 = iArr2.length;
            System.arraycopy(obj, 0, iArr3, 0, length2);
            int[] iArr4 = (int[]) this.b;
            Arrays.fill(iArr4, length2, iArr4.length, -1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    public final void c(int i, int i2) {
        Object obj = this.b;
        if (obj == null || i >= ((int[]) obj).length) {
            return;
        }
        int i3 = i + i2;
        b(i3);
        Object obj2 = this.b;
        System.arraycopy(obj2, i, obj2, i3, (((int[]) obj2).length - i) - i2);
        Arrays.fill((int[]) this.b, i, i3, -1);
        ?? r0 = this.a;
        if (r0 != 0) {
            for (int size = r0.size() - 1; size >= 0; size--) {
                ot otVar = (ot) this.a.get(size);
                int i4 = otVar.a;
                if (i4 >= i) {
                    otVar.a = i4 + i2;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.List] */
    public final void d(int i, int i2) {
        Object obj = this.b;
        if (obj == null || i >= ((int[]) obj).length) {
            return;
        }
        int i3 = i + i2;
        b(i3);
        Object obj2 = this.b;
        System.arraycopy(obj2, i3, obj2, i, (((int[]) obj2).length - i) - i2);
        int[] iArr = (int[]) this.b;
        int length = iArr.length;
        Arrays.fill(iArr, length - i2, length, -1);
        ?? r1 = this.a;
        if (r1 != 0) {
            for (int size = r1.size() - 1; size >= 0; size--) {
                ot otVar = (ot) this.a.get(size);
                int i4 = otVar.a;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.a.remove(size);
                    } else {
                        otVar.a = i4 - i2;
                    }
                }
            }
        }
    }
}
