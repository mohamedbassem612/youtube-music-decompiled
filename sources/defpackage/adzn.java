package defpackage;

import android.graphics.Point;
import android.util.Size;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adzn {
    public final adzp a;
    public final Size b;
    public final Point c;

    public adzn(adzp adzpVar, Size size, Point point) {
        adzpVar.getClass();
        this.a = adzpVar;
        this.b = size;
        this.c = point;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof adzn) {
            adzn adznVar = (adzn) obj;
            if (this.a == adznVar.a && awrc.c(this.b, adznVar.b) && awrc.c(this.c, adznVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "PlacementResult(placement=" + this.a + ", size=" + this.b + ", location=" + this.c + ')';
    }
}
