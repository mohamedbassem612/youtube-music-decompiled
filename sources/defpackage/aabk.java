package defpackage;

import android.graphics.Bitmap;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aabk implements sxu {
    final /* synthetic */ agkh a;
    final /* synthetic */ aabm b;
    final /* synthetic */ CountDownLatch c;
    final /* synthetic */ aabn d;

    public aabk(aabn aabnVar, agkh agkhVar, aabm aabmVar, CountDownLatch countDownLatch) {
        this.a = agkhVar;
        this.b = aabmVar;
        this.c = countDownLatch;
        this.d = aabnVar;
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        if (bitmap != null) {
            this.a.e(this.b, bitmap);
        } else {
            this.d.j.b("Received null response for notification image of type " + this.b.name() + " on the retry", null);
        }
        this.c.countDown();
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void iT(Object obj, Exception exc) {
        this.d.j.b("Failed to download notification image of type " + this.b.name() + " on the retry", exc);
        this.c.countDown();
    }
}
