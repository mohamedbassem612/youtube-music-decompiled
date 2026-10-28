package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ageo extends ager {
    final /* synthetic */ String a = "";
    final /* synthetic */ ager b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ageo(ager agerVar, ager agerVar2) {
        super(agerVar2);
        this.b = agerVar;
    }

    @Override // defpackage.ager
    public final CharSequence a(Object obj) {
        return obj == null ? this.a : this.b.a(obj);
    }
}
