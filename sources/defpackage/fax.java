package defpackage;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fax {
    public static final boolean a;
    public static final boolean b;
    private static final File d;
    private static volatile fax e;
    private int f;
    private boolean g = true;
    public final AtomicBoolean c = new AtomicBoolean(false);

    static {
        a = Build.VERSION.SDK_INT < 29;
        b = Build.VERSION.SDK_INT >= 28;
        d = new File("/proc/self/fd");
    }

    public static fax a() {
        if (e == null) {
            synchronized (fax.class) {
                if (e == null) {
                    e = new fax();
                }
            }
        }
        return e;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    private final synchronized boolean c() {
        int i = this.f + 1;
        this.f = i;
        if (i >= 50) {
            this.f = 0;
            int length = d.list().length;
            int i2 = 20000;
            if (Build.VERSION.SDK_INT == 28) {
                Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
                while (it.hasNext()) {
                    if (Build.MODEL.startsWith((String) it.next())) {
                        i2 = 500;
                        break;
                    }
                }
            }
            long j = i2;
            int i3 = (length > j ? 1 : (length == j ? 0 : -1));
            this.g = i3 >>> 31;
            if (i3 >= 0 && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + j);
            }
        }
        return this.g;
    }

    public final boolean b(int i, int i2, boolean z, boolean z2) {
        if (z && b) {
            return (!a || this.c.get()) && !z2 && i >= 0 && i2 >= 0 && c();
        }
        return false;
    }
}
