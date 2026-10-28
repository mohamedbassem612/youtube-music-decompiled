package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.apps.youtube.music.R;
import defpackage.aewp;
import defpackage.aeym;
import defpackage.afen;
import defpackage.afev;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class TextInputEditText extends AppCompatEditText {
    private final Rect a;
    private boolean b;

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(afev.a(context, attributeSet, i, 0), attributeSet, i);
        this.a = new Rect();
        TypedArray typedArrayA = aeym.a(context, attributeSet, afen.b, i, R.style.Widget_Design_TextInputEditText, new int[0]);
        this.b = typedArrayA.getBoolean(0, false);
        typedArrayA.recycle();
    }

    private final TextInputLayout d() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private final boolean e(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.b;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayoutD = d();
        if (!e(textInputLayoutD) || rect == null) {
            return;
        }
        Rect rect2 = this.a;
        textInputLayoutD.getFocusedRect(rect2);
        rect.bottom = rect2.bottom;
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayoutD = d();
        if (!e(textInputLayoutD)) {
            return super.getGlobalVisibleRect(rect, point);
        }
        boolean globalVisibleRect = textInputLayoutD.getGlobalVisibleRect(rect, point);
        if (!globalVisibleRect || point == null) {
            return globalVisibleRect;
        }
        point.offset(-getScrollX(), -getScrollY());
        return true;
    }

    @Override // android.widget.TextView
    public final CharSequence getHint() {
        TextInputLayout textInputLayoutD = d();
        return (textInputLayoutD == null || !textInputLayoutD.l) ? super.getHint() : textInputLayoutD.f();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutD = d();
        if (textInputLayoutD != null && textInputLayoutD.l && super.getHint() == null && aewp.b()) {
            setHint("");
        }
    }

    @Override // android.support.v7.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            TextInputLayout textInputLayoutD = d();
            editorInfo.hintText = textInputLayoutD != null ? textInputLayoutD.f() : null;
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        d();
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayoutD = d();
        if (!e(textInputLayoutD) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        int height = textInputLayoutD.getHeight() - getHeight();
        Rect rect2 = this.a;
        rect2.set(rect.left, rect.top, rect.right, rect.bottom + height);
        return super.requestRectangleOnScreen(rect2);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public TextInputEditText(Context context) {
        this(context, null);
    }
}
