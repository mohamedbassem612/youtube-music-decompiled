package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajzh extends aihn implements aiis {
    public static final ajzh a;
    private int b;
    private CommandOuterClass$Command c;
    private ajzg d;
    private byte e = 2;

    static {
        ajzh ajzhVar = new ajzh();
        a = ajzhVar;
        aihn.registerDefaultInstance(ajzh.class, ajzhVar);
    }

    private ajzh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0005\u0007\u0002\u0000\u0000\u0001\u0005ᐉ\u0002\u0007ဉ\u0004", new Object[]{"b", "c", "d"});
            case 3:
                return new ajzh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajzh.class);
            default:
                return null;
        }
    }
}
