package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import defpackage.bac;
import defpackage.ttb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class YouTubeButton extends YouTubeTextView {
    private static final ttb a = new ttb();

    public YouTubeButton(Context context) {
        super(context);
        a();
    }

    private final void a() {
        bac.p(this, a);
    }

    @Override // android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public YouTubeButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public YouTubeButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    public YouTubeButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a();
    }
}
