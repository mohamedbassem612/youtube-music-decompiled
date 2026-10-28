package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anzq extends aihn implements aiis {
    public static final anzq a;
    public static final aihl b;
    public int c;
    public int d;
    public ajwo e;
    private byte f = 2;

    static {
        anzq anzqVar = new anzq();
        a = anzqVar;
        aihn.registerDefaultInstance(anzq.class, anzqVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, anzqVar, anzqVar, null, 500208806, aika.MESSAGE, anzq.class);
    }

    private anzq() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001᠌\u0000\u0002ᐉ\u0001", new Object[]{"c", "d", anms.m, "e"});
            case 3:
                return new anzq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anzq.class);
            default:
                return null;
        }
    }
}
