package defpackage;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dkl extends dkr {
    final Set k = new HashSet();
    boolean l;
    CharSequence[] m;
    CharSequence[] n;

    private final MultiSelectListPreference o() {
        return (MultiSelectListPreference) n();
    }

    @Override // defpackage.dkr
    protected final void gF(fu fuVar) {
        int length = this.n.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.k.contains(this.n[i].toString());
        }
        CharSequence[] charSequenceArr = this.m;
        dkk dkkVar = new dkk(this);
        fq fqVar = fuVar.a;
        fqVar.n = charSequenceArr;
        fqVar.w = dkkVar;
        fqVar.s = zArr;
        fqVar.t = true;
    }

    @Override // defpackage.dkr
    public final void j(boolean z) {
        if (z && this.l) {
            MultiSelectListPreference multiSelectListPreferenceO = o();
            Set set = this.k;
            if (multiSelectListPreferenceO.U(set)) {
                multiSelectListPreferenceO.k(set);
            }
        }
        this.l = false;
    }

    @Override // defpackage.dkr, defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        CharSequence[] charSequenceArr;
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle != null) {
            Set set = this.k;
            set.clear();
            set.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.l = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.m = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.n = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreferenceO = o();
        CharSequence[] charSequenceArr2 = multiSelectListPreferenceO.g;
        if (charSequenceArr2 == null || (charSequenceArr = multiSelectListPreferenceO.h) == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        Set set2 = this.k;
        set2.clear();
        set2.addAll(multiSelectListPreferenceO.i);
        this.l = false;
        this.m = charSequenceArr2;
        this.n = charSequenceArr;
    }

    @Override // defpackage.dkr, defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        super.m668x22bc4f96(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.k));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.l);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.m);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.n);
    }
}
