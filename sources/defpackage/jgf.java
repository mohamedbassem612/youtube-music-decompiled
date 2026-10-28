package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jgf {
    private final int a;
    private final int b;

    public jgf(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static jgf a(int i) {
        return new jgf(i, Math.round(i / 1.7777778f));
    }

    public final void b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.b;
            layoutParams.width = this.a;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jgf) {
            jgf jgfVar = (jgf) obj;
            if (this.a == jgfVar.a && this.b == jgfVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "PresenterSizeConstraint{width=" + this.a + ", height=" + this.b + '}';
    }

    public jgf() {
        throw null;
    }
}
