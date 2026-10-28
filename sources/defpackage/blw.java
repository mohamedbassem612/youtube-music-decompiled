package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class blw extends InputConnectionWrapper {
    private final TextView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blw(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        int i = 0;
        this.a = textView;
        bll bllVarB = bll.b();
        if (!bllVarB.d() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        bli bliVar = bllVarB.e;
        Bundle bundle = editorInfo.extras;
        dqp dqpVar = (dqp) bliVar.c.a;
        int iA = dqpVar.a(4);
        if (iA != 0) {
            i = ((ByteBuffer) dqpVar.c).getInt(iA + dqpVar.a);
        }
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", bliVar.a.f);
    }

    private final Editable a() {
        return this.a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        return eqf.f(this, a(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return eqf.f(this, a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
