package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agkt implements Serializable {
    private static final long serialVersionUID = -6456416336206982697L;
    final agku a;

    public agkt(agku agkuVar) {
        this.a = agkuVar;
    }

    Object readResolve() {
        return this.a.j();
    }
}
