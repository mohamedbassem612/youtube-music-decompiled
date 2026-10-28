package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akyo extends aihn implements aiis {
    public static final akyo a;
    public aiie c;
    public akyp d;
    private int e;
    private ajwo f;
    private byte g = 2;
    public String b = "";

    static {
        akyo akyoVar = new akyo();
        a = akyoVar;
        aihn.registerDefaultInstance(akyo.class, akyoVar);
    }

    private akyo() {
        emptyProtobufList();
        this.c = emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\n\u0004\u0000\u0001\u0002\u0001ဈ\u0000\u0002ဉ\u0005\u0004Л\nᐉ\u0004", new Object[]{"e", "b", "d", "c", ajwo.class, "f"});
            case 3:
                return new akyo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akyo.class);
            default:
                return null;
        }
    }
}
