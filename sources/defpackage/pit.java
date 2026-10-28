package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pit implements pha {
    public final Context b;
    public final aunn c;
    public final aunn d;
    private final pls f;
    private final pav g;
    private final aunn h;
    private final awou i;
    private final aunn j;
    public static final nwd e = new nwd();
    public static final agsn a = agsn.h("GnpSdk");

    public pit(Context context, pls plsVar, aunn aunnVar, aunn aunnVar2, pav pavVar, aunn aunnVar3, awou awouVar, aunn aunnVar4) {
        context.getClass();
        plsVar.getClass();
        aunnVar.getClass();
        aunnVar2.getClass();
        pavVar.getClass();
        aunnVar3.getClass();
        awouVar.getClass();
        aunnVar4.getClass();
        this.b = context;
        this.f = plsVar;
        this.c = aunnVar;
        this.d = aunnVar2;
        this.g = pavVar;
        this.h = aunnVar3;
        this.i = awouVar;
        this.j = aunnVar4;
    }

    public static final plb i(plb plbVar) {
        if (plbVar.f()) {
            return plbVar;
        }
        return auuw.d() == 0 ? plbVar.d(500L) : plb.b(auuw.d());
    }

    public static final Object j(boolean z, plb plbVar, awqg awqgVar, awoq awoqVar) {
        return e.a(plbVar, new pil(awqgVar, z, null), awoqVar);
    }

    private final String q(String str) {
        Uri uri = Uri.parse(str);
        uri.getClass();
        if (awrc.c(uri.getScheme(), "android.resource")) {
            return "SCHEME_ANDROID_RESOURCE";
        }
        return ((ijt) this.j.io()).g(str) ? "RESIZABLE" : "NON_RESIZABLE";
    }

    private final Object r(plx plxVar, List list, int i, int i2, boolean z, plb plbVar, int i3, awoq awoqVar) {
        return awrc.J(new pip(list, this, z, plbVar, i3, plxVar, i, i2, (awoq) null, 1), awoqVar);
    }

    private final Object s(plx plxVar, List list, int i, int i2, boolean z, plb plbVar, int i3, awoq awoqVar) {
        return awrc.J(new pip(list, this, plxVar, i, i2, z, plbVar, i3, (awoq) null, 0), awoqVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [agfr, java.lang.Object] */
    private final void t(String str, int i, String str2) {
        ((qtf) ((pwf) this.h.io()).y.io()).b(1L, this.b.getPackageName(), this.f.a, q(str), nvw.a(i), str2);
    }

    @Override // defpackage.pha
    public final Object a(plx plxVar, pot potVar, plb plbVar, boolean z, awoq awoqVar) {
        return awro.p(this.i, new tix(this, plxVar, potVar, plbVar, z, (awoq) null, 1), awoqVar);
    }

    @Override // defpackage.pha
    public final Object b(plx plxVar, aieg aiegVar, int i, int i2, boolean z, plb plbVar, awoq awoqVar) {
        if (!nwd.h(aiegVar)) {
            return new pkv(new IllegalArgumentException("Image does not have a valid URL."), pkx.w);
        }
        String str = aiegVar.d;
        if (str.length() == 0) {
            str = aiegVar.b;
        }
        String str2 = str;
        str2.getClass();
        return l(plxVar, str2, i, i2, z, plbVar, 8, awoqVar);
    }

    public final pzp c(plx plxVar, pot potVar, List list, List list2, Map map, List list3, List list4, Map map2, List list5, pky pkyVar, List list6, List list7, Map map3, List list8, List list9, Map map4, List list10, Bitmap bitmap, boolean z) {
        Boolean boolB;
        List list11;
        if (pkyVar != null && pkyVar.i() && bitmap != null) {
            boolB = Boolean.TRUE;
        } else if (list.isEmpty()) {
            boolB = pkyVar != null ? Boolean.FALSE : null;
        } else {
            boolB = nwd.b(list, list6);
        }
        Boolean boolB2 = nwd.b(list2, list7);
        Boolean boolC = nwd.c(map, map3);
        if (boolB2 != null) {
            boolC = boolB2;
            list11 = list8;
        } else {
            list11 = list8;
            if (boolC == null) {
                boolC = null;
            }
        }
        pzp pzpVar = new pzp(boolB, boolC, nwd.b(list3, list11), nwd.b(list4, list9), nwd.c(map2, map4), nwd.b(list5, list10), z);
        boolean z2 = pzpVar.h;
        pav pavVar = this.g;
        if (z2) {
            paw pawVarB = pavVar.b(ahzv.IMAGE_DOWNLOAD_SUCCESS);
            ((pbc) pawVarB).r = 2;
            pawVarB.e(pzpVar);
            pawVarB.b(potVar);
            pawVarB.f(plxVar);
            pawVarB.a();
        } else {
            paw pawVarA = pavVar.a(ahyy.FAILED_TO_DOWNLOAD_IMAGE);
            ((pbc) pawVarA).r = 2;
            pawVarA.e(pzpVar);
            pawVarA.b(potVar);
            pawVarA.f(plxVar);
            pawVarA.a();
        }
        return pzpVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(plx plxVar, aidq aidqVar, plb plbVar, boolean z, awoq awoqVar) throws Throwable {
        pim pimVar;
        Object next;
        aieg aiegVar;
        if (awoqVar instanceof pim) {
            pimVar = (pim) awoqVar;
            int i = pimVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pimVar.c = i - Integer.MIN_VALUE;
            } else {
                pimVar = new pim(this, awoqVar);
            }
        } else {
            pimVar = new pim(this, awoqVar);
        }
        pim pimVar2 = pimVar;
        Object objL = pimVar2.a;
        Object obj = awox.a;
        int i2 = pimVar2.c;
        if (i2 == 0) {
            atqp.j(objL);
            aidg aidgVar = aidqVar.c == 7 ? (aidg) aidqVar.d : aidg.a;
            aidgVar.getClass();
            aiie aiieVar = aidgVar.d;
            aiieVar.getClass();
            Iterator<E> it = aiieVar.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                aiegVar = (aieg) next;
                aiegVar.getClass();
            } while (!nwd.h(aiegVar));
            aieg aiegVar2 = (aieg) next;
            if (aiegVar2 == null) {
                return awno.a;
            }
            awml awmlVarG = g(aidgVar, z);
            int iIntValue = ((Number) awmlVarG.a).intValue();
            int iIntValue2 = ((Number) awmlVarG.b).intValue();
            String str = aiegVar2.d;
            if (str.length() == 0) {
                str = aiegVar2.b;
            }
            String str2 = str;
            str2.getClass();
            boolean zI = nwd.i(aidqVar);
            int i3 = true != z ? 2 : 3;
            pimVar2.c = 1;
            objL = l(plxVar, str2, iIntValue, iIntValue2, zI, plbVar, i3, pimVar2);
            if (objL == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objL);
        }
        return atqq.H(objL);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0392  */
    /* JADX WARN: Code duplicated, block: B:106:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:107:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:109:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:110:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:114:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:116:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:117:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:120:0x0403  */
    /* JADX WARN: Code duplicated, block: B:123:0x040e  */
    /* JADX WARN: Code duplicated, block: B:128:0x042b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0435  */
    /* JADX WARN: Code duplicated, block: B:131:0x043a  */
    /* JADX WARN: Code duplicated, block: B:134:0x0440  */
    /* JADX WARN: Code duplicated, block: B:138:0x0460  */
    /* JADX WARN: Code duplicated, block: B:142:0x0479  */
    /* JADX WARN: Code duplicated, block: B:144:0x047f  */
    /* JADX WARN: Code duplicated, block: B:145:0x0484  */
    /* JADX WARN: Code duplicated, block: B:148:0x048a  */
    /* JADX WARN: Code duplicated, block: B:151:0x0490  */
    /* JADX WARN: Code duplicated, block: B:154:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:156:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:159:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:162:0x0509  */
    /* JADX WARN: Code duplicated, block: B:165:0x0517  */
    /* JADX WARN: Code duplicated, block: B:168:0x0546  */
    /* JADX WARN: Code duplicated, block: B:171:0x0598  */
    /* JADX WARN: Code duplicated, block: B:174:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:176:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:177:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:180:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:182:0x0600  */
    /* JADX WARN: Code duplicated, block: B:184:0x0517 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0515 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:? A[LOOP:0: B:160:0x0503->B:186:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0411 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0442 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:28:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:32:0x0203  */
    /* JADX WARN: Code duplicated, block: B:38:0x0219  */
    /* JADX WARN: Code duplicated, block: B:40:0x0221  */
    /* JADX WARN: Code duplicated, block: B:42:0x0225  */
    /* JADX WARN: Code duplicated, block: B:45:0x0231 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:54:0x0266 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:69:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:71:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:76:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:89:0x034d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0358  */
    /* JADX WARN: Code duplicated, block: B:92:0x035e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0363  */
    /* JADX WARN: Code duplicated, block: B:96:0x0369  */
    /* JADX WARN: Code duplicated, block: B:99:0x036f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [pit] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v51, types: [pit] */
    /* JADX WARN: Type inference failed for: r0v58, types: [pit] */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r13v18, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v20, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r19v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r20v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r29v0, types: [pit] */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r2v79, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v95 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v62, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v59, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v61, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v46, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v48 */
    public final Object e(plx plxVar, pot potVar, plb plbVar, boolean z, awoq awoqVar) throws Throwable {
        pir pirVar;
        aidq aidqVar;
        pir pirVar2;
        boolean z2;
        Object objS;
        plx plxVar2;
        plb plbVar2;
        boolean z3;
        aidg aidgVar;
        Iterator it;
        Object next;
        aieg aiegVar;
        String str;
        boolean zH;
        aidq aidqVar2;
        List list;
        pot potVar2;
        Object obj;
        plx plxVar3;
        Object obj2;
        aidq aidqVar3;
        List list2;
        pot potVar3;
        aieg aiegVar2;
        plb plbVar3;
        Map map;
        plb plbVar4;
        aidq aidqVar4;
        pot potVar4;
        Object next2;
        aieg aiegVar3;
        pot potVar5;
        Object objR;
        plx plxVar4;
        Object obj3;
        plb plbVar5;
        List list3;
        aidq aidqVar5;
        pot potVar6;
        aieg aiegVar4;
        List list4;
        pot potVar7;
        List list5;
        Object obj4;
        Map map2;
        plx plxVar5;
        Object obj5;
        aidq aidqVar6;
        Object obj6;
        List list6;
        aidn aidnVar;
        aidh aidhVar;
        aieg aiegVar5;
        pot potVar8;
        Object objM;
        plx plxVar6;
        Object obj7;
        Map map3;
        aidq aidqVar7;
        plb plbVar6;
        Object obj8;
        List list7;
        Object obj9;
        List list8;
        Map map4;
        pot potVar9;
        Object obj10;
        List list9;
        aidn aidnVar2;
        ArrayList<aidk> arrayList;
        Object obj11;
        ArrayList arrayList2;
        aidq aidqVar8;
        pot potVar10;
        pir pirVar3;
        plb plbVar7;
        List list10;
        Object objR2;
        plx plxVar7;
        Object obj12;
        plb plbVar8;
        List list11;
        List list12;
        Map map5;
        Object obj13;
        aidi aidiVar;
        aieg aiegVar6;
        aidk aidkVar;
        aidi aidiVar2;
        aieg aiegVar7;
        Map map6;
        Object obj14;
        List list13;
        pot potVar11;
        List list14;
        ?? r0;
        pzp pzpVar;
        plx plxVar8;
        List list15;
        ?? r2;
        aidn aidnVar3;
        aidm aidmVar;
        aieg aiegVar8;
        ?? r1;
        Object objM2;
        Object obj15;
        Object obj16;
        Object obj17;
        Object obj18;
        Map map7;
        ?? r13;
        ?? r11;
        List listAj;
        int i;
        List listD;
        List listD2;
        List list16;
        Object objK;
        ?? r15;
        int i2;
        Object obj19;
        plx plxVar9;
        Object obj20;
        Object obj21;
        ?? r3;
        Map map8;
        Object obj22;
        ?? r4;
        Object obj23;
        Iterator it2;
        ?? r5;
        Map map9;
        List listD3;
        int i3;
        List listD4;
        Object objK2;
        Map map10;
        pzp pzpVar2;
        ?? r16;
        ?? r14;
        List list17;
        int i4;
        ?? r12;
        Map map11;
        ?? r7;
        pot potVar12;
        ?? r17;
        ?? r10;
        ?? r6;
        Object obj24;
        ?? r8;
        ?? r18;
        ?? r19;
        Map map12;
        pzp pzpVar3;
        List listD5;
        Map map13;
        pzp pzpVarC;
        boolean z4;
        ?? r9 = this;
        pot potVar13 = potVar;
        if (awoqVar instanceof pir) {
            pirVar = (pir) awoqVar;
            int i5 = pirVar.r;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                pirVar.r = i5 - Integer.MIN_VALUE;
            } else {
                pirVar = new pir(r9, awoqVar);
            }
        } else {
            pirVar = new pir(r9, awoqVar);
        }
        pir pirVar4 = pirVar;
        Object obj25 = pirVar4.p;
        awox awoxVar = awox.a;
        switch (pirVar4.r) {
            case 0:
                atqp.j(obj25);
                aidqVar = potVar13.o;
                plb plbVarI = i(plbVar);
                pirVar4.t = plxVar;
                pirVar4.s = potVar13;
                pirVar4.a = aidqVar;
                pirVar4.b = plbVarI;
                pirVar4.n = z;
                pirVar4.r = 1;
                int dimensionPixelSize = r9.b.getResources().getDimensionPixelSize(R.dimen.notifications_icon_size);
                aiie aiieVar = aidqVar.g;
                aiieVar.getClass();
                pirVar2 = pirVar4;
                z2 = false;
                objS = r9.s(plxVar, aiieVar, dimensionPixelSize, dimensionPixelSize, nwd.i(aidqVar), plbVarI, 1, pirVar2);
                if (objS == awoxVar) {
                    return awoxVar;
                }
                plxVar2 = plxVar;
                plbVar2 = plbVarI;
                z3 = z;
                List list18 = (List) objS;
                if (aidqVar.c == 7) {
                    aidgVar = (aidg) aidqVar.d;
                } else {
                    aidgVar = aidg.a;
                }
                aiie aiieVar2 = aidgVar.d;
                aiieVar2.getClass();
                it = aiieVar2.iterator();
                do {
                    if (it.hasNext()) {
                        next = it.next();
                        aiegVar2 = (aieg) next;
                        aiegVar2.getClass();
                    } else {
                        next = null;
                    }
                    aiegVar = (aieg) next;
                    if (aiegVar != null) {
                        str = aiegVar.d;
                        if (str.length() == 0) {
                            str = aiegVar.b;
                        }
                        if (str == null) {
                            str = "";
                        }
                    } else {
                        str = "";
                    }
                    zH = r9.h(str, z3);
                    if (!nwa.a(aidqVar) || zH) {
                        aidqVar2 = aidqVar;
                        list = list18;
                        potVar2 = potVar13;
                        obj = awno.a;
                    } else {
                        pirVar2.t = plxVar2;
                        pirVar2.s = potVar13;
                        pirVar2.a = aidqVar;
                        pirVar2.b = plbVar2;
                        pirVar2.c = list18;
                        pirVar2.n = z2;
                        pirVar2.r = 2;
                        aidq aidqVar9 = aidqVar;
                        Object objD = r9.d(plxVar2, aidqVar9, plbVar2, z3, pirVar2);
                        if (objD == awoxVar) {
                            return awoxVar;
                        }
                        plxVar3 = plxVar2;
                        obj2 = objD;
                        aidqVar3 = aidqVar9;
                        list2 = list18;
                        potVar3 = potVar13;
                        obj = (List) obj2;
                        list = list2;
                        aidqVar2 = aidqVar3;
                        potVar2 = potVar3;
                        plxVar2 = plxVar3;
                    }
                    plbVar3 = plbVar2;
                    if (nwa.a(aidqVar2) && zH) {
                        pirVar2.t = plxVar2;
                        pirVar2.s = potVar2;
                        pirVar2.a = aidqVar2;
                        pirVar2.b = plbVar3;
                        pirVar2.c = list;
                        pirVar2.d = obj;
                        pirVar2.r = 3;
                        aidg aidgVar2 = aidqVar2.c == 7 ? (aidg) aidqVar2.d : aidg.a;
                        aidgVar2.getClass();
                        aiie aiieVar3 = aidgVar2.d;
                        aiieVar3.getClass();
                        Iterator it3 = aiieVar3.iterator();
                        do {
                            if (it3.hasNext()) {
                                next2 = it3.next();
                                aiegVar4 = (aieg) next2;
                                aiegVar4.getClass();
                            } else {
                                next2 = null;
                            }
                            aiegVar3 = (aieg) next2;
                            if (aiegVar3 == null) {
                                potVar5 = potVar2;
                                objR = awnp.a;
                            } else {
                                awml awmlVarG = r9.g(aidgVar2, z2);
                                potVar5 = potVar2;
                                objR = r9.r(plxVar2, atqq.H(aiegVar3), ((Number) awmlVarG.a).intValue(), ((Number) awmlVarG.b).intValue(), nwd.i(aidqVar2), plbVar3, 2, pirVar2);
                            }
                            if (objR != awoxVar) {
                                return awoxVar;
                            }
                            plxVar4 = plxVar2;
                            obj3 = objR;
                            plbVar5 = plbVar3;
                            list3 = list;
                            aidqVar5 = aidqVar2;
                            potVar6 = potVar5;
                            plx plxVar10 = plxVar4;
                            map = (Map) obj3;
                            plxVar2 = plxVar10;
                            aidq aidqVar10 = aidqVar5;
                            plbVar4 = plbVar5;
                            aidqVar4 = aidqVar10;
                            list = list3;
                            potVar4 = potVar6;
                        } while (!nwd.h(aiegVar4));
                        aiegVar3 = (aieg) next2;
                        if (aiegVar3 == null) {
                            potVar5 = potVar2;
                            objR = awnp.a;
                        } else {
                            awml awmlVarG2 = r9.g(aidgVar2, z2);
                            potVar5 = potVar2;
                            objR = r9.r(plxVar2, atqq.H(aiegVar3), ((Number) awmlVarG2.a).intValue(), ((Number) awmlVarG2.b).intValue(), nwd.i(aidqVar2), plbVar3, 2, pirVar2);
                        }
                        if (objR != awoxVar) {
                            return awoxVar;
                        }
                        plxVar4 = plxVar2;
                        obj3 = objR;
                        plbVar5 = plbVar3;
                        list3 = list;
                        aidqVar5 = aidqVar2;
                        potVar6 = potVar5;
                        plx plxVar11 = plxVar4;
                        map = (Map) obj3;
                        plxVar2 = plxVar11;
                        aidq aidqVar11 = aidqVar5;
                        plbVar4 = plbVar5;
                        aidqVar4 = aidqVar11;
                        list = list3;
                        potVar4 = potVar6;
                    } else {
                        map = awnp.a;
                        plbVar4 = plbVar3;
                        aidqVar4 = aidqVar2;
                        potVar4 = potVar2;
                    }
                    if (nwa.a(aidqVar4) && nwd.e(aidqVar4)) {
                        aiie aiieVar4 = (aidqVar4.c == 7 ? (aidg) aidqVar4.d : aidg.a).g;
                        aiieVar4.getClass();
                        pirVar2.t = plxVar2;
                        pirVar2.s = potVar4;
                        pirVar2.a = aidqVar4;
                        pirVar2.b = plbVar4;
                        pirVar2.c = list;
                        pirVar2.d = obj;
                        pirVar2.e = map;
                        pirVar2.r = 4;
                        Object objM3 = m(plxVar2, aiieVar4, aidqVar4, plbVar4, 4, pirVar2);
                        if (objM3 == awoxVar) {
                            return awoxVar;
                        }
                        plxVar5 = plxVar2;
                        obj5 = objM3;
                        aidqVar6 = aidqVar4;
                        obj6 = obj;
                        list6 = list;
                        obj4 = obj6;
                        map2 = map;
                        list4 = (List) obj5;
                        plxVar2 = plxVar5;
                        potVar7 = potVar4;
                        list5 = list6;
                        aidqVar4 = aidqVar6;
                    } else {
                        Map map14 = map;
                        list4 = awno.a;
                        potVar7 = potVar4;
                        list5 = list;
                        obj4 = obj;
                        map2 = map14;
                    }
                    if (nwa.a(aidqVar4)) {
                        if (aidqVar4.c == 27) {
                            aidnVar = (aidn) aidqVar4.d;
                        } else {
                            aidnVar = aidn.a;
                        }
                        aidhVar = aidnVar.c;
                        if (aidhVar == null) {
                            aidhVar = aidh.a;
                        }
                        aiegVar5 = aidhVar.c;
                        if (aiegVar5 == null) {
                            aiegVar5 = aieg.a;
                        }
                        List listH = atqq.H(aiegVar5);
                        pirVar2.t = plxVar2;
                        pirVar2.s = potVar7;
                        pirVar2.a = aidqVar4;
                        pirVar2.b = plbVar4;
                        pirVar2.c = list5;
                        pirVar2.d = obj4;
                        pirVar2.e = map2;
                        pirVar2.f = list4;
                        pirVar2.r = 5;
                        pirVar4 = pirVar2;
                        potVar8 = potVar7;
                        objM = m(plxVar2, listH, aidqVar4, plbVar4, 5, pirVar4);
                        if (objM == awoxVar) {
                            return awoxVar;
                        }
                        Map map15 = map2;
                        plxVar6 = plxVar2;
                        obj7 = objM;
                        map3 = map15;
                        aidqVar7 = aidqVar4;
                        plbVar6 = plbVar4;
                        obj8 = obj4;
                        list7 = list5;
                        Object obj26 = obj8;
                        aidqVar4 = aidqVar7;
                        obj10 = obj26;
                        plx plxVar12 = plxVar6;
                        obj9 = (List) obj7;
                        plxVar2 = plxVar12;
                        map4 = map3;
                        list8 = list7;
                        plbVar4 = plbVar6;
                        potVar9 = potVar8;
                    } else {
                        Map map16 = map2;
                        obj9 = awno.a;
                        list8 = list5;
                        map4 = map16;
                        potVar9 = potVar7;
                        pirVar4 = pirVar2;
                        obj10 = obj4;
                    }
                    list9 = list4;
                    if (nwa.a(aidqVar4)) {
                        pirVar4.t = plxVar2;
                        pirVar4.s = potVar9;
                        pirVar4.a = aidqVar4;
                        pirVar4.b = plbVar4;
                        pirVar4.c = list8;
                        pirVar4.d = obj10;
                        pirVar4.e = map4;
                        pirVar4.f = list9;
                        pirVar4.g = obj9;
                        pirVar4.r = 6;
                        if (aidqVar4.c == 27) {
                            aidnVar2 = (aidn) aidqVar4.d;
                        } else {
                            aidnVar2 = aidn.a;
                        }
                        aiie aiieVar5 = aidnVar2.d;
                        aiieVar5.getClass();
                        arrayList = new ArrayList();
                        for (Object obj27 : aiieVar5) {
                            aidkVar = (aidk) obj27;
                            Object obj28 = obj10;
                            if (aidkVar.b == 2) {
                                aidiVar2 = (aidi) aidkVar.c;
                            } else {
                                aidiVar2 = aidi.a;
                            }
                            aiegVar7 = aidiVar2.b;
                            if (aiegVar7 == null) {
                                aiegVar7 = aieg.a;
                            }
                            aiegVar7.getClass();
                            if (nwd.h(aiegVar7)) {
                                arrayList.add(obj27);
                            }
                            obj10 = obj28;
                        }
                        obj11 = obj10;
                        arrayList2 = new ArrayList(atqq.N(arrayList, 10));
                        for (aidk aidkVar2 : arrayList) {
                            if (aidkVar2.b == 2) {
                                aidiVar = (aidi) aidkVar2.c;
                            } else {
                                aidiVar = aidi.a;
                            }
                            aiegVar6 = aidiVar.b;
                            if (aiegVar6 == null) {
                                aiegVar6 = aieg.a;
                            }
                            arrayList2.add(aiegVar6);
                        }
                        aidqVar8 = aidqVar4;
                        potVar10 = potVar9;
                        pirVar3 = pirVar4;
                        plbVar7 = plbVar4;
                        list10 = list8;
                        objR2 = r(plxVar2, atqq.ah(arrayList2), -1, -1, nwd.i(aidqVar4), plbVar7, 6, pirVar3);
                        if (objR2 != awoxVar) {
                            return awoxVar;
                        }
                        plxVar7 = plxVar2;
                        obj12 = objR2;
                        plbVar8 = plbVar7;
                        list11 = list9;
                        list12 = list10;
                        map5 = map4;
                        obj13 = obj11;
                        list14 = list11;
                        map4 = map5;
                        aidqVar4 = aidqVar8;
                        potVar11 = potVar10;
                        obj14 = obj13;
                        list13 = list12;
                        plbVar4 = plbVar8;
                        map6 = (Map) obj12;
                        plxVar2 = plxVar7;
                    } else {
                        map6 = awnp.a;
                        obj14 = obj10;
                        list13 = list8;
                        potVar11 = potVar9;
                        pirVar3 = pirVar4;
                        list14 = list9;
                    }
                    if (nwd.f(aidqVar4)) {
                        if (aidqVar4.c == 27) {
                            aidnVar3 = (aidn) aidqVar4.d;
                        } else {
                            aidnVar3 = aidn.a;
                        }
                        aidmVar = aidnVar3.e;
                        if (aidmVar == null) {
                            aidmVar = aidm.a;
                        }
                        aiegVar8 = aidmVar.d;
                        if (aiegVar8 == null) {
                            aiegVar8 = aieg.a;
                        }
                        List listH2 = atqq.H(aiegVar8);
                        pirVar3.t = plxVar2;
                        pirVar3.s = potVar11;
                        pirVar3.a = list13;
                        pirVar3.b = obj14;
                        pirVar3.c = map4;
                        pirVar3.d = list14;
                        pirVar3.e = obj9;
                        pirVar3.f = map6;
                        pirVar3.g = null;
                        pirVar3.r = 7;
                        pzpVar = null;
                        r1 = this;
                        objM2 = r1.m(plxVar2, listH2, aidqVar4, plbVar4, 7, pirVar3);
                        if (objM2 == awoxVar) {
                            return awoxVar;
                        }
                        Object obj29 = obj9;
                        plxVar8 = plxVar2;
                        obj15 = objM2;
                        obj16 = obj29;
                        obj17 = obj14;
                        obj18 = list14;
                        map7 = map4;
                        r5 = r1;
                        list15 = (List) obj15;
                        r13 = obj18;
                        map4 = map7;
                        r11 = obj17;
                        r0 = r5;
                        r2 = obj16;
                    } else {
                        r0 = this;
                        pzpVar = null;
                        Object obj30 = obj9;
                        plxVar8 = plxVar2;
                        list15 = awno.a;
                        r2 = obj30;
                        r11 = obj14;
                        r13 = list14;
                    }
                    listAj = atqq.aj(atqq.aj(atqq.aj(atqq.aj(atqq.aj(atqq.aj(list13, r11), atqq.ap(map4.values())), r13), r2), atqq.ap(map6.values())), list15);
                    if (listAj.isEmpty()) {
                        i = 0;
                    } else {
                        it2 = listAj.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                i = 0;
                            } else if (nwd.g((pky) it2.next())) {
                                i = 1;
                            }
                        }
                    }
                    listD = nwd.d(list13);
                    listD2 = nwd.d(r11);
                    pirVar3.t = plxVar8;
                    pirVar3.s = potVar11;
                    pirVar3.a = list13;
                    pirVar3.b = r11;
                    pirVar3.c = map4;
                    pirVar3.d = r13;
                    pirVar3.e = r2;
                    pirVar3.f = map6;
                    pirVar3.g = list15;
                    pirVar3.h = listAj;
                    pirVar3.i = listD;
                    pirVar3.j = listD2;
                    pirVar3.o = i;
                    list16 = list15;
                    pirVar3.r = 8;
                    objK = r0.k(map4);
                    if (objK != awoxVar) {
                        return awoxVar;
                    }
                    Map map17 = map4;
                    r15 = r2;
                    i2 = i;
                    obj19 = listD2;
                    plxVar9 = plxVar8;
                    obj20 = listD;
                    obj21 = listAj;
                    r3 = r13;
                    map8 = map17;
                    obj22 = objK;
                    r4 = r11;
                    obj23 = list16;
                    map9 = (Map) obj22;
                    listD3 = nwd.d(r3);
                    i3 = i2;
                    listD4 = nwd.d(r15);
                    pirVar3.t = plxVar9;
                    pirVar3.s = potVar11;
                    pirVar3.a = list13;
                    pirVar3.b = r4;
                    pirVar3.c = map8;
                    pirVar3.d = r3;
                    pirVar3.e = r15;
                    pirVar3.f = map6;
                    pirVar3.g = obj23;
                    pirVar3.h = obj21;
                    pirVar3.i = obj20;
                    pirVar3.j = obj19;
                    pirVar3.k = map9;
                    pirVar3.l = listD3;
                    pirVar3.m = listD4;
                    pirVar3.o = i3;
                    pirVar3.r = 9;
                    objK2 = k(map6);
                    if (objK2 == awoxVar) {
                        return awoxVar;
                    }
                    map10 = map8;
                    pzpVar2 = pzpVar;
                    r16 = listD4;
                    r14 = obj19;
                    list17 = list13;
                    i4 = i3;
                    r12 = obj20;
                    map11 = map6;
                    r7 = r3;
                    potVar12 = potVar11;
                    r17 = map9;
                    r10 = obj21;
                    r6 = r4;
                    obj24 = objK2;
                    r8 = r15;
                    r18 = listD3;
                    r19 = obj23;
                    map12 = (Map) obj24;
                    pzpVar3 = pzpVar2;
                    listD5 = nwd.d(r19);
                    if (r10.isEmpty()) {
                        map13 = map12;
                        pzpVarC = pzpVar3;
                    } else {
                        if (1 != i4) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        map13 = map12;
                        pzpVarC = c(plxVar9, potVar12, list17, r6, map10, r7, r8, map11, r19, null, r12, r14, r17, r18, r16, map13, listD5, null, z4);
                    }
                    return new pgz((List) r12, (List) r14, (Map) r17, (List) r18, (Bitmap) atqq.af(r16), map13, (Bitmap) atqq.af(listD5), pzpVarC, SemanticState.Hidden);
                } while (!nwd.h(aiegVar2));
                aiegVar = (aieg) next;
                if (aiegVar != null) {
                    str = aiegVar.d;
                    if (str.length() == 0) {
                        str = aiegVar.b;
                    }
                    if (str == null) {
                        str = "";
                    }
                } else {
                    str = "";
                }
                zH = r9.h(str, z3);
                if (nwa.a(aidqVar)) {
                }
                aidqVar2 = aidqVar;
                list = list18;
                potVar2 = potVar13;
                obj = awno.a;
                plbVar3 = plbVar2;
                if (nwa.a(aidqVar2)) {
                }
                map = awnp.a;
                plbVar4 = plbVar3;
                aidqVar4 = aidqVar2;
                potVar4 = potVar2;
                if (nwa.a(aidqVar4)) {
                }
                Map map18 = map;
                list4 = awno.a;
                potVar7 = potVar4;
                list5 = list;
                obj4 = obj;
                map2 = map18;
                if (nwa.a(aidqVar4)) {
                    Map map19 = map2;
                    obj9 = awno.a;
                    list8 = list5;
                    map4 = map19;
                    potVar9 = potVar7;
                    pirVar4 = pirVar2;
                    obj10 = obj4;
                } else {
                    if (aidqVar4.c == 27) {
                        aidnVar = (aidn) aidqVar4.d;
                    } else {
                        aidnVar = aidn.a;
                    }
                    aidhVar = aidnVar.c;
                    if (aidhVar == null) {
                        aidhVar = aidh.a;
                    }
                    aiegVar5 = aidhVar.c;
                    if (aiegVar5 == null) {
                        aiegVar5 = aieg.a;
                    }
                    List listH3 = atqq.H(aiegVar5);
                    pirVar2.t = plxVar2;
                    pirVar2.s = potVar7;
                    pirVar2.a = aidqVar4;
                    pirVar2.b = plbVar4;
                    pirVar2.c = list5;
                    pirVar2.d = obj4;
                    pirVar2.e = map2;
                    pirVar2.f = list4;
                    pirVar2.r = 5;
                    pirVar4 = pirVar2;
                    potVar8 = potVar7;
                    objM = m(plxVar2, listH3, aidqVar4, plbVar4, 5, pirVar4);
                    if (objM == awoxVar) {
                        return awoxVar;
                    }
                    Map map110 = map2;
                    plxVar6 = plxVar2;
                    obj7 = objM;
                    map3 = map110;
                    aidqVar7 = aidqVar4;
                    plbVar6 = plbVar4;
                    obj8 = obj4;
                    list7 = list5;
                    Object obj210 = obj8;
                    aidqVar4 = aidqVar7;
                    obj10 = obj210;
                    plx plxVar13 = plxVar6;
                    obj9 = (List) obj7;
                    plxVar2 = plxVar13;
                    map4 = map3;
                    list8 = list7;
                    plbVar4 = plbVar6;
                    potVar9 = potVar8;
                }
                list9 = list4;
                if (nwa.a(aidqVar4)) {
                    map6 = awnp.a;
                    obj14 = obj10;
                    list13 = list8;
                    potVar11 = potVar9;
                    pirVar3 = pirVar4;
                    list14 = list9;
                } else {
                    pirVar4.t = plxVar2;
                    pirVar4.s = potVar9;
                    pirVar4.a = aidqVar4;
                    pirVar4.b = plbVar4;
                    pirVar4.c = list8;
                    pirVar4.d = obj10;
                    pirVar4.e = map4;
                    pirVar4.f = list9;
                    pirVar4.g = obj9;
                    pirVar4.r = 6;
                    if (aidqVar4.c == 27) {
                        aidnVar2 = (aidn) aidqVar4.d;
                    } else {
                        aidnVar2 = aidn.a;
                    }
                    aiie aiieVar6 = aidnVar2.d;
                    aiieVar6.getClass();
                    arrayList = new ArrayList();
                    while (r7.hasNext()) {
                        aidkVar = (aidk) obj27;
                        Object obj211 = obj10;
                        if (aidkVar.b == 2) {
                            aidiVar2 = (aidi) aidkVar.c;
                        } else {
                            aidiVar2 = aidi.a;
                        }
                        aiegVar7 = aidiVar2.b;
                        if (aiegVar7 == null) {
                            aiegVar7 = aieg.a;
                        }
                        aiegVar7.getClass();
                        if (nwd.h(aiegVar7)) {
                            arrayList.add(obj27);
                        }
                        obj10 = obj211;
                    }
                    obj11 = obj10;
                    arrayList2 = new ArrayList(atqq.N(arrayList, 10));
                    while (r7.hasNext()) {
                        if (aidkVar2.b == 2) {
                            aidiVar = (aidi) aidkVar2.c;
                        } else {
                            aidiVar = aidi.a;
                        }
                        aiegVar6 = aidiVar.b;
                        if (aiegVar6 == null) {
                            aiegVar6 = aieg.a;
                        }
                        arrayList2.add(aiegVar6);
                    }
                    aidqVar8 = aidqVar4;
                    potVar10 = potVar9;
                    pirVar3 = pirVar4;
                    plbVar7 = plbVar4;
                    list10 = list8;
                    objR2 = r(plxVar2, atqq.ah(arrayList2), -1, -1, nwd.i(aidqVar4), plbVar7, 6, pirVar3);
                    if (objR2 != awoxVar) {
                        return awoxVar;
                    }
                    plxVar7 = plxVar2;
                    obj12 = objR2;
                    plbVar8 = plbVar7;
                    list11 = list9;
                    list12 = list10;
                    map5 = map4;
                    obj13 = obj11;
                    list14 = list11;
                    map4 = map5;
                    aidqVar4 = aidqVar8;
                    potVar11 = potVar10;
                    obj14 = obj13;
                    list13 = list12;
                    plbVar4 = plbVar8;
                    map6 = (Map) obj12;
                    plxVar2 = plxVar7;
                }
                if (nwd.f(aidqVar4)) {
                    if (aidqVar4.c == 27) {
                        aidnVar3 = (aidn) aidqVar4.d;
                    } else {
                        aidnVar3 = aidn.a;
                    }
                    aidmVar = aidnVar3.e;
                    if (aidmVar == null) {
                        aidmVar = aidm.a;
                    }
                    aiegVar8 = aidmVar.d;
                    if (aiegVar8 == null) {
                        aiegVar8 = aieg.a;
                    }
                    List listH4 = atqq.H(aiegVar8);
                    pirVar3.t = plxVar2;
                    pirVar3.s = potVar11;
                    pirVar3.a = list13;
                    pirVar3.b = obj14;
                    pirVar3.c = map4;
                    pirVar3.d = list14;
                    pirVar3.e = obj9;
                    pirVar3.f = map6;
                    pirVar3.g = null;
                    pirVar3.r = 7;
                    pzpVar = null;
                    r1 = this;
                    objM2 = r1.m(plxVar2, listH4, aidqVar4, plbVar4, 7, pirVar3);
                    if (objM2 == awoxVar) {
                        return awoxVar;
                    }
                    Object obj212 = obj9;
                    plxVar8 = plxVar2;
                    obj15 = objM2;
                    obj16 = obj212;
                    obj17 = obj14;
                    obj18 = list14;
                    map7 = map4;
                    r5 = r1;
                    list15 = (List) obj15;
                    r13 = obj18;
                    map4 = map7;
                    r11 = obj17;
                    r0 = r5;
                    r2 = obj16;
                } else {
                    r0 = this;
                    pzpVar = null;
                    Object obj31 = obj9;
                    plxVar8 = plxVar2;
                    list15 = awno.a;
                    r2 = obj31;
                    r11 = obj14;
                    r13 = list14;
                }
                listAj = atqq.aj(atqq.aj(atqq.aj(atqq.aj(atqq.aj(atqq.aj(list13, r11), atqq.ap(map4.values())), r13), r2), atqq.ap(map6.values())), list15);
                if (listAj.isEmpty()) {
                    it2 = listAj.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            i = 0;
                        } else if (nwd.g((pky) it2.next())) {
                            i = 1;
                        }
                    }
                } else {
                    i = 0;
                }
                listD = nwd.d(list13);
                listD2 = nwd.d(r11);
                pirVar3.t = plxVar8;
                pirVar3.s = potVar11;
                pirVar3.a = list13;
                pirVar3.b = r11;
                pirVar3.c = map4;
                pirVar3.d = r13;
                pirVar3.e = r2;
                pirVar3.f = map6;
                pirVar3.g = list15;
                pirVar3.h = listAj;
                pirVar3.i = listD;
                pirVar3.j = listD2;
                pirVar3.o = i;
                list16 = list15;
                pirVar3.r = 8;
                objK = r0.k(map4);
                if (objK != awoxVar) {
                    return awoxVar;
                }
                Map map111 = map4;
                r15 = r2;
                i2 = i;
                obj19 = listD2;
                plxVar9 = plxVar8;
                obj20 = listD;
                obj21 = listAj;
                r3 = r13;
                map8 = map111;
                obj22 = objK;
                r4 = r11;
                obj23 = list16;
                map9 = (Map) obj22;
                listD3 = nwd.d(r3);
                i3 = i2;
                listD4 = nwd.d(r15);
                pirVar3.t = plxVar9;
                pirVar3.s = potVar11;
                pirVar3.a = list13;
                pirVar3.b = r4;
                pirVar3.c = map8;
                pirVar3.d = r3;
                pirVar3.e = r15;
                pirVar3.f = map6;
                pirVar3.g = obj23;
                pirVar3.h = obj21;
                pirVar3.i = obj20;
                pirVar3.j = obj19;
                pirVar3.k = map9;
                pirVar3.l = listD3;
                pirVar3.m = listD4;
                pirVar3.o = i3;
                pirVar3.r = 9;
                objK2 = k(map6);
                if (objK2 == awoxVar) {
                    return awoxVar;
                }
                map10 = map8;
                pzpVar2 = pzpVar;
                r16 = listD4;
                r14 = obj19;
                list17 = list13;
                i4 = i3;
                r12 = obj20;
                map11 = map6;
                r7 = r3;
                potVar12 = potVar11;
                r17 = map9;
                r10 = obj21;
                r6 = r4;
                obj24 = objK2;
                r8 = r15;
                r18 = listD3;
                r19 = obj23;
                map12 = (Map) obj24;
                pzpVar3 = pzpVar2;
                listD5 = nwd.d(r19);
                if (r10.isEmpty()) {
                    if (1 != i4) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    map13 = map12;
                    pzpVarC = c(plxVar9, potVar12, list17, r6, map10, r7, r8, map11, r19, null, r12, r14, r17, r18, r16, map13, listD5, null, z4);
                } else {
                    map13 = map12;
                    pzpVarC = pzpVar3;
                }
                return new pgz((List) r12, (List) r14, (Map) r17, (List) r18, (Bitmap) atqq.af(r16), map13, (Bitmap) atqq.af(listD5), pzpVarC, SemanticState.Hidden);
            case 1:
                boolean z5 = pirVar4.n;
                plb plbVar9 = (plb) pirVar4.b;
                aidq aidqVar12 = (aidq) pirVar4.a;
                pot potVar14 = pirVar4.s;
                plx plxVar14 = pirVar4.t;
                atqp.j(obj25);
                aidqVar = aidqVar12;
                potVar13 = potVar14;
                pirVar2 = pirVar4;
                z2 = false;
                z3 = z5;
                plbVar2 = plbVar9;
                plxVar2 = plxVar14;
                objS = obj25;
                List list19 = (List) objS;
                if (aidqVar.c == 7) {
                    aidgVar = (aidg) aidqVar.d;
                } else {
                    aidgVar = aidg.a;
                }
                aiie aiieVar7 = aidgVar.d;
                aiieVar7.getClass();
                it = aiieVar7.iterator();
                do {
                    if (it.hasNext()) {
                        next = it.next();
                        aiegVar2 = (aieg) next;
                        aiegVar2.getClass();
                    } else {
                        next = null;
                    }
                    aiegVar = (aieg) next;
                    if (aiegVar != null) {
                        str = aiegVar.d;
                        if (str.length() == 0) {
                            str = aiegVar.b;
                        }
                        if (str == null) {
                            str = "";
                        }
                    } else {
                        str = "";
                    }
                    zH = r9.h(str, z3);
                    if (nwa.a(aidqVar)) {
                    }
                    aidqVar2 = aidqVar;
                    list = list19;
                    potVar2 = potVar13;
                    obj = awno.a;
                    plbVar3 = plbVar2;
                    if (nwa.a(aidqVar2)) {
                    }
                    map = awnp.a;
                    plbVar4 = plbVar3;
                    aidqVar4 = aidqVar2;
                    potVar4 = potVar2;
                    if (nwa.a(aidqVar4)) {
                        break;
                    }
                    Map map112 = map;
                    list4 = awno.a;
                    potVar7 = potVar4;
                    list5 = list;
                    obj4 = obj;
                    map2 = map112;
                    if (nwa.a(aidqVar4)) {
                        Map map113 = map2;
                        obj9 = awno.a;
                        list8 = list5;
                        map4 = map113;
                        potVar9 = potVar7;
                        pirVar4 = pirVar2;
                        obj10 = obj4;
                    } else {
                        if (aidqVar4.c == 27) {
                            aidnVar = (aidn) aidqVar4.d;
                        } else {
                            aidnVar = aidn.a;
                        }
                        aidhVar = aidnVar.c;
                        if (aidhVar == null) {
                            aidhVar = aidh.a;
                        }
                        aiegVar5 = aidhVar.c;
                        if (aiegVar5 == null) {
                            aiegVar5 = aieg.a;
                        }
                        List listH5 = atqq.H(aiegVar5);
                        pirVar2.t = plxVar2;
                        pirVar2.s = potVar7;
                        pirVar2.a = aidqVar4;
                        pirVar2.b = plbVar4;
                        pirVar2.c = list5;
                        pirVar2.d = obj4;
                        pirVar2.e = map2;
                        pirVar2.f = list4;
                        pirVar2.r = 5;
                        pirVar4 = pirVar2;
                        potVar8 = potVar7;
                        objM = m(plxVar2, listH5, aidqVar4, plbVar4, 5, pirVar4);
                        if (objM == awoxVar) {
                            return awoxVar;
                        }
                        Map map114 = map2;
                        plxVar6 = plxVar2;
                        obj7 = objM;
                        map3 = map114;
                        aidqVar7 = aidqVar4;
                        plbVar6 = plbVar4;
                        obj8 = obj4;
                        list7 = list5;
                        Object obj213 = obj8;
                        aidqVar4 = aidqVar7;
                        obj10 = obj213;
                        plx plxVar15 = plxVar6;
                        obj9 = (List) obj7;
                        plxVar2 = plxVar15;
                        map4 = map3;
                        list8 = list7;
                        plbVar4 = plbVar6;
                        potVar9 = potVar8;
                    }
                    list9 = list4;
                    if (nwa.a(aidqVar4)) {
                        map6 = awnp.a;
                        obj14 = obj10;
                        list13 = list8;
                        potVar11 = potVar9;
                        pirVar3 = pirVar4;
                        list14 = list9;
                    } else {
                        pirVar4.t = plxVar2;
                        pirVar4.s = potVar9;
                        pirVar4.a = aidqVar4;
                        pirVar4.b = plbVar4;
                        pirVar4.c = list8;
                        pirVar4.d = obj10;
                        pirVar4.e = map4;
                        pirVar4.f = list9;
                        pirVar4.g = obj9;
                        pirVar4.r = 6;
                        if (aidqVar4.c == 27) {
                            aidnVar2 = (aidn) aidqVar4.d;
                        } else {
                            aidnVar2 = aidn.a;
                        }
                        aiie aiieVar8 = aidnVar2.d;
                        aiieVar8.getClass();
                        arrayList = new ArrayList();
                        while (r7.hasNext()) {
                            aidkVar = (aidk) obj27;
                            Object obj214 = obj10;
                            if (aidkVar.b == 2) {
                                aidiVar2 = (aidi) aidkVar.c;
                            } else {
                                aidiVar2 = aidi.a;
                            }
                            aiegVar7 = aidiVar2.b;
                            if (aiegVar7 == null) {
                                aiegVar7 = aieg.a;
                            }
                            aiegVar7.getClass();
                            if (nwd.h(aiegVar7)) {
                                arrayList.add(obj27);
                            }
                            obj10 = obj214;
                        }
                        obj11 = obj10;
                        arrayList2 = new ArrayList(atqq.N(arrayList, 10));
                        while (r7.hasNext()) {
                            if (aidkVar2.b == 2) {
                                aidiVar = (aidi) aidkVar2.c;
                            } else {
                                aidiVar = aidi.a;
                            }
                            aiegVar6 = aidiVar.b;
                            if (aiegVar6 == null) {
                                aiegVar6 = aieg.a;
                            }
                            arrayList2.add(aiegVar6);
                        }
                        aidqVar8 = aidqVar4;
                        potVar10 = potVar9;
                        pirVar3 = pirVar4;
                        plbVar7 = plbVar4;
                        list10 = list8;
                        objR2 = r(plxVar2, atqq.ah(arrayList2), -1, -1, nwd.i(aidqVar4), plbVar7, 6, pirVar3);
                        if (objR2 != awoxVar) {
                            return awoxVar;
                        }
                        plxVar7 = plxVar2;
                        obj12 = objR2;
                        plbVar8 = plbVar7;
                        list11 = list9;
                        list12 = list10;
                        map5 = map4;
                        obj13 = obj11;
                        list14 = list11;
                        map4 = map5;
                        aidqVar4 = aidqVar8;
                        potVar11 = potVar10;
                        obj14 = obj13;
                        list13 = list12;
                        plbVar4 = plbVar8;
                        map6 = (Map) obj12;
                        plxVar2 = plxVar7;
                    }
                    if (nwd.f(aidqVar4)) {
                        if (aidqVar4.c == 27) {
                            aidnVar3 = (aidn) aidqVar4.d;
                        } else {
                            aidnVar3 = aidn.a;
                        }
                        aidmVar = aidnVar3.e;
                        if (aidmVar == null) {
                            aidmVar = aidm.a;
                        }
                        aiegVar8 = aidmVar.d;
                        if (aiegVar8 == null) {
                            aiegVar8 = aieg.a;
                        }
                        List listH6 = atqq.H(aiegVar8);
                        pirVar3.t = plxVar2;
                        pirVar3.s = potVar11;
                        pirVar3.a = list13;
                        pirVar3.b = obj14;
                        pirVar3.c = map4;
                        pirVar3.d = list14;
                        pirVar3.e = obj9;
                        pirVar3.f = map6;
                        pirVar3.g = null;
                        pirVar3.r = 7;
                        pzpVar = null;
                        r1 = this;
                        objM2 = r1.m(plxVar2, listH6, aidqVar4, plbVar4, 7, pirVar3);
                        if (objM2 == awoxVar) {
                            return awoxVar;
                        }
                        Object obj215 = obj9;
                        plxVar8 = plxVar2;
                        obj15 = objM2;
                        obj16 = obj215;
                        obj17 = obj14;
                        obj18 = list14;
                        map7 = map4;
                        r5 = r1;
                        list15 = (List) obj15;
                        r13 = obj18;
                        map4 = map7;
                        r11 = obj17;
                        r0 = r5;
                        r2 = obj16;
                    } else {
                        r0 = this;
                        pzpVar = null;
                        Object obj32 = obj9;
                        plxVar8 = plxVar2;
                        list15 = awno.a;
                        r2 = obj32;
                        r11 = obj14;
                        r13 = list14;
                    }
                    listAj = atqq.aj(atqq.aj(atqq.aj(atqq.aj(atqq.aj(atqq.aj(list13, r11), atqq.ap(map4.values())), r13), r2), atqq.ap(map6.values())), list15);
                    if (listAj.isEmpty()) {
                        it2 = listAj.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                i = 0;
                            } else if (nwd.g((pky) it2.next())) {
                                i = 1;
                            }
                        }
                    } else {
                        i = 0;
                    }
                    listD = nwd.d(list13);
                    listD2 = nwd.d(r11);
                    pirVar3.t = plxVar8;
                    pirVar3.s = potVar11;
                    pirVar3.a = list13;
                    pirVar3.b = r11;
                    pirVar3.c = map4;
                    pirVar3.d = r13;
                    pirVar3.e = r2;
                    pirVar3.f = map6;
                    pirVar3.g = list15;
                    pirVar3.h = listAj;
                    pirVar3.i = listD;
                    pirVar3.j = listD2;
                    pirVar3.o = i;
                    list16 = list15;
                    pirVar3.r = 8;
                    objK = r0.k(map4);
                    if (objK != awoxVar) {
                        return awoxVar;
                    }
                    Map map115 = map4;
                    r15 = r2;
                    i2 = i;
                    obj19 = listD2;
                    plxVar9 = plxVar8;
                    obj20 = listD;
                    obj21 = listAj;
                    r3 = r13;
                    map8 = map115;
                    obj22 = objK;
                    r4 = r11;
                    obj23 = list16;
                    map9 = (Map) obj22;
                    listD3 = nwd.d(r3);
                    i3 = i2;
                    listD4 = nwd.d(r15);
                    pirVar3.t = plxVar9;
                    pirVar3.s = potVar11;
                    pirVar3.a = list13;
                    pirVar3.b = r4;
                    pirVar3.c = map8;
                    pirVar3.d = r3;
                    pirVar3.e = r15;
                    pirVar3.f = map6;
                    pirVar3.g = obj23;
                    pirVar3.h = obj21;
                    pirVar3.i = obj20;
                    pirVar3.j = obj19;
                    pirVar3.k = map9;
                    pirVar3.l = listD3;
                    pirVar3.m = listD4;
                    pirVar3.o = i3;
                    pirVar3.r = 9;
                    objK2 = k(map6);
                    if (objK2 == awoxVar) {
                        return awoxVar;
                    }
                    map10 = map8;
                    pzpVar2 = pzpVar;
                    r16 = listD4;
                    r14 = obj19;
                    list17 = list13;
                    i4 = i3;
                    r12 = obj20;
                    map11 = map6;
                    r7 = r3;
                    potVar12 = potVar11;
                    r17 = map9;
                    r10 = obj21;
                    r6 = r4;
                    obj24 = objK2;
                    r8 = r15;
                    r18 = listD3;
                    r19 = obj23;
                    map12 = (Map) obj24;
                    pzpVar3 = pzpVar2;
                    listD5 = nwd.d(r19);
                    if (r10.isEmpty()) {
                        if (1 != i4) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        map13 = map12;
                        pzpVarC = c(plxVar9, potVar12, list17, r6, map10, r7, r8, map11, r19, null, r12, r14, r17, r18, r16, map13, listD5, null, z4);
                    } else {
                        map13 = map12;
                        pzpVarC = pzpVar3;
                    }
                    return new pgz((List) r12, (List) r14, (Map) r17, (List) r18, (Bitmap) atqq.af(r16), map13, (Bitmap) atqq.af(listD5), pzpVarC, SemanticState.Hidden);
                } while (!nwd.h(aiegVar2));
                aiegVar = (aieg) next;
                if (aiegVar != null) {
                    str = aiegVar.d;
                    if (str.length() == 0) {
                        str = aiegVar.b;
                    }
                    if (str == null) {
                        str = "";
                    }
                } else {
                    str = "";
                }
                zH = r9.h(str, z3);
                if (nwa.a(aidqVar)) {
                }
                aidqVar2 = aidqVar;
                list = list19;
                potVar2 = potVar13;
                obj = awno.a;
                plbVar3 = plbVar2;
                if (nwa.a(aidqVar2)) {
                }
                map = awnp.a;
                plbVar4 = plbVar3;
                aidqVar4 = aidqVar2;
                potVar4 = potVar2;
                if (nwa.a(aidqVar4)) {
                    break;
                }
                Map map116 = map;
                list4 = awno.a;
                potVar7 = potVar4;
                list5 = list;
                obj4 = obj;
                map2 = map116;
                if (nwa.a(aidqVar4)) {
                    Map map117 = map2;
                    obj9 = awno.a;
                    list8 = list5;
                    map4 = map117;
                    potVar9 = potVar7;
                    pirVar4 = pirVar2;
                    obj10 = obj4;
                } else {
                    if (aidqVar4.c == 27) {
                        aidnVar = (aidn) aidqVar4.d;
                    } else {
                        aidnVar = aidn.a;
                    }
                    aidhVar = aidnVar.c;
                    if (aidhVar == null) {
                        aidhVar = aidh.a;
                    }
                    aiegVar5 = aidhVar.c;
                    if (aiegVar5 == null) {
                        aiegVar5 = aieg.a;
                    }
                    List listH7 = atqq.H(aiegVar5);
                    pirVar2.t = plxVar2;
                    pirVar2.s = potVar7;
                    pirVar2.a = aidqVar4;
                    pirVar2.b = plbVar4;
                    pirVar2.c = list5;
                    pirVar2.d = obj4;
                    pirVar2.e = map2;
                    pirVar2.f = list4;
                    pirVar2.r = 5;
                    pirVar4 = pirVar2;
                    potVar8 = potVar7;
                    objM = m(plxVar2, listH7, aidqVar4, plbVar4, 5, pirVar4);
                    if (objM == awoxVar) {
                        return awoxVar;
                    }
                    Map map118 = map2;
                    plxVar6 = plxVar2;
                    obj7 = objM;
                    map3 = map118;
                    aidqVar7 = aidqVar4;
                    plbVar6 = plbVar4;
                    obj8 = obj4;
                    list7 = list5;
                    Object obj216 = obj8;
                    aidqVar4 = aidqVar7;
                    obj10 = obj216;
                    plx plxVar16 = plxVar6;
                    obj9 = (List) obj7;
                    plxVar2 = plxVar16;
                    map4 = map3;
                    list8 = list7;
                    plbVar4 = plbVar6;
                    potVar9 = potVar8;
                }
                list9 = list4;
                if (nwa.a(aidqVar4)) {
                    map6 = awnp.a;
                    obj14 = obj10;
                    list13 = list8;
                    potVar11 = potVar9;
                    pirVar3 = pirVar4;
                    list14 = list9;
                } else {
                    pirVar4.t = plxVar2;
                    pirVar4.s = potVar9;
                    pirVar4.a = aidqVar4;
                    pirVar4.b = plbVar4;
                    pirVar4.c = list8;
                    pirVar4.d = obj10;
                    pirVar4.e = map4;
                    pirVar4.f = list9;
                    pirVar4.g = obj9;
                    pirVar4.r = 6;
                    if (aidqVar4.c == 27) {
                        aidnVar2 = (aidn) aidqVar4.d;
                    } else {
                        aidnVar2 = aidn.a;
                    }
                    aiie aiieVar9 = aidnVar2.d;
                    aiieVar9.getClass();
                    arrayList = new ArrayList();
                    while (r7.hasNext()) {
                        aidkVar = (aidk) obj27;
                        Object obj217 = obj10;
                        if (aidkVar.b == 2) {
                            aidiVar2 = (aidi) aidkVar.c;
                        } else {
                            aidiVar2 = aidi.a;
                        }
                        aiegVar7 = aidiVar2.b;
                        if (aiegVar7 == null) {
                            aiegVar7 = aieg.a;
                        }
                        aiegVar7.getClass();
                        if (nwd.h(aiegVar7)) {
                            arrayList.add(obj27);
                        }
                        obj10 = obj217;
                    }
                    obj11 = obj10;
                    arrayList2 = new ArrayList(atqq.N(arrayList, 10));
                    while (r7.hasNext()) {
                        if (aidkVar2.b == 2) {
                            aidiVar = (aidi) aidkVar2.c;
                        } else {
                            aidiVar = aidi.a;
                        }
                        aiegVar6 = aidiVar.b;
                        if (aiegVar6 == null) {
                            aiegVar6 = aieg.a;
                        }
                        arrayList2.add(aiegVar6);
                    }
                    aidqVar8 = aidqVar4;
                    potVar10 = potVar9;
                    pirVar3 = pirVar4;
                    plbVar7 = plbVar4;
                    list10 = list8;
                    objR2 = r(plxVar2, atqq.ah(arrayList2), -1, -1, nwd.i(aidqVar4), plbVar7, 6, pirVar3);
                    if (objR2 != awoxVar) {
                        return awoxVar;
                    }
                    plxVar7 = plxVar2;
                    obj12 = objR2;
                    plbVar8 = plbVar7;
                    list11 = list9;
                    list12 = list10;
                    map5 = map4;
                    obj13 = obj11;
                    list14 = list11;
                    map4 = map5;
                    aidqVar4 = aidqVar8;
                    potVar11 = potVar10;
                    obj14 = obj13;
                    list13 = list12;
                    plbVar4 = plbVar8;
                    map6 = (Map) obj12;
                    plxVar2 = plxVar7;
                }
                if (nwd.f(aidqVar4)) {
                    if (aidqVar4.c == 27) {
                        aidnVar3 = (aidn) aidqVar4.d;
                    } else {
                        aidnVar3 = aidn.a;
                    }
                    aidmVar = aidnVar3.e;
                    if (aidmVar == null) {
                        aidmVar = aidm.a;
                    }
                    aiegVar8 = aidmVar.d;
                    if (aiegVar8 == null) {
                        aiegVar8 = aieg.a;
                    }
                    List listH8 = atqq.H(aiegVar8);
                    pirVar3.t = plxVar2;
                    pirVar3.s = potVar11;
                    pirVar3.a = list13;
                    pirVar3.b = obj14;
                    pirVar3.c = map4;
                    pirVar3.d = list14;
                    pirVar3.e = obj9;
                    pirVar3.f = map6;
                    pirVar3.g = null;
                    pirVar3.r = 7;
                    pzpVar = null;
                    r1 = this;
                    objM2 = r1.m(plxVar2, listH8, aidqVar4, plbVar4, 7, pirVar3);
                    if (objM2 == awoxVar) {
                        return awoxVar;
                    }
                    Object obj218 = obj9;
                    plxVar8 = plxVar2;
                    obj15 = objM2;
                    obj16 = obj218;
                    obj17 = obj14;
                    obj18 = list14;
                    map7 = map4;
                    r5 = r1;
                    list15 = (List) obj15;
                    r13 = obj18;
                    map4 = map7;
                    r11 = obj17;
                    r0 = r5;
                    r2 = obj16;
                } else {
                    r0 = this;
                    pzpVar = null;
                    Object obj33 = obj9;
                    plxVar8 = plxVar2;
                    list15 = awno.a;
                    r2 = obj33;
                    r11 = obj14;
                    r13 = list14;
                }
                listAj = atqq.aj(atqq.aj(atqq.aj(atqq.aj(atqq.aj(atqq.aj(list13, r11), atqq.ap(map4.values())), r13), r2), atqq.ap(map6.values())), list15);
                if (listAj.isEmpty()) {
                    it2 = listAj.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            i = 0;
                        } else if (nwd.g((pky) it2.next())) {
                            i = 1;
                        }
                    }
                } else {
                    i = 0;
                }
                listD = nwd.d(list13);
                listD2 = nwd.d(r11);
                pirVar3.t = plxVar8;
                pirVar3.s = potVar11;
                pirVar3.a = list13;
                pirVar3.b = r11;
                pirVar3.c = map4;
                pirVar3.d = r13;
                pirVar3.e = r2;
                pirVar3.f = map6;
                pirVar3.g = list15;
                pirVar3.h = listAj;
                pirVar3.i = listD;
                pirVar3.j = listD2;
                pirVar3.o = i;
                list16 = list15;
                pirVar3.r = 8;
                objK = r0.k(map4);
                if (objK != awoxVar) {
                    return awoxVar;
                }
                Map map119 = map4;
                r15 = r2;
                i2 = i;
                obj19 = listD2;
                plxVar9 = plxVar8;
                obj20 = listD;
                obj21 = listAj;
                r3 = r13;
                map8 = map119;
                obj22 = objK;
                r4 = r11;
                obj23 = list16;
                map9 = (Map) obj22;
                listD3 = nwd.d(r3);
                i3 = i2;
                listD4 = nwd.d(r15);
                pirVar3.t = plxVar9;
                pirVar3.s = potVar11;
                pirVar3.a = list13;
                pirVar3.b = r4;
                pirVar3.c = map8;
                pirVar3.d = r3;
                pirVar3.e = r15;
                pirVar3.f = map6;
                pirVar3.g = obj23;
                pirVar3.h = obj21;
                pirVar3.i = obj20;
                pirVar3.j = obj19;
                pirVar3.k = map9;
                pirVar3.l = listD3;
                pirVar3.m = listD4;
                pirVar3.o = i3;
                pirVar3.r = 9;
                objK2 = k(map6);
                if (objK2 == awoxVar) {
                    return awoxVar;
                }
                map10 = map8;
                pzpVar2 = pzpVar;
                r16 = listD4;
                r14 = obj19;
                list17 = list13;
                i4 = i3;
                r12 = obj20;
                map11 = map6;
                r7 = r3;
                potVar12 = potVar11;
                r17 = map9;
                r10 = obj21;
                r6 = r4;
                obj24 = objK2;
                r8 = r15;
                r18 = listD3;
                r19 = obj23;
                map12 = (Map) obj24;
                pzpVar3 = pzpVar2;
                listD5 = nwd.d(r19);
                if (r10.isEmpty()) {
                    if (1 != i4) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    map13 = map12;
                    pzpVarC = c(plxVar9, potVar12, list17, r6, map10, r7, r8, map11, r19, null, r12, r14, r17, r18, r16, map13, listD5, null, z4);
                } else {
                    map13 = map12;
                    pzpVarC = pzpVar3;
                }
                return new pgz((List) r12, (List) r14, (Map) r17, (List) r18, (Bitmap) atqq.af(r16), map13, (Bitmap) atqq.af(listD5), pzpVarC, SemanticState.Hidden);
            case 2:
                boolean z6 = pirVar4.n;
                list2 = (List) pirVar4.c;
                plbVar2 = (plb) pirVar4.b;
                aidqVar3 = (aidq) pirVar4.a;
                potVar3 = pirVar4.s;
                plx plxVar17 = pirVar4.t;
                atqp.j(obj25);
                pirVar2 = pirVar4;
                plxVar3 = plxVar17;
                z2 = false;
                zH = z6;
                obj2 = obj25;
                obj = (List) obj2;
                list = list2;
                aidqVar2 = aidqVar3;
                potVar2 = potVar3;
                plxVar2 = plxVar3;
                plbVar3 = plbVar2;
                if (nwa.a(aidqVar2)) {
                }
                map = awnp.a;
                plbVar4 = plbVar3;
                aidqVar4 = aidqVar2;
                potVar4 = potVar2;
                if (nwa.a(aidqVar4)) {
                    break;
                }
                Map map1110 = map;
                list4 = awno.a;
                potVar7 = potVar4;
                list5 = list;
                obj4 = obj;
                map2 = map1110;
                if (nwa.a(aidqVar4)) {
                    Map map1111 = map2;
                    obj9 = awno.a;
                    list8 = list5;
                    map4 = map1111;
                    potVar9 = potVar7;
                    pirVar4 = pirVar2;
                    obj10 = obj4;
                } else {
                    if (aidqVar4.c == 27) {
                        aidnVar = (aidn) aidqVar4.d;
                    } else {
                        aidnVar = aidn.a;
                    }
                    aidhVar = aidnVar.c;
                    if (aidhVar == null) {
                        aidhVar = aidh.a;
                    }
                    aiegVar5 = aidhVar.c;
                    if (aiegVar5 == null) {
                        aiegVar5 = aieg.a;
                    }
                    List listH9 = atqq.H(aiegVar5);
                    pirVar2.t = plxVar2;
                    pirVar2.s = potVar7;
                    pirVar2.a = aidqVar4;
                    pirVar2.b = plbVar4;
                    pirVar2.c = list5;
                    pirVar2.d = obj4;
                    pirVar2.e = map2;
                    pirVar2.f = list4;
                    pirVar2.r = 5;
                    pirVar4 = pirVar2;
                    potVar8 = potVar7;
                    objM = m(plxVar2, listH9, aidqVar4, plbVar4, 5, pirVar4);
                    if (objM == awoxVar) {
                        return awoxVar;
                    }
                    Map map1112 = map2;
                    plxVar6 = plxVar2;
                    obj7 = objM;
                    map3 = map1112;
                    aidqVar7 = aidqVar4;
                    plbVar6 = plbVar4;
                    obj8 = obj4;
                    list7 = list5;
                    Object obj219 = obj8;
                    aidqVar4 = aidqVar7;
                    obj10 = obj219;
                    plx plxVar18 = plxVar6;
                    obj9 = (List) obj7;
                    plxVar2 = plxVar18;
                    map4 = map3;
                    list8 = list7;
                    plbVar4 = plbVar6;
                    potVar9 = potVar8;
                }
                list9 = list4;
                if (nwa.a(aidqVar4)) {
                    map6 = awnp.a;
                    obj14 = obj10;
                    list13 = list8;
                    potVar11 = potVar9;
                    pirVar3 = pirVar4;
                    list14 = list9;
                } else {
                    pirVar4.t = plxVar2;
                    pirVar4.s = potVar9;
                    pirVar4.a = aidqVar4;
                    pirVar4.b = plbVar4;
                    pirVar4.c = list8;
                    pirVar4.d = obj10;
                    pirVar4.e = map4;
                    pirVar4.f = list9;
                    pirVar4.g = obj9;
                    pirVar4.r = 6;
                    if (aidqVar4.c == 27) {
                        aidnVar2 = (aidn) aidqVar4.d;
                    } else {
                        aidnVar2 = aidn.a;
                    }
                    aiie aiieVar10 = aidnVar2.d;
                    aiieVar10.getClass();
                    arrayList = new ArrayList();
                    while (r7.hasNext()) {
                        aidkVar = (aidk) obj27;
                        Object obj2110 = obj10;
                        if (aidkVar.b == 2) {
                            aidiVar2 = (aidi) aidkVar.c;
                        } else {
                            aidiVar2 = aidi.a;
                        }
                        aiegVar7 = aidiVar2.b;
                        if (aiegVar7 == null) {
                            aiegVar7 = aieg.a;
                        }
                        aiegVar7.getClass();
                        if (nwd.h(aiegVar7)) {
                            arrayList.add(obj27);
                        }
                        obj10 = obj2110;
                    }
                    obj11 = obj10;
                    arrayList2 = new ArrayList(atqq.N(arrayList, 10));
                    while (r7.hasNext()) {
                        if (aidkVar2.b == 2) {
                            aidiVar = (aidi) aidkVar2.c;
                        } else {
                            aidiVar = aidi.a;
                        }
                        aiegVar6 = aidiVar.b;
                        if (aiegVar6 == null) {
                            aiegVar6 = aieg.a;
                        }
                        arrayList2.add(aiegVar6);
                    }
                    aidqVar8 = aidqVar4;
                    potVar10 = potVar9;
                    pirVar3 = pirVar4;
                    plbVar7 = plbVar4;
                    list10 = list8;
                    objR2 = r(plxVar2, atqq.ah(arrayList2), -1, -1, nwd.i(aidqVar4), plbVar7, 6, pirVar3);
                    if (objR2 != awoxVar) {
                        return awoxVar;
                    }
                    plxVar7 = plxVar2;
                    obj12 = objR2;
                    plbVar8 = plbVar7;
                    list11 = list9;
                    list12 = list10;
                    map5 = map4;
                    obj13 = obj11;
                    list14 = list11;
                    map4 = map5;
                    aidqVar4 = aidqVar8;
                    potVar11 = potVar10;
                    obj14 = obj13;
                    list13 = list12;
                    plbVar4 = plbVar8;
                    map6 = (Map) obj12;
                    plxVar2 = plxVar7;
                }
                if (nwd.f(aidqVar4)) {
                    if (aidqVar4.c == 27) {
                        aidnVar3 = (aidn) aidqVar4.d;
                    } else {
                        aidnVar3 = aidn.a;
                    }
                    aidmVar = aidnVar3.e;
                    if (aidmVar == null) {
                        aidmVar = aidm.a;
                    }
                    aiegVar8 = aidmVar.d;
                    if (aiegVar8 == null) {
                        aiegVar8 = aieg.a;
                    }
                    List listH10 = atqq.H(aiegVar8);
                    pirVar3.t = plxVar2;
                    pirVar3.s = potVar11;
                    pirVar3.a = list13;
                    pirVar3.b = obj14;
                    pirVar3.c = map4;
                    pirVar3.d = list14;
                    pirVar3.e = obj9;
                    pirVar3.f = map6;
                    pirVar3.g = null;
                    pirVar3.r = 7;
                    pzpVar = null;
                    r1 = this;
                    objM2 = r1.m(plxVar2, listH10, aidqVar4, plbVar4, 7, pirVar3);
                    if (objM2 == awoxVar) {
                        return awoxVar;
                    }
                    Object obj2111 = obj9;
                    plxVar8 = plxVar2;
                    obj15 = objM2;
                    obj16 = obj2111;
                    obj17 = obj14;
                    obj18 = list14;
                    map7 = map4;
                    r5 = r1;
                    list15 = (List) obj15;
                    r13 = obj18;
                    map4 = map7;
                    r11 = obj17;
                    r0 = r5;
                    r2 = obj16;
                } else {
                    r0 = this;
                    pzpVar = null;
                    Object obj34 = obj9;
                    plxVar8 = plxVar2;
                    list15 = awno.a;
                    r2 = obj34;
                    r11 = obj14;
                    r13 = list14;
                }
                listAj = atqq.aj(atqq.aj(atqq.aj(atqq.aj(atqq.aj(atqq.aj(list13, r11), atqq.ap(map4.values())), r13), r2), atqq.ap(map6.values())), list15);
                if (listAj.isEmpty()) {
                    it2 = listAj.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            i = 0;
                        } else if (nwd.g((pky) it2.next())) {
                            i = 1;
                        }
                    }
                } else {
                    i = 0;
                }
                listD = nwd.d(list13);
                listD2 = nwd.d(r11);
                pirVar3.t = plxVar8;
                pirVar3.s = potVar11;
                pirVar3.a = list13;
                pirVar3.b = r11;
                pirVar3.c = map4;
                pirVar3.d = r13;
                pirVar3.e = r2;
                pirVar3.f = map6;
                pirVar3.g = list15;
                pirVar3.h = listAj;
                pirVar3.i = listD;
                pirVar3.j = listD2;
                pirVar3.o = i;
                list16 = list15;
                pirVar3.r = 8;
                objK = r0.k(map4);
                if (objK != awoxVar) {
                    return awoxVar;
                }
                Map map1113 = map4;
                r15 = r2;
                i2 = i;
                obj19 = listD2;
                plxVar9 = plxVar8;
                obj20 = listD;
                obj21 = listAj;
                r3 = r13;
                map8 = map1113;
                obj22 = objK;
                r4 = r11;
                obj23 = list16;
                map9 = (Map) obj22;
                listD3 = nwd.d(r3);
                i3 = i2;
                listD4 = nwd.d(r15);
                pirVar3.t = plxVar9;
                pirVar3.s = potVar11;
                pirVar3.a = list13;
                pirVar3.b = r4;
                pirVar3.c = map8;
                pirVar3.d = r3;
                pirVar3.e = r15;
                pirVar3.f = map6;
                pirVar3.g = obj23;
                pirVar3.h = obj21;
                pirVar3.i = obj20;
                pirVar3.j = obj19;
                pirVar3.k = map9;
                pirVar3.l = listD3;
                pirVar3.m = listD4;
                pirVar3.o = i3;
                pirVar3.r = 9;
                objK2 = k(map6);
                if (objK2 == awoxVar) {
                    return awoxVar;
                }
                map10 = map8;
                pzpVar2 = pzpVar;
                r16 = listD4;
                r14 = obj19;
                list17 = list13;
                i4 = i3;
                r12 = obj20;
                map11 = map6;
                r7 = r3;
                potVar12 = potVar11;
                r17 = map9;
                r10 = obj21;
                r6 = r4;
                obj24 = objK2;
                r8 = r15;
                r18 = listD3;
                r19 = obj23;
                map12 = (Map) obj24;
                pzpVar3 = pzpVar2;
                listD5 = nwd.d(r19);
                if (r10.isEmpty()) {
                    if (1 != i4) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    map13 = map12;
                    pzpVarC = c(plxVar9, potVar12, list17, r6, map10, r7, r8, map11, r19, null, r12, r14, r17, r18, r16, map13, listD5, null, z4);
                } else {
                    map13 = map12;
                    pzpVarC = pzpVar3;
                }
                return new pgz((List) r12, (List) r14, (Map) r17, (List) r18, (Bitmap) atqq.af(r16), map13, (Bitmap) atqq.af(listD5), pzpVarC, SemanticState.Hidden);
            case 3:
                Object obj35 = pirVar4.d;
                list3 = (List) pirVar4.c;
                plbVar5 = (plb) pirVar4.b;
                aidqVar5 = (aidq) pirVar4.a;
                potVar6 = pirVar4.s;
                plxVar4 = pirVar4.t;
                atqp.j(obj25);
                obj = obj35;
                pirVar2 = pirVar4;
                obj3 = obj25;
                plx plxVar19 = plxVar4;
                map = (Map) obj3;
                plxVar2 = plxVar19;
                aidq aidqVar13 = aidqVar5;
                plbVar4 = plbVar5;
                aidqVar4 = aidqVar13;
                list = list3;
                potVar4 = potVar6;
                if (nwa.a(aidqVar4)) {
                    break;
                }
                Map map1114 = map;
                list4 = awno.a;
                potVar7 = potVar4;
                list5 = list;
                obj4 = obj;
                map2 = map1114;
                if (nwa.a(aidqVar4)) {
                    Map map1115 = map2;
                    obj9 = awno.a;
                    list8 = list5;
                    map4 = map1115;
                    potVar9 = potVar7;
                    pirVar4 = pirVar2;
                    obj10 = obj4;
                } else {
                    if (aidqVar4.c == 27) {
                        aidnVar = (aidn) aidqVar4.d;
                    } else {
                        aidnVar = aidn.a;
                    }
                    aidhVar = aidnVar.c;
                    if (aidhVar == null) {
                        aidhVar = aidh.a;
                    }
                    aiegVar5 = aidhVar.c;
                    if (aiegVar5 == null) {
                        aiegVar5 = aieg.a;
                    }
                    List listH11 = atqq.H(aiegVar5);
                    pirVar2.t = plxVar2;
                    pirVar2.s = potVar7;
                    pirVar2.a = aidqVar4;
                    pirVar2.b = plbVar4;
                    pirVar2.c = list5;
                    pirVar2.d = obj4;
                    pirVar2.e = map2;
                    pirVar2.f = list4;
                    pirVar2.r = 5;
                    pirVar4 = pirVar2;
                    potVar8 = potVar7;
                    objM = m(plxVar2, listH11, aidqVar4, plbVar4, 5, pirVar4);
                    if (objM == awoxVar) {
                        return awoxVar;
                    }
                    Map map1116 = map2;
                    plxVar6 = plxVar2;
                    obj7 = objM;
                    map3 = map1116;
                    aidqVar7 = aidqVar4;
                    plbVar6 = plbVar4;
                    obj8 = obj4;
                    list7 = list5;
                    Object obj2112 = obj8;
                    aidqVar4 = aidqVar7;
                    obj10 = obj2112;
                    plx plxVar110 = plxVar6;
                    obj9 = (List) obj7;
                    plxVar2 = plxVar110;
                    map4 = map3;
                    list8 = list7;
                    plbVar4 = plbVar6;
                    potVar9 = potVar8;
                }
                list9 = list4;
                if (nwa.a(aidqVar4)) {
                    map6 = awnp.a;
                    obj14 = obj10;
                    list13 = list8;
                    potVar11 = potVar9;
                    pirVar3 = pirVar4;
                    list14 = list9;
                } else {
                    pirVar4.t = plxVar2;
                    pirVar4.s = potVar9;
                    pirVar4.a = aidqVar4;
                    pirVar4.b = plbVar4;
                    pirVar4.c = list8;
                    pirVar4.d = obj10;
                    pirVar4.e = map4;
                    pirVar4.f = list9;
                    pirVar4.g = obj9;
                    pirVar4.r = 6;
                    if (aidqVar4.c == 27) {
                        aidnVar2 = (aidn) aidqVar4.d;
                    } else {
                        aidnVar2 = aidn.a;
                    }
                    aiie aiieVar11 = aidnVar2.d;
                    aiieVar11.getClass();
                    arrayList = new ArrayList();
                    while (r7.hasNext()) {
                        aidkVar = (aidk) obj27;
                        Object obj2113 = obj10;
                        if (aidkVar.b == 2) {
                            aidiVar2 = (aidi) aidkVar.c;
                        } else {
                            aidiVar2 = aidi.a;
                        }
                        aiegVar7 = aidiVar2.b;
                        if (aiegVar7 == null) {
                            aiegVar7 = aieg.a;
                        }
                        aiegVar7.getClass();
                        if (nwd.h(aiegVar7)) {
                            arrayList.add(obj27);
                        }
                        obj10 = obj2113;
                    }
                    obj11 = obj10;
                    arrayList2 = new ArrayList(atqq.N(arrayList, 10));
                    while (r7.hasNext()) {
                        if (aidkVar2.b == 2) {
                            aidiVar = (aidi) aidkVar2.c;
                        } else {
                            aidiVar = aidi.a;
                        }
                        aiegVar6 = aidiVar.b;
                        if (aiegVar6 == null) {
                            aiegVar6 = aieg.a;
                        }
                        arrayList2.add(aiegVar6);
                    }
                    aidqVar8 = aidqVar4;
                    potVar10 = potVar9;
                    pirVar3 = pirVar4;
                    plbVar7 = plbVar4;
                    list10 = list8;
                    objR2 = r(plxVar2, atqq.ah(arrayList2), -1, -1, nwd.i(aidqVar4), plbVar7, 6, pirVar3);
                    if (objR2 != awoxVar) {
                        return awoxVar;
                    }
                    plxVar7 = plxVar2;
                    obj12 = objR2;
                    plbVar8 = plbVar7;
                    list11 = list9;
                    list12 = list10;
                    map5 = map4;
                    obj13 = obj11;
                    list14 = list11;
                    map4 = map5;
                    aidqVar4 = aidqVar8;
                    potVar11 = potVar10;
                    obj14 = obj13;
                    list13 = list12;
                    plbVar4 = plbVar8;
                    map6 = (Map) obj12;
                    plxVar2 = plxVar7;
                }
                if (nwd.f(aidqVar4)) {
                    if (aidqVar4.c == 27) {
                        aidnVar3 = (aidn) aidqVar4.d;
                    } else {
                        aidnVar3 = aidn.a;
                    }
                    aidmVar = aidnVar3.e;
                    if (aidmVar == null) {
                        aidmVar = aidm.a;
                    }
                    aiegVar8 = aidmVar.d;
                    if (aiegVar8 == null) {
                        aiegVar8 = aieg.a;
                    }
                    List listH12 = atqq.H(aiegVar8);
                    pirVar3.t = plxVar2;
                    pirVar3.s = potVar11;
                    pirVar3.a = list13;
                    pirVar3.b = obj14;
                    pirVar3.c = map4;
                    pirVar3.d = list14;
                    pirVar3.e = obj9;
                    pirVar3.f = map6;
                    pirVar3.g = null;
                    pirVar3.r = 7;
                    pzpVar = null;
                    r1 = this;
                    objM2 = r1.m(plxVar2, listH12, aidqVar4, plbVar4, 7, pirVar3);
                    if (objM2 == awoxVar) {
                        return awoxVar;
                    }
                    Object obj2114 = obj9;
                    plxVar8 = plxVar2;
                    obj15 = objM2;
                    obj16 = obj2114;
                    obj17 = obj14;
                    obj18 = list14;
                    map7 = map4;
                    r5 = r1;
                    list15 = (List) obj15;
                    r13 = obj18;
                    map4 = map7;
                    r11 = obj17;
                    r0 = r5;
                    r2 = obj16;
                } else {
                    r0 = this;
                    pzpVar = null;
                    Object obj36 = obj9;
                    plxVar8 = plxVar2;
                    list15 = awno.a;
                    r2 = obj36;
                    r11 = obj14;
                    r13 = list14;
                }
                listAj = atqq.aj(atqq.aj(atqq.aj(atqq.aj(atqq.aj(atqq.aj(list13, r11), atqq.ap(map4.values())), r13), r2), atqq.ap(map6.values())), list15);
                if (listAj.isEmpty()) {
                    it2 = listAj.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            i = 0;
                        } else if (nwd.g((pky) it2.next())) {
                            i = 1;
                        }
                    }
                } else {
                    i = 0;
                }
                listD = nwd.d(list13);
                listD2 = nwd.d(r11);
                pirVar3.t = plxVar8;
                pirVar3.s = potVar11;
                pirVar3.a = list13;
                pirVar3.b = r11;
                pirVar3.c = map4;
                pirVar3.d = r13;
                pirVar3.e = r2;
                pirVar3.f = map6;
                pirVar3.g = list15;
                pirVar3.h = listAj;
                pirVar3.i = listD;
                pirVar3.j = listD2;
                pirVar3.o = i;
                list16 = list15;
                pirVar3.r = 8;
                objK = r0.k(map4);
                if (objK != awoxVar) {
                    return awoxVar;
                }
                Map map1117 = map4;
                r15 = r2;
                i2 = i;
                obj19 = listD2;
                plxVar9 = plxVar8;
                obj20 = listD;
                obj21 = listAj;
                r3 = r13;
                map8 = map1117;
                obj22 = objK;
                r4 = r11;
                obj23 = list16;
                map9 = (Map) obj22;
                listD3 = nwd.d(r3);
                i3 = i2;
                listD4 = nwd.d(r15);
                pirVar3.t = plxVar9;
                pirVar3.s = potVar11;
                pirVar3.a = list13;
                pirVar3.b = r4;
                pirVar3.c = map8;
                pirVar3.d = r3;
                pirVar3.e = r15;
                pirVar3.f = map6;
                pirVar3.g = obj23;
                pirVar3.h = obj21;
                pirVar3.i = obj20;
                pirVar3.j = obj19;
                pirVar3.k = map9;
                pirVar3.l = listD3;
                pirVar3.m = listD4;
                pirVar3.o = i3;
                pirVar3.r = 9;
                objK2 = k(map6);
                if (objK2 == awoxVar) {
                    return awoxVar;
                }
                map10 = map8;
                pzpVar2 = pzpVar;
                r16 = listD4;
                r14 = obj19;
                list17 = list13;
                i4 = i3;
                r12 = obj20;
                map11 = map6;
                r7 = r3;
                potVar12 = potVar11;
                r17 = map9;
                r10 = obj21;
                r6 = r4;
                obj24 = objK2;
                r8 = r15;
                r18 = listD3;
                r19 = obj23;
                map12 = (Map) obj24;
                pzpVar3 = pzpVar2;
                listD5 = nwd.d(r19);
                if (r10.isEmpty()) {
                    if (1 != i4) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    map13 = map12;
                    pzpVarC = c(plxVar9, potVar12, list17, r6, map10, r7, r8, map11, r19, null, r12, r14, r17, r18, r16, map13, listD5, null, z4);
                } else {
                    map13 = map12;
                    pzpVarC = pzpVar3;
                }
                return new pgz((List) r12, (List) r14, (Map) r17, (List) r18, (Bitmap) atqq.af(r16), map13, (Bitmap) atqq.af(listD5), pzpVarC, SemanticState.Hidden);
            case 4:
                Map map20 = (Map) pirVar4.e;
                obj6 = pirVar4.d;
                list6 = (List) pirVar4.c;
                plbVar4 = (plb) pirVar4.b;
                aidqVar6 = (aidq) pirVar4.a;
                pot potVar15 = pirVar4.s;
                plx plxVar20 = pirVar4.t;
                atqp.j(obj25);
                potVar4 = potVar15;
                plxVar5 = plxVar20;
                map = map20;
                pirVar2 = pirVar4;
                obj5 = obj25;
                obj4 = obj6;
                map2 = map;
                list4 = (List) obj5;
                plxVar2 = plxVar5;
                potVar7 = potVar4;
                list5 = list6;
                aidqVar4 = aidqVar6;
                if (nwa.a(aidqVar4)) {
                    Map map1118 = map2;
                    obj9 = awno.a;
                    list8 = list5;
                    map4 = map1118;
                    potVar9 = potVar7;
                    pirVar4 = pirVar2;
                    obj10 = obj4;
                } else {
                    if (aidqVar4.c == 27) {
                        aidnVar = (aidn) aidqVar4.d;
                    } else {
                        aidnVar = aidn.a;
                    }
                    aidhVar = aidnVar.c;
                    if (aidhVar == null) {
                        aidhVar = aidh.a;
                    }
                    aiegVar5 = aidhVar.c;
                    if (aiegVar5 == null) {
                        aiegVar5 = aieg.a;
                    }
                    List listH13 = atqq.H(aiegVar5);
                    pirVar2.t = plxVar2;
                    pirVar2.s = potVar7;
                    pirVar2.a = aidqVar4;
                    pirVar2.b = plbVar4;
                    pirVar2.c = list5;
                    pirVar2.d = obj4;
                    pirVar2.e = map2;
                    pirVar2.f = list4;
                    pirVar2.r = 5;
                    pirVar4 = pirVar2;
                    potVar8 = potVar7;
                    objM = m(plxVar2, listH13, aidqVar4, plbVar4, 5, pirVar4);
                    if (objM == awoxVar) {
                        return awoxVar;
                    }
                    Map map1119 = map2;
                    plxVar6 = plxVar2;
                    obj7 = objM;
                    map3 = map1119;
                    aidqVar7 = aidqVar4;
                    plbVar6 = plbVar4;
                    obj8 = obj4;
                    list7 = list5;
                    Object obj2115 = obj8;
                    aidqVar4 = aidqVar7;
                    obj10 = obj2115;
                    plx plxVar111 = plxVar6;
                    obj9 = (List) obj7;
                    plxVar2 = plxVar111;
                    map4 = map3;
                    list8 = list7;
                    plbVar4 = plbVar6;
                    potVar9 = potVar8;
                }
                list9 = list4;
                if (nwa.a(aidqVar4)) {
                    map6 = awnp.a;
                    obj14 = obj10;
                    list13 = list8;
                    potVar11 = potVar9;
                    pirVar3 = pirVar4;
                    list14 = list9;
                } else {
                    pirVar4.t = plxVar2;
                    pirVar4.s = potVar9;
                    pirVar4.a = aidqVar4;
                    pirVar4.b = plbVar4;
                    pirVar4.c = list8;
                    pirVar4.d = obj10;
                    pirVar4.e = map4;
                    pirVar4.f = list9;
                    pirVar4.g = obj9;
                    pirVar4.r = 6;
                    if (aidqVar4.c == 27) {
                        aidnVar2 = (aidn) aidqVar4.d;
                    } else {
                        aidnVar2 = aidn.a;
                    }
                    aiie aiieVar12 = aidnVar2.d;
                    aiieVar12.getClass();
                    arrayList = new ArrayList();
                    while (r7.hasNext()) {
                        aidkVar = (aidk) obj27;
                        Object obj2116 = obj10;
                        if (aidkVar.b == 2) {
                            aidiVar2 = (aidi) aidkVar.c;
                        } else {
                            aidiVar2 = aidi.a;
                        }
                        aiegVar7 = aidiVar2.b;
                        if (aiegVar7 == null) {
                            aiegVar7 = aieg.a;
                        }
                        aiegVar7.getClass();
                        if (nwd.h(aiegVar7)) {
                            arrayList.add(obj27);
                        }
                        obj10 = obj2116;
                    }
                    obj11 = obj10;
                    arrayList2 = new ArrayList(atqq.N(arrayList, 10));
                    while (r7.hasNext()) {
                        if (aidkVar2.b == 2) {
                            aidiVar = (aidi) aidkVar2.c;
                        } else {
                            aidiVar = aidi.a;
                        }
                        aiegVar6 = aidiVar.b;
                        if (aiegVar6 == null) {
                            aiegVar6 = aieg.a;
                        }
                        arrayList2.add(aiegVar6);
                    }
                    aidqVar8 = aidqVar4;
                    potVar10 = potVar9;
                    pirVar3 = pirVar4;
                    plbVar7 = plbVar4;
                    list10 = list8;
                    objR2 = r(plxVar2, atqq.ah(arrayList2), -1, -1, nwd.i(aidqVar4), plbVar7, 6, pirVar3);
                    if (objR2 != awoxVar) {
                        return awoxVar;
                    }
                    plxVar7 = plxVar2;
                    obj12 = objR2;
                    plbVar8 = plbVar7;
                    list11 = list9;
                    list12 = list10;
                    map5 = map4;
                    obj13 = obj11;
                    list14 = list11;
                    map4 = map5;
                    aidqVar4 = aidqVar8;
                    potVar11 = potVar10;
                    obj14 = obj13;
                    list13 = list12;
                    plbVar4 = plbVar8;
                    map6 = (Map) obj12;
                    plxVar2 = plxVar7;
                }
                if (nwd.f(aidqVar4)) {
                    if (aidqVar4.c == 27) {
                        aidnVar3 = (aidn) aidqVar4.d;
                    } else {
                        aidnVar3 = aidn.a;
                    }
                    aidmVar = aidnVar3.e;
                    if (aidmVar == null) {
                        aidmVar = aidm.a;
                    }
                    aiegVar8 = aidmVar.d;
                    if (aiegVar8 == null) {
                        aiegVar8 = aieg.a;
                    }
                    List listH14 = atqq.H(aiegVar8);
                    pirVar3.t = plxVar2;
                    pirVar3.s = potVar11;
                    pirVar3.a = list13;
                    pirVar3.b = obj14;
                    pirVar3.c = map4;
                    pirVar3.d = list14;
                    pirVar3.e = obj9;
                    pirVar3.f = map6;
                    pirVar3.g = null;
                    pirVar3.r = 7;
                    pzpVar = null;
                    r1 = this;
                    objM2 = r1.m(plxVar2, listH14, aidqVar4, plbVar4, 7, pirVar3);
                    if (objM2 == awoxVar) {
                        return awoxVar;
                    }
                    Object obj2117 = obj9;
                    plxVar8 = plxVar2;
                    obj15 = objM2;
                    obj16 = obj2117;
                    obj17 = obj14;
                    obj18 = list14;
                    map7 = map4;
                    r5 = r1;
                    list15 = (List) obj15;
                    r13 = obj18;
                    map4 = map7;
                    r11 = obj17;
                    r0 = r5;
                    r2 = obj16;
                } else {
                    r0 = this;
                    pzpVar = null;
                    Object obj37 = obj9;
                    plxVar8 = plxVar2;
                    list15 = awno.a;
                    r2 = obj37;
                    r11 = obj14;
                    r13 = list14;
                }
                listAj = atqq.aj(atqq.aj(atqq.aj(atqq.aj(atqq.aj(atqq.aj(list13, r11), atqq.ap(map4.values())), r13), r2), atqq.ap(map6.values())), list15);
                if (listAj.isEmpty()) {
                    it2 = listAj.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            i = 0;
                        } else if (nwd.g((pky) it2.next())) {
                            i = 1;
                        }
                    }
                } else {
                    i = 0;
                }
                listD = nwd.d(list13);
                listD2 = nwd.d(r11);
                pirVar3.t = plxVar8;
                pirVar3.s = potVar11;
                pirVar3.a = list13;
                pirVar3.b = r11;
                pirVar3.c = map4;
                pirVar3.d = r13;
                pirVar3.e = r2;
                pirVar3.f = map6;
                pirVar3.g = list15;
                pirVar3.h = listAj;
                pirVar3.i = listD;
                pirVar3.j = listD2;
                pirVar3.o = i;
                list16 = list15;
                pirVar3.r = 8;
                objK = r0.k(map4);
                if (objK != awoxVar) {
                    return awoxVar;
                }
                Map map11110 = map4;
                r15 = r2;
                i2 = i;
                obj19 = listD2;
                plxVar9 = plxVar8;
                obj20 = listD;
                obj21 = listAj;
                r3 = r13;
                map8 = map11110;
                obj22 = objK;
                r4 = r11;
                obj23 = list16;
                map9 = (Map) obj22;
                listD3 = nwd.d(r3);
                i3 = i2;
                listD4 = nwd.d(r15);
                pirVar3.t = plxVar9;
                pirVar3.s = potVar11;
                pirVar3.a = list13;
                pirVar3.b = r4;
                pirVar3.c = map8;
                pirVar3.d = r3;
                pirVar3.e = r15;
                pirVar3.f = map6;
                pirVar3.g = obj23;
                pirVar3.h = obj21;
                pirVar3.i = obj20;
                pirVar3.j = obj19;
                pirVar3.k = map9;
                pirVar3.l = listD3;
                pirVar3.m = listD4;
                pirVar3.o = i3;
                pirVar3.r = 9;
                objK2 = k(map6);
                if (objK2 == awoxVar) {
                    return awoxVar;
                }
                map10 = map8;
                pzpVar2 = pzpVar;
                r16 = listD4;
                r14 = obj19;
                list17 = list13;
                i4 = i3;
                r12 = obj20;
                map11 = map6;
                r7 = r3;
                potVar12 = potVar11;
                r17 = map9;
                r10 = obj21;
                r6 = r4;
                obj24 = objK2;
                r8 = r15;
                r18 = listD3;
                r19 = obj23;
                map12 = (Map) obj24;
                pzpVar3 = pzpVar2;
                listD5 = nwd.d(r19);
                if (r10.isEmpty()) {
                    if (1 != i4) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    map13 = map12;
                    pzpVarC = c(plxVar9, potVar12, list17, r6, map10, r7, r8, map11, r19, null, r12, r14, r17, r18, r16, map13, listD5, null, z4);
                } else {
                    map13 = map12;
                    pzpVarC = pzpVar3;
                }
                return new pgz((List) r12, (List) r14, (Map) r17, (List) r18, (Bitmap) atqq.af(r16), map13, (Bitmap) atqq.af(listD5), pzpVarC, SemanticState.Hidden);
            case 5:
                List list20 = (List) pirVar4.f;
                map3 = (Map) pirVar4.e;
                obj8 = pirVar4.d;
                list7 = (List) pirVar4.c;
                plbVar6 = (plb) pirVar4.b;
                aidq aidqVar14 = (aidq) pirVar4.a;
                potVar8 = pirVar4.s;
                plxVar6 = pirVar4.t;
                atqp.j(obj25);
                aidqVar7 = aidqVar14;
                list4 = list20;
                obj7 = obj25;
                Object obj2118 = obj8;
                aidqVar4 = aidqVar7;
                obj10 = obj2118;
                plx plxVar112 = plxVar6;
                obj9 = (List) obj7;
                plxVar2 = plxVar112;
                map4 = map3;
                list8 = list7;
                plbVar4 = plbVar6;
                potVar9 = potVar8;
                list9 = list4;
                if (nwa.a(aidqVar4)) {
                    map6 = awnp.a;
                    obj14 = obj10;
                    list13 = list8;
                    potVar11 = potVar9;
                    pirVar3 = pirVar4;
                    list14 = list9;
                } else {
                    pirVar4.t = plxVar2;
                    pirVar4.s = potVar9;
                    pirVar4.a = aidqVar4;
                    pirVar4.b = plbVar4;
                    pirVar4.c = list8;
                    pirVar4.d = obj10;
                    pirVar4.e = map4;
                    pirVar4.f = list9;
                    pirVar4.g = obj9;
                    pirVar4.r = 6;
                    if (aidqVar4.c == 27) {
                        aidnVar2 = (aidn) aidqVar4.d;
                    } else {
                        aidnVar2 = aidn.a;
                    }
                    aiie aiieVar13 = aidnVar2.d;
                    aiieVar13.getClass();
                    arrayList = new ArrayList();
                    while (r7.hasNext()) {
                        aidkVar = (aidk) obj27;
                        Object obj2119 = obj10;
                        if (aidkVar.b == 2) {
                            aidiVar2 = (aidi) aidkVar.c;
                        } else {
                            aidiVar2 = aidi.a;
                        }
                        aiegVar7 = aidiVar2.b;
                        if (aiegVar7 == null) {
                            aiegVar7 = aieg.a;
                        }
                        aiegVar7.getClass();
                        if (nwd.h(aiegVar7)) {
                            arrayList.add(obj27);
                        }
                        obj10 = obj2119;
                    }
                    obj11 = obj10;
                    arrayList2 = new ArrayList(atqq.N(arrayList, 10));
                    while (r7.hasNext()) {
                        if (aidkVar2.b == 2) {
                            aidiVar = (aidi) aidkVar2.c;
                        } else {
                            aidiVar = aidi.a;
                        }
                        aiegVar6 = aidiVar.b;
                        if (aiegVar6 == null) {
                            aiegVar6 = aieg.a;
                        }
                        arrayList2.add(aiegVar6);
                    }
                    aidqVar8 = aidqVar4;
                    potVar10 = potVar9;
                    pirVar3 = pirVar4;
                    plbVar7 = plbVar4;
                    list10 = list8;
                    objR2 = r(plxVar2, atqq.ah(arrayList2), -1, -1, nwd.i(aidqVar4), plbVar7, 6, pirVar3);
                    if (objR2 != awoxVar) {
                        return awoxVar;
                    }
                    plxVar7 = plxVar2;
                    obj12 = objR2;
                    plbVar8 = plbVar7;
                    list11 = list9;
                    list12 = list10;
                    map5 = map4;
                    obj13 = obj11;
                    list14 = list11;
                    map4 = map5;
                    aidqVar4 = aidqVar8;
                    potVar11 = potVar10;
                    obj14 = obj13;
                    list13 = list12;
                    plbVar4 = plbVar8;
                    map6 = (Map) obj12;
                    plxVar2 = plxVar7;
                }
                if (nwd.f(aidqVar4)) {
                    if (aidqVar4.c == 27) {
                        aidnVar3 = (aidn) aidqVar4.d;
                    } else {
                        aidnVar3 = aidn.a;
                    }
                    aidmVar = aidnVar3.e;
                    if (aidmVar == null) {
                        aidmVar = aidm.a;
                    }
                    aiegVar8 = aidmVar.d;
                    if (aiegVar8 == null) {
                        aiegVar8 = aieg.a;
                    }
                    List listH15 = atqq.H(aiegVar8);
                    pirVar3.t = plxVar2;
                    pirVar3.s = potVar11;
                    pirVar3.a = list13;
                    pirVar3.b = obj14;
                    pirVar3.c = map4;
                    pirVar3.d = list14;
                    pirVar3.e = obj9;
                    pirVar3.f = map6;
                    pirVar3.g = null;
                    pirVar3.r = 7;
                    pzpVar = null;
                    r1 = this;
                    objM2 = r1.m(plxVar2, listH15, aidqVar4, plbVar4, 7, pirVar3);
                    if (objM2 == awoxVar) {
                        return awoxVar;
                    }
                    Object obj21110 = obj9;
                    plxVar8 = plxVar2;
                    obj15 = objM2;
                    obj16 = obj21110;
                    obj17 = obj14;
                    obj18 = list14;
                    map7 = map4;
                    r5 = r1;
                    list15 = (List) obj15;
                    r13 = obj18;
                    map4 = map7;
                    r11 = obj17;
                    r0 = r5;
                    r2 = obj16;
                } else {
                    r0 = this;
                    pzpVar = null;
                    Object obj38 = obj9;
                    plxVar8 = plxVar2;
                    list15 = awno.a;
                    r2 = obj38;
                    r11 = obj14;
                    r13 = list14;
                }
                listAj = atqq.aj(atqq.aj(atqq.aj(atqq.aj(atqq.aj(atqq.aj(list13, r11), atqq.ap(map4.values())), r13), r2), atqq.ap(map6.values())), list15);
                if (listAj.isEmpty()) {
                    it2 = listAj.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            i = 0;
                        } else if (nwd.g((pky) it2.next())) {
                            i = 1;
                        }
                    }
                } else {
                    i = 0;
                }
                listD = nwd.d(list13);
                listD2 = nwd.d(r11);
                pirVar3.t = plxVar8;
                pirVar3.s = potVar11;
                pirVar3.a = list13;
                pirVar3.b = r11;
                pirVar3.c = map4;
                pirVar3.d = r13;
                pirVar3.e = r2;
                pirVar3.f = map6;
                pirVar3.g = list15;
                pirVar3.h = listAj;
                pirVar3.i = listD;
                pirVar3.j = listD2;
                pirVar3.o = i;
                list16 = list15;
                pirVar3.r = 8;
                objK = r0.k(map4);
                if (objK != awoxVar) {
                    return awoxVar;
                }
                Map map11111 = map4;
                r15 = r2;
                i2 = i;
                obj19 = listD2;
                plxVar9 = plxVar8;
                obj20 = listD;
                obj21 = listAj;
                r3 = r13;
                map8 = map11111;
                obj22 = objK;
                r4 = r11;
                obj23 = list16;
                map9 = (Map) obj22;
                listD3 = nwd.d(r3);
                i3 = i2;
                listD4 = nwd.d(r15);
                pirVar3.t = plxVar9;
                pirVar3.s = potVar11;
                pirVar3.a = list13;
                pirVar3.b = r4;
                pirVar3.c = map8;
                pirVar3.d = r3;
                pirVar3.e = r15;
                pirVar3.f = map6;
                pirVar3.g = obj23;
                pirVar3.h = obj21;
                pirVar3.i = obj20;
                pirVar3.j = obj19;
                pirVar3.k = map9;
                pirVar3.l = listD3;
                pirVar3.m = listD4;
                pirVar3.o = i3;
                pirVar3.r = 9;
                objK2 = k(map6);
                if (objK2 == awoxVar) {
                    return awoxVar;
                }
                map10 = map8;
                pzpVar2 = pzpVar;
                r16 = listD4;
                r14 = obj19;
                list17 = list13;
                i4 = i3;
                r12 = obj20;
                map11 = map6;
                r7 = r3;
                potVar12 = potVar11;
                r17 = map9;
                r10 = obj21;
                r6 = r4;
                obj24 = objK2;
                r8 = r15;
                r18 = listD3;
                r19 = obj23;
                map12 = (Map) obj24;
                pzpVar3 = pzpVar2;
                listD5 = nwd.d(r19);
                if (r10.isEmpty()) {
                    if (1 != i4) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    map13 = map12;
                    pzpVarC = c(plxVar9, potVar12, list17, r6, map10, r7, r8, map11, r19, null, r12, r14, r17, r18, r16, map13, listD5, null, z4);
                } else {
                    map13 = map12;
                    pzpVarC = pzpVar3;
                }
                return new pgz((List) r12, (List) r14, (Map) r17, (List) r18, (Bitmap) atqq.af(r16), map13, (Bitmap) atqq.af(listD5), pzpVarC, SemanticState.Hidden);
            case 6:
                Object obj39 = pirVar4.g;
                List list21 = (List) pirVar4.f;
                map5 = (Map) pirVar4.e;
                obj13 = pirVar4.d;
                list12 = (List) pirVar4.c;
                plbVar8 = (plb) pirVar4.b;
                aidq aidqVar15 = (aidq) pirVar4.a;
                pot potVar16 = pirVar4.s;
                plx plxVar21 = pirVar4.t;
                atqp.j(obj25);
                potVar10 = potVar16;
                plxVar7 = plxVar21;
                obj9 = obj39;
                aidqVar8 = aidqVar15;
                obj12 = obj25;
                pirVar3 = pirVar4;
                list11 = list21;
                list14 = list11;
                map4 = map5;
                aidqVar4 = aidqVar8;
                potVar11 = potVar10;
                obj14 = obj13;
                list13 = list12;
                plbVar4 = plbVar8;
                map6 = (Map) obj12;
                plxVar2 = plxVar7;
                if (nwd.f(aidqVar4)) {
                    if (aidqVar4.c == 27) {
                        aidnVar3 = (aidn) aidqVar4.d;
                    } else {
                        aidnVar3 = aidn.a;
                    }
                    aidmVar = aidnVar3.e;
                    if (aidmVar == null) {
                        aidmVar = aidm.a;
                    }
                    aiegVar8 = aidmVar.d;
                    if (aiegVar8 == null) {
                        aiegVar8 = aieg.a;
                    }
                    List listH16 = atqq.H(aiegVar8);
                    pirVar3.t = plxVar2;
                    pirVar3.s = potVar11;
                    pirVar3.a = list13;
                    pirVar3.b = obj14;
                    pirVar3.c = map4;
                    pirVar3.d = list14;
                    pirVar3.e = obj9;
                    pirVar3.f = map6;
                    pirVar3.g = null;
                    pirVar3.r = 7;
                    pzpVar = null;
                    r1 = this;
                    objM2 = r1.m(plxVar2, listH16, aidqVar4, plbVar4, 7, pirVar3);
                    if (objM2 == awoxVar) {
                        return awoxVar;
                    }
                    Object obj21111 = obj9;
                    plxVar8 = plxVar2;
                    obj15 = objM2;
                    obj16 = obj21111;
                    obj17 = obj14;
                    obj18 = list14;
                    map7 = map4;
                    r5 = r1;
                    list15 = (List) obj15;
                    r13 = obj18;
                    map4 = map7;
                    r11 = obj17;
                    r0 = r5;
                    r2 = obj16;
                } else {
                    r0 = this;
                    pzpVar = null;
                    Object obj310 = obj9;
                    plxVar8 = plxVar2;
                    list15 = awno.a;
                    r2 = obj310;
                    r11 = obj14;
                    r13 = list14;
                }
                listAj = atqq.aj(atqq.aj(atqq.aj(atqq.aj(atqq.aj(atqq.aj(list13, r11), atqq.ap(map4.values())), r13), r2), atqq.ap(map6.values())), list15);
                if (listAj.isEmpty()) {
                    it2 = listAj.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            i = 0;
                        } else if (nwd.g((pky) it2.next())) {
                            i = 1;
                        }
                    }
                } else {
                    i = 0;
                }
                listD = nwd.d(list13);
                listD2 = nwd.d(r11);
                pirVar3.t = plxVar8;
                pirVar3.s = potVar11;
                pirVar3.a = list13;
                pirVar3.b = r11;
                pirVar3.c = map4;
                pirVar3.d = r13;
                pirVar3.e = r2;
                pirVar3.f = map6;
                pirVar3.g = list15;
                pirVar3.h = listAj;
                pirVar3.i = listD;
                pirVar3.j = listD2;
                pirVar3.o = i;
                list16 = list15;
                pirVar3.r = 8;
                objK = r0.k(map4);
                if (objK != awoxVar) {
                    return awoxVar;
                }
                Map map11112 = map4;
                r15 = r2;
                i2 = i;
                obj19 = listD2;
                plxVar9 = plxVar8;
                obj20 = listD;
                obj21 = listAj;
                r3 = r13;
                map8 = map11112;
                obj22 = objK;
                r4 = r11;
                obj23 = list16;
                map9 = (Map) obj22;
                listD3 = nwd.d(r3);
                i3 = i2;
                listD4 = nwd.d(r15);
                pirVar3.t = plxVar9;
                pirVar3.s = potVar11;
                pirVar3.a = list13;
                pirVar3.b = r4;
                pirVar3.c = map8;
                pirVar3.d = r3;
                pirVar3.e = r15;
                pirVar3.f = map6;
                pirVar3.g = obj23;
                pirVar3.h = obj21;
                pirVar3.i = obj20;
                pirVar3.j = obj19;
                pirVar3.k = map9;
                pirVar3.l = listD3;
                pirVar3.m = listD4;
                pirVar3.o = i3;
                pirVar3.r = 9;
                objK2 = k(map6);
                if (objK2 == awoxVar) {
                    return awoxVar;
                }
                map10 = map8;
                pzpVar2 = pzpVar;
                r16 = listD4;
                r14 = obj19;
                list17 = list13;
                i4 = i3;
                r12 = obj20;
                map11 = map6;
                r7 = r3;
                potVar12 = potVar11;
                r17 = map9;
                r10 = obj21;
                r6 = r4;
                obj24 = objK2;
                r8 = r15;
                r18 = listD3;
                r19 = obj23;
                map12 = (Map) obj24;
                pzpVar3 = pzpVar2;
                listD5 = nwd.d(r19);
                if (r10.isEmpty()) {
                    if (1 != i4) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    map13 = map12;
                    pzpVarC = c(plxVar9, potVar12, list17, r6, map10, r7, r8, map11, r19, null, r12, r14, r17, r18, r16, map13, listD5, null, z4);
                } else {
                    map13 = map12;
                    pzpVarC = pzpVar3;
                }
                return new pgz((List) r12, (List) r14, (Map) r17, (List) r18, (Bitmap) atqq.af(r16), map13, (Bitmap) atqq.af(listD5), pzpVarC, SemanticState.Hidden);
            case 7:
                Map map21 = (Map) pirVar4.f;
                List list22 = (List) pirVar4.e;
                Object obj40 = pirVar4.d;
                map7 = (Map) pirVar4.c;
                List list23 = (List) pirVar4.b;
                List list24 = (List) pirVar4.a;
                pot potVar17 = pirVar4.s;
                plxVar8 = pirVar4.t;
                atqp.j(obj25);
                list13 = list24;
                potVar11 = potVar17;
                pzpVar = null;
                map6 = map21;
                pirVar3 = pirVar4;
                obj15 = obj25;
                r5 = r9;
                obj16 = list22;
                obj18 = obj40;
                obj17 = list23;
                list15 = (List) obj15;
                r13 = obj18;
                map4 = map7;
                r11 = obj17;
                r0 = r5;
                r2 = obj16;
                listAj = atqq.aj(atqq.aj(atqq.aj(atqq.aj(atqq.aj(atqq.aj(list13, r11), atqq.ap(map4.values())), r13), r2), atqq.ap(map6.values())), list15);
                if (listAj.isEmpty()) {
                    it2 = listAj.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            i = 0;
                        } else if (nwd.g((pky) it2.next())) {
                            i = 1;
                        }
                    }
                } else {
                    i = 0;
                }
                listD = nwd.d(list13);
                listD2 = nwd.d(r11);
                pirVar3.t = plxVar8;
                pirVar3.s = potVar11;
                pirVar3.a = list13;
                pirVar3.b = r11;
                pirVar3.c = map4;
                pirVar3.d = r13;
                pirVar3.e = r2;
                pirVar3.f = map6;
                pirVar3.g = list15;
                pirVar3.h = listAj;
                pirVar3.i = listD;
                pirVar3.j = listD2;
                pirVar3.o = i;
                list16 = list15;
                pirVar3.r = 8;
                objK = r0.k(map4);
                if (objK != awoxVar) {
                    return awoxVar;
                }
                Map map11113 = map4;
                r15 = r2;
                i2 = i;
                obj19 = listD2;
                plxVar9 = plxVar8;
                obj20 = listD;
                obj21 = listAj;
                r3 = r13;
                map8 = map11113;
                obj22 = objK;
                r4 = r11;
                obj23 = list16;
                map9 = (Map) obj22;
                listD3 = nwd.d(r3);
                i3 = i2;
                listD4 = nwd.d(r15);
                pirVar3.t = plxVar9;
                pirVar3.s = potVar11;
                pirVar3.a = list13;
                pirVar3.b = r4;
                pirVar3.c = map8;
                pirVar3.d = r3;
                pirVar3.e = r15;
                pirVar3.f = map6;
                pirVar3.g = obj23;
                pirVar3.h = obj21;
                pirVar3.i = obj20;
                pirVar3.j = obj19;
                pirVar3.k = map9;
                pirVar3.l = listD3;
                pirVar3.m = listD4;
                pirVar3.o = i3;
                pirVar3.r = 9;
                objK2 = k(map6);
                if (objK2 == awoxVar) {
                    return awoxVar;
                }
                map10 = map8;
                pzpVar2 = pzpVar;
                r16 = listD4;
                r14 = obj19;
                list17 = list13;
                i4 = i3;
                r12 = obj20;
                map11 = map6;
                r7 = r3;
                potVar12 = potVar11;
                r17 = map9;
                r10 = obj21;
                r6 = r4;
                obj24 = objK2;
                r8 = r15;
                r18 = listD3;
                r19 = obj23;
                map12 = (Map) obj24;
                pzpVar3 = pzpVar2;
                listD5 = nwd.d(r19);
                if (r10.isEmpty()) {
                    if (1 != i4) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    map13 = map12;
                    pzpVarC = c(plxVar9, potVar12, list17, r6, map10, r7, r8, map11, r19, null, r12, r14, r17, r18, r16, map13, listD5, null, z4);
                } else {
                    map13 = map12;
                    pzpVarC = pzpVar3;
                }
                return new pgz((List) r12, (List) r14, (Map) r17, (List) r18, (Bitmap) atqq.af(r16), map13, (Bitmap) atqq.af(listD5), pzpVarC, SemanticState.Hidden);
            case 8:
                int i6 = pirVar4.o;
                Object obj41 = pirVar4.j;
                Object obj42 = pirVar4.i;
                Object obj43 = pirVar4.h;
                Object obj44 = pirVar4.g;
                map6 = (Map) pirVar4.f;
                List list25 = (List) pirVar4.e;
                Object obj45 = pirVar4.d;
                Map map22 = (Map) pirVar4.c;
                List list26 = (List) pirVar4.b;
                List list27 = (List) pirVar4.a;
                potVar11 = pirVar4.s;
                plx plxVar22 = pirVar4.t;
                atqp.j(obj25);
                i2 = i6;
                r4 = list26;
                list13 = list27;
                map8 = map22;
                obj23 = obj44;
                obj21 = obj43;
                obj19 = obj41;
                obj20 = obj42;
                r3 = obj45;
                pirVar3 = pirVar4;
                plxVar9 = plxVar22;
                r15 = list25;
                obj22 = obj25;
                pzpVar = null;
                map9 = (Map) obj22;
                listD3 = nwd.d(r3);
                i3 = i2;
                listD4 = nwd.d(r15);
                pirVar3.t = plxVar9;
                pirVar3.s = potVar11;
                pirVar3.a = list13;
                pirVar3.b = r4;
                pirVar3.c = map8;
                pirVar3.d = r3;
                pirVar3.e = r15;
                pirVar3.f = map6;
                pirVar3.g = obj23;
                pirVar3.h = obj21;
                pirVar3.i = obj20;
                pirVar3.j = obj19;
                pirVar3.k = map9;
                pirVar3.l = listD3;
                pirVar3.m = listD4;
                pirVar3.o = i3;
                pirVar3.r = 9;
                objK2 = k(map6);
                if (objK2 == awoxVar) {
                    return awoxVar;
                }
                map10 = map8;
                pzpVar2 = pzpVar;
                r16 = listD4;
                r14 = obj19;
                list17 = list13;
                i4 = i3;
                r12 = obj20;
                map11 = map6;
                r7 = r3;
                potVar12 = potVar11;
                r17 = map9;
                r10 = obj21;
                r6 = r4;
                obj24 = objK2;
                r8 = r15;
                r18 = listD3;
                r19 = obj23;
                map12 = (Map) obj24;
                pzpVar3 = pzpVar2;
                listD5 = nwd.d(r19);
                if (r10.isEmpty()) {
                    if (1 != i4) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    map13 = map12;
                    pzpVarC = c(plxVar9, potVar12, list17, r6, map10, r7, r8, map11, r19, null, r12, r14, r17, r18, r16, map13, listD5, null, z4);
                } else {
                    map13 = map12;
                    pzpVarC = pzpVar3;
                }
                return new pgz((List) r12, (List) r14, (Map) r17, (List) r18, (Bitmap) atqq.af(r16), map13, (Bitmap) atqq.af(listD5), pzpVarC, SemanticState.Hidden);
            case 9:
                i4 = pirVar4.o;
                Object obj46 = pirVar4.m;
                Object obj47 = pirVar4.l;
                Object obj48 = pirVar4.k;
                Object obj49 = pirVar4.j;
                Object obj50 = pirVar4.i;
                Object obj51 = pirVar4.h;
                Object obj52 = pirVar4.g;
                Map map23 = (Map) pirVar4.f;
                List list28 = (List) pirVar4.e;
                Object obj53 = pirVar4.d;
                Map map24 = (Map) pirVar4.c;
                List list29 = (List) pirVar4.b;
                List list30 = (List) pirVar4.a;
                pot potVar18 = pirVar4.s;
                plxVar9 = pirVar4.t;
                atqp.j(obj25);
                r18 = obj47;
                r6 = list29;
                r12 = obj50;
                map11 = map23;
                r16 = obj46;
                map10 = map24;
                list17 = list30;
                r14 = obj49;
                r8 = list28;
                r17 = obj48;
                r7 = obj53;
                potVar12 = potVar18;
                obj24 = obj25;
                pzpVar2 = null;
                r10 = obj51;
                r19 = obj52;
                map12 = (Map) obj24;
                pzpVar3 = pzpVar2;
                listD5 = nwd.d(r19);
                if (r10.isEmpty()) {
                    if (1 != i4) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    map13 = map12;
                    pzpVarC = c(plxVar9, potVar12, list17, r6, map10, r7, r8, map11, r19, null, r12, r14, r17, r18, r16, map13, listD5, null, z4);
                } else {
                    map13 = map12;
                    pzpVarC = pzpVar3;
                }
                return new pgz((List) r12, (List) r14, (Map) r17, (List) r18, (Bitmap) atqq.af(r16), map13, (Bitmap) atqq.af(listD5), pzpVarC, SemanticState.Hidden);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final List f(awut awutVar, pig pigVar, aidq aidqVar) {
        aiie aiieVar = aidqVar.g;
        aiieVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : aiieVar) {
            aieg aiegVar = (aieg) obj;
            aiegVar.getClass();
            if (nwd.h(aiegVar)) {
                arrayList.add(obj);
            }
        }
        List<aieg> listAn = atqq.an(arrayList, 4);
        if (listAn.isEmpty()) {
            return awno.a;
        }
        ArrayList arrayList2 = new ArrayList(atqq.N(listAn, 10));
        for (aieg aiegVar2 : listAn) {
            aiegVar2.getClass();
            int i = pigVar.d;
            pit pitVar = this;
            arrayList2.add(pitVar.n(awutVar, pigVar, aiegVar2, i, i, 1));
            this = pitVar;
        }
        return arrayList2;
    }

    public final awml g(aidg aidgVar, boolean z) {
        float f;
        int dimension;
        Resources resources = this.b.getResources();
        int dimension2 = z ? 0 : (int) resources.getDimension(R.dimen.notifications_bigpicture_width);
        if (z) {
            dimension = (int) resources.getDimension(R.dimen.notifications_side_by_side_expanded_image_height);
        } else {
            aidf aidfVar = aidgVar.h;
            if (aidfVar == null) {
                aidfVar = aidf.a;
            }
            if ((aidfVar.b == 1 ? (aidd) aidfVar.c : aidd.a).b == 0.0f) {
                f = 2.0f;
            } else {
                aidf aidfVar2 = aidgVar.h;
                if (aidfVar2 == null) {
                    aidfVar2 = aidf.a;
                }
                f = (aidfVar2.b == 1 ? (aidd) aidfVar2.c : aidd.a).b;
            }
            dimension = (int) (dimension2 / f);
        }
        return new awml(Integer.valueOf(dimension2), Integer.valueOf(dimension));
    }

    public final boolean h(String str, boolean z) {
        if (a.aO() && auuw.a.io().k() && !z) {
            Uri uri = Uri.parse(str);
            uri.getClass();
            if (!awrc.c(uri.getScheme(), "android.resource") && ((ijt) this.j.io()).g(str)) {
                return true;
            }
        }
        return false;
    }

    public final Object k(Map map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            aieg aiegVar = (aieg) entry.getKey();
            awml awmlVar = null;
            try {
                File file = (File) ((pky) entry.getValue()).d();
                if (file == null) {
                    ((agsj) a.c()).t("Failed to get file for image.");
                } else {
                    Context context = this.b;
                    awmlVar = new awml(aiegVar, avh.a(context, context.getPackageName() + ".chime_sdk_file_provider", file));
                }
            } catch (Exception e2) {
                ((agsj) ((agsj) a.c()).j(e2)).t("Failed to get Uri for file.");
            }
            if (awmlVar != null) {
                arrayList.add(awmlVar);
            }
        }
        return atqq.C(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object l(plx plxVar, String str, int i, int i2, boolean z, plb plbVar, int i3, awoq awoqVar) throws Throwable {
        pin pinVar;
        int i4;
        String str2;
        if (awoqVar instanceof pin) {
            pinVar = (pin) awoqVar;
            int i5 = pinVar.c;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                pinVar.c = i5 - Integer.MIN_VALUE;
            } else {
                pinVar = new pin(this, awoqVar);
            }
        } else {
            pinVar = new pin(this, awoqVar);
        }
        pin pinVar2 = pinVar;
        Object objJ = pinVar2.a;
        awox awoxVar = awox.a;
        int i6 = pinVar2.c;
        if (i6 == 0) {
            atqp.j(objJ);
            pij pijVar = new pij(this, plxVar, str, i, i2, null, 2, null);
            pinVar2.d = str;
            i4 = i3;
            pinVar2.e = i4;
            pinVar2.c = 1;
            objJ = j(z, plbVar, pijVar, pinVar2);
            if (objJ == awoxVar) {
                return awoxVar;
            }
            str2 = str;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4 = pinVar2.e;
            str2 = pinVar2.d;
            atqp.j(objJ);
        }
        pky pkyVar = (pky) objJ;
        String packageName = this.b.getPackageName();
        packageName.getClass();
        String str3 = str2;
        p(packageName, str3, i4, pkyVar.i(), "BITMAP");
        return pkyVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object m(plx plxVar, List list, aidq aidqVar, plb plbVar, int i, awoq awoqVar) throws Throwable {
        piq piqVar;
        if (awoqVar instanceof piq) {
            piqVar = (piq) awoqVar;
            int i2 = piqVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                piqVar.c = i2 - Integer.MIN_VALUE;
            } else {
                piqVar = new piq(this, awoqVar);
            }
        } else {
            piqVar = new piq(this, awoqVar);
        }
        piq piqVar2 = piqVar;
        Object objS = piqVar2.a;
        Object obj = awox.a;
        int i3 = piqVar2.c;
        if (i3 == 0) {
            atqp.j(objS);
            int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(R.dimen.notifications_icon_size);
            boolean zI = nwd.i(aidqVar);
            piqVar2.c = 1;
            objS = s(plxVar, list, dimensionPixelSize, dimensionPixelSize, zI, plbVar, i, piqVar2);
            if (objS == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objS);
        }
        return (List) objS;
    }

    public final awuz n(awut awutVar, pig pigVar, aieg aiegVar, int i, int i2, int i3) throws Throwable {
        String str = aiegVar.d;
        if (str.length() == 0) {
            str = aiegVar.b;
        }
        String str2 = str;
        str2.getClass();
        pih pihVarA = nwh.a(str2, i, i2, ((ijt) this.j.io()).g(str2));
        Map map = pigVar.e;
        awuz awuzVar = (awuz) map.get(pihVarA);
        if (awuzVar != null) {
            t(str2, i3, "BITMAP");
            return awuzVar;
        }
        Object objR = map.get(pihVarA);
        if (objR == null) {
            objR = awro.r(awutVar, awov.a, 1, new pii(this, pigVar, str2, i, i2, i3, null, 1, null));
            map.put(pihVarA, objR);
        }
        return (awuz) objR;
    }

    public final awuz o(awut awutVar, pig pigVar, aieg aiegVar, int i, int i2, int i3) throws Throwable {
        String str = aiegVar.d;
        if (str.length() == 0) {
            str = aiegVar.b;
        }
        String str2 = str;
        str2.getClass();
        pih pihVarA = nwh.a(str2, i, i2, ((ijt) this.j.io()).g(str2));
        Map map = pigVar.f;
        awuz awuzVar = (awuz) map.get(pihVarA);
        if (awuzVar != null) {
            t(str2, i3, "FILE");
            return awuzVar;
        }
        Object objR = map.get(pihVarA);
        if (objR == null) {
            objR = awro.r(awutVar, awov.a, 1, new pii(this, pigVar, str2, i3, i, i2, null, 0));
            map.put(pihVarA, objR);
        }
        return (awuz) objR;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [agfr, java.lang.Object] */
    public final void p(String str, String str2, int i, boolean z, String str3) {
        pwf pwfVar = (pwf) this.h.io();
        String strQ = q(str2);
        if (i == 0) {
            throw null;
        }
        ((qtf) pwfVar.x.io()).b(1L, str, this.f.a, strQ, nvw.a(i), Boolean.valueOf(z), str3);
    }
}
