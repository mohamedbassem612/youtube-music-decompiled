package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aabl implements sxu {
    final /* synthetic */ agkh a;
    final /* synthetic */ aabm b;
    final /* synthetic */ CountDownLatch c;
    final /* synthetic */ adhv d;
    final /* synthetic */ Uri e;
    final /* synthetic */ sxu f;
    final /* synthetic */ aabn g;

    public aabl(aabn aabnVar, agkh agkhVar, aabm aabmVar, CountDownLatch countDownLatch, adhv adhvVar, Uri uri, sxu sxuVar) {
        this.a = agkhVar;
        this.b = aabmVar;
        this.c = countDownLatch;
        this.d = adhvVar;
        this.e = uri;
        this.f = sxuVar;
        this.g = aabnVar;
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        if (bitmap != null) {
            this.a.e(this.b, bitmap);
            this.c.countDown();
        } else {
            this.g.j.b("Received null response for notification image of type ".concat(String.valueOf(this.b.name())), null);
            this.d.k(this.e, this.f);
        }
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void iT(Object obj, Exception exc) {
        this.g.j.b("Failed to download notification image of type ".concat(String.valueOf(this.b.name())), exc);
        this.d.k(this.e, this.f);
    }
}
