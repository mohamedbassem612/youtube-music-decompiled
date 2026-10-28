package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class apde extends aihi implements aihj {
    public static final apde a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private ajwo f;
    private apji g;
    private byte h = 2;

    static {
        apde apdeVar = new apde();
        a = apdeVar;
        aihn.registerDefaultInstance(apde.class, apdeVar);
    }

    private apde() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0003\t\u0005\u0000\u0000\u0005\u0003ᐉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\tᐉ\u0006", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new apde();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apde.class);
            default:
                return null;
        }
    }
}
