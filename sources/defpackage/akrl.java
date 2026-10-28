package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akrl extends aihi implements aihj {
    public static final akrl a;
    public int b;
    public asmv c;
    public CommandOuterClass$Command e;
    private byte f = 2;
    public aigj d = aigj.d;

    static {
        akrl akrlVar = new akrl();
        a = akrlVar;
        aihn.registerDefaultInstance(akrl.class, akrlVar);
    }

    private akrl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ည\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new akrl();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akrl.class);
            default:
                return null;
        }
    }
}
