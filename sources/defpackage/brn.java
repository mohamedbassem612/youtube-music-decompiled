package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class brn {
    public final long a;
    public final int b;

    @Deprecated
    public final Uri[] c;
    public final bss[] d;
    public final int[] e;
    public final long[] f;
    public final String[] g;
    public final bro[] h;
    public final long i;
    public final boolean j;

    static {
        int i = bwp.a;
    }

    public brn(int i, int[] iArr, bss[] bssVarArr, long[] jArr, String[] strArr, bro[] broVarArr) {
        Uri uri;
        int length = iArr.length;
        int length2 = bssVarArr.length;
        if (length != length2) {
            throw new IllegalArgumentException();
        }
        if (length != broVarArr.length) {
            throw new IllegalArgumentException();
        }
        this.a = 0L;
        this.b = i;
        this.e = iArr;
        this.d = bssVarArr;
        this.f = jArr;
        this.i = 0L;
        int i2 = 0;
        this.j = false;
        this.c = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.c;
            if (i2 >= uriArr.length) {
                this.g = strArr;
                this.h = broVarArr;
                return;
            }
            bss bssVar = bssVarArr[i2];
            if (bssVar == null) {
                uri = null;
            } else {
                bsp bspVar = bssVar.c;
                bspVar.getClass();
                uri = bspVar.a;
            }
            uriArr[i2] = uri;
            i2++;
        }
    }

    public final int a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.e;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            brn brnVar = (brn) obj;
            if (this.b == brnVar.b && Arrays.equals(this.d, brnVar.d) && Arrays.equals(this.e, brnVar.e) && Arrays.equals(this.f, brnVar.f) && Arrays.equals(this.g, brnVar.g) && Arrays.equals(this.h, brnVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.b * 31) - 1) * 31) + a.ak(0L)) * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e)) * 31) + Arrays.hashCode(this.f)) * 31) + a.ak(0L)) * 961) + Arrays.hashCode(this.g)) * 31) + Arrays.hashCode(this.h)) * 31;
    }
}
