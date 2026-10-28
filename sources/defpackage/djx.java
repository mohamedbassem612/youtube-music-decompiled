package defpackage;

import android.graphics.Color;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class djx {
    public final int a;
    public final int b;
    private final int c;
    private final int d;
    private final int e;
    private boolean f;
    private int g;
    private int h;
    private float[] i;

    public djx(int i, int i2) {
        this.c = Color.red(i);
        this.d = Color.green(i);
        this.e = Color.blue(i);
        this.a = i;
        this.b = i2;
    }

    private final void b() {
        if (this.f) {
            return;
        }
        int i = this.a;
        int iD = avv.d(-1, i, 4.5f);
        int iD2 = avv.d(-1, i, 3.0f);
        if (iD != -1 && iD2 != -1) {
            this.h = avv.f(-1, iD);
            this.g = avv.f(-1, iD2);
            this.f = true;
            return;
        }
        int iD3 = avv.d(-16777216, i, 4.5f);
        int iD4 = avv.d(-16777216, i, 3.0f);
        if (iD3 == -1 || iD4 == -1) {
            this.h = iD != -1 ? avv.f(-1, iD) : avv.f(-16777216, iD3);
            this.g = iD2 != -1 ? avv.f(-1, iD2) : avv.f(-16777216, iD4);
            this.f = true;
        } else {
            this.h = avv.f(-16777216, iD3);
            this.g = avv.f(-16777216, iD4);
            this.f = true;
        }
    }

    public final float[] a() {
        float[] fArr = this.i;
        if (fArr == null) {
            fArr = new float[3];
            this.i = fArr;
        }
        avv.g(this.c, this.d, this.e, fArr);
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            djx djxVar = (djx) obj;
            if (this.b == djxVar.b && this.a == djxVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.a));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(a()));
        sb.append("] [Population: ");
        sb.append(this.b);
        sb.append("] [Title Text: #");
        b();
        sb.append(Integer.toHexString(this.g));
        sb.append("] [Body Text: #");
        b();
        sb.append(Integer.toHexString(this.h));
        sb.append(']');
        return sb.toString();
    }
}
