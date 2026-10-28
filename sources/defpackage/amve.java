package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amve extends aihn implements aiis {
    public static final amve a;
    public static final aihz m = new aihz(aiwh.ANIMATION_DECISION_UNKNOWN);
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public aihv h;
    public boolean i;
    public aiip j = aiip.a;
    public boolean k;
    public boolean l;
    private int n;
    private int o;
    private int p;
    private int q;

    static {
        amve amveVar = new amve();
        a = amveVar;
        aihn.registerDefaultInstance(amve.class, amveVar);
    }

    private amve() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.h = emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\n\u0000\u0005hȐ\n\u0001\u0001\u0000h᠌\bÏဇ!Ñဇ#ŃဇNŘငZƪ'ǙဇeǺ࠲Ȏဇ\u0092Ȑဇ\u0093", new Object[]{"n", "o", "b", "p", "q", "c", albk.c, "d", "e", "f", "g", "h", "i", "j", new ahud(aika.STRING, "", aika.ENUM, Integer.valueOf(aiwh.ANIMATION_DECISION_UNKNOWN.f)), aiwd.d, "k", "l"});
        }
        if (iOrdinal == 3) {
            return new amve();
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
        return aihn.getParserForClass(amve.class);
    }
}
