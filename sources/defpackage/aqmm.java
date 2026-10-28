package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqmm extends aihn implements aiis {
    public static final aqmm a;
    private int b;
    private askp c;
    private askp d;
    private aqml e;
    private CommandOuterClass$Command f;
    private byte g = 2;

    static {
        aqmm aqmmVar = new aqmm();
        a = aqmmVar;
        aihn.registerDefaultInstance(aqmm.class, aqmmVar);
    }

    private aqmm() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aqmm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqmm.class);
            default:
                return null;
        }
    }
}
