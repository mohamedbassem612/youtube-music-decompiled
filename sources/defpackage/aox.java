package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aox {
    public static final aox a;
    public static final aox b;
    public static final aox c;
    private static final /* synthetic */ aox[] d;

    static {
        aox aoxVar = new aox("On", 0);
        a = aoxVar;
        aox aoxVar2 = new aox("Off", 1);
        b = aoxVar2;
        aox aoxVar3 = new aox("Indeterminate", 2);
        c = aoxVar3;
        aox[] aoxVarArr = {aoxVar, aoxVar2, aoxVar3};
        d = aoxVarArr;
        JniZero.m(aoxVarArr);
    }

    public static aox[] values() {
        return (aox[]) d.clone();
    }
}
