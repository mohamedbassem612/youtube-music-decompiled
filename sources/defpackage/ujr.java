package defpackage;

import android.graphics.PointF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ujr {
    public final float a;
    public final float b;

    public ujr(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static ujr a(PointF pointF, PointF pointF2) {
        return new ujr(pointF2.x - pointF.x, pointF2.y - pointF.y);
    }

    public final float b() {
        return this.a;
    }

    public final float c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ujr) {
            ujr ujrVar = (ujr) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(ujrVar.a)) {
                if (Float.floatToIntBits(this.b) == Float.floatToIntBits(ujrVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "VectorF{dx=" + this.a + ", dy=" + this.b + '}';
    }

    public ujr() {
        throw null;
    }
}
