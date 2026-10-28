package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import com.google.android.libraries.multiplatform.elements.ElementsServices;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ovg {
    private Integer a;

    private final int b(int i, ElementsServices elementsServices) {
        if (i != 0) {
            return i;
        }
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        TypedValue typedValue = new TypedValue();
        if (elementsServices.c().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
            try {
                Integer numValueOf = Integer.valueOf(elementsServices.c().getColor(typedValue.resourceId));
                this.a = numValueOf;
                return numValueOf.intValue();
            } catch (Resources.NotFoundException e) {
                elementsServices.n().c(aslh.LOG_TYPE_CONFIGURATION_ERROR, String.format("Ripple Color (attribute = android.R.attr.colorControlHighlight) is associated with undefined (colorId = %s)", Integer.toHexString(typedValue.resourceId)), e);
            }
        } else {
            elementsServices.n().a(aslh.LOG_TYPE_CONFIGURATION_ERROR, "Ripple color (attribute = android.R.attr.colorControlHighlight) not defined in the theme");
        }
        return 0;
    }

    public final RippleDrawable a(ovd ovdVar, ElementsServices elementsServices) {
        mqr mqrVar;
        int iB = b(ovdVar.b, elementsServices);
        if (ovdVar.d) {
            mqrVar = new mqr();
            mqrVar.a = -1;
            mqrVar.b(ovdVar.j);
        } else {
            mqrVar = null;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(iB), null, mqrVar);
        float fA = elementsServices.a();
        float f = ovdVar.c;
        if (f != 0.0f) {
            float f2 = f * fA;
            rippleDrawable.setRadius((int) (((double) f2) + (f2 > 0.0f ? 0.5d : -0.5d)));
        }
        return rippleDrawable;
    }
}
