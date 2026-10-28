package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum ajpy implements aihr {
    CHANNEL_CREATION_HEADER_STATE_UNKNOWN(0),
    CHANNEL_CREATION_HEADER_STATE_NATIVE(1),
    CHANNEL_CREATION_HEADER_STATE_ELEMENTS(2);

    private final int e;

    ajpy(int i) {
        this.e = i;
    }

    public static ajpy a(int i) {
        if (i == 0) {
            return CHANNEL_CREATION_HEADER_STATE_UNKNOWN;
        }
        if (i == 1) {
            return CHANNEL_CREATION_HEADER_STATE_NATIVE;
        }
        if (i != 2) {
            return null;
        }
        return CHANNEL_CREATION_HEADER_STATE_ELEMENTS;
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
