package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jbk implements Consumer {
    public final /* synthetic */ jbm a;
    public final /* synthetic */ ajnf b;

    public /* synthetic */ jbk(jbm jbmVar, ajnf ajnfVar) {
        this.a = jbmVar;
        this.b = ajnfVar;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        int iAr;
        int iAr2;
        ajnf ajnfVar = this.b;
        ImageView imageView = (ImageView) obj;
        boolean z = ajnfVar.e == 8;
        jbm jbmVar = this.a;
        View view = jbmVar.a;
        tuk.l(view, z);
        if (ajnfVar.e == 8) {
            int i = ajnfVar.c;
            int i2 = R.color.ytm_color_white_at_20pct;
            if ((i != 1 || (iAr2 = ahng.ar(((Integer) ajnfVar.d).intValue())) == 0 || iAr2 != 25) && !ajnfVar.l) {
                i2 = R.color.ytm_color_white;
            }
            if (ajnfVar.c == 1 && (iAr = ahng.ar(((Integer) ajnfVar.d).intValue())) != 0 && iAr == 42) {
                i2 = R.color.ytm_color_black;
            }
            Drawable drawableD = jbmVar.d(view.getContext(), ajnfVar);
            if (drawableD != null) {
                int color = view.getContext().getColor(i2);
                int i3 = jkl.a;
                Drawable drawableMutate = drawableD.mutate();
                drawableMutate.setTint(color);
                imageView.setImageDrawable(drawableMutate);
            }
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
