package defpackage;

import android.util.Base64;
import j$.net.URLDecoder;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class wcw extends wcz {
    private final agkj a;
    private final weh b;
    private final wej c;
    private final aijp d;
    private final web e;
    private final mbc f;
    private final String g;

    public wcw(web webVar, agkj agkjVar, weh wehVar, wej wejVar, aijp aijpVar, mbc mbcVar, String str) {
        boolean z = true;
        if (wehVar == null && wejVar == null) {
            z = false;
        }
        ahno.P(z, "entity and metadata cannot both be null");
        this.e = webVar;
        this.a = agkjVar;
        this.b = wehVar;
        this.c = wejVar;
        this.d = aijpVar;
        this.f = mbcVar;
        this.g = str;
    }

    static wcw a(web webVar, agkj agkjVar, weh wehVar, wej wejVar, aijp aijpVar, wey weyVar, mbc mbcVar) {
        return new wcw(webVar, agkjVar, wehVar, wejVar, aijpVar, mbcVar, wehVar.b());
    }

    @Override // defpackage.wcz
    public final void b(wdl wdlVar, omr omrVar, agjz agjzVar) throws wcm {
        hef hefVar;
        web webVar = this.e;
        String str = this.g;
        wff wffVarI = webVar.i(omrVar, str);
        aijp aijpVar = wffVarI.d;
        aijp aijpVar2 = this.d;
        if (wey.a(aijpVar, aijpVar2) != null) {
            weh wehVar = wffVarI.b;
            wej wejVar = wffVarI.c;
            weh wehVar2 = this.b;
            boolean z = false;
            if (wehVar2 != null && !Objects.equals(wehVar2, wehVar)) {
                z = true;
            }
            wej wejVar2 = this.c;
            if (wejVar2 == null) {
                wejVar2 = wejVar;
            }
            boolean zEquals = Objects.equals(wejVar2, wejVar);
            aijp aijpVarA = wey.a(aijpVar, aijpVar2);
            if (aijpVarA != null) {
                aijpVar = aijpVarA;
            }
            int i = wfs.a;
            try {
                akve akveVar = (akve) aihn.parseFrom(akve.a, Base64.decode(URLDecoder.decode(str, StandardCharsets.UTF_8), 8));
                if (akveVar != null) {
                    int i2 = akveVar.b;
                    if ((i2 & 1) != 0 && (i2 & 2) != 0 && (i2 & 4) == 0 && (i2 & 8) != 0) {
                        weh wehVarJ = this.b;
                        if (wehVarJ == null && wehVar == null) {
                            throw wcm.a(new Exception("Cannot commit metadata without an existing entity"), -1, 4, 5);
                        }
                        ahfi ahfiVarB = wff.b();
                        if (wehVarJ != null) {
                            agkj agkjVar = this.a;
                            aijp aijpVar3 = wez.a;
                            if (wehVar != null && wehVar != wehVarJ && (hefVar = (hef) agkjVar.get(wehVarJ.getClass())) != null) {
                                wehVarJ = hefVar.j(wehVar, wehVarJ);
                            }
                        } else {
                            wehVarJ = wehVar;
                        }
                        ahfiVarB.a = wehVarJ;
                        wej wejVar3 = this.c;
                        if (wejVar3 == null) {
                            wejVar3 = wejVar;
                        }
                        ahfiVarB.l(wejVar3);
                        ahfiVarB.k(aijpVar);
                        wff wffVarJ = ahfiVarB.j();
                        if (agjzVar != null && (z || !zEquals)) {
                            aaun aaunVar = new aaun();
                            aaunVar.d(this.g);
                            aaunVar.f = wehVar;
                            aaunVar.b = wffVarJ.b;
                            aaunVar.e(wejVar);
                            aaunVar.c(wffVarJ.c);
                            agjzVar.h(aaunVar.b());
                        }
                        d(wdlVar, omrVar, wffVarJ, this.f.f().toEpochMilli());
                        return;
                    }
                }
            } catch (aiik | IllegalArgumentException unused) {
            }
            throw wcm.a(new Exception("Invalid EntityKey"), -1, 4, 5);
        }
    }
}
