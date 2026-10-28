package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yxj {
    public static final yxj a;
    public static final yxj b;
    public static final yxj c;
    private static final /* synthetic */ yxj[] d;

    static {
        yxj yxjVar = new yxj("PRIMARY", 0);
        a = yxjVar;
        yxj yxjVar2 = new yxj("AUXILIARY_PREFETCH", 1);
        b = yxjVar2;
        yxj yxjVar3 = new yxj("OUTGOING_FADING", 2);
        c = yxjVar3;
        yxj[] yxjVarArr = {yxjVar, yxjVar2, yxjVar3};
        d = yxjVarArr;
        JniZero.m(yxjVarArr);
    }

    public static yxj[] values() {
        return (yxj[]) d.clone();
    }
}
