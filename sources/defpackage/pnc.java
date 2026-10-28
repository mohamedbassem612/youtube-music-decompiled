package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pnc {
    public static final pnc a;
    public static final pnc b;
    public static final pnc c;
    private static final /* synthetic */ pnc[] d;

    static {
        pnc pncVar = new pnc("INVALID", 0);
        a = pncVar;
        pnc pncVar2 = new pnc("SYSTEM_TRAY", 1);
        b = pncVar2;
        pnc pncVar3 = new pnc("IN_APP", 2);
        c = pncVar3;
        pnc[] pncVarArr = {pncVar, pncVar2, pncVar3};
        d = pncVarArr;
        JniZero.m(pncVarArr);
    }

    public static pnc[] values() {
        return (pnc[]) d.clone();
    }
}
