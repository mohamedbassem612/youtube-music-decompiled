package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum aohm implements aihr {
    OFFLINE_VIDEO_SELECTION_STRATEGY_UNKNOWN(0),
    OFFLINE_VIDEO_SELECTION_STRATEGY_REMOVE_ALL_ADD_ALL_DEDUPE(1),
    OFFLINE_VIDEO_SELECTION_STRATEGY_REMOVE_ALL_ADD_IN_ORDER_DEDUPE(2),
    OFFLINE_VIDEO_SELECTION_STRATEGY_INTERLEAVING_REMOVE_ADD_IN_ORDER_DEDUPE(3);

    public final int e;

    aohm(int i) {
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
