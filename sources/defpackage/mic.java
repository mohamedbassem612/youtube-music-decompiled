package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mic implements nwq {
    private final nuc a;

    public mic(nuc nucVar) {
        this.a = nucVar;
    }

    private static int c(fhd fhdVar, asoh asohVar, nuc nucVar) {
        int i = asohVar.c;
        if (i != 0) {
            return i;
        }
        Context context = fhdVar.a;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
            try {
                return context.getColor(typedValue.resourceId);
            } catch (Resources.NotFoundException e) {
                aihf aihfVarCreateBuilder = asnc.a.createBuilder();
                aslh aslhVar = aslh.LOG_TYPE_INVALID_FIELD;
                aihfVarCreateBuilder.copyOnWrite();
                asnc asncVar = (asnc) aihfVarCreateBuilder.instance;
                asncVar.d = aslhVar.I;
                asncVar.b |= 2;
                String hexString = Integer.toHexString(typedValue.resourceId);
                aihfVarCreateBuilder.copyOnWrite();
                asnc asncVar2 = (asnc) aihfVarCreateBuilder.instance;
                hexString.getClass();
                asncVar2.b |= SemanticState.Hidden;
                asncVar2.l = hexString;
                nucVar.e((asnc) aihfVarCreateBuilder.build(), e, "Ripple Color (attribute = android.R.attr.colorControlHighlight) is associated with undefined.", new Object[0]);
            }
        } else {
            nucVar.c(aslh.LOG_TYPE_INVALID_FIELD, nsl.a, "Ripple color (attribute = android.R.attr.colorControlHighlight) not defined in the theme", new Object[0]);
        }
        return 0;
    }

    private static void d(asoh asohVar, RippleDrawable rippleDrawable, DisplayMetrics displayMetrics) {
        int i = asohVar.d;
        if (i != 0) {
            rippleDrawable.setRadius(Math.round(TypedValue.applyDimension(1, i, displayMetrics)));
        }
    }

    @Override // defpackage.nwq
    public final aigw a() {
        return asoh.b;
    }

    @Override // defpackage.nwq
    public final /* bridge */ /* synthetic */ void b(fhd fhdVar, Object obj, nwp nwpVar) {
        asoh asohVar = (asoh) obj;
        int iC = c(fhdVar, asohVar, this.a);
        if (iC != 0) {
            boolean z = asohVar.e;
            Drawable drawable = nwpVar.d;
            DisplayMetrics displayMetrics = fhdVar.c().getDisplayMetrics();
            mqr mqrVar = null;
            if (!z) {
                RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(iC), null, null);
                d(asohVar, rippleDrawable, displayMetrics);
                if (drawable == null) {
                    nwpVar.d = rippleDrawable;
                    return;
                } else {
                    nwpVar.d = new LayerDrawable(new Drawable[]{drawable, rippleDrawable});
                    return;
                }
            }
            if (drawable == null) {
                mqr mqrVar2 = new mqr();
                mqrVar2.a = -1;
                mqrVar2.b(nwpVar.a);
                drawable = null;
                mqrVar = mqrVar2;
            }
            RippleDrawable rippleDrawable2 = new RippleDrawable(ColorStateList.valueOf(iC), drawable, mqrVar);
            d(asohVar, rippleDrawable2, displayMetrics);
            nwpVar.d = rippleDrawable2;
        }
    }
}
