package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uvv {
    public final long a;
    public final Rect b;
    public final String c;
    public final boolean d;

    public uvv(long j, Rect rect, String str, boolean z) {
        this.a = j;
        this.b = rect;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uvv) {
            uvv uvvVar = (uvv) obj;
            if (this.a == uvvVar.a && this.b.equals(uvvVar.b) && this.c.equals(uvvVar.c) && this.d == uvvVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        return "AccessibilityOverlay{id=" + this.a + ", bounds=" + this.b.toString() + ", description=" + this.c + ", isClickable=" + this.d + '}';
    }

    public uvv() {
        throw null;
    }
}
