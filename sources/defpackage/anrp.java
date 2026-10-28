package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anrp extends aihn implements aiis {
    public static final anrp a;
    public int b;
    public alay c;
    public alay d;
    public apji e;
    public ajwo f;
    public aiie g;
    private byte h = 2;

    static {
        anrp anrpVar = new anrp();
        a = anrpVar;
        aihn.registerDefaultInstance(anrp.class, anrpVar);
    }

    private anrp() {
        emptyProtobufList();
        this.g = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0001\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\bЛ", new Object[]{"b", "c", "d", "e", "f", "g", apji.class});
            case 3:
                return new anrp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anrp.class);
            default:
                return null;
        }
    }
}
