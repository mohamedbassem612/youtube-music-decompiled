package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afwm extends aihn implements aiis {
    public static final afwm a;
    public int b;
    public long c;
    public long d;
    public long f;
    public long g;
    public aftf h;
    public int i;
    public aiie e = emptyProtobufList();
    public aiie j = emptyProtobufList();
    public aiie k = emptyProtobufList();

    static {
        afwm afwmVar = new afwm();
        a = afwmVar;
        aihn.registerDefaultInstance(afwm.class, afwmVar);
    }

    private afwm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\r\t\u0000\u0003\u0000\u0001စ\u0000\u0002စ\u0001\u0003\u001b\u0004ဂ\u0002\u0005ဂ\u0003\nဉ\u0005\u000b᠌\u0006\f\u001a\r\u001a", new Object[]{"b", "c", "d", "e", afus.class, "f", "g", "h", "i", fxi.n, "j", "k"});
        }
        if (iOrdinal == 3) {
            return new afwm();
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
        return aihn.getParserForClass(afwm.class);
    }
}
