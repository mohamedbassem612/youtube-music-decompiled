package android.support.v7.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.google.android.apps.youtube.music.R;
import defpackage.a;
import defpackage.aco;
import defpackage.axz;
import defpackage.aya;
import defpackage.ayb;
import defpackage.ayf;
import defpackage.ayy;
import defpackage.azw;
import defpackage.bac;
import defpackage.bco;
import defpackage.dwv;
import defpackage.eol;
import defpackage.fub;
import defpackage.kf;
import defpackage.kz;
import defpackage.ld;
import defpackage.le;
import defpackage.nj;
import defpackage.ox;
import defpackage.qcb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends EditText implements ayy {
    private final kf a;
    private final le b;
    private final kz c;
    private ld d;
    private final eol e;
    private qcb f;

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ox.d(this, getContext());
        kf kfVar = new kf(this);
        this.a = kfVar;
        kfVar.b(attributeSet, i);
        le leVar = new le(this);
        this.b = leVar;
        leVar.h(attributeSet, i);
        leVar.e();
        this.c = new kz(this);
        eol eolVar = new eol((EditText) this, (char[]) null);
        this.e = eolVar;
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

    private final qcb d() {
        qcb qcbVar = this.f;
        if (qcbVar != null) {
            return qcbVar;
        }
        qcb qcbVar2 = new qcb(this);
        this.f = qcbVar2;
        return qcbVar2;
    }

    final ld a() {
        ld ldVar = this.d;
        if (ldVar != null) {
            return ldVar;
        }
        ld ldVar2 = new ld(this, new dwv(this, 1));
        this.d = ldVar2;
        return ldVar2;
    }

    @Override // defpackage.ayy
    public final ayf b(ayf ayfVar) {
        return aco.g(this, ayfVar);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        kf kfVar = this.a;
        if (kfVar != null) {
            kfVar.a();
        }
        le leVar = this.b;
        if (leVar != null) {
            leVar.e();
        }
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return azw.g(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public final String getFontVariationSettings() {
        return a().b;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        kz kzVar;
        return (Build.VERSION.SDK_INT >= 28 || (kzVar = this.c) == null) ? super.getTextClassifier() : kzVar.a();
    }

    @Override // android.widget.TextView
    public final Typeface getTypeface() {
        return a().a;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrW;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        le.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        nj.b(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (strArrW = bac.w(this)) != null) {
            editorInfo.contentMimeTypes = strArrW;
            inputConnectionOnCreateInputConnection = bco.a(inputConnectionOnCreateInputConnection, editorInfo, new fub(this, 1));
        }
        return this.e.C(inputConnectionOnCreateInputConnection);
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 30 || Build.VERSION.SDK_INT >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && bac.w(this) != null) {
            Activity activityT = a.t(this);
            if (activityT == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                activityT.requestDragAndDropPermissions(dragEvent);
                int offsetForPosition = getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                beginBatchEdit();
                try {
                    Selection.setSelection((Spannable) getText(), offsetForPosition);
                    ClipData clipData = dragEvent.getClipData();
                    bac.d(this, (Build.VERSION.SDK_INT >= 31 ? new axz(clipData, 3) : new ayb(clipData, 3)).a());
                    return true;
                } finally {
                    endBatchEdit();
                }
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (Build.VERSION.SDK_INT < 31 && bac.w(this) != null) {
            if (i != 16908322) {
                if (i == 16908337) {
                    i = 16908337;
                }
            }
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip == null || primaryClip.getItemCount() <= 0) {
                return true;
            }
            aya axzVar = Build.VERSION.SDK_INT >= 31 ? new axz(primaryClip, 1) : new ayb(primaryClip, 1);
            axzVar.c(i == 16908322 ? 0 : 1);
            bac.d(this, axzVar.a());
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        kf kfVar = this.a;
        if (kfVar != null) {
            kfVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        kf kfVar = this.a;
        if (kfVar != null) {
            kfVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        le leVar = this.b;
        if (leVar != null) {
            leVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        le leVar = this.b;
        if (leVar != null) {
            leVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(azw.h(this, callback));
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return a().b(str);
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(eol.B(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        le leVar = this.b;
        if (leVar != null) {
            leVar.i(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        kz kzVar;
        if (Build.VERSION.SDK_INT >= 28 || (kzVar = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            kzVar.a = textClassifier;
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface) {
        a().a(typeface);
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public AppCompatEditText(Context context) {
        this(context, null);
    }
}
