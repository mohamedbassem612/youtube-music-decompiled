package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adgo {
    public final View a;
    public final boolean b;
    public final float c;
    public final float d;
    public final float e;

    public adgo(View view, boolean z, float f, float f2, float f3) {
        this.a = view;
        this.b = z;
        this.c = f;
        this.d = f2;
        this.e = f3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adgo) {
            adgo adgoVar = (adgo) obj;
            if (this.a.equals(adgoVar.a) && this.b == adgoVar.b) {
                if (Float.floatToIntBits(this.c) == Float.floatToIntBits(adgoVar.c)) {
                    if (Float.floatToIntBits(this.d) == Float.floatToIntBits(adgoVar.d)) {
                        if (Float.floatToIntBits(this.e) == Float.floatToIntBits(adgoVar.e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.c)) * (-721379959)) ^ Float.floatToIntBits(this.d)) * 1000003) ^ Float.floatToIntBits(this.e);
    }

    public final String toString() {
        return "SwipeableContainerEventData{view=" + String.valueOf(this.a) + ", isRtl=" + this.b + ", swipeDistanceX=" + this.c + ", swipeDistanceY=0.0, width=" + this.d + ", height=" + this.e + '}';
    }

    public adgo() {
        throw null;
    }
}
