package defpackage;

import android.content.Context;
import android.net.http.ConnectionMigrationOptions;
import android.net.http.DnsOptions;
import android.net.http.HttpEngine;
import android.net.http.QuicOptions;
import j$.time.Duration;
import j$.time.TimeConversions;
import j$.util.DateRetargetClass;
import j$.util.DesugarCollections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.chromium.net.AndroidNetworkLibrary;
import org.chromium.net.AndroidProxyOptions;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.ProxyOptions;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axlv extends ICronetEngineBuilder {
    private static boolean a;
    private boolean b;
    private final Context c;
    private final HttpEngine.Builder d;

    public axlv(Context context, HttpEngine.Builder builder) {
        this.c = context;
        this.d = builder;
    }

    private static int a(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            return i2 != 2 ? 0 : 2;
        }
        return 1;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        this.d.addPublicKeyPins(str, set, z, TimeConversions.convert(DateRetargetClass.toInstant(date)));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        this.d.addQuicHint(str, i, i2);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ExperimentalCronetEngine build() {
        if (!this.b) {
            setUserAgent(getDefaultUserAgent());
        }
        return new axlw(this.d.build());
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableBrotli(boolean z) {
        this.d.setEnableBrotli(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttp2(boolean z) {
        this.d.setEnableHttp2(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttpCache(int i, long j) {
        this.d.setEnableHttpCache(i, j);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        if (!a) {
            a = true;
        }
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.d.setEnablePublicKeyPinningBypassForLocalTrustAnchors(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableQuic(boolean z) {
        this.d.setEnableQuic(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final String getDefaultUserAgent() {
        return axos.a(this.c, axnh.CRONET_SOURCE_PLATFORM, HttpEngine.getVersionString());
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final Set getSupportedConfigOptions() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return DesugarCollections.unmodifiableSet(hashSet);
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setExperimentalOptions(String str) {
        axrw axrwVar = new axrw(str);
        ConnectionMigrationOptions.Builder builder = new ConnectionMigrationOptions.Builder();
        builder.setDefaultNetworkMigration(a(axrwVar.k()));
        builder.setPathDegradationMigration(a(AndroidNetworkLibrary.i((Boolean) axrwVar.f("QUIC", "allow_port_migration", null, Boolean.class))));
        int iJ = axrwVar.j();
        builder.setAllowNonDefaultNetworkUsage(a(iJ));
        if (iJ == 2) {
            builder.setPathDegradationMigration(a(2));
        }
        HttpEngine.Builder builder2 = this.d;
        builder2.setConnectionMigrationOptions(builder.build());
        DnsOptions.StaleDnsOptions.Builder builder3 = new DnsOptions.StaleDnsOptions.Builder();
        int iC = axrwVar.c();
        if (iC != -1) {
            builder3.setFreshLookupTimeout(TimeConversions.convert(Duration.ofMillis(iC)));
        }
        int iD = axrwVar.d();
        if (iD != -1) {
            builder3.setMaxExpiredDelay(TimeConversions.convert(Duration.ofMillis(iD)));
        }
        builder3.setAllowCrossNetworkUsage(a(axrwVar.l())).setUseStaleOnNameNotResolved(a(axrwVar.o()));
        DnsOptions.Builder builder4 = new DnsOptions.Builder();
        builder4.setUseHttpStackDnsResolver(a(axrwVar.i())).setStaleDns(a(axrwVar.m())).setStaleDnsOptions(builder3.build()).setPreestablishConnectionsToStaleDnsResults(a(AndroidNetworkLibrary.i((Boolean) axrwVar.f("QUIC", "race_stale_dns_on_connection", null, Boolean.class)))).setPersistHostCache(a(axrwVar.n()));
        int iE = axrwVar.e();
        if (iE != -1) {
            builder4.setPersistHostCachePeriod(TimeConversions.convert(Duration.ofMillis(iE)));
        }
        builder2.setDnsOptions(builder4.build());
        QuicOptions.Builder builder5 = new QuicOptions.Builder();
        if (axrwVar.g() != null) {
            for (String str2 : axrwVar.g().split(",")) {
                builder5.addAllowedQuicHost(str2);
            }
        }
        int iB = axrwVar.b();
        if (iB != -1) {
            builder5.setInMemoryServerConfigsCacheSize(iB);
        }
        String str3 = (String) axrwVar.f("QUIC", "user_agent_id", null, String.class);
        if (str3 != null) {
            builder5.setHandshakeUserAgent(str3);
        }
        int iA = axrwVar.a();
        if (iA != -1) {
            builder5.setIdleConnectionTimeout(TimeConversions.convert(Duration.ofSeconds(iA)));
        }
        builder2.setQuicOptions(builder5.build());
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setProxyOptionsV2(ProxyOptions proxyOptions) {
        AndroidProxyOptions.apply(this.d, proxyOptions);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setStoragePath(String str) {
        this.d.setStoragePath(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setUserAgent(String str) {
        this.d.setUserAgent(str);
        this.b = str != null;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    @Deprecated
    public final ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setThreadPriority(int i) {
        return this;
    }
}
