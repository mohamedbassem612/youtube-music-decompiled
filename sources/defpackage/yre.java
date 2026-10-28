package defpackage;

import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Shader;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yre {
    public int a;
    public final Object b;
    public final Object c;

    public yre() {
        long[] jArr = new long[20];
        this.b = jArr;
        this.c = new float[20];
        this.a = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    public static String b(String str) {
        int iIndexOf = str.indexOf(35);
        return iIndexOf >= 0 ? str.substring(0, iIndexOf) : str;
    }

    public static final float d(float f) {
        double dSignum = Math.signum(f);
        float fAbs = Math.abs(f);
        return (float) (dSignum * Math.sqrt(fAbs + fAbs));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [axo, java.lang.Object] */
    public final void a(Exception exc) {
        this.c.accept(exc);
    }

    public final void c(long j, float f) {
        int i = (this.a + 1) % 20;
        this.a = i;
        ((long[]) this.b)[i] = j;
        ((float[]) this.c)[i] = f;
    }

    public final Object e(int i) {
        SparseArray sparseArray;
        if (this.a == -1) {
            this.a = 0;
        }
        while (true) {
            int i2 = this.a;
            if (i2 <= 0 || i >= ((SparseArray) this.b).keyAt(i2)) {
                break;
            }
            this.a--;
        }
        while (true) {
            int i3 = this.a;
            sparseArray = (SparseArray) this.b;
            if (i3 >= sparseArray.size() - 1 || i < sparseArray.keyAt(this.a + 1)) {
                break;
            }
            this.a++;
        }
        return sparseArray.valueAt(this.a);
    }

    public final Object f() {
        SparseArray sparseArray = (SparseArray) this.b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public final boolean g() {
        return ((SparseArray) this.b).size() == 0;
    }

    public final boolean h() {
        return this.c != null;
    }

    public final boolean i() {
        Object obj;
        return this.c == null && (obj = this.b) != null && ((ColorStateList) obj).isStateful();
    }

    public final boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = (ColorStateList) this.b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.a) {
                this.a = colorForState;
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        return h() || this.a != 0;
    }

    public yre(zjd zjdVar, axo axoVar) {
        this.b = zjdVar;
        this.c = axoVar;
    }

    public yre(bvh bvhVar) {
        this.b = new SparseArray();
        this.c = bvhVar;
        this.a = -1;
    }

    public yre(Shader shader, ColorStateList colorStateList, int i) {
        this.c = shader;
        this.b = colorStateList;
        this.a = i;
    }

    public yre(PackageManager packageManager) {
        this.b = new HashMap();
        this.a = 0;
        this.c = packageManager;
    }
}
