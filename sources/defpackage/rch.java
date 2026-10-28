package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rch {
    private final boolean a;
    private final boolean b;
    private final agke c;

    public rch(boolean z, boolean z2, agke agkeVar) {
        this.a = z;
        this.b = z2;
        if (agkeVar == null) {
            throw new NullPointerException("Null effectMergingKeys");
        }
        this.c = agkeVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rch) {
            rch rchVar = (rch) obj;
            if (this.a == rchVar.a && this.b == rchVar.b && aguu.v(this.c, rchVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "VideoLayerKey{loopingEnabled=" + this.a + ", enabled=" + this.b + ", effectMergingKeys=" + this.c.toString() + ", shouldUseDataSourceFactoryProcessor=false}";
    }

    public rch() {
        throw null;
    }
}
