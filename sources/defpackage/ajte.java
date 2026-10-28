package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajte extends aihi implements aihj {
    public static final ajte a;
    private int b;
    private apji c;
    private apji d;
    private apji e;
    private CommandOuterClass$Command f;
    private byte g = 2;

    static {
        ajte ajteVar = new ajte();
        a = ajteVar;
        aihn.registerDefaultInstance(ajte.class, ajteVar);
    }

    private ajte() {
        emptyProtobufList();
        emptyIntList();
        emptyIntList();
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u000f\u0019\u0004\u0000\u0000\u0004\u000fᐉ\u0003\u0013ᐉ\u0013\u0018ᐉ\u0005\u0019ᐉ\u0006", new Object[]{"b", "c", "f", "d", "e"});
            case 3:
                return new ajte();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajte.class);
            default:
                return null;
        }
    }
}
