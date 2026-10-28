package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ke extends AutoCompleteTextView {
    private static final int[] a = {R.attr.popupBackground};
    private final kf b;
    private final le c;
    private final eol d;

    public ke(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ox.d(this, getContext());
        ahto ahtoVarL = ahto.L(getContext(), attributeSet, a, i, 0);
        if (ahtoVarL.H(0)) {
            setDropDownBackgroundDrawable(ahtoVarL.B(0));
        }
        ahtoVarL.F();
        kf kfVar = new kf(this);
        this.b = kfVar;
        kfVar.b(attributeSet, i);
        le leVar = new le(this);
        this.c = leVar;
        leVar.h(attributeSet, i);
        leVar.e();
        eol eolVar = new eol((EditText) this, (char[]) null);
        this.d = eolVar;
        eolVar.z(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (eol.A(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerB = eol.B(keyListener);
            if (keyListenerB != keyListener) {
                super.setKeyListener(keyListenerB);
                super.setRawInputType(inputType);
                super.setFocusable(zIsFocusable);
                super.setClickable(zIsClickable);
                super.setLongClickable(zIsLongClickable);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        kf kfVar = this.b;
        if (kfVar != null) {
            kfVar.a();
        }
        le leVar = this.c;
        if (leVar != null) {
            leVar.e();
        }
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return azw.g(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        nj.b(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.d.C(inputConnectionOnCreateInputConnection);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        kf kfVar = this.b;
        if (kfVar != null) {
            kfVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        kf kfVar = this.b;
        if (kfVar != null) {
            kfVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        le leVar = this.c;
        if (leVar != null) {
            leVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        le leVar = this.c;
        if (leVar != null) {
            leVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(azw.h(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(dl.d(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(eol.B(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        le leVar = this.c;
        if (leVar != null) {
            leVar.i(context, i);
        }
    }

    public ke(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.youtube.music.R.attr.autoCompleteTextViewStyle);
    }

    public ke(Context context) {
        this(context, null);
    }
}
