package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arir extends aihn implements aiis {
    public static final arir a;
    private int b;
    private int c;
    private aodf e;
    private alno f;
    private aiwf g;
    private aiip d = aiip.a;
    private byte h = 2;

    static {
        arir arirVar = new arir();
        a = arirVar;
        aihn.registerDefaultInstance(arir.class, arirVar);
    }

    private arir() {
        emptyProtobufList();
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
                aika aikaVar = aika.STRING;
                return newMessageInfo(a, "\u0004\u0004\u0000\u0002!+\u0004\u0001\u0000\u0003!ᐉ\u001e\"2$ᐉ!+ᐉ(", new Object[]{"b", "c", "e", "d", new ahud(aikaVar, "", aikaVar, ""), "f", "g"});
            case 3:
                return new arir();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arir.class);
            default:
                return null;
        }
    }
}
