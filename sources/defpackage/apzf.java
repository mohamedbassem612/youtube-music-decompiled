package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apzf extends aihn implements aiis {
    public static final apzf a;
    public static final aihl b;
    public int c;
    public String d = "";
    public String e = "";
    public int f;
    public apzg g;

    static {
        apzf apzfVar = new apzf();
        a = apzfVar;
        aihn.registerDefaultInstance(apzf.class, apzfVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apzfVar, apzfVar, null, 163005413, aika.MESSAGE, apzf.class);
    }

    private apzf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဋ\u0002\u0004ဉ\u0003", new Object[]{"c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new apzf();
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
        return aihn.getParserForClass(apzf.class);
    }
}
