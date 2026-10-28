package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akvw extends aihn implements aiis {
    public static final akvw a;
    private int b;
    private alay c;
    private alay d;
    private ajwo e;
    private byte f = 2;

    static {
        akvw akvwVar = new akvw();
        a = akvwVar;
        aihn.registerDefaultInstance(akvw.class, akvwVar);
    }

    private akvw() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0003\u0002ᐉ\u0001\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new akvw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akvw.class);
            default:
                return null;
        }
    }
}
