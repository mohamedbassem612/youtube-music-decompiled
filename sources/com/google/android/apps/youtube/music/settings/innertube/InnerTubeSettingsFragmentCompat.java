package com.google.android.apps.youtube.music.settings.innertube;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.apqt;
import defpackage.aprv;
import defpackage.bpl;
import defpackage.iol;
import defpackage.ios;
import defpackage.iot;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class InnerTubeSettingsFragmentCompat extends Hilt_InnerTubeSettingsFragmentCompat implements ios {
    public iol musicInnerTubeSettingsFactory;
    private aprv settingCategoryId = aprv.SETTING_CAT_UNKNOWN;

    @Override // com.google.android.apps.youtube.music.settings.innertube.Hilt_InnerTubeSettingsFragmentCompat, defpackage.cc
    public /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    @Override // com.google.android.apps.youtube.music.settings.innertube.Hilt_InnerTubeSettingsFragmentCompat, defpackage.cc, defpackage.bny
    public /* bridge */ /* synthetic */ bpl getDefaultViewModelProviderFactory() {
        return super.getDefaultViewModelProviderFactory();
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onActivityCreated */
    public void m656lambda$performActivityCreated$8$androidsupportv4appFragment(Bundle bundle) {
        super.m656lambda$performActivityCreated$8$androidsupportv4appFragment(bundle);
        LayoutInflater.Factory activity = getActivity();
        Bundle arguments = getArguments();
        if (arguments != null) {
            aprv aprvVarA = aprv.a(arguments.getInt("extra_innertube_category_id", 0));
            if (aprvVarA != null) {
                this.settingCategoryId = aprvVarA;
            } else {
                this.settingCategoryId = aprv.SETTING_CAT_UNKNOWN;
            }
        }
        if (activity instanceof iot) {
            ((iot) activity).n(this);
        }
    }

    @Override // com.google.android.apps.youtube.music.settings.innertube.Hilt_InnerTubeSettingsFragmentCompat, defpackage.cc
    public /* bridge */ /* synthetic */ void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override // com.google.android.apps.youtube.music.settings.innertube.Hilt_InnerTubeSettingsFragmentCompat, defpackage.cc
    public /* bridge */ /* synthetic */ LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return super.onGetLayoutInflater(bundle);
    }

    @Override // defpackage.ios
    public void onSettingsLoaded() {
        iot iotVar;
        apqt apqtVarL;
        if (!isAdded() || (iotVar = (iot) getActivity()) == null || (apqtVarL = iotVar.l(this.settingCategoryId)) == null) {
            return;
        }
        this.musicInnerTubeSettingsFactory.a(this, apqtVarL.d);
    }

    @Override // com.google.android.apps.youtube.music.settings.innertube.Hilt_InnerTubeSettingsFragmentCompat, defpackage.cc
    public /* bridge */ /* synthetic */ void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override // defpackage.dky
    public void onCreatePreferences(Bundle bundle, String str) {
    }
}
