package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiqe extends aihn implements aiis {
    public static final aiqe a;
    public int b;
    public aiqd c;

    static {
        aiqe aiqeVar = new aiqe();
        a = aiqeVar;
        aihn.registerDefaultInstance(aiqe.class, aiqeVar);
    }

    private aiqe() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uecfa␜\uecfa␜\u0001\u0000\u0000\u0000\uecfa␜ဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new aiqe();
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
        return aihn.getParserForClass(aiqe.class);
    }
}
