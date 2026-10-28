package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import internal.J.N;
import org.chromium.net.X509Util;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class axky extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.security.action.TRUST_STORE_CHANGED".equals(intent.getAction())) {
            X509Util.sCertVerifier.b();
            N.M6C2IQIc();
        } else if ("android.security.action.KEYCHAIN_CHANGED".equals(intent.getAction())) {
            N.MJdorYDE();
        } else {
            if (!"android.security.action.KEY_ACCESS_CHANGED".equals(intent.getAction()) || intent.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false)) {
                return;
            }
            N.MJdorYDE();
        }
    }
}
