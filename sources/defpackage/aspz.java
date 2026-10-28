package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aspz extends aihn implements aiis {
    public static final aspz a;
    private int b;
    private askp c;
    private askp d;
    private CommandOuterClass$Command e;
    private byte f = 2;

    static {
        aspz aspzVar = new aspz();
        a = aspzVar;
        aihn.registerDefaultInstance(aspz.class, aspzVar);
    }

    private aspz() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0003", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new aspz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aspz.class);
            default:
                return null;
        }
    }
}
