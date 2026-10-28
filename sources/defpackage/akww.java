package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akww extends aihn implements aiis {
    public static final akww a;
    public int b;
    public aiip c;
    public akda d;
    private aiip e;

    static {
        akww akwwVar = new akww();
        a = akwwVar;
        aihn.registerDefaultInstance(akww.class, akwwVar);
    }

    private akww() {
        aiip aiipVar = aiip.a;
        this.c = aiipVar;
        this.e = aiipVar;
    }

    public final aiip a() {
        return this.c;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aika aikaVar = aika.INT64;
            aika aikaVar2 = aika.MESSAGE;
            akwx akwxVar = akwx.a;
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0002\u0000\u0000\u00012\u00022\u0004ဉ\u0000", new Object[]{"b", "c", new ahud(aikaVar, (Object) 0L, aikaVar2, (Object) akwxVar), "e", new ahud(aikaVar, (Object) 0L, aikaVar2, (Object) akwxVar), "d"});
        }
        if (iOrdinal == 3) {
            return new akww();
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
        return aihn.getParserForClass(akww.class);
    }
}
