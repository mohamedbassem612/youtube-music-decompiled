package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.ahto;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {
    private static final int[] a = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ahto ahtoVarK = ahto.K(context, attributeSet, a);
        setBackgroundDrawable(ahtoVarK.B(0));
        ahtoVarK.F();
    }
}
