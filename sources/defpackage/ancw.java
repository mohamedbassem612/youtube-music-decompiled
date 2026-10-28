package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ancw extends aihn implements aiis {
    public static final ancw a;
    public int b;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public String c = "";
    public aihv l = emptyIntList();

    static {
        ancw ancwVar = new ancw();
        a = ancwVar;
        aihn.registerDefaultInstance(ancw.class, ancwVar);
    }

    private ancw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nࠬ", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", anbz.b});
        }
        if (iOrdinal == 3) {
            return new ancw();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(ancw.class);
    }
}
