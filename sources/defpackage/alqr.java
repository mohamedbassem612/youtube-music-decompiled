package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alqr extends aihn implements aiis {
    public static final alqr a;
    public int b;
    public alop c;
    public apji d;
    public apji e;
    public apji f;
    public ajwo i;
    public ajwo j;
    public apji k;
    private albe l;
    private aqcw m;
    private byte n = 2;
    public aiie g = emptyProtobufList();
    public aiie h = emptyProtobufList();

    static {
        alqr alqrVar = new alqr();
        a = alqrVar;
        aihn.registerDefaultInstance(alqr.class, alqrVar);
    }

    private alqr() {
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
                return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001̉\u000b\u0000\u0002\u000b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004Л\u0005Л\bᐉ\u0005\tᐉ\u0006\u000bᐉ\u0007\fᐉ\u0003\rᐉ\t̉ᐉ\u0004", new Object[]{"b", "c", "d", "e", "g", akuf.class, "h", apji.class, "i", "j", "k", "f", "m", "l"});
            case 3:
                return new alqr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alqr.class);
            default:
                return null;
        }
    }
}
