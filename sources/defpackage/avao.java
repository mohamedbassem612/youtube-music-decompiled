package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avao {
    public final auyq a;
    public final avbe b;
    public final avbh c;
    private final avam d;

    public avao(avbh avbhVar, avbe avbeVar, auyq auyqVar, avam avamVar) {
        avbhVar.getClass();
        this.c = avbhVar;
        avbeVar.getClass();
        this.b = avbeVar;
        auyqVar.getClass();
        this.a = auyqVar;
        avamVar.getClass();
        this.d = avamVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            avao avaoVar = (avao) obj;
            if (Objects.equals(this.a, avaoVar.a) && Objects.equals(this.b, avaoVar.b) && Objects.equals(this.c, avaoVar.c) && Objects.equals(this.d, avaoVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        auyq auyqVar = this.a;
        avbe avbeVar = this.b;
        return "[method=" + this.c.toString() + " headers=" + avbeVar.toString() + " callOptions=" + auyqVar.toString() + ']';
    }

    public avao() {
        throw null;
    }
}
