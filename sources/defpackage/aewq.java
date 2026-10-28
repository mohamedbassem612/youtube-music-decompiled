package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aewq {
    private static final int c = 5;
    public final boolean a;
    public final int b;
    private final int d;
    private final int e;
    private final float f;

    public aewq(Context context) {
        boolean zX = afba.x(context.getTheme(), R.attr.elevationOverlayEnabled, false);
        TypedValue typedValueU = afba.u(context.getTheme(), R.attr.elevationOverlayColor);
        Integer numValueOf = typedValueU != null ? Integer.valueOf(afba.M(context, typedValueU)) : null;
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        TypedValue typedValueU2 = afba.u(context.getTheme(), R.attr.elevationOverlayAccentColor);
        Integer numValueOf2 = typedValueU2 != null ? Integer.valueOf(afba.M(context, typedValueU2)) : null;
        int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
        TypedValue typedValueU3 = afba.u(context.getTheme(), R.attr.colorSurface);
        Integer numValueOf3 = typedValueU3 != null ? Integer.valueOf(afba.M(context, typedValueU3)) : null;
        int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : 0;
        float f = context.getResources().getDisplayMetrics().density;
        this.a = zX;
        this.d = iIntValue;
        this.e = iIntValue2;
        this.b = iIntValue3;
        this.f = f;
    }

    public final int a(int i, float f) {
        int i2;
        if (!this.a) {
            return i;
        }
        int i3 = (16777215 & i) | (-16777216);
        int i4 = this.b;
        int i5 = avv.a;
        if (i3 != i4) {
            return i;
        }
        float f2 = this.f;
        float fMin = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iL = afba.L(i3, this.d, fMin);
        if (fMin > 0.0f && (i2 = this.e) != 0) {
            iL = avv.e(avv.f(i2, c), iL);
        }
        return avv.f(iL, iAlpha);
    }
}
