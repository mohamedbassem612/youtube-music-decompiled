package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum atzx implements aihr {
    ALIGN_HORIZONTAL_UNSPECIFIED(0),
    ALIGN_LEFT(1),
    ALIGN_CENTER(2),
    ALIGN_RIGHT(3);

    public final int e;

    atzx(int i) {
        this.e = i;
    }

    public static atzx a(int i) {
        if (i == 0) {
            return ALIGN_HORIZONTAL_UNSPECIFIED;
        }
        if (i == 1) {
            return ALIGN_LEFT;
        }
        if (i == 2) {
            return ALIGN_CENTER;
        }
        if (i != 3) {
            return null;
        }
        return ALIGN_RIGHT;
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
