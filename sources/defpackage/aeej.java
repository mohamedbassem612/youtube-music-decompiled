package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class aeej extends HorizontalScrollView {
    public LinearLayout a;
    public int b;
    public ArrayList c;
    public View.OnClickListener d;
    public final ttb e;

    public aeej(Context context) {
        super(context);
        this.e = new ttb();
        f(context);
    }

    public final int d() {
        return this.c.size();
    }

    public final View e(int i) {
        if (i < 0 || i >= this.c.size()) {
            return null;
        }
        return (View) this.c.get(i);
    }

    final void f(Context context) {
        this.b = -1;
        this.c = new ArrayList(10);
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setOrientation(0);
        this.a.setFocusable(false);
        this.a.setClickable(false);
        addView(this.a);
        LinearLayout linearLayout2 = this.a;
        int i = bac.a;
        linearLayout2.setImportantForAccessibility(1);
        setFillViewport(true);
        setHorizontalScrollBarEnabled(false);
        this.d = new aefn(this, 1, null);
    }

    protected abstract void g(int i, boolean z);

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -1);
    }

    public void h(int i) {
        throw null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -1);
    }

    public aeej(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new ttb();
        f(context);
    }

    public aeej(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new ttb();
        f(context);
    }
}
