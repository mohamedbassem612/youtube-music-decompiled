package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vbv {
    public final FrameLayout a;
    public final ViewGroup.LayoutParams b;
    public final int c;
    public final int d;

    public vbv(FrameLayout frameLayout, ViewGroup.LayoutParams layoutParams, int i, int i2) {
        this.a = frameLayout;
        this.b = layoutParams;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vbv) {
            vbv vbvVar = (vbv) obj;
            if (this.a.equals(vbvVar.a) && this.b.equals(vbvVar.b) && this.c == vbvVar.c && this.d == vbvVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        ViewGroup.LayoutParams layoutParams = this.b;
        return "BitmapLayoutData{frameLayout=" + this.a.toString() + ", originalLayoutParams=" + layoutParams.toString() + ", bitmapWidth=" + this.c + ", bitmapHeight=" + this.d + '}';
    }

    public vbv() {
        throw null;
    }
}
