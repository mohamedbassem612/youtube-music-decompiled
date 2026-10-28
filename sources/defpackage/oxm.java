package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oxm extends feg {
    private final ImageView.ScaleType a;
    private final oui b;
    private final oxp d;
    private final atiq e;

    public oxm(atiq atiqVar, oxp oxpVar, int i, int i2, ImageView.ScaleType scaleType, oui ouiVar) {
        super(i, i2);
        this.e = atiqVar;
        this.d = oxpVar;
        this.a = scaleType;
        this.b = ouiVar;
    }

    @Override // defpackage.feg, defpackage.fem
    public final void a(Drawable drawable) {
        if (drawable != null) {
            this.d.c(drawable);
        }
    }

    @Override // defpackage.fem
    public final /* bridge */ /* synthetic */ void b(Object obj, fev fevVar) {
        Drawable otmVar = (Drawable) obj;
        if (otmVar instanceof BitmapDrawable) {
            otmVar = new otm(((BitmapDrawable) otmVar).getBitmap(), this.a, this.b);
        }
        oty.c(otmVar, this.e);
        this.d.c(otmVar);
    }

    @Override // defpackage.fem
    public final void gG(Drawable drawable) {
        this.d.c(drawable);
    }
}
