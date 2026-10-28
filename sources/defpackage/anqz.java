package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anqz extends aihn implements aiis {
    public static final anqz a;
    public int d;
    private int f;
    private byte g = 2;
    public aiie b = emptyProtobufList();
    public aiie c = emptyProtobufList();
    public aigj e = aigj.d;

    static {
        anqz anqzVar = new anqz();
        a = anqzVar;
        aihn.registerDefaultInstance(anqz.class, anqzVar);
    }

    private anqz() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0002\u0002\u0001Л\u0002Л\u0004ည\u0002\u0006᠌\u0000", new Object[]{"f", "b", alay.class, "c", anqy.class, "e", "d", anms.o});
            case 3:
                return new anqz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anqz.class);
            default:
                return null;
        }
    }
}
