package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fmz implements fmy {
    private static fmy c = new fmz();
    public final Handler a;
    public Choreographer b;

    public fmz() {
        if (kro.bk()) {
            this.b = Choreographer.getInstance();
            this.a = null;
        } else {
            Handler handler = new Handler(Looper.getMainLooper());
            this.a = handler;
            handler.post(new dxk(this, 6, null));
        }
    }

    public static fmy b() {
        if (c == null) {
            c = new fmz();
        }
        return c;
    }

    @Override // defpackage.fmy
    public final void a(fmx fmxVar) {
        AtomicReference atomicReference = fmxVar.a;
        fmb fmbVar = fhz.h;
        atomicReference.set(null);
        if (this.b == null) {
            this.a.postDelayed(fmxVar.b(), 0L);
        } else {
            this.b.postFrameCallback(fmxVar.a());
        }
    }
}
