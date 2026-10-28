package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aren extends aihn implements aiis {
    public static final aren a;
    private int b;
    private alay c;
    private askp d;
    private aqev e;
    private ajwo f;
    private alay g;
    private alay h;
    private areo i;
    private apji j;
    private apji k;
    private byte l = 2;

    static {
        aren arenVar = new aren();
        a = arenVar;
        aihn.registerDefaultInstance(aren.class, arenVar);
    }

    private aren() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0002\u0013\t\u0000\u0000\t\u0002ᐉ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0006\u000eᐉ\t\u000fᐉ\u0005\u0010ᐉ\b\u0013ᐉ\u0001", new Object[]{"b", "c", "e", "f", "g", "i", "k", "h", "j", "d"});
            case 3:
                return new aren();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aren.class);
            default:
                return null;
        }
    }
}
