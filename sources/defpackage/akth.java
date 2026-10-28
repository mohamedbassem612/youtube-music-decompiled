package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akth extends aihn implements aiis {
    public static final akth a;
    private int b;
    private askp c;
    private CommandOuterClass$Command d;
    private byte e = 2;

    static {
        akth akthVar = new akth();
        a = akthVar;
        aihn.registerDefaultInstance(akth.class, akthVar);
    }

    private akth() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0002\u0003ᐉ\u0001\u0005ᐉ\u0003", new Object[]{"b", "c", "d"});
            case 3:
                return new akth();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akth.class);
            default:
                return null;
        }
    }
}
