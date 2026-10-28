package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atrc extends aihn implements aiis {
    public static final atrc a;
    public static final aihl b;
    public int c;
    public atrl d;

    static {
        atrc atrcVar = new atrc();
        a = atrcVar;
        aihn.registerDefaultInstance(atrc.class, atrcVar);
        b = aihn.newSingularGeneratedExtension(atwa.a, atrcVar, atrcVar, null, 506165916, aika.MESSAGE, atrc.class);
    }

    private atrc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new atrc();
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
        return aihn.getParserForClass(atrc.class);
    }
}
