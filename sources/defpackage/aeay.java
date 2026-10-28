package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aeay {
    public final int a;
    public final int b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;

    public aeay(int i, float f, float f2, float f3, float f4, float f5, float f6, int i2) {
        this.a = i;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
        this.b = i2;
        new Rect((int) f3, (int) f5, (int) f4, (int) f6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aeay) {
            aeay aeayVar = (aeay) obj;
            if (this.a == aeayVar.a && Float.compare(this.c, aeayVar.c) == 0 && Float.compare(this.d, aeayVar.d) == 0 && Float.compare(this.e, aeayVar.e) == 0 && Float.compare(this.f, aeayVar.f) == 0 && Float.compare(this.g, aeayVar.g) == 0 && Float.compare(this.h, aeayVar.h) == 0 && this.b == aeayVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((this.a * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(this.h)) * 31) + this.b;
    }

    public final String toString() {
        return "SectionLayoutDescriptor(columnCount=" + this.a + ", rowGapDp=" + this.c + ", columnGapDp=" + this.d + ", startMarginDp=" + this.e + ", endMarginDp=" + this.f + ", topMarginDp=" + this.g + ", bottomMarginDp=" + this.h + ", sectionId=" + this.b + ')';
    }

    public aeay() {
        this(1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0);
    }
}
