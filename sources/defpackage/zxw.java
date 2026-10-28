package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class zxw implements zyh {
    public final zsl a;
    private final zsk b;

    protected zxw(zsk zskVar, zsl zslVar) {
        this.b = zskVar;
        this.a = zslVar;
    }

    @Override // defpackage.zyh
    public final void a(Object obj, sxu sxuVar) {
        try {
            Object objB = this.b.b(obj);
            b(objB, new zxv(this, obj, objB, sxuVar));
        } catch (tzn e) {
            c(obj, null, sxuVar, e);
        }
    }

    protected void b(Object obj, sxu sxuVar) {
        throw null;
    }

    protected void c(Object obj, Object obj2, sxu sxuVar, Exception exc) {
        sxuVar.iT(obj, exc);
    }
}
