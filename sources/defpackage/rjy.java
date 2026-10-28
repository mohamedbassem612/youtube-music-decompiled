package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Optional;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rjy implements tae {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rjy(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, wbz] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, zws] */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r1v66, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r1v77, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v87, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r1v89, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.lang.Object, wbz] */
    /* JADX WARN: Type inference failed for: r2v55, types: [java.lang.Object, zvv] */
    /* JADX WARN: Type inference failed for: r2v91, types: [abvz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r4v38, types: [java.lang.Object, sxu] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, sxu] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.tae, defpackage.twi
    public final void a(Object obj) {
        ajwo ajwoVarB;
        ajwo ajwoVar;
        int i = 10;
        int i2 = 5;
        int i3 = 8;
        int i4 = 2;
        apbl apblVar = null;
        ameh amehVar = null;
        apblVar = null;
        switch (this.$cid) {
            case 0:
                ovo ovoVar = (ovo) obj;
                rjz rjzVar = (rjz) this.a;
                rjx rjxVar = rjzVar.a;
                if (rjxVar != null) {
                    Object obj2 = this.b;
                    Queue queue = (Queue) Map.EL.computeIfAbsent(rjzVar.c, obj2, new ris(i3));
                    for (String str : ovoVar.j()) {
                        Object obj3 = this.c;
                        queue.add(str);
                        rjzVar.b.put(str, obj3);
                    }
                    String str2 = (String) obj2;
                    rjxVar.a(str2, true == queue.isEmpty() ? 1 : 2);
                    rjxVar.b(str2, ovoVar);
                }
                break;
            case 1:
                Uri uri = (Uri) obj;
                ArrayList arrayList = new ArrayList();
                Object obj4 = this.a;
                if (uri == null) {
                    ajwoVarB = fhz.P(((itu) obj4).b.getString(R.string.sideloaded_playlist_create_error));
                } else {
                    itu ituVar = (itu) obj4;
                    ajwoVarB = ituVar.b(ituVar.b.getString(R.string.sideloaded_playlist_created), uri.toString());
                }
                ?? r6 = this.c;
                ?? r0 = this.b;
                arrayList.add(ajwoVarB);
                if (r0.isEmpty()) {
                    r6.b(null, arrayList);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = r0.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((itu) obj4).a((String) it.next(), uri.toString()));
                    }
                    ahud ahudVarAu = ahno.au(arrayList2);
                    itc itcVar = new itc((Object) r6, arrayList, i4);
                    Executor executor = ((itu) obj4).d;
                    taf.h(ahudVarAu.k(itcVar, executor), executor, new ijj(r6, i));
                }
                break;
            case 2:
                apji apjiVar = ((alzk) obj).c;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(ajqs.a);
                apjiVar.c(aihlVarCheckIsLite);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                ajqr ajqrVar = (ajqr) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                int iBc = a.bc(ajqrVar.b);
                if (iBc == 0) {
                    iBc = 1;
                }
                Object obj5 = this.b;
                int i5 = iBc - 1;
                if (i5 == 1) {
                    ((avpr) obj5).a();
                } else if (i5 == 2 || i5 == 3 || i5 == 4) {
                    String str3 = ((ajss) this.c).e;
                    alay alayVar = ajqrVar.c;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                    if (alayVar != null) {
                        rkr rkrVar = (rkr) this.a;
                        wby wbyVarB = rkrVar.b.e(rkrVar.c.e());
                        ajpu ajpuVarD = rlh.d(str3, wbyVarB);
                        aihf aihfVar = ajpuVarD.a;
                        aihfVar.copyOnWrite();
                        ajpx ajpxVar = (ajpx) aihfVar.instance;
                        ajpx ajpxVar2 = ajpx.a;
                        ajpxVar.q = alayVar;
                        ajpxVar.c |= SemanticState.Multiline;
                        wer werVarE = wbyVarB.e();
                        werVarE.m(ajpuVarD);
                        werVarE.b().D();
                    }
                    ((avpr) obj5).b(new RuntimeException("Validation Error"));
                } else {
                    ((avpr) obj5).b(new RuntimeException("Valdation Unknown Error"));
                }
                break;
            case 3:
                apji apjiVar2 = ((alzk) obj).c;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(alcs.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK2 = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                Object objC = objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2);
                Object obj6 = this.b;
                alcr alcrVar = (alcr) objC;
                if ((alcrVar.b & 1) != 0) {
                    String str4 = ((alcq) this.c).d;
                    String str5 = alcrVar.c;
                    if (!ahno.aa(str5)) {
                        rku rkuVar = (rku) this.a;
                        wby wbyVarB2 = rkuVar.b.e(rkuVar.c.e());
                        ajpu ajpuVarD2 = rlh.d(str4, wbyVarB2);
                        aihf aihfVar2 = ajpuVarD2.a;
                        aihfVar2.copyOnWrite();
                        ajpx ajpxVar3 = (ajpx) aihfVar2.instance;
                        ajpx ajpxVar4 = ajpx.a;
                        str5.getClass();
                        ajpxVar3.c |= 262144;
                        ajpxVar3.v = str5;
                        wer werVarE2 = wbyVarB2.e();
                        werVarE2.m(ajpuVarD2);
                        werVarE2.b().D();
                    }
                    ((avpr) obj6).a();
                } else {
                    ((avpr) obj6).b(new RuntimeException("No Handle Generated"));
                }
                break;
            case 4:
                Object obj7 = this.a;
                almo almoVar = (almo) obj;
                lez lezVar = new lez(obj7, this.c, this.b, 19, (short[]) null);
                if ((almoVar.b & 8) != 0) {
                    almn almnVar = almoVar.f;
                    if (almnVar == null) {
                        almnVar = almn.a;
                    }
                    alay alayVar2 = almnVar.c;
                    if (alayVar2 == null) {
                        alayVar2 = alay.a;
                    }
                    abzi abziVar = (abzi) obj7;
                    abziVar.d.d(ackj.k(null, alayVar2, null, false).toString());
                    if (almoVar.g.size() > 0) {
                        abziVar.f.b(almoVar.g);
                    }
                } else {
                    if (almoVar.g.size() > 0) {
                        ((abzi) obj7).f.b(almoVar.g);
                    }
                    aihf aihfVarCreateBuilder = arrb.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    arrb arrbVar = (arrb) aihfVarCreateBuilder.instance;
                    arrbVar.c = 1;
                    arrbVar.b |= 1;
                    abzi abziVar2 = (abzi) obj7;
                    xeu xeuVar = (xeu) abziVar2.g;
                    if (xeuVar.b) {
                        xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.ZERO_STEP_CHANNEL_CREATED);
                        ztf ztfVar = xffVarA.k.e;
                        xffVarA.l = ztfVar.a();
                        ztfVar.k(xffVarA);
                    } else {
                        alos alosVar = (alos) alou.a.createBuilder();
                        alosVar.copyOnWrite();
                        alou alouVar = (alou) alosVar.instance;
                        arrb arrbVar2 = (arrb) aihfVarCreateBuilder.build();
                        arrbVar2.getClass();
                        alouVar.d = arrbVar2;
                        alouVar.c = 31;
                        xeuVar.b((alou) alosVar.build());
                    }
                    lezVar.run();
                    rkp rkpVar = new rkp(true);
                    if (((vxz) abziVar2.j).k(45821617L, false)) {
                        ((omj) abziVar2.c).O(rkpVar);
                    } else {
                        ((tbt) abziVar2.i).c(rkpVar);
                    }
                }
                break;
            case 5:
                almo almoVar2 = (almo) obj;
                int i6 = almoVar2.b & 8;
                Object obj8 = this.a;
                if (i6 != 0) {
                    almn almnVar2 = almoVar2.f;
                    if (almnVar2 == null) {
                        almnVar2 = almn.a;
                    }
                    alay alayVar3 = almnVar2.c;
                    if (alayVar3 == null) {
                        alayVar3 = alay.a;
                    }
                    ((abzi) obj8).d.d(ackj.k(null, alayVar3, null, false).toString());
                } else {
                    aihf aihfVarCreateBuilder2 = arrb.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    arrb arrbVar3 = (arrb) aihfVarCreateBuilder2.instance;
                    arrbVar3.c = 3;
                    arrbVar3.b |= 1;
                    abzi abziVar3 = (abzi) obj8;
                    xeu xeuVar2 = (xeu) abziVar3.g;
                    if (xeuVar2.b) {
                        xff xffVarA2 = xeuVar2.a(aihfVarCreateBuilder2, alot.ZERO_STEP_CHANNEL_CREATED);
                        ztf ztfVar2 = xffVarA2.k.e;
                        xffVarA2.l = ztfVar2.a();
                        ztfVar2.k(xffVarA2);
                    } else {
                        alos alosVar2 = (alos) alou.a.createBuilder();
                        alosVar2.copyOnWrite();
                        alou alouVar2 = (alou) alosVar2.instance;
                        arrb arrbVar4 = (arrb) aihfVarCreateBuilder2.build();
                        arrbVar4.getClass();
                        alouVar2.d = arrbVar4;
                        alouVar2.c = 31;
                        xeuVar2.b((alou) alosVar2.build());
                    }
                    ?? r1 = this.b;
                    if (!TextUtils.isEmpty(r1)) {
                        ajqf ajqfVar = (ajqf) this.c;
                        arrc arrcVar = ajqfVar.e;
                        if (arrcVar == null) {
                            arrcVar = arrc.a;
                        }
                        if (((arrcVar.b == 3 ? (arre) arrcVar.c : arre.a).b & 2) != 0) {
                            ?? r2 = abziVar3.e;
                            ?? r4 = abziVar3.k;
                            aoly aolyVar = aoly.PARTICIPANT_JOIN_STATE_WAITING;
                            wby wbyVarB3 = r2.e(r4.e());
                            aihf aihfVarCreateBuilder3 = aolx.a.createBuilder();
                            aihfVarCreateBuilder3.copyOnWrite();
                            aolx aolxVar = (aolx) aihfVarCreateBuilder3.instance;
                            r1.getClass();
                            aolxVar.b |= 1;
                            aolxVar.c = (String) r1;
                            aihfVarCreateBuilder3.copyOnWrite();
                            aolx aolxVar2 = (aolx) aihfVarCreateBuilder3.instance;
                            aolxVar2.d = aolyVar.n;
                            aolxVar2.b |= 2;
                            aolw aolwVarAm = new aolu(((aolx) aihfVarCreateBuilder3.build()).toBuilder()).am();
                            wer werVarE3 = wbyVarB3.e();
                            werVarE3.e(aolwVarAm);
                            werVarE3.b().r((avmb) abziVar3.m).D();
                            ?? r3 = abziVar3.f;
                            arrc arrcVar2 = ajqfVar.e;
                            if (arrcVar2 == null) {
                                arrcVar2 = arrc.a;
                            }
                            ajwo ajwoVar2 = (arrcVar2.b == 3 ? (arre) arrcVar2.c : arre.a).d;
                            if (ajwoVar2 == null) {
                                ajwoVar2 = ajwo.a;
                            }
                            r3.a(ajwoVar2);
                        }
                    }
                }
                break;
            case 6:
                String str6 = (String) obj;
                Object obj9 = this.a;
                zwa zwaVarF = str6 != null ? ((rky) obj9).a.f(str6) : null;
                if (zwaVarF instanceof rlt) {
                    Object obj10 = this.b;
                    rqa rqaVar = ((rky) obj9).c;
                    rlt rltVar = (rlt) zwaVarF;
                    apzh apzhVar = (apzh) obj10;
                    if ((apzhVar.b & 2) != 0) {
                        ajwoVar = apzhVar.c;
                        if (ajwoVar == null) {
                            ajwoVar = ajwo.a;
                        }
                    } else {
                        ajwoVar = null;
                    }
                    rqaVar.g(this.c);
                    rqaVar.f(rqf.a, null);
                    rqaVar.f.execute(afwl.i(new rmx(rqaVar, rltVar, ajwoVar, i2)));
                } else {
                    ((rky) obj9).c.j(false, false);
                }
                taf.g(((rky) obj9).d.F(), new gpq(i));
                break;
            case 7:
                Object obj11 = this.c;
                Object obj12 = this.b;
                rom romVar = (rom) this.a;
                romVar.c.post(new mrh(romVar, (aomb) obj12, (rlt) obj, (aoma) obj11, 7));
                break;
            case 8:
                ((rpw) this.a).g(this.c, (ajwo) this.b);
                break;
            case 9:
                Bitmap bitmap = (Bitmap) ((Optional) obj).orElse(null);
                ImageView imageView = (ImageView) this.a;
                imageView.setImageBitmap(bitmap);
                aljj aljjVar = ((uji) this.c).g;
                if (aljjVar != null && bitmap != null) {
                    if (aljj.a.equals(aljjVar)) {
                        imageView.setImageBitmap(ugi.b(bitmap));
                    } else {
                        Object obj13 = this.b;
                        imageView.setScaleType(ImageView.ScaleType.MATRIX);
                        nsf.b(imageView, new BitmapDrawable(((vda) obj13).a.getResources(), bitmap), aljjVar);
                    }
                    break;
                }
                break;
            case 10:
                List list = (List) obj;
                if (list.size() > 1) {
                    Log.e(vjq.h, "Expect 1 prompt sticker but found " + list.size() + " of them");
                }
                Object obj14 = this.c;
                Object obj15 = this.a;
                Optional optionalFindAny = Collection.EL.stream(list).findAny();
                if (optionalFindAny.isPresent()) {
                    uxi uxiVar = (uxi) optionalFindAny.get();
                    ((Optional) obj14).isPresent();
                    augy augyVarB = uxiVar.b();
                    apji apjiVar3 = apji.a;
                    aihh aihhVar = (aihh) apjiVar3.createBuilder();
                    aihl aihlVar = ameh.b;
                    auhv auhvVar = augyVarB.c == 107 ? (auhv) augyVarB.d : auhv.a;
                    ameh amehVar2 = (auhvVar.c == 2 ? (auih) auhvVar.d : auih.a).e;
                    if (amehVar2 == null) {
                        amehVar2 = ameh.a;
                    }
                    aihhVar.e(aihlVar, amehVar2);
                    apji apjiVar4 = (apji) aihhVar.build();
                    aihl aihlVar2 = apbl.b;
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
                    apjiVar4.c(aihlVarCheckIsLite3);
                    if (apjiVar4.j.n(aihlVarCheckIsLite3.d)) {
                        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar);
                        apjiVar4.c(aihlVarCheckIsLite4);
                        Object objK3 = apjiVar4.j.k(aihlVarCheckIsLite4.d);
                        apji apjiVar5 = ((ameh) (objK3 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK3))).e;
                        if (apjiVar5 == null) {
                            apjiVar5 = apjiVar3;
                        }
                        aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aihlVar2);
                        apjiVar5.c(aihlVarCheckIsLite5);
                        if (apjiVar5.j.n(aihlVarCheckIsLite5.d)) {
                            aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aihlVar);
                            apjiVar4.c(aihlVarCheckIsLite6);
                            if (apjiVar4.j.n(aihlVarCheckIsLite6.d)) {
                                aihl aihlVarCheckIsLite7 = aihn.checkIsLite(aihlVar);
                                apjiVar4.c(aihlVarCheckIsLite7);
                                Object objK4 = apjiVar4.j.k(aihlVarCheckIsLite7.d);
                                amehVar = (ameh) (objK4 == null ? aihlVarCheckIsLite7.b : aihlVarCheckIsLite7.c(objK4));
                            }
                            amehVar.getClass();
                            apji apjiVar6 = amehVar.e;
                            if (apjiVar6 != null) {
                                apjiVar3 = apjiVar6;
                            }
                            aihl aihlVarCheckIsLite8 = aihn.checkIsLite(aihlVar2);
                            apjiVar3.c(aihlVarCheckIsLite8);
                            Object objK5 = apjiVar3.j.k(aihlVarCheckIsLite8.d);
                            apblVar = (apbl) (objK5 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK5));
                        }
                    }
                    if (apblVar != null || augyVarB.c == 102) {
                        vjq vjqVar = (vjq) obj15;
                        vjqVar.s = augyVarB;
                        vjqVar.o(vjqVar.q, augyVarB);
                    } else {
                        Log.e(vjq.h, "Unable to set data based on given segment");
                    }
                    ((vjj) obj15).e.isPresent();
                    ((vjq) obj15).q();
                } else {
                    vjq vjqVar2 = (vjq) obj15;
                    vjqVar2.l((Optional) this.b);
                    ((Optional) obj14).isPresent();
                    vjqVar2.q();
                }
                break;
            case 11:
                wgi wgiVar = (wgi) obj;
                agrx agrxVar = agso.a;
                ((xww) ((xxj) this.a).a).a((xyv) this.b);
                if (wgiVar.f != null) {
                    xxp xxpVar = (xxp) this.c;
                    xxpVar.d.e().kk(new wuk(wgiVar));
                    abvk abvkVar = (abvk) xxpVar.b.io();
                    if (abvkVar != null) {
                        abvkVar.m.p(wgiVar);
                    }
                }
                break;
            case 12:
                Optional optional = (Optional) obj;
                boolean zIsPresent = optional.isPresent();
                Object obj16 = this.c;
                ?? r5 = this.a;
                if (zIsPresent) {
                    Object obj17 = this.b;
                    r5.b(obj16, (xvk) optional.get());
                    ((xwm) ((aesp) obj17).h).c((xvk) optional.get());
                } else {
                    r5.iT(obj16, new Exception("Screen is null."));
                }
                break;
            case 13:
                File file = (File) obj;
                if (file != null) {
                    Object obj18 = this.c;
                    yfo yfoVar = (yfo) obj18;
                    if (yfoVar.l != null) {
                        Object obj19 = this.a;
                        Object obj20 = this.b;
                        taf.i(zik.cr((affd) obj20, yfoVar.h, 1).p(), yfoVar.g, new xfa(obj18, obj20, i2), new gst(obj18, file, obj20, obj19, 9), null);
                    }
                }
                break;
            case 14:
                ((abvx) this.c).a(this.b, (abug) this.a, (wjf) obj);
                break;
            default:
                axq axqVar = (axq) obj;
                Object obj21 = this.b;
                ((aekx) this.a).g.put(obj21, axqVar);
                ((aemz) this.c).d((aptq) obj21, (CharSequence) axqVar.a, (Drawable) axqVar.b);
                break;
        }
    }

    public /* synthetic */ rjy(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ rjy(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ rjy(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ rjy(yfo yfoVar, affd affdVar, xxy xxyVar, int i) {
        this.$cid = i;
        this.c = yfoVar;
        this.b = affdVar;
        this.a = xxyVar;
    }
}
