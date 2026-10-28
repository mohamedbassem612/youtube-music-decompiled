package defpackage;

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cbi extends MediaRouter2$ControllerCallback {
    final /* synthetic */ cbj a;

    public cbi(cbj cbjVar) {
        this.a = cbjVar;
    }

    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        cbj cbjVar = this.a;
        cbjVar.e.d(Boolean.valueOf(cbj.c(cbjVar.b)));
    }
}
