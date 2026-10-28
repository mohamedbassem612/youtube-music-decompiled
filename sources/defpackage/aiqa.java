package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiqa implements weh {
    static final aipy a;
    public static final weq b;
    private final aiqb c;

    static {
        aipy aipyVar = new aipy();
        a = aipyVar;
        b = aipyVar;
    }

    public aiqa(aiqb aiqbVar) {
        this.c = aiqbVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        return new agkx().g();
    }

    @Override // defpackage.weh
    public final String b() {
        return this.c.e;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.weh
    public final /* bridge */ /* synthetic */ tzk d() {
        return new aipz(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof aiqa) && this.c.equals(((aiqa) obj).c);
    }

    public String getSelectedAccessRestrictionParams() {
        return this.c.i;
    }

    public String getSelectedItemIcon() {
        aiqb aiqbVar = this.c;
        return aiqbVar.c == 5 ? (String) aiqbVar.d : "";
    }

    public String getSelectedItemImageUrl() {
        return this.c.h;
    }

    public Integer getSelectedItemIndex() {
        return Integer.valueOf(this.c.f);
    }

    public String getSelectedItemTitle() {
        return this.c.g;
    }

    public asnm getSelectedItemYticonImage() {
        aiqb aiqbVar = this.c;
        return aiqbVar.c == 7 ? (asnm) aiqbVar.d : asnm.a;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "AccessRestrictionSelectionEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
