package defpackage;

import android.text.Layout;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dbu {
    public static final Comparator a = new awv(14);
    public final bus b;
    public final int c;

    public dbu(CharSequence charSequence, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
        bur burVar = new bur();
        burVar.d(charSequence);
        burVar.b = alignment;
        burVar.c(f, 0);
        burVar.d = i;
        burVar.e = f2;
        burVar.f = i2;
        burVar.g = -3.4028235E38f;
        if (z) {
            burVar.f(i3);
        }
        this.b = burVar.a();
        this.c = i4;
    }
}
