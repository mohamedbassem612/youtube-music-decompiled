package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aphw extends aihn implements aiis {
    public static final aphw a;
    public int b;
    public String c;
    public apvm d;
    public String e;
    public apxe f;
    public apxa g;
    public aigu h;
    public int i;
    public ajwo j;
    private apji k;
    private byte l = 2;

    static {
        aphw aphwVar = new aphw();
        a = aphwVar;
        aihn.registerDefaultInstance(aphw.class, aphwVar);
    }

    private aphw() {
        emptyProtobufList();
        this.c = "";
        this.e = "";
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0002\u0012\t\u0000\u0000\u0003\u0002ဈ\u0000\u0005ဉ\u0003\tᐉ\u0007\nဈ\b\u000bဉ\t\rᐉ\n\u000eဉ\u000b\u0011᠌\u000e\u0012ᐉ\u0010", new Object[]{"b", "c", "d", "k", "e", "f", "g", "h", "i", apep.p, "j"});
            case 3:
                return new aphw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aphw.class);
            default:
                return null;
        }
    }
}
