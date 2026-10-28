package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ansi extends aihi implements aihj {
    public static final ansi a;
    private int b;
    private alay c;
    private alay d;
    private ajwo e;
    private angb f;
    private ansh g;
    private byte h = 2;

    static {
        ansi ansiVar = new ansi();
        a = ansiVar;
        aihn.registerDefaultInstance(ansi.class, ansiVar);
    }

    private ansi() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\u000b\u0005\u0000\u0000\u0005\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\tᐉ\u0005\u000bᐉ\t", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new ansi();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ansi.class);
            default:
                return null;
        }
    }
}
