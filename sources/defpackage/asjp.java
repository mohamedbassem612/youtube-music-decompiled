package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asjp extends aihn implements aiis {
    public static final asjp a;
    private int b;
    private alay c;
    private aiip d = aiip.a;
    private byte e = 2;

    static {
        asjp asjpVar = new asjp();
        a = asjpVar;
        aihn.registerDefaultInstance(asjp.class, asjpVar);
    }

    private asjp() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0003\u0005\u0002\u0001\u0000\u0001\u0003ᐉ\u0002\u00052", new Object[]{"b", "c", "d", new ahud(aikaVar, "", aikaVar, "")});
            case 3:
                return new asjp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asjp.class);
            default:
                return null;
        }
    }
}
