package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agkv implements Serializable {
    private static final long serialVersionUID = 4183982527943143214L;
    private final agke a;

    public agkv(agke agkeVar) {
        this.a = agkeVar;
    }

    Object readResolve() {
        agke agkeVar = this.a;
        if (agkeVar.isEmpty()) {
            return agkw.a;
        }
        return aguu.v(agkeVar, agke.q(agpf.a)) ? agkw.b : new agkw(agkeVar);
    }
}
