package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqvm extends aihn implements aiis {
    public static final aqvm a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private ajng g;
    private ajng h;
    private alay i;
    private byte j = 2;

    static {
        aqvm aqvmVar = new aqvm();
        a = aqvmVar;
        aihn.registerDefaultInstance(aqvm.class, aqvmVar);
    }

    private aqvm() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0002\n\u0007\u0000\u0000\u0007\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\tᐉ\u0001\nᐉ\u0007", new Object[]{"b", "d", "e", "f", "g", "h", "c", "i"});
            case 3:
                return new aqvm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqvm.class);
            default:
                return null;
        }
    }
}
