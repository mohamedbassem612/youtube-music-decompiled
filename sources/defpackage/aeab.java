package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aeab implements View.OnLayoutChangeListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public aeab(aemn aemnVar, int i, int i2) {
        this.$cid = i2;
        this.a = i;
        this.b = aemnVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.$cid;
        if (i9 == 0) {
            Object obj = this.b;
            TextView textView = (TextView) obj;
            Drawable drawable = textView.getCompoundDrawablesRelative()[0];
            if (drawable != null) {
                int i10 = this.a;
                drawable.setBounds(0, 0, i10, i10);
                textView.setCompoundDrawablesRelative(drawable, null, null, null);
                tym.h((View) obj, new tyl(i10 + textView.getPaddingTop() + textView.getPaddingBottom(), 1), ViewGroup.LayoutParams.class);
                return;
            }
            return;
        }
        Object obj2 = this.b;
        if (i9 != 1) {
            aemn aemnVar = (aemn) obj2;
            if (aemnVar.n.getHeight() != this.a) {
                aemnVar.n.removeOnLayoutChangeListener(this);
                aemnVar.m(false);
                return;
            }
            return;
        }
        View view2 = (View) obj2;
        if (view2.getWidth() <= 0 || view2.getHeight() <= 0) {
            return;
        }
        yno.dB(view2, this.a);
        view2.removeOnLayoutChangeListener(this);
    }

    public aeab(View view, int i, int i2) {
        this.$cid = i2;
        this.b = view;
        this.a = i;
    }

    public /* synthetic */ aeab(TextView textView, int i, int i2) {
        this.$cid = i2;
        this.b = textView;
        this.a = i;
    }
}
