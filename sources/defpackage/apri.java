package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apri extends aihn implements aiis {
    public static final apri a;
    public alay b;
    public boolean d;
    private int e;
    private alay f;
    private byte g = 2;
    public aiie c = emptyProtobufList();

    static {
        apri apriVar = new apri();
        a = apriVar;
        aihn.registerDefaultInstance(apri.class, apriVar);
    }

    private apri() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0003\u0001ᐉ\u0001\u0002Л\u0003ᐉ\u0000\u0004ဇ\u0002", new Object[]{"e", "f", "c", apra.class, "b", "d"});
            case 3:
                return new apri();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apri.class);
            default:
                return null;
        }
    }
}
