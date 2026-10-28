package defpackage;

import android.media.MediaRouter2$RouteCallback;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dgx extends MediaRouter2$RouteCallback {
    final /* synthetic */ dgz a;

    public dgx(dgz dgzVar) {
        this.a = dgzVar;
    }

    public final void onRoutesUpdated(List list) {
        this.a.f();
    }
}
