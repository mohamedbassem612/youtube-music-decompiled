package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aspv extends aihn implements aiis {
    public static final aspv a;
    private int b;
    private CommandOuterClass$Command c;
    private byte d = 2;

    static {
        aspv aspvVar = new aspv();
        a = aspvVar;
        aihn.registerDefaultInstance(aspv.class, aspvVar);
    }

    private aspv() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\b\b\u0001\u0000\u0000\u0001\bᐉ\u0004", new Object[]{"b", "c"});
            case 3:
                return new aspv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aspv.class);
            default:
                return null;
        }
    }
}
