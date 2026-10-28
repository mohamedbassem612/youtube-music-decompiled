package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class asmw extends aihn implements aiis {
    public static final asmw a;
    public int b = 0;
    public Object c;

    static {
        asmw asmwVar = new asmw();
        a = asmwVar;
        aihn.registerDefaultInstance(asmw.class, asmwVar);
    }

    private asmw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u00017\u0000\u00027\u0000\u00037\u0000\u00047\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new asmw();
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
        return aihn.getParserForClass(asmw.class);
    }
}
