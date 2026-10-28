package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akcb extends aihn implements aiis {
    public static final akcb a;
    public int b;
    public String c;
    public String d;

    static {
        akcb akcbVar = new akcb();
        a = akcbVar;
        aihn.registerDefaultInstance(akcb.class, akcbVar);
    }

    private akcb() {
        emptyProtobufList();
        this.c = "";
        this.d = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0006\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0006ဈ\u0000", new Object[]{"b", "d", "c"});
        }
        if (iOrdinal == 3) {
            return new akcb();
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
        return aihn.getParserForClass(akcb.class);
    }
}
