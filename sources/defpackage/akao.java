package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akao extends aihn implements aiis {
    public static final akao a;
    private int b;
    private alay c;
    private alay d;
    private apji e;
    private byte f = 2;

    static {
        akao akaoVar = new akao();
        a = akaoVar;
        aihn.registerDefaultInstance(akao.class, akaoVar);
    }

    private akao() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0003\u0001ᐉ\u0002\u0003ᐉ\u0004\u0006ᐉ\u0003", new Object[]{"b", "c", "e", "d"});
            case 3:
                return new akao();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akao.class);
            default:
                return null;
        }
    }
}
