package defpackage;

import j$.util.Comparator$CC;
import j$.util.Comparator$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atyy {
    public static final /* synthetic */ int a = 0;

    static {
        Comparator$EL.thenComparingInt(Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new ddc(17)), new ddc(18)), new ddc(19));
    }

    public static boolean a(int i, int i2) {
        return i > 0 && i <= i2;
    }

    public static boolean b(int i, int i2, boolean z) {
        int i3;
        boolean z2 = false;
        if (i2 > 0 && i2 <= 12) {
            z2 = true;
        }
        ahno.I(z2, "invalid month %s", i2);
        if (i2 == 2) {
            i3 = z ? 29 : 28;
        } else {
            i3 = ((5546 >> i2) & 1) + 30;
        }
        return a(i, i3);
    }
}
