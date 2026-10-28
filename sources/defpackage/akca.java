package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akca extends aihn implements aiis {
    public static final akca a;
    public int b;
    public akcb c;
    public aiie d = emptyProtobufList();
    public aiie e = emptyProtobufList();

    static {
        akca akcaVar = new akca();
        a = akcaVar;
        aihn.registerDefaultInstance(akca.class, akcaVar);
    }

    private akca() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b", new Object[]{"b", "c", "d", akcb.class, "e", akbz.class});
        }
        if (iOrdinal == 3) {
            return new akca();
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
        return aihn.getParserForClass(akca.class);
    }
}
