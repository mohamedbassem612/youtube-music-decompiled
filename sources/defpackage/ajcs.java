package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajcs extends aihn implements aiis {
    public static final ajcs a;
    public int b;
    public int c;
    public ajwo d;
    public ajwo e;
    public ajwo f;
    public ajwo g;
    public aqgg j;
    public ajcr k;
    public aocx l;
    public amud m;
    private byte n = 2;
    public aiie h = emptyProtobufList();
    public aiie i = emptyProtobufList();

    static {
        ajcs ajcsVar = new ajcs();
        a = ajcsVar;
        aihn.registerDefaultInstance(ajcs.class, ajcsVar);
    }

    private ajcs() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001ϧ\u000b\u0000\u0002\n\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005Л\u0006Л\t᠌\u0000\nᐉ\u0005\u000bᐉ\u0006\fᐉ\u0007ϧᐉ\b", new Object[]{"b", "d", "e", "f", "g", "h", ajwo.class, "i", ajwo.class, "c", assp.d, "j", "k", "l", "m"});
            case 3:
                return new ajcs();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajcs.class);
            default:
                return null;
        }
    }
}
