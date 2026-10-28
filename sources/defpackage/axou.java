package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.NetworkQualityRttListener;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axou extends NetworkQualityRttListener {
    private final NetworkQualityRttListener a;

    public axou(NetworkQualityRttListener networkQualityRttListener) {
        super(networkQualityRttListener.getExecutor());
        this.a = networkQualityRttListener;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof axou)) {
            return false;
        }
        return this.a.equals(((axou) obj).a);
    }

    @Override // org.chromium.net.NetworkQualityRttListener
    public final Executor getExecutor() {
        return this.a.getExecutor();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // org.chromium.net.NetworkQualityRttListener
    public final void onRttObservation(int i, long j, int i2) {
        this.a.onRttObservation(i, j, i2);
    }
}
