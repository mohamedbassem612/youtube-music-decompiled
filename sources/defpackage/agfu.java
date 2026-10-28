package defpackage;

import j$.util.Objects;
import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agfu implements Serializable, agfr {
    private static final long serialVersionUID = 0;
    public final Object a;

    public agfu(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.agfr
    public final boolean equals(Object obj) {
        if (obj instanceof agfu) {
            return Objects.equals(this.a, ((agfu) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    @Override // defpackage.agfr
    public final Object io() {
        return this.a;
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.a.toString() + ')';
    }
}
