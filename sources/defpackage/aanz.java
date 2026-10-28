package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aanz {
    public static final aanz a;
    public static final aanz b;
    public static final aanz c;
    private static final /* synthetic */ aanz[] d;

    static {
        aanz aanzVar = new aanz("KEEP", 0);
        a = aanzVar;
        aanz aanzVar2 = new aanz("DEQUEUE", 1);
        b = aanzVar2;
        aanz aanzVar3 = new aanz("CONTINGENT", 2);
        c = aanzVar3;
        aanz[] aanzVarArr = {aanzVar, aanzVar2, aanzVar3};
        d = aanzVarArr;
        JniZero.m(aanzVarArr);
    }

    public static aanz[] values() {
        return (aanz[]) d.clone();
    }
}
