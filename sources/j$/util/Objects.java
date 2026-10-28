package j$.util;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class Objects {
    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int checkIndex(int i, int i2) {
        String str;
        if (i >= 0 && i < i2) {
            return i;
        }
        java.util.List listC = j$.desugar.sun.nio.fs.g.C(new Integer[]{Integer.valueOf(i), Integer.valueOf(i2)});
        if (listC != null) {
            switch (listC.size() != 2 ? "" : "checkIndex") {
                case "checkIndex":
                    str = String.format("Index %d out of bounds for length %d", listC.get(0), listC.get(1));
                    break;
                case "checkFromToIndex":
                    str = String.format("Range [%d, %d) out of bounds for length %d", listC.get(0), listC.get(1), listC.get(2));
                    break;
                case "checkFromIndexSize":
                    str = String.format("Range [%d, %<d + %d) out of bounds for length %d", listC.get(0), listC.get(1), listC.get(2));
                    break;
                default:
                    str = String.format("Range check failed: %s %s", "checkIndex", listC);
                    break;
            }
        } else {
            str = "Range check failed: checkIndex";
        }
        throw new IndexOutOfBoundsException(str);
    }

    public static boolean equals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int hash(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static int hashCode(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static boolean isNull(Object obj) {
        return obj == null;
    }

    public static boolean nonNull(Object obj) {
        return obj != null;
    }

    public static <T> T requireNonNullElse(T t, T t2) {
        if (t != null) {
            return t;
        }
        a(t2, "defaultObj");
        return t2;
    }

    public static String toString(Object obj) {
        return String.valueOf(obj);
    }
}
