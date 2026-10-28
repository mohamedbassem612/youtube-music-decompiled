package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anmg implements weh {
    static final anmf a;
    public static final weq b;
    private final anmh c;

    static {
        anmf anmfVar = new anmf();
        a = anmfVar;
        b = anmfVar;
    }

    public anmg(anmh anmhVar) {
        this.c = anmhVar;
    }

    public static anme e(String str) {
        str.getClass();
        ahno.P(!str.isEmpty(), "key cannot be empty");
        aihf aihfVarCreateBuilder = anmh.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        anmh anmhVar = (anmh) aihfVarCreateBuilder.instance;
        anmhVar.b |= 1;
        anmhVar.c = str;
        return new anme(aihfVarCreateBuilder);
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
        return new anme(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof anmg) && this.c.equals(((anmg) obj).c);
    }

    public anmd getDarkPalette() {
        anmd anmdVar = this.c.e;
        return anmdVar == null ? anmd.a : anmdVar;
    }

    public anmd getLightPalette() {
        anmd anmdVar = this.c.d;
        return anmdVar == null ? anmd.a : anmdVar;
    }

    public anmd getVibrantPalette() {
        anmd anmdVar = this.c.f;
        return anmdVar == null ? anmd.a : anmdVar;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicColorSamplePaletteSetEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
