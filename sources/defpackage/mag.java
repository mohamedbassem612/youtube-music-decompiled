package defpackage;

import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mag implements lov {
    private final /* synthetic */ int $cid;

    public /* synthetic */ mag(int i) {
        this.$cid = i;
    }

    @Override // defpackage.lov
    public final void d(Exception exc) {
        int i = this.$cid;
        if (i == 0) {
            ConcurrentHashMap concurrentHashMap = maj.a;
            Log.e("AppWidgetLogger", "Failed to log");
        } else if (i != 1) {
            ((agrc) ((agrc) ((agrc) xmj.a.b().i(agso.a, "MDX.CastSdkVersionHelper")).j(exc)).k("com/google/android/libraries/youtube/mdx/castclient/CastSdkVersionHelper", "makeGooglePlayServicesAvailableForCastV3", '\'', "CastSdkVersionHelper.java")).t("error updating Google Play Services for Cast sdk");
        } else {
            Log.w("DGInternalHandle", "Client disconnected on close: ".concat(String.valueOf(exc.getMessage())));
        }
    }
}
