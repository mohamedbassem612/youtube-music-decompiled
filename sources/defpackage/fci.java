package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fci extends feg {
    final int a;
    public Bitmap b;
    private final Handler d;
    private final long e;

    public fci(Handler handler, int i, long j) {
        super(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.d = handler;
        this.a = i;
        this.e = j;
    }

    @Override // defpackage.fem
    public final /* bridge */ /* synthetic */ void b(Object obj, fev fevVar) {
        this.b = (Bitmap) obj;
        Handler handler = this.d;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.e);
    }

    @Override // defpackage.fem
    public final void gG(Drawable drawable) {
        this.b = null;
    }
}
