package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uop {
    public static final uop a;
    public static final uop b;
    public static final uop c;
    private static final /* synthetic */ uop[] d;

    static {
        uop uopVar = new uop("FEEDBACK_NONE", 0);
        a = uopVar;
        uop uopVar2 = new uop("FEEDBACK_THUMB_UP", 1);
        b = uopVar2;
        uop uopVar3 = new uop("FEEDBACK_THUMB_DOWN", 2);
        c = uopVar3;
        uop[] uopVarArr = {uopVar, uopVar2, uopVar3};
        d = uopVarArr;
        JniZero.m(uopVarArr);
    }

    public static uop[] values() {
        return (uop[]) d.clone();
    }
}
