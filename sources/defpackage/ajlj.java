package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajlj extends aihn implements aiis {
    public static final ajlj a;
    public int b;
    public aiuc c;
    public apji d;
    public ajwo h;
    public boolean i;
    private byte j = 2;
    public aiie e = emptyProtobufList();
    public aiie f = emptyProtobufList();
    public aiie g = emptyProtobufList();

    static {
        ajlj ajljVar = new ajlj();
        a = ajljVar;
        aihn.registerDefaultInstance(ajlj.class, ajljVar);
    }

    private ajlj() {
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
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0002\u0001ဉ\u0000\u0002ᐉ\u0001\u0003\u001b\u0004\u001b\u0005ᐉ\u0002\u0006ဇ\u0003\u0007\u001b", new Object[]{"b", "c", "d", "e", aizs.class, "f", aizs.class, "h", "i", "g", aizs.class});
            case 3:
                return new ajlj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajlj.class);
            default:
                return null;
        }
    }
}
