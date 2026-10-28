package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum akjm implements aihr {
    DAI_SKIPPABLE_TYPE_UNKNOWN(0),
    DAI_SKIPPABLE_TYPE_SKIP_TO_CONTENT(1),
    DAI_SKIPPABLE_TYPE_SKIP_TO_SLATE(2),
    DAI_SKIPPABLE_TYPE_SKIP_TO_NEXT_AD(3);

    private final int f;

    akjm(int i) {
        this.f = i;
    }

    public static akjm a(int i) {
        if (i == 0) {
            return DAI_SKIPPABLE_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return DAI_SKIPPABLE_TYPE_SKIP_TO_CONTENT;
        }
        if (i == 2) {
            return DAI_SKIPPABLE_TYPE_SKIP_TO_SLATE;
        }
        if (i != 3) {
            return null;
        }
        return DAI_SKIPPABLE_TYPE_SKIP_TO_NEXT_AD;
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
