package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aovz extends aihn implements aiis {
    public static final aovz a;
    public int b;
    public aowc c;
    public akfy d;
    private arfe e;
    private ajiy f;
    private apde g;
    private akei h;
    private angn i;
    private aqmq j;
    private byte k = 2;

    static {
        aovz aovzVar = new aovz();
        a = aovzVar;
        aihn.registerDefaultInstance(aovz.class, aovzVar);
    }

    private aovz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\ue1d6\u181e\uf6ce淸\b\u0000\u0000\b\ue1d6\u181eᐉ\u0001\ue108\u196eᐉ\u0000\ue592᯦ᐉ\u0006\uee1dἍᐉ\u0002\uf5b1⼞ᐉ\u0003\uecec䦨ᐉ\u0004\uf72c䰍ᐉ\u0005\uf6ce淸ᐉ\u0007", new Object[]{"b", "e", "c", "i", "f", "d", "g", "h", "j"});
            case 3:
                return new aovz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aovz.class);
            default:
                return null;
        }
    }
}
