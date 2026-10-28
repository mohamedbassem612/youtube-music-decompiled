package defpackage;

import j$.util.Objects;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agwj {
    public final agwi a;
    private final Comparator b = null;

    public agwj(agwi agwiVar) {
        this.a = agwiVar;
        ahno.O(agwiVar != agwi.d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agwj) {
            agwj agwjVar = (agwj) obj;
            if (this.a == agwjVar.a) {
                Comparator comparator = agwjVar.b;
                if (Objects.equals(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, null);
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.b("type", this.a);
        return ageuVarAc.toString();
    }
}
