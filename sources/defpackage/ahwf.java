package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahwf extends aihn implements aiis {
    public static final ahwf a;
    public int b;
    public int c;
    public long d;
    public axgh e;
    public ahwb f;
    public ahab g;
    public ahwc h;
    public aiie i;
    public ahwe j;
    public double k;
    private byte l = 2;

    static {
        ahwf ahwfVar = new ahwf();
        a = ahwfVar;
        aihn.registerDefaultInstance(ahwf.class, ahwfVar);
    }

    private ahwf() {
        aigj aigjVar = aigj.d;
        this.i = emptyProtobufList();
        emptyLongList();
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
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0002\u0010\t\u0000\u0001\u0002\u0002ဉ\u0005\u0003ᐉ\u0006\u0007ဉ\u0007\t\u001b\u000bက\u000b\f᠌\u0000\rဂ\u0001\u000eᐉ\u0002\u0010ဉ\t", new Object[]{"b", "f", "g", "h", "i", ahwh.class, "k", "c", fxi.p, "d", "e", "j"});
            case 3:
                return new ahwf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ahwf.class);
            default:
                return null;
        }
    }
}
