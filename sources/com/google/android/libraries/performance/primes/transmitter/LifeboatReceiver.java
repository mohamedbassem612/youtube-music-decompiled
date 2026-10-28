package com.google.android.libraries.performance.primes.transmitter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import defpackage.ahng;
import defpackage.aiik;
import defpackage.qca;
import defpackage.qjn;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class LifeboatReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.hasExtra("MetricSnapshot") && intent.hasExtra("Transmitters")) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("MetricSnapshot");
            byteArrayExtra.getClass();
            try {
                BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
                String[] stringArrayExtra = intent.getStringArrayExtra("Transmitters");
                stringArrayExtra.getClass();
                ArrayList arrayList = new ArrayList(stringArrayExtra.length);
                for (String str : stringArrayExtra) {
                    try {
                        Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        arrayList.add(((qjn) declaredConstructor.newInstance(null)).a());
                    } catch (Throwable th) {
                        Log.e("PrimesLifeboatReceiver", String.format("Unable to transmit the crash using %s.", str), th);
                    }
                }
                ListenableFuture listenableFutureT = ahng.t(arrayList);
                pendingResultGoAsync.getClass();
                listenableFutureT.addListener(new qca(pendingResultGoAsync, 8), MoreExecutors.directExecutor());
            } catch (aiik e) {
                Log.e("PrimesLifeboatReceiver", "Unable to parse the payload of MetricSnapshot.", e);
            }
        }
    }
}
