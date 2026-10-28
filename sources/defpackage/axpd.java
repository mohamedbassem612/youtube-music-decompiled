package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axpd extends axqf implements axqw {
    public static final int BROTLI_ENABLED_FIELD_NUMBER = 6;
    public static final int BYPASS_PUBLIC_KEY_PINNING_FOR_LOCAL_TRUST_ANCHORS_FIELD_NUMBER = 13;
    public static final axpd DEFAULT_INSTANCE;
    public static final int DISABLE_CACHE_FIELD_NUMBER = 7;
    public static final int ENABLE_NETWORK_QUALITY_ESTIMATOR_FIELD_NUMBER = 12;
    public static final int EXPERIMENTAL_OPTIONS_FIELD_NUMBER = 10;
    public static final int HTTP2_ENABLED_FIELD_NUMBER = 5;
    public static final int HTTP_CACHE_MAX_SIZE_FIELD_NUMBER = 9;
    public static final int HTTP_CACHE_MODE_FIELD_NUMBER = 8;
    public static final int MOCK_CERT_VERIFIER_FIELD_NUMBER = 11;
    public static final int NETWORK_THREAD_PRIORITY_FIELD_NUMBER = 14;
    private static volatile axra PARSER = null;
    public static final int PROXY_OPTIONS_FIELD_NUMBER = 15;
    public static final int QUIC_DEFAULT_USER_AGENT_ID_FIELD_NUMBER = 4;
    public static final int QUIC_ENABLED_FIELD_NUMBER = 3;
    public static final int STORAGE_PATH_FIELD_NUMBER = 2;
    public static final int USER_AGENT_FIELD_NUMBER = 1;
    public int bitField0_;
    public boolean brotliEnabled_;
    public boolean bypassPublicKeyPinningForLocalTrustAnchors_;
    public boolean disableCache_;
    public boolean enableNetworkQualityEstimator_;
    public boolean http2Enabled_;
    public long httpCacheMaxSize_;
    public int httpCacheMode_;
    public long mockCertVerifier_;
    public int networkThreadPriority_;
    public axpb proxyOptions_;
    public boolean quicEnabled_;
    public String userAgent_ = "";
    public String storagePath_ = "";
    public String quicDefaultUserAgentId_ = "";
    public String experimentalOptions_ = "";

    static {
        axpd axpdVar = new axpd();
        DEFAULT_INSTANCE = axpdVar;
        axqf.p(axpd.class, axpdVar);
    }

    private axpd() {
    }

    @Override // defpackage.axqf
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new axrd(DEFAULT_INSTANCE, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bင\u0007\tဂ\b\nဈ\t\u000bဂ\n\fဇ\u000b\rဇ\f\u000eင\r\u000fဉ\u000e", new Object[]{"bitField0_", "userAgent_", "storagePath_", "quicEnabled_", "quicDefaultUserAgentId_", "http2Enabled_", "brotliEnabled_", "disableCache_", "httpCacheMode_", "httpCacheMaxSize_", "experimentalOptions_", "mockCertVerifier_", "enableNetworkQualityEstimator_", "bypassPublicKeyPinningForLocalTrustAnchors_", "networkThreadPriority_", "proxyOptions_"});
        }
        if (i2 == 3) {
            return new axpd();
        }
        if (i2 == 4) {
            return new axqd(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }
}
