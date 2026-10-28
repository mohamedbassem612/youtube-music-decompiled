package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mjg {
    public static final String a = "mjg";
    public static final AtomicInteger b = new AtomicInteger(1);

    private mjg() {
    }

    public static int a(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return 3;
        }
        if (i2 != 2) {
            return i2 == 4 ? 2 : 1;
        }
        return 4;
    }
}
