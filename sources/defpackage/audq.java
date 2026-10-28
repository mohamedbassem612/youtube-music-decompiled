package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class audq extends aihn implements aiis {
    public static final aihw a = new apej(11);
    public static final audq b;
    public int c;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public String d = "";
    public aihv m = emptyIntList();

    static {
        audq audqVar = new audq();
        b = audqVar;
        aihn.registerDefaultInstance(audq.class, audqVar);
    }

    private audq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nࠬ", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", atxs.l});
        }
        if (iOrdinal == 3) {
            return new audq();
        }
        if (iOrdinal == 4) {
            return new aihf(b);
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(audq.class);
    }
}
