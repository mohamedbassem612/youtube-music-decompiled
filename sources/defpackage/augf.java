package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum augf implements aihr {
    SEGMENT_TAG_UNSPECIFIED(0),
    INVALID_SOURCE(1),
    NOT_FOR_UPLOAD(2),
    SKIPPED_TRANSCODE_SOURCE(3),
    NOT_SHOW_IN_TIMELINE(4),
    INVALID_SOURCE_UNSUPPORTED(5),
    UNFILLED_SOURCE(6),
    UNRECOGNIZED(-1);

    private final int j;

    augf(int i2) {
        this.j = i2;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this == UNRECOGNIZED ? aiif.a() : this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}
