package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gft {
    public static final gft a;
    public static final gft b;
    public static final gft c;
    public static final gft d;
    public static final gft e;
    public static final gft f;
    public static final gft g;
    public static final gft h;
    public static final gft i;
    private static final /* synthetic */ gft[] j;

    static {
        gft gftVar = new gft("NONE", 0);
        a = gftVar;
        gft gftVar2 = new gft("NAVIGATION", 1);
        b = gftVar2;
        gft gftVar3 = new gft("WATCH", 2);
        c = gftVar3;
        gft gftVar4 = new gft("SEARCH", 3);
        d = gftVar4;
        gft gftVar5 = new gft("UNLIMITED", 4);
        e = gftVar5;
        gft gftVar6 = new gft("URL", 5);
        f = gftVar6;
        gft gftVar7 = new gft("SHORTCUT", 6);
        g = gftVar7;
        gft gftVar8 = new gft("BUNDLED", 7);
        h = gftVar8;
        gft gftVar9 = new gft("BLUETOOTH", 8);
        i = gftVar9;
        gft[] gftVarArr = {gftVar, gftVar2, gftVar3, gftVar4, gftVar5, gftVar6, gftVar7, gftVar8, gftVar9};
        j = gftVarArr;
        JniZero.m(gftVarArr);
    }

    public static gft[] values() {
        return (gft[]) j.clone();
    }
}
