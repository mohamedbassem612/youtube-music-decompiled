package defpackage;

import android.os.Bundle;
import android.webkit.ValueCallback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vsh extends vsf {
    public ValueCallback a;
    public rc b;
    public vsi c;

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.b = registerForActivityResult(new rr(), new eon(this, 8));
    }
}
