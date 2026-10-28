package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import defpackage.ahbz;
import defpackage.aheo;
import defpackage.aher;
import defpackage.ahng;
import defpackage.mef;
import defpackage.ols;
import defpackage.one;
import defpackage.onn;
import defpackage.plj;
import defpackage.qkh;
import defpackage.qmp;
import defpackage.qoh;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class AccountRemovedBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.accounts.action.ACCOUNT_REMOVED".equals(intent.getAction())) {
            try {
                String stringExtra = intent.getStringExtra("accountType");
                if (stringExtra != null) {
                    if ("com.google".equals(stringExtra) || "com.google.work".equals(stringExtra) || "cn.google".equals(stringExtra) || "__logged_out_type".equals(stringExtra)) {
                        Bundle extras = intent.getExtras();
                        String string = extras != null ? extras.getString("authAccount") : null;
                        if (string != null && (string.contains("..") || string.contains("/") || string.contains("\\") || string.equals("."))) {
                            Log.w("AccountRemovedRecv", "Got an invalid account name for P/H. Exiting.");
                            return;
                        }
                        qkh.d();
                        if (!mef.i(context)) {
                            Log.w("AccountRemovedRecv", "Device is locked, ignoring account removal broadcast.");
                            return;
                        }
                        qkh qkhVarA = qkh.a(context);
                        if (qkhVarA == null) {
                            Log.w("AccountRemovedRecv", "Did not set PhenotypeContext before Account Removed Broadcast. Exiting.");
                            return;
                        }
                        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
                        ListenableFuture[] listenableFutureArr = new ListenableFuture[2];
                        listenableFutureArr[0] = ahbz.e(string != null ? aheo.p(qmp.b(qkhVarA).a(new onn(string, 4), qkhVarA.b())).r(new ols(qkhVarA, string, 14, null), qkhVarA.b()) : aher.a, IOException.class, new one(11), MoreExecutors.directExecutor());
                        listenableFutureArr[1] = string != null ? qkhVarA.b().submit(new plj(context, string, 8)) : aher.a;
                        ahng.h(listenableFutureArr).a(new qoh(pendingResultGoAsync, 1), MoreExecutors.directExecutor());
                    }
                }
            } catch (ClassCastException e) {
                Log.w("AccountRemovedRecv", "Invalid broadcast received: ", e);
            }
        }
    }
}
