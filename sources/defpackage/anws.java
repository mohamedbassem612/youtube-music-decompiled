package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anws extends aihn implements aiis {
    public static final anws a;
    public int b;
    public int c;
    public int d;
    private int f;
    private byte g = 2;
    public aiie e = emptyProtobufList();

    static {
        anws anwsVar = new anws();
        a = anwsVar;
        aihn.registerDefaultInstance(anws.class, anwsVar);
    }

    private anws() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004Л", new Object[]{"f", "b", anvw.e, "c", "d", "e", anwq.class});
            case 3:
                return new anws();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anws.class);
            default:
                return null;
        }
    }
}
