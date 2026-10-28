package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atrw extends aihn implements aiis {
    public static final atrw a;
    public int b;
    public int c;
    public String d = "";
    public float e;
    public int f;
    public int g;
    public int h;
    public atrq i;
    public int j;
    public float k;
    public atrz l;

    static {
        atrw atrwVar = new atrw();
        a = atrwVar;
        aihn.registerDefaultInstance(atrw.class, atrwVar);
    }

    private atrw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007ဉ\u0006\bဋ\u0007\tခ\b\nဉ\t", new Object[]{"b", "c", "d", "e", "f", assp.l, "g", assp.k, "h", atxs.b, "i", "j", "k", "l"});
        }
        if (iOrdinal == 3) {
            return new atrw();
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
        return aihn.getParserForClass(atrw.class);
    }
}
