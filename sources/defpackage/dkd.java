package defpackage;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class dkd extends dkr {
    private EditText k;
    private CharSequence l;
    private final Runnable m = new cqc(this, 17, null);
    private long n = -1;

    private final EditTextPreference o() {
        return (EditTextPreference) n();
    }

    private final void p(boolean z) {
        this.n = z ? SystemClock.currentThreadTimeMillis() : -1L;
    }

    @Override // defpackage.dkr
    protected void i(View view) {
        super.i(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.k = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.k.setText(this.l);
        EditText editText2 = this.k;
        editText2.setSelection(editText2.getText().length());
        o();
    }

    @Override // defpackage.dkr
    public final void j(boolean z) {
        if (z) {
            String string = this.k.getText().toString();
            EditTextPreference editTextPreferenceO = o();
            if (editTextPreferenceO.U(string)) {
                editTextPreferenceO.i(string);
            }
        }
    }

    @Override // defpackage.dkr
    protected final void k() {
        p(true);
        l();
    }

    public final void l() {
        long j = this.n;
        if (j == -1 || j + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.k;
        if (editText == null || !editText.isFocused()) {
            p(false);
            return;
        }
        if (((InputMethodManager) this.k.getContext().getSystemService("input_method")).showSoftInput(this.k, 0)) {
            p(false);
            return;
        }
        EditText editText2 = this.k;
        Runnable runnable = this.m;
        editText2.removeCallbacks(runnable);
        this.k.postDelayed(runnable, 50L);
    }

    @Override // defpackage.dkr
    protected final boolean m() {
        return true;
    }

    @Override // defpackage.dkr, defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle == null) {
            this.l = o().g;
        } else {
            this.l = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // defpackage.dkr, defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        super.m668x22bc4f96(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.l);
    }
}
