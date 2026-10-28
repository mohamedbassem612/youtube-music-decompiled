package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dw implements bny, dow, bpp {
    public boh a = null;
    public dov b = null;
    private final cc c;
    private final bpo d;
    private final Runnable e;
    private bpl f;

    public dw(cc ccVar, bpo bpoVar, Runnable runnable) {
        this.c = ccVar;
        this.d = bpoVar;
        this.e = runnable;
    }

    final void a(boa boaVar) {
        this.a.e(boaVar);
    }

    final void b() {
        if (this.a == null) {
            this.a = new boh(this);
            dov dovVarH = api.h(this);
            this.b = dovVarH;
            dovVarH.b();
            this.e.run();
        }
    }

    @Override // defpackage.bny
    public final bpt getDefaultViewModelCreationExtras() {
        Application application;
        cc ccVar = this.c;
        Context applicationContext = ccVar.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        bpv bpvVar = new bpv((byte[]) null);
        if (application != null) {
            bpvVar.b(bpk.b, application);
        }
        bpvVar.b(bpd.a, ccVar);
        bpvVar.b(bpd.b, this);
        if (ccVar.getArguments() != null) {
            bpvVar.b(bpd.c, ccVar.getArguments());
        }
        return bpvVar;
    }

    @Override // defpackage.bny
    public final bpl getDefaultViewModelProviderFactory() {
        Application application;
        cc ccVar = this.c;
        bpl defaultViewModelProviderFactory = ccVar.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(ccVar.mDefaultFactory)) {
            this.f = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f == null) {
            Context applicationContext = ccVar.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f = new bpe(application, ccVar, ccVar.getArguments());
        }
        return this.f;
    }

    @Override // defpackage.bog
    public final boc getLifecycle() {
        b();
        return this.a;
    }

    @Override // defpackage.dow
    public final dou getSavedStateRegistry() {
        b();
        return this.b.a();
    }

    @Override // defpackage.bpp
    public final bpo getViewModelStore() {
        b();
        return this.d;
    }
}
