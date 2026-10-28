package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class twl implements PixelCopy$OnPixelCopyFinishedListener {
    final /* synthetic */ aqi a;
    final /* synthetic */ boolean b;
    final /* synthetic */ Bitmap c;
    final /* synthetic */ View d;
    final /* synthetic */ List e;

    public twl(aqi aqiVar, boolean z, Bitmap bitmap, View view, List list) {
        this.a = aqiVar;
        this.b = z;
        this.c = bitmap;
        this.d = view;
        this.e = list;
    }

    public final void onPixelCopyFinished(int i) {
        if (i != 0) {
            ((agrc) ((agrc) twm.a.b()).k("com/google/android/libraries/youtube/common/util/DisplayUtil$2", "onPixelCopyFinished", 680, "DisplayUtil.java")).u("Couldn't capture screenshot async, skipping: %d", i);
            this.a.d(new RuntimeException(a.bR(i, "Async PixelCopy failed with result: ")));
            return;
        }
        agrf agrfVar = twm.a;
        if (this.b) {
            twm.r(new Canvas(this.c), this.d, this.e);
        }
        Bitmap bitmapN = twm.n(this.c, 1048576);
        aqi aqiVar = this.a;
        if (bitmapN != null) {
            aqiVar.b(bitmapN);
        } else {
            aqiVar.d(new RuntimeException("Couldn't resize PixelCopy bitmap during screenshot"));
        }
    }
}
