package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alnr extends aihn implements aiis {
    public static final alnr a;
    public int b;
    public alop c;
    public alns d;
    public alna f;
    public apok g;
    public boolean h;
    private albe i;
    private byte j = 2;
    public aiie e = emptyProtobufList();

    static {
        alnr alnrVar = new alnr();
        a = alnrVar;
        aihn.registerDefaultInstance(alnr.class, alnrVar);
    }

    private alnr() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001̉\u0007\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0006Л\u0007ᐉ\u0004\u000bᐉ\u0006\fဇ\b̉ᐉ\t", new Object[]{"b", "c", "d", "e", ajwo.class, "f", "g", "h", "i"});
            case 3:
                return new alnr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alnr.class);
            default:
                return null;
        }
    }
}
