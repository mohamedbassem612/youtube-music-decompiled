package defpackage;

import com.google.net.util.proto2api.Status$StatusProto;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asbn extends aihi implements aihj {
    public static final asbn a;
    public Status$StatusProto b;
    private int c;
    private byte d = 2;

    static {
        asbn asbnVar = new asbn();
        a = asbnVar;
        aihn.registerDefaultInstance(asbn.class, asbnVar);
    }

    private asbn() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"c", "b"});
            case 3:
                return new asbn();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asbn.class);
            default:
                return null;
        }
    }
}
