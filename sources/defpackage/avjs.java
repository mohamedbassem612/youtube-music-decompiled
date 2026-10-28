package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avjs {
    final avav a;
    final Object b;

    public avjs(avav avavVar, Object obj) {
        this.a = avavVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            avjs avjsVar = (avjs) obj;
            if (Objects.equals(this.a, avjsVar.a) && Objects.equals(this.b, avjsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.b("provider", this.a);
        ageuVarAc.b("config", this.b);
        return ageuVarAc.toString();
    }
}
