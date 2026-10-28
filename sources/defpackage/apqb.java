package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apqb extends aihn implements aiis {
    public static final apqb a;
    public static final aihl b;
    public int c;
    public String d = "";
    public boolean e;
    public boolean f;
    public boolean g;

    static {
        apqb apqbVar = new apqb();
        a = apqbVar;
        aihn.registerDefaultInstance(apqb.class, apqbVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apqbVar, apqbVar, null, 362581600, aika.MESSAGE, apqb.class);
    }

    private apqb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new apqb();
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
        return aihn.getParserForClass(apqb.class);
    }
}
