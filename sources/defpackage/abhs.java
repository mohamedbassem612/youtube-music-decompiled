package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abhs {
    public static final abhs a;
    public static final abhs b;
    public static final abhs c;
    public static final abhs d;
    public static final abhs e;
    public static final abhs f;
    public static final abhs g;
    public static final abhs h;
    public static final abhs i;
    private static final /* synthetic */ abhs[] j;

    static {
        abhs abhsVar = new abhs("AD_MARKER", 0);
        a = abhsVar;
        abhs abhsVar2 = new abhs("LIVE_AD_MARKER", 1);
        b = abhsVar2;
        abhs abhsVar3 = new abhs("UNKNOWN", 2);
        c = abhsVar3;
        abhs abhsVar4 = new abhs("CLIP_VIEWING", 3);
        d = abhsVar4;
        abhs abhsVar5 = new abhs("CLIP_CREATION", 4);
        e = abhsVar5;
        abhs abhsVar6 = new abhs("CHAPTER", 5);
        f = abhsVar6;
        abhs abhsVar7 = new abhs("TIMESTAMP_MARKER", 6);
        g = abhsVar7;
        abhs abhsVar8 = new abhs("HEATMAP_MARKER", 7);
        h = abhsVar8;
        abhs abhsVar9 = new abhs("KEY_MOMENT", 8);
        i = abhsVar9;
        j = new abhs[]{abhsVar, abhsVar2, abhsVar3, abhsVar4, abhsVar5, abhsVar6, abhsVar7, abhsVar8, abhsVar9};
    }

    public static abhs[] values() {
        return (abhs[]) j.clone();
    }
}
