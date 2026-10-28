package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nvf {
    public static final boolean a(aiff aiffVar) {
        int iAS;
        aiffVar.getClass();
        aidu aiduVarA = aidu.a(aiffVar.d);
        if (aiduVarA == null) {
            aiduVarA = aidu.DELETION_STATUS_UNKNOWN;
        }
        return aiduVarA == aidu.DELETED || ((iAS = a.aS(aiffVar.f)) != 0 && iAS == 3);
    }
}
