package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aglj implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator a;
    final Object[] b;

    public aglj(Comparator comparator, Object[] objArr) {
        this.a = comparator;
        this.b = objArr;
    }

    Object readResolve() {
        agli agliVar = new agli(this.a);
        agliVar.o(this.b);
        return agliVar.g();
    }
}
