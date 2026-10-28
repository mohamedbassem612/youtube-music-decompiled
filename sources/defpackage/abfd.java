package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abfd {
    public static final abfd a;
    public static final abfd b;
    public static final abfd c;
    private static final /* synthetic */ abfd[] d;

    static {
        abfd abfdVar = new abfd("PASSTHROUGH", 0);
        a = abfdVar;
        abfd abfdVar2 = new abfd("LIFA", 1);
        b = abfdVar2;
        abfd abfdVar3 = new abfd("LIFA_PIP", 2);
        c = abfdVar3;
        abfd[] abfdVarArr = {abfdVar, abfdVar2, abfdVar3};
        d = abfdVarArr;
        JniZero.m(abfdVarArr);
    }

    public static abfd[] values() {
        return (abfd[]) d.clone();
    }
}
