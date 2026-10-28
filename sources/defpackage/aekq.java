package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aekq implements aemq {
    public final List a;
    private final awgg b;

    public aekq(Context context, aduv aduvVar, adhv adhvVar, View view, View view2) {
        context.getClass();
        aduvVar.getClass();
        adhvVar.getClass();
        view.findViewById(R.id.select_message_shadow);
        this.b = new awgg(this, view2);
        this.a = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.aemq
    public final void kc(aepb aepbVar) {
        EditText editText = (EditText) this.b.b;
        Editable text = editText.getText();
        ?? r2 = aepbVar.e;
        if (TextUtils.equals(text, r2)) {
            return;
        }
        editText.setText((CharSequence) r2);
    }
}
