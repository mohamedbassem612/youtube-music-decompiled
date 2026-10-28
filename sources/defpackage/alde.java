package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alde extends aihn implements aiis {
    public static final alde a;
    private int b;
    private alay c;
    private alay d;
    private ajng e;
    private ajwo f;
    private ajwo g;
    private byte h = 2;

    static {
        alde aldeVar = new alde();
        a = aldeVar;
        aihn.registerDefaultInstance(alde.class, aldeVar);
    }

    private alde() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0007ᐉ\u0006\nᐉ\u0007", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new alde();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alde.class);
            default:
                return null;
        }
    }
}
