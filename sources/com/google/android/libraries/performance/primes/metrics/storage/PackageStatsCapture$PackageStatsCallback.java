package com.google.android.libraries.performance.primes.metrics.storage;

import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageStats;
import defpackage.agrc;
import defpackage.qcq;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class PackageStatsCapture$PackageStatsCallback extends IPackageStatsObserver.Stub {
    private final Semaphore a = new Semaphore(1);
    private volatile PackageStats b;

    private PackageStatsCapture$PackageStatsCallback() {
    }

    public void onGetStatsCompleted(PackageStats packageStats, boolean z) {
        if (z) {
            this.b = packageStats;
        } else {
            ((agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsCallback", "onGetStatsCompleted", 53, "PackageStatsCapture.java")).t("Failure getting PackageStats");
        }
        this.a.release();
    }
}
