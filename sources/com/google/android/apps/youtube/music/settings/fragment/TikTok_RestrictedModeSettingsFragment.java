package com.google.android.apps.youtube.music.settings.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.music.ui.preference.CustomPreferenceFragmentCompat;
import defpackage.aewp;
import defpackage.affd;
import defpackage.afpu;
import defpackage.afpz;
import defpackage.atqp;
import defpackage.atqq;
import defpackage.auom;
import defpackage.aupi;
import defpackage.bpl;
import defpackage.gjx;
import defpackage.ttm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
abstract class TikTok_RestrictedModeSettingsFragment extends CustomPreferenceFragmentCompat implements aupi {
    private ContextWrapper componentContext;
    private volatile afpu componentManager;
    private boolean disableGetContextFix = false;
    private final Object componentManagerLock = new Object();
    private boolean injected = false;

    private void initializeComponentContext() {
        if (this.componentContext == null) {
            this.componentContext = new afpz(super.getContext(), this);
            this.disableGetContextFix = atqp.d(super.getContext());
        }
    }

    @Override // defpackage.aupi
    public final afpu componentManager() {
        if (this.componentManager == null) {
            synchronized (this.componentManagerLock) {
                if (this.componentManager == null) {
                    this.componentManager = createComponentManager();
                }
            }
        }
        return this.componentManager;
    }

    protected afpu createComponentManager() {
        return new afpu(this, false);
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // defpackage.cc
    public Context getContext() {
        if (super.getContext() == null && !this.disableGetContextFix) {
            return null;
        }
        initializeComponentContext();
        return this.componentContext;
    }

    @Override // defpackage.cc, defpackage.bny
    public bpl getDefaultViewModelProviderFactory() {
        return aewp.p(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        Object objGeneratedComponent = generatedComponent();
        RestrictedModeSettingsFragment restrictedModeSettingsFragment = (RestrictedModeSettingsFragment) this;
        gjx gjxVar = (gjx) objGeneratedComponent;
        restrictedModeSettingsFragment.protoDataStorePreferenceFieldMap = gjxVar.E();
        restrictedModeSettingsFragment.errorHelper = (ttm) gjxVar.a.cJ.io();
    }

    @Override // defpackage.cc
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.componentContext;
        boolean z = true;
        if (contextWrapper != null && auom.d(contextWrapper) != activity) {
            z = false;
        }
        atqq.c(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        componentManager().c();
        inject();
    }

    @Override // defpackage.cc
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new afpz(layoutInflaterOnGetLayoutInflater, this));
    }

    public final void setBundledAccountId(int i) {
        afpu.d(this, i);
    }

    public final void setBundledInvalidAccountId() {
        afpu.f(this);
    }

    public final void setBundledAccountId(affd affdVar) {
        afpu.e(this, affdVar);
    }

    @Override // defpackage.cc
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        componentManager().c();
        inject();
    }
}
