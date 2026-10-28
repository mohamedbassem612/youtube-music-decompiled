package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anhb extends aihn implements aiis {
    public static final anhb a;
    public int b;
    public int c;
    public aphd d;
    public amzb e;
    public amdz f;
    public aonh g;
    public akkk h;
    public akwd i;
    public ajdl j;
    public akwj k;
    public ajbd l;
    public ajhe m;
    public aojm n;
    public akja o;
    public ajbm p;
    public ajdh q;
    public ajbj r;
    public aqiz s;
    public ajdi t;
    public akki u;
    private arab v;
    private arbz w;
    private byte x = 2;

    static {
        anhb anhbVar = new anhb();
        a = anhbVar;
        aihn.registerDefaultInstance(anhb.class, anhbVar);
    }

    private anhb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.x);
            case 1:
                this.x = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0014\u0000\u0002ﭹ᥏\uf2f2㷔\u0014\u0000\u0000\u0002ﭹ᥏ဉ\u0000\ue63bᮊဉ\u0011︿Ḗᐉ\u0001；‵ဉ\u0004遼⃝ဉ\u000b\uf601⃩ဉ\fｦ⍲ဉ\u0012\uec7b⮮ဉ\u001c\uf48fⱓဉ\u001d\uf007⸑ဉ\u001e\ue987〙ဉ\u001b﵂ヶဉ\"\ueea0ヷဉ!\ue3a3ㅆဉ#ﵝ㏌ဉ&\ue70c㔱ᐉ\u0002\uf79c㕛ဉ\r\ue44a㖌ဉ\u000e\uef32㳠ဉ/\uf2f2㷔ဉ0", new Object[]{"b", "c", "d", "j", "v", "e", "f", "g", "k", "m", "n", "o", "l", "q", "p", "r", "s", "w", "h", "i", "t", "u"});
            case 3:
                return new anhb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anhb.class);
            default:
                return null;
        }
    }
}
