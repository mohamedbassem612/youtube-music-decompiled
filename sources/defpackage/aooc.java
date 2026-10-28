package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aooc implements aihr {
    PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_UNKNOWN(0),
    PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_LINE_OUT(1),
    PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_HEADPHONES(2),
    PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_BLUETOOTH_A2DP(3),
    PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_BUILT_IN_RECEIVER(4),
    PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_BUILT_IN_SPEAKER(5),
    PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_HDMI(6),
    PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_AIR_PLAY(7),
    PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_BLUETOOTH_LE(8),
    PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_BLUETOOTH_HFP(9),
    PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_USB_AUDIO(10),
    PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_CAR_PLAY(11),
    PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_ANDROID_AUDIO(12);

    public final int n;

    aooc(int i) {
        this.n = i;
    }

    public static aooc a(int i) {
        switch (i) {
            case 0:
                return PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_UNKNOWN;
            case 1:
                return PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_LINE_OUT;
            case 2:
                return PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_HEADPHONES;
            case 3:
                return PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_BLUETOOTH_A2DP;
            case 4:
                return PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_BUILT_IN_RECEIVER;
            case 5:
                return PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_BUILT_IN_SPEAKER;
            case 6:
                return PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_HDMI;
            case 7:
                return PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_AIR_PLAY;
            case 8:
                return PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_BLUETOOTH_LE;
            case 9:
                return PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_BLUETOOTH_HFP;
            case 10:
                return PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_USB_AUDIO;
            case 11:
                return PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_CAR_PLAY;
            case 12:
                return PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_ANDROID_AUDIO;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.n;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.n);
    }
}
