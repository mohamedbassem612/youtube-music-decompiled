package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class assm extends aihn implements aiis {
    public static final assm a;
    public static final aihl b;
    public aqhl c;
    private int e;
    private byte f = 2;
    public aiie d = emptyProtobufList();

    static {
        assm assmVar = new assm();
        a = assmVar;
        aihn.registerDefaultInstance(assm.class, assmVar);
        b = aihn.newSingularGeneratedExtension(asow.a, assmVar, assmVar, null, 525000014, aika.MESSAGE, assm.class);
    }

    private assm() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᐉ\u0000\u0002Л", new Object[]{"e", "c", "d", aqhl.class});
            case 3:
                return new assm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(assm.class);
            default:
                return null;
        }
    }
}
