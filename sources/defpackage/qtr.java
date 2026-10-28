package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qtr extends fei {
    final /* synthetic */ SquareImageView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qtr(SquareImageView squareImageView, SquareImageView squareImageView2) {
        super(squareImageView2);
        this.b = squareImageView;
    }

    @Override // defpackage.fem
    public final void a(Drawable drawable) {
        this.b.a();
    }

    @Override // defpackage.fem
    public final /* bridge */ /* synthetic */ void b(Object obj, fev fevVar) {
        SquareImageView squareImageView = this.b;
        squareImageView.a = (Bitmap) obj;
        squareImageView.b();
    }

    @Override // defpackage.fei
    protected final void c() {
        this.b.a();
    }
}
