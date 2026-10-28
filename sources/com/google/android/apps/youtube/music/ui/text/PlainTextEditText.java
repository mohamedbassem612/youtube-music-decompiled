package com.google.android.apps.youtube.music.ui.text;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.Selection;
import android.util.AttributeSet;
import defpackage.ahng;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class PlainTextEditText extends AppCompatEditText {
    public PlainTextEditText(Context context) {
        super(context);
    }

    @Override // android.support.v7.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        if (i == 16908322) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getApplicationContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                return super.onTextContextMenuItem(R.id.paste);
            }
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            if (primaryClip != null) {
                StringBuilder sb = new StringBuilder();
                int i2 = 0;
                for (int i3 = 0; i3 < primaryClip.getItemCount(); i3++) {
                    sb.append(primaryClip.getItemAt(i3).coerceToText(getContext()));
                }
                Editable text = getText();
                if (text == null) {
                    return super.onTextContextMenuItem(R.id.paste);
                }
                int length = text.length();
                if (isFocused()) {
                    int selectionStart = getSelectionStart();
                    int selectionEnd = getSelectionEnd();
                    int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
                    length = ahng.O(0, selectionStart, selectionEnd);
                    i2 = iMax;
                }
                Selection.setSelection(text, length);
                text.replace(i2, length, sb.toString());
                return true;
            }
            i = 16908322;
        }
        return super.onTextContextMenuItem(i);
    }

    public PlainTextEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PlainTextEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
