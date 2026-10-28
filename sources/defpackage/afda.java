package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afda extends afba {
    private static float Z(float f) {
        return (float) (1.0d - Math.cos((((double) f) * 3.141592653589793d) / 2.0d));
    }

    private static float aa(float f) {
        return (float) Math.sin((((double) f) * 3.141592653589793d) / 2.0d);
    }

    @Override // defpackage.afba
    public final void m(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float fAa;
        float fZ;
        RectF rectFL = l(tabLayout, view);
        RectF rectFL2 = l(tabLayout, view2);
        if (rectFL.left < rectFL2.left) {
            fAa = Z(f);
            fZ = aa(f);
        } else {
            fAa = aa(f);
            fZ = Z(f);
        }
        drawable.setBounds(aetz.b((int) rectFL.left, (int) rectFL2.left, fAa), drawable.getBounds().top, aetz.b((int) rectFL.right, (int) rectFL2.right, fZ), drawable.getBounds().bottom);
    }
}
