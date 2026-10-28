package defpackage;

import android.R;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.EditText;
import com.google.android.apps.youtube.music.ui.preference.CustomProtoDataStoreEditTextPreference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class izw extends dkd {
    @Override // defpackage.dkd, defpackage.dkr
    public final void i(View view) {
        super.i(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        AppCompatEditText appCompatEditText = ((CustomProtoDataStoreEditTextPreference) n()).h;
        editText.setHint(appCompatEditText.getHint());
        editText.setHintTextColor(appCompatEditText.getCurrentHintTextColor());
        editText.setInputType(appCompatEditText.getInputType());
        editText.setKeyListener(appCompatEditText.getKeyListener());
    }
}
