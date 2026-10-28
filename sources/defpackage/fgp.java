package defpackage;

import android.graphics.PathEffect;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fgp implements fil {
    public final float[] a = new float[4];
    public final int[] b = new int[4];
    public final int[] c = new int[4];
    public PathEffect d;

    public static int b(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 1) {
                return 1;
            }
            if (i2 == 2) {
                return 2;
            }
            if (i2 == 3) {
                return 3;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new IllegalArgumentException("Given unsupported edge ".concat(kro.be(i)));
                }
                return 2;
            }
        }
        return 0;
    }

    public static void c(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        if (i3 == 6) {
            iArr[0] = i2;
            iArr[2] = i2;
        } else if (i3 == 7) {
            iArr[1] = i2;
            iArr[3] = i2;
        } else {
            if (i3 != 8) {
                iArr[b(i)] = i2;
                return;
            }
            for (int i4 = 0; i4 < 4; i4++) {
                iArr[i4] = i2;
            }
        }
    }

    @Override // defpackage.fil
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        fgp fgpVar = (fgp) obj;
        if (this != fgpVar) {
            return fgpVar != null && Arrays.equals(this.a, fgpVar.a) && Arrays.equals(this.b, fgpVar.b) && Arrays.equals(this.c, fgpVar.c);
        }
        return true;
    }
}
