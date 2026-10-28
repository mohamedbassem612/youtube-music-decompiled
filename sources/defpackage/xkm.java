package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xkm {
    public static final xkm a;
    public static final xkm b;
    public static final xkm c;
    public static final xkm d;
    public static final /* synthetic */ awpl e;
    private static final /* synthetic */ xkm[] f;

    static {
        xkm xkmVar = new xkm("CLEARCUT", 0);
        a = xkmVar;
        xkm xkmVar2 = new xkm("DELAYED_204", 1);
        b = xkmVar2;
        xkm xkmVar3 = new xkm("DIRECT_204", 2);
        c = xkmVar3;
        xkm xkmVar4 = new xkm("GEL", 3);
        d = xkmVar4;
        xkm[] xkmVarArr = {xkmVar, xkmVar2, xkmVar3, xkmVar4};
        f = xkmVarArr;
        e = JniZero.m(xkmVarArr);
    }

    public static xkm[] values() {
        return (xkm[]) f.clone();
    }
}
