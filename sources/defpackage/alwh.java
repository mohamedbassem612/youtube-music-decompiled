package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class alwh extends aihn implements aiis {
    public static final alwh a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public int g;
    private byte j = 2;
    public String d = "";
    public aiie e = emptyProtobufList();
    public String f = "";
    public String h = "";
    public String i = "";

    static {
        alwh alwhVar = new alwh();
        a = alwhVar;
        aihn.registerDefaultInstance(alwh.class, alwhVar);
    }

    private alwh() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဈ\u0002\u0003\u001a\u0004᠌\u0004\u0005ဈ\u0005\u0006ဈ\u0003\u0007ဈ\u0006", new Object[]{"b", "c", "d", "e", "g", aobi.o, "h", "f", "i"});
            case 3:
                return new alwh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alwh.class);
            default:
                return null;
        }
    }
}
