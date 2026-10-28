package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajjb extends aihn implements aiis {
    public static final ajjb a;
    private aiip b;
    private aiip c;

    static {
        ajjb ajjbVar = new ajjb();
        a = ajjbVar;
        aihn.registerDefaultInstance(ajjb.class, ajjbVar);
    }

    private ajjb() {
        aiip aiipVar = aiip.a;
        this.b = aiipVar;
        this.c = aiipVar;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aika aikaVar = aika.STRING;
            return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0003\t\u0002\u0002\u0000\u0000\u00032\t2", new Object[]{"b", new ahud(aikaVar, "", aikaVar, ""), "c", new ahud(aikaVar, "", aika.FLOAT, Float.valueOf(0.0f))});
        }
        if (iOrdinal == 3) {
            return new ajjb();
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
        return aihn.getParserForClass(ajjb.class);
    }
}
