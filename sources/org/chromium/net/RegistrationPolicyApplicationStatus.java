package org.chromium.net;

import android.app.Activity;
import defpackage.axjc;
import defpackage.axjj;
import org.chromium.base.ApplicationStatus;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class RegistrationPolicyApplicationStatus extends NetworkChangeNotifierAutoDetect.RegistrationPolicy implements axjc {
    private boolean mDestroyed;

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.RegistrationPolicy
    protected void destroy() {
        if (this.mDestroyed) {
            return;
        }
        axjj axjjVar = ApplicationStatus.c;
        if (axjjVar != null) {
            axjjVar.c(this);
        }
        axjj axjjVar2 = ApplicationStatus.d;
        if (axjjVar2 != null) {
            axjjVar2.c(this);
        }
        this.mDestroyed = true;
    }

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.RegistrationPolicy
    protected void init(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        super.init(networkChangeNotifierAutoDetect);
        ApplicationStatus.a(this);
        if (ApplicationStatus.d == null) {
            ApplicationStatus.d = new axjj();
        }
        ApplicationStatus.d.d(this);
        onApplicationStateChange(0);
    }

    public void onApplicationStateChange(int i) {
        ApplicationStatus.getStateForApplication();
        unregister();
    }

    public void onWindowFocusChanged(Activity activity, boolean z) {
        if (z && isRegistrationFailed()) {
            register();
        }
    }
}
