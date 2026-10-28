package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arnr extends aihn implements aiis {
    public static final arnr a;
    private int b;
    private akxu c;
    private CommandOuterClass$Command d;
    private CommandOuterClass$Command e;
    private CommandOuterClass$Command f;
    private byte g = 2;

    static {
        arnr arnrVar = new arnr();
        a = arnrVar;
        aihn.registerDefaultInstance(arnr.class, arnrVar);
    }

    private arnr() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0003\u0007\u0004\u0000\u0000\u0003\u0003ဉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0007ᐉ\u0005", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new arnr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arnr.class);
            default:
                return null;
        }
    }
}
