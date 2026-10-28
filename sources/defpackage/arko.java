package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arko extends aihn implements aiis {
    public static final arko a;
    public int b;
    public long c;
    public ajwo d;
    private byte g = 2;
    public aiie e = emptyProtobufList();
    public aiie f = emptyProtobufList();

    static {
        arko arkoVar = new arko();
        a = arkoVar;
        aihn.registerDefaultInstance(arko.class, arkoVar);
    }

    private arko() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0001\u0001ဂ\u0000\u0002ᐉ\u0001\u0003\u001b\u0004\u001b", new Object[]{"b", "c", "d", "e", arkj.class, "f", arkh.class});
            case 3:
                return new arko();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arko.class);
            default:
                return null;
        }
    }
}
