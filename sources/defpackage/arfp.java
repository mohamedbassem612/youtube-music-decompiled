package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum arfp implements aihr {
    COMMENT_SOURCE_UNSPECIFIED(0),
    COMMENT_SOURCE_VOD_COMMENTS(1),
    COMMENT_SOURCE_SHORT_COMMENTS(2),
    COMMENT_SOURCE_COMMENTS_PICKER_CAMERA_SUGGESTED(3),
    COMMENT_SOURCE_COMMENTS_PICKER_CAMERA_SAVED(4);

    public final int f;

    arfp(int i) {
        this.f = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
