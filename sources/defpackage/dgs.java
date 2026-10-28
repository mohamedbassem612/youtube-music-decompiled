package defpackage;

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dgs extends MediaRouter2$ControllerCallback {
    final /* synthetic */ dgz a;

    public dgs(dgz dgzVar) {
        this.a = dgzVar;
    }

    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.a.g(routingController);
    }
}
