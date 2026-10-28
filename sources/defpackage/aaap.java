package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaap {
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/notification/logging/NotificationsErrorLogger");
    final zvl a;

    public aaap(zvl zvlVar) {
        this.a = zvlVar;
    }

    public final void a(String str) {
        agrc agrcVar = (agrc) ((agrc) b.b()).k("com/google/android/libraries/youtube/notification/logging/NotificationsErrorLogger", "logInvalidChimePayload", 33, "NotificationsErrorLogger.java");
        String strConcat = "YTN: ".concat(str);
        agrcVar.w("%s", strConcat);
        zvj zvjVarA = zvk.a();
        zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
        zvjVarA.j = 28;
        zvjVarA.i = 195;
        zvjVarA.d(strConcat);
        this.a.a(zvjVarA.a());
    }

    public final void b(String str, Throwable th) {
        zvj zvjVarA = zvk.a();
        zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
        zvjVarA.j = 28;
        zvjVarA.i = 200;
        String strConcat = "YTN: ".concat(str);
        zvjVarA.d(strConcat);
        if (th != null) {
            zvjVarA.f(th);
        }
        this.a.a(zvjVarA.a());
        ((agrc) ((agrc) ((agrc) b.b()).j(th)).k("com/google/android/libraries/youtube/notification/logging/NotificationsErrorLogger", "logLoadImageError", 'F', "NotificationsErrorLogger.java")).w("%s", strConcat);
    }
}
