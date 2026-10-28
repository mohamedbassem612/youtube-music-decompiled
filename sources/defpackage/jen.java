package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jen implements adlz {
    public int a = -1;
    public ajwd b;

    public jen(ajwd ajwdVar) {
        this.b = ajwdVar;
    }

    public static ajwd b(adly adlyVar, ajwd ajwdVar) {
        Object objD = adlyVar.d("collectionStyleItemSize", ajwdVar);
        return objD != null ? (ajwd) objD : ajwdVar;
    }

    public static int c(Context context, int i, int i2) {
        int i3 = context.getResources().getDisplayMetrics().widthPixels;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.carousel_item_margin) << 1;
        int iW = jnj.w(context);
        return iW > 0 ? ((i3 - (iW << 1)) - (dimensionPixelSize * i)) / i : ((i3 - i2) - ((i + 1) * dimensionPixelSize)) / i;
    }

    @Override // defpackage.adlz
    public final void a(adly adlyVar, adkz adkzVar, int i) {
        adlyVar.f("carouselItemWidth", Integer.valueOf(this.a));
        adlyVar.f("collectionStyleItemSize", this.b);
    }
}
