package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aokf extends aihn implements aiis {
    public static final aokf a;
    public int b;
    public alay d;
    public ajng e;
    private byte f = 2;
    public aiie c = emptyProtobufList();

    static {
        aokf aokfVar = new aokf();
        a = aokfVar;
        aihn.registerDefaultInstance(aokf.class, aokfVar);
    }

    private aokf() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0003\u0001Л\u0002ᐉ\u0000\u0005ᐉ\u0003", new Object[]{"b", "c", aoka.class, "d", "e"});
            case 3:
                return new aokf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aokf.class);
            default:
                return null;
        }
    }
}
