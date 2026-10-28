package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aont extends aihn implements aiis {
    public static final aont a;
    public boolean c;
    private int d;
    private aiip e = aiip.a;
    public aiie b = emptyProtobufList();

    static {
        aont aontVar = new aont();
        a = aontVar;
        aihn.registerDefaultInstance(aont.class, aontVar);
    }

    private aont() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aika aikaVar = aika.INT32;
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0001\u0001\u0000\u0001\u001b\u00022\u0004ဇ\u0000", new Object[]{"d", "b", aons.class, "e", new ahud(aikaVar, (Object) 0, aikaVar, (Object) 0), "c"});
        }
        if (iOrdinal == 3) {
            return new aont();
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
        return aihn.getParserForClass(aont.class);
    }
}
