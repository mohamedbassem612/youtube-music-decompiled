package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajfo extends aihn implements aiis {
    public static final ajfo a;
    private int b;
    private apji c;
    private apji d;
    private apji e;
    private CommandOuterClass$Command f;
    private byte g = 2;

    static {
        ajfo ajfoVar = new ajfo();
        a = ajfoVar;
        aihn.registerDefaultInstance(ajfo.class, ajfoVar);
    }

    private ajfo() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0015\u0004\u0000\u0000\u0004\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0015ᐉ\u0005", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new ajfo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajfo.class);
            default:
                return null;
        }
    }
}
