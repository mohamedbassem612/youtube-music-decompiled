package defpackage;

import android.graphics.Insets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class avw {
    public static final avw a = new avw(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public avw(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static avw b(avw avwVar, avw avwVar2) {
        return d(Math.max(avwVar.b, avwVar2.b), Math.max(avwVar.c, avwVar2.c), Math.max(avwVar.d, avwVar2.d), Math.max(avwVar.e, avwVar2.e));
    }

    public static avw c(avw avwVar, avw avwVar2) {
        int i = avwVar.e;
        int i2 = avwVar2.e;
        int i3 = avwVar.d;
        int i4 = avwVar2.d;
        return d(Math.min(avwVar.b, avwVar2.b), Math.min(avwVar.c, avwVar2.c), Math.min(i3, i4), Math.min(i, i2));
    }

    public static avw d(int i, int i2, int i3, int i4) {
        if (i == 0) {
            i = 0;
            if (i2 == 0) {
                if (i3 != 0) {
                    i2 = 0;
                } else {
                    if (i4 == 0) {
                        return a;
                    }
                    i2 = 0;
                    i3 = 0;
                }
            }
        }
        return new avw(i, i2, i3, i4);
    }

    public static avw e(Insets insets) {
        return d(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets a() {
        return Insets.of(this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            avw avwVar = (avw) obj;
            if (this.e == avwVar.e && this.b == avwVar.b && this.d == avwVar.d && this.c == avwVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "Insets{left=" + this.b + ", top=" + this.c + ", right=" + this.d + ", bottom=" + this.e + '}';
    }
}
