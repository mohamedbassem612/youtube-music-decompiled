package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class izi implements sxu {
    final /* synthetic */ izj a;
    private final int b;
    private final int c;

    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    public izi(izj izjVar, int i, int i2) {
        this.a = izjVar;
        ahno.O((i ^ (-1)) >>> 31);
        ahno.O(i2 > 0);
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        this.a.c.obtainMessage(1, this.b, this.c, (Bitmap) obj2).sendToTarget();
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void iT(Object obj, Exception exc) {
        ((agrc) ((agrc) ((agrc) izj.a.b().i(agso.a, "CompoundThumbnailCtlr")).j(exc)).k("com/google/android/apps/youtube/music/ui/image/CompoundThumbnailImageViewController$ThumbnailCallback", "onError", 183, "CompoundThumbnailImageViewController.java")).w("Error retrieving thumbnail with Uri: %s", (Uri) obj);
        izj izjVar = this.a;
        izjVar.c();
        izjVar.e();
    }
}
