package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akgb extends aihn implements aiis {
    public static final akgb a;
    private int b;
    private askp c;
    private askp d;
    private askp e;
    private apji f;
    private askp g;
    private byte h = 2;

    static {
        akgb akgbVar = new akgb();
        a = akgbVar;
        aihn.registerDefaultInstance(akgb.class, akgbVar);
    }

    private akgb() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new akgb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akgb.class);
            default:
                return null;
        }
    }
}
