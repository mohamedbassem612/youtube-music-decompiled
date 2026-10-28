package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anrf extends aihi implements aihj {
    public static final anrf a;
    private int b;
    private alay c;
    private alay d;
    private ajwo e;
    private amkt f;
    private angb g;
    private alay h;
    private anre i;
    private byte k = 2;

    static {
        anrf anrfVar = new anrf();
        a = anrfVar;
        aihn.registerDefaultInstance(anrf.class, anrfVar);
    }

    private anrf() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0002\u0010\u0007\u0000\u0000\u0007\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\tᐉ\u0005\u000bᐉ\u0007\rᐉ\u000b\u0010ᐉ\r", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new anrf();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anrf.class);
            default:
                return null;
        }
    }
}
