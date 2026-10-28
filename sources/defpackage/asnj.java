package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asnj extends aihn implements aiis {
    public static final asnj a;
    public static final aihl b;
    public int c;
    public int d;
    public int e;
    private byte f = 2;

    static {
        asnj asnjVar = new asnj();
        a = asnjVar;
        aihn.registerDefaultInstance(asnj.class, asnjVar);
        b = aihn.newSingularGeneratedExtension(askw.a, asnjVar, asnjVar, null, 389740320, aika.MESSAGE, asnj.class);
    }

    private asnj() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new asnj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asnj.class);
            default:
                return null;
        }
    }
}
