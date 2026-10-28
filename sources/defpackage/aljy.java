package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aljy extends aihn implements aiis {
    public static final aljy a;
    public aiuc b;
    public apji c;
    private int g;
    private byte h = 2;
    public aiie d = emptyProtobufList();
    public aiie e = emptyProtobufList();
    public aiie f = emptyProtobufList();

    static {
        aljy aljyVar = new aljy();
        a = aljyVar;
        aihn.registerDefaultInstance(aljy.class, aljyVar);
    }

    private aljy() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003\u001b\u0004\u001b\u0005\u001b", new Object[]{"g", "b", "c", "d", aizs.class, "e", aizs.class, "f", aizs.class});
            case 3:
                return new aljy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aljy.class);
            default:
                return null;
        }
    }
}
