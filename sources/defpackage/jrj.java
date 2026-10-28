package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum jrj implements aihr {
    AUDIO_ROUTE_UNSPECIFIED(0),
    AUDIO_ROUTE_MUSIC(1),
    AUDIO_ROUTE_ALARM(2);

    public final int d;

    jrj(int i) {
        this.d = i;
    }

    public static jrj a(int i) {
        if (i == 0) {
            return AUDIO_ROUTE_UNSPECIFIED;
        }
        if (i == 1) {
            return AUDIO_ROUTE_MUSIC;
        }
        if (i != 2) {
            return null;
        }
        return AUDIO_ROUTE_ALARM;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
