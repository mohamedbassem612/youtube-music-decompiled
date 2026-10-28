package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class auij extends aihn implements aiis {
    public static final auij a;
    public int b;
    public auhs d;
    public float h;
    public float j;
    public float m;
    public float n;
    public auex o;
    private byte q = 2;
    public String c = "";
    public aiie e = emptyProtobufList();
    public String f = "";
    public String g = "";
    public aiie i = emptyProtobufList();
    public String k = "";
    public aiie l = emptyProtobufList();
    public String p = "";

    static {
        auij auijVar = new auij();
        a = auijVar;
        aihn.registerDefaultInstance(auij.class, auijVar);
    }

    private auij() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0003\u0003\u0001ဈ\u0000\u0002Л\u0003ဈ\u0002\u0004ဈ\u0003\u0005ခ\u0004\u0006\u001b\u0007ခ\u0005\bဈ\u0006\tᐉ\u0001\n\u001b\u000bခ\u0007\fခ\b\rᐉ\t\u000eဈ\n", new Object[]{"b", "c", "e", auii.class, "f", "g", "h", "i", auip.class, "j", "k", "d", "l", auim.class, "m", "n", "o", "p"});
            case 3:
                return new auij();
            case 4:
                return new jrq((byte[]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(auij.class);
            default:
                return null;
        }
    }
}
