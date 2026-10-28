package defpackage;

import android.os.Bundle;
import androidx.preference.ListPreference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dki extends dkr {
    int k;
    private CharSequence[] l;
    private CharSequence[] m;

    private final ListPreference o() {
        return (ListPreference) n();
    }

    @Override // defpackage.dkr
    protected final void gF(fu fuVar) {
        CharSequence[] charSequenceArr = this.l;
        int i = this.k;
        dkh dkhVar = new dkh(this, 0);
        fq fqVar = fuVar.a;
        fqVar.n = charSequenceArr;
        fqVar.p = dkhVar;
        fqVar.v = i;
        fqVar.u = true;
        fuVar.h(null, null);
    }

    @Override // defpackage.dkr
    public final void j(boolean z) {
        int i;
        if (!z || (i = this.k) < 0) {
            return;
        }
        String string = this.m[i].toString();
        ListPreference listPreferenceO = o();
        if (listPreferenceO.U(string)) {
            listPreferenceO.o(string);
        }
    }

    @Override // defpackage.dkr, defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle != null) {
            this.k = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.l = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.m = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreferenceO = o();
        if (listPreferenceO.g == null || listPreferenceO.h == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.k = listPreferenceO.k(listPreferenceO.i);
        this.l = listPreferenceO.g;
        this.m = listPreferenceO.h;
    }

    @Override // defpackage.dkr, defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        super.m668x22bc4f96(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.k);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.l);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.m);
    }
}
