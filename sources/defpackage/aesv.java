package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aesv {
    ANR("anr_detection.journal", "anr_journals"),
    JAVA_CRASH("javacrash_detection.journal", "javacrash_journals"),
    NATIVE_CRASH("nativecrash_detection.journal", "nativecrash_journals"),
    BACKGROUND_THREAD_UNCAUGHT_EXCEPTION("background_javacrash.journal", "background_javacrash_journals");

    public final String e;
    public final String f;

    aesv(String str, String str2) {
        this.e = str;
        this.f = str2;
    }
}
