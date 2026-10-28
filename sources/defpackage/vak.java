package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.protos.youtube.api.innertube.AssetDetail;
import internal.org.jni_zero.CommonApis;
import j$.util.Collection;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vak extends uhv implements vam {
    public final zvl b;
    public final uys c;
    public final Object d;
    public final Map e;
    public final xpl f;
    private final bog g;
    private final vxe h;
    private final Set i;
    private avmn j;
    private final awku k;
    private final vao l;
    private final List m;
    private final vbk n;

    public vak(zvl zvlVar, cc ccVar, bog bogVar, uys uysVar, xpl xplVar, vbk vbkVar, vxe vxeVar, Set set, vao vaoVar) {
        super(ccVar, false);
        this.d = new Object();
        this.k = new awku();
        this.m = new ArrayList();
        this.e = new HashMap();
        this.b = zvlVar;
        this.g = bogVar;
        this.c = uysVar;
        this.f = xplVar;
        this.n = vbkVar;
        this.h = vxeVar;
        this.i = set;
        this.l = vaoVar;
    }

    private final String n(uzz uzzVar) {
        if (uzzVar == null) {
            return null;
        }
        try {
            String str = uzzVar.f;
            if (str != null) {
                return wfs.d(str).f.B();
            }
            return null;
        } catch (Exception e) {
            zvl zvlVar = this.b;
            zvj zvjVarA = zvk.a();
            zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
            zvjVarA.j = 40;
            zvjVarA.i = 397;
            zvjVarA.d("[Creation][Android][Effects]failed to deserialize effect entity key for asset id: ".concat(String.valueOf(uzzVar.a)));
            zvjVarA.f(e);
            zvlVar.a(zvjVarA.a());
            return null;
        }
    }

    private final boolean o(String str) {
        return str != null && this.i.contains(str);
    }

    private static final ajwo p(String str, uzz uzzVar) {
        aihf aihfVarCreateBuilder = ajfx.a.createBuilder();
        if (uzzVar != null) {
            String str2 = uzzVar.f;
            if (!TextUtils.isEmpty(str2)) {
                aihfVarCreateBuilder.copyOnWrite();
                ajfx ajfxVar = (ajfx) aihfVarCreateBuilder.instance;
                str2.getClass();
                ajfxVar.c |= 1;
                ajfxVar.e = str2;
            }
        }
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihl aihlVar = ajfx.b;
        aihfVarCreateBuilder.aM(str);
        aihhVar.e(aihlVar, (ajfx) aihfVarCreateBuilder.build());
        return (ajwo) aihhVar.build();
    }

    @Override // defpackage.uzk
    public final avlh a() {
        return this.k.p();
    }

    @Override // defpackage.uzx
    public final void b() {
        boolean zIsEmpty;
        synchronized (this.d) {
            List list = this.m;
            zIsEmpty = list.isEmpty();
            list.clear();
            this.e.clear();
        }
        if (zIsEmpty) {
            return;
        }
        m();
    }

    @Override // defpackage.uzx
    public final void c(String str) {
        synchronized (this.d) {
            Collection.EL.removeIf(this.m, new iab(this, str, 5));
        }
        m();
    }

    @Override // defpackage.uhv
    public final void d() {
        Object obj = this.j;
        if (obj != null) {
            awka.f((AtomicReference) obj);
        }
    }

    @Override // defpackage.uzx
    public final void e(String str) {
        uzz uzzVar;
        synchronized (this.d) {
            uzzVar = (uzz) this.e.remove(str);
        }
        if (uzzVar == null) {
            zvl zvlVar = this.b;
            zvj zvjVarA = zvk.a();
            zvjVarA.c(ajtv.ERROR_LEVEL_WARNING);
            zvjVarA.j = 40;
            zvjVarA.i = 397;
            zvjVarA.d("[Creation][Android][Effects]Skipping deselectEffectAsset with unknown asset ID: ".concat(String.valueOf(str)));
            zvlVar.a(zvjVarA.a());
            return;
        }
        synchronized (this.d) {
            uys uysVar = this.c;
            arlj arljVarFA = yno.fA(uysVar.a(str));
            if (arljVarFA == null) {
                this.m.remove(str);
                this.e.remove(str);
            } else {
                aldh aldhVarFz = yno.fz(arljVarFA);
                aldi aldiVarA = aldi.a(arljVarFA.f);
                if (aldiVarA == null) {
                    aldiVarA = aldi.XENO_EFFECT_RENDERING_PRIORITY_UNKNOWN;
                }
                Iterator it = this.m.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    arlj arljVarFA2 = yno.fA(uysVar.a(str2));
                    if (arljVarFA2 != null && yno.fz(arljVarFA2) == aldhVarFz) {
                        aldi aldiVarA2 = aldi.a(arljVarFA2.f);
                        if (aldiVarA2 == null) {
                            aldiVarA2 = aldi.XENO_EFFECT_RENDERING_PRIORITY_UNKNOWN;
                        }
                        if (aldiVarA2 == aldiVarA) {
                            it.remove();
                            this.e.remove(str2);
                        }
                    }
                    if (TextUtils.equals(str2, str)) {
                        break;
                    }
                }
            }
        }
        m();
    }

    @Override // defpackage.uzx
    public final void f(uzz uzzVar) {
        String str = uzzVar.a;
        if (ahno.aa(str)) {
            zvl zvlVar = this.b;
            zvj zvjVarA = zvk.a();
            zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
            zvjVarA.j = 40;
            zvjVarA.i = 397;
            zvjVarA.d("[Creation][Android][Effects]selectEffectAsset with null/empty id");
            zvlVar.a(zvjVarA.a());
            return;
        }
        synchronized (this.d) {
            List list = this.m;
            list.remove(str);
            list.add(str);
            this.e.put(str, uzzVar);
        }
        if (this.c.a(str) != null) {
            m();
        } else {
            taf.k(this.g, this.n.b(uzzVar), new uny(this, 9), new svm(this, uzzVar, 15));
        }
    }

    @Override // defpackage.uhv
    protected final void j(View view) {
        this.j = this.c.b().ak(new usn(this, 17));
    }

    public final void l(Throwable th) {
        zvj zvjVarA = zvk.a();
        zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
        zvjVarA.j = 40;
        zvjVarA.i = 397;
        zvjVarA.d("[Creation][Android][Effects]Failed to retrieve effect asset.");
        zvjVarA.f(th);
        this.b.a(zvjVarA.a());
        ahno.ao(new ull(this, 14), taf.a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009b A[Catch: all -> 0x01a0, TryCatch #0 {, blocks: (B:4:0x0010, B:6:0x0018, B:8:0x0036, B:9:0x0039, B:10:0x003f, B:12:0x0045, B:14:0x0053, B:16:0x0057, B:18:0x005f, B:20:0x0065, B:22:0x006f, B:27:0x007a, B:33:0x0086, B:35:0x0095, B:37:0x009b, B:39:0x00a5, B:55:0x00e1, B:57:0x00e7, B:68:0x0114, B:59:0x00ed, B:61:0x00f5, B:63:0x00fd, B:65:0x0105, B:67:0x010d, B:41:0x00ab, B:43:0x00b3, B:45:0x00bb, B:47:0x00c3, B:49:0x00cb, B:51:0x00d5, B:53:0x00db, B:69:0x0121, B:71:0x0127, B:72:0x012b, B:75:0x0134, B:77:0x0138, B:78:0x013a, B:82:0x0184), top: B:92:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0121 A[Catch: all -> 0x01a0, TryCatch #0 {, blocks: (B:4:0x0010, B:6:0x0018, B:8:0x0036, B:9:0x0039, B:10:0x003f, B:12:0x0045, B:14:0x0053, B:16:0x0057, B:18:0x005f, B:20:0x0065, B:22:0x006f, B:27:0x007a, B:33:0x0086, B:35:0x0095, B:37:0x009b, B:39:0x00a5, B:55:0x00e1, B:57:0x00e7, B:68:0x0114, B:59:0x00ed, B:61:0x00f5, B:63:0x00fd, B:65:0x0105, B:67:0x010d, B:41:0x00ab, B:43:0x00b3, B:45:0x00bb, B:47:0x00c3, B:49:0x00cb, B:51:0x00d5, B:53:0x00db, B:69:0x0121, B:71:0x0127, B:72:0x012b, B:75:0x0134, B:77:0x0138, B:78:0x013a, B:82:0x0184), top: B:92:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0127 A[Catch: all -> 0x01a0, TryCatch #0 {, blocks: (B:4:0x0010, B:6:0x0018, B:8:0x0036, B:9:0x0039, B:10:0x003f, B:12:0x0045, B:14:0x0053, B:16:0x0057, B:18:0x005f, B:20:0x0065, B:22:0x006f, B:27:0x007a, B:33:0x0086, B:35:0x0095, B:37:0x009b, B:39:0x00a5, B:55:0x00e1, B:57:0x00e7, B:68:0x0114, B:59:0x00ed, B:61:0x00f5, B:63:0x00fd, B:65:0x0105, B:67:0x010d, B:41:0x00ab, B:43:0x00b3, B:45:0x00bb, B:47:0x00c3, B:49:0x00cb, B:51:0x00d5, B:53:0x00db, B:69:0x0121, B:71:0x0127, B:72:0x012b, B:75:0x0134, B:77:0x0138, B:78:0x013a, B:82:0x0184), top: B:92:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0133  */
    /* JADX WARN: Code duplicated, block: B:77:0x0138 A[Catch: all -> 0x01a0, TryCatch #0 {, blocks: (B:4:0x0010, B:6:0x0018, B:8:0x0036, B:9:0x0039, B:10:0x003f, B:12:0x0045, B:14:0x0053, B:16:0x0057, B:18:0x005f, B:20:0x0065, B:22:0x006f, B:27:0x007a, B:33:0x0086, B:35:0x0095, B:37:0x009b, B:39:0x00a5, B:55:0x00e1, B:57:0x00e7, B:68:0x0114, B:59:0x00ed, B:61:0x00f5, B:63:0x00fd, B:65:0x0105, B:67:0x010d, B:41:0x00ab, B:43:0x00b3, B:45:0x00bb, B:47:0x00c3, B:49:0x00cb, B:51:0x00d5, B:53:0x00db, B:69:0x0121, B:71:0x0127, B:72:0x012b, B:75:0x0134, B:77:0x0138, B:78:0x013a, B:82:0x0184), top: B:92:0x0010 }] */
    public final void m() {
        agjz agjzVar;
        Iterator it;
        agjz agjzVar2;
        ajhv ajhvVar;
        uzz uzzVar;
        arlj arljVarFA;
        agjz agjzVar3;
        AssetDetail defaultInstance;
        int iG;
        atte atteVar;
        String strN;
        aldh aldhVar;
        ArrayList arrayList = new ArrayList();
        agjz agjzVar4 = new agjz(4);
        synchronized (this.d) {
            List list = this.m;
            if (!list.isEmpty()) {
                String str = (String) aguu.K(list);
                Map map = this.e;
                String strN2 = n((uzz) map.get(str));
                vao vaoVar = this.l;
                if (!vaoVar.f(strN2)) {
                    o(strN2);
                }
                Iterator it2 = list.iterator();
                aldh aldhVar2 = null;
                String str2 = null;
                while (it2.hasNext()) {
                    String str3 = (String) it2.next();
                    uyr uyrVarA = this.c.a(str3);
                    if (uyrVarA == null || (ajhvVar = uyrVarA.b) == null || (uzzVar = (uzz) map.get(str3)) == null || (arljVarFA = yno.fA(uyrVarA)) == null) {
                        it = it2;
                        agjzVar2 = agjzVar4;
                    } else {
                        aldh aldhVarFz = yno.fz(arljVarFA);
                        it = it2;
                        aldh aldhVar3 = aldh.XENO_EFFECT_RENDERING_LAYER_CAMERA_FOREGROUND;
                        if (aldhVarFz != aldhVar3) {
                            agjzVar3 = agjzVar4;
                            if (aldhVarFz != aldh.XENO_EFFECT_RENDERING_LAYER_GREEN_SCREEN) {
                                if (str.equals(str3)) {
                                    String str4 = ajhvVar.e;
                                    defaultInstance = ajhvVar.d;
                                    if (defaultInstance == null) {
                                        defaultInstance = AssetDetail.getDefaultInstance();
                                    }
                                    iG = CommonApis.g(defaultInstance.d);
                                    if (iG == 0) {
                                        iG = 1;
                                    }
                                    atteVar = uyrVarA.e;
                                    if (atteVar == null) {
                                        atteVar = atte.a;
                                    }
                                    avbm avbmVarA = uzj.a();
                                    avbmVarA.g = uyrVarA.a;
                                    avbmVarA.c(yno.fR(str3, str4, iG));
                                    avbmVarA.f = yno.fK(str4, iG);
                                    avbmVarA.i = ajhvVar;
                                    avbmVarA.d = uyrVarA.c;
                                    avbmVarA.b(uyrVarA.d);
                                    avbmVarA.d(atteVar);
                                    avbmVarA.a = uyrVarA.f;
                                    avbmVarA.b = uzzVar.g;
                                    agjzVar2 = agjzVar3;
                                    agjzVar2.h(avbmVarA.a());
                                } else {
                                    strN = n(uzzVar);
                                    if ((o(strN) || !o(strN2)) && (!(Objects.equals(strN, "layout_recomp_item_selected_entity") && Objects.equals(strN2, "layout_recomp_item_selected_entity")) && (!(Objects.equals(strN, "layout_collab_item_selected_entity") && Objects.equals(strN2, "layout_collab_item_selected_entity")) && (vaoVar.f(strN, strN2) || !(o(strN) || o(strN2)))))) {
                                        String str5 = ajhvVar.e;
                                        defaultInstance = ajhvVar.d;
                                        if (defaultInstance == null) {
                                            defaultInstance = AssetDetail.getDefaultInstance();
                                        }
                                        iG = CommonApis.g(defaultInstance.d);
                                        if (iG == 0) {
                                            iG = 1;
                                        }
                                        atteVar = uyrVarA.e;
                                        if (atteVar == null) {
                                            atteVar = atte.a;
                                        }
                                        avbm avbmVarA2 = uzj.a();
                                        avbmVarA2.g = uyrVarA.a;
                                        avbmVarA2.c(yno.fR(str3, str5, iG));
                                        avbmVarA2.f = yno.fK(str5, iG);
                                        avbmVarA2.i = ajhvVar;
                                        avbmVarA2.d = uyrVarA.c;
                                        avbmVarA2.b(uyrVarA.d);
                                        avbmVarA2.d(atteVar);
                                        avbmVarA2.a = uyrVarA.f;
                                        avbmVarA2.b = uzzVar.g;
                                        agjzVar2 = agjzVar3;
                                        agjzVar2.h(avbmVarA2.a());
                                    } else {
                                        if ((!o(strN) || !o(strN2)) && ((!Objects.equals(strN, "layout_recomp_item_selected_entity") || !Objects.equals(strN2, "layout_recomp_item_selected_entity")) && (!Objects.equals(strN, "layout_collab_item_selected_entity") || !Objects.equals(strN2, "layout_collab_item_selected_entity")))) {
                                            arrayList.add(p(str3, uzzVar));
                                        }
                                        it.remove();
                                        map.remove(str3);
                                        agjzVar2 = agjzVar3;
                                    }
                                }
                            }
                        } else {
                            agjzVar3 = agjzVar4;
                        }
                        if (aldhVar2 != null && (((aldhVar2 == (aldhVar = aldh.XENO_EFFECT_RENDERING_LAYER_GREEN_SCREEN) && aldhVarFz == aldhVar3) || (aldhVarFz == aldhVar && aldhVar2 == aldhVar3)) && str2 != null)) {
                            arrayList.add(p(str2, (uzz) map.get(str2)));
                        }
                        str2 = str3;
                        aldhVar2 = aldhVarFz;
                        if (str.equals(str3)) {
                            strN = n(uzzVar);
                            if (o(strN)) {
                                String str6 = ajhvVar.e;
                                defaultInstance = ajhvVar.d;
                                if (defaultInstance == null) {
                                    defaultInstance = AssetDetail.getDefaultInstance();
                                }
                                iG = CommonApis.g(defaultInstance.d);
                                if (iG == 0) {
                                    iG = 1;
                                }
                                atteVar = uyrVarA.e;
                                if (atteVar == null) {
                                    atteVar = atte.a;
                                }
                                avbm avbmVarA3 = uzj.a();
                                avbmVarA3.g = uyrVarA.a;
                                avbmVarA3.c(yno.fR(str3, str6, iG));
                                avbmVarA3.f = yno.fK(str6, iG);
                                avbmVarA3.i = ajhvVar;
                                avbmVarA3.d = uyrVarA.c;
                                avbmVarA3.b(uyrVarA.d);
                                avbmVarA3.d(atteVar);
                                avbmVarA3.a = uyrVarA.f;
                                avbmVarA3.b = uzzVar.g;
                                agjzVar2 = agjzVar3;
                                agjzVar2.h(avbmVarA3.a());
                            } else {
                                String str7 = ajhvVar.e;
                                defaultInstance = ajhvVar.d;
                                if (defaultInstance == null) {
                                    defaultInstance = AssetDetail.getDefaultInstance();
                                }
                                iG = CommonApis.g(defaultInstance.d);
                                if (iG == 0) {
                                    iG = 1;
                                }
                                atteVar = uyrVarA.e;
                                if (atteVar == null) {
                                    atteVar = atte.a;
                                }
                                avbm avbmVarA4 = uzj.a();
                                avbmVarA4.g = uyrVarA.a;
                                avbmVarA4.c(yno.fR(str3, str7, iG));
                                avbmVarA4.f = yno.fK(str7, iG);
                                avbmVarA4.i = ajhvVar;
                                avbmVarA4.d = uyrVarA.c;
                                avbmVarA4.b(uyrVarA.d);
                                avbmVarA4.d(atteVar);
                                avbmVarA4.a = uyrVarA.f;
                                avbmVarA4.b = uzzVar.g;
                                agjzVar2 = agjzVar3;
                                agjzVar2.h(avbmVarA4.a());
                            }
                        } else {
                            String str8 = ajhvVar.e;
                            defaultInstance = ajhvVar.d;
                            if (defaultInstance == null) {
                                defaultInstance = AssetDetail.getDefaultInstance();
                            }
                            iG = CommonApis.g(defaultInstance.d);
                            if (iG == 0) {
                                iG = 1;
                            }
                            atteVar = uyrVarA.e;
                            if (atteVar == null) {
                                atteVar = atte.a;
                            }
                            avbm avbmVarA5 = uzj.a();
                            avbmVarA5.g = uyrVarA.a;
                            avbmVarA5.c(yno.fR(str3, str8, iG));
                            avbmVarA5.f = yno.fK(str8, iG);
                            avbmVarA5.i = ajhvVar;
                            avbmVarA5.d = uyrVarA.c;
                            avbmVarA5.b(uyrVarA.d);
                            avbmVarA5.d(atteVar);
                            avbmVarA5.a = uyrVarA.f;
                            avbmVarA5.b = uzzVar.g;
                            agjzVar2 = agjzVar3;
                            agjzVar2.h(avbmVarA5.a());
                        }
                    }
                    agjzVar4 = agjzVar2;
                    it2 = it;
                    str = str;
                    map = map;
                }
            }
            agjzVar = agjzVar4;
        }
        if (!arrayList.isEmpty()) {
            this.h.b(arrayList);
        }
        this.k.kk(yno.fE(agjzVar.g()));
    }
}
