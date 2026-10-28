package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mfr {
    public final Object a;
    public final Object b;

    public mfr(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mfr) {
            mfr mfrVar = (mfr) obj;
            Object obj2 = this.a;
            if (obj2 != null ? obj2.equals(mfrVar.a) : mfrVar.a == null) {
                Object obj3 = this.b;
                if (obj3 == null) {
                    if (mfrVar.b == null) {
                        return true;
                    }
                } else if (obj3.equals(mfrVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        Object obj = this.b;
        return "BottomSheetData{interactionLogger=" + String.valueOf(this.a) + ", elementRenderer=" + String.valueOf(obj) + '}';
    }

    public mfr() {
        throw null;
    }
}
