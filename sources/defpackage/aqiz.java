package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqiz extends aihn implements aiis {
    public static final aqiz a;
    public int b;
    public boolean c;
    public aqit d;
    public aqiy e;
    public aqir f;
    public aqiu g;
    public aqiq h;
    public aqio i;
    public aqiw j;
    public aqim k;
    public aqip l;
    public aqix m;

    static {
        aqiz aqizVar = new aqiz();
        a = aqizVar;
        aihn.registerDefaultInstance(aqiz.class, aqizVar);
    }

    private aqiz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001!\u000b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0004\bဉ\b\tဉ\t\rဉ\r\u0018ဉ\u0018\u001cဉ\u000e ဉ\n!ဉ\u0006", new Object[]{"b", "c", "d", "e", "f", "h", "i", "k", "m", "l", "j", "g"});
        }
        if (iOrdinal == 3) {
            return new aqiz();
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
        return aihn.getParserForClass(aqiz.class);
    }
}
