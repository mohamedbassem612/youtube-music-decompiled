package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aozq extends aihn implements aiis {
    public static final aozq a;
    private int b;
    private CommandOuterClass$Command c;
    private CommandOuterClass$Command d;
    private byte e = 2;

    static {
        aozq aozqVar = new aozq();
        a = aozqVar;
        aihn.registerDefaultInstance(aozq.class, aozqVar);
    }

    private aozq() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0002\u0005ᐉ\u0001\u0006ᐉ\u0002", new Object[]{"b", "c", "d"});
            case 3:
                return new aozq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aozq.class);
            default:
                return null;
        }
    }
}
