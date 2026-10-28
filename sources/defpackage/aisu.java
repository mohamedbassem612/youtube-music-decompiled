package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aisu extends aihn implements aiis {
    public static final aisu a;
    public int b;
    public int c;
    public int d;
    public int f;
    public aivr j;
    private byte k = 2;
    public aiie e = emptyProtobufList();
    public String g = "";
    public aiie h = emptyProtobufList();
    public aiie i = emptyProtobufList();

    static {
        aisu aisuVar = new aisu();
        a = aisuVar;
        aihn.registerDefaultInstance(aisu.class, aisuVar);
    }

    private aisu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0003\u0001\u0001ဋ\u0000\u0002Л\u0003᠌\u0006\u0004ဈ\u0007\u0006\u001b\u0007\u001b\u000eဉ\f\u000fင\u0001", new Object[]{"b", "c", "e", aisv.class, "f", aiod.s, "g", "h", aivk.class, "i", aivk.class, "j", "d"});
            case 3:
                return new aisu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aisu.class);
            default:
                return null;
        }
    }
}
