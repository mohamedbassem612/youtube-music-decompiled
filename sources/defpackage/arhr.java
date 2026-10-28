package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class arhr extends aihn implements aiis {
    public static final arhr a;
    private int b;
    private alay c;
    private ajwo d;
    private arhv e;
    private alay f;
    private byte g = 2;

    static {
        arhr arhrVar = new arhr();
        a = arhrVar;
        aihn.registerDefaultInstance(arhr.class, arhrVar);
    }

    private arhr() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\t\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0006ᐉ\u0003\tᐉ\u0005", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new arhr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arhr.class);
            default:
                return null;
        }
    }
}
