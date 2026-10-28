package com.google.android.apps.youtube.music.settings.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.music.R;
import defpackage.bpl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class AdvancedPrefsFragmentCompat extends Hilt_AdvancedPrefsFragmentCompat {
    @Override // com.google.android.apps.youtube.music.settings.fragment.Hilt_AdvancedPrefsFragmentCompat, defpackage.cc
    public /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    @Override // com.google.android.apps.youtube.music.settings.fragment.Hilt_AdvancedPrefsFragmentCompat, defpackage.cc, defpackage.bny
    public /* bridge */ /* synthetic */ bpl getDefaultViewModelProviderFactory() {
        return super.getDefaultViewModelProviderFactory();
    }

    @Override // com.google.android.apps.youtube.music.settings.fragment.Hilt_AdvancedPrefsFragmentCompat, defpackage.cc
    public /* bridge */ /* synthetic */ void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override // defpackage.dky
    public void onCreatePreferences(Bundle bundle, String str) {
        getPreferenceManager().f("youtube");
        setPreferencesFromResource(R.xml.advanced_prefs_compat, str);
    }

    @Override // com.google.android.apps.youtube.music.settings.fragment.Hilt_AdvancedPrefsFragmentCompat, defpackage.cc
    public /* bridge */ /* synthetic */ LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return super.onGetLayoutInflater(bundle);
    }

    @Override // com.google.android.apps.youtube.music.settings.fragment.Hilt_AdvancedPrefsFragmentCompat, defpackage.cc
    public /* bridge */ /* synthetic */ void onAttach(Context context) {
        super.onAttach(context);
    }
}
