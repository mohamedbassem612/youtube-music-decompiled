package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vni {
    public final agev a;
    public final Rect b;
    public final int c;
    public final tuy d;
    public final boolean e;
    public final int f;

    public vni(agev agevVar, Rect rect, int i, tuy tuyVar, boolean z, int i2) {
        if (agevVar == null) {
            throw new NullPointerException("Null rootEngagementPanel");
        }
        this.a = agevVar;
        if (rect == null) {
            throw new NullPointerException("Null epContainerViewRect");
        }
        this.b = rect;
        this.c = i;
        if (tuyVar == null) {
            throw new NullPointerException("Null windowInsets");
        }
        this.d = tuyVar;
        this.e = z;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vni) {
            vni vniVar = (vni) obj;
            if (this.a.equals(vniVar.a) && this.b.equals(vniVar.b) && this.c == vniVar.c && this.d.equals(vniVar.d) && this.e == vniVar.e && this.f == vniVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f;
    }

    public final String toString() {
        tuy tuyVar = this.d;
        Rect rect = this.b;
        return "EngagementPanelLayoutUpdaterSubscriptions{rootEngagementPanel=" + this.a.toString() + ", epContainerViewRect=" + rect.toString() + ", defaultAlignment=" + this.c + ", windowInsets=" + tuyVar.toString() + ", isTablet=" + this.e + ", bottomBarHeight=" + this.f + '}';
    }

    public vni() {
        throw null;
    }
}
