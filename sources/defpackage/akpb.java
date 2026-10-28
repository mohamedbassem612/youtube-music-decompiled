package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akpb extends aihn implements aiis {
    public static final akpb a;
    public int b;
    private apok e;
    private apok f;
    private byte g = 2;
    public String c = "";
    public String d = "";

    static {
        akpb akpbVar = new akpb();
        a = akpbVar;
        aihn.registerDefaultInstance(akpb.class, akpbVar);
    }

    private akpb() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003", new Object[]{"b", "e", "c", "d", "f"});
            case 3:
                return new akpb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akpb.class);
            default:
                return null;
        }
    }
}
