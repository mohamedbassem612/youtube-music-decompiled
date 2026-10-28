package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ki extends CheckedTextView {
    private final kf a;
    private final le b;
    private pj c;
    private final adhg d;

    public ki(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        ox.d(this, getContext());
        le leVar = new le(this);
        this.b = leVar;
        leVar.h(attributeSet, R.attr.checkedTextViewStyle);
        leVar.e();
        kf kfVar = new kf(this);
        this.a = kfVar;
        kfVar.b(attributeSet, R.attr.checkedTextViewStyle);
        adhg adhgVar = new adhg((CheckedTextView) this);
        this.d = adhgVar;
        adhgVar.d(attributeSet);
        a().i(attributeSet, R.attr.checkedTextViewStyle);
    }

    private final pj a() {
        pj pjVar = this.c;
        if (pjVar != null) {
            return pjVar;
        }
        pj pjVar2 = new pj(this);
        this.c = pjVar2;
        return pjVar2;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        le leVar = this.b;
        if (leVar != null) {
            leVar.e();
        }
        kf kfVar = this.a;
        if (kfVar != null) {
            kfVar.a();
        }
        adhg adhgVar = this.d;
        if (adhgVar != null) {
            adhgVar.c();
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
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a();
        bme bmeVar = bme.b;
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

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        adhg adhgVar = this.d;
        if (adhgVar != null) {
            if (adhgVar.a) {
                adhgVar.a = false;
            } else {
                adhgVar.a = true;
                adhgVar.c();
            }
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
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        le leVar = this.b;
        if (leVar != null) {
            leVar.i(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(dl.d(getContext(), i));
    }
}
