package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aljs extends aihn implements aiis {
    public static final aljs a;
    private int b;
    private aljr d;
    private aiip c = aiip.a;
    private byte e = 2;

    static {
        aljs aljsVar = new aljs();
        a = aljsVar;
        aihn.registerDefaultInstance(aljs.class, aljsVar);
    }

    private aljs() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                aika aikaVar = aika.STRING;
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0011\u0015\u0002\u0001\u0000\u0001\u0011ᐉ\u0010\u00152", new Object[]{"b", "d", "c", new ahud(aikaVar, "", aikaVar, "")});
            case 3:
                return new aljs();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aljs.class);
            default:
                return null;
        }
    }
}
