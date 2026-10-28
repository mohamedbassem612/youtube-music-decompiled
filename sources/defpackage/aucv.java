package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum aucv implements aihr {
    MDE_ANDROID_BITRATE_MODE_UNKNOWN(0),
    MDE_ANDROID_BITRATE_MODE_CQ(1),
    MDE_ANDROID_BITRATE_MODE_VBR(2),
    MDE_ANDROID_BITRATE_MODE_CBR(3),
    MDE_ANDROID_BITRATE_MODE_CBR_FD(4);

    private final int g;

    aucv(int i) {
        this.g = i;
    }

    public static aucv a(int i) {
        if (i == 0) {
            return MDE_ANDROID_BITRATE_MODE_UNKNOWN;
        }
        if (i == 1) {
            return MDE_ANDROID_BITRATE_MODE_CQ;
        }
        if (i == 2) {
            return MDE_ANDROID_BITRATE_MODE_VBR;
        }
        if (i == 3) {
            return MDE_ANDROID_BITRATE_MODE_CBR;
        }
        if (i != 4) {
            return null;
        }
        return MDE_ANDROID_BITRATE_MODE_CBR_FD;
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
