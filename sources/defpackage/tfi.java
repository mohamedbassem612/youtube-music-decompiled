package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tfi {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/common/network/Cellular5gDetector");
    public final Context b;
    public final tfg c;
    public volatile boolean e;
    private final tao f;
    private final Handler g;
    private int j;
    private final Runnable h = new syd(this, 4);
    private agev i = agdf.a;
    public final awkv d = new awku(Boolean.FALSE).aI();

    public tfi(Context context, tao taoVar, Handler handler) {
        this.b = context;
        this.f = taoVar;
        this.g = handler;
        this.c = awk.b() ? new tff(this) : Build.VERSION.SDK_INT >= 29 ? new tfd(this) : new tfb();
    }

    public final synchronized void a() {
        if (!this.e) {
            Handler handler = this.g;
            Runnable runnable = this.h;
            handler.removeCallbacks(runnable);
            this.c.a();
            this.e = handler.postDelayed(runnable, this.j);
        }
    }

    final boolean b() {
        return this.c.c();
    }

    public final boolean c() {
        if (!this.i.g()) {
            if (Build.VERSION.SDK_INT < 29) {
                this.i = new agfa(Boolean.FALSE);
            } else {
                tao taoVar = this.f;
                this.j = taoVar.d().l;
                this.i = new agfa(Boolean.valueOf(taoVar.d().k));
            }
        }
        return ((Boolean) this.i.c()).booleanValue();
    }
}
