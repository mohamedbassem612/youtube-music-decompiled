package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akgx extends aihn implements aiis {
    public static final akgx a;
    public int b;
    public akgv c;
    public akgv d;
    public akgv e;
    public akgv f;
    public aiie g = emptyProtobufList();
    public aiie h = emptyProtobufList();
    public int i;
    public float j;
    public float k;
    public float l;

    static {
        akgx akgxVar = new akgx();
        a = akgxVar;
        aihn.registerDefaultInstance(akgx.class, akgxVar);
    }

    private akgx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006\u001b\u0007င\u0004\bခ\u0005\tခ\u0006\nခ\b", new Object[]{"b", "c", "d", "e", "f", "g", akgv.class, "h", akgw.class, "i", "j", "k", "l"});
        }
        if (iOrdinal == 3) {
            return new akgx();
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
        return aihn.getParserForClass(akgx.class);
    }
}
