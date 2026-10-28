package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ajsv extends aihn implements aiis {
    public static final ajsv a;
    public int b;
    public CommandOuterClass$Command d;
    public CommandOuterClass$Command e;
    public int f;
    private byte i = 2;
    public String c = "";
    public String g = "";
    public String h = "";

    static {
        ajsv ajsvVar = new ajsv();
        a = ajsvVar;
        aihn.registerDefaultInstance(ajsv.class, ajsvVar);
    }

    private ajsv() {
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004᠌\u0003\u0007ဈ\u0007\bဈ\t", new Object[]{"b", "c", "d", "e", "f", ajpr.i, "g", "h"});
            case 3:
                return new ajsv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajsv.class);
            default:
                return null;
        }
    }
}
