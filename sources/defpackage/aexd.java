package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aexd extends aews {
    final /* synthetic */ ExtendedFloatingActionButton b;
    private final aexg c;
    private final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aexd(ExtendedFloatingActionButton extendedFloatingActionButton, auym auymVar, aexg aexgVar, boolean z) {
        super(extendedFloatingActionButton, auymVar);
        this.b = extendedFloatingActionButton;
        this.c = aexgVar;
        this.d = z;
    }

    @Override // defpackage.aews, defpackage.aexo
    public final AnimatorSet a() {
        aeud aeudVarC = c();
        if (aeudVarC.f("width")) {
            PropertyValuesHolder[] propertyValuesHolderArrG = aeudVarC.g("width");
            propertyValuesHolderArrG[0].setFloatValues(this.b.getWidth(), this.c.d());
            aeudVarC.e("width", propertyValuesHolderArrG);
        }
        if (aeudVarC.f("height")) {
            PropertyValuesHolder[] propertyValuesHolderArrG2 = aeudVarC.g("height");
            propertyValuesHolderArrG2[0].setFloatValues(this.b.getHeight(), this.c.a());
            aeudVarC.e("height", propertyValuesHolderArrG2);
        }
        if (aeudVarC.f("paddingStart")) {
            PropertyValuesHolder[] propertyValuesHolderArrG3 = aeudVarC.g("paddingStart");
            propertyValuesHolderArrG3[0].setFloatValues(this.b.getPaddingStart(), this.c.c());
            aeudVarC.e("paddingStart", propertyValuesHolderArrG3);
        }
        if (aeudVarC.f("paddingEnd")) {
            PropertyValuesHolder[] propertyValuesHolderArrG4 = aeudVarC.g("paddingEnd");
            propertyValuesHolderArrG4[0].setFloatValues(this.b.getPaddingEnd(), this.c.b());
            aeudVarC.e("paddingEnd", propertyValuesHolderArrG4);
        }
        if (aeudVarC.f("labelOpacity")) {
            PropertyValuesHolder[] propertyValuesHolderArrG5 = aeudVarC.g("labelOpacity");
            ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
            int iAlpha = Color.alpha(extendedFloatingActionButton.m());
            propertyValuesHolderArrG5[0].setFloatValues(iAlpha != 0 ? Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / iAlpha : 0.0f, true == this.d ? 1.0f : 0.0f);
            aeudVarC.e("labelOpacity", propertyValuesHolderArrG5);
        }
        return super.b(aeudVarC);
    }

    @Override // defpackage.aews, defpackage.aexo
    public final void f() {
        super.f();
        ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        extendedFloatingActionButton.s = false;
        extendedFloatingActionButton.setHorizontallyScrolling(false);
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams != null) {
            aexg aexgVar = this.c;
            layoutParams.width = aexgVar.e().width;
            layoutParams.height = aexgVar.e().height;
        }
    }

    @Override // defpackage.aews, defpackage.aexo
    public final void g(Animator animator) {
        super.g(animator);
        ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        extendedFloatingActionButton.r = this.d;
        extendedFloatingActionButton.s = true;
        extendedFloatingActionButton.setHorizontallyScrolling(true);
        extendedFloatingActionButton.o();
    }

    @Override // defpackage.aexo
    public final int h() {
        return this.d ? R.animator.mtrl_extended_fab_change_size_expand_motion_spec : R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
    }

    @Override // defpackage.aexo
    public final void i() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        boolean z = this.d;
        extendedFloatingActionButton.r = z;
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams != null) {
            if (!z) {
                extendedFloatingActionButton.u = layoutParams.width;
                extendedFloatingActionButton.v = layoutParams.height;
            }
            aexg aexgVar = this.c;
            layoutParams.width = aexgVar.e().width;
            layoutParams.height = aexgVar.e().height;
            if (z) {
                extendedFloatingActionButton.n(extendedFloatingActionButton.t);
            } else if (extendedFloatingActionButton.getText() != null && extendedFloatingActionButton.getText() != "") {
                extendedFloatingActionButton.n(ColorStateList.valueOf(0));
            }
            extendedFloatingActionButton.setPaddingRelative(aexgVar.c(), extendedFloatingActionButton.getPaddingTop(), aexgVar.b(), extendedFloatingActionButton.getPaddingBottom());
            extendedFloatingActionButton.requestLayout();
            extendedFloatingActionButton.o();
        }
    }

    @Override // defpackage.aexo
    public final boolean j() {
        boolean z = this.d;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        return z == extendedFloatingActionButton.r || ((MaterialButton) extendedFloatingActionButton).c == null || TextUtils.isEmpty(extendedFloatingActionButton.getText());
    }

    @Override // defpackage.aexo
    public final void k() {
    }
}
