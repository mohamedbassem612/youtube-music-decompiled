package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aknn extends aihn implements aiis {
    public static final aknn a;
    public int b;
    public int c;
    public int d;
    public aiie e = emptyProtobufList();

    static {
        aknn aknnVar = new aknn();
        a = aknnVar;
        aihn.registerDefaultInstance(aknn.class, aknnVar);
    }

    private aknn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003\u001b", new Object[]{"b", "c", akjs.m, "d", alip.a, "e", akne.class});
        }
        if (iOrdinal == 3) {
            return new aknn();
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
        return aihn.getParserForClass(aknn.class);
    }
}
