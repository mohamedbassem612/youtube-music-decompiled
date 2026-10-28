package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class axfv extends aihn implements aiis {
    public static final axfv a;
    public int b;
    public int c;
    public long d;
    public axgh g;
    public int h;
    public long i;
    public axge j;
    public long k;
    public long l;
    private byte m = 2;
    public String e = "";
    public String f = "";

    static {
        axfv axfvVar = new axfv();
        a = axfvVar;
        aihn.registerDefaultInstance(axfv.class, axfvVar);
    }

    private axfv() {
        emptyProtobufList();
        emptyProtobufList();
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
                aiht aihtVar = audg.l;
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0001\u0001᠌\u0000\u0002᠌\u0005\u0003ဂ\u0006\u0006ဉ\u0007\u0007ဂ\b\bစ\u0001\tဈ\u0002\nဈ\u0003\u000bᐉ\u0004\fဂ\t", new Object[]{"b", "c", aihtVar, "h", aihtVar, "i", "j", "k", "d", "e", "f", "g", "l"});
            case 3:
                return new axfv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(axfv.class);
            default:
                return null;
        }
    }
}
