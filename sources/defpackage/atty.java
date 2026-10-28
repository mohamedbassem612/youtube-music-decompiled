package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atty extends aihn implements aiis {
    public static final atty a;
    public int b;
    public Object d;
    public int c = 0;
    private byte f = 2;
    public String e = "";

    static {
        atty attyVar = new atty();
        a = attyVar;
        aihn.registerDefaultInstance(atty.class, attyVar);
    }

    private atty() {
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
                return newMessageInfo(a, "\u0004\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0000\u0002\u0001ဈ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006м\u0000\u0007м\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000", new Object[]{"d", "c", "b", "e", atts.class, attp.class, attm.class, attx.class, attv.class, attw.class, attq.class, attr.class, attn.class, atto.class});
            case 3:
                return new atty();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(atty.class);
            default:
                return null;
        }
    }
}
