package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yyt implements cbp {
    public final /* synthetic */ yyv a;

    public yyt(yyv yyvVar) {
        this.a = yyvVar;
    }

    @Override // defpackage.cbp
    public final void a(boolean z) {
        yyv yyvVar = this.a;
        yyvVar.I = z;
        zhq zhqVar = zhq.ABR;
        yyvVar.k.post(new csd(this, z, 13));
    }
}
