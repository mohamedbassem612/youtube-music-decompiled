package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class attt extends aihn implements aiis {
    public static final attt a;
    public int b;
    public Object d;
    public int c = 0;
    private byte f = 2;
    public String e = "";

    static {
        attt atttVar = new attt();
        a = atttVar;
        aihn.registerDefaultInstance(attt.class, atttVar);
    }

    private attt() {
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
                return newMessageInfo(a, "\u0004\t\u0001\u0001\u0001\t\t\u0000\u0000\u0002\u0001ဈ\u0000\u00027\u0000\u00034\u0000\u0004:\u0000\u0005;\u0000\u0006м\u0000\u0007<\u0000\bм\u0000\t<\u0000", new Object[]{"d", "c", "b", "e", ahnj.class, attl.class, atwa.class, atsq.class});
            case 3:
                return new attt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(attt.class);
            default:
                return null;
        }
    }
}
