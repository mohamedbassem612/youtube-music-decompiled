package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alzc extends aihn implements aiis {
    public static final alzc a;
    public int b;
    public alop c;
    public alzd d;
    private albe f;
    private byte g = 2;
    public aiie e = emptyProtobufList();

    static {
        alzc alzcVar = new alzc();
        a = alzcVar;
        aihn.registerDefaultInstance(alzc.class, alzcVar);
    }

    private alzc() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001̉\u0004\u0000\u0001\u0004\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004Л̉ᐉ\u0002", new Object[]{"b", "c", "d", "e", ajwo.class, "f"});
            case 3:
                return new alzc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alzc.class);
            default:
                return null;
        }
    }
}
