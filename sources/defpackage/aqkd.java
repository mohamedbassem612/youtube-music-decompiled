package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqkd extends aihn implements aiis {
    public static final aqkd a;
    public static final aihl b;
    public int c;
    public Object e;
    public long g;
    public int i;
    public int d = 0;
    public String f = "";
    public aiie h = emptyProtobufList();

    static {
        aqkd aqkdVar = new aqkd();
        a = aqkdVar;
        aihn.registerDefaultInstance(aqkd.class, aqkdVar);
        b = aihn.newSingularGeneratedExtension(aksn.a, aqkdVar, aqkdVar, null, 196886555, aika.MESSAGE, aqkd.class);
    }

    private aqkd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002=\u0000\u0003:\u0000\u0004ဂ\u0001\u0005\u001a\u0006᠌\u0002", new Object[]{"e", "d", "c", "f", "g", "h", "i", apdr.s});
        }
        if (iOrdinal == 3) {
            return new aqkd();
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
        return aihn.getParserForClass(aqkd.class);
    }
}
