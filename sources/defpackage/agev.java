package defpackage;

import j$.util.Optional;
import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class agev implements Serializable {
    private static final long serialVersionUID = 0;

    public static agev h(Object obj) {
        return obj == null ? agdf.a : new agfa(obj);
    }

    public static agev i(Object obj) {
        obj.getClass();
        return new agfa(obj);
    }

    public abstract agev a(agek agekVar);

    public abstract Object c();

    public abstract Object d(agfr agfrVar);

    public abstract Object e(Object obj);

    public abstract boolean equals(Object obj);

    public abstract Object f();

    public abstract boolean g();

    public abstract int hashCode();

    public final Optional j() {
        return Optional.ofNullable(f());
    }
}
