package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.ProxyOptions;
import org.chromium.net.impl.CronetUrlRequestContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class axok extends axmy {
    public static final axnh q;
    private static final AtomicLong r = new AtomicLong(0);

    static {
        q = !ExperimentalCronetEngine.class.getClassLoader().equals(axmy.class.getClassLoader()) ? axnh.CRONET_SOURCE_PLAY_SERVICES : axnh.CRONET_SOURCE_STATICALLY_LINKED;
    }

    public axok(Context context) {
        super(context, q);
    }

    @Override // defpackage.axmy, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        super.d(str, set, z, date);
        return this;
    }

    @Override // defpackage.axmy, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        super.e(str, i, i2);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ExperimentalCronetEngine build() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.g == null) {
            this.g = getDefaultUserAgent();
        }
        return new CronetUrlRequestContext(this, jUptimeMillis);
    }

    @Override // defpackage.axmy, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder enableBrotli(boolean z) {
        this.k = z;
        return this;
    }

    @Override // defpackage.axmy, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder enableHttp2(boolean z) {
        this.j = z;
        return this;
    }

    @Override // defpackage.axmy, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enableHttpCache(int i, long j) {
        super.f(i, j);
        return this;
    }

    @Override // defpackage.axmy, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        this.o = z;
        return this;
    }

    @Override // defpackage.axmy, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.f = z;
        return this;
    }

    @Override // defpackage.axmy, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder enableQuic(boolean z) {
        this.i = z;
        return this;
    }

    @Override // defpackage.axmy, org.chromium.net.ICronetEngineBuilder
    protected final long getLogCronetInitializationRef() {
        AtomicLong atomicLong = r;
        atomicLong.compareAndSet(0L, this.b.a());
        return atomicLong.get();
    }

    @Override // defpackage.axmy, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder setExperimentalOptions(String str) {
        this.n = str;
        return this;
    }

    @Override // defpackage.axmy, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setProxyOptionsV2(ProxyOptions proxyOptions) {
        super.g(proxyOptions);
        return this;
    }

    @Override // defpackage.axmy, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setStoragePath(String str) {
        super.h(str);
        return this;
    }

    @Override // defpackage.axmy, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder setUserAgent(String str) {
        this.g = str;
        return this;
    }

    @Override // defpackage.axmy, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    @Override // defpackage.axmy, org.chromium.net.ICronetEngineBuilder
    @Deprecated
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        return this;
    }

    @Override // defpackage.axmy, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setThreadPriority(int i) {
        return this;
    }
}
