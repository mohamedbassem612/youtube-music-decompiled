package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.widget.Checkable;
import app.rive.semantics.SemanticState;
import defpackage.aexx;
import defpackage.aexy;
import defpackage.aexz;
import defpackage.bac;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    private static final int[] e = {R.attr.state_checked};
    public boolean a;
    public boolean b;
    public boolean c;
    public aexy d;

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = true;
        this.c = true;
        bac.p(this, new aexx(this));
    }

    public final void a(boolean z) {
        if (this.b != z) {
            this.b = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.a;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.a ? mergeDrawableStates(super.onCreateDrawableState(i + 1), e) : super.onCreateDrawableState(i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        this.d = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof aexz)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        aexz aexzVar = (aexz) parcelable;
        super.onRestoreInstanceState(aexzVar.d);
        setChecked(aexzVar.a);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        aexz aexzVar = new aexz(super.onSaveInstanceState());
        aexzVar.a = this.a;
        return aexzVar;
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (!this.b || this.a == z) {
            return;
        }
        this.a = z;
        refreshDrawableState();
        sendAccessibilityEvent(SemanticState.Modal);
    }

    @Override // android.view.View
    public final void setFocusable(boolean z) {
        aexy aexyVar;
        boolean zIsFocusable = isFocusable();
        super.setFocusable(z);
        if (zIsFocusable == z || (aexyVar = this.d) == null) {
            return;
        }
        aexyVar.a();
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        if (this.c) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.a);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.youtube.music.R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }
}
