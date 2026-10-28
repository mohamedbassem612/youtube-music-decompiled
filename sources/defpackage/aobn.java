package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aobn extends aihn implements aiis {
    public static final aobn a;
    public static final aihl b;
    public int c;
    public ajwo e;
    private byte f = 2;
    public aiie d = emptyProtobufList();

    static {
        aobn aobnVar = new aobn();
        a = aobnVar;
        aihn.registerDefaultInstance(aobn.class, aobnVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aobnVar, aobnVar, null, 15389, aika.MESSAGE, aobn.class);
    }

    private aobn() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000", new Object[]{"c", "d", aobp.class, "e"});
            case 3:
                return new aobn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aobn.class);
            default:
                return null;
        }
    }
}
