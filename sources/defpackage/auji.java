package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.vr.cardboard.ExternalSurfaceManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auji implements aujf {
    private final Runnable a;
    private final long b;
    private final Handler c = new Handler(Looper.getMainLooper());

    public auji(final long j, long j2) {
        this.a = new Runnable() { // from class: aujh
            @Override // java.lang.Runnable
            public final void run() {
                ExternalSurfaceManager.nativeCallback(j);
            }
        };
        this.b = j2;
    }

    @Override // defpackage.aujf
    public final void a() {
        this.c.removeCallbacks(this.a);
    }

    @Override // defpackage.aujf
    public final void b() {
        ExternalSurfaceManager.nativeCallback(this.b);
    }

    @Override // defpackage.aujf
    public final void c() {
        this.c.post(this.a);
    }
}
