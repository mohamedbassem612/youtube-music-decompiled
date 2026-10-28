package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class tuj extends LayerDrawable {
    public final Drawable a;
    public final int b;

    public tuj(Drawable drawable, Drawable drawable2, int i) {
        super(new Drawable[]{drawable, drawable2});
        drawable.getClass();
        this.a = drawable;
        this.b = i;
    }
}
