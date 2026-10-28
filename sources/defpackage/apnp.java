package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apnp extends aihn implements aiis {
    public static final apnp a;
    private int b;
    private apji c;
    private CommandOuterClass$Command d;
    private apno e;
    private apji f;
    private byte g = 2;

    static {
        apnp apnpVar = new apnp();
        a = apnpVar;
        aihn.registerDefaultInstance(apnp.class, apnpVar);
    }

    private apnp() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0005\u000e\u0004\u0000\u0000\u0004\u0005ᐉ\n\u0007ᐉ\u0004\tᐉ\u000e\u000eᐉ\u0002", new Object[]{"b", "e", "d", "f", "c"});
            case 3:
                return new apnp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apnp.class);
            default:
                return null;
        }
    }
}
