package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agkk implements Serializable {
    private static final long serialVersionUID = 0;
    final agkj a;

    public agkk(agkj agkjVar) {
        this.a = agkjVar;
    }

    Object readResolve() {
        return this.a.entrySet();
    }
}
