package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dzr {
    public static final dzr a;
    public static final dzr b;
    public static final dzr c;
    public static final dzr d;
    public static final dzr e;
    public static final dzr f;
    private static final /* synthetic */ dzr[] g;

    static {
        dzr dzrVar = new dzr("ENQUEUED", 0);
        a = dzrVar;
        dzr dzrVar2 = new dzr("RUNNING", 1);
        b = dzrVar2;
        dzr dzrVar3 = new dzr("SUCCEEDED", 2);
        c = dzrVar3;
        dzr dzrVar4 = new dzr("FAILED", 3);
        d = dzrVar4;
        dzr dzrVar5 = new dzr("BLOCKED", 4);
        e = dzrVar5;
        dzr dzrVar6 = new dzr("CANCELLED", 5);
        f = dzrVar6;
        dzr[] dzrVarArr = {dzrVar, dzrVar2, dzrVar3, dzrVar4, dzrVar5, dzrVar6};
        g = dzrVarArr;
        JniZero.m(dzrVarArr);
    }

    public static dzr[] values() {
        return (dzr[]) g.clone();
    }

    public final boolean a() {
        return this == c || this == d || this == f;
    }
}
