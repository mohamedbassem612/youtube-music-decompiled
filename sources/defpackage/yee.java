package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yee {
    public static final yee a;
    public static final yee b;
    public static final yee c;
    private static final /* synthetic */ yee[] d;

    static {
        yee yeeVar = new yee("UNKNOWN", 0);
        a = yeeVar;
        yee yeeVar2 = new yee("AVAILABLE", 1);
        b = yeeVar2;
        yee yeeVar3 = new yee("UNAVAILABLE", 2);
        c = yeeVar3;
        yee[] yeeVarArr = {yeeVar, yeeVar2, yeeVar3};
        d = yeeVarArr;
        JniZero.m(yeeVarArr);
    }

    public static yee[] values() {
        return (yee[]) d.clone();
    }
}
