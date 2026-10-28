package defpackage;

import android.graphics.Bitmap;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class iwn implements ahcx {
    private final Bitmap a;
    private final iwm b;

    public iwn(Bitmap bitmap, iwm iwmVar) {
        this.a = bitmap;
        this.b = iwmVar;
    }

    @Override // defpackage.ahcx
    public final ListenableFuture a() {
        return ahng.n(this.b.a(this.a));
    }
}
