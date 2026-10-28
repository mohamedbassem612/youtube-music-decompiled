package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import app.rive.semantics.SemanticState;
import defpackage.aeyd;
import defpackage.aeye;
import defpackage.axx;
import defpackage.bac;
import defpackage.is;
import defpackage.jc;
import defpackage.mo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class NavigationMenuItemView extends aeyd implements jc {
    private static final int[] e = {R.attr.state_checked};
    public boolean c;
    boolean d;
    private int i;
    private final CheckedTextView j;
    private FrameLayout k;
    private is l;
    private final axx m;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = true;
        aeye aeyeVar = new aeye(this);
        this.m = aeyeVar;
        r(0);
        LayoutInflater.from(context).inflate(com.google.android.apps.youtube.music.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        this.i = context.getResources().getDimensionPixelSize(com.google.android.apps.youtube.music.R.dimen.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.google.android.apps.youtube.music.R.id.design_menu_item_text);
        this.j = checkedTextView;
        bac.p(checkedTextView, aeyeVar);
    }

    @Override // defpackage.jc
    public final is a() {
        return this.l;
    }

    @Override // defpackage.jc
    public final boolean e() {
        return false;
    }

    @Override // defpackage.jc
    public final void f(is isVar) {
        StateListDrawable stateListDrawable;
        this.l = isVar;
        int i = isVar.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(true != isVar.isVisible() ? 8 : 0);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.google.android.apps.youtube.music.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(e, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        boolean zIsCheckable = isVar.isCheckable();
        refreshDrawableState();
        if (this.c != zIsCheckable) {
            this.c = zIsCheckable;
            this.m.sendAccessibilityEvent(this.j, SemanticState.Modal);
        }
        boolean zIsChecked = isVar.isChecked();
        refreshDrawableState();
        CheckedTextView checkedTextView = this.j;
        checkedTextView.setChecked(zIsChecked);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (zIsChecked && this.d) ? 1 : 0);
        setEnabled(isVar.isEnabled());
        checkedTextView.setText(isVar.d);
        Drawable icon = isVar.getIcon();
        if (icon != null) {
            int i2 = this.i;
            icon.setBounds(0, 0, i2, i2);
        }
        checkedTextView.setCompoundDrawablesRelative(icon, null, null, null);
        View actionView = isVar.getActionView();
        if (actionView != null) {
            if (this.k == null) {
                this.k = (FrameLayout) ((ViewStub) findViewById(com.google.android.apps.youtube.music.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (actionView.getParent() != null) {
                ((ViewGroup) actionView.getParent()).removeView(actionView);
            }
            this.k.removeAllViews();
            this.k.addView(actionView);
        }
        setContentDescription(isVar.l);
        setTooltipText(isVar.m);
        is isVar2 = this.l;
        if (isVar2.d == null && isVar2.getIcon() == null && this.l.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.k;
            if (frameLayout != null) {
                mo moVar = (mo) frameLayout.getLayoutParams();
                moVar.width = -1;
                this.k.setLayoutParams(moVar);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.k;
        if (frameLayout2 != null) {
            mo moVar2 = (mo) frameLayout2.getLayoutParams();
            moVar2.width = -2;
            this.k.setLayoutParams(moVar2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        is isVar = this.l;
        if (isVar != null && isVar.isCheckable() && isVar.isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, e);
        }
        return iArrOnCreateDrawableState;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }
}
