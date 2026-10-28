package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class umy implements bnu, tuv {
    public umw a;
    public final axat b;
    private final bog c;
    private final cc d;
    private final avmb e;
    private final avmm f;
    private final umx g;
    private final axaf h;
    private final vor i;
    private final aeiv j;

    public umy(bog bogVar, cc ccVar, vor vorVar, aeiv aeivVar, avmb avmbVar) {
        bogVar.getClass();
        ccVar.getClass();
        aeivVar.getClass();
        avmbVar.getClass();
        this.c = bogVar;
        this.d = ccVar;
        this.i = vorVar;
        this.j = aeivVar;
        this.e = avmbVar;
        this.f = new avmm();
        this.a = new umw(null, false, 127);
        this.g = new umx();
        axaf axafVarA = axaw.a(umv.b);
        this.h = axafVarA;
        this.b = new axag(axafVarA, null);
        bogVar.getLifecycle().b(this);
    }

    @Override // defpackage.tuv
    public final void a(int i, tss tssVar) {
        if (i == 1 || tssVar.c()) {
            this.a = umw.a(this.a, true);
        } else if (i == 3 || !tssVar.c()) {
            this.a = umw.a(this.a, false);
        }
    }

    @Override // defpackage.bnu
    public final void onCreate(bog bogVar) {
        this.d.requireActivity().getOnBackPressedDispatcher().c(this.c, this.g);
    }

    @Override // defpackage.bnu
    public final void onDestroy(bog bogVar) {
        this.f.dispose();
    }

    @Override // defpackage.bnu
    public final void onPause(bog bogVar) {
        tss tssVarL = this.i.L();
        if (tssVarL != null) {
            tssVarL.f(this);
        }
        this.f.b();
    }

    @Override // defpackage.bnu
    public final void onResume(bog bogVar) {
        tss tssVarL = this.i.L();
        if (tssVarL != null) {
            tssVarL.d(this);
        }
        int i = 0;
        this.a = umw.a(this.a, tssVarL != null ? tssVarL.c() : false);
        this.f.c(((avlr) this.j.b).K(new ugm(new prq(18), i)).r().r().O(this.e).af(new uln(new pge(this, tssVarL, 11), 17)));
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStart(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStop(bog bogVar) {
    }
}
