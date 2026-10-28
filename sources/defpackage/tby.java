package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tby implements tbs {
    @Override // defpackage.tbs
    public final tbv[] a(Object obj, Class cls, Object obj2) {
        int length;
        if (!(obj instanceof tbw)) {
            return null;
        }
        tbw tbwVar = (tbw) obj;
        Class[] clsArrA = tbwVar.a();
        if (clsArrA == null || (length = clsArrA.length) <= 0) {
            throw new IllegalArgumentException(String.format("Class %s does not contain any injected methods annotated with @Subscribe", cls.getSimpleName()));
        }
        tbx tbxVar = new tbx(tbwVar, clsArrA);
        tbv[] tbvVarArr = new tbv[length];
        for (int i = 0; i < clsArrA.length; i++) {
            tbvVarArr[i] = new tbv(obj, clsArrA[i], obj2, tbxVar);
        }
        return tbvVarArr;
    }
}
