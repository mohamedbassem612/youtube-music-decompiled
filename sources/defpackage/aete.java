package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aete extends aetg {
    @Override // defpackage.aetg
    public final boolean c(Object[] objArr) {
        for (Object obj : objArr) {
            obj.getClass();
            if (!((Boolean) obj).booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
