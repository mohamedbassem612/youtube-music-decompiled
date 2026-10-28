package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cea implements bvs {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cea(cdy cdyVar, Object obj, int i) {
        this.$cid = i;
        this.a = cdyVar;
        this.b = obj;
    }

    @Override // defpackage.bvs
    public final void a(Object obj) {
        switch (this.$cid) {
            case 0:
                ((cdz) obj).D((cdy) this.a, (String) this.b);
                break;
            case 1:
                ((cdz) obj).W((cdy) this.b, (btb) this.a);
                break;
            case 2:
                ((cdz) obj).al((cdy) this.a, (Exception) this.b);
                break;
            case 3:
                ((cdz) obj).B((cdy) this.b, (brq) this.a);
                break;
            case 4:
                ((cdz) obj).U((cdy) this.b, (bsx) this.a);
                break;
            case 5:
                ((cdz) obj).aj((cdy) this.b, (btu) this.a);
                break;
            case 6:
                ((cdz) obj).an((cdy) this.a, (String) this.b);
                break;
            case 7:
                ((cdz) obj).I((cdy) this.a, (cni) this.b);
                break;
            case 8:
                ((cdz) obj).Z((cdy) this.b, (bta) this.a);
                break;
            case 9:
                ((cdz) obj).M((cdy) this.a, (Exception) this.b);
                break;
            case 10:
                ((cdz) obj).ao((cdy) this.b, (cay) this.a);
                break;
            case 11:
                ((cdz) obj).aA((cdy) this.a, (cri) this.b);
                break;
            case 12:
                cdz cdzVar = (cdz) obj;
                Object obj2 = this.a;
                cdy cdyVar = (cdy) this.b;
                btz btzVar = (btz) obj2;
                cdzVar.ar(cdyVar, btzVar);
                cdzVar.az(cdyVar, btzVar.b, btzVar.c, btzVar.d);
                break;
            case 13:
                ((cdz) obj).av((cdy) this.b, (bse) this.a);
                break;
            case 14:
                ((cdz) obj).ap((cdy) this.b, (cay) this.a);
                break;
            case 15:
                ((cdz) obj).ak((cdy) this.a, (cni) this.b);
                break;
            case 16:
                ((cdz) obj).aB((cdy) this.a, (cri) this.b);
                break;
            default:
                ((cdz) obj).G((cdy) this.a, (Exception) this.b);
                break;
        }
    }

    public /* synthetic */ cea(cdy cdyVar, Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.b = cdyVar;
        this.a = obj;
    }
}
