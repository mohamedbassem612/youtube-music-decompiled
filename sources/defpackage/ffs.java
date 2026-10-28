package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ffs {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final char[] b = new char[64];
    private static volatile Handler c;

    private ffs() {
    }

    public static int a(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + String.valueOf(bitmap) + '[' + bitmap.getWidth() + 'x' + bitmap.getHeight() + "] " + String.valueOf(bitmap.getConfig()));
    }

    public static int b(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = ffr.a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        return i == 4 ? 8 : 4;
    }

    public static int c(Object obj, int i) {
        return (i * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public static Handler d() {
        if (c == null) {
            synchronized (ffs.class) {
                if (c == null) {
                    c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return c;
    }

    public static List e(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static void f() {
        if (a.x()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    public static void g() {
        if (!a.x()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean h(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    public static boolean i(int i, int i2) {
        return h(i) && h(i2);
    }
}
