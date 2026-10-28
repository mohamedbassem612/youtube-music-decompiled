package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alki extends aihn implements aiis {
    public static final alki a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private ajwo g;
    private angb h;
    private alay i;
    private byte j = 2;

    static {
        alki alkiVar = new alki();
        a = alkiVar;
        aihn.registerDefaultInstance(alki.class, alkiVar);
    }

    private alki() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u000f\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\u000fᐉ\u0004", new Object[]{"b", "c", "d", "e", "g", "h", "i", "f"});
            case 3:
                return new alki();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alki.class);
            default:
                return null;
        }
    }
}
