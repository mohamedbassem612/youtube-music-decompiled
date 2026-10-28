package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aplk extends aihn implements aiis {
    public static final aplk a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private ajwo f;
    private apji g;
    private apji h;
    private apji i;
    private byte j = 2;

    static {
        aplk aplkVar = new aplk();
        a = aplkVar;
        aihn.registerDefaultInstance(aplk.class, aplkVar);
    }

    private aplk() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u000e\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0002\nᐉ\u0003\u000bᐉ\u0005\fᐉ\u0001\rᐉ\u0007\u000eᐉ\b", new Object[]{"b", "c", "e", "f", "g", "d", "h", "i"});
            case 3:
                return new aplk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aplk.class);
            default:
                return null;
        }
    }
}
