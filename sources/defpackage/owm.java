package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.multiplatform.elements.ElementsServices;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class owm {
    final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public owl f;
    public final owy g;
    final qcb h = new qcb(this, null);

    public owm(owy owyVar, ElementsServices elementsServices) {
        this.g = owyVar;
        float fA = elementsServices.a();
        this.a = 30.0f * fA;
        this.b = 60.0f * fA;
        this.c = 200.0f * fA;
        this.d = 25.0f * fA;
        this.e = fA * 50.0f;
    }

    public final void a() {
        owl owlVar;
        if (Build.VERSION.SDK_INT < 28 || (owlVar = this.f) == null) {
            return;
        }
        owlVar.a();
        this.f = null;
    }

    public final void b(float f, int i, int i2, int i3, int i4, View view) {
        owl owlVar;
        owy owyVar;
        Layout layout;
        if (Build.VERSION.SDK_INT < 28 || (owlVar = this.f) == null || (layout = (owyVar = this.g).m) == null || i < 0) {
            return;
        }
        int lineForOffset = layout.getLineForOffset(i);
        float lineTop = layout.getLineTop(lineForOffset);
        float lineBottom = layout.getLineBottom(lineForOffset);
        if (Build.VERSION.SDK_INT >= 34) {
            lineBottom = layout.getLineBottom(lineForOffset, false);
        } else if (lineForOffset < layout.getLineCount() - 1) {
            float spacingAdd = layout.getSpacingAdd();
            float spacingMultiplier = layout.getSpacingMultiplier();
            if (spacingMultiplier != 1.0f || spacingAdd != 0.0f) {
                float f2 = lineBottom - lineTop;
                lineBottom -= f2 - ((f2 - spacingAdd) / spacingMultiplier);
            }
        }
        float fD = lineTop + ((lineBottom - lineTop) / 2.0f) + owyVar.d();
        float lineLeft = layout.getLineLeft(lineForOffset);
        float lineRight = layout.getLineRight(lineForOffset);
        if (i2 != 2 ? !(i2 != 3 || i4 > i3 + 1 || f >= layout.getPrimaryHorizontal(i4) - this.a) : !(i3 < i4 - 1 || f <= layout.getPrimaryHorizontal(i3) + this.a)) {
            owlVar.a();
            return;
        }
        float fMax = Math.max(lineLeft, Math.min(f, lineRight)) + owyVar.s + owyVar.a();
        float f3 = fD + owyVar.t;
        Object obj = owyVar.q;
        if (view != null && (obj instanceof View)) {
            View view2 = (View) obj;
            if (!obj.equals(view) && (view instanceof ViewGroup)) {
                Rect rect = new Rect(Math.round(fMax), Math.round(f3), Math.round(fMax), Math.round(f3));
                ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, rect);
                fMax = rect.left;
                f3 = rect.top;
            }
        }
        try {
            owlVar.a.show(fMax, f3);
        } catch (IllegalArgumentException unused) {
            this.f = null;
        }
    }
}
