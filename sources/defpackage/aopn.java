package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aopn extends aihn implements aiis {
    public static final aopn a;
    public int b;
    public aiuc c;
    public apji d;
    public long h;
    private byte i = 2;
    public aiie e = emptyProtobufList();
    public aiie f = emptyProtobufList();
    public aiie g = emptyProtobufList();

    static {
        aopn aopnVar = new aopn();
        a = aopnVar;
        aihn.registerDefaultInstance(aopn.class, aopnVar);
    }

    private aopn() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0003\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003\u001b\u0004\u001b\u0005\u001b\bဂ\u0003", new Object[]{"b", "c", "d", "e", aizs.class, "f", aizs.class, "g", aizs.class, "h"});
            case 3:
                return new aopn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aopn.class);
            default:
                return null;
        }
    }
}
