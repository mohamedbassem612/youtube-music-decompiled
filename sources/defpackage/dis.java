package defpackage;

import android.media.MediaRouter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dis extends dhn {
    private final MediaRouter.RouteInfo a;

    public dis(MediaRouter.RouteInfo routeInfo) {
        this.a = routeInfo;
    }

    @Override // defpackage.dhn
    public final void d(int i) {
        this.a.requestSetVolume(i);
    }

    @Override // defpackage.dhn
    public final void f(int i) {
        this.a.requestUpdateVolume(i);
    }
}
