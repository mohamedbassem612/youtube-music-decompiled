package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
enum rgg {
    INTERNAL("internal"),
    EXTERNAL("external"),
    EXTERNAL_HDR("external_yuv"),
    EXTERNAL_HDR_VIDINFRA("external_yuv_vidinfra");

    final String e;

    rgg(String str) {
        this.e = str;
    }
}
