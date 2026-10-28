package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class apj {
    public static final apj a;
    public static final apj b;
    private static final /* synthetic */ apj[] c;

    static {
        apj apjVar = new apj("Ltr", 0);
        a = apjVar;
        apj apjVar2 = new apj("Rtl", 1);
        b = apjVar2;
        apj[] apjVarArr = {apjVar, apjVar2};
        c = apjVarArr;
        JniZero.m(apjVarArr);
    }

    public static apj[] values() {
        return (apj[]) c.clone();
    }
}
