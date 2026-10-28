package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dwd {
    public final int a;
    public final int b;
    private final int c;
    private final int d;

    static {
        new dwd(0, 0, 0, 0);
    }

    public dwd(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i > i3) {
            throw new IllegalArgumentException(a.bQ(i3, i, "Left must be less than or equal to right, left: ", ", right: "));
        }
        if (i2 > i4) {
            throw new IllegalArgumentException(a.bQ(i4, i2, "top must be less than or equal to bottom, top: ", ", bottom: "));
        }
    }

    public final int a() {
        return this.d - this.b;
    }

    public final int b() {
        return this.c - this.a;
    }

    public final Rect c() {
        return new Rect(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (awrc.c(getClass(), obj != null ? obj.getClass() : null)) {
            obj.getClass();
            dwd dwdVar = (dwd) obj;
            if (this.a == dwdVar.a && this.b == dwdVar.b && this.c == dwdVar.c && this.d == dwdVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "dwd { [" + this.a + ',' + this.b + ',' + this.c + ',' + this.d + "] }";
    }

    public dwd(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
    }
}
