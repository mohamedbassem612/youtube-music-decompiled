package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akso extends aihn implements aiis {
    public static final akso a;
    public static final aihl b;
    public int c;
    public aksp e;
    private byte f = 2;
    public aiie d = emptyProtobufList();

    static {
        akso aksoVar = new akso();
        a = aksoVar;
        aihn.registerDefaultInstance(akso.class, aksoVar);
        b = aihn.newSingularGeneratedExtension(albe.a, aksoVar, aksoVar, null, 2, aika.MESSAGE, akso.class);
    }

    private akso() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0001\u0001Л\u0003ဉ\u0000", new Object[]{"c", "d", aksn.class, "e"});
            case 3:
                return new akso();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akso.class);
            default:
                return null;
        }
    }
}
