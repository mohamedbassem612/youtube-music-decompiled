package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class itd {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/sideloaded/playlistwriter/SideloadedPlaylistExporter");
    public final Context b;
    public final ahex c;
    public final isz d;
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final hfn f;
    private final iup g;

    public itd(Context context, ahex ahexVar, isz iszVar, iup iupVar, hfn hfnVar) {
        this.b = context;
        this.c = ahexVar;
        this.d = iszVar;
        this.g = iupVar;
        this.f = hfnVar;
    }

    public final ListenableFuture a() {
        if (Build.VERSION.SDK_INT != 29) {
            return ahng.n(Boolean.FALSE);
        }
        if (avg.c(this.b, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
            return ahng.n(Boolean.FALSE);
        }
        this.f.ah(2);
        ListenableFuture listenableFutureU = this.g.u();
        int i = 4;
        isv isvVar = new isv(this, i);
        ahex ahexVar = this.c;
        ListenableFuture listenableFutureAs = ahno.as(listenableFutureU, isvVar, ahexVar);
        taf.i(listenableFutureAs, ahexVar, new ijj(this, i), new hvn(this, 16), null);
        return listenableFutureAs;
    }

    public final File b() {
        return new File(this.b.getFilesDir(), "sideloadedplaylistexport");
    }
}
