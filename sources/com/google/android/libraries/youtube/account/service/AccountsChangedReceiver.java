package com.google.android.libraries.youtube.account.service;

import android.app.job.JobWorkItem;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import defpackage.agrc;
import defpackage.agrf;
import defpackage.atl;
import defpackage.atm;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class AccountsChangedReceiver extends BroadcastReceiver {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/account/service/AccountsChangedReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/account/service/AccountsChangedReceiver", "onReceive", 25, "AccountsChangedReceiver.java")).t("AccountsChangedReceiver: null intent received. Ignoring.");
            return;
        }
        int i = AccountsChangedJobIntentService.g;
        ComponentName componentName = new ComponentName(context, (Class<?>) AccountsChangedJobIntentService.class);
        synchronized (atm.a) {
            HashMap map = atm.b;
            atl atlVar = (atl) map.get(componentName);
            if (atlVar == null) {
                atlVar = new atl(context, componentName);
                map.put(componentName, atlVar);
            }
            atlVar.a();
            JobWorkItem jobWorkItem = new JobWorkItem(intent);
            atlVar.e.enqueue(atlVar.d, jobWorkItem);
        }
    }
}
