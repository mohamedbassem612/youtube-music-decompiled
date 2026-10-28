package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aooz extends aihn implements aiis {
    public static final aooz a;
    public int b;
    public float c;
    public float d;
    public float i;
    public askp j;
    public askp k;
    public aiie l;
    public apji m;
    private apji n;
    private apji o;
    private askp p;
    private byte q = 2;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";

    static {
        aooz aoozVar = new aooz();
        a = aoozVar;
        aihn.registerDefaultInstance(aooz.class, aoozVar);
    }

    private aooz() {
        emptyProtobufList();
        this.l = emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u000e\u0000\u0001\u0002\u0011\u000e\u0000\u0001\u0007\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ခ\u0002\u0005ခ\u0003\u0006ခ\t\bᐉ\n\tᐉ\u000b\nЛ\u000bဈ\u0004\fဈ\u0005\rဈ\u0006\u000eဈ\u0007\u000fᐉ\f\u0011ᐉ\u000e", new Object[]{"b", "n", "o", "c", "d", "i", "j", "k", "l", apji.class, "e", "f", "g", "h", "m", "p"});
            case 3:
                return new aooz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aooz.class);
            default:
                return null;
        }
    }
}
