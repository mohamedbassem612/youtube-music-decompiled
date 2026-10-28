package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alkj extends aihn implements aiis {
    public static final alkj a;
    private int b;
    private askp c;
    private askp d;
    private askp e;
    private askp f;
    private CommandOuterClass$Command g;
    private byte h = 2;

    static {
        alkj alkjVar = new alkj();
        a = alkjVar;
        aihn.registerDefaultInstance(alkj.class, alkjVar);
    }

    private alkj() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\t\u0005\u0000\u0000\u0005\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0006ᐉ\b\tᐉ\u0005", new Object[]{"b", "c", "d", "e", "g", "f"});
            case 3:
                return new alkj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alkj.class);
            default:
                return null;
        }
    }
}
