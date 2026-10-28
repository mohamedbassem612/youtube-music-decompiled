package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum amjr implements aihr {
    LATENCY_PLAYER_SET_OPERATION_TYPE_UNKNOWN(0),
    LATENCY_PLAYER_SET_OPERATION_TYPE_START(1),
    LATENCY_PLAYER_SET_OPERATION_TYPE_NEXT(4),
    LATENCY_PLAYER_SET_OPERATION_TYPE_PREVIOUS(5),
    LATENCY_PLAYER_SET_OPERATION_TYPE_JUMP(6),
    LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV(12),
    LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY(13),
    LATENCY_PLAYER_SET_OPERATION_TYPE_SWIPE_NEXT(9),
    LATENCY_PLAYER_SET_OPERATION_TYPE_SWIPE_PREVIOUS(10),
    LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOPLAY(2),
    LATENCY_PLAYER_SET_OPERATION_TYPE_AUTONAV(3),
    LATENCY_PLAYER_SET_OPERATION_TYPE_URL(7),
    LATENCY_PLAYER_SET_OPERATION_TYPE_RETRY(8),
    LATENCY_PLAYER_SET_OPERATION_TYPE_MUTED_AUTOPLAY(11);

    public final int o;

    amjr(int i) {
        this.o = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.o;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.o);
    }
}
