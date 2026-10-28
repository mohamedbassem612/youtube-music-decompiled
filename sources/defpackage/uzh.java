package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uzh implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ uzh(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0243  */
    /* JADX WARN: Code duplicated, block: B:82:0x0246  */
    /* JADX WARN: Type inference failed for: r9v113, types: [java.lang.Object, zjd] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, zvl] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, zvl] */
    /* JADX WARN: Type inference failed for: r9v41, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, zvl] */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        int iAV;
        int i = 11;
        int iIntValue = 0;
        int i2 = 2;
        switch (this.$cid) {
            case 0:
                yno.fN(((xpl) this.a).b, "Exception thrown writing to creation xeno effects state DataStore", (IOException) obj);
                return aher.a;
            case 1:
                yno.fN(((xpl) this.a).b, "Exception thrown reading xeno effects state from DataStore", (IOException) obj);
                return ahng.n(uzf.a().a());
            case 2:
                yno.fN(((xpl) this.a).b, "Exception thrown while resetting xeno effects in DataStore", (IOException) obj);
                return aher.a;
            case 3:
                asdf asdfVar = (asdf) obj;
                boolean zIsEmpty = asdfVar.c.isEmpty();
                Object obj2 = this.a;
                if (!zIsEmpty) {
                    ((vcl) obj2).h("aft");
                    return ahng.n(asdfVar);
                }
                vcl vclVar = (vcl) obj2;
                vclVar.g("[MediaGeneration][Android] Received empty prompts.");
                vclVar.h("aa");
                return ahng.m(new IllegalArgumentException("Received empty prompts."));
            case 4:
                alps alpsVar = (alps) obj;
                if ((alpsVar.b & 8) == 0) {
                    aihf aihfVarCreateBuilder = asdb.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    asdb asdbVar = (asdb) aihfVarCreateBuilder.instance;
                    alpsVar.getClass();
                    asdbVar.c = alpsVar;
                    asdbVar.b |= 1;
                    return ahng.n((asdb) aihfVarCreateBuilder.build());
                }
                Object obj3 = this.a;
                ajwo ajwoVar = alpsVar.e;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                vcl vclVar2 = (vcl) obj3;
                vclVar2.c.a(ajwoVar);
                IllegalStateException illegalStateException = new IllegalStateException("Received error during R2I.");
                vclVar2.f(illegalStateException, "Received error during R2I.", 0);
                return ahng.m(illegalStateException);
            case 5:
                asdl asdlVar = (asdl) obj;
                boolean zIsEmpty2 = asdlVar.c.isEmpty();
                Object obj4 = this.a;
                if (zIsEmpty2) {
                    ((vcl) obj4).g("[MediaGeneration][Android] Received empty blob id.");
                    return ahng.m(new IllegalArgumentException("Received empty blob id."));
                }
                aihf aihfVarCreateBuilder2 = ascu.a.createBuilder();
                String str = asdlVar.c;
                aihfVarCreateBuilder2.copyOnWrite();
                ascu ascuVar = (ascu) aihfVarCreateBuilder2.instance;
                str.getClass();
                ascuVar.b |= 1;
                ascuVar.c = str;
                aihfVarCreateBuilder2.copyOnWrite();
                ascu ascuVar2 = (ascu) aihfVarCreateBuilder2.instance;
                ascuVar2.d = 1;
                ascuVar2.b |= 2;
                return ((vcl) obj4).a((ascu) aihfVarCreateBuilder2.build());
            case 6:
                asdf asdfVar2 = (asdf) obj;
                boolean zIsEmpty3 = asdfVar2.c.isEmpty();
                Object obj5 = this.a;
                if (!zIsEmpty3) {
                    ((vcl) obj5).h("aft");
                    return ahng.n(asdfVar2);
                }
                vcl vclVar3 = (vcl) obj5;
                vclVar3.g("[MediaGeneration][Android] Received empty prompts.");
                vclVar3.h("aa");
                return ahng.m(new IllegalArgumentException("Received empty prompts."));
            case 7:
                ?? r9 = this.a;
                long j = vcp.a;
                return a.k(r9, obj);
            case 8:
                allm allmVar = (allm) obj;
                String str2 = allmVar.d;
                Object obj6 = this.a;
                vwd vwdVar = (vwd) obj6;
                vwdVar.f = str2;
                if ((allmVar.b & 2) != 0) {
                    String str3 = allmVar.d;
                    tyt tytVarEI = yno.eI(str3);
                    if ((!yno.eM(str3) || yno.eN(tytVarEI, "c5b")) && yno.eN(tytVarEI, "t")) {
                        try {
                            tyt tytVarEI2 = yno.eI(((vwd) obj6).f);
                            if (yno.eN(tytVarEI2, "t")) {
                                String strB = tytVarEI2.b("t");
                                strB.getClass();
                                iIntValue = Integer.decode(strB).intValue();
                            }
                            int i3 = 172800;
                            if (iIntValue <= 172800) {
                                i3 = 600;
                                if (iIntValue < 600) {
                                    yno.eL(a.bR(iIntValue, "TTL is too small: TTL = "));
                                }
                                if (iIntValue == 0) {
                                    return aher.a;
                                }
                                vwdVar.i = 3;
                                vwdVar.d(13);
                                long j2 = iIntValue;
                                vwdVar.g = vwdVar.c.f().toEpochMilli() + TimeUnit.SECONDS.toMillis(j2);
                                vwdVar.b(j2);
                                return aher.a;
                            }
                            yno.eL(a.bR(iIntValue, "TTL is too large: TTL = "));
                            iIntValue = i3;
                        } catch (NumberFormatException e) {
                            vwd.f("TTL String format is invalid.", e);
                            vwdVar.d(11);
                            vwdVar.i = 5;
                        }
                        if (iIntValue == 0) {
                            return aher.a;
                        }
                        vwdVar.i = 3;
                        vwdVar.d(13);
                        long j3 = iIntValue;
                        vwdVar.g = vwdVar.c.f().toEpochMilli() + TimeUnit.SECONDS.toMillis(j3);
                        vwdVar.b(j3);
                        return aher.a;
                    }
                    vwdVar.i = 5;
                    vwd.e("Received an invalid challenge string.");
                    vwdVar.d(11);
                } else {
                    vwdVar.i = 5;
                    vwd.e("Received an empty response without a challenge.");
                    vwdVar.d(11);
                }
                return aher.a;
            case 9:
                Throwable th = (Throwable) obj;
                Optional optionalEJ = yno.eJ(th);
                vwd.f("Failed to fetch challenge.", th);
                vwd vwdVar2 = (vwd) this.a;
                yno.eX(9, (dov) vwdVar2.d.io(), optionalEJ);
                vwdVar2.i = 7;
                vwdVar2.b(7200L);
                return ahng.m(new Exception("Network failure"));
            case 10:
                Object obj7 = this.a;
                afvn afvnVarA = ((trr) ((vwd) obj7).e.io()).a();
                try {
                    ListenableFuture listenableFutureA = ((vwd) obj7).a();
                    afvnVarA.close();
                    return listenableFutureA;
                } catch (Throwable th2) {
                    try {
                        afvnVarA.close();
                        break;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            case 11:
                return ((vwd) this.a).a();
            case 12:
                return hed.D();
            case 13:
                agke agkeVar = (agke) obj;
                int size = agkeVar.size();
                while (iIntValue < size) {
                    Object obj8 = this.a;
                    ohp ohpVar = (ohp) agkeVar.get(iIntValue);
                    ohz ohzVar = (ohz) obj8;
                    if (ohpVar.c.equals(ohzVar.c) && ohpVar.i == ohzVar.h && (iAV = a.aV(ohpVar.g)) != 0 && iAV == 2) {
                        return ahng.l();
                    }
                    iIntValue++;
                }
                return aher.a;
            case 14:
                wtr wtrVar = (wtr) obj;
                wtx wtxVarB = wtrVar.b();
                Object obj9 = this.a;
                wtxVarB.n(vxg.a((ajwo) obj9));
                aihl aihlVarCheckIsLite = aihn.checkIsLite(apqf.b);
                aihi aihiVar = (aihi) obj9;
                aihiVar.c(aihlVarCheckIsLite);
                Object objK = aihiVar.j.k(aihlVarCheckIsLite.d);
                wtxVarB.e((apqf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)));
                return wtrVar.d(wtxVarB);
            case 15:
                agke agkeVar2 = (agke) obj;
                Callable callableJ = afwl.j(new wko(agkeVar2, 10));
                Object obj10 = ((abxv) this.a).b;
                xqw xqwVar = (xqw) obj10;
                xrx xrxVar = xqwVar.f;
                return ahcs.f(ahcs.f(ahng.r(callableJ, xrxVar.b), afwl.d(new uzh(xrxVar, 16)), xrxVar.c), afwl.d(new row(obj10, agkeVar2, 14, null)), xqwVar.e);
            case 16:
                Stream stream = Collection.EL.stream(((Map) obj).entrySet());
                Object obj11 = this.a;
                List list = (List) stream.map(new woi(obj11, i2)).collect(aghu.a);
                return ahng.g(list).a(afwl.j(new wko(list, i)), ((xrx) obj11).c);
            case 17:
                return ((yqo) this.a).r.h((alup) obj);
            case 18:
                return ahno.aB(((yqo) this.a).r.f((alup) obj));
            case 19:
                tnx tnxVar = (tnx) obj;
                ((aaok) this.a).b.M();
                if (!tnxVar.h() || tnxVar.c().a == null) {
                    zkf.d(tnxVar.a().a);
                    return ahng.m(tnxVar.a().a);
                }
                Object obj12 = tnxVar.c().a;
                obj12.getClass();
                return ahng.n(obj12);
            default:
                return ahng.m((Throwable) this.a);
        }
    }
}
