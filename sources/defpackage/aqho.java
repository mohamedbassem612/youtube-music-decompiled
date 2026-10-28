package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqho extends aihn implements aiis {
    public static final aqho a;
    public static final aihl b;
    public aqhl d;
    private int e;
    private byte f = 2;
    public aiie c = emptyProtobufList();

    static {
        aqho aqhoVar = new aqho();
        a = aqhoVar;
        aihn.registerDefaultInstance(aqho.class, aqhoVar);
        b = aihn.newSingularGeneratedExtension(apjh.a, aqhoVar, aqhoVar, null, 37115, aika.MESSAGE, aqho.class);
    }

    private aqho() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᐉ\u0000\u0002Л", new Object[]{"e", "d", "c", aqhl.class});
            case 3:
                return new aqho();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqho.class);
            default:
                return null;
        }
    }
}
