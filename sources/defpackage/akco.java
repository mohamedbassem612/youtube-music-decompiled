package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akco extends aihn implements aiis {
    public static final akco a;
    public int b;
    public amar c;
    public boolean e;
    private byte f = 2;
    public aiie d = emptyProtobufList();

    static {
        akco akcoVar = new akco();
        a = akcoVar;
        aihn.registerDefaultInstance(akco.class, akcoVar);
    }

    private akco() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0002\u0001ᐉ\u0000\u0003Л\u0005ဇ\u0002", new Object[]{"b", "c", "d", ajwo.class, "e"});
            case 3:
                return new akco();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akco.class);
            default:
                return null;
        }
    }
}
