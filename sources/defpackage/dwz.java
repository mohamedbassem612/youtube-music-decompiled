package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dwz {
    private final dwd a;
    private final float b;

    public dwz(Rect rect, float f) {
        this(new dwd(rect), f);
    }

    public final Rect a() {
        return this.a.c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (awrc.c(getClass(), obj != null ? obj.getClass() : null)) {
            obj.getClass();
            dwz dwzVar = (dwz) obj;
            if (awrc.c(this.a, dwzVar.a) && this.b == dwzVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "WindowMetrics(_bounds=" + this.a + ", density=" + this.b + ')';
    }

    public dwz(dwd dwdVar, float f) {
        this.a = dwdVar;
        this.b = f;
    }
}
