package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arcm extends aihn implements aiis {
    public static final arcm a;
    private int b;
    private askp c;
    private apji d;
    private CommandOuterClass$Command e;
    private CommandOuterClass$Command f;
    private byte g = 2;

    static {
        arcm arcmVar = new arcm();
        a = arcmVar;
        aihn.registerDefaultInstance(arcm.class, arcmVar);
    }

    private arcm() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0005\u000f\u0004\u0000\u0000\u0004\u0005ᐉ\n\u0006ᐉ\f\nᐉ\r\u000fᐉ\u000f", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new arcm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arcm.class);
            default:
                return null;
        }
    }
}
