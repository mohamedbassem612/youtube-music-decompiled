package defpackage;

import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afpa implements aupi, bog, bpp, dow, bny, qw {
    public final cf a;

    public afpa(cf cfVar) {
        this.a = cfVar;
    }

    public final dd a() {
        return this.a.getSupportFragmentManager();
    }

    @Override // defpackage.aupi
    public final auph componentManager() {
        LayoutInflater.Factory factory = this.a;
        if (factory instanceof aupi) {
            return ((aupi) factory).componentManager();
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        LayoutInflater.Factory factory = this.a;
        if (factory instanceof aupi) {
            return ((aupi) factory).generatedComponent();
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.bny
    public final bpt getDefaultViewModelCreationExtras() {
        return this.a.getDefaultViewModelCreationExtras();
    }

    @Override // defpackage.bny
    public final bpl getDefaultViewModelProviderFactory() {
        return this.a.getDefaultViewModelProviderFactory();
    }

    @Override // defpackage.bog
    public final boc getLifecycle() {
        return this.a.getLifecycle();
    }

    @Override // defpackage.qw
    public final qv getOnBackPressedDispatcher() {
        return this.a.getOnBackPressedDispatcher();
    }

    @Override // defpackage.dow
    public final dou getSavedStateRegistry() {
        return this.a.getSavedStateRegistry();
    }

    @Override // defpackage.bpp
    public final bpo getViewModelStore() {
        return this.a.getViewModelStore();
    }
}
