package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum akvr implements aihr {
    DRM_TRACK_TYPE_UNSPECIFIED(0),
    DRM_TRACK_TYPE_AUDIO(1),
    DRM_TRACK_TYPE_SD(2),
    DRM_TRACK_TYPE_HD(3),
    DRM_TRACK_TYPE_UHD1(4),
    DRM_TRACK_TYPE_UHD2(5);

    public final int g;

    akvr(int i) {
        this.g = i;
    }

    public static akvr a(int i) {
        if (i == 0) {
            return DRM_TRACK_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return DRM_TRACK_TYPE_AUDIO;
        }
        if (i == 2) {
            return DRM_TRACK_TYPE_SD;
        }
        if (i == 3) {
            return DRM_TRACK_TYPE_HD;
        }
        if (i == 4) {
            return DRM_TRACK_TYPE_UHD1;
        }
        if (i != 5) {
            return null;
        }
        return DRM_TRACK_TYPE_UHD2;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
