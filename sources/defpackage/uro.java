package defpackage;

import android.graphics.PointF;
import android.util.Size;
import android.view.View;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uro {
    public final int a;
    public final PointF b;
    public final Optional c;
    public final int d;
    public final boolean e;
    public final Size f;

    public uro(int i, PointF pointF, Optional optional, int i2, boolean z, Size size) {
        this.a = i;
        this.b = pointF;
        this.c = optional;
        this.d = i2;
        this.e = z;
        this.f = size;
    }

    public static PointF a(PointF pointF, View view) {
        return new PointF(Math.max(0.0f, Math.min(view.getWidth(), pointF.x)), Math.max(0.0f, Math.min(view.getHeight(), pointF.y)));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uro) {
            uro uroVar = (uro) obj;
            if (this.a == uroVar.a && this.b.equals(uroVar.b) && this.c.equals(uroVar.c) && this.d == uroVar.d && this.e == uroVar.e && this.f.equals(uroVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        Size size = this.f;
        Optional optional = this.c;
        return "MotionEventSnapshot{numPointers=" + this.a + ", pointPrimary=" + this.b.toString() + ", pointSecondary=" + optional.toString() + ", action=" + this.d + ", hitTrashCan=" + this.e + ", playerDimensions=" + size.toString() + '}';
    }

    public uro() {
        throw null;
    }
}
