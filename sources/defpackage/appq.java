package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class appq extends aihn implements aiis {
    public static final appq a;
    public static final aihl b;
    private int c;
    private akfd d;
    private alay e;
    private byte f = 2;

    static {
        appq appqVar = new appq();
        a = appqVar;
        aihn.registerDefaultInstance(appq.class, appqVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, appqVar, appqVar, null, 92589349, aika.MESSAGE, appq.class);
    }

    private appq() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0002\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"c", "d", "e"});
            case 3:
                return new appq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(appq.class);
            default:
                return null;
        }
    }
}
