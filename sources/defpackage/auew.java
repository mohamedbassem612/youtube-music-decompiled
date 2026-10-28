package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class auew extends aihn implements aiis {
    public static final auew a;
    public int b;
    public auhs c;
    public aigu e;
    private byte g = 2;
    public String d = "";
    public String f = "";

    static {
        auew auewVar = new auew();
        a = auewVar;
        aihn.registerDefaultInstance(auew.class, auewVar);
    }

    private auew() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004ለ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new auew();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(auew.class);
            default:
                return null;
        }
    }
}
