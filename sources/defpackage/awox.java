package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awox {
    public static final awox a;
    public static final awox b;
    public static final awox c;
    private static final /* synthetic */ awox[] d;

    static {
        awox awoxVar = new awox("COROUTINE_SUSPENDED", 0);
        a = awoxVar;
        awox awoxVar2 = new awox("UNDECIDED", 1);
        b = awoxVar2;
        awox awoxVar3 = new awox("RESUMED", 2);
        c = awoxVar3;
        awox[] awoxVarArr = {awoxVar, awoxVar2, awoxVar3};
        d = awoxVarArr;
        JniZero.m(awoxVarArr);
    }

    public static awox[] values() {
        return (awox[]) d.clone();
    }
}
