package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lzv {
    public static final lzv a;
    public static final lzv b;
    public static final lzv c;
    public static final lzv d;
    public static final lzv e;
    public static final lzv f;
    public static final lzv g;
    public static final lzv h;
    public static final lzv i;
    private static final /* synthetic */ lzv[] j;

    static {
        lzv lzvVar = new lzv("INT", 0);
        a = lzvVar;
        lzv lzvVar2 = new lzv("LONG", 1);
        b = lzvVar2;
        lzv lzvVar3 = new lzv("FLOAT", 2);
        c = lzvVar3;
        lzv lzvVar4 = new lzv("DOUBLE", 3);
        d = lzvVar4;
        lzv lzvVar5 = new lzv("BOOLEAN", 4);
        e = lzvVar5;
        lzv lzvVar6 = new lzv("STRING", 5);
        f = lzvVar6;
        lxa lxaVar = lxa.d;
        lzv lzvVar7 = new lzv("BYTE_STRING", 6);
        g = lzvVar7;
        lzv lzvVar8 = new lzv("ENUM", 7);
        h = lzvVar8;
        lzv lzvVar9 = new lzv("MESSAGE", 8);
        i = lzvVar9;
        j = new lzv[]{lzvVar, lzvVar2, lzvVar3, lzvVar4, lzvVar5, lzvVar6, lzvVar7, lzvVar8, lzvVar9};
    }

    public static lzv[] values() {
        return (lzv[]) j.clone();
    }
}
