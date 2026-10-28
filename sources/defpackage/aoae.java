package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aoae extends aihi implements aihj {
    public static final aoae a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private ajwo f;
    private ajwo g;
    private angb h;
    private byte i = 2;

    static {
        aoae aoaeVar = new aoae();
        a = aoaeVar;
        aihn.registerDefaultInstance(aoae.class, aoaeVar);
    }

    private aoae() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\t\u0006\u0000\u0000\u0006\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0006\bᐉ\u0005\tᐉ\u0003", new Object[]{"b", "c", "d", "f", "h", "g", "e"});
            case 3:
                return new aoae();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoae.class);
            default:
                return null;
        }
    }
}
