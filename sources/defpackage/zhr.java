package defpackage;

import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zhr {
    public static final Map a = new EnumMap(zhq.class);

    static {
        for (zhq zhqVar : zhq.values()) {
            a.put(zhqVar, agsn.i(zhqVar.r));
        }
    }

    public static void a(zhq zhqVar, Object obj) {
        b(zhqVar, "%s", obj);
    }

    public static void b(zhq zhqVar, String str, Object... objArr) {
        ((agsj) ((agsj) ((agsn) a.get(zhqVar)).b()).k("com/google/android/libraries/youtube/media/utils/MediaLog", "e", 171, "MediaLog.java")).I(str, objArr);
    }

    public static void c(zhq zhqVar, Throwable th, String str, Object... objArr) {
        ((agsj) ((agsj) ((agsj) ((agsn) a.get(zhqVar)).b()).j(th)).k("com/google/android/libraries/youtube/media/utils/MediaLog", "e", 164, "MediaLog.java")).I(str, objArr);
    }

    public static void d(zhq zhqVar, Object obj) {
        e(zhqVar, "%s", obj);
    }

    public static void e(zhq zhqVar, String str, Object... objArr) {
        ((agsj) ((agsj) ((agsn) a.get(zhqVar)).c()).k("com/google/android/libraries/youtube/media/utils/MediaLog", "w", 139, "MediaLog.java")).I(str, objArr);
    }
}
