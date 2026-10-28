package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agxt implements Serializable {
    private static final long serialVersionUID = 0;
    private final String a;
    private final int b;

    public agxt(String str, int i) {
        this.a = str;
        this.b = i;
    }

    private Object readResolve() {
        return new agxu(this.a, this.b);
    }
}
