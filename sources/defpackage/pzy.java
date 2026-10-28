package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pzy {
    public static final pzy a;
    public static final pzy b;
    public static final pzy c;
    private static final /* synthetic */ pzy[] d;

    static {
        pzy pzyVar = new pzy("CLEARTEXT", 0);
        a = pzyVar;
        pzy pzyVar2 = new pzy("ENCRYPTED", 1);
        b = pzyVar2;
        pzy pzyVar3 = new pzy("PLACEHOLDER", 2);
        c = pzyVar3;
        pzy[] pzyVarArr = {pzyVar, pzyVar2, pzyVar3};
        d = pzyVarArr;
        JniZero.m(pzyVarArr);
    }

    public static pzy[] values() {
        return (pzy[]) d.clone();
    }
}
