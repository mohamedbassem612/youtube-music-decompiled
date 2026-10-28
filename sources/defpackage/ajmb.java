package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajmb extends aihn implements aiis {
    public static final ajmb a;
    private int b;
    private aivw c;
    private apji d;
    private apji e;
    private byte f = 2;

    static {
        ajmb ajmbVar = new ajmb();
        a = ajmbVar;
        aihn.registerDefaultInstance(ajmb.class, ajmbVar);
    }

    private ajmb() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0007\u000e\u0003\u0000\u0000\u0003\u0007ᐉ\u0004\rᐉ\u0007\u000eᐉ\b", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new ajmb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajmb.class);
            default:
                return null;
        }
    }
}
