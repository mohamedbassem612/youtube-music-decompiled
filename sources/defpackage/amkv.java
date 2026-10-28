package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class amkv extends aihn implements aiis {
    public static final amkv a;
    private int b;
    private apji c;
    private CommandOuterClass$Command d;
    private amkz e;
    private apji f;
    private byte g = 2;

    static {
        amkv amkvVar = new amkv();
        a = amkvVar;
        aihn.registerDefaultInstance(amkv.class, amkvVar);
    }

    private amkv() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0010\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u000fᐉ\u000e\u0010ᐉ\u0006", new Object[]{"b", "c", "d", "f", "e"});
            case 3:
                return new amkv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amkv.class);
            default:
                return null;
        }
    }
}
