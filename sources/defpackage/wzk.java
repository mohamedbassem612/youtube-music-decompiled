package defpackage;

import android.content.Context;
import android.content.res.Configuration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class wzk extends cc {
    private final awmi a = new awmp(new pbm(this, 12));

    public final void c() {
        cc parentFragment = getParentFragment();
        bp bpVar = parentFragment instanceof bp ? (bp) parentFragment : null;
        if (bpVar != null) {
            bpVar.iN();
        }
    }

    @Override // defpackage.cc
    public void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
    }

    @Override // defpackage.cc, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        if (((Boolean) this.a.a()).booleanValue() || (getParentFragment() instanceof wzp)) {
            return;
        }
        c();
    }
}
