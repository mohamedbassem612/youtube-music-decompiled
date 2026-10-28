package com.google.android.apps.youtube.music.ui.preference;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.preference.PreferenceScreen;
import defpackage.bpl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class PreferenceCompatActivity$PreferenceScreenFragmentCompat extends Hilt_PreferenceCompatActivity_PreferenceScreenFragmentCompat {
    private PreferenceScreen preferenceScreen;

    public static PreferenceCompatActivity$PreferenceScreenFragmentCompat newInstance(PreferenceScreen preferenceScreen) {
        PreferenceCompatActivity$PreferenceScreenFragmentCompat preferenceCompatActivity$PreferenceScreenFragmentCompat = new PreferenceCompatActivity$PreferenceScreenFragmentCompat();
        preferenceCompatActivity$PreferenceScreenFragmentCompat.preferenceScreen = preferenceScreen;
        return preferenceCompatActivity$PreferenceScreenFragmentCompat;
    }

    @Override // com.google.android.apps.youtube.music.ui.preference.Hilt_PreferenceCompatActivity_PreferenceScreenFragmentCompat, defpackage.cc
    public /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    @Override // com.google.android.apps.youtube.music.ui.preference.Hilt_PreferenceCompatActivity_PreferenceScreenFragmentCompat, defpackage.cc, defpackage.bny
    public /* bridge */ /* synthetic */ bpl getDefaultViewModelProviderFactory() {
        return super.getDefaultViewModelProviderFactory();
    }

    @Override // com.google.android.apps.youtube.music.ui.preference.Hilt_PreferenceCompatActivity_PreferenceScreenFragmentCompat, defpackage.cc
    public /* bridge */ /* synthetic */ void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override // defpackage.dky
    public void onCreatePreferences(Bundle bundle, String str) {
        setPreferenceScreen(this.preferenceScreen);
    }

    @Override // com.google.android.apps.youtube.music.ui.preference.Hilt_PreferenceCompatActivity_PreferenceScreenFragmentCompat, defpackage.cc
    public /* bridge */ /* synthetic */ LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return super.onGetLayoutInflater(bundle);
    }

    @Override // com.google.android.apps.youtube.music.ui.preference.Hilt_PreferenceCompatActivity_PreferenceScreenFragmentCompat, defpackage.cc
    public /* bridge */ /* synthetic */ void onAttach(Context context) {
        super.onAttach(context);
    }
}
