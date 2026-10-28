package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aewr extends Property {
    public aewr(Class cls) {
        super(cls, "LABEL_OPACITY_PROPERTY");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
        int iAlpha = Color.alpha(extendedFloatingActionButton.m());
        return Float.valueOf(iAlpha != 0 ? Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / iAlpha : 0.0f);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
        Float f = (Float) obj2;
        if (f.floatValue() == 1.0f) {
            extendedFloatingActionButton.n(extendedFloatingActionButton.t);
            return;
        }
        int iM = extendedFloatingActionButton.m();
        float fAlpha = Color.alpha(iM);
        float fFloatValue = f.floatValue();
        TimeInterpolator timeInterpolator = aetz.a;
        extendedFloatingActionButton.n(ColorStateList.valueOf(avv.f(iM, Math.round((fFloatValue * (fAlpha + 0.0f)) + 0.0f))));
    }
}
