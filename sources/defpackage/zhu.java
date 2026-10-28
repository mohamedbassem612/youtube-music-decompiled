package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum zhu {
    SAME_CONDITION("same"),
    NEW_SURFACE("newsurface"),
    ENABLE_LIBVPX("enableLibvpx"),
    CACHE_PURGE("cachepurge"),
    PROGRESSIVE_FALLBACK("progressive"),
    DRM_SD_FALLBACK("drmsd"),
    SFR_FALLBACK("sfr"),
    GL_FALLBACK("gl"),
    DRM_NEW_MEDIA_DRM("drmNewMediaDrm"),
    DRM_SDR_FALLBACK("drmsdr"),
    DRM_L3_ENFORCED_FALLBACK("drml3enforced"),
    DRM_NEW_MANAGER("drmNewManager"),
    LIVE_HEAD("livehead"),
    PROGRESSIVE_FALLBACK_FAIL("progressivefail"),
    EXO_PROXYABLE_FORMAT_FALLBACK("exoproxy"),
    NETWORK_UNAVAILABLE("netunavailable"),
    DISABLE_LIBVPX("disableLibvpx"),
    DISABLE_AV1("disableAv1"),
    SW_CODEC_FALLBACK("swMediaCodec"),
    DISABLE_PLATYPUS("disablePlatypus"),
    DISABLE_GAPLESS("disableGapless"),
    DAV1D_SAME_CONDITION("dav1dSameCondition"),
    DISABLE_DAV1D("disableDav1d"),
    RETRY_PLATYPUS_WITH_SSDAI_DISABLED("platypusDisableSsdai"),
    SABR_RETRY_FORMAT_ERROR("sabrRetryFormatError");

    public final String z;

    zhu(String str) {
        this.z = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.z;
    }
}
