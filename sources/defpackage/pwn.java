package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class pwn extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aibo aiboVar = (aibo) obj;
        int iOrdinal = aiboVar.ordinal();
        if (iOrdinal == 0) {
            return ahzb.APP_BLOCK_STATE_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return ahzb.ALLOWED;
        }
        if (iOrdinal == 2) {
            return ahzb.BANNED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(aiboVar.toString()));
    }
}
