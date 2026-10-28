package com.google.android.apps.youtube.music.ui.preference;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStorePreferenceFragment;
import defpackage.azs;
import defpackage.bac;
import defpackage.bbn;
import defpackage.izv;
import defpackage.izw;
import defpackage.xbp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class CustomPreferenceFragmentCompat extends ProtoDataStorePreferenceFragment {
    private static final String DIALOG_FRAGMENT_TAG = "androidx.preference.PreferenceFragment.DIALOG";

    public static /* synthetic */ bbn lambda$onCreateView$0(View view, bbn bbnVar) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), bbnVar.f(2).e);
        return bbnVar;
    }

    @Override // defpackage.dky, defpackage.cc
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewFindViewById;
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (viewOnCreateView != null && (viewFindViewById = viewOnCreateView.findViewById(R.id.recycler_view)) != null) {
            xbp xbpVar = new xbp(1);
            int i = bac.a;
            azs.c(viewFindViewById, xbpVar);
        }
        return viewOnCreateView;
    }

    @Override // defpackage.dky, defpackage.dld
    public void onDisplayPreferenceDialog(Preference preference) {
        if (isAdded() && getParentFragmentManager().g(DIALOG_FRAGMENT_TAG) == null) {
            if (preference instanceof CustomProtoDataStoreEditTextPreference) {
                String str = preference.t;
                izw izwVar = new izw();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                izwVar.setArguments(bundle);
                izwVar.setTargetFragment(this, 0);
                izwVar.gT(getParentFragmentManager(), DIALOG_FRAGMENT_TAG);
                return;
            }
            if (!(preference instanceof CustomEditTextPreference)) {
                super.onDisplayPreferenceDialog(preference);
                return;
            }
            String str2 = preference.t;
            izv izvVar = new izv();
            Bundle bundle2 = new Bundle(1);
            bundle2.putString("key", str2);
            izvVar.setArguments(bundle2);
            izvVar.setTargetFragment(this, 0);
            izvVar.gT(getParentFragmentManager(), DIALOG_FRAGMENT_TAG);
        }
    }
}
