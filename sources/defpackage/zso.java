package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zso extends zsr {
    public final zvh a;
    public final akku b;

    public zso(zvh zvhVar, akku akkuVar) {
        this.a = zvhVar;
        this.b = akkuVar;
    }

    @Override // defpackage.zsr
    public final zvh a() {
        return this.a;
    }

    @Override // defpackage.zsr
    public final akku b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zsr) {
            zsr zsrVar = (zsr) obj;
            if (this.a.equals(zsrVar.a())) {
                akku akkuVar = this.b;
                if (akkuVar == null) {
                    if (zsrVar.b() == null) {
                        return true;
                    }
                } else if (akkuVar.equals(zsrVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        akku akkuVar = this.b;
        return (iHashCode * 1000003) ^ (akkuVar == null ? 0 : akkuVar.hashCode());
    }

    public final String toString() {
        akku akkuVar = this.b;
        return "BatchContext{visitorContext=" + this.a.toString() + ", tier=" + String.valueOf(akkuVar) + '}';
    }
}
