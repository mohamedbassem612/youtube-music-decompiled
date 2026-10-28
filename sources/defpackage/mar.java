package defpackage;

import android.content.res.Resources;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mar {
    public final int a;
    public final int b;
    private final float c;
    private final float d;

    public mar(float f, float f2) {
        this.c = f;
        this.d = f2;
        this.a = avkz.h(f * Resources.getSystem().getDisplayMetrics().density);
        this.b = avkz.h(f2 * Resources.getSystem().getDisplayMetrics().density);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mar) {
            mar marVar = (mar) obj;
            if (Float.compare(this.c, marVar.c) == 0 && Float.compare(this.d, marVar.d) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d);
    }

    public final String toString() {
        return "WidgetSize(widthDp=" + this.c + ", heightDp=" + this.d + ')';
    }
}
