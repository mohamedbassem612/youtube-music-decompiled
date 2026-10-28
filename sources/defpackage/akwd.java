package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akwd extends aihn implements aiis {
    public static final akwd a;
    public int b;
    public boolean c;
    public aiie d = emptyProtobufList();
    public int e;
    public boolean f;
    public boolean g;
    public akwe h;
    public boolean i;

    static {
        akwd akwdVar = new akwd();
        a = akwdVar;
        aihn.registerDefaultInstance(akwd.class, akwdVar);
    }

    private akwd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\n\u0007\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001b\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဉ\u0004\nဇ\b", new Object[]{"b", "c", "d", akwf.class, "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new akwd();
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
        return aihn.getParserForClass(akwd.class);
    }
}
