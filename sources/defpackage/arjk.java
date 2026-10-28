package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arjk extends aihn implements aiis {
    public static final arjk a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;

    static {
        arjk arjkVar = new arjk();
        a = arjkVar;
        aihn.registerDefaultInstance(arjk.class, arjkVar);
    }

    private arjk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0004\u0004\f", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new arjk();
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
        return aihn.getParserForClass(arjk.class);
    }
}
