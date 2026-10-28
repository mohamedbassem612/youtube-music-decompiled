package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class airg extends aihn implements aiis {
    public static final airg a;
    public int b;
    public aird e;
    private alay f;
    private byte g = 2;
    public aiie c = emptyProtobufList();
    public aiie d = emptyProtobufList();

    static {
        airg airgVar = new airg();
        a = airgVar;
        aihn.registerDefaultInstance(airg.class, airgVar);
    }

    private airg() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0002\u0004\u0001Л\u0005ᐉ\u0003\u0007ᐉ\u0002\bЛ", new Object[]{"b", "c", airf.class, "f", "e", "d", aire.class});
            case 3:
                return new airg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(airg.class);
            default:
                return null;
        }
    }
}
