package defpackage;

import android.graphics.PathEffect;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fnu {
    public float a;
    public float b;
    public float c;
    public float d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PathEffect i;
    public float[] j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fnu fnuVar = (fnu) obj;
            if (fnuVar.a == this.a && fnuVar.b == this.b && fnuVar.c == this.c && fnuVar.d == this.d && this.e == fnuVar.e && this.f == fnuVar.f && this.g == fnuVar.g && this.h == fnuVar.h && Arrays.equals(this.j, fnuVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (int) this.a;
        int i2 = (int) this.b;
        return (((((((((((((((i * 31) + i2) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 961) + Arrays.hashCode(this.j);
    }
}
