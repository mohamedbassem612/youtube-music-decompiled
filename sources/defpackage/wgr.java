package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wgr {
    public static final wgr a;
    public static final wgr b;
    public static final wgr c;
    public static final wgr d;
    public static final wgr e;
    public static final wgr f;
    public static final wgr g;
    public static final wgr h;
    public static final wgr i;
    public static final wgr j;
    public static final wgr k;
    public static final wgr l;
    private static final /* synthetic */ wgr[] m;

    static {
        wgr wgrVar = new wgr("UNKNOWN", 0);
        a = wgrVar;
        wgr wgrVar2 = new wgr("OPUS", 1);
        b = wgrVar2;
        wgr wgrVar3 = new wgr("AAC", 2);
        c = wgrVar3;
        wgr wgrVar4 = new wgr("XHEAAC", 3);
        d = wgrVar4;
        wgr wgrVar5 = new wgr("AC3", 4);
        e = wgrVar5;
        wgr wgrVar6 = new wgr("EAC3", 5);
        f = wgrVar6;
        wgr wgrVar7 = new wgr("DTS", 6);
        g = wgrVar7;
        wgr wgrVar8 = new wgr("H264", 7);
        h = wgrVar8;
        wgr wgrVar9 = new wgr("VP9", 8);
        i = wgrVar9;
        wgr wgrVar10 = new wgr("AV1", 9);
        j = wgrVar10;
        wgr wgrVar11 = new wgr("VP9HDR", 10);
        k = wgrVar11;
        wgr wgrVar12 = new wgr("PROGRESSIVE", 11);
        l = wgrVar12;
        m = new wgr[]{wgrVar, wgrVar2, wgrVar3, wgrVar4, wgrVar5, wgrVar6, wgrVar7, wgrVar8, wgrVar9, wgrVar10, wgrVar11, wgrVar12};
    }

    public static wgr[] values() {
        return (wgr[]) m.clone();
    }
}
