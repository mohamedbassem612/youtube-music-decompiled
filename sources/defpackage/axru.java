package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axru {
    public static final axru a;
    public static final axru b;
    public static final axru c;
    public static final axru d;
    public static final axru e;
    public static final axru f;
    public static final axru g;
    public static final axru h;
    public static final axru i;
    private static final /* synthetic */ axru[] j;

    static {
        axru axruVar = new axru("INT", 0);
        a = axruVar;
        axru axruVar2 = new axru("LONG", 1);
        b = axruVar2;
        axru axruVar3 = new axru("FLOAT", 2);
        c = axruVar3;
        axru axruVar4 = new axru("DOUBLE", 3);
        d = axruVar4;
        axru axruVar5 = new axru("BOOLEAN", 4);
        e = axruVar5;
        axru axruVar6 = new axru("STRING", 5);
        f = axruVar6;
        axpo axpoVar = axpo.d;
        axru axruVar7 = new axru("BYTE_STRING", 6);
        g = axruVar7;
        axru axruVar8 = new axru("ENUM", 7);
        h = axruVar8;
        axru axruVar9 = new axru("MESSAGE", 8);
        i = axruVar9;
        j = new axru[]{axruVar, axruVar2, axruVar3, axruVar4, axruVar5, axruVar6, axruVar7, axruVar8, axruVar9};
    }

    public static axru[] values() {
        return (axru[]) j.clone();
    }
}
