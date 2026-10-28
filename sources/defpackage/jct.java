package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jct implements View.OnLayoutChangeListener {
    private final int a;
    private final View b;

    public jct(int i, View view) {
        this.a = i;
        this.b = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        int height = ((View) view.getParent()).getHeight();
        if (view.getHeight() > height) {
            int height2 = view.getHeight() - height;
            View view2 = this.b;
            int iMax = Math.max(view2.getHeight() - height2, this.a);
            view2.getLayoutParams().height = iMax;
            view2.getLayoutParams().width = iMax;
            view2.requestLayout();
        }
    }
}
