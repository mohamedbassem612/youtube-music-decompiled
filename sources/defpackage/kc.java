package defpackage;

import android.view.View;
import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kc {
    public int a;
    public int b;
    public Object c;
    public int d;

    public kc(int i, int i2, int i3, Object obj) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = obj;
    }

    static /* synthetic */ View a(np npVar, nd ndVar) {
        int childCount = npVar.getChildCount();
        View view = null;
        if (childCount != 0) {
            int iJ = ndVar.j() + (ndVar.k() / 2);
            int i = Alert.DURATION_SHOW_INDEFINITELY;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = npVar.getChildAt(i2);
                int iAbs = Math.abs((ndVar.d(childAt) + (ndVar.b(childAt) / 2)) - iJ);
                if (iAbs < i) {
                    view = childAt;
                    i = iAbs;
                }
            }
        }
        return view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kc) {
            kc kcVar = (kc) obj;
            int i = this.a;
            if (i == kcVar.a) {
                if (i == 8 && Math.abs(this.d - this.b) == 1 && this.d == kcVar.b && this.b == kcVar.d) {
                    return true;
                }
                if (this.d == kcVar.d && this.b == kcVar.b) {
                    Object obj2 = this.c;
                    if (obj2 != null) {
                        if (obj2.equals(kcVar.c)) {
                            return true;
                        }
                    } else if (kcVar.c == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append('[');
        int i = this.a;
        if (i == 1) {
            str = "add";
        } else if (i == 2) {
            str = "rm";
        } else if (i != 4) {
            str = i != 8 ? "??" : "mv";
        } else {
            str = "up";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        sb.append(this.c);
        sb.append(']');
        return sb.toString();
    }
}
