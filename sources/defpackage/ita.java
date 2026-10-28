package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ita implements syk {
    private static final agrf a = agrf.h("com/google/android/apps/youtube/music/sideloaded/playlistwriter/SideloadedPlaylistExportRestoreTaskRunner");
    private final awmd b;

    public ita(awmd awmdVar) {
        this.b = awmdVar;
    }

    @Override // defpackage.syk
    public final int a(Bundle bundle) {
        File[] fileArrListFiles;
        ListenableFuture listenableFutureAs;
        try {
            itd itdVar = (itd) this.b.io();
            if (Build.VERSION.SDK_INT != 30) {
                listenableFutureAs = aher.a;
            } else {
                try {
                    if (itdVar.b.getPackageManager().getPackageInfo("com.google.android.mediaprovider", 1073741824).getLongVersionCode() >= 300900718) {
                        listenableFutureAs = aher.a;
                    } else {
                        Context context = itdVar.b;
                        if (avg.c(context, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                            itdVar.f.ai(11, 3);
                            listenableFutureAs = ahng.m(new Exception("Restore operation failed due to lack of WRITE_EXTERNAL_STORAGE permissions"));
                        } else {
                            File file = new File(context.getFilesDir(), "sideloadedplaylistexport");
                            if (file.exists() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length > 0) {
                                hfn hfnVar = itdVar.f;
                                hfnVar.ai(11, 2);
                                File file2 = new File(Environment.getExternalStorageDirectory(), "ytm_sideloadedplaylistexport");
                                if (file2.exists() || file2.mkdir()) {
                                    egz egzVar = new egz(itdVar, file, file2, 19);
                                    ahex ahexVar = itdVar.c;
                                    listenableFutureAs = ahno.as(ahno.ap(egzVar, ahexVar), new gqb(itdVar, file2, 14), ahexVar);
                                } else {
                                    hfnVar.aj(10, 3, 0);
                                    listenableFutureAs = ahng.m(new Exception(String.format("Cannot create destination directory: %s", file2.getAbsolutePath())));
                                }
                            } else {
                                agrx agrxVar = agso.a;
                                listenableFutureAs = aher.a;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    ((agrc) ((agrc) ((agrc) itd.a.c().i(agso.a, "PlaylistEx")).j(e)).k("com/google/android/apps/youtube/music/sideloaded/playlistwriter/SideloadedPlaylistExporter", "doesCurrentVersionOfMediaProviderHasSideloadedPlaylistsFix", (char) 358, "SideloadedPlaylistExporter.java")).w("Could not find package name %s", "com.google.android.mediaprovider");
                }
            }
            listenableFutureAs.get();
            return 0;
        } catch (InterruptedException e2) {
            ((agrc) ((agrc) ((agrc) a.c().i(agso.a, "PlaylistRestoreTasks")).j(e2)).k("com/google/android/apps/youtube/music/sideloaded/playlistwriter/SideloadedPlaylistExportRestoreTaskRunner", "runTask", '\'', "SideloadedPlaylistExportRestoreTaskRunner.java")).t("InterruptedException when running playlist export task");
            Thread.currentThread().interrupt();
            return 2;
        } catch (ExecutionException e3) {
            ((agrc) ((agrc) ((agrc) a.c().i(agso.a, "PlaylistRestoreTasks")).j(e3)).k("com/google/android/apps/youtube/music/sideloaded/playlistwriter/SideloadedPlaylistExportRestoreTaskRunner", "runTask", '*', "SideloadedPlaylistExportRestoreTaskRunner.java")).t("ExecutionException when running playlist export task");
            return 2;
        }
    }
}
