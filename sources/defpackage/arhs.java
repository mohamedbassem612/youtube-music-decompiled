package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class arhs extends aihn implements aiis {
    public static final arhs a;
    private int b;
    private alay c;
    private ajwo d;
    private ajkl e;
    private ajkl f;
    private arhv g;
    private alay h;
    private byte i = 2;

    static {
        arhs arhsVar = new arhs();
        a = arhsVar;
        aihn.registerDefaultInstance(arhs.class, arhsVar);
    }

    private arhs() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\r\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0006ᐉ\u0005\tᐉ\u0007\fᐉ\u0002\rᐉ\u0003", new Object[]{"b", "c", "d", "g", "h", "e", "f"});
            case 3:
                return new arhs();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arhs.class);
            default:
                return null;
        }
    }
}
