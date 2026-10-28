package defpackage;

import android.view.Choreographer;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aoj implements Choreographer.FrameCallback, Runnable {
    final /* synthetic */ aok a;

    public aoj(aok aokVar) {
        this.a = aokVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        aok aokVar = this.a;
        aokVar.c.removeCallbacks(this);
        aokVar.b();
        synchronized (aokVar.d) {
            if (aokVar.g) {
                aokVar.g = false;
                List list = aokVar.e;
                aokVar.e = aokVar.f;
                aokVar.f = list;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) list.get(i)).doFrame(j);
                }
                list.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        aok aokVar = this.a;
        aokVar.b();
        synchronized (aokVar.d) {
            if (aokVar.e.isEmpty()) {
                aokVar.b.removeFrameCallback(this);
                aokVar.g = false;
            }
        }
    }
}
