package com.google.android.apps.youtube.music.ui.preference;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.atqp;
import defpackage.atqq;
import defpackage.auom;
import defpackage.aupa;
import defpackage.aupi;
import defpackage.bpl;
import defpackage.gjz;
import defpackage.ttm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
abstract class Hilt_PreferenceCompatActivity_PreferenceScreenFragmentCompat extends CustomPreferenceFragmentCompat implements aupi {
    private ContextWrapper componentContext;
    private volatile auom componentManager;
    private boolean disableGetContextFix = false;
    private final Object componentManagerLock = new Object();
    private boolean injected = false;

    private void initializeComponentContext() {
        if (this.componentContext == null) {
            this.componentContext = new aupa(super.getContext(), this);
            this.disableGetContextFix = atqp.d(super.getContext());
        }
    }

    @Override // defpackage.aupi
    public final auom componentManager() {
        if (this.componentManager == null) {
            synchronized (this.componentManagerLock) {
                if (this.componentManager == null) {
                    this.componentManager = createComponentManager();
                }
            }
        }
        return this.componentManager;
    }

    protected auom createComponentManager() {
        return new auom(this);
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
        return atqp.c(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        Object objGeneratedComponent = generatedComponent();
        PreferenceCompatActivity$PreferenceScreenFragmentCompat preferenceCompatActivity$PreferenceScreenFragmentCompat = (PreferenceCompatActivity$PreferenceScreenFragmentCompat) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        preferenceCompatActivity$PreferenceScreenFragmentCompat.protoDataStorePreferenceFieldMap = gjzVar.o();
        preferenceCompatActivity$PreferenceScreenFragmentCompat.errorHelper = (ttm) gjzVar.b.cJ.io();
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
        componentManager().e();
        inject();
    }

    @Override // defpackage.cc
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new aupa(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.cc
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        componentManager().e();
        inject();
    }
}
