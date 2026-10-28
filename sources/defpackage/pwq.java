package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class pwq extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aibq aibqVar = (aibq) obj;
        switch (aibqVar) {
            case IMPORTANCE_UNSPECIFIED:
                return ahyc.IMPORTANCE_UNSPECIFIED;
            case IMPORTANCE_NONE:
                return ahyc.IMPORTANCE_NONE;
            case IMPORTANCE_DEFAULT:
                return ahyc.IMPORTANCE_DEFAULT;
            case IMPORTANCE_HIGH:
                return ahyc.IMPORTANCE_HIGH;
            case IMPORTANCE_LOW:
                return ahyc.IMPORTANCE_LOW;
            case IMPORTANCE_MAX:
                return ahyc.IMPORTANCE_MAX;
            case IMPORTANCE_MIN:
                return ahyc.IMPORTANCE_MIN;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(aibqVar.toString()));
        }
    }
}
