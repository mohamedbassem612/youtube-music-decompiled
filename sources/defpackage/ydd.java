package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ydd {
    public static final ydd a;
    public static final ydd b;
    public static final ydd c;
    public static final ydd d;
    private static final /* synthetic */ ydd[] e;

    static {
        ydd yddVar = new ydd("MISSING_LOUNGE_TOKEN", 0);
        a = yddVar;
        ydd yddVar2 = new ydd("EXPIRED_LOUNGE_TOKEN", 1);
        b = yddVar2;
        ydd yddVar3 = new ydd("INVALID_LOUNGE_TOKEN", 2);
        c = yddVar3;
        ydd yddVar4 = new ydd("AUTHENTICATE_USER_ERROR", 3);
        d = yddVar4;
        ydd[] yddVarArr = {yddVar, yddVar2, yddVar3, yddVar4};
        e = yddVarArr;
        JniZero.m(yddVarArr);
    }

    public static ydd[] values() {
        return (ydd[]) e.clone();
    }
}
