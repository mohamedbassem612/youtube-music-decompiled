package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bpn {
    public static final bps a = new bpc(4);
    private final djl b;

    public bpn(bpp bppVar) {
        this(bppVar.getViewModelStore(), bppVar instanceof bny ? ((bny) bppVar).getDefaultViewModelProviderFactory() : bpw.a, bnz.f(bppVar));
    }

    public final bpi a(Class cls) {
        int i = awrn.a;
        return b(new awqv(cls));
    }

    public final bpi b(awsd awsdVar) {
        String strB = awsdVar.b();
        if (strB != null) {
            return this.b.e(awsdVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final bpi c(String str, Class cls) {
        int i = awrn.a;
        return this.b.e(new awqv(cls), str);
    }

    public bpn(bpo bpoVar, bpl bplVar, bpt bptVar) {
        bpoVar.getClass();
        bplVar.getClass();
        bptVar.getClass();
        this.b = new djl(bpoVar, bplVar, bptVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bpn(bpo bpoVar, bpl bplVar) {
        this(bpoVar, bplVar, bpr.a);
        bpoVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bpn(bpp bppVar, bpl bplVar) {
        this(bppVar.getViewModelStore(), bplVar, bnz.f(bppVar));
        bppVar.getClass();
    }
}
