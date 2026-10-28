package defpackage;

import android.accounts.AccountManagerCallback;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import org.chromium.net.HttpNegotiateAuthenticator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axki extends BroadcastReceiver {
    final /* synthetic */ Context a;
    final /* synthetic */ axkj b;

    public axki(axkj axkjVar, Context context) {
        this.a = context;
        this.b = axkjVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.unregisterReceiver(this);
        axkj axkjVar = this.b;
        HttpNegotiateAuthenticator httpNegotiateAuthenticator = axkjVar.b;
        axkk axkkVar = axkjVar.a;
        axkkVar.b.getAuthToken(axkkVar.e, axkkVar.d, axkkVar.c, true, (AccountManagerCallback<Bundle>) new axkj(httpNegotiateAuthenticator, axkkVar, 0), (Handler) null);
    }
}
