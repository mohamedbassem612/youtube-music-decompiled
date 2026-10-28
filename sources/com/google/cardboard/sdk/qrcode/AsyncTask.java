package com.google.cardboard.sdk.qrcode;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AsyncTask {
    private final ExecutorService executor = Executors.newSingleThreadExecutor();
    private final Handler handler = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$0(Object obj) {
        final Object objDoInBackground = doInBackground(obj);
        this.handler.post(new Runnable() { // from class: com.google.cardboard.sdk.qrcode.AsyncTask$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$execute$1(objDoInBackground);
            }
        });
    }

    protected abstract Object doInBackground(Object obj);

    public void execute(final Object obj) {
        this.executor.execute(new Runnable() { // from class: com.google.cardboard.sdk.qrcode.AsyncTask$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$execute$0(obj);
            }
        });
        this.executor.shutdown();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: onPostExecute, reason: merged with bridge method [inline-methods] */
    public abstract void lambda$execute$1(Object obj);
}
