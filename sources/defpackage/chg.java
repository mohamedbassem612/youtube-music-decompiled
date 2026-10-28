package defpackage;

import android.os.Build;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class chg {
    public static final agkz a;

    static {
        a = Build.VERSION.SDK_INT < 32 ? agkz.s(12, 252, 6396, 4) : agkz.u(12, 252, 6396, 4, 3145980, 82172, 737532, 9126140, 33904892, 202070268, 744444, 67108860, 743676, 3152124, 88316, 81980, 205215996, 3890172);
    }

    public static int a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            if (a.contains(num)) {
                return iIntValue;
            }
        }
        return 0;
    }
}
