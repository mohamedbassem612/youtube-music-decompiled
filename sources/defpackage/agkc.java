package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agkc implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    public agkc(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return agke.p(this.a);
    }
}
