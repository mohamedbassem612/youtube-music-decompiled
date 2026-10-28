package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amtt extends aihn implements aiis {
    public static final amtt a;
    public static final aihl b;
    private int e;
    private byte f = 2;
    public String c = "";
    public aiie d = emptyProtobufList();

    static {
        amtt amttVar = new amtt();
        a = amttVar;
        aihn.registerDefaultInstance(amtt.class, amttVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, amttVar, amttVar, null, 245093374, aika.MESSAGE, amtt.class);
    }

    private amtt() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л", new Object[]{"e", "c", "d", amgu.class});
            case 3:
                return new amtt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amtt.class);
            default:
                return null;
        }
    }
}
