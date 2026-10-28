package defpackage;

import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class onb {
    public static final /* synthetic */ int a = 0;
    private static final Random b = new Random();

    public static boolean a(long j) {
        return b.nextLong() % j == 0;
    }

    public static void b(String str) {
        agrf agrfVar = ona.a;
        ((agrc) ((agrc) agrfVar.b()).k("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "e", 116, "LogUtil.java")).w("%s", str);
        ((agrc) agrfVar.b()).L();
    }

    public static void c(String str, Object obj) {
        agrf agrfVar = ona.a;
        ((agrc) ((agrc) agrfVar.b()).k("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "e", 123, "LogUtil.java")).w(str, obj);
        ((agrc) agrfVar.b()).L();
    }

    public static void d(String str, Object obj, Object obj2) {
        agrf agrfVar = ona.a;
        ((agrc) ((agrc) agrfVar.b()).k("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "e", 130, "LogUtil.java")).B(str, obj, obj2);
        ((agrc) agrfVar.b()).L();
    }

    public static void e(String str, Object... objArr) {
        agrf agrfVar = ona.a;
        ((agrc) ((agrc) agrfVar.b()).k("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "e", 137, "LogUtil.java")).I(str, objArr);
        ((agrc) agrfVar.b()).L();
    }

    public static void f(Throwable th, String str) {
        agrf agrfVar = ona.a;
        ((agrc) ((agrc) ((agrc) agrfVar.b()).j(th)).k("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "e", (char) 144, "LogUtil.java")).w("%s", str);
        ((agrc) agrfVar.b()).L();
    }

    public static void g(Throwable th, String str, Object... objArr) {
        agrf agrfVar = ona.a;
        ((agrc) ((agrc) ((agrc) agrfVar.b()).j(th)).k("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "e", 151, "LogUtil.java")).I(str, objArr);
        ((agrc) agrfVar.b()).L();
    }

    public static void h(String str, Object obj) {
        agrf agrfVar = ona.a;
        ((agrc) ((agrc) agrfVar.c()).k("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "w", 164, "LogUtil.java")).w(str, obj);
        ((agrc) agrfVar.c()).L();
    }

    public static void i(String str, Object obj, Object obj2) {
        agrf agrfVar = ona.a;
        ((agrc) ((agrc) agrfVar.c()).k("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "w", 171, "LogUtil.java")).B(str, obj, obj2);
        ((agrc) agrfVar.c()).L();
    }

    public static void j(Throwable th, String str, Object... objArr) {
        agrf agrfVar = ona.a;
        ((agrc) ((agrc) ((agrc) agrfVar.c()).j(th)).k("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "w", 186, "LogUtil.java")).I(str, objArr);
        ((agrc) agrfVar.c()).L();
    }
}
