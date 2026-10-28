package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum ahyi implements aihr {
    IMAGE_TYPE_UNSPECIFIED(0),
    COLLAPSED_ICON(1),
    EXPANDED_ICON(2),
    BIG_PICTURE(3),
    ANDROID_MESSAGING_STYLE_AVATAR(4),
    ANDROID_MESSAGING_STYLE_IMAGES(5),
    IOS_COMMUNICATION_NOTIFICATION_AVATAR(6),
    ANDROID_MESSAGING_STYLE_SHORTCUT_ICON(7);

    public final int i;

    ahyi(int i) {
        this.i = i;
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
