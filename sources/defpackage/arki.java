package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum arki implements aihr {
    WEB_VIEW_PERMISSION_UNSPECIFIED(0),
    WEB_VIEW_PERMISSION_THIRD_PARTY_COOKIES(1),
    WEB_VIEW_PERMISSION_AUDIO_CAPTURE(2),
    WEB_VIEW_PERMISSION_VIDEO_CAPTURE(3);

    private final int f;

    arki(int i) {
        this.f = i;
    }

    public static arki a(int i) {
        if (i == 0) {
            return WEB_VIEW_PERMISSION_UNSPECIFIED;
        }
        if (i == 1) {
            return WEB_VIEW_PERMISSION_THIRD_PARTY_COOKIES;
        }
        if (i == 2) {
            return WEB_VIEW_PERMISSION_AUDIO_CAPTURE;
        }
        if (i != 3) {
            return null;
        }
        return WEB_VIEW_PERMISSION_VIDEO_CAPTURE;
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
