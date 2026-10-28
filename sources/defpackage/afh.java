package defpackage;

import androidx.car.app.utils.RemoteUtils$SurfaceCallbackStub;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class afh implements bnu {
    final /* synthetic */ RemoteUtils$SurfaceCallbackStub a;

    public afh(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub) {
        this.a = remoteUtils$SurfaceCallbackStub;
    }

    @Override // defpackage.bnu
    public final void onDestroy(bog bogVar) {
        this.a.mSurfaceCallback = null;
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
