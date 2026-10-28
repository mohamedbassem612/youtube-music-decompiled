package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bob {
    public static final bob a;
    public static final bob b;
    public static final bob c;
    public static final bob d;
    public static final bob e;
    private static final /* synthetic */ bob[] f;

    static {
        bob bobVar = new bob("DESTROYED", 0);
        a = bobVar;
        bob bobVar2 = new bob("INITIALIZED", 1);
        b = bobVar2;
        bob bobVar3 = new bob("CREATED", 2);
        c = bobVar3;
        bob bobVar4 = new bob("STARTED", 3);
        d = bobVar4;
        bob bobVar5 = new bob("RESUMED", 4);
        e = bobVar5;
        bob[] bobVarArr = {bobVar, bobVar2, bobVar3, bobVar4, bobVar5};
        f = bobVarArr;
        JniZero.m(bobVarArr);
    }

    public static bob[] values() {
        return (bob[]) f.clone();
    }

    public final boolean a(bob bobVar) {
        return compareTo(bobVar) >= 0;
    }
}
