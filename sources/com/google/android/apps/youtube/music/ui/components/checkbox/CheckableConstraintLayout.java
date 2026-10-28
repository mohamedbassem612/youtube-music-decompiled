package com.google.android.apps.youtube.music.ui.components.checkbox;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class CheckableConstraintLayout extends ConstraintLayout implements Checkable {
    private static final int[] i = {R.attr.state_checked};
    private boolean j;

    public CheckableConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.j;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (this.j) {
            mergeDrawableStates(iArrOnCreateDrawableState, i);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (this.j != z) {
            this.j = z;
            refreshDrawableState();
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.j);
    }
}
