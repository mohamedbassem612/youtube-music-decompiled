package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class vgb extends ujy implements viz, vga {
    public giy a;
    private gja b;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, viz] */
    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        taq.d();
        gja gjaVar = this.b;
        if (gjaVar != null) {
            return gjaVar;
        }
        giy giyVar = this.a;
        giyVar.b = this;
        atqq.b(giyVar.b, viz.class);
        Object obj = giyVar.a;
        Object obj2 = giyVar.c;
        gkg gkgVar = (gkg) obj2;
        ght ghtVar = (ght) obj;
        gja gjaVar2 = new gja(ghtVar, gkgVar, (gjt) giyVar.d, giyVar.b);
        this.b = gjaVar2;
        return gjaVar2;
    }

    @Override // defpackage.viz
    public final /* synthetic */ void j() {
    }
}
