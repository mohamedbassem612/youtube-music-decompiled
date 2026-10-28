package defpackage;

import android.hardware.display.VirtualDisplay;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class xq implements bnu {
    final /* synthetic */ xv a;
    final /* synthetic */ xr b;

    public xq(xr xrVar, xv xvVar) {
        this.b = xrVar;
        this.a = xvVar;
    }

    @Override // defpackage.bnu
    public final void onDestroy(bog bogVar) {
        this.a.b();
        xr xrVar = this.b;
        VirtualDisplay virtualDisplay = xrVar.c;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            xrVar.c = null;
        }
        bogVar.getLifecycle().c(this);
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onPause(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onResume(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStart(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStop(bog bogVar) {
    }
}
