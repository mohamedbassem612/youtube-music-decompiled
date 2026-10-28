package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mjb {
    public final mzt a;
    public final mzq b;
    private final nds c;

    public mjb(met metVar, nds ndsVar) {
        if (metVar instanceof mzt) {
            this.a = (mzt) metVar;
            this.b = null;
        } else {
            if (!(metVar instanceof mzq)) {
                throw new IllegalArgumentException("Invalid componentType");
            }
            this.b = (mzq) metVar;
            this.a = null;
        }
        this.c = ndsVar;
    }

    private final boolean a() {
        mzt mztVar = this.a;
        return (mztVar == null || mztVar.i() == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        mzt mztVar;
        mzt mztVar2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof mjb) {
            mjb mjbVar = (mjb) obj;
            if (a() && mjbVar.a() && (mztVar = this.a) != null && (mztVar2 = mjbVar.a) != null) {
                return mztVar.l().equals(mztVar2.l());
            }
            if (Objects.equals(this.a, mjbVar.a) && Objects.equals(this.b, mjbVar.b) && Objects.equals(this.c, mjbVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        mzt mztVar;
        if (a() && (mztVar = this.a) != null) {
            return mztVar.l().hashCode();
        }
        mzt mztVar2 = this.a;
        int iHashCode = mztVar2 == null ? 0 : mztVar2.hashCode();
        nds ndsVar = this.c;
        int iHashCode2 = iHashCode ^ (ndsVar == null ? 0 : ndsVar.hashCode());
        mzq mzqVar = this.b;
        return iHashCode2 ^ (mzqVar != null ? mzqVar.hashCode() : 0);
    }
}
