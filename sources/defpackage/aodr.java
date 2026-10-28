package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aodr extends aihn implements aiis {
    public static final aodr a;
    private int b;
    private alay c;
    private alay d;
    private ajwo e;
    private angb f;
    private byte g = 2;

    static {
        aodr aodrVar = new aodr();
        a = aodrVar;
        aihn.registerDefaultInstance(aodr.class, aodrVar);
    }

    private aodr() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0005ᐉ\u0002\nᐉ\u0006", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aodr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aodr.class);
            default:
                return null;
        }
    }
}
