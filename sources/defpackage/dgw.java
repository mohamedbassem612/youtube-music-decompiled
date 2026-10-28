package defpackage;

import android.media.MediaRouter2$RouteCallback;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dgw extends MediaRouter2$RouteCallback {
    final /* synthetic */ dgz a;

    public dgw(dgz dgzVar) {
        this.a = dgzVar;
    }

    public final void onRoutesAdded(List list) {
        this.a.f();
    }

    public final void onRoutesChanged(List list) {
        this.a.f();
    }

    public final void onRoutesRemoved(List list) {
        this.a.f();
    }
}
