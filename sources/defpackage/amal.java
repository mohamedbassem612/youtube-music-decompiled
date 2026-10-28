package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amal extends aihn implements aiis {
    public static final amal a;
    public alop b;
    private int c;
    private apji d;
    private byte e = 2;

    static {
        amal amalVar = new amal();
        a = amalVar;
        aihn.registerDefaultInstance(amal.class, amalVar);
    }

    private amal() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0004ᐉ\u0001", new Object[]{"c", "b", "d"});
            case 3:
                return new amal();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amal.class);
            default:
                return null;
        }
    }
}
