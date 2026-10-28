package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adzp {
    public static final adzp a;
    public static final adzp b;
    public static final adzp c;
    public static final adzp d;
    public static final adzp e;
    public static final adzp f;
    public static final adzp g;
    public static final adzp h;
    public static final adzp i;
    private static final /* synthetic */ adzp[] j;

    static {
        adzp adzpVar = new adzp("BOTTOM_RIGHT", 0);
        a = adzpVar;
        adzp adzpVar2 = new adzp("BOTTOM_CENTER", 1);
        b = adzpVar2;
        adzp adzpVar3 = new adzp("BOTTOM_LEFT", 2);
        c = adzpVar3;
        adzp adzpVar4 = new adzp("TOP_RIGHT", 3);
        d = adzpVar4;
        adzp adzpVar5 = new adzp("TOP_CENTER", 4);
        e = adzpVar5;
        adzp adzpVar6 = new adzp("TOP_LEFT", 5);
        f = adzpVar6;
        adzp adzpVar7 = new adzp("RIGHT", 6);
        g = adzpVar7;
        adzp adzpVar8 = new adzp("LEFT", 7);
        h = adzpVar8;
        adzp adzpVar9 = new adzp("NO_ANCHOR", 8);
        i = adzpVar9;
        adzp[] adzpVarArr = {adzpVar, adzpVar2, adzpVar3, adzpVar4, adzpVar5, adzpVar6, adzpVar7, adzpVar8, adzpVar9};
        j = adzpVarArr;
        JniZero.m(adzpVarArr);
    }

    public static adzp[] values() {
        return (adzp[]) j.clone();
    }
}
