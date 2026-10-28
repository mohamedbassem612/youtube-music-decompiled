package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum ufs implements aihr {
    CREATION_FLOW_UNKNOWN(0),
    CREATION_FLOW_SHORTS(1),
    CREATION_FLOW_IMAGE_POSTS(3),
    CREATION_FLOW_VIDEO_THUMBNAIL(4),
    CREATION_FLOW_IMMERSIVE_LIVE(5),
    CREATION_FLOW_PRODUCT_STICKER(6),
    CREATION_FLOW_CUSTOM_PLAYLIST_THUMBNAIL(7),
    CREATION_FLOW_COMMON(8),
    CREATION_FLOW_RECOMPOSITION(9),
    UNRECOGNIZED(-1);

    private final int l;

    ufs(int i) {
        this.l = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this == UNRECOGNIZED ? aiif.a() : this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}
