package defpackage;

import android.graphics.Rect;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ofl {
    final double a;
    final double b;
    final Rect c;
    final Rect d;
    final Rect e;
    final Rect f;

    public ofl(double d, double d2, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
        this.a = d;
        this.b = d2;
        this.c = rect;
        this.d = rect2;
        this.e = rect3;
        this.f = rect4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ofl)) {
            return false;
        }
        ofl oflVar = (ofl) obj;
        return this.a == oflVar.a && this.b == oflVar.b && Objects.equals(this.c, oflVar.c) && Objects.equals(this.d, oflVar.d) && Objects.equals(this.e, oflVar.e) && Objects.equals(this.f, oflVar.f);
    }

    public final int hashCode() {
        return Objects.hash(Double.valueOf(this.a), Double.valueOf(this.b), this.c, this.d, this.e, this.f);
    }
}
