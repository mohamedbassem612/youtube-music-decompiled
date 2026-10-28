package androidx.emoji.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.inputmethodservice.ExtractEditText;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.car.app.model.Alert;
import defpackage.azs;
import defpackage.azw;
import defpackage.blh;
import defpackage.bma;
import defpackage.eol;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class EmojiExtractEditText extends ExtractEditText {
    private boolean a;
    private eol b;

    public EmojiExtractEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet, R.attr.editTextStyle, 0);
    }

    private final void a(AttributeSet attributeSet, int i, int i2) {
        if (this.a) {
            return;
        }
        this.a = true;
        int integer = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, blh.a, i, i2);
            integer = typedArrayObtainStyledAttributes.getInteger(0, Alert.DURATION_SHOW_INDEFINITELY);
            typedArrayObtainStyledAttributes.recycle();
        }
        eol eolVarB = b();
        azs.k(integer, "maxEmojiCount should be greater than 0");
        ((bma) eolVarB.b).a = integer;
        setKeyListener(super.getKeyListener());
    }

    private final eol b() {
        eol eolVar = this.b;
        if (eolVar != null) {
            return eolVar;
        }
        eol eolVar2 = new eol((EditText) this, (byte[]) null);
        this.b = eolVar2;
        return eolVar2;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return b().k(super.onCreateInputConnection(editorInfo), editorInfo);
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(azw.h(this, callback));
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        if (keyListener != null) {
            b();
            keyListener = eol.l(keyListener);
        }
        super.setKeyListener(keyListener);
    }

    public EmojiExtractEditText(Context context) {
        super(context);
        a(null, 0, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet, i, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(attributeSet, i, i2);
    }
}
