package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hxa {
    private static final agrf f = agrf.h("com/google/android/apps/youtube/music/player/UpdateVideoMetadataControllerImpl");
    public final Executor a;
    public final aunn b;
    public final vxe c;
    public final aunn d;
    public final axfd e;

    public hxa(axfd axfdVar, Executor executor, aunn aunnVar, vxe vxeVar, aunn aunnVar2) {
        axfdVar.getClass();
        executor.getClass();
        aunnVar.getClass();
        vxeVar.getClass();
        aunnVar2.getClass();
        this.e = axfdVar;
        this.a = executor;
        this.b = aunnVar;
        this.c = vxeVar;
        this.d = aunnVar2;
    }

    public static final void a(Throwable th) {
        ((agrc) ((agrc) f.b()).j(th).k("com/google/android/apps/youtube/music/player/UpdateVideoMetadataControllerImpl", "updateVideoMetadata$<anonymous>", 41, "UpdateVideoMetadataControllerImpl.kt")).t("Failed to fetch WatchNextResponse");
    }
}
