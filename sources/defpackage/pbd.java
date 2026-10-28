package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pbd {
    public static final pbd a;
    public static final pbd b;
    private static final /* synthetic */ pbd[] c;

    static {
        pbd pbdVar = new pbd("SYSTEM_TRAY", 0);
        a = pbdVar;
        pbd pbdVar2 = new pbd("INBOX", 1);
        b = pbdVar2;
        pbd[] pbdVarArr = {pbdVar, pbdVar2};
        c = pbdVarArr;
        JniZero.m(pbdVarArr);
    }

    public static pbd[] values() {
        return (pbd[]) c.clone();
    }
}
