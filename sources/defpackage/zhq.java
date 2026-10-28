package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum zhq {
    ABR("YT.abr"),
    AUDIO("YT.audio"),
    CACHE("YT.mediacache"),
    DRM("YT.drm"),
    EXO("YT.exo"),
    FWP("YT.fwp"),
    HDR("YT.hdr"),
    LIVE("YT.live"),
    MLPLAYER("YT.mlplayer"),
    CODEC_REUSE("YT.codecreuse"),
    NET("YT.medianet"),
    QOE("YT.qoe"),
    ONESIE("YT.onesie"),
    PLATYPUS("YT.platypus"),
    PO("YT.po"),
    UTIL("YT.util"),
    RENDER("YT.render");

    public final String r;

    zhq(String str) {
        this.r = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.r;
    }
}
