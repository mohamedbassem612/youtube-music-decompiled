package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class udi extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        audi audiVar = (audi) obj;
        int iOrdinal = audiVar.ordinal();
        if (iOrdinal == 0) {
            return ancl.MEDIA_ENGINE_TRANSMUXING_DECISION_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return ancl.MEDIA_ENGINE_TRANSMUXING_DECISION_NOT_ENCODE;
        }
        if (iOrdinal == 2) {
            return ancl.MEDIA_ENGINE_TRANSMUXING_DECISION_TRANSCODE;
        }
        if (iOrdinal == 3) {
            return ancl.MEDIA_ENGINE_TRANSMUXING_DECISION_TRANSMUX;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(audiVar.toString()));
    }
}
