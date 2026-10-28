package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vuj {
    public final int a;
    public final Rect b;

    public vuj(int i, Rect rect) {
        this.a = i;
        if (rect == null) {
            throw new NullPointerException("Null expandedRect");
        }
        this.b = rect;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vuj) {
            vuj vujVar = (vuj) obj;
            if (this.a == vujVar.a && this.b.equals(vujVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "CumulativeHorizontalDeltaContext{resizeDelta=" + this.a + ", expandedRect=" + this.b.toString() + '}';
    }

    public vuj() {
        throw null;
    }
}
