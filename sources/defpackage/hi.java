package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hi extends ho {
    final /* synthetic */ ikm a;

    public hi(ikm ikmVar) {
        this.a = ikmVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ho
    public final int a() {
        return this.a.d.size();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ho
    public final int b() {
        return this.a.c.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ho
    public final boolean c(int i, int i2) {
        ikm ikmVar = this.a;
        ?? r0 = ikmVar.d;
        Object obj = ikmVar.c.get(i);
        Object obj2 = r0.get(i2);
        if (obj != null) {
            if (obj2 != null) {
                qon qonVar = (qon) obj;
                qon qonVar2 = (qon) obj2;
                return qonVar.a.equals(qonVar2.a) && qonVar.b == qonVar2.b && qonVar.c == qonVar2.c;
            }
        } else if (obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ho
    public final boolean d(int i, int i2) {
        ikm ikmVar = this.a;
        ?? r0 = ikmVar.d;
        Object obj = ikmVar.c.get(i);
        Object obj2 = r0.get(i2);
        if (obj != null) {
            if (obj2 != null) {
                return ((qon) obj).a.equals(((qon) obj2).a);
            }
        } else if (obj2 == null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ho
    public final void e(int i, int i2) {
        ikm ikmVar = this.a;
        ?? r0 = ikmVar.d;
        Object obj = ikmVar.c.get(i);
        Object obj2 = r0.get(i2);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
    }
}
