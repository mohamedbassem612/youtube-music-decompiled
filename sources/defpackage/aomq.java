package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aomq implements aihr {
    INVALID(0),
    ADDRESS_BOOK(1),
    NOTIFICATIONS(2),
    SEND_SMS(3),
    FINE_LOCATION(4),
    GET_ACCOUNTS(5),
    IOS_FINE_LOCATION_WHEN_IN_USE(6),
    IOS_FINE_LOCATION_ALWAYS_ON(7),
    WRITE_EXTERNAL_STORAGE(8),
    READ_MEDIA_AUDIO(9),
    ANDROID_CAMERA(10),
    IOS_CAMERA(11),
    IOS_APP_TRACKING_TRANSPARENCY(12),
    IOS_MICROPHONE(13),
    ANDROID_MICROPHONE(14),
    ANDROID_COARSE_LOCATION(15);

    public final int q;

    aomq(int i) {
        this.q = i;
    }

    public static aomq a(int i) {
        switch (i) {
            case 0:
                return INVALID;
            case 1:
                return ADDRESS_BOOK;
            case 2:
                return NOTIFICATIONS;
            case 3:
                return SEND_SMS;
            case 4:
                return FINE_LOCATION;
            case 5:
                return GET_ACCOUNTS;
            case 6:
                return IOS_FINE_LOCATION_WHEN_IN_USE;
            case 7:
                return IOS_FINE_LOCATION_ALWAYS_ON;
            case 8:
                return WRITE_EXTERNAL_STORAGE;
            case 9:
                return READ_MEDIA_AUDIO;
            case 10:
                return ANDROID_CAMERA;
            case 11:
                return IOS_CAMERA;
            case 12:
                return IOS_APP_TRACKING_TRANSPARENCY;
            case 13:
                return IOS_MICROPHONE;
            case 14:
                return ANDROID_MICROPHONE;
            case 15:
                return ANDROID_COARSE_LOCATION;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.q);
    }
}
