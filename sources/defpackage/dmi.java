package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dmi {
    public static final dmi a;
    public static final dmi b;
    public static final dmi c;
    private static final /* synthetic */ dmi[] d;

    static {
        dmi dmiVar = new dmi("NO_OP", 0);
        a = dmiVar;
        dmi dmiVar2 = new dmi("ADD", 1);
        b = dmiVar2;
        dmi dmiVar3 = new dmi("REMOVE", 2);
        c = dmiVar3;
        dmi[] dmiVarArr = {dmiVar, dmiVar2, dmiVar3};
        d = dmiVarArr;
        JniZero.m(dmiVarArr);
    }

    public static dmi[] values() {
        return (dmi[]) d.clone();
    }
}
