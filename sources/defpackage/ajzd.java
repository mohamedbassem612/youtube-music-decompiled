package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajzd extends aihn implements aiis {
    public static final ajzd a;
    private int b;
    private ajzf c;
    private ajjw d;
    private aowv e;
    private ajnf f;
    private akas g;
    private byte h = 2;

    static {
        ajzd ajzdVar = new ajzd();
        a = ajzdVar;
        aihn.registerDefaultInstance(ajzd.class, ajzdVar);
    }

    private ajzd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\ueb11ἑﻩ\ue94a\u0007\u0005\u0000\u0000\u0005\ueb11ἑᐉ\u0003ﯠⲵᐉ\u0000\ue818㢄ᐉ\u0001ﶭ愤ᐉ\u0002ﻩ\ue94a\u0007ᐉ\u0004", new Object[]{"b", "f", "c", "d", "e", "g"});
            case 3:
                return new ajzd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajzd.class);
            default:
                return null;
        }
    }
}
