package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class accf {
    public static final accf a = new accf(34, 50, 95, true, false, null);
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final acby g;

    public accf(int i, int i2, int i3, boolean z, boolean z2, acby acbyVar) {
        ahno.I(i2 >= 0 && i2 <= 100, "invalid anchorHorizontalPos: %s", i2);
        ahno.I(i3 >= 0 && i3 <= 100, "invalid anchorVerticalPos: %s", i3);
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = z2;
        this.g = acbyVar;
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "ap=%d, ah=%d, av=%d, vs=%b, sd=%b", Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f));
    }
}
