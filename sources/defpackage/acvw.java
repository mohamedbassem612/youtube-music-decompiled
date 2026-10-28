package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acvw implements nqu {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ acvw(acvx acvxVar, ViewGroup viewGroup, akrn akrnVar, String str, int i) {
        this.$cid = i;
        this.a = acvxVar;
        this.b = viewGroup;
        this.c = akrnVar;
        this.d = str;
    }

    @Override // defpackage.nqu
    public final void a() {
        ViewGroup viewGroup;
        if (this.$cid == 0) {
            Object obj = this.d;
            ((acvx) this.a).c((ViewGroup) this.b, (akrn) this.c, (String) obj);
            return;
        }
        jfv jfvVar = (jfv) this.b;
        acxt acxtVar = jfvVar.d;
        Object obj2 = this.c;
        if (obj2 != acxtVar || acxtVar == null || (viewGroup = jfvVar.c) == null) {
            return;
        }
        acxt acxtVar2 = (acxt) obj2;
        acxtVar2.f((adly) this.d, (acxm) this.a, false);
        jfvVar.m();
        View viewA = acxtVar2.a();
        if (viewA == null) {
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.addView(viewA);
        viewGroup.setVisibility(0);
        viewGroup.bringToFront();
    }

    public /* synthetic */ acvw(jfv jfvVar, acxt acxtVar, adly adlyVar, acxm acxmVar, int i) {
        this.$cid = i;
        this.b = jfvVar;
        this.c = acxtVar;
        this.d = adlyVar;
        this.a = acxmVar;
    }
}
