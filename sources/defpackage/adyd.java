package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adyd extends qnv {
    @Override // defpackage.qnv
    protected final Object a(int i, View view) {
        return ((qnx) getItem(i)) instanceof adye ? new adyc(view) : super.a(i, view);
    }

    @Override // defpackage.qnv
    protected final void b(int i, Object obj) {
        qnx qnxVar = (qnx) getItem(i);
        if (!(qnxVar instanceof adye)) {
            super.b(i, obj);
            return;
        }
        adye adyeVar = (adye) qnxVar;
        adyc adycVar = (adyc) obj;
        TextView textView = (TextView) adycVar.a;
        textView.setText(adyeVar.d);
        ColorStateList colorStateList = adyeVar.e;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        } else {
            textView.setTextColor(tzk.n(textView.getContext(), R.attr.ytTextPrimary).orElse(0));
        }
        Drawable drawable = adyeVar.f;
        if (drawable == null) {
            ((ImageView) adycVar.d).setVisibility(8);
        } else {
            ImageView imageView = (ImageView) adycVar.d;
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
        }
        Object obj2 = adycVar.c;
        if (obj2 != null) {
            ((TextView) obj2).setVisibility(8);
        }
        Object obj3 = adycVar.b;
        if (obj3 != null) {
            ((TextView) obj3).setVisibility(8);
        }
        Drawable drawable2 = adyeVar.g;
        if (drawable2 == null) {
            ((ImageView) adycVar.e).setVisibility(8);
        } else {
            ImageView imageView2 = (ImageView) adycVar.e;
            imageView2.setImageDrawable(drawable2);
            imageView2.setVisibility(0);
        }
        Object obj4 = adycVar.f;
        if (obj4 != null) {
            ((View) obj4).setVisibility(8);
        }
        textView.setAccessibilityDelegate(new adyb(adyeVar));
    }
}
