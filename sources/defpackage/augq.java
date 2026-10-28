package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum augq implements aihr {
    COMMENT_STICKER_SOURCE_UNKNOWN(0),
    COMMENT_STICKER_SOURCE_STORY_COMMENTS(1),
    COMMENT_STICKER_SOURCE_VOD_COMMENTS(2),
    COMMENT_STICKER_SOURCE_STORY_CAMERA(3),
    COMMENT_STICKER_SOURCE_SHORT_COMMENTS(4),
    COMMENT_STICKER_SOURCE_COMMENTS_PICKER_CAMERA_SUGGESTED(5),
    COMMENT_STICKER_SOURCE_COMMENTS_PICKER_CAMERA_SAVED(6);

    public final int h;

    augq(int i2) {
        this.h = i2;
    }

    public static augq a(int i2) {
        switch (i2) {
            case 0:
                return COMMENT_STICKER_SOURCE_UNKNOWN;
            case 1:
                return COMMENT_STICKER_SOURCE_STORY_COMMENTS;
            case 2:
                return COMMENT_STICKER_SOURCE_VOD_COMMENTS;
            case 3:
                return COMMENT_STICKER_SOURCE_STORY_CAMERA;
            case 4:
                return COMMENT_STICKER_SOURCE_SHORT_COMMENTS;
            case 5:
                return COMMENT_STICKER_SOURCE_COMMENTS_PICKER_CAMERA_SUGGESTED;
            case 6:
                return COMMENT_STICKER_SOURCE_COMMENTS_PICKER_CAMERA_SAVED;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
