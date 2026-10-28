package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xif {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/logging/internal/debug/ErrorLogger");
    private final String b;

    public xif(String str) {
        this.b = str;
    }

    public final void a(String str) {
        ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/logging/internal/debug/ErrorLogger", "throwIfDevOrLogError", 34, "ErrorLogger.java")).B("%s: %s", this.b, str);
    }

    public final void b() {
        ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/logging/internal/debug/ErrorLogger", "logError", 39, "ErrorLogger.java")).B("%s: %s", this.b, "Action nonce is empty!");
    }
}
