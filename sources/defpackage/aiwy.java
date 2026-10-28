package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiwy extends aihn implements aiis {
    public static final aiwy a;
    public static final aihl b;
    public int c;
    public String d = "";
    public aiie e = emptyProtobufList();

    static {
        aiwy aiwyVar = new aiwy();
        a = aiwyVar;
        aihn.registerDefaultInstance(aiwy.class, aiwyVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aiwyVar, aiwyVar, null, 123046178, aika.MESSAGE, aiwy.class);
    }

    private aiwy() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0003\u001a", new Object[]{"c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new aiwy();
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
        return aihn.getParserForClass(aiwy.class);
    }
}
