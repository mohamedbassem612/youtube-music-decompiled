package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class aleq extends aihn implements aiis {
    public static final aleq a;
    public static final aihl b;
    public boolean c;
    public float d;
    private int e;

    static {
        aleq aleqVar = new aleq();
        a = aleqVar;
        aihn.registerDefaultInstance(aleq.class, aleqVar);
        b = aihn.newSingularGeneratedExtension(asod.a, aleqVar, aleqVar, null, 525000002, aika.MESSAGE, aleq.class);
    }

    private aleq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ခ\u0001", new Object[]{"e", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new aleq();
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
        return aihn.getParserForClass(aleq.class);
    }
}
