package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class awsl {
    public static final awsl a;
    public static final awsl b;
    public static final awsl c;
    public static final awsl d;
    private static final /* synthetic */ awsl[] e;

    static {
        awsl awslVar = new awsl("PUBLIC", 0);
        a = awslVar;
        awsl awslVar2 = new awsl("PROTECTED", 1);
        b = awslVar2;
        awsl awslVar3 = new awsl("INTERNAL", 2);
        c = awslVar3;
        awsl awslVar4 = new awsl("PRIVATE", 3);
        d = awslVar4;
        awsl[] awslVarArr = {awslVar, awslVar2, awslVar3, awslVar4};
        e = awslVarArr;
        JniZero.m(awslVarArr);
    }

    public static awsl[] values() {
        return (awsl[]) e.clone();
    }
}
