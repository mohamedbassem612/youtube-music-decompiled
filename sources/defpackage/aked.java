package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aked extends aihn implements aiis {
    public static final aked a;
    private int b;
    private apji c;
    private apji d;
    private apji e;
    private apji f;
    private CommandOuterClass$Command g;
    private apji h;
    private apji i;
    private byte j = 2;

    static {
        aked akedVar = new aked();
        a = akedVar;
        aihn.registerDefaultInstance(aked.class, akedVar);
    }

    private aked() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0006ᐉ\u0005\bᐉ\u0007\u000bᐉ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new aked();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aked.class);
            default:
                return null;
        }
    }
}
