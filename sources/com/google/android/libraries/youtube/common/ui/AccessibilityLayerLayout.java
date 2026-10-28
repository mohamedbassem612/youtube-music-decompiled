package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.bac;
import defpackage.geq;
import defpackage.hhb;
import defpackage.tst;
import defpackage.ttv;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AccessibilityLayerLayout extends FrameLayout {
    public int a;
    public final int b;
    public final boolean c;
    public View d;
    public View e;
    public hhb f;
    private boolean g;

    public AccessibilityLayerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ttv.a);
        this.a = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        this.b = resourceId;
        this.c = typedArrayObtainStyledAttributes.getBoolean(2, false);
        typedArrayObtainStyledAttributes.recycle();
        this.d = findViewById(this.a);
        this.e = findViewById(resourceId);
        tst tstVar = new tst(this);
        bac.s(this);
        setAccessibilityDelegate(tstVar.getBridge());
        setImportantForAccessibility(1);
        setOnHierarchyChangeListener(new geq(this, 2));
    }

    public final void a() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (c(childAt)) {
                int i2 = bac.a;
                childAt.setImportantForAccessibility(0);
            } else {
                int i3 = bac.a;
                childAt.setImportantForAccessibility(4);
            }
        }
    }

    public final void b(boolean z) {
        getContext();
        this.g = z;
    }

    public final boolean c(View view) {
        View childAt;
        if (view == null) {
            return false;
        }
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                childAt = null;
                break;
            }
            childAt = getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt != null) {
                break;
            }
        }
        return view == childAt || (this.g && view == this.d);
    }
}
