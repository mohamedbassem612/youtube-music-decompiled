package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akyr extends aihn implements aiis {
    public static final akyr a;
    private int b;
    private apji c;
    private apji d;
    private askp e;
    private askp f;
    private apji g;
    private byte h = 2;

    static {
        akyr akyrVar = new akyr();
        a = akyrVar;
        aihn.registerDefaultInstance(akyr.class, akyrVar);
    }

    private akyr() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\u0007\u0005\u0000\u0000\u0005\u0002ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0001\u0006ᐉ\u0004\u0007ᐉ\u0005", new Object[]{"b", "d", "e", "c", "f", "g"});
            case 3:
                return new akyr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akyr.class);
            default:
                return null;
        }
    }
}
