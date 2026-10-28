package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auhz extends aihn implements aiis {
    public static final auhz a;
    public int b;
    public String c = "";
    public aiie d = emptyProtobufList();
    public auie e;
    public aqlb f;

    static {
        auhz auhzVar = new auhz();
        a = auhzVar;
        aihn.registerDefaultInstance(auhz.class, auhzVar);
    }

    private auhz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"b", "c", "d", auhy.class, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new auhz();
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
        return aihn.getParserForClass(auhz.class);
    }
}
