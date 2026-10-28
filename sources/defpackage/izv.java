package defpackage;

import android.R;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.EditText;
import com.google.android.apps.youtube.music.ui.preference.CustomEditTextPreference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class izv extends dkd {
    @Override // defpackage.dkd, defpackage.dkr
    public final void i(View view) {
        super.i(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        AppCompatEditText appCompatEditText = ((CustomEditTextPreference) n()).h;
        editText.setHint(appCompatEditText.getHint());
        editText.setInputType(appCompatEditText.getInputType());
        editText.setKeyListener(appCompatEditText.getKeyListener());
    }
}
