package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class djk {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public djk(int i, float f, float f2, float f3, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            djk djkVar = (djk) obj;
            if (this.c == djkVar.c && this.d == djkVar.d && this.b == djkVar.b && this.a == djkVar.a && this.e == djkVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.b)) * 31) + this.a) * 31) + a.ak(this.e);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ')';
    }

    public djk() {
        this(2, 0.0f, 0.0f, 0.0f, 0L);
    }
}
