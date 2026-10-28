package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.NetworkQualityThroughputListener;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axov extends NetworkQualityThroughputListener {
    private final NetworkQualityThroughputListener a;

    public axov(NetworkQualityThroughputListener networkQualityThroughputListener) {
        super(networkQualityThroughputListener.getExecutor());
        this.a = networkQualityThroughputListener;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof axov)) {
            return false;
        }
        return this.a.equals(((axov) obj).a);
    }

    @Override // org.chromium.net.NetworkQualityThroughputListener
    public final Executor getExecutor() {
        return this.a.getExecutor();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // org.chromium.net.NetworkQualityThroughputListener
    public final void onThroughputObservation(int i, long j, int i2) {
        this.a.onThroughputObservation(i, j, i2);
    }
}
