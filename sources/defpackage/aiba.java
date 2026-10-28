package defpackage;

import com.google.net.util.proto2api.Status$StatusProto;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiba extends aihn implements aiis {
    public static final aiba a;
    public int b;
    public Status$StatusProto c;
    public aiby d;
    private byte i = 2;
    public String e = "";
    public String f = "";
    public String g = "";
    public boolean h = true;

    static {
        aiba aibaVar = new aiba();
        a = aibaVar;
        aihn.registerDefaultInstance(aiba.class, aibaVar);
    }

    private aiba() {
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဇ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new aiba();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aiba.class);
            default:
                return null;
        }
    }
}
