package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqyy extends aihn implements aiis {
    public static final aqyy a;
    private int b;
    private askp c;
    private askp d;
    private askp e;
    private CommandOuterClass$Command f;
    private byte g = 2;

    static {
        aqyy aqyyVar = new aqyy();
        a = aqyyVar;
        aihn.registerDefaultInstance(aqyy.class, aqyyVar);
    }

    private aqyy() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0002\u0007ᐉ\u0007", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aqyy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqyy.class);
            default:
                return null;
        }
    }
}
