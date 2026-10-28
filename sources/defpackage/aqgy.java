package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqgy extends aihn implements aiis {
    public static final aqgy a;
    public int b;
    public aqgx c;
    private alay e;
    private alay f;
    private ajwo g;
    private alay h;
    private byte i = 2;
    public aiie d = emptyProtobufList();

    static {
        aqgy aqgyVar = new aqgy();
        a = aqgyVar;
        aihn.registerDefaultInstance(aqgy.class, aqgyVar);
    }

    private aqgy() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\t\u0006\u0000\u0001\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0003\u0005ᐉ\u0004\bᐉ\u0005\t\u001b", new Object[]{"b", "e", "f", "g", "c", "h", "d", ajub.class});
            case 3:
                return new aqgy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqgy.class);
            default:
                return null;
        }
    }
}
