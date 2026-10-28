package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vvl {
    public final boolean a;
    public final boolean b;
    public final agev c;
    public final Rect d;

    public vvl(boolean z, boolean z2, agev agevVar, Rect rect) {
        this.a = z;
        this.b = z2;
        if (agevVar == null) {
            throw new NullPointerException("Null rootEngagementPanel");
        }
        this.c = agevVar;
        if (rect == null) {
            throw new NullPointerException("Null epContainerViewRect");
        }
        this.d = rect;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vvl) {
            vvl vvlVar = (vvl) obj;
            if (this.a == vvlVar.a && this.b == vvlVar.b && this.c.equals(vvlVar.c) && this.d.equals(vvlVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Rect rect = this.d;
        return "RoundedCornerContext{isBeingResized=" + this.a + ", isResizableHorizontally=" + this.b + ", rootEngagementPanel=" + this.c.toString() + ", epContainerViewRect=" + rect.toString() + '}';
    }

    public vvl() {
        throw null;
    }
}
