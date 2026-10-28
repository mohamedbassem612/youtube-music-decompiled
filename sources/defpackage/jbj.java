package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jbj implements Consumer {
    public final /* synthetic */ jbm a;
    public final /* synthetic */ ajnf b;
    public final /* synthetic */ adly c;

    public /* synthetic */ jbj(jbm jbmVar, ajnf ajnfVar, adly adlyVar) {
        this.a = jbmVar;
        this.b = ajnfVar;
        this.c = adlyVar;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        int iAr;
        adly adlyVar = this.c;
        TextView textView = (TextView) obj;
        ajnf ajnfVar = this.b;
        int iB = adlyVar.b("buttonDrawableGravity", 8388611);
        int i = ajnfVar.e;
        jbm jbmVar = this.a;
        if (i == 8) {
            View view = jbmVar.a;
            Drawable drawableD = jbmVar.d(view.getContext(), ajnfVar);
            if (drawableD != null) {
                if (iB != 17) {
                    if (iB == 48) {
                        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawableD, (Drawable) null, (Drawable) null);
                    } else if (iB == 80) {
                        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, drawableD);
                    } else if (iB != 8388613) {
                        textView.setCompoundDrawablesWithIntrinsicBounds(drawableD, (Drawable) null, (Drawable) null, (Drawable) null);
                    } else {
                        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableD, (Drawable) null);
                    }
                } else if (TextUtils.isEmpty(textView.getText())) {
                    int intrinsicHeight = drawableD.getIntrinsicHeight();
                    int intrinsicWidth = drawableD.getIntrinsicWidth();
                    double minimumWidth = ((double) jbmVar.e().getMinimumWidth()) / 2.0d;
                    double d = ((double) intrinsicWidth) / 2.0d;
                    drawableD.setBounds((int) (minimumWidth - d), 0, (int) (minimumWidth + d), intrinsicHeight);
                    textView.setCompoundDrawablePadding(0);
                    textView.setCompoundDrawables(drawableD, null, null, null);
                } else {
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawableD, (Drawable) null, (Drawable) null, (Drawable) null);
                }
            }
            jbm.k(textView);
            view.setVisibility(0);
        } else {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
        }
        View view2 = jbmVar.a;
        int iB2 = adlyVar.b("buttonTextAlignment", view2.getTextAlignment());
        view2.setTextAlignment(iB2);
        if (iB2 == 5) {
            textView.setGravity(8388627);
        } else if (iB2 != 6) {
            textView.setGravity(17);
        } else {
            textView.setGravity(8388629);
        }
        if ((ajnfVar.c == 1 && (iAr = ahng.ar(((Integer) ajnfVar.d).intValue())) != 0 && iAr == 25) || ajnfVar.l) {
            Context context = textView.getContext();
            int i2 = jkl.a;
            textView.setTextColor(jkl.b(context.getColor(R.color.ytm_color_white_at_20pct)));
            if (ajnfVar.e == 8) {
                jbm.k(textView);
            }
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
