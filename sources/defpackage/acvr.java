package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acvr {
    private static final avlh e = avlh.G(0);
    private static final avlh f = avlh.G(0);
    private static final avlh g = avlh.G(0);
    public final avlh a;
    public final avlh b;
    public final avlh c;
    public final int d;

    public acvr(avlh avlhVar, avlh avlhVar2, avlh avlhVar3) {
        this.d = 1;
        this.a = avlhVar;
        this.b = avlhVar2;
        this.c = avlhVar3;
    }

    public static acvr a() {
        avlh avlhVar = e;
        if (avlhVar == null) {
            throw new NullPointerException("Null topOffset");
        }
        avlh avlhVar2 = f;
        if (avlhVar2 == null) {
            throw new NullPointerException("Null bottomOffset");
        }
        avlh avlhVar3 = g;
        if (avlhVar3 != null) {
            return new acvr(avlhVar, avlhVar2, avlhVar3);
        }
        throw new NullPointerException("Null landscapePromoVideoStartOffset");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acvr) {
            acvr acvrVar = (acvr) obj;
            int i = this.d;
            int i2 = acvrVar.d;
            if (i == 0) {
                throw null;
            }
            if (i2 == 1 && this.a.equals(acvrVar.a) && this.b.equals(acvrVar.b) && this.c.equals(acvrVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a.bj(this.d);
        return ((((this.a.hashCode() ^ (-722379962)) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.d != 1 ? "null" : "CENTER";
        avlh avlhVar = this.a;
        avlh avlhVar2 = this.b;
        avlh avlhVar3 = this.c;
        return "ReelPlayerViewLayout{verticalAlignment=" + str + ", topOffset=" + String.valueOf(avlhVar) + ", bottomOffset=" + String.valueOf(avlhVar2) + ", landscapePromoVideoStartOffset=" + String.valueOf(avlhVar3) + '}';
    }

    public acvr() {
        throw null;
    }
}
