package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aref extends aihn implements aiis {
    public static final aref a;
    private int b;
    private CommandOuterClass$Command c;
    private byte d = 2;

    static {
        aref arefVar = new aref();
        a = arefVar;
        aihn.registerDefaultInstance(aref.class, arefVar);
    }

    private aref() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0019\u0019\u0001\u0000\u0000\u0001\u0019ᐉ\u0014", new Object[]{"b", "c"});
            case 3:
                return new aref();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aref.class);
            default:
                return null;
        }
    }
}
