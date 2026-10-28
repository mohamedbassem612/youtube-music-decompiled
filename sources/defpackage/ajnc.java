package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajnc extends aihn implements aiis {
    public static final ajnc a;
    private int b;
    private int c;
    private CommandOuterClass$Command d;
    private CommandOuterClass$Command e;
    private CommandOuterClass$Command f;
    private CommandOuterClass$Command g;
    private CommandOuterClass$Command h;
    private apji i;
    private apji j;
    private apji k;
    private byte l = 2;

    static {
        ajnc ajncVar = new ajnc();
        a = ajncVar;
        aihn.registerDefaultInstance(ajnc.class, ajncVar);
    }

    private ajnc() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0002\u00044\b\u0000\u0000\b\u0004ᐉ\u0000\fᐉ\u0002\u001aᐉ\u0003&ᐉ\u0001-ᐉ(1ᐉ\u00042ᐉ.4ᐉ)", new Object[]{"b", "c", "d", "f", "g", "e", "i", "h", "k", "j"});
            case 3:
                return new ajnc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajnc.class);
            default:
                return null;
        }
    }
}
