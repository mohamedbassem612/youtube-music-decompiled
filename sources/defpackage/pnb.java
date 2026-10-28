package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pnb {
    public static final pnb a;
    public static final pnb b;
    public static final pnb c;
    private static final /* synthetic */ pnb[] d;

    static {
        pnb pnbVar = new pnb("CLEARTEXT", 0);
        a = pnbVar;
        pnb pnbVar2 = new pnb("ENCRYPTED", 1);
        b = pnbVar2;
        pnb pnbVar3 = new pnb("PLACEHOLDER", 2);
        c = pnbVar3;
        pnb[] pnbVarArr = {pnbVar, pnbVar2, pnbVar3};
        d = pnbVarArr;
        JniZero.m(pnbVarArr);
    }

    public static pnb[] values() {
        return (pnb[]) d.clone();
    }
}
