package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amel extends aihn implements aiis {
    public static final amel a;
    public static final aihl b;
    private int c;
    private apji d;
    private ajwo e;
    private byte f = 2;

    static {
        amel amelVar = new amel();
        a = amelVar;
        aihn.registerDefaultInstance(amel.class, amelVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, amelVar, amelVar, null, 1184, aika.MESSAGE, amel.class);
    }

    private amel() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0002\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"c", "d", "e"});
            case 3:
                return new amel();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amel.class);
            default:
                return null;
        }
    }
}
