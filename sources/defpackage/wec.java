package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class wec extends wcz {
    private final web a;
    private final String b;
    private final akvd c;
    private final byte[] d;
    private final mbc e;
    private final aijp f;
    private final wjr g;

    public wec(web webVar, wjr wjrVar, String str, akvd akvdVar, byte[] bArr, mbc mbcVar, aijp aijpVar) {
        this.a = webVar;
        this.g = wjrVar;
        this.b = str;
        this.c = akvdVar;
        this.d = bArr;
        this.e = mbcVar;
        this.f = aijpVar;
    }

    @Override // defpackage.wcz
    public final void b(wdl wdlVar, omr omrVar, agjz agjzVar) throws wcm {
        String str = this.b;
        wff wffVarI = this.a.i(omrVar, str);
        aijp aijpVar = wffVarI.d;
        aijp aijpVar2 = this.f;
        if (wey.b(aijpVar, aijpVar2)) {
            weh wehVar = wffVarI.b;
            wej wejVar = wffVarI.c;
            wjr wjrVar = this.g;
            akvd akvdVar = this.c;
            byte[] bArr = this.d;
            aijp aijpVar3 = wez.a;
            byte[] bArrA = wez.a(wjrVar, akvdVar, str, wehVar != null ? wehVar.c() : null, bArr);
            weh wehVarA = bArrA != null ? wjrVar.a(str, bArrA) : null;
            if (wehVarA == null) {
                throw wcm.a(new IllegalArgumentException("One of the edits failed for key: ".concat(String.valueOf(str))), -1, 4, 5);
            }
            boolean zEquals = wehVarA.equals(wehVar);
            wehVarA.getClass().getSimpleName();
            aijp aijpVarA = wey.a(aijpVar, aijpVar2);
            if (aijpVarA != null) {
                aijpVar = aijpVarA;
            }
            ahfi ahfiVarB = wff.b();
            ahfiVarB.a = wehVarA;
            ahfiVarB.l(wejVar);
            ahfiVarB.k(aijpVar);
            wff wffVarJ = ahfiVarB.j();
            if (agjzVar != null && !zEquals) {
                aaun aaunVar = new aaun();
                aaunVar.d(str);
                aaunVar.f = wehVar;
                aaunVar.b = wehVarA;
                aaunVar.c(wejVar);
                agjzVar.h(aaunVar.b());
            }
            d(wdlVar, omrVar, wffVarJ, this.e.f().toEpochMilli());
        }
    }
}
