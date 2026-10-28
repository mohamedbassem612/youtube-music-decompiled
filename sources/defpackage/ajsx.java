package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum ajsx implements aihr {
    CHIP_CLOUD_SELECTION_BEHAVIOR_UNKNOWN(0),
    CHIP_CLOUD_SELECTION_BEHAVIOR_SINGLE_SELECT(1),
    CHIP_CLOUD_SELECTION_BEHAVIOR_SINGLE_SELECT_ALWAYS_SELECTED(4),
    CHIP_CLOUD_SELECTION_BEHAVIOR_MULTI_SELECT(2),
    CHIP_CLOUD_SELECTION_BEHAVIOR_MULTI_SELECT_DESELECT_END(3),
    CHIP_CLOUD_SELECTION_BEHAVIOR_REMOVE_ON_SELECT(5);

    private final int h;

    ajsx(int i) {
        this.h = i;
    }

    public static ajsx a(int i) {
        if (i == 0) {
            return CHIP_CLOUD_SELECTION_BEHAVIOR_UNKNOWN;
        }
        if (i == 1) {
            return CHIP_CLOUD_SELECTION_BEHAVIOR_SINGLE_SELECT;
        }
        if (i == 2) {
            return CHIP_CLOUD_SELECTION_BEHAVIOR_MULTI_SELECT;
        }
        if (i == 3) {
            return CHIP_CLOUD_SELECTION_BEHAVIOR_MULTI_SELECT_DESELECT_END;
        }
        if (i == 4) {
            return CHIP_CLOUD_SELECTION_BEHAVIOR_SINGLE_SELECT_ALWAYS_SELECTED;
        }
        if (i != 5) {
            return null;
        }
        return CHIP_CLOUD_SELECTION_BEHAVIOR_REMOVE_ON_SELECT;
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
