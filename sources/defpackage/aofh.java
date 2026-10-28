package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aofh extends aihn implements aiis {
    public static final aofh a;
    public int b;
    public int c;
    public aofg e;
    private byte h = 2;
    public String d = "";
    public aiie f = emptyProtobufList();
    public aiie g = emptyProtobufList();

    static {
        aofh aofhVar = new aofh();
        a = aofhVar;
        aihn.registerDefaultInstance(aofh.class, aofhVar);
    }

    private aofh() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0003\u0001᠌\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004Л\u0005Л", new Object[]{"b", "c", aocm.p, "d", "e", "f", aofh.class, "g", aofh.class});
            case 3:
                return new aofh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aofh.class);
            default:
                return null;
        }
    }
}
