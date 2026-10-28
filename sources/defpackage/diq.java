package defpackage;

import android.media.MediaRouter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class diq extends MediaRouter.VolumeCallback {
    protected final dip a;

    public diq(dip dipVar) {
        this.a = dipVar;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.l(routeInfo, i);
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.m(routeInfo, i);
    }
}
