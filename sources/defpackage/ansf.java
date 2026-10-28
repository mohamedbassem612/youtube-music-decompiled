package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ansf extends aihn implements aiis {
    public static final ansf a;
    private int b;
    private alay c;
    private alay d;
    private angb e;
    private ajwo f;
    private anse g;
    private byte h = 2;

    static {
        ansf ansfVar = new ansf();
        a = ansfVar;
        aihn.registerDefaultInstance(ansf.class, ansfVar);
    }

    private ansf() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\t\u0005\u0000\u0000\u0005\u0002ᐉ\u0001\u0003ᐉ\u0004\u0006ᐉ\u0002\bᐉ\u0003\tᐉ\u0007", new Object[]{"b", "c", "f", "d", "e", "g"});
            case 3:
                return new ansf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ansf.class);
            default:
                return null;
        }
    }
}
