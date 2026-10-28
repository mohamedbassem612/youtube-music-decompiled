package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apnk extends aihn implements aiis {
    public static final apnk a;
    private int b;
    private CommandOuterClass$Command c;
    private apji d;
    private askp e;
    private askp f;
    private askp g;
    private byte h = 2;

    static {
        apnk apnkVar = new apnk();
        a = apnkVar;
        aihn.registerDefaultInstance(apnk.class, apnkVar);
    }

    private apnk() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0003ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0001\tᐉ\u0006", new Object[]{"b", "c", "e", "f", "d", "g"});
            case 3:
                return new apnk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apnk.class);
            default:
                return null;
        }
    }
}
