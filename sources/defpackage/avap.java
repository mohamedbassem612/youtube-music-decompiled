package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avap {
    public final List a;
    public final auyo b;
    public final Object c;

    public avap(List list, auyo auyoVar, Object obj) {
        list.getClass();
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
        auyoVar.getClass();
        this.b = auyoVar;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof avap)) {
            return false;
        }
        avap avapVar = (avap) obj;
        return Objects.equals(this.a, avapVar.a) && Objects.equals(this.b, avapVar.b) && Objects.equals(this.c, avapVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.b("addresses", this.a);
        ageuVarAc.b("loadBalancingPolicyConfig", this.c);
        ageuVarAc.b("attributes", this.b);
        return ageuVarAc.toString();
    }
}
