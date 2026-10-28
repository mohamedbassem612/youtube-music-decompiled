package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum anby implements aihr {
    MDE_ANDROID_BITRATE_MODE_UNKNOWN(0),
    MDE_ANDROID_BITRATE_MODE_CQ(1),
    MDE_ANDROID_BITRATE_MODE_VBR(2),
    MDE_ANDROID_BITRATE_MODE_CBR(3),
    MDE_ANDROID_BITRATE_MODE_CBR_FD(4);

    public final int f;

    anby(int i) {
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
