package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akdx extends aihn implements aiis {
    public static final akdx a;
    public int b;
    public String c;
    public int d;
    public akec e;
    public arcr f;
    private aiip g;
    private aiip h;
    private byte i;

    static {
        akdx akdxVar = new akdx();
        a = akdxVar;
        aihn.registerDefaultInstance(akdx.class, akdxVar);
    }

    private akdx() {
        aiip aiipVar = aiip.a;
        this.g = aiipVar;
        this.h = aiipVar;
        this.i = (byte) 2;
        this.c = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                aika aikaVar = aika.STRING;
                aika aikaVar2 = aika.MESSAGE;
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0002\u0000\u0001\u0001ဈ\u0000\u0002᠌\u0001\u0003ᐉ\u0002\u0005ဉ\u0004\u00062\u00072", new Object[]{"b", "c", "d", ajzp.j, "e", "f", "g", new ahud(aikaVar, "", aikaVar2, ajhf.a), "h", new ahud(aikaVar, "", aikaVar2, arco.a)});
            case 3:
                return new akdx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akdx.class);
            default:
                return null;
        }
    }
}
