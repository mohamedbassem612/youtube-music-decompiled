package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class abmm implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ abmm(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v33, types: [axsp, java.lang.Object] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        abmj abmjVar;
        switch (this.$cid) {
            case 0:
                aazs aazsVar = (aazs) obj;
                abmo abmoVar = (abmo) this.a;
                String str = abmoVar.e;
                if (str != null && TextUtils.equals(str, aazsVar.a())) {
                    abmoVar.f();
                    break;
                }
                break;
            case 1:
                acip acipVar = ((aazq) obj).b;
                Object obj2 = this.a;
                abmo abmoVar2 = (abmo) obj2;
                abmoVar2.f = acipVar;
                String str2 = abmoVar2.e;
                if (str2 != null && str2.equals(acipVar.au())) {
                    abnl abnlVarN = acipVar.n();
                    abnp abnpVarO = acipVar.o();
                    abnl abnlVarA = (!abmoVar2.c.l || (abmjVar = abmoVar2.d) == null || abnlVarN == null) ? abnlVarN : abmjVar.a(abnlVarN);
                    abpj abpjVar = abmoVar2.b;
                    abpjVar.o(abnlVarA, abnpVarO, acipVar.f());
                    if (abnlVarA == null || abnlVarA.O()) {
                        abpjVar.u(acipVar.au(), new abmp(obj2, 1));
                    }
                    abmj abmjVar2 = abmoVar2.d;
                    if (abmjVar2 != null && abnlVarN != null) {
                        abmjVar2.b(abnlVarN);
                    }
                    abmoVar2.f();
                    break;
                }
                break;
            case 2:
                ((isi) this.a).C((aayw) obj);
                break;
            case 3:
                ((isi) this.a).C((aaze) obj);
                break;
            case 4:
                ((isi) this.a).C((aboe) obj);
                break;
            case 5:
                ((isi) this.a).D((aazf) obj);
                break;
            case 6:
                ((isi) this.a).C((aaxk) obj);
                break;
            case 7:
                ((isi) this.a).D((aazg) obj);
                break;
            case 8:
                ((isi) this.a).D((aaxo) obj);
                break;
            case 9:
                ((isi) this.a).C((aayn) obj);
                break;
            case 10:
                ((isi) this.a).D((aays) obj);
                break;
            case 11:
                ((isi) this.a).D((abmf) obj);
                break;
            case 12:
                ((isi) this.a).D((tas) obj);
                break;
            case 13:
                ((isi) this.a).C((tas) obj);
                break;
            case 14:
                ((isi) this.a).D((aayu) obj);
                break;
            case 15:
                ((isi) this.a).D((aayv) obj);
                break;
            case 16:
                ((isi) this.a).D((abmh) obj);
                break;
            case 17:
                aayp aaypVar = (aayp) obj;
                alvl alvlVarT = aaypVar.a.t();
                aigj aigjVar = alvlVarT != null ? alvlVarT.s : null;
                abol abolVar = (abol) this.a;
                abolVar.a = aigjVar;
                abolVar.b = aaypVar.b;
                break;
            case 18:
                acip acipVar2 = ((aazs) obj).a;
                if (acipVar2.a() == 0) {
                    abol abolVar2 = (abol) this.a;
                    if (acipVar2.au().equals(abolVar2.b)) {
                        abolVar2.a = null;
                    }
                }
                break;
            case 19:
                aazq aazqVar = (aazq) obj;
                ((abpj) this.a).o = aazqVar.equals(aazq.a) ? null : aazqVar.b.au();
                break;
            default:
                abob abobVar = ((aazj) obj).a;
                Object obj3 = this.a;
                if (abobVar == abob.b) {
                    abtr abtrVar = (abtr) obj3;
                    if (abtrVar.i > 0) {
                        abtrVar.k.g.kk(new aazf());
                    }
                }
                if (abobVar == abob.i) {
                    ((abtr) obj3).a();
                }
                break;
        }
    }
}
