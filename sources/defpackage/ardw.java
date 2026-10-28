package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ardw extends aihn implements aiis {
    public static final ardw a;
    private int b;
    private alay c;
    private ardx d;
    private ajwo e;
    private alay f;
    private ajwo g;
    private byte h = 2;

    static {
        ardw ardwVar = new ardw();
        a = ardwVar;
        aihn.registerDefaultInstance(ardw.class, ardwVar);
    }

    private ardw() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0004\r\u0005\u0000\u0000\u0005\u0004ᐉ\u0003\u0006ᐉ\u0005\u000bᐉ\u0007\fᐉ\b\rᐉ\t", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new ardw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ardw.class);
            default:
                return null;
        }
    }
}
