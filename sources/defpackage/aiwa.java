package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiwa extends aihn implements aiis {
    public static final aiwa a;
    public int b;
    public aiuc c;
    private apji d;
    private byte e = 2;

    static {
        aiwa aiwaVar = new aiwa();
        a = aiwaVar;
        aihn.registerDefaultInstance(aiwa.class, aiwaVar);
    }

    private aiwa() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0005\n\u0002\u0000\u0000\u0001\u0005ᐉ\u0003\nဉ\b", new Object[]{"b", "d", "c"});
            case 3:
                return new aiwa();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aiwa.class);
            default:
                return null;
        }
    }
}
