package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum aodg implements aihr {
    OBAKE_IMAGE_SOURCE_TYPE_UNKNOWN(0),
    OBAKE_IMAGE_SOURCE_TYPE_CAMERA(1),
    OBAKE_IMAGE_SOURCE_TYPE_DEVICE_PHOTO(2),
    OBAKE_IMAGE_SOURCE_TYPE_GOOGLE_PHOTOS(3),
    OBAKE_IMAGE_SOURCE_TYPE_ILLUSTRATION(4),
    OBAKE_IMAGE_SOURCE_TYPE_AI_SELFIE(5),
    OBAKE_IMAGE_SOURCE_TYPE_PAST_PROFILE_PHOTO(6);

    private final int i;

    aodg(int i) {
        this.i = i;
    }

    public static aodg a(int i) {
        switch (i) {
            case 0:
                return OBAKE_IMAGE_SOURCE_TYPE_UNKNOWN;
            case 1:
                return OBAKE_IMAGE_SOURCE_TYPE_CAMERA;
            case 2:
                return OBAKE_IMAGE_SOURCE_TYPE_DEVICE_PHOTO;
            case 3:
                return OBAKE_IMAGE_SOURCE_TYPE_GOOGLE_PHOTOS;
            case 4:
                return OBAKE_IMAGE_SOURCE_TYPE_ILLUSTRATION;
            case 5:
                return OBAKE_IMAGE_SOURCE_TYPE_AI_SELFIE;
            case 6:
                return OBAKE_IMAGE_SOURCE_TYPE_PAST_PROFILE_PHOTO;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
