package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class auge extends aihn implements aiis {
    public static final auge a;
    public static final aihl b;
    public aiip c = aiip.a;

    static {
        auge augeVar = new auge();
        a = augeVar;
        aihn.registerDefaultInstance(auge.class, augeVar);
        b = aihn.newSingularGeneratedExtension(aufs.a, augeVar, augeVar, null, 1012, aika.MESSAGE, auge.class);
    }

    private auge() {
    }

    public final aiip a() {
        aiip aiipVar = this.c;
        if (!aiipVar.b) {
            this.c = aiipVar.a();
        }
        return this.c;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", new ahud(aika.INT64, (Object) 0L, aika.MESSAGE, (Object) augd.a)});
        }
        if (iOrdinal == 3) {
            return new auge();
        }
        if (iOrdinal == 4) {
            return new aihf((int[]) null, (int[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(auge.class);
        }
        return null;
    }
}
