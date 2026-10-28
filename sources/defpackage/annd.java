package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class annd extends aihn implements aiis {
    public static final annd a;
    public int b;
    public alay c;
    public ajwo d;
    private ajwo g;
    private byte h = 2;
    public aiie e = emptyProtobufList();
    public aigj f = aigj.d;

    static {
        annd anndVar = new annd();
        a = anndVar;
        aihn.registerDefaultInstance(annd.class, anndVar);
    }

    private annd() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л\u0005ည\u0004\u0006ᐉ\u0002", new Object[]{"b", "c", "d", "e", aqmh.class, "f", "g"});
            case 3:
                return new annd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(annd.class);
            default:
                return null;
        }
    }
}
