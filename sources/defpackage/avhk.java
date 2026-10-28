package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avhk {
    public final avjg a;
    public final Object b;
    public final Map c;
    private final avhi d;
    private final Map e;
    private final Map f;

    public avhk(avhi avhiVar, Map map, Map map2, avjg avjgVar, Object obj, Map map3) {
        this.d = avhiVar;
        this.e = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f = DesugarCollections.unmodifiableMap(new HashMap(map2));
        this.a = avjgVar;
        this.b = obj;
        this.c = map3 != null ? DesugarCollections.unmodifiableMap(new HashMap(map3)) : null;
    }

    final auzx a() {
        if (this.f.isEmpty() && this.e.isEmpty() && this.d == null) {
            return null;
        }
        return new avhj(this);
    }

    final avhi b(avbh avbhVar) {
        avhi avhiVar = (avhi) this.e.get(avbhVar.b);
        if (avhiVar == null) {
            avhiVar = (avhi) this.f.get(avbhVar.c);
        }
        return avhiVar == null ? this.d : avhiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            avhk avhkVar = (avhk) obj;
            if (Objects.equals(this.d, avhkVar.d) && Objects.equals(this.e, avhkVar.e) && Objects.equals(this.f, avhkVar.f) && Objects.equals(this.a, avhkVar.a) && Objects.equals(this.b, avhkVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.e, this.f, this.a, this.b);
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.b("defaultMethodConfig", this.d);
        ageuVarAc.b("serviceMethodMap", this.e);
        ageuVarAc.b("serviceMap", this.f);
        ageuVarAc.b("retryThrottling", this.a);
        ageuVarAc.b("loadBalancingConfig", this.b);
        return ageuVarAc.toString();
    }
}
