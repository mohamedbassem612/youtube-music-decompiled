package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class affv extends aihn implements aiis {
    public static final affv a;
    public int b;
    public int c;
    public int d;
    public int e;
    public aiie f = emptyProtobufList();
    public boolean g;
    public int h;
    public boolean i;
    public int j;

    static {
        affv affvVar = new affv();
        a = affvVar;
        aihn.registerDefaultInstance(affv.class, affvVar);
    }

    private affv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003᠌\u0002\u0004\u001a\u0005ဇ\u0003\u0006င\u0004\u0007ဇ\u0005\bင\u0006", new Object[]{"b", "c", "d", "e", fxi.l, "f", "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new affv();
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
        return aihn.getParserForClass(affv.class);
    }
}
