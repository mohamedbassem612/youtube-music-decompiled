package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajgd implements weh {
    static final ajgb a;
    public static final weq b;
    private final ajge c;

    static {
        ajgb ajgbVar = new ajgb();
        a = ajgbVar;
        b = ajgbVar;
    }

    public ajgd(ajge ajgeVar) {
        this.c = ajgeVar;
    }

    public static ajgc e(String str) {
        str.getClass();
        ahno.P(!str.isEmpty(), "key cannot be empty");
        aihf aihfVarCreateBuilder = ajge.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ajge ajgeVar = (ajge) aihfVarCreateBuilder.instance;
        ajgeVar.c |= 1;
        ajgeVar.d = str;
        return new ajgc(aihfVarCreateBuilder);
    }

    @Override // defpackage.weh
    public final agkz a() {
        return new agkx().g();
    }

    @Override // defpackage.weh
    public final String b() {
        return this.c.d;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof ajgd) && this.c.equals(((ajgd) obj).c);
    }

    @Override // defpackage.weh
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final ajgc d() {
        return new ajgc(this.c.toBuilder());
    }

    public String getAssetId() {
        return this.c.e;
    }

    public ajgf getAssetItemUsageState() {
        ajgf ajgfVarA = ajgf.a(this.c.f);
        return ajgfVarA == null ? ajgf.ASSET_ITEM_USAGE_STATE_UNSPECIFIED : ajgfVarA;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "AssetItemUsageStateEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
