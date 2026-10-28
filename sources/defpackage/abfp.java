package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abfp implements bnu {
    public final vxu c;
    private final yqg d;
    private final abvn e;
    private final avmm f = new avmm();
    public boolean a = false;
    public abob b = abob.a;

    public abfp(yqg yqgVar, abvn abvnVar, vxu vxuVar) {
        this.d = yqgVar;
        this.e = abvnVar;
        this.c = vxuVar;
    }

    public final void a(String str) {
        yqg yqgVar = this.d;
        if (yqgVar != null) {
            yqgVar.g(str);
        }
    }

    public final void b() {
        yqg yqgVar = this.d;
        if (yqgVar != null) {
            yqgVar.j();
        }
    }

    @Override // defpackage.bnu
    public final void onStart(bog bogVar) {
        avmm avmmVar = this.f;
        avmmVar.b();
        avmmVar.e(((avlh) this.e.r().b).al(new aawl(new abae(this, 17), "BCOC", 1), new xuk(11)));
    }

    @Override // defpackage.bnu
    public final void onStop(bog bogVar) {
        this.f.b();
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onDestroy(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onPause(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onResume(bog bogVar) {
    }
}
