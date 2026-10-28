package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqqf extends aihn implements aiis {
    public static final aqqf a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private ajwo g;
    private ajwo h;
    private angb i;
    private byte j = 2;

    static {
        aqqf aqqfVar = new aqqf();
        a = aqqfVar;
        aihn.registerDefaultInstance(aqqf.class, aqqfVar);
    }

    private aqqf() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0003\u000e\u0007\u0000\u0000\u0007\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0006\u000bᐉ\u0007\fᐉ\u0005\u000eᐉ\n", new Object[]{"b", "c", "d", "e", "g", "h", "f", "i"});
            case 3:
                return new aqqf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqqf.class);
            default:
                return null;
        }
    }
}
