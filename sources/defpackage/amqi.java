package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amqi extends aihn implements aiis {
    public static final amqi a;
    public static final aihl b;
    public int c;
    public String d = "";

    static {
        amqi amqiVar = new amqi();
        a = amqiVar;
        aihn.registerDefaultInstance(amqi.class, amqiVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, amqiVar, amqiVar, null, 463152755, aika.MESSAGE, amqi.class);
    }

    private amqi() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0000", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new amqi();
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
        return aihn.getParserForClass(amqi.class);
    }
}
