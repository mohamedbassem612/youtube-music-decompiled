package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum apcc implements aihr {
    MODE_UNSPECIFIED(0),
    INSERT_AFTER_CURRENT_VIDEO(1),
    INSERT_AT_END(2),
    INSERT_AFTER_SET_VIDEO_ID(3);

    public final int e;

    apcc(int i) {
        this.e = i;
    }

    public static apcc a(int i) {
        if (i == 0) {
            return MODE_UNSPECIFIED;
        }
        if (i == 1) {
            return INSERT_AFTER_CURRENT_VIDEO;
        }
        if (i == 2) {
            return INSERT_AT_END;
        }
        if (i != 3) {
            return null;
        }
        return INSERT_AFTER_SET_VIDEO_ID;
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
