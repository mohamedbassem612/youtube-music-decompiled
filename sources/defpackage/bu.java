package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bu extends ca {
    final /* synthetic */ cc a;

    public bu(cc ccVar) {
        this.a = ccVar;
    }

    @Override // defpackage.ca
    public final void a() {
        cc ccVar = this.a;
        ccVar.mSavedStateRegistryController.b();
        bpd.b(ccVar);
        Bundle bundle = ccVar.mSavedFragmentState;
        ccVar.mSavedStateRegistryController.c(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
