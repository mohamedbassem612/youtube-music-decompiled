package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oiy extends aihn implements aiis {
    public static final oiy a;
    public int b;
    public aijp c;
    public boolean e;
    public oja f;
    private aiip g = aiip.a;
    public aiie d = emptyProtobufList();

    static {
        oiy oiyVar = new oiy();
        a = oiyVar;
        aihn.registerDefaultInstance(oiy.class, oiyVar);
    }

    private oiy() {
    }

    public final void a() {
        aiie aiieVar = this.d;
        if (aiieVar.c()) {
            return;
        }
        this.d = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဇ\u0001\u0004ဉ\u0002\u00052", new Object[]{"b", "c", "d", oit.class, "e", "f", "g", new ahud(aika.STRING, "", aika.MESSAGE, aijp.a)});
        }
        if (iOrdinal == 3) {
            return new oiy();
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
        return aihn.getParserForClass(oiy.class);
    }
}
