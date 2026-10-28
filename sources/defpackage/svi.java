package defpackage;

import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class svi implements twi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ svl a;
    public final /* synthetic */ aigj b;
    public final /* synthetic */ aigj c;
    public final /* synthetic */ aigj d;
    public final /* synthetic */ String e;
    public final /* synthetic */ aroq f;
    public final /* synthetic */ svj g;

    public /* synthetic */ svi(svl svlVar, aigj aigjVar, aigj aigjVar2, aigj aigjVar3, String str, aroq aroqVar, svj svjVar, int i) {
        this.$cid = i;
        this.a = svlVar;
        this.b = aigjVar;
        this.c = aigjVar2;
        this.d = aigjVar3;
        this.e = str;
        this.f = aroqVar;
        this.g = svjVar;
    }

    @Override // defpackage.twi
    public final void a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            svj svjVar = this.g;
            aroq aroqVar = this.f;
            String str = this.e;
            aigj aigjVar = this.d;
            aigj aigjVar2 = this.c;
            this.a.a(this.b, aigjVar2, aigjVar, str, aroqVar, svjVar, vyq.PRODUCTION);
            return;
        }
        if (i != 1) {
            vyq vyqVar = (vyq) obj;
            if (vyqVar == null) {
                vyqVar = vyq.PRODUCTION;
            }
            svj svjVar2 = this.g;
            aroq aroqVar2 = this.f;
            String str2 = this.e;
            aigj aigjVar3 = this.d;
            aigj aigjVar4 = this.c;
            aigj aigjVar5 = this.b;
            this.a.a(aigjVar5, aigjVar4, aigjVar3, str2, aroqVar2, svjVar2, vyqVar);
            return;
        }
        Boolean bool = (Boolean) obj;
        svj svjVar3 = this.g;
        svl svlVar = this.a;
        if (bool != null && bool.booleanValue()) {
            svlVar.i.g(svlVar.e).setTitle(R.string.payment_fake_wallet_title).setMessage(R.string.payment_fake_wallet_message).setPositiveButton("Succeed", new dkh(svjVar3, 12, null)).setNegativeButton("Fail", new ijf(svlVar, svjVar3, 5)).setOnCancelListener(new gxt(svjVar3, 10)).create().show();
            return;
        }
        aroq aroqVar3 = this.f;
        String str3 = this.e;
        aigj aigjVar6 = this.d;
        aigj aigjVar7 = this.c;
        aigj aigjVar8 = this.b;
        cf cfVar = svlVar.e;
        taf.k(cfVar, hed.C(), new svi(svlVar, aigjVar8, aigjVar7, aigjVar6, str3, aroqVar3, svjVar3, 0), new svi(svlVar, aigjVar8, aigjVar7, aigjVar6, str3, aroqVar3, svjVar3, 2));
    }

    public /* synthetic */ svi(svl svlVar, svj svjVar, aigj aigjVar, aigj aigjVar2, aigj aigjVar3, String str, aroq aroqVar, int i) {
        this.$cid = i;
        this.a = svlVar;
        this.g = svjVar;
        this.b = aigjVar;
        this.c = aigjVar2;
        this.d = aigjVar3;
        this.e = str;
        this.f = aroqVar;
    }
}
