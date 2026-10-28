package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apoc extends aihn implements aiis {
    public static final apoc a;
    private int b;
    private askp c;
    private askp d;
    private apji e;
    private apji f;
    private apji g;
    private apji h;
    private byte i = 2;

    static {
        apoc apocVar = new apoc();
        a = apocVar;
        aihn.registerDefaultInstance(apoc.class, apocVar);
    }

    private apoc() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\f\u0006\u0000\u0000\u0006\u0002ᐉ\u0000\u0003ᐉ\u0001\u0005ᐉ\u0003\u0006ᐉ\u0004\nᐉ\t\fᐉ\b", new Object[]{"b", "c", "d", "e", "f", "h", "g"});
            case 3:
                return new apoc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apoc.class);
            default:
                return null;
        }
    }
}
