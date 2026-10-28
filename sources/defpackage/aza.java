package defpackage;

import android.graphics.Point;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aza {
    public final int a;
    private final int b;
    private final Point c;

    public aza(int i, int i2, int i3, int i4) {
        this.b = i;
        this.a = i2;
        this.c = new Point(i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aza) {
            aza azaVar = (aza) obj;
            if (this.b == azaVar.b && this.a == azaVar.a && this.c.equals(azaVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b * 31) + this.a) * 31) + this.c.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.b;
        if (i == 0) {
            str = "TopLeft";
        } else if (i != 1) {
            str = i != 2 ? "BottomLeft" : "BottomRight";
        } else {
            str = "TopRight";
        }
        sb.append(str);
        sb.append(", radius=");
        sb.append(this.a);
        sb.append(", center=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
