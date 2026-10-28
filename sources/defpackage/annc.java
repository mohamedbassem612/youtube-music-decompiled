package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class annc extends aihn implements aiis {
    public static final annc a;
    public int b;
    public apji c;
    public apji d;
    public alay e;
    public apji f;
    private byte j = 2;
    public aiie g = emptyProtobufList();
    public aiie h = emptyProtobufList();
    public aigj i = aigj.d;

    static {
        annc anncVar = new annc();
        a = anncVar;
        aihn.registerDefaultInstance(annc.class, anncVar);
    }

    private annc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0002\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0006ည\u0005\u0007Л\bЛ", new Object[]{"b", "c", "d", "e", "f", "i", "g", apji.class, "h", alay.class});
            case 3:
                return new annc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(annc.class);
            default:
                return null;
        }
    }
}
