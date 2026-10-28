package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aabm {
    public static final aabm a;
    public static final aabm b;
    public static final aabm c;
    public static final aabm d;
    public static final aabm e;
    public static final aabm f;
    private static final /* synthetic */ aabm[] g;

    static {
        aabm aabmVar = new aabm("BIG_PICTURE", 0);
        a = aabmVar;
        aabm aabmVar2 = new aabm("BIG_LARGE_ICON", 1);
        b = aabmVar2;
        aabm aabmVar3 = new aabm("CUSTOM_STYLE_THUMBNAIL", 2);
        c = aabmVar3;
        aabm aabmVar4 = new aabm("CUSTOM_STYLE_SHORTS_THUMBNAIL", 3);
        d = aabmVar4;
        aabm aabmVar5 = new aabm("LARGE_ICON", 4);
        e = aabmVar5;
        aabm aabmVar6 = new aabm("EXPANDED_CUSTOM_STYLE_SHORTS_THUMBNAIL", 5);
        f = aabmVar6;
        g = new aabm[]{aabmVar, aabmVar2, aabmVar3, aabmVar4, aabmVar5, aabmVar6};
    }

    public static aabm[] values() {
        return (aabm[]) g.clone();
    }
}
