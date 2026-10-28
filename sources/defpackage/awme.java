package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class awme implements Serializable {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;

    public awme(float[] fArr) {
        this.a = fArr[0];
        this.b = fArr[1];
        this.c = fArr[2];
        this.d = fArr[3];
        this.e = fArr[4];
        this.f = fArr[5];
        this.g = fArr[6];
        this.h = fArr[7];
        this.i = fArr[8];
    }

    public final boolean a(awme awmeVar) {
        return awmeVar != null && this.a == awmeVar.a && this.b == awmeVar.b && this.c == awmeVar.c && this.d == awmeVar.d && this.e == awmeVar.e && this.f == awmeVar.f && this.g == awmeVar.g && this.h == awmeVar.h && this.i == awmeVar.i;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof awme) && a((awme) obj);
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.a) ^ Float.floatToIntBits(this.b)) ^ Float.floatToIntBits(this.c)) ^ Float.floatToIntBits(this.d)) ^ Float.floatToIntBits(this.e)) ^ Float.floatToIntBits(this.f)) ^ Float.floatToIntBits(this.g)) ^ Float.floatToIntBits(this.h)) ^ Float.floatToIntBits(this.i);
    }

    public final String toString() {
        String property = System.getProperty("line.separator", "\n");
        return "[" + property + "  [" + this.a + '\t' + this.b + '\t' + this.c + ']' + property + "  [" + this.d + '\t' + this.e + '\t' + this.f + ']' + property + "  [" + this.g + '\t' + this.h + '\t' + this.i + "] ]";
    }

    public awme() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0.0f;
    }
}
