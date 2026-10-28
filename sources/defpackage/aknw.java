package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aknw extends aihn implements aiis {
    public static final aknw a;
    public static final aihl b;
    public int c;
    public long f;
    public long g;
    public aknv i;
    public String d = "";
    public aiie e = emptyProtobufList();
    public String h = "";

    static {
        aknw aknwVar = new aknw();
        a = aknwVar;
        aihn.registerDefaultInstance(aknw.class, aknwVar);
        b = aihn.newSingularGeneratedExtension(akvi.a, aknwVar, aknwVar, null, 146, aika.MESSAGE, aknw.class);
    }

    private aknw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဂ\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဉ\u0004", new Object[]{"c", "d", "e", aknx.class, "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new aknw();
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
        return aihn.getParserForClass(aknw.class);
    }
}
