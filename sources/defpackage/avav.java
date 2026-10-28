package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public abstract class avav extends avaj {
    private static final avbp a = new avbp(new avau());

    public avbp b(Map map) {
        return a;
    }

    public abstract String c();

    public abstract void d();

    public abstract void e();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.b("policy", c());
        ageuVarAc.e("priority", 5);
        ageuVarAc.g("available", true);
        return ageuVarAc.toString();
    }
}
