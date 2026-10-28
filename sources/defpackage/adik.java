package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class adik extends feg {
    final /* synthetic */ sxu a;
    final /* synthetic */ Uri b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adik(sxu sxuVar, Uri uri) {
        super(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.a = sxuVar;
        this.b = uri;
    }

    @Override // defpackage.feg, defpackage.fem
    public final void a(Drawable drawable) {
        Uri uri = this.b;
        this.a.iT(uri, new Exception("Load failed: ".concat(String.valueOf(String.valueOf(uri)))));
    }

    @Override // defpackage.fem
    public final /* bridge */ /* synthetic */ void b(Object obj, fev fevVar) {
        this.a.b(this.b, (byte[]) obj);
    }

    @Override // defpackage.fem
    public final void gG(Drawable drawable) {
    }
}
