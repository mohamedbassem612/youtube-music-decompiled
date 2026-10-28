package defpackage;

import j$.util.Collection;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class shh {
    public static final shh a = b(new sht[0]);
    private final agkj b;

    public shh(agkj agkjVar) {
        if (agkjVar == null) {
            throw new NullPointerException("Null getterMap");
        }
        this.b = agkjVar;
    }

    public static shh a(List list) {
        return new shh((agkj) Collection.EL.stream(list).collect(aghu.a(new rxg(14), new rxg(15))));
    }

    public static shh b(sht... shtVarArr) {
        return a(Arrays.asList(shtVarArr));
    }

    public static shh c(shh shhVar, shh shhVar2) {
        agkh agkhVar = new agkh(4);
        agkhVar.i(shhVar.b);
        agkhVar.i(shhVar2.b);
        return a(new ArrayList(agkhVar.d(false).values()));
    }

    public final Object d(Class cls) {
        sht shtVar = (sht) this.b.get(cls);
        if (shtVar != null) {
            return shtVar.a;
        }
        throw new IllegalStateException("Unable to retrieve getter for class: ".concat(String.valueOf(cls.getName())));
    }

    public final boolean e(Class cls) {
        return this.b.containsKey(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof shh)) {
            return false;
        }
        agkj agkjVar = this.b;
        agkj agkjVar2 = ((shh) obj).b;
        if (agkjVar.size() != agkjVar2.size()) {
            return false;
        }
        agqr it = agkjVar.keySet().iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            if (!agkjVar2.containsKey(cls)) {
                return false;
            }
            sht shtVar = (sht) agkjVar.get(cls);
            shtVar.getClass();
            sht shtVar2 = (sht) agkjVar2.get(cls);
            shtVar2.getClass();
            if (!Objects.equals(shtVar.a, shtVar2.a)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.b);
    }

    public final String toString() {
        return "ClientMetadata{getterMap=" + this.b.toString() + '}';
    }

    public shh() {
        throw null;
    }
}
