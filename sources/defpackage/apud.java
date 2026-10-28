package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class apud extends aihn implements aiis {
    public static final apud a;
    private int b;
    private alay c;
    private ajwo d;
    private alay e;
    private byte f = 2;

    static {
        apud apudVar = new apud();
        a = apudVar;
        aihn.registerDefaultInstance(apud.class, apudVar);
    }

    private apud() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0003\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new apud();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apud.class);
            default:
                return null;
        }
    }
}
