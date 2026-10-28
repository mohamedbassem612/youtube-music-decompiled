package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqze extends aihn implements aiis {
    public static final aqze a;
    public static final aihl b;
    public apji c;
    public apji d;
    private int e;
    private byte f = 2;

    static {
        aqze aqzeVar = new aqze();
        a = aqzeVar;
        aihn.registerDefaultInstance(aqze.class, aqzeVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aqzeVar, aqzeVar, null, 328479972, aika.MESSAGE, aqze.class);
    }

    private aqze() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"e", "c", "d"});
            case 3:
                return new aqze();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqze.class);
            default:
                return null;
        }
    }
}
