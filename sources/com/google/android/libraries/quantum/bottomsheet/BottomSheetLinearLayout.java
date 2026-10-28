package com.google.android.libraries.quantum.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import defpackage.qnw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class BottomSheetLinearLayout extends LinearLayout {
    private int a;
    private int b;

    public BottomSheetLinearLayout(Context context) {
        super(context);
        b();
    }

    private final int a(int i) {
        return (int) TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }

    private final void b() {
        int iT = qnw.t(getContext());
        if (iT <= 600) {
            this.b = a(iT);
            this.a = Alert.DURATION_SHOW_INDEFINITELY;
        } else if (iT <= 960) {
            this.a = a(832);
            this.b = a(384);
        } else if (iT <= 1280) {
            this.a = a(SemanticState.ReadOnly);
            this.b = a(SemanticState.LiveRegion);
        } else {
            this.a = a(1056);
            this.b = a(576);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (size > this.a) {
            i = View.MeasureSpec.makeMeasureSpec(this.a, View.MeasureSpec.getMode(i));
        } else if (size < this.b) {
            i = View.MeasureSpec.makeMeasureSpec(this.b, View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
    }

    public BottomSheetLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }
}
