package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anvj extends aihn implements aiis {
    public static final anvj a;
    public static final aihl b;
    public boolean c;
    public String d = "";
    private int e;

    static {
        anvj anvjVar = new anvj();
        a = anvjVar;
        aihn.registerDefaultInstance(anvj.class, anvjVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, anvjVar, anvjVar, null, 438455759, aika.MESSAGE, anvj.class);
    }

    private anvj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001", new Object[]{"e", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new anvj();
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
        return aihn.getParserForClass(anvj.class);
    }
}
