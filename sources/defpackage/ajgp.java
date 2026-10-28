package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum ajgp implements aihr {
    POST_ATTACHMENT_TYPE_ENUM_UNKNOWN(0),
    POST_ATTACHMENT_TYPE_ENUM_NONE(1),
    POST_ATTACHMENT_TYPE_ENUM_IMAGE(2),
    POST_ATTACHMENT_TYPE_ENUM_VIDEO_LINK(3),
    POST_ATTACHMENT_TYPE_ENUM_POLL(4),
    POST_ATTACHMENT_TYPE_ENUM_PLAYLIST_LINK(5),
    POST_ATTACHMENT_TYPE_ENUM_POST_LINK(6),
    POST_ATTACHMENT_TYPE_ENUM_CLIP(7),
    POST_ATTACHMENT_TYPE_ENUM_QUIZ(8),
    POST_ATTACHMENT_TYPE_ENUM_UPLOADED_VIDEOS(9);

    private final int l;

    ajgp(int i) {
        this.l = i;
    }

    public static ajgp a(int i) {
        switch (i) {
            case 0:
                return POST_ATTACHMENT_TYPE_ENUM_UNKNOWN;
            case 1:
                return POST_ATTACHMENT_TYPE_ENUM_NONE;
            case 2:
                return POST_ATTACHMENT_TYPE_ENUM_IMAGE;
            case 3:
                return POST_ATTACHMENT_TYPE_ENUM_VIDEO_LINK;
            case 4:
                return POST_ATTACHMENT_TYPE_ENUM_POLL;
            case 5:
                return POST_ATTACHMENT_TYPE_ENUM_PLAYLIST_LINK;
            case 6:
                return POST_ATTACHMENT_TYPE_ENUM_POST_LINK;
            case 7:
                return POST_ATTACHMENT_TYPE_ENUM_CLIP;
            case 8:
                return POST_ATTACHMENT_TYPE_ENUM_QUIZ;
            case 9:
                return POST_ATTACHMENT_TYPE_ENUM_UPLOADED_VIDEOS;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}
