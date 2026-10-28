package defpackage;

import android.net.Uri;
import android.util.Base64;
import android.util.Pair;
import androidx.preference.EditTextPreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreCheckBoxPreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreListPreference;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protos.youtube.api.innertube.InnertubeGetAssetService$GetAssetResponse;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class svm implements twi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ svm(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:39:0x0109  */
    /* JADX WARN: Code duplicated, block: B:40:0x010c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0123  */
    /* JADX WARN: Code duplicated, block: B:45:0x0134  */
    /* JADX WARN: Code duplicated, block: B:64:0x0163  */
    /* JADX WARN: Code duplicated, block: B:66:0x0169  */
    /* JADX WARN: Code duplicated, block: B:69:0x0172  */
    /* JADX WARN: Code duplicated, block: B:71:0x0175  */
    /* JADX WARN: Code duplicated, block: B:72:0x0177  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, ugk] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, vob] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, vri] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, ugk] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, svn] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, twi] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, svn] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r2v50, types: [java.lang.Object, vxe] */
    @Override // defpackage.twi
    public final void a(Object obj) {
        Object obj2;
        aihl aihlVar;
        aihl aihlVarCheckIsLite;
        Object objK;
        Object objC;
        aqcr aqcrVar;
        aihl aihlVarCheckIsLite2;
        aihi aihiVar;
        Object objK2;
        Object objC2;
        aqcr aqcrVar2;
        aihl aihlVarCheckIsLite3;
        boolean zEquals;
        aihl aihlVarCheckIsLite4;
        int i;
        int iBi;
        int iBi2;
        int iBi3;
        String str = "Invalid argument";
        int i2 = 5;
        int i3 = 3;
        switch (this.$cid) {
            case 0:
                ((svo) this.a).a((vyq) obj, this.b);
                break;
            case 1:
                ((svo) this.a).a(vyq.PRODUCTION, this.b);
                break;
            case 2:
                ((ProtoDataStoreCheckBoxPreference) this.b).aj((Boolean) this.a);
                break;
            case 3:
                ((EditTextPreference) this.b).i((String) this.a);
                break;
            case 4:
                ((ProtoDataStoreListPreference) this.b).aj((String) this.a);
                break;
            case 5:
                ((ProtoDataStoreListPreference) this.b).ae((String) this.a, (String) obj);
                break;
            case 6:
                ((ProtoDataStoreListPreference) this.b).ak((String) this.a);
                break;
            case 7:
                ((ugl) ((Pair) this.b).first).iY(this.a);
                break;
            case 8:
                Boolean bool = (Boolean) obj;
                if (bool != null && bool.booleanValue()) {
                    ((ugl) ((Pair) this.b).first).iY(this.a);
                    break;
                }
                break;
            case 9:
                Boolean bool2 = (Boolean) obj;
                tuk.l(((unn) this.a).b(), false);
                bool2.getClass();
                ((aqi) this.b).b(bool2);
                break;
            case 10:
                Throwable th = (Throwable) obj;
                tuk.l(((unn) this.a).b(), false);
                Object obj3 = this.b;
                if (th == null) {
                    ((aqi) obj3).b(Boolean.FALSE);
                } else {
                    ((aqi) obj3).d(th);
                }
                break;
            case 11:
                Boolean bool3 = (Boolean) obj;
                ?? r2 = this.b;
                if (bool3 != null && bool3.booleanValue()) {
                    r2.a(Boolean.TRUE);
                } else {
                    uoa uoaVar = (uoa) this.a;
                    Iterator it = uoaVar.h.c.iterator();
                    while (it.hasNext()) {
                        vfb vfbVarA = uoaVar.e.a(Uri.parse(((uqa) it.next()).b));
                        if (vfbVarA != null && vfbVarA.l() != null) {
                            r2.a(Boolean.TRUE);
                            break;
                        }
                    }
                    if (uoaVar.i()) {
                        uoaVar.r.isPresent();
                    }
                    r2.a(Boolean.FALSE);
                }
                break;
            case 12:
                ((upg) this.a).k((upd) this.b, (Throwable) obj, "Error from edit image future");
                break;
            case 13:
                ((upc) this.b).f.k((upd) this.a, (Throwable) obj, "Error from image load future");
                break;
            case 14:
                vbh vbhVar = (vbh) obj;
                Object obj4 = this.b;
                if (vbhVar != null) {
                    String str2 = ((uzz) this.a).a;
                    str2.getClass();
                    InnertubeGetAssetService$GetAssetResponse innertubeGetAssetService$GetAssetResponse = vbhVar.a;
                    Optional optionalFindFirst = Collection.EL.stream(innertubeGetAssetService$GetAssetResponse.d).filter(new uso(new uwk(str2, i2), 10)).findFirst();
                    optionalFindFirst.getClass();
                    if (!optionalFindFirst.isPresent()) {
                        ((uzm) obj4).b.c(str2, innertubeGetAssetService$GetAssetResponse, vbhVar.b, new ulo(9));
                    } else {
                        int iBt = a.bt(((ajhu) optionalFindFirst.get()).c);
                        if (iBt == 0) {
                            iBt = 1;
                        }
                        int i4 = iBt - 1;
                        if (i4 == 0) {
                            str = "Unknown error";
                        } else if (i4 == 1) {
                            str = "Invalid asset ID";
                        } else if (i4 == 2) {
                            str = "Asset not found";
                        } else if (i4 == 3) {
                            str = "Server failure";
                        } else if (i4 == 4) {
                            str = "Invalid source ID";
                        }
                        ((uzm) obj4).f(new RuntimeException(str));
                    }
                } else {
                    zvl zvlVar = ((uzm) obj4).a;
                    zvj zvjVarA = zvk.a();
                    zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                    zvjVarA.j = 23;
                    zvjVarA.i = 397;
                    zvjVarA.d("[Creation][Android][Effects]No xeno assets received.");
                    zvlVar.a(zvjVarA.a());
                }
                break;
            case 15:
                vbh vbhVar2 = (vbh) obj;
                Object obj5 = this.a;
                if (vbhVar2 != null) {
                    Object obj6 = this.b;
                    InnertubeGetAssetService$GetAssetResponse innertubeGetAssetService$GetAssetResponse2 = vbhVar2.a;
                    Stream stream = Collection.EL.stream(innertubeGetAssetService$GetAssetResponse2.d);
                    String str3 = ((uzz) obj6).a;
                    Optional optionalFindFirst2 = stream.filter(new uso(str3, 12)).findFirst();
                    if (!optionalFindFirst2.isPresent()) {
                        ((vak) obj5).c.c(str3, innertubeGetAssetService$GetAssetResponse2, vbhVar2.b, new ulo(10));
                    } else {
                        int iBt2 = a.bt(((ajhu) optionalFindFirst2.get()).c);
                        if (iBt2 == 0) {
                            iBt2 = 1;
                        }
                        int i5 = iBt2 - 1;
                        if (i5 == 0) {
                            str = "Unknown error";
                        } else if (i5 == 1) {
                            str = "Invalid asset ID";
                        } else if (i5 == 2) {
                            str = "Asset not found";
                        } else if (i5 == 3) {
                            str = "Server failure";
                        } else if (i5 == 4) {
                            str = "Invalid source ID";
                        }
                        ((vak) obj5).l(new RuntimeException(str));
                    }
                } else {
                    zvl zvlVar2 = ((vak) obj5).b;
                    zvj zvjVarA2 = zvk.a();
                    zvjVarA2.c(ajtv.ERROR_LEVEL_ERROR);
                    zvjVarA2.j = 23;
                    zvjVarA2.i = 397;
                    zvjVarA2.d("[Creation][Android][Effects]No xeno assets received.");
                    zvlVar2.a(zvjVarA2.a());
                }
                break;
            case 16:
                List list = (List) obj;
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        obj2 = this.a;
                        if (it2.hasNext()) {
                            apji apjiVar = (apji) it2.next();
                            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aqct.a);
                            apjiVar.c(aihlVarCheckIsLite5);
                            if (apjiVar.j.n(aihlVarCheckIsLite5.d)) {
                                aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aqct.a);
                                aihi aihiVar2 = (aihi) obj2;
                                aihiVar2.c(aihlVarCheckIsLite6);
                                if (aihiVar2.j.n(aihlVarCheckIsLite6.d)) {
                                    zEquals = yno.fj(apjiVar).equals(yno.fj((apji) obj2));
                                } else {
                                    aihlVar = aqct.b;
                                    aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                                    apjiVar.c(aihlVarCheckIsLite);
                                    objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                                    if (objK == null) {
                                        objC = aihlVarCheckIsLite.b;
                                    } else {
                                        objC = aihlVarCheckIsLite.c(objK);
                                    }
                                    aqcrVar = (aqcr) objC;
                                    aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                                    aihiVar = (aihi) obj2;
                                    aihiVar.c(aihlVarCheckIsLite2);
                                    objK2 = aihiVar.j.k(aihlVarCheckIsLite2.d);
                                    if (objK2 == null) {
                                        objC2 = aihlVarCheckIsLite2.b;
                                    } else {
                                        objC2 = aihlVarCheckIsLite2.c(objK2);
                                    }
                                    aqcrVar2 = (aqcr) objC2;
                                    aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
                                    apjiVar.c(aihlVarCheckIsLite3);
                                    if (apjiVar.j.n(aihlVarCheckIsLite3.d)) {
                                        aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar);
                                        aihiVar.c(aihlVarCheckIsLite4);
                                        if (aihiVar.j.n(aihlVarCheckIsLite4.d)) {
                                            i = aqcrVar.c;
                                            iBi = a.bi(i);
                                            if (iBi == 0 && iBi == 4) {
                                                int iBi4 = a.bi(i);
                                                if (iBi4 == 0) {
                                                    iBi4 = 1;
                                                }
                                                int iBi5 = a.bi(aqcrVar2.c);
                                                if (iBi5 == 0) {
                                                    iBi5 = 1;
                                                }
                                                if (iBi4 == iBi5) {
                                                    alay alayVar = aqcrVar.d;
                                                    if (alayVar == null) {
                                                        alayVar = alay.a;
                                                    }
                                                    alay alayVar2 = aqcrVar2.d;
                                                    if (alayVar2 == null) {
                                                        alayVar2 = alay.a;
                                                    }
                                                    if (alayVar.equals(alayVar2)) {
                                                        zEquals = true;
                                                    }
                                                }
                                                zEquals = false;
                                            } else {
                                                iBi2 = a.bi(i);
                                                if (iBi2 == 0) {
                                                    iBi2 = 1;
                                                }
                                                iBi3 = a.bi(aqcrVar2.c);
                                                if (iBi3 == 0) {
                                                    iBi3 = 1;
                                                }
                                                if (iBi2 == iBi3) {
                                                    zEquals = true;
                                                } else {
                                                    zEquals = false;
                                                }
                                            }
                                        } else {
                                            zEquals = false;
                                        }
                                    } else {
                                        zEquals = false;
                                    }
                                }
                            } else {
                                aihlVar = aqct.b;
                                aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                                apjiVar.c(aihlVarCheckIsLite);
                                objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                                if (objK == null) {
                                    objC = aihlVarCheckIsLite.b;
                                } else {
                                    objC = aihlVarCheckIsLite.c(objK);
                                }
                                aqcrVar = (aqcr) objC;
                                aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                                aihiVar = (aihi) obj2;
                                aihiVar.c(aihlVarCheckIsLite2);
                                objK2 = aihiVar.j.k(aihlVarCheckIsLite2.d);
                                if (objK2 == null) {
                                    objC2 = aihlVarCheckIsLite2.b;
                                } else {
                                    objC2 = aihlVarCheckIsLite2.c(objK2);
                                }
                                aqcrVar2 = (aqcr) objC2;
                                aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
                                apjiVar.c(aihlVarCheckIsLite3);
                                if (apjiVar.j.n(aihlVarCheckIsLite3.d)) {
                                    aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar);
                                    aihiVar.c(aihlVarCheckIsLite4);
                                    if (aihiVar.j.n(aihlVarCheckIsLite4.d)) {
                                        zEquals = false;
                                    } else {
                                        i = aqcrVar.c;
                                        iBi = a.bi(i);
                                        if (iBi == 0) {
                                            iBi2 = a.bi(i);
                                            if (iBi2 == 0) {
                                                iBi2 = 1;
                                            }
                                            iBi3 = a.bi(aqcrVar2.c);
                                            if (iBi3 == 0) {
                                                iBi3 = 1;
                                            }
                                            if (iBi2 == iBi3) {
                                                zEquals = true;
                                            } else {
                                                zEquals = false;
                                            }
                                        } else {
                                            iBi2 = a.bi(i);
                                            if (iBi2 == 0) {
                                                iBi2 = 1;
                                            }
                                            iBi3 = a.bi(aqcrVar2.c);
                                            if (iBi3 == 0) {
                                                iBi3 = 1;
                                            }
                                            if (iBi2 == iBi3) {
                                                zEquals = true;
                                            } else {
                                                zEquals = false;
                                            }
                                        }
                                    }
                                } else {
                                    zEquals = false;
                                }
                            }
                            if (zEquals) {
                                list.remove(apjiVar);
                            }
                        }
                    }
                    list.add(0, obj2);
                    ArrayList arrayList = new ArrayList(list.size());
                    arrayList.addAll(list);
                    aihf aihfVarCreateBuilder = aqcz.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    aqcz aqczVar = (aqcz) aihfVarCreateBuilder.instance;
                    aiie aiieVar = aqczVar.b;
                    if (!aiieVar.c()) {
                        aqczVar.b = aihn.mutableCopy(aiieVar);
                    }
                    Object obj7 = this.b;
                    aifs.addAll(arrayList, aqczVar.b);
                    taf.j(((vhd) obj7).b.a(new vdm(Base64.encodeToString(((aqcz) aihfVarCreateBuilder.build()).toByteArray(), 0), i3), MoreExecutors.directExecutor()), new tsq(i2));
                }
                break;
            case 17:
                List list2 = (List) obj;
                if (list2 != null) {
                    Object obj8 = this.a;
                    vhe.a(((vhe) this.b).c, list2);
                    vhk vhkVar = (vhk) obj8;
                    vhkVar.a.s = true;
                    vhkVar.d(list2);
                }
                break;
            case 18:
                wkf wkfVar = (wkf) obj;
                boolean z = wkfVar instanceof wuq;
                Object obj9 = this.a;
                if (z) {
                    wuq wuqVar = (wuq) wkfVar;
                    wuqVar.L = (ajmm) obj9;
                    wuqVar.z(1);
                    break;
                } else if (((vnr) this.b).t.l(11, 45407731L, false) && (wkfVar instanceof woo)) {
                    woo wooVar = (woo) wkfVar;
                    wooVar.d = (ajmm) obj9;
                    wooVar.A = 1;
                    break;
                }
                break;
            case 19:
                xdi.e(this.b, ((xdi) this.a).m.b((Throwable) obj), null);
                break;
            default:
                wru wruVar = (wru) obj;
                if (wruVar != null) {
                    aoll aollVar = wruVar.a;
                    if ((aollVar.b & 8) != 0) {
                        Object obj10 = this.a;
                        ajwo ajwoVar = aollVar.f;
                        if (ajwoVar == null) {
                            ajwoVar = ajwo.a;
                        }
                        ((abxv) obj10).b.a(ajwoVar);
                    }
                    aoln aolnVar = aollVar.d;
                    if (aolnVar == null) {
                        aolnVar = aoln.a;
                    }
                    this.b.f(aolnVar, aollVar.g.G());
                    break;
                }
                break;
        }
    }

    public /* synthetic */ svm(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
