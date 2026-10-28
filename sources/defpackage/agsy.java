package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agsy {
    public static final Locale a = Locale.ROOT;

    public static String a(Object obj, RuntimeException runtimeException) {
        String simpleName;
        try {
            simpleName = runtimeException.toString();
        } catch (RuntimeException e) {
            simpleName = e.getClass().getSimpleName();
        }
        return e(obj, simpleName);
    }

    public static String b(Object obj) {
        try {
            return c(obj);
        } catch (RuntimeException e) {
            return a(obj, e);
        }
    }

    public static String c(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (!obj.getClass().isArray()) {
            String string = obj.toString();
            return string != null ? string : e(obj, "toString() returned null");
        }
        if (obj instanceof int[]) {
            return Arrays.toString((int[]) obj);
        }
        if (obj instanceof long[]) {
            return Arrays.toString((long[]) obj);
        }
        if (obj instanceof byte[]) {
            return Arrays.toString((byte[]) obj);
        }
        if (obj instanceof char[]) {
            return Arrays.toString((char[]) obj);
        }
        if (obj instanceof short[]) {
            return Arrays.toString((short[]) obj);
        }
        if (obj instanceof float[]) {
            return Arrays.toString((float[]) obj);
        }
        if (obj instanceof double[]) {
            return Arrays.toString((double[]) obj);
        }
        return obj instanceof boolean[] ? Arrays.toString((boolean[]) obj) : Arrays.toString((Object[]) obj);
    }

    public static void d(StringBuilder sb, long j, boolean z) {
        if (j == 0) {
            sb.append('0');
            return;
        }
        String str = true != z ? "0123456789abcdef" : "0123456789ABCDEF";
        for (int iNumberOfLeadingZeros = (63 - Long.numberOfLeadingZeros(j)) & (-4); iNumberOfLeadingZeros >= 0; iNumberOfLeadingZeros -= 4) {
            sb.append(str.charAt((int) ((j >>> iNumberOfLeadingZeros) & 15)));
        }
    }

    private static String e(Object obj, String str) {
        return "{" + obj.getClass().getName() + '@' + System.identityHashCode(obj) + ": " + str + '}';
    }
}
