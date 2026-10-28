package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum amtn implements aihr {
    LOCK_MODE_STATE_ENUM_UNKNOWN(0),
    LOCK_MODE_STATE_ENUM_UNLOCKED(1),
    LOCK_MODE_STATE_ENUM_LOCKED(2),
    LOCK_MODE_STATE_ENUM_CAN_UNLOCK(3),
    LOCK_MODE_STATE_ENUM_UNLOCK_EXPANDED(4),
    LOCK_MODE_STATE_ENUM_LOCKED_TEMPORARY_SUSPENSION(5);

    private final int h;

    amtn(int i) {
        this.h = i;
    }

    public static amtn a(int i) {
        if (i == 0) {
            return LOCK_MODE_STATE_ENUM_UNKNOWN;
        }
        if (i == 1) {
            return LOCK_MODE_STATE_ENUM_UNLOCKED;
        }
        if (i == 2) {
            return LOCK_MODE_STATE_ENUM_LOCKED;
        }
        if (i == 3) {
            return LOCK_MODE_STATE_ENUM_CAN_UNLOCK;
        }
        if (i == 4) {
            return LOCK_MODE_STATE_ENUM_UNLOCK_EXPANDED;
        }
        if (i != 5) {
            return null;
        }
        return LOCK_MODE_STATE_ENUM_LOCKED_TEMPORARY_SUSPENSION;
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
