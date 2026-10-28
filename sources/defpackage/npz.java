package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class npz extends feg {
    private final nci a;
    private final ImageView.ScaleType b;
    private final nuc d;
    private final boolean e;
    private final mro f;

    public npz(nci nciVar, mro mroVar, int i, int i2, ImageView.ScaleType scaleType, nuc nucVar, boolean z) {
        super(i, i2);
        this.a = nciVar;
        this.f = mroVar;
        this.b = scaleType;
        this.d = nucVar;
        this.e = z;
    }

    @Override // defpackage.feg, defpackage.fem
    public final void a(Drawable drawable) {
        if (drawable != null) {
            this.f.b(drawable);
        }
    }

    @Override // defpackage.fem
    public final /* bridge */ /* synthetic */ void b(Object obj, fev fevVar) {
        Drawable drawable = (Drawable) obj;
        if (drawable instanceof BitmapDrawable) {
            ImageView.ScaleType scaleType = this.b;
            if (!this.e && scaleType == ImageView.ScaleType.CENTER_INSIDE) {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            mfj mfjVar = new mfj(((BitmapDrawable) drawable).getBitmap(), scaleType, this.d);
            mfjVar.p = true;
            drawable = mfjVar;
        }
        qnl.bH(drawable, this.a);
        this.f.b(drawable);
    }

    @Override // defpackage.fem
    public final void gG(Drawable drawable) {
        this.f.b(drawable);
    }
}
