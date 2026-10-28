package defpackage;

import j$.util.Objects;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avjr {
    public final String a;
    public final Map b;

    public avjr(String str, Map map) {
        str.getClass();
        this.a = str;
        map.getClass();
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof avjr)) {
            return false;
        }
        avjr avjrVar = (avjr) obj;
        return this.a.equals(avjrVar.a) && this.b.equals(avjrVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.b("policyName", this.a);
        ageuVarAc.b("rawConfigValue", this.b);
        return ageuVarAc.toString();
    }
}
