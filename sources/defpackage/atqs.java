package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atqs extends aihn implements aiis {
    public static final atqs a;
    public static final aihl b;
    public int c;
    public Object e;
    public ahxc f;
    public int d = 0;
    public aiie g = emptyProtobufList();

    static {
        atqs atqsVar = new atqs();
        a = atqsVar;
        aihn.registerDefaultInstance(atqs.class, atqsVar);
        b = aihn.newSingularGeneratedExtension(atwa.a, atqsVar, atqsVar, null, 481167482, aika.MESSAGE, atqs.class);
    }

    private atqs() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0002\u0005\u0004\u0000\u0001\u0000\u0002ဉ\u0001\u00033\u0000\u00045\u0000\u0005\u001b", new Object[]{"e", "d", "c", "f", "g", atqt.class});
        }
        if (iOrdinal == 3) {
            return new atqs();
        }
        if (iOrdinal == 4) {
            return new jrr((byte[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(atqs.class);
        }
        return null;
    }
}
