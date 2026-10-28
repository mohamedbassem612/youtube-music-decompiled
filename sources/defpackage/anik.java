package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anik extends aihn implements aiis {
    public static final anik a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private byte f = 2;

    static {
        anik anikVar = new anik();
        a = anikVar;
        aihn.registerDefaultInstance(anik.class, anikVar);
    }

    private anik() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\n\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0006ᐉ\u0004\nᐉ\u0001", new Object[]{"b", "c", "e", "d"});
            case 3:
                return new anik();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anik.class);
            default:
                return null;
        }
    }
}
