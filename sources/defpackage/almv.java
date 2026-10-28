package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class almv extends aihn implements aiis {
    public static final almv a;
    public int b;
    public alop c;
    public ajwo d;
    private alay f;
    private byte g = 2;
    public aiie e = emptyProtobufList();

    static {
        almv almvVar = new almv();
        a = almvVar;
        aihn.registerDefaultInstance(almv.class, almvVar);
    }

    private almv() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004Л\tᐉ\u0004", new Object[]{"b", "c", "d", "e", ajwo.class, "f"});
            case 3:
                return new almv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(almv.class);
            default:
                return null;
        }
    }
}
