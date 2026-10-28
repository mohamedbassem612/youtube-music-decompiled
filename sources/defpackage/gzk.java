package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gzk {
    public static final gzk a;
    public static final gzk b;
    public static final gzk c;
    private static final /* synthetic */ gzk[] d;

    static {
        gzk gzkVar = new gzk("DEFAULT", 0);
        a = gzkVar;
        gzk gzkVar2 = new gzk("THUMBNAIL_TO_THE_SIDE", 1);
        b = gzkVar2;
        gzk gzkVar3 = new gzk("THUMBNAIL_ABOVE", 2);
        c = gzkVar3;
        d = new gzk[]{gzkVar, gzkVar2, gzkVar3};
    }

    public static gzk[] values() {
        return (gzk[]) d.clone();
    }
}
