package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class askq extends aihi implements aihj {
    public static final askq a;
    public int b;
    public int c;
    public int d;
    public CommandOuterClass$Command e;
    public CommandOuterClass$Command f;
    private byte g = 2;

    static {
        askq askqVar = new askq();
        a = askqVar;
        aihn.registerDefaultInstance(askq.class, askqVar);
    }

    private askq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ဋ\u0000\u0002ဋ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new askq();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(askq.class);
            default:
                return null;
        }
    }
}
