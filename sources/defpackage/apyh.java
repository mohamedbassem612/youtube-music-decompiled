package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apyh extends aihn implements aiis {
    public static final apyh a;
    private int b;
    private alay c;
    private ajsc d;
    private ajwo e;
    private alay f;
    private alay g;
    private ajkl h;
    private angb i;
    private byte j = 2;

    static {
        apyh apyhVar = new apyh();
        a = apyhVar;
        aihn.registerDefaultInstance(apyh.class, apyhVar);
    }

    private apyh() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\r\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\bᐉ\u0006\tᐉ\u0007\rᐉ\u0002", new Object[]{"b", "c", "e", "f", "g", "h", "i", "d"});
            case 3:
                return new apyh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apyh.class);
            default:
                return null;
        }
    }
}
