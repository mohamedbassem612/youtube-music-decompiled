package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import defpackage.aeud;
import defpackage.aewv;
import defpackage.aeww;
import defpackage.aewx;
import defpackage.aewy;
import defpackage.aewz;
import defpackage.aexa;
import defpackage.aexb;
import defpackage.aexc;
import defpackage.aexd;
import defpackage.aexe;
import defpackage.aexf;
import defpackage.aexg;
import defpackage.aexo;
import defpackage.aexp;
import defpackage.aeyc;
import defpackage.aeym;
import defpackage.afbk;
import defpackage.afev;
import defpackage.ass;
import defpackage.ast;
import defpackage.asv;
import defpackage.auym;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements ass {
    public static final Property k = new aewz(Float.class);
    public static final Property l = new aexa(Float.class);
    public static final Property m = new aexb(Float.class);
    public static final Property n = new aexc(Float.class);
    public static final /* synthetic */ int w = 0;
    private final aexo A;
    private final aexo B;
    private int C;
    private final ast D;
    private final int E;
    private final auym F;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public ColorStateList t;
    public int u;
    public int v;
    private boolean x;
    private final aexo y;
    private final aexo z;

    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(afev.a(context, attributeSet, i, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon), attributeSet, i);
        this.o = 0;
        this.x = true;
        auym auymVar = new auym();
        this.F = auymVar;
        aexf aexfVar = new aexf(this, auymVar);
        this.A = aexfVar;
        aexe aexeVar = new aexe(this, auymVar);
        this.B = aexeVar;
        this.r = true;
        this.s = false;
        Context context2 = getContext();
        this.D = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayA = aeym.a(context2, attributeSet, aexp.a, i, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, new int[0]);
        aeud aeudVarB = aeud.b(context2, typedArrayA, 5);
        aeud aeudVarB2 = aeud.b(context2, typedArrayA, 4);
        aeud aeudVarB3 = aeud.b(context2, typedArrayA, 2);
        aeud aeudVarB4 = aeud.b(context2, typedArrayA, 6);
        this.C = typedArrayA.getDimensionPixelSize(0, -1);
        int i2 = typedArrayA.getInt(3, 1);
        this.E = i2;
        this.p = getPaddingStart();
        this.q = getPaddingEnd();
        auym auymVar2 = new auym();
        aexg aewvVar = new aewv(this, 0);
        aeww aewwVar = new aeww(this, aewvVar);
        aewx aewxVar = new aewx(this, aewwVar, aewvVar);
        ?? r3 = 1;
        if (i2 != 1) {
            aewvVar = i2 != 2 ? aewxVar : aewwVar;
            r3 = 1;
        }
        aexd aexdVar = new aexd(this, auymVar2, aewvVar, r3);
        this.z = aexdVar;
        aexd aexdVar2 = new aexd(this, auymVar2, new aewv(this, r3), false);
        this.y = aexdVar2;
        aexfVar.a = aeudVarB;
        aexeVar.a = aeudVarB2;
        aexdVar.a = aeudVarB3;
        aexdVar2.a = aeudVarB4;
        typedArrayA.recycle();
        d(new afbk(afbk.i(context2, attributeSet, i, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, afbk.a)));
        r();
    }

    private final void r() {
        this.t = getTextColors();
    }

    @Override // defpackage.ass
    public final ast a() {
        return this.D;
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    public final int k() {
        return (l() - ((MaterialButton) this).d) / 2;
    }

    public final int l() {
        int i = this.C;
        return i < 0 ? (Math.min(getPaddingStart(), getPaddingEnd()) << 1) + ((MaterialButton) this).d : i;
    }

    public final int m() {
        return this.t.getColorForState(getDrawableState(), 0);
    }

    public final void n(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    public final void o() {
        CharSequence text = null;
        if (!this.r && isClickable()) {
            text = getText();
            if (TextUtils.isEmpty(text)) {
                text = getContentDescription();
            }
        }
        if (TextUtils.equals(getTooltipText(), text)) {
            return;
        }
        setTooltipText(text);
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.r || !TextUtils.isEmpty(getText()) || ((MaterialButton) this).c == null) {
            o();
        } else {
            this.r = false;
            this.y.i();
        }
    }

    public final boolean p() {
        int visibility = getVisibility();
        int i = this.o;
        if (visibility != 0) {
            if (i != 2) {
                return false;
            }
        } else if (i == 1) {
            return false;
        }
        return true;
    }

    public final void q(int i) {
        aexo aexoVar;
        if (i == 0) {
            aexoVar = this.A;
        } else if (i != 1) {
            aexoVar = i != 2 ? this.z : this.y;
        } else {
            aexoVar = this.B;
        }
        if (aexoVar.j()) {
            return;
        }
        if (this.x) {
            if (!isLaidOut()) {
                p();
            } else if (!isInEditMode()) {
                if (i == 2) {
                    ViewGroup.LayoutParams layoutParams = getLayoutParams();
                    if (layoutParams != null) {
                        this.u = layoutParams.width;
                        this.v = layoutParams.height;
                    } else {
                        this.u = getWidth();
                        this.v = getHeight();
                    }
                }
                measure(0, 0);
                AnimatorSet animatorSetA = aexoVar.a();
                animatorSetA.addListener(new aewy(aexoVar));
                Iterator it = aexoVar.d().iterator();
                while (it.hasNext()) {
                    animatorSetA.addListener((Animator.AnimatorListener) it.next());
                }
                animatorSetA.start();
                return;
            }
        }
        aexoVar.i();
        aexoVar.k();
    }

    @Override // android.view.View
    public final void setClickable(boolean z) {
        super.setClickable(z);
        o();
    }

    @Override // android.view.View
    public final void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        o();
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.r || this.s) {
            return;
        }
        this.p = getPaddingStart();
        this.q = getPaddingEnd();
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (!this.r || this.s) {
            return;
        }
        this.p = i;
        this.q = i3;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        o();
    }

    @Override // android.widget.TextView
    public final void setTextColor(int i) {
        super.setTextColor(i);
        r();
    }

    @Override // android.widget.TextView
    public final void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        r();
    }

    /* JADX INFO: compiled from: PG */
    public class ExtendedFloatingActionButtonBehavior extends ast {
        private Rect b;
        private final boolean c;
        private final boolean d;

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aexp.b);
            this.c = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.d = typedArrayObtainStyledAttributes.getBoolean(1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        private static boolean s(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof asv) {
                return ((asv) layoutParams).a instanceof BottomSheetBehavior;
            }
            return false;
        }

        private final boolean t(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.c || this.d) && ((asv) extendedFloatingActionButton.getLayoutParams()).f == view.getId();
        }

        private final boolean u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!t(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            Rect rect = this.b;
            if (rect == null) {
                rect = new Rect();
                this.b = rect;
            }
            aeyc.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.d()) {
                r(extendedFloatingActionButton);
            } else {
                q(extendedFloatingActionButton);
            }
            return true;
        }

        private final boolean v(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!t(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((asv) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                r(extendedFloatingActionButton);
            } else {
                q(extendedFloatingActionButton);
            }
            return true;
        }

        @Override // defpackage.ast
        public final /* bridge */ /* synthetic */ boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        @Override // defpackage.ast
        public final void onAttachedToLayoutParams(asv asvVar) {
            if (asvVar.h == 0) {
                asvVar.h = 80;
            }
        }

        @Override // defpackage.ast
        public final /* bridge */ /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                u(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                return false;
            }
            if (!s(view2)) {
                return false;
            }
            v(view2, extendedFloatingActionButton);
            return false;
        }

        @Override // defpackage.ast
        public final /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List listA = coordinatorLayout.a(extendedFloatingActionButton);
            int size = listA.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) listA.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    if (s(view2) && v(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (u(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.j(extendedFloatingActionButton, i);
            return true;
        }

        protected final void q(ExtendedFloatingActionButton extendedFloatingActionButton) {
            int i = ExtendedFloatingActionButton.w;
            extendedFloatingActionButton.q(true != this.d ? 0 : 3);
        }

        protected final void r(ExtendedFloatingActionButton extendedFloatingActionButton) {
            int i = ExtendedFloatingActionButton.w;
            extendedFloatingActionButton.q(true == this.d ? 2 : 1);
        }

        public ExtendedFloatingActionButtonBehavior() {
            this.c = false;
            this.d = true;
        }
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }
}
