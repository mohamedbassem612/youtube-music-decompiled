package org.chromium.net;

import android.net.TrafficStats;
import android.os.Process;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class AndroidTrafficStats {
    private AndroidTrafficStats() {
    }

    private static long getCurrentUidRxBytes() {
        long uidRxBytes = TrafficStats.getUidRxBytes(Process.myUid());
        if (uidRxBytes == -1) {
            return 0L;
        }
        return uidRxBytes;
    }

    private static long getCurrentUidTxBytes() {
        long uidTxBytes = TrafficStats.getUidTxBytes(Process.myUid());
        if (uidTxBytes == -1) {
            return 0L;
        }
        return uidTxBytes;
    }

    private static long getTotalRxBytes() {
        long totalRxBytes = TrafficStats.getTotalRxBytes();
        if (totalRxBytes == -1) {
            return 0L;
        }
        return totalRxBytes;
    }

    private static long getTotalTxBytes() {
        long totalTxBytes = TrafficStats.getTotalTxBytes();
        if (totalTxBytes == -1) {
            return 0L;
        }
        return totalTxBytes;
    }
}
