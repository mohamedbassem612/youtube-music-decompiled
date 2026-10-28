package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atyr extends aihn implements aiis {
    public static final atyr a;
    public String b = "";
    public aiie c;

    static {
        atyr atyrVar = new atyr();
        a = atyrVar;
        aihn.registerDefaultInstance(atyr.class, atyrVar);
    }

    private atyr() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.c = emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0002\u0004\u0002\u0000\u0001\u0000\u0002Ȉ\u0004\u001b", new Object[]{"b", "c", atyp.class});
        }
        if (iOrdinal == 3) {
            return new atyr();
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
        return aihn.getParserForClass(atyr.class);
    }
}
