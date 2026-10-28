package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rbf {
    public static final rbf a = new rbf();
    private static final agrf e = agrf.h("com/google/android/libraries/video/mediaengine/logging/MediaEngineLoggerManager");
    public rbe b;
    public audb c;
    public audc d;

    private rbf() {
        Optional.empty();
    }

    public final boolean a() {
        if (this.b != null) {
            return false;
        }
        ((agrc) ((agrc) e.c()).k("com/google/android/libraries/video/mediaengine/logging/MediaEngineLoggerManager", "hasNullLogger", 228, "MediaEngineLoggerManager.java")).t("No MediaEngineLogger instance was set.");
        return true;
    }
}
