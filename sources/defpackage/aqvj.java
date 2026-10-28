package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aqvj implements aihr {
    VIDEO_STREAM_TYPE_UNSPECIFIED(0),
    VIDEO_STREAM_TYPE_LIVE(1),
    VIDEO_STREAM_TYPE_DVR(2),
    VIDEO_STREAM_TYPE_VOD(3);

    public final int e;

    aqvj(int i) {
        this.e = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
