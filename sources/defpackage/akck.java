package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akck extends aihn implements aiis {
    public static final akck a;
    public int b;
    public akrn c;
    public anjk d;
    public aiub e;
    public ajlh f;
    private akcj g;
    private ajes h;
    private apuu i;
    private akbb j;
    private anjf k;
    private aqfn l;
    private byte m = 2;

    static {
        akck akckVar = new akck();
        a = akckVar;
        aihn.registerDefaultInstance(akck.class, akckVar);
    }

    private akck() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\uf549᩸\ue79e걫\n\u0000\u0000\t\uf549᩸ᐉ\u0000ﰛỾᐉ\u0001ﲁ㚒ᐉ\u0002\ue6b3䤦ᐉ\u0003\uf492䤳ᐉ\u0005\uf7ce䩰ᐉ\u0004\uf8ac佗ᐉ\u0006\uf48b咡ᐉ\u0007殺绛ဉ\b\ue79e걫ᐉ\t", new Object[]{"b", "g", "h", "i", "j", "c", "k", "d", "l", "e", "f"});
            case 3:
                return new akck();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akck.class);
            default:
                return null;
        }
    }
}
