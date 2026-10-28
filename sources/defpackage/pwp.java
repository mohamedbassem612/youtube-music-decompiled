package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
class pwp extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aibs aibsVar = (aibs) obj;
        int iOrdinal = aibsVar.ordinal();
        if (iOrdinal == 0) {
            return ahxz.CHANNEL_GROUP_STATE_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return ahxz.ALLOWED;
        }
        if (iOrdinal == 2) {
            return ahxz.BANNED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(aibsVar.toString()));
    }
}
