package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afdb extends afba {
    @Override // defpackage.afba
    public final void m(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        if (f >= 0.5f) {
            view = view2;
        }
        RectF rectFL = l(tabLayout, view);
        float fA = f < 0.5f ? aetz.a(1.0f, 0.0f, 0.0f, 0.5f, f) : aetz.a(0.0f, 1.0f, 0.5f, 1.0f, f);
        drawable.setBounds((int) rectFL.left, drawable.getBounds().top, (int) rectFL.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (fA * 255.0f));
    }
}
