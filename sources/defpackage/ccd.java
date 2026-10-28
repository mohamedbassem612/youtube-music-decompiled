package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ccd implements bvs {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ccd(Object obj, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.a = i;
    }

    @Override // defpackage.bvs
    public final void a(Object obj) {
        switch (this.$cid) {
            case 0:
                int i = ccm.I;
                ((btf) obj).z(this.a);
                break;
            case 1:
                int i2 = ccm.I;
                btn btnVar = ((cdk) this.b).b;
                ((btf) obj).v(this.a);
                break;
            case 2:
                ((cdz) obj).ai((cdy) this.b, this.a);
                break;
            case 3:
                ((cdz) obj).ay((cdy) this.b, this.a);
                break;
            case 4:
                ((cdz) obj).Y((cdy) this.b, this.a);
                break;
            case 5:
                ((cdz) obj).O((cdy) this.b, this.a);
                break;
            case 6:
                ((cdz) obj).X((cdy) this.b, this.a);
                break;
            case 7:
                ((cdz) obj).L((cdy) this.b, this.a);
                break;
            default:
                ((cdz) obj).ae((cdy) this.b, this.a);
                break;
        }
    }
}
