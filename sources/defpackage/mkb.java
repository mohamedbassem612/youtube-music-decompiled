package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mkb implements avnd {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mkb(int i, zs zsVar, nuc nucVar, nsl nslVar, int i2) {
        this.$cid = i2;
        this.a = i;
        this.b = zsVar;
        this.c = nucVar;
        this.d = nslVar;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, nuc] */
    @Override // defpackage.avnd
    public final void a() {
        if (this.$cid == 0) {
            String str = mkh.a;
            int i = this.a;
            Object obj = this.b;
            if ((i & 1) != 0) {
                try {
                    ((bcp) ((zs) obj).a).a.releasePermission();
                    return;
                } catch (RuntimeException e) {
                    this.c.f(aslh.LOG_TYPE_INTERNAL_ERROR, (nsl) this.d, e, "InputContentInfoCompat#releasePermission() failed. This is usually due to developer error, such as releasing permission before finished with the file. Review the EditableTextSpec implementation.", new Object[0]);
                    return;
                }
            }
            return;
        }
        asst asstVar = (asst) this.c;
        asmv asmvVar = asstVar.d;
        if (asmvVar == null) {
            asmvVar = asmv.a;
        }
        asmv asmvVar2 = asmvVar;
        int iBt = a.bt(asstVar.e);
        int i2 = iBt == 0 ? 1 : iBt;
        assl asslVarA = assl.a(asstVar.g);
        if (asslVarA == null) {
            asslVarA = assl.DISMISS_BOTTOM_SHEET_ON_ROTATE_MODE_UNKNOWN;
        }
        assl asslVar = asslVarA;
        Object obj2 = this.b;
        Object obj3 = this.d;
        int i3 = this.a;
        int i4 = asstVar.i;
        if (i3 == 0) {
            i3 = -2;
        }
        acxx acxxVar = (acxx) ((mgl) obj2).a;
        acxxVar.j = i3;
        nrv nrvVar = (nrv) obj3;
        acxxVar.l(asmvVar2, i2, asslVar, nrvVar, acxx.j(nrvVar), i4, null, null);
    }

    public /* synthetic */ mkb(mgl mglVar, asst asstVar, int i, nrv nrvVar, int i2) {
        this.$cid = i2;
        this.b = mglVar;
        this.c = asstVar;
        this.a = i;
        this.d = nrvVar;
    }
}
