package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqcn extends aihn implements aiis {
    public static final aqcn a;
    public aiie b = emptyProtobufList();
    public aihv c = emptyIntList();

    static {
        aqcn aqcnVar = new aqcn();
        a = aqcnVar;
        aihn.registerDefaultInstance(aqcn.class, aqcnVar);
    }

    private aqcn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u0016", new Object[]{"b", aqcm.class, "c"});
        }
        if (iOrdinal == 3) {
            return new aqcn();
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
        return aihn.getParserForClass(aqcn.class);
    }
}
