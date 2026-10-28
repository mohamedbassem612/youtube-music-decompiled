package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class udg extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        audf audfVar = (audf) obj;
        int iOrdinal = audfVar.ordinal();
        if (iOrdinal == 0) {
            return anci.MEDIA_ENGINE_PLAYER_STATE_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return anci.MEDIA_ENGINE_PLAYER_STATE_IDLE;
        }
        if (iOrdinal == 2) {
            return anci.MEDIA_ENGINE_PLAYER_STATE_READY;
        }
        if (iOrdinal == 3) {
            return anci.MEDIA_ENGINE_PLAYER_STATE_BUFFERING;
        }
        if (iOrdinal == 4) {
            return anci.MEDIA_ENGINE_PLAYER_STATE_ENDED;
        }
        if (iOrdinal == 5) {
            return anci.MEDIA_ENGINE_PLAYER_STATE_ASLEEP;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(audfVar.toString()));
    }
}
