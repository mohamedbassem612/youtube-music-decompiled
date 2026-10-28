package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.apps.youtube.music.R;
import defpackage.dkb;
import defpackage.dlj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class DropDownPreference extends ListPreference {
    private final Context H;
    private final ArrayAdapter I;
    private Spinner J;
    private final AdapterView.OnItemSelectedListener K;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle, 0);
        this.K = new dkb(this, 0);
        this.H = context;
        this.I = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        ad();
    }

    private final void ad() {
        ArrayAdapter arrayAdapter = this.I;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = ((ListPreference) this).g;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void a(dlj dljVar) {
        Spinner spinner = (Spinner) dljVar.a.findViewById(R.id.spinner);
        this.J = spinner;
        spinner.setAdapter((SpinnerAdapter) this.I);
        this.J.setOnItemSelectedListener(this.K);
        Spinner spinner2 = this.J;
        String str = ((ListPreference) this).i;
        CharSequence[] charSequenceArr = ((ListPreference) this).h;
        int i = -1;
        if (str != null && charSequenceArr != null) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                    i = length;
                    break;
                }
            }
        }
        spinner2.setSelection(i);
        super.a(dljVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    protected final void c() {
        this.J.performClick();
    }

    @Override // androidx.preference.Preference
    public final void d() {
        super.d();
        ArrayAdapter arrayAdapter = this.I;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.ListPreference
    public final void e(CharSequence[] charSequenceArr) {
        ((ListPreference) this).g = charSequenceArr;
        ad();
    }
}
