package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class albu extends aihn implements aiis {
    public static final albu a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private alay i;
    private ajwo j;
    private aqyz k;
    private angb l;
    private alcj m;
    private albt n;
    private byte o = 2;

    static {
        albu albuVar = new albu();
        a = albuVar;
        aihn.registerDefaultInstance(albu.class, albuVar);
    }

    private albu() {
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
                return Byte.valueOf(this.o);
            case 1:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0003\u0015\f\u0000\u0000\f\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bᐉ\n\fᐉ\u000b\u0010ᐉ\f\u0011ᐉ\r\u0015ᐉ\u000e", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
            case 3:
                return new albu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(albu.class);
            default:
                return null;
        }
    }
}
