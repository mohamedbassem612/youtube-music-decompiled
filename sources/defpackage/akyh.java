package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akyh extends aihn implements aiis {
    public static final akyh a;
    private int b;
    private ajrn c;
    private anjc d;
    private anjb e;
    private aouw f;
    private apyh g;
    private apcl h;
    private arfe i;
    private argb j;
    private akay k;
    private akbk l;
    private akbq m;
    private akbx n;
    private akbw o;
    private akci p;
    private akfy q;
    private ajiy r;
    private alkt s;
    private akrn t;
    private byte u = 2;

    static {
        akyh akyhVar = new akyh();
        a = akyhVar;
        aihn.registerDefaultInstance(akyh.class, akyhVar);
    }

    private akyh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.u);
            case 1:
                this.u = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\ue1d6\u181e\uf492䤳\u0012\u0000\u0000\u0012\ue1d6\u181eᐉ\u0006\uf243\u181fᐉ\u0000\uf143ᠤᐉ\rﳴᠰᐉ\u0003\ue567ᠲᐉ\n\uef41ᠸᐉ\b\uf2b9ᥚᐉ\f\ue9c4ᯣᐉ\u0001\uea1cᯣᐉ\t\uef20Ḅᐉ\u0005\uee1dἍᐉ\u000f\uf55dΆᐉ\u0002\uec81⟕ᐉ\u0010\uf127⩲ᐉ\u0007\uf5b1⼞ᐉ\u000e\uf76d㋴ᐉ\u000bﶜ㌆ᐉ\u0004\uf492䤳ᐉ\u0011", new Object[]{"b", "i", "c", "p", "f", "m", "k", "o", "d", "l", "h", "r", "e", "s", "j", "q", "n", "g", "t"});
            case 3:
                return new akyh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akyh.class);
            default:
                return null;
        }
    }
}
