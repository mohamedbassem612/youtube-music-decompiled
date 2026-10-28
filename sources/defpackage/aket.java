package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aket extends aihn implements aiis {
    public static final aket a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private ajng g;
    private ajng h;
    private byte i = 2;

    static {
        aket aketVar = new aket();
        a = aketVar;
        aihn.registerDefaultInstance(aket.class, aketVar);
    }

    private aket() {
        aigj aigjVar = aigj.d;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0002\u000b\u0006\u0000\u0000\u0006\u0002ᐉ\u0003\u0003ᐉ\u0004\u0004ᐉ\u0006\u0006ᐉ\b\u0007ᐉ\t\u000bᐉ\u0005", new Object[]{"b", "c", "d", "f", "g", "h", "e"});
            case 3:
                return new aket();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aket.class);
            default:
                return null;
        }
    }
}
