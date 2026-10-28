package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akec extends aihi implements aihj {
    public static final akec a;
    public int b;
    public akdy d;
    public aqkk e;
    public aqae f;
    public akyu g;
    private byte h = 2;
    public String c = "";

    static {
        akec akecVar = new akec();
        a = akecVar;
        aihn.registerDefaultInstance(akec.class, akecVar);
    }

    private akec() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new akec();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akec.class);
            default:
                return null;
        }
    }
}
