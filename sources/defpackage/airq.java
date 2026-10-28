package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class airq extends aihn implements aiis {
    public static final airq a;
    private int b;
    private aivw c;
    private aitu d;
    private apji e;
    private ajwo f;
    private apji g;
    private byte h = 2;

    static {
        airq airqVar = new airq();
        a = airqVar;
        aihn.registerDefaultInstance(airq.class, airqVar);
    }

    private airq() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u000e\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u000eᐉ\b", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new airq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(airq.class);
            default:
                return null;
        }
    }
}
