package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ttj {
    public final Rect a;
    public final agke b;

    public ttj(Rect rect, agke agkeVar) {
        this.a = rect;
        if (agkeVar == null) {
            throw new NullPointerException("Null boundingRects");
        }
        this.b = agkeVar;
    }

    public final int a() {
        return this.a.left;
    }

    public final int b() {
        return this.a.top;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ttj) {
            ttj ttjVar = (ttj) obj;
            if (this.a.equals(ttjVar.a) && aguu.v(this.b, ttjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        agke agkeVar = this.b;
        return "DisplayCutoutCompat{safeInsets=" + this.a.toString() + ", boundingRects=" + agkeVar.toString() + '}';
    }

    public ttj() {
        throw null;
    }
}
