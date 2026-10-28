package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asbr extends aihn implements aiis {
    public static final asbr a;
    public int b;
    public long c;
    private int d;
    private aiip e = aiip.a;

    static {
        asbr asbrVar = new asbr();
        a = asbrVar;
        aihn.registerDefaultInstance(asbr.class, asbrVar);
    }

    private asbr() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aika aikaVar = aika.INT32;
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0001\u0000\u0000\u0001ဋ\u0000\u0002ဃ\u0001\u00042", new Object[]{"d", "b", "c", "e", new ahud(aikaVar, (Object) 0, aikaVar, (Object) 0)});
        }
        if (iOrdinal == 3) {
            return new asbr();
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
        return aihn.getParserForClass(asbr.class);
    }
}
