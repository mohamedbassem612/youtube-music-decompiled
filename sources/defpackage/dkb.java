package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.preference.ListPreference;
import androidx.preference.Preference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dkb implements AdapterView.OnItemSelectedListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public dkb(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        mb mbVar;
        if (this.$cid != 0) {
            if (i == -1 || (mbVar = ((mx) this.a).e) == null) {
                return;
            }
            mbVar.a = false;
            return;
        }
        if (i >= 0) {
            Object obj = this.a;
            ListPreference listPreference = (ListPreference) obj;
            String string = listPreference.h[i].toString();
            if (string.equals(listPreference.i) || !((Preference) obj).U(string)) {
                return;
            }
            listPreference.o(string);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
