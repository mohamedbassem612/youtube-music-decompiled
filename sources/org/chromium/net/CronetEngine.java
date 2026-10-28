package org.chromium.net;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import defpackage.aqv;
import defpackage.axjt;
import defpackage.axkg;
import defpackage.axkh;
import defpackage.axnf;
import defpackage.axnj;
import defpackage.axnk;
import defpackage.axnl;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.base.JniAndroid;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class CronetEngine {
    public static final int ACTIVE_REQUEST_COUNT_UNKNOWN = -1;
    public static final int CONNECTION_METRIC_UNKNOWN = -1;
    public static final int EFFECTIVE_CONNECTION_TYPE_2G = 3;
    public static final int EFFECTIVE_CONNECTION_TYPE_3G = 4;
    public static final int EFFECTIVE_CONNECTION_TYPE_4G = 5;
    public static final int EFFECTIVE_CONNECTION_TYPE_OFFLINE = 1;
    public static final int EFFECTIVE_CONNECTION_TYPE_SLOW_2G = 2;
    public static final int EFFECTIVE_CONNECTION_TYPE_UNKNOWN = 0;
    private static final String TAG = "CronetEngine";
    public static final long UNBIND_NETWORK_HANDLE = -1;

    public abstract URLStreamHandlerFactory createURLStreamHandlerFactory();

    public int getActiveRequestCount() {
        return -1;
    }

    public int getDownstreamThroughputKbps() {
        return -1;
    }

    public int getEffectiveConnectionType() {
        return 0;
    }

    @Deprecated
    public abstract byte[] getGlobalMetricsDeltas();

    public int getHttpRttMs() {
        return -1;
    }

    public int getTransportRttMs() {
        return -1;
    }

    public abstract String getVersionString();

    public BidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public abstract UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor);

    public abstract URLConnection openConnection(URL url);

    public abstract void shutdown();

    public abstract void startNetLogToFile(String str, boolean z);

    public abstract void stopNetLog();

    /* JADX INFO: compiled from: PG */
    public class Builder {
        public static final int HTTP_CACHE_DISABLED = 0;
        public static final int HTTP_CACHE_DISK = 3;
        public static final int HTTP_CACHE_DISK_NO_HTTP = 2;
        public static final int HTTP_CACHE_IN_MEMORY = 1;
        private static final String TAG = "CronetEngine.Builder";
        protected final ICronetEngineBuilder mBuilderDelegate;
        private final List mExperimentalOptionsPatches;
        protected JSONObject mParsedExperimentalOptions;

        /* JADX INFO: compiled from: PG */
        @Deprecated
        public abstract class LibraryLoader {
            @Deprecated
            public abstract void loadLibrary(String str);
        }

        public Builder(ICronetEngineBuilder iCronetEngineBuilder) {
            this.mExperimentalOptionsPatches = new ArrayList();
            this.mBuilderDelegate = iCronetEngineBuilder;
        }

        private static ICronetEngineBuilder createBuilderDelegate(Context context) {
            new axjt("CronetEngine#createBuilderDelegate", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            axkg preferredCronetProvider = getPreferredCronetProvider(context, new ArrayList(CronetProvider.getAllProviderInfos(context)));
            axnk axnkVarA = axnl.a(context, preferredCronetProvider.c);
            axnf axnfVar = new axnf();
            try {
                axnfVar.d = Boolean.FALSE;
                axnfVar.h = 1;
                axnfVar.c = preferredCronetProvider.c;
                axnfVar.g = Process.myUid();
                axnfVar.e = new axnj(ApiVersion.getCronetVersion());
                ICronetEngineBuilder iCronetEngineBuilder = preferredCronetProvider.a.createBuilder().mBuilderDelegate;
                String implCronetVersion = getImplCronetVersion(iCronetEngineBuilder);
                if (implCronetVersion != null) {
                    axnfVar.f = new axnj(implCronetVersion);
                }
                axnfVar.a = iCronetEngineBuilder.getLogCronetInitializationRef();
                axnfVar.d = Boolean.TRUE;
                return iCronetEngineBuilder;
            } finally {
                axnfVar.b = (int) (SystemClock.uptimeMillis() - jUptimeMillis);
                axnkVarA.d(axnfVar);
            }
        }

        private static int getImplApiLevel(ICronetEngineBuilder iCronetEngineBuilder) {
            try {
                Method implVersionMethod = getImplVersionMethod(iCronetEngineBuilder, "getApiLevel");
                if (implVersionMethod == null) {
                    return -1;
                }
                return ((Integer) implVersionMethod.invoke(null, null)).intValue();
            } catch (ReflectiveOperationException e) {
                throw new RuntimeException("Failed to retrieve Cronet impl API level", e);
            }
        }

        private static String getImplCronetVersion(ICronetEngineBuilder iCronetEngineBuilder) {
            try {
                Method implVersionMethod = getImplVersionMethod(iCronetEngineBuilder, "getCronetVersion");
                if (implVersionMethod != null) {
                    return (String) implVersionMethod.invoke(null, null);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                throw new RuntimeException("Failed to retrieve Cronet impl version", e);
            }
        }

        private static Method getImplVersionMethod(ICronetEngineBuilder iCronetEngineBuilder, String str) {
            try {
                return iCronetEngineBuilder.getClass().getClassLoader().loadClass("org.chromium.net.impl.ImplVersion").getMethod(str, null);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                return null;
            }
        }

        private int getMaximumApiLevel() {
            return 49;
        }

        static axkg getPreferredCronetProvider(Context context, List list) {
            if (list.isEmpty()) {
                throw new RuntimeException("Unable to find any Cronet provider. Have you included all necessary jars?");
            }
            axkg preferredCronetProviderUsingScore = getPreferredCronetProviderUsingScore(list);
            if (preferredCronetProviderUsingScore != null) {
                return preferredCronetProviderUsingScore;
            }
            throw new RuntimeException("All available Cronet providers are disabled. A provider should be enabled before it can be used.");
        }

        private static axkg getPreferredCronetProviderUsingScore(List list) {
            Collections.sort(list, new aqv(10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                axkg axkgVar = (axkg) it.next();
                if (axkgVar.a.isEnabled()) {
                    return axkgVar;
                }
            }
            return null;
        }

        static /* synthetic */ void lambda$setConnectionMigrationOptions$0(ConnectionMigrationOptions connectionMigrationOptions, JSONObject jSONObject) throws JSONException {
            JSONObject jSONObjectB = JniAndroid.b(jSONObject, "QUIC");
            if (connectionMigrationOptions.getEnableDefaultNetworkMigration() != null) {
                jSONObjectB.put("migrate_sessions_on_network_change_v2", connectionMigrationOptions.getEnableDefaultNetworkMigration());
            }
            if (connectionMigrationOptions.getAllowServerMigration() != null) {
                jSONObjectB.put("allow_server_migration", connectionMigrationOptions.getAllowServerMigration());
            }
            if (connectionMigrationOptions.getMigrateIdleConnections() != null) {
                jSONObjectB.put("migrate_idle_sessions", connectionMigrationOptions.getMigrateIdleConnections());
            }
            if (connectionMigrationOptions.getIdleMigrationPeriodSeconds() != null) {
                jSONObjectB.put("idle_session_migration_period_seconds", connectionMigrationOptions.getIdleMigrationPeriodSeconds());
            }
            if (connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork() != null) {
                jSONObjectB.put("retry_on_alternate_network_before_handshake", connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork());
            }
            if (connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds() != null) {
                jSONObjectB.put("max_time_on_non_default_network_seconds", connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds());
            }
            if (connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount() != null) {
                jSONObjectB.put("max_migrations_to_non_default_network_on_path_degrading", connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount());
            }
            if (connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount() != null) {
                jSONObjectB.put("max_migrations_to_non_default_network_on_write_error", connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount());
            }
            if (connectionMigrationOptions.getEnablePathDegradationMigration() != null) {
                boolean zBooleanValue = connectionMigrationOptions.getEnablePathDegradationMigration().booleanValue();
                jSONObjectB.put("allow_port_migration", zBooleanValue);
                if (connectionMigrationOptions.getAllowNonDefaultNetworkUsage() != null) {
                    boolean zBooleanValue2 = connectionMigrationOptions.getAllowNonDefaultNetworkUsage().booleanValue();
                    if (zBooleanValue) {
                        if (zBooleanValue2) {
                            jSONObjectB.put("migrate_sessions_early_v2", true);
                            jSONObjectB.put("migrate_sessions_on_network_change_v2", true);
                            return;
                        }
                    } else if (zBooleanValue2) {
                        throw new IllegalArgumentException("Unable to turn on non-default network usage without path degradation migration!");
                    }
                    jSONObjectB.put("migrate_sessions_early_v2", false);
                }
            }
        }

        static /* synthetic */ void lambda$setDnsOptions$0(DnsOptions dnsOptions, JSONObject jSONObject) throws JSONException {
            JSONObject jSONObjectB = JniAndroid.b(jSONObject, "AsyncDNS");
            if (dnsOptions.getUseBuiltInDnsResolver() != null) {
                jSONObjectB.put("enable", dnsOptions.getUseBuiltInDnsResolver());
            }
            JSONObject jSONObjectB2 = JniAndroid.b(jSONObject, "StaleDNS");
            if (dnsOptions.getEnableStaleDns() != null) {
                jSONObjectB2.put("enable", dnsOptions.getEnableStaleDns());
            }
            if (dnsOptions.getPersistHostCache() != null) {
                jSONObjectB2.put("persist_to_disk", dnsOptions.getPersistHostCache());
            }
            if (dnsOptions.getPersistHostCachePeriodMillis() != null) {
                jSONObjectB2.put("persist_delay_ms", dnsOptions.getPersistHostCachePeriodMillis());
            }
            if (dnsOptions.getStaleDnsOptions() != null) {
                DnsOptions.StaleDnsOptions staleDnsOptions = dnsOptions.getStaleDnsOptions();
                if (staleDnsOptions.getAllowCrossNetworkUsage() != null) {
                    jSONObjectB2.put("allow_other_network", staleDnsOptions.getAllowCrossNetworkUsage());
                }
                if (staleDnsOptions.getFreshLookupTimeoutMillis() != null) {
                    jSONObjectB2.put("delay_ms", staleDnsOptions.getFreshLookupTimeoutMillis());
                }
                if (staleDnsOptions.getUseStaleOnNameNotResolved() != null) {
                    jSONObjectB2.put("use_stale_on_name_not_resolved", staleDnsOptions.getUseStaleOnNameNotResolved());
                }
                if (staleDnsOptions.getMaxExpiredDelayMillis() != null) {
                    jSONObjectB2.put("max_expired_time_ms", staleDnsOptions.getMaxExpiredDelayMillis());
                }
            }
            JSONObject jSONObjectB3 = JniAndroid.b(jSONObject, "QUIC");
            if (dnsOptions.getPreestablishConnectionsToStaleDnsResults() != null) {
                jSONObjectB3.put("race_stale_dns_on_connection", dnsOptions.getPreestablishConnectionsToStaleDnsResults());
            }
        }

        static /* synthetic */ void lambda$setQuicOptions$0(QuicOptions quicOptions, JSONObject jSONObject) throws JSONException {
            JSONObject jSONObjectB = JniAndroid.b(jSONObject, "QUIC");
            if (!quicOptions.getQuicHostAllowlist().isEmpty()) {
                jSONObjectB.put("host_whitelist", ExperimentalOptionsTranslator$$ExternalSyntheticBackport0.m(",", quicOptions.getQuicHostAllowlist()));
            }
            if (!quicOptions.getEnabledQuicVersions().isEmpty()) {
                jSONObjectB.put("quic_version", ExperimentalOptionsTranslator$$ExternalSyntheticBackport0.m(",", quicOptions.getEnabledQuicVersions()));
            }
            if (!quicOptions.getConnectionOptions().isEmpty()) {
                jSONObjectB.put("connection_options", ExperimentalOptionsTranslator$$ExternalSyntheticBackport0.m(",", quicOptions.getConnectionOptions()));
            }
            if (!quicOptions.getClientConnectionOptions().isEmpty()) {
                jSONObjectB.put("client_connection_options", ExperimentalOptionsTranslator$$ExternalSyntheticBackport0.m(",", quicOptions.getClientConnectionOptions()));
            }
            if (!quicOptions.getExtraQuicheFlags().isEmpty()) {
                jSONObjectB.put("set_quic_flags", ExperimentalOptionsTranslator$$ExternalSyntheticBackport0.m(",", quicOptions.getExtraQuicheFlags()));
            }
            if (quicOptions.getInMemoryServerConfigsCacheSize() != null) {
                jSONObjectB.put("max_server_configs_stored_in_properties", quicOptions.getInMemoryServerConfigsCacheSize());
            }
            if (quicOptions.getHandshakeUserAgent() != null) {
                jSONObjectB.put("user_agent_id", quicOptions.getHandshakeUserAgent());
            }
            if (quicOptions.getRetryWithoutAltSvcOnQuicErrors() != null) {
                jSONObjectB.put("retry_without_alt_svc_on_quic_errors", quicOptions.getRetryWithoutAltSvcOnQuicErrors());
            }
            if (quicOptions.getEnableTlsZeroRtt() != null) {
                jSONObjectB.put("disable_tls_zero_rtt", !quicOptions.getEnableTlsZeroRtt().booleanValue());
            }
            if (quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds() != null) {
                jSONObjectB.put("max_idle_time_before_crypto_handshake_seconds", quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds());
            }
            if (quicOptions.getCryptoHandshakeTimeoutSeconds() != null) {
                jSONObjectB.put("max_time_before_crypto_handshake_seconds", quicOptions.getCryptoHandshakeTimeoutSeconds());
            }
            if (quicOptions.getIdleConnectionTimeoutSeconds() != null) {
                jSONObjectB.put("idle_connection_timeout_seconds", quicOptions.getIdleConnectionTimeoutSeconds());
            }
            if (quicOptions.getRetransmittableOnWireTimeoutMillis() != null) {
                jSONObjectB.put("retransmittable_on_wire_timeout_milliseconds", quicOptions.getRetransmittableOnWireTimeoutMillis());
            }
            if (quicOptions.getCloseSessionsOnIpChange() != null) {
                jSONObjectB.put("close_sessions_on_ip_change", quicOptions.getCloseSessionsOnIpChange());
            }
            if (quicOptions.getGoawaySessionsOnIpChange() != null) {
                jSONObjectB.put("goaway_sessions_on_ip_change", quicOptions.getGoawaySessionsOnIpChange());
            }
            if (quicOptions.getInitialBrokenServicePeriodSeconds() != null) {
                jSONObjectB.put("initial_delay_for_broken_alternative_service_seconds", quicOptions.getInitialBrokenServicePeriodSeconds());
            }
            if (quicOptions.getIncreaseBrokenServicePeriodExponentially() != null) {
                jSONObjectB.put("exponential_backoff_on_initial_delay", quicOptions.getIncreaseBrokenServicePeriodExponentially());
            }
            if (quicOptions.getDelayJobsWithAvailableSpdySession() != null) {
                jSONObjectB.put("delay_main_job_with_available_spdy_session", quicOptions.getDelayJobsWithAvailableSpdySession());
            }
        }

        /* JADX WARN: Code duplicated, block: B:11:0x001d  */
        private void maybeSetExperimentalOptions() {
            Iterator it;
            JSONObject jSONObject;
            List list = this.mExperimentalOptionsPatches;
            JSONObject jSONObject2 = this.mParsedExperimentalOptions;
            if (jSONObject2 != null) {
                it = list.iterator();
                while (it.hasNext()) {
                    try {
                        ((axkh) it.next()).applyTo(jSONObject2);
                    } catch (JSONException e) {
                        throw new IllegalStateException("Unable to apply JSON patch!", e);
                    }
                }
                jSONObject = jSONObject2;
            } else if (list.isEmpty()) {
                jSONObject = null;
            } else {
                jSONObject2 = new JSONObject();
                it = list.iterator();
                while (it.hasNext()) {
                    ((axkh) it.next()).applyTo(jSONObject2);
                }
                jSONObject = jSONObject2;
            }
            if (jSONObject != null) {
                this.mBuilderDelegate.setExperimentalOptions(jSONObject.toString());
            }
        }

        public Builder addPublicKeyPins(String str, Set set, boolean z, Date date) {
            this.mBuilderDelegate.addPublicKeyPins(str, set, z, date);
            return this;
        }

        public Builder addQuicHint(String str, int i, int i2) {
            this.mBuilderDelegate.addQuicHint(str, i, i2);
            return this;
        }

        public CronetEngine build() {
            return buildExperimental();
        }

        protected ExperimentalCronetEngine buildExperimental() {
            int implApiLevel = getImplApiLevel(this.mBuilderDelegate);
            if (implApiLevel != -1 && implApiLevel < 49) {
                Log.w("cn_CronetEngine.Builder", "The implementation version is lower than the API version. Calls to methods added in API " + (implApiLevel + 1) + " and newer will likely have no effect.");
            }
            maybeSetExperimentalOptions();
            return this.mBuilderDelegate.build();
        }

        public Builder enableBrotli(boolean z) {
            this.mBuilderDelegate.enableBrotli(z);
            return this;
        }

        public Builder enableHttp2(boolean z) {
            this.mBuilderDelegate.enableHttp2(z);
            return this;
        }

        public Builder enableHttpCache(int i, long j) {
            this.mBuilderDelegate.enableHttpCache(i, j);
            return this;
        }

        public Builder enableNetworkQualityEstimator(boolean z) {
            this.mBuilderDelegate.enableNetworkQualityEstimator(z);
            return this;
        }

        public Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
            this.mBuilderDelegate.enablePublicKeyPinningBypassForLocalTrustAnchors(z);
            return this;
        }

        public Builder enableQuic(boolean z) {
            this.mBuilderDelegate.enableQuic(z);
            return this;
        }

        public String getDefaultUserAgent() {
            return this.mBuilderDelegate.getDefaultUserAgent();
        }

        public Builder setConnectionMigrationOptions(final ConnectionMigrationOptions connectionMigrationOptions) {
            if (this.mBuilderDelegate.getSupportedConfigOptions().contains(1)) {
                this.mBuilderDelegate.setConnectionMigrationOptions(connectionMigrationOptions);
            } else {
                this.mExperimentalOptionsPatches.add(new axkh() { // from class: org.chromium.net.CronetEngine$Builder$$ExternalSyntheticLambda1
                    @Override // defpackage.axkh
                    public final void applyTo(JSONObject jSONObject) throws JSONException {
                        CronetEngine.Builder.lambda$setConnectionMigrationOptions$0(connectionMigrationOptions, jSONObject);
                    }
                });
            }
            return this;
        }

        public Builder setDnsOptions(final DnsOptions dnsOptions) {
            if (this.mBuilderDelegate.getSupportedConfigOptions().contains(2)) {
                this.mBuilderDelegate.setDnsOptions(dnsOptions);
            } else {
                this.mExperimentalOptionsPatches.add(new axkh() { // from class: org.chromium.net.CronetEngine$Builder$$ExternalSyntheticLambda2
                    @Override // defpackage.axkh
                    public final void applyTo(JSONObject jSONObject) throws JSONException {
                        CronetEngine.Builder.lambda$setDnsOptions$0(dnsOptions, jSONObject);
                    }
                });
            }
            return this;
        }

        public Builder setProxyOptions(ProxyOptions proxyOptions) {
            proxyOptions.getClass();
            this.mBuilderDelegate.setProxyOptionsV2(proxyOptions);
            return this;
        }

        public Builder setQuicOptions(final QuicOptions quicOptions) {
            if (this.mBuilderDelegate.getSupportedConfigOptions().contains(3)) {
                this.mBuilderDelegate.setQuicOptions(quicOptions);
            } else {
                this.mExperimentalOptionsPatches.add(new axkh() { // from class: org.chromium.net.CronetEngine$Builder$$ExternalSyntheticLambda0
                    @Override // defpackage.axkh
                    public final void applyTo(JSONObject jSONObject) throws JSONException {
                        CronetEngine.Builder.lambda$setQuicOptions$0(quicOptions, jSONObject);
                    }
                });
            }
            return this;
        }

        public Builder setStoragePath(String str) {
            this.mBuilderDelegate.setStoragePath(str);
            return this;
        }

        @Deprecated
        public Builder setThreadPriority(int i) {
            this.mBuilderDelegate.setThreadPriority(i);
            return this;
        }

        public Builder setUserAgent(String str) {
            this.mBuilderDelegate.setUserAgent(str);
            return this;
        }

        public Builder(Context context) {
            this(createBuilderDelegate(context));
        }

        @Deprecated
        public Builder enableSdch(boolean z) {
            return this;
        }

        @Deprecated
        public Builder setLibraryLoader(LibraryLoader libraryLoader) {
            return this;
        }

        public Builder setConnectionMigrationOptions(ConnectionMigrationOptions.Builder builder) {
            return setConnectionMigrationOptions(builder.build());
        }

        public Builder setDnsOptions(DnsOptions.Builder builder) {
            return setDnsOptions(builder.build());
        }

        public Builder setQuicOptions(QuicOptions.Builder builder) {
            return setQuicOptions(builder.build());
        }
    }

    public void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public void bindToNetwork(long j) {
    }

    public void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public void configureNetworkQualityEstimatorForTesting(boolean z, boolean z2, boolean z3) {
    }

    public void startNetLogToDisk(String str, boolean z, int i) {
    }
}
