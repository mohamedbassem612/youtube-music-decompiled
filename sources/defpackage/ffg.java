package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ffg extends afv {
    private int e;

    @Override // defpackage.aha, java.util.Map
    public final void clear() {
        this.e = 0;
        super.clear();
    }

    @Override // defpackage.aha
    public final Object e(int i) {
        this.e = 0;
        return super.e(i);
    }

    @Override // defpackage.aha
    public final Object f(int i, Object obj) {
        this.e = 0;
        return super.f(i, obj);
    }

    @Override // defpackage.aha, java.util.Map
    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode();
        this.e = iHashCode;
        return iHashCode;
    }

    @Override // defpackage.aha
    public final void i(aha ahaVar) {
        this.e = 0;
        super.i(ahaVar);
    }

    @Override // defpackage.aha, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.e = 0;
        return super.put(obj, obj2);
    }
}
