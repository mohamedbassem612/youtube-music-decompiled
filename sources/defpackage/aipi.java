package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aipi extends aihn implements aiis {
    public static final aipi a;
    public int b;
    public apji d;
    public String e;
    public String f;
    private byte g = 2;
    public String c = "";

    static {
        aipi aipiVar = new aipi();
        a = aipiVar;
        aihn.registerDefaultInstance(aipi.class, aipiVar);
    }

    private aipi() {
        emptyProtobufList();
        this.e = "";
        this.f = "";
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0003ᐉ\u0001\u0004ဈ\u0002\u0005ဈ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aipi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aipi.class);
            default:
                return null;
        }
    }
}
