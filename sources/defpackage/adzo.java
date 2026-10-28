package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adzo {
    public final Rect a;
    public final Rect b;

    public adzo(Rect rect, Rect rect2) {
        this.a = rect;
        this.b = rect2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof adzo) {
            adzo adzoVar = (adzo) obj;
            if (awrc.c(this.a, adzoVar.a) && awrc.c(this.b, adzoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "LayoutConstraints(safeArea=" + this.a + ", anchorBounds=" + this.b + ')';
    }
}
