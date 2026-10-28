package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aiwh implements aihr {
    ANIMATION_DECISION_UNKNOWN(0),
    ANIMATION_DECISION_ON(1),
    ANIMATION_DECISION_THROTTLED(2),
    ANIMATION_DECISION_OFF(3);

    public static final aihs e = new amlf(1);
    public final int f;

    aiwh(int i) {
        this.f = i;
    }

    public static aiwh a(int i) {
        if (i == 0) {
            return ANIMATION_DECISION_UNKNOWN;
        }
        if (i == 1) {
            return ANIMATION_DECISION_ON;
        }
        if (i == 2) {
            return ANIMATION_DECISION_THROTTLED;
        }
        if (i != 3) {
            return null;
        }
        return ANIMATION_DECISION_OFF;
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
