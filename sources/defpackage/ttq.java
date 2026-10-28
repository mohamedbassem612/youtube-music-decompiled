package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ttq {
    public final Rect a;
    public final ttj b;
    private final Rect c;
    private final Rect d;
    private final boolean e;

    public ttq(Rect rect, ttj ttjVar, Rect rect2, Rect rect3, boolean z) {
        this.a = rect;
        this.b = ttjVar;
        if (rect2 == null) {
            throw new NullPointerException("Null mandatorySystemGestureInsets");
        }
        this.c = rect2;
        if (rect3 == null) {
            throw new NullPointerException("Null stableInsets");
        }
        this.d = rect3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ttq) {
            ttq ttqVar = (ttq) obj;
            if (this.a.equals(ttqVar.a) && this.b.equals(ttqVar.b) && this.c.equals(ttqVar.c) && this.d.equals(ttqVar.d) && this.e == ttqVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        Rect rect = this.d;
        Rect rect2 = this.c;
        ttj ttjVar = this.b;
        return "Insets{systemWindowInsets=" + this.a.toString() + ", displayCutout=" + ttjVar.toString() + ", mandatorySystemGestureInsets=" + rect2.toString() + ", stableInsets=" + rect.toString() + ", isKeyboardVisible=" + this.e + '}';
    }

    public ttq() {
        throw null;
    }
}
