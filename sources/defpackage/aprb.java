package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aprb extends aihn implements aiis {
    public static final aprb a;
    public int b;
    private int d;
    private alay e;
    private byte f = 2;
    public aiie c = emptyProtobufList();

    static {
        aprb aprbVar = new aprb();
        a = aprbVar;
        aihn.registerDefaultInstance(aprb.class, aprbVar);
    }

    private aprb() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001᠌\u0000\u0002ᐉ\u0001\u0003Л", new Object[]{"d", "b", apsb.b, "e", "c", apri.class});
            case 3:
                return new aprb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aprb.class);
            default:
                return null;
        }
    }
}
