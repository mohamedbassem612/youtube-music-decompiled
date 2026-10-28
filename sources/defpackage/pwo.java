package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class pwo extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aibp aibpVar = (aibp) obj;
        int iOrdinal = aibpVar.ordinal();
        if (iOrdinal == 0) {
            return ahyb.UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return ahyb.TRUE;
        }
        if (iOrdinal == 2) {
            return ahyb.FALSE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(aibpVar.toString()));
    }
}
