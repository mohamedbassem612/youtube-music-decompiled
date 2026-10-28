package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aomc extends aihn implements aiis {
    public static final aomc a;
    private aiip c = aiip.a;
    private byte d = 2;
    public aiie b = emptyProtobufList();

    static {
        aomc aomcVar = new aomc();
        a = aomcVar;
        aihn.registerDefaultInstance(aomc.class, aomcVar);
    }

    private aomc() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0001\u0002\u0001в\u0002Л", new Object[]{"c", new ahud(aika.STRING, "", aika.MESSAGE, aomd.a), "b", alaw.class});
            case 3:
                return new aomc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aomc.class);
            default:
                return null;
        }
    }
}
