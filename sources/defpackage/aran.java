package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum aran implements aihr {
    UPLOAD_SHORTS_AUDIO_DEVICE_TYPE_UNKNOWN(0),
    UPLOAD_SHORTS_AUDIO_DEVICE_TYPE_BUILT_IN(1),
    UPLOAD_SHORTS_AUDIO_DEVICE_TYPE_BLUETOOTH(2),
    UPLOAD_SHORTS_AUDIO_DEVICE_TYPE_WIRED_HEADSET(3),
    UPLOAD_SHORTS_AUDIO_DEVICE_TYPE_BLE(4),
    UPLOAD_SHORTS_AUDIO_DEVICE_TYPE_A2DP(5),
    UPLOAD_SHORTS_AUDIO_DEVICE_TYPE_HFP(6);

    public final int h;

    aran(int i2) {
        this.h = i2;
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
