package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aisx extends aihn implements aiis {
    public static final aisx a;
    public aiuc b;
    public apji c;
    private int e;
    private byte f = 2;
    public aiie d = emptyProtobufList();

    static {
        aisx aisxVar = new aisx();
        a = aisxVar;
        aihn.registerDefaultInstance(aisx.class, aisxVar);
    }

    private aisx() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003\u001b", new Object[]{"e", "b", "c", "d", aizs.class});
            case 3:
                return new aisx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aisx.class);
            default:
                return null;
        }
    }
}
