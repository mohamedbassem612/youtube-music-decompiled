package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aovk extends aihn implements aiis {
    public static final aovk a;
    public alay b;
    private int e;
    private ajwo f;
    private ajwo g;
    private alay h;
    private alay i;
    private byte j = 2;
    public aiie c = emptyProtobufList();
    public aigj d = aigj.d;

    static {
        aovk aovkVar = new aovk();
        a = aovkVar;
        aihn.registerDefaultInstance(aovk.class, aovkVar);
    }

    private aovk() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004Л\u0006ည\u0007\u0007ᐉ\u0003\bᐉ\u0004", new Object[]{"e", "b", "f", "g", "c", aovl.class, "d", "h", "i"});
            case 3:
                return new aovk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aovk.class);
            default:
                return null;
        }
    }
}
