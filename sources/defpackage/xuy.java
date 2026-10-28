package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.youtube.mdx.mediaroute.service.RemotePlaybackControlsService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xuy {
    public boolean a;
    public boolean b;
    private final Context c;
    private final awmd d;
    private boolean g;
    private boolean h;
    private final ServiceConnection i = new xuw();
    private final xzg j = new xux(this);
    private final xzf k = new xtm(this, 2);
    private final Handler e = new Handler(Looper.getMainLooper());
    private final Runnable f = new syd(this, 20);

    public xuy(Context context, awmd awmdVar) {
        this.c = context;
        this.d = awmdVar;
    }

    public final void a() {
        if (this.h) {
            return;
        }
        ycp ycpVar = (ycp) this.d.io();
        ycpVar.b(this.j);
        ycpVar.a(this.k);
        this.h = true;
    }

    public final void b(long j) {
        Handler handler = this.e;
        Runnable runnable = this.f;
        handler.removeCallbacks(runnable);
        Context context = this.c;
        Intent intent = new Intent(context, (Class<?>) RemotePlaybackControlsService.class);
        if (!this.a && !this.b) {
            if (this.g) {
                if (j > 0) {
                    handler.postDelayed(runnable, j);
                    return;
                } else {
                    c();
                    return;
                }
            }
            return;
        }
        if (this.g) {
            return;
        }
        ServiceConnection serviceConnection = this.i;
        agrx agrxVar = agso.a;
        boolean zBindService = context.bindService(intent, serviceConnection, 1);
        this.g = zBindService;
        if (zBindService) {
            return;
        }
        ((agrc) ((agrc) RemotePlaybackControlsService.a.b().i(agrxVar, "MDX.RemoteStarter")).k("com/google/android/libraries/youtube/mdx/mediaroute/service/RemotePlaybackControlsService$Starter", "startOrStopRemoteServiceWithDelay", 148, "RemotePlaybackControlsService.java")).t("failed binding to remote playback control service");
    }

    public final void c() {
        agrx agrxVar = agso.a;
        this.c.unbindService(this.i);
        this.g = false;
    }
}
