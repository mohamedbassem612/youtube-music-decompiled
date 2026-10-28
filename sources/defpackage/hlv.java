package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hlv {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/offline/OfflineInnerTubeResponseStore");
    public final zwb b;
    public final mbc c;
    public final Executor d;
    hlu e;
    hlu f;
    public final wjr g;
    private final File h;

    public hlv(Context context, zwb zwbVar, mbc mbcVar, Executor executor, wjr wjrVar) {
        context.getClass();
        zwbVar.getClass();
        this.b = zwbVar;
        mbcVar.getClass();
        this.c = mbcVar;
        executor.getClass();
        this.d = executor;
        this.h = new File(context.getFilesDir(), "offline");
        this.g = wjrVar;
    }

    public final synchronized hlu a() {
        if (this.f == null) {
            this.f = new hlt(this, d(".guide"));
        }
        return this.f;
    }

    public final synchronized hlu b() {
        if (this.e == null) {
            this.e = new hls(this, d(".settings"));
        }
        return this.e;
    }

    public final wqe c() {
        return (wqe) a().c();
    }

    final hfn d(String str) {
        return new hfn(new File(this.h, str));
    }
}
