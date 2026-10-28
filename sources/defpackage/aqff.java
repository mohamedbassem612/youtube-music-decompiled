package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqff implements weh {
    static final aqfe a;
    public static final weq b;
    public final aqfg c;

    static {
        aqfe aqfeVar = new aqfe();
        a = aqfeVar;
        b = aqfeVar;
    }

    public aqff(aqfg aqfgVar) {
        this.c = aqfgVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        return new agkx().g();
    }

    @Override // defpackage.weh
    public final String b() {
        return this.c.f;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.weh
    public final /* bridge */ /* synthetic */ tzk d() {
        return new aqfd(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof aqff) && this.c.equals(((aqff) obj).c);
    }

    public aqfh getAction() {
        aqfh aqfhVarA = aqfh.a(this.c.g);
        return aqfhVarA == null ? aqfh.SUGGEST_EDITABLE_TEXT_ACTION_UNKNOWN : aqfhVarA;
    }

    public aktj getEmoji() {
        aqfg aqfgVar = this.c;
        return aqfgVar.d == 3 ? (aktj) aqfgVar.e : aktj.a;
    }

    public Boolean getShouldAppendWhitespace() {
        return Boolean.valueOf(this.c.h);
    }

    public Boolean getShouldConditionallyPrependWhitespace() {
        return Boolean.valueOf(this.c.i);
    }

    public String getText() {
        aqfg aqfgVar = this.c;
        return aqfgVar.d == 2 ? (String) aqfgVar.e : "";
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "SuggestEditableTextItemEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
