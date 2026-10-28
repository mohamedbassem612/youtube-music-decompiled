package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aozy extends aihn implements aiis {
    public static final aozy a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private ajwo f;
    private ajng g;
    private angb h;
    private aivc i;
    private byte j = 2;

    static {
        aozy aozyVar = new aozy();
        a = aozyVar;
        aihn.registerDefaultInstance(aozy.class, aozyVar);
    }

    private aozy() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0002\u0010\u0007\u0000\u0000\u0007\u0002ᐉ\u0001\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\bᐉ\u0006\tᐉ\u0007\u0010ᐉ\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new aozy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aozy.class);
            default:
                return null;
        }
    }
}
