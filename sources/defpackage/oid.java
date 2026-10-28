package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oid extends aihn implements aiis {
    public static final oid a;
    private aiip c = aiip.a;
    private byte d = 2;
    public aiie b = emptyProtobufList();

    static {
        oid oidVar = new oid();
        a = oidVar;
        aihn.registerDefaultInstance(oid.class, oidVar);
    }

    private oid() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0003\u0002\u0001\u0001\u0002\u0001Л\u0003в", new Object[]{"b", oic.class, "c", new ahud(aika.STRING, "", aika.MESSAGE, ohy.a)});
            case 3:
                return new oid();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(oid.class);
            default:
                return null;
        }
    }
}
