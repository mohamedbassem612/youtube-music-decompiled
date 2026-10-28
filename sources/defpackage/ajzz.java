package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajzz implements weh {
    static final ajzy a;
    public static final weq b;
    private final akaa c;

    static {
        ajzy ajzyVar = new ajzy();
        a = ajzyVar;
        b = ajzyVar;
    }

    public ajzz(akaa akaaVar) {
        this.c = akaaVar;
    }

    public static ajzx e(String str) {
        str.getClass();
        ahno.P(!str.isEmpty(), "key cannot be empty");
        aihf aihfVarCreateBuilder = akaa.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        akaa akaaVar = (akaa) aihfVarCreateBuilder.instance;
        akaaVar.b |= 1;
        akaaVar.c = str;
        return new ajzx(aihfVarCreateBuilder);
    }

    @Override // defpackage.weh
    public final agkz a() {
        return new agkx().g();
    }

    @Override // defpackage.weh
    public final String b() {
        return this.c.c;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.weh
    public final /* bridge */ /* synthetic */ tzk d() {
        return new ajzx(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof ajzz) && this.c.equals(((ajzz) obj).c);
    }

    public akad getCommerceAcquisitionClientPayload() {
        akad akadVar = this.c.d;
        return akadVar == null ? akad.a : akadVar;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "CommerceAcquisitionClientPayloadEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
