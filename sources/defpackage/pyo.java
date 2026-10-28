package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pyo {
    public static final pyo a;
    public static final pyo b;
    public static final pyo c;
    private static final /* synthetic */ pyo[] d;

    static {
        pyo pyoVar = new pyo("NOT_INTERCEPTED", 0);
        a = pyoVar;
        pyo pyoVar2 = new pyo("POSTPONED", 1);
        b = pyoVar2;
        pyo pyoVar3 = new pyo("DROP", 2);
        c = pyoVar3;
        pyo[] pyoVarArr = {pyoVar, pyoVar2, pyoVar3};
        d = pyoVarArr;
        JniZero.m(pyoVarArr);
    }

    public static pyo[] values() {
        return (pyo[]) d.clone();
    }
}
