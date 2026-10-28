package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bkm {
    public static final bkm a;
    public static final bkm b;
    public static final bkm c;
    public static final bkm d;
    public static final bkm e;
    public static final bkm f;
    public static final bkm g;
    public static final bkm h;
    public static final bkm i;
    private static final /* synthetic */ bkm[] j;

    static {
        bkm bkmVar = new bkm("INT", 0);
        a = bkmVar;
        bkm bkmVar2 = new bkm("LONG", 1);
        b = bkmVar2;
        bkm bkmVar3 = new bkm("FLOAT", 2);
        c = bkmVar3;
        bkm bkmVar4 = new bkm("DOUBLE", 3);
        d = bkmVar4;
        bkm bkmVar5 = new bkm("BOOLEAN", 4);
        e = bkmVar5;
        bkm bkmVar6 = new bkm("STRING", 5);
        f = bkmVar6;
        bhy bhyVar = bhy.d;
        bkm bkmVar7 = new bkm("BYTE_STRING", 6);
        g = bkmVar7;
        bkm bkmVar8 = new bkm("ENUM", 7);
        h = bkmVar8;
        bkm bkmVar9 = new bkm("MESSAGE", 8);
        i = bkmVar9;
        j = new bkm[]{bkmVar, bkmVar2, bkmVar3, bkmVar4, bkmVar5, bkmVar6, bkmVar7, bkmVar8, bkmVar9};
    }

    public static bkm[] values() {
        return (bkm[]) j.clone();
    }
}
