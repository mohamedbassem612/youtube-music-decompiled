package defpackage;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bco {
    @Deprecated
    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, bcn bcnVar) {
        a.aP(inputConnection, "inputConnection must be non-null");
        a.aP(editorInfo, "editorInfo must be non-null");
        return new bcm(inputConnection, bcnVar);
    }

    public static void b(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static boolean c(CharSequence charSequence, int i, int i2) {
        return i2 != 0 ? Character.isHighSurrogate(charSequence.charAt(i)) : Character.isLowSurrogate(charSequence.charAt(i));
    }
}
