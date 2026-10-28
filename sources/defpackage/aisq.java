package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aisq extends aihn implements aiis {
    public static final aisq a;
    private int b;
    private CommandOuterClass$Command c;
    private CommandOuterClass$Command d;
    private aivm e;
    private byte f = 2;

    static {
        aisq aisqVar = new aisq();
        a = aisqVar;
        aihn.registerDefaultInstance(aisq.class, aisqVar);
    }

    private aisq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new aisq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aisq.class);
            default:
                return null;
        }
    }
}
