package defpackage;

import com.google.android.libraries.youtube.account.service.AccountsChangedJobIntentService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class rpd extends atm implements aupi {
    private volatile auoz e;
    private final Object f = new Object();
    private boolean g = false;

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final auoz componentManager() {
        if (this.e == null) {
            synchronized (this.f) {
                if (this.e == null) {
                    this.e = new auoz(this);
                }
            }
        }
        return this.e;
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // defpackage.atm, android.app.Service
    public final void onCreate() {
        if (!this.g) {
            this.g = true;
            AccountsChangedJobIntentService accountsChangedJobIntentService = (AccountsChangedJobIntentService) this;
            ght ghtVar = ((gkf) generatedComponent()).b;
            accountsChangedJobIntentService.e = aupm.b(ghtVar.a.aq);
            accountsChangedJobIntentService.f = (afvq) ghtVar.mK.io();
        }
        super.onCreate();
    }
}
