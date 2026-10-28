package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akav extends aihi implements aihj {
    public static final akav a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private ajwo f;
    private ajwo g;
    private alay h;
    private byte i = 2;

    static {
        akav akavVar = new akav();
        a = akavVar;
        aihn.registerDefaultInstance(akav.class, akavVar);
    }

    private akav() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0003\bᐉ\u0007\nᐉ\u0005\u000bᐉ\u0006", new Object[]{"b", "c", "d", "e", "h", "f", "g"});
            case 3:
                return new akav();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akav.class);
            default:
                return null;
        }
    }
}
