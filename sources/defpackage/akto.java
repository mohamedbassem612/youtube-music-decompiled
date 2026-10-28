package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akto extends aihn implements aiis {
    public static final akto a;
    public int b;
    public alay d;
    public aiie e;
    public ajwo f;
    public aipe g;
    public aigj h;
    private alay i;
    private byte j = 2;
    public String c = "";

    static {
        akto aktoVar = new akto();
        a = aktoVar;
        aihn.registerDefaultInstance(akto.class, aktoVar);
    }

    private akto() {
        emptyProtobufList();
        this.e = emptyProtobufList();
        this.h = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0004\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0006ᐉ\u0004\u0007ᐉ\u0005\bည\u0006\t\u001a", new Object[]{"b", "c", "d", "i", "f", "g", "h", "e"});
            case 3:
                return new akto();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akto.class);
            default:
                return null;
        }
    }
}
