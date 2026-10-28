package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
abstract class ctr implements DisplayManager.DisplayListener {
    public static final /* synthetic */ int e = 0;
    public final Choreographer a;
    final DisplayManager b;
    volatile long c = -9223372036854775807L;
    volatile long d = -9223372036854775807L;

    public ctr(Choreographer choreographer, DisplayManager displayManager) {
        this.a = choreographer;
        this.b = displayManager;
    }

    public void a() {
        this.b.registerDisplayListener(this, bwp.H(null));
    }

    public void b() {
        this.b.unregisterDisplayListener(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
