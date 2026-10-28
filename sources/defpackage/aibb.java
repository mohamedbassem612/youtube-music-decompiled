package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aibb extends aihn implements aiis {
    public static final aibb a;
    public long d;
    private int e;
    private byte f = 2;
    public aiie b = emptyProtobufList();
    public String c = "";

    static {
        aibb aibbVar = new aibb();
        a = aibbVar;
        aihn.registerDefaultInstance(aibb.class, aibbVar);
    }

    private aibb() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0001\u0001\u0001Л\u0002ဈ\u0000\u0007ဂ\u0001", new Object[]{"e", "b", aiba.class, "c", "d"});
            case 3:
                return new aibb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aibb.class);
            default:
                return null;
        }
    }
}
