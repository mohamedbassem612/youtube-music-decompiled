package defpackage;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tmr {
    public final tmp a;
    public final tmt b;

    public tmr(tmp tmpVar, tmt tmtVar) {
        this.a = tmpVar;
        this.b = tmtVar;
    }

    public static tmr a(tmt tmtVar, Supplier supplier, IntSupplier intSupplier) {
        tmq tmqVar = new tmq(supplier.get(), intSupplier.getAsInt());
        aftj aftjVar = new aftj();
        aftjVar.j(tmtVar);
        aftjVar.a = new tmi(tmqVar);
        return aftjVar.i();
    }

    public static tmr b(tmt tmtVar, Supplier supplier) {
        aftj aftjVar = new aftj();
        aftjVar.j(tmtVar);
        aftjVar.a = tym.aI((byte[]) supplier.get());
        return aftjVar.i();
    }

    public final boolean c() {
        return this.a.b() == 2;
    }

    public final byte[] d() {
        return this.a.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tmr) {
            tmr tmrVar = (tmr) obj;
            if (this.a.equals(tmrVar.a) && this.b.equals(tmrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        tmt tmtVar = this.b;
        return "CacheEntry{item=" + String.valueOf(this.a) + ", metadata=" + String.valueOf(tmtVar) + '}';
    }

    public tmr() {
        throw null;
    }
}
