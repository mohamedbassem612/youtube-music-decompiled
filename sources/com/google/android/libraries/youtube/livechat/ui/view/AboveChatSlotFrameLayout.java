package com.google.android.libraries.youtube.livechat.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.tyl;
import defpackage.tym;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class AboveChatSlotFrameLayout extends FrameLayout {
    public AboveChatSlotFrameLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        tym.h(this, new tyl(-2, 1), ViewGroup.LayoutParams.class);
        super.addView(view);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        tym.h(this, new tyl(getHeight(), 1), ViewGroup.LayoutParams.class);
        super.removeView(view);
    }

    public AboveChatSlotFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AboveChatSlotFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AboveChatSlotFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
