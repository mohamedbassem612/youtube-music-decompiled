package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ahaw extends aihn implements aiis {
    public static final ahaw a;
    public int b;
    public aiie c = emptyProtobufList();
    public aihy d = emptyLongList();
    public aihy e = emptyLongList();
    public aihy f = emptyLongList();
    public aihy g = emptyLongList();
    public long h;
    public long i;
    public int j;

    static {
        ahaw ahawVar = new ahaw();
        a = ahawVar;
        aihn.registerDefaultInstance(ahaw.class, ahawVar);
    }

    private ahaw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0005\u0000\u0001\u001b\u0002\u0015\u0003\u0015\u0004ဃ\u0000\u0005ဃ\u0001\u0006င\u0002\u0007&\b&", new Object[]{"b", "c", ahai.class, "d", "f", "h", "i", "j", "e", "g"});
        }
        if (iOrdinal == 3) {
            return new ahaw();
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
        return aihn.getParserForClass(ahaw.class);
    }
}
