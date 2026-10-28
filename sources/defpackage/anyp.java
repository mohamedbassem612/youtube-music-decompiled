package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anyp extends aihi implements aihj {
    public static final anyp a;
    public int b;
    public String d;
    public long e;
    public aiie f;
    public long g;
    public aiie h;
    public anxf i;
    public String k;
    public long l;
    private byte m = 2;
    public String c = "";

    static {
        anyp anypVar = new anyp();
        a = anypVar;
        aihn.registerDefaultInstance(anyp.class, anypVar);
    }

    private anyp() {
        aigj aigjVar = aigj.d;
        this.d = "";
        this.f = emptyProtobufList();
        this.h = emptyProtobufList();
        this.k = "";
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
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\n\t\u0000\u0002\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b\u0006ဂ\u0004\u0007\u001a\bဉ\u0005\tဈ\u0006\nဂ\u0007", new Object[]{"b", "c", "d", "e", "f", anyq.class, "g", "h", "i", "k", "l"});
            case 3:
                return new anyp();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anyp.class);
            default:
                return null;
        }
    }
}
