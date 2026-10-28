package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewParent;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dui implements duv {
    private final int a;

    public dui(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Margin must be non-negative");
        }
        this.a = i;
    }

    @Override // defpackage.duv
    public final void a(View view, float f) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if (!(parent instanceof RecyclerView) || !(parent2 instanceof ViewPager2)) {
            throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
        }
        ViewPager2 viewPager2 = (ViewPager2) parent2;
        float f2 = this.a * f;
        if (viewPager2.a() != 0) {
            view.setTranslationY(f2);
            return;
        }
        if (viewPager2.k()) {
            f2 = -f2;
        }
        view.setTranslationX(f2);
    }
}
