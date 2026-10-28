package com.google.android.libraries.youtube.creation.common.ui.toolbelt;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.qcb;
import defpackage.uiv;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ToolbarView extends FrameLayout {
    public qcb a;

    public ToolbarView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        qcb qcbVar = this.a;
        if (qcbVar != null) {
            ((uiv) qcbVar.a).h();
        }
    }

    public ToolbarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ToolbarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ToolbarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
