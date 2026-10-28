package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqsu extends aihn implements aiis {
    public static final aqsu a;
    public int b;
    public aqsk c;
    public aqse e;
    public aqrz f;
    public aiie g;
    public aqsm h;
    private akeu i;
    private alay j;
    private apji k;
    private byte l = 2;
    public aiie d = emptyProtobufList();

    static {
        aqsu aqsuVar = new aqsu();
        a = aqsuVar;
        aihn.registerDefaultInstance(aqsu.class, aqsuVar);
    }

    private aqsu() {
        aigj aigjVar = aigj.d;
        this.g = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0002\u000e\t\u0000\u0002\t\u0002Л\u0004ᐉ\u0000\u0007ᐉ\u0004\bᐉ\u0006\tᐉ\u0005\nЛ\u000bᐉ\u0001\fᐉ\u0007\u000eᐉ\b", new Object[]{"b", "d", aqsn.class, "c", "i", "j", "f", "g", ajwo.class, "e", "h", "k"});
            case 3:
                return new aqsu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqsu.class);
            default:
                return null;
        }
    }
}
