package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajdw extends aihn implements aiis {
    public static final ajdw a;
    public int b;
    public long c;
    public long d;
    public int e;
    public ajwo h;
    public aqmh i;
    public aosr j;
    private byte m = 2;
    public String f = "";
    public String g = "";
    public aiie k = emptyProtobufList();
    public aiie l = emptyProtobufList();

    static {
        ajdw ajdwVar = new ajdw();
        a = ajdwVar;
        aihn.registerDefaultInstance(ajdw.class, ajdwVar);
    }

    private ajdw() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0010\n\u0000\u0002\u0002\u0001ဂ\u0000\u0002ဂ\u0001\u0004ဈ\u0004\u0007ဈ\u0005\bᐉ\u0006\tᐉ\u0007\rဉ\b\u000e\u001b\u000f\u001b\u0010င\u0003", new Object[]{"b", "c", "d", "f", "g", "h", "i", "j", "k", amuo.class, "l", amuo.class, "e"});
            case 3:
                return new ajdw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajdw.class);
            default:
                return null;
        }
    }
}
