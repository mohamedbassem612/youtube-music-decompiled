package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.apps.youtube.music.R;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static boolean a(int i) {
        return i == 13 || i == 14;
    }

    public static /* synthetic */ void b(ea eaVar, bj bjVar) {
        if (dd.aa(2)) {
            Objects.toString(eaVar);
        }
        eaVar.f(bjVar);
    }

    public static List c(Map map) {
        azs.l(map);
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            lwj lwjVarB = lwk.b();
            lwjVarB.d((String) entry.getKey());
            lwjVarB.a((Iterable) entry.getValue());
            arrayList.add(lwjVarB);
        }
        return arrayList;
    }

    public static tp d(lvz lvzVar, String str) {
        azs.l(lvzVar);
        aeg aegVar = new aeg();
        for (int i = 0; i < lvzVar.b(); i++) {
            String strSubstring = ((String) lvzVar.deletedSchemaTypes_.get(i)).substring(str.length());
            azs.l(strSubstring);
            aegVar.b();
            ((ArrayList) aegVar.e).add(strSubstring);
        }
        for (int i2 = 0; i2 < lvzVar.c(); i2++) {
            String strSubstring2 = ((String) lvzVar.incompatibleSchemaTypes_.get(i2)).substring(str.length());
            azs.l(strSubstring2);
            aegVar.b();
            ((ArrayList) aegVar.c).add(strSubstring2);
        }
        return aegVar.a();
    }

    public static sl e(lvr lvrVar) {
        si siVarA;
        int i;
        sb sbVar = new sb(lvrVar.g());
        lvp lvpVar = (lvp) lvrVar;
        String str = ((lvq) lvpVar.a).description_;
        azs.l(str);
        sbVar.b();
        sbVar.a = str;
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((lvq) lvpVar.a).properties_);
        for (int i2 = 0; i2 < listUnmodifiableList.size(); i2++) {
            luw luwVar = (luw) listUnmodifiableList.get(i2);
            azs.l(luwVar);
            int i3 = 2;
            switch (luwVar.g() - 1) {
                case 1:
                    sj sjVar = new sj(luwVar.propertyName_);
                    String str2 = luwVar.description_;
                    azs.l(str2);
                    sjVar.a = str2;
                    sjVar.b(luwVar.f() - 1);
                    int iAU = a.aU(luwVar.d().valueType_);
                    if (iAU == 0) {
                        iAU = 1;
                    }
                    sjVar.d(iAU + (-1) != 0 ? 1 : 0);
                    int iAU2 = a.aU(luwVar.d().deletePropagationType_);
                    if (iAU2 == 0) {
                        iAU2 = 1;
                    }
                    int i4 = iAU2 + (-1) != 0 ? 1 : 0;
                    azs.i(i4, 0, 1, "deletePropagationType");
                    sjVar.b = i4;
                    int iBc = a.bc(luwVar.e().tokenizerType_);
                    if (iBc == 0) {
                        iBc = 1;
                    }
                    sjVar.e(iBc - 1);
                    int iAV = a.aV(luwVar.e().termMatchType_);
                    if (iAV == 0) {
                        iAV = 1;
                    }
                    int i5 = iAV - 1;
                    if (i5 == 0) {
                        i3 = 0;
                    } else if (i5 == 1) {
                        i3 = 1;
                    } else if (i5 != 2) {
                        Log.w("AppSearchSchemaToProtoC", a.bR(i5, "Invalid indexingType: "));
                        i3 = 0;
                    }
                    sjVar.c(i3);
                    siVarA = sjVar.a();
                    break;
                case 2:
                    sg sgVar = new sg(luwVar.propertyName_);
                    String str3 = luwVar.description_;
                    azs.l(str3);
                    sgVar.a = str3;
                    sgVar.b(luwVar.f() - 1);
                    sgVar.b = luwVar.h() == 3;
                    luk lukVar = luwVar.integerIndexingConfig_;
                    if (lukVar == null) {
                        lukVar = luk.DEFAULT_INSTANCE;
                    }
                    int iAU3 = a.aU(lukVar.numericMatchType_);
                    if (iAU3 == 0) {
                        iAU3 = 1;
                    }
                    sgVar.c(iAU3 + (-1) == 0 ? 0 : 1);
                    siVarA = sgVar.a();
                    break;
                case 3:
                    String str4 = luwVar.propertyName_;
                    azs.l(str4);
                    String str5 = luwVar.description_;
                    azs.l(str5);
                    int iF = luwVar.f() - 1;
                    azs.i(iF, 1, 3, "cardinality");
                    siVarA = new se(new vg(str4, 3, iF, null, null, null, null, null, str5, null, luwVar.h() == 3));
                    break;
                case 4:
                    rz rzVar = new rz(luwVar.propertyName_);
                    String str6 = luwVar.description_;
                    azs.l(str6);
                    rzVar.a = str6;
                    rzVar.b(luwVar.f() - 1);
                    rzVar.b = luwVar.h() == 3;
                    siVarA = rzVar.a();
                    break;
                case 5:
                    avju avjuVar = new avju(luwVar.propertyName_);
                    String str7 = luwVar.description_;
                    azs.l(str7);
                    avjuVar.c = str7;
                    avjuVar.p(luwVar.f() - 1);
                    siVarA = avjuVar.q();
                    break;
                case 6:
                    sc scVar = new sc(luwVar.propertyName_, luwVar.schemaType_);
                    String str8 = luwVar.description_;
                    azs.l(str8);
                    scVar.a = str8;
                    scVar.b(luwVar.f() - 1);
                    scVar.b = luwVar.b().indexNestedProperties_;
                    lye lyeVar = luwVar.b().indexableNestedPropertiesList_;
                    azs.l(lyeVar);
                    scVar.c.addAll(lyeVar);
                    siVarA = scVar.a();
                    break;
                case 7:
                    String str9 = luwVar.propertyName_;
                    azs.l(str9);
                    String str10 = luwVar.description_;
                    azs.l(str10);
                    int iF2 = luwVar.f() - 1;
                    azs.i(iF2, 1, 3, "cardinality");
                    int iAS = a.aS(luwVar.c().embeddingIndexingType_);
                    if (iAS == 0) {
                        iAS = 1;
                    }
                    int i6 = iAS - 1;
                    int i7 = i6 != 0 ? i6 != 1 ? 2 : 1 : 0;
                    azs.i(i7, 0, 2, "indexingType");
                    if (iAS != 1) {
                        int iAU4 = a.aU(luwVar.c().quantizationType_);
                        if (iAU4 == 0) {
                            iAU4 = 1;
                        }
                        i = iAU4 + (-1) != 0 ? 1 : 0;
                        azs.i(i, 0, 1, "quantizationType");
                    } else {
                        i = 0;
                    }
                    siVarA = new sf(new vg(str9, 7, iF2, null, null, null, null, null, str10, new vc(i7, i), false));
                    break;
                case 8:
                    String str11 = luwVar.propertyName_;
                    azs.l(str11);
                    String str12 = luwVar.description_;
                    azs.l(str12);
                    int iF3 = luwVar.f() - 1;
                    azs.i(iF3, 1, 3, "cardinality");
                    siVarA = new si(new vg(str11, 8, iF3, null, null, null, null, null, str12, null, false));
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Invalid dataType code: ");
                    sb.append(luwVar.g() - 1);
                    throw new IllegalArgumentException(sb.toString());
            }
            sbVar.c(siVarA);
        }
        List listUnmodifiableList2 = DesugarCollections.unmodifiableList(((lvq) lvpVar.a).parentTypes_);
        for (int i8 = 0; i8 < listUnmodifiableList2.size(); i8++) {
            String str13 = (String) listUnmodifiableList2.get(i8);
            azs.l(str13);
            sbVar.b();
            sbVar.b.add(str13);
        }
        return sbVar.a();
    }

    public static int f(boolean z) {
        return z ? 3 : 2;
    }

    public static tj g(lvw lvwVar, dep depVar, a aVar, Set set) throws ts {
        ArrayList arrayList = new ArrayList(lvwVar.b());
        for (int i = 0; i < lvwVar.b(); i++) {
            ti tiVarK = k((lvv) lvwVar.results_.get(i), depVar, aVar);
            set.add(tiVarK.a().h());
            arrayList.add(tiVarK);
        }
        return new tj(lvwVar.nextPageToken_, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00dd A[Catch: RuntimeException -> 0x00e4, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00e4, blocks: (B:67:0x00d7, B:69:0x00dd), top: B:79:0x00d7 }] */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public static eol h(Context context, cc ccVar, boolean z, boolean z2) {
        int exitAnim;
        boolean z3;
        eol eolVar;
        Animator animatorLoadAnimator;
        int nextTransition = ccVar.getNextTransition();
        int i = 0;
        if (z2) {
            if (z) {
                exitAnim = ccVar.getPopEnterAnim();
                z3 = true;
            } else {
                exitAnim = ccVar.getPopExitAnim();
                z3 = false;
            }
        } else if (z) {
            exitAnim = ccVar.getEnterAnim();
            z3 = true;
        } else {
            exitAnim = ccVar.getExitAnim();
            z3 = false;
        }
        boolean z4 = z3;
        ccVar.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = ccVar.mContainer;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            ccVar.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = ccVar.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationOnCreateAnimation = ccVar.onCreateAnimation(nextTransition, z3, exitAnim);
        if (animationOnCreateAnimation != null) {
            return new eol(animationOnCreateAnimation);
        }
        Animator animatorOnCreateAnimator = ccVar.onCreateAnimator(nextTransition, z3, exitAnim);
        if (animatorOnCreateAnimator != null) {
            return new eol(animatorOnCreateAnimator);
        }
        if (exitAnim != 0) {
            i = exitAnim;
        } else if (nextTransition != 0) {
            if (nextTransition == 4097) {
                i = true != z4 ? R.animator.fragment_open_exit : R.animator.fragment_open_enter;
            } else if (nextTransition == 8194) {
                i = true != z4 ? R.animator.fragment_close_exit : R.animator.fragment_close_enter;
            } else if (nextTransition == 8197) {
                i = z3 ? i(context, android.R.attr.activityCloseEnterAnimation) : i(context, android.R.attr.activityCloseExitAnimation);
            } else if (nextTransition == 4099) {
                i = true != z4 ? R.animator.fragment_fade_exit : R.animator.fragment_fade_enter;
            } else if (nextTransition != 4100) {
                i = -1;
            } else {
                i = z3 ? i(context, android.R.attr.activityOpenEnterAnimation) : i(context, android.R.attr.activityOpenExitAnimation);
            }
        }
        if (i == 0) {
            return null;
        }
        boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(i));
        if (zEquals) {
            try {
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, i);
                if (animationLoadAnimation == null) {
                    return null;
                }
                eolVar = new eol(animationLoadAnimation);
            } catch (Resources.NotFoundException e) {
                throw e;
            } catch (RuntimeException unused) {
                try {
                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
                    if (animatorLoadAnimator != null) {
                        return null;
                    }
                    eolVar = new eol(animatorLoadAnimator);
                } catch (RuntimeException e2) {
                    if (zEquals) {
                        throw e2;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, i);
                    if (animationLoadAnimation2 != null) {
                        return new eol(animationLoadAnimation2);
                    }
                    return null;
                }
            }
        } else {
            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator != null) {
                return null;
            }
            eolVar = new eol(animatorLoadAnimator);
        }
        return eolVar;
    }

    private static int i(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Map] */
    private static void j(ltu ltuVar, String str, dep depVar, Map map) {
        List list;
        ltt lttVar = (ltt) ltuVar;
        String strSubstring = lttVar.schema_;
        if (strSubstring.startsWith(str)) {
            strSubstring = strSubstring.substring(str.length());
        }
        if (!map.containsKey(strSubstring)) {
            String str2 = lttVar.schema_;
            azs.l(str);
            azs.l(str2);
            Map map2 = (Map) depVar.d.get(str);
            if (map2 == null || (list = (List) map2.get(str2)) == null) {
                list = Collections.EMPTY_LIST;
            }
            if (!list.isEmpty()) {
                map.put(strSubstring, list);
            }
        }
        for (int i = 0; i < ltuVar.b(); i++) {
            luz luzVarC = ltuVar.c(i);
            for (int i2 = 0; i2 < luzVarC.e(); i2++) {
                j(luzVarC.j(i2), str, depVar, map);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    private static ti k(lvv lvvVar, dep depVar, a aVar) throws ts {
        ltt lttVar = lvvVar.document_;
        if (lttVar == null) {
            lttVar = ltt.DEFAULT_INSTANCE;
        }
        String strG = ed.g(lttVar.schema_);
        ss ssVarC = uh.c(lttVar, strG, depVar, aVar);
        aak aakVar = new aak(ed.f(strG), ed.e(strG));
        aakVar.a();
        aakVar.c = ssVarC;
        double d = lvvVar.score_;
        aakVar.a();
        for (int i = 0; i < lvvVar.additionalScores_.size(); i++) {
            double d2 = lvvVar.additionalScores_.d(i);
            aakVar.a();
            aakVar.b.add(Double.valueOf(d2));
        }
        if ((lvvVar.bitField0_ & 2) != 0) {
            for (int i2 = 0; i2 < lvvVar.c().entries_.size(); i2++) {
                lwc lwcVar = (lwc) lvvVar.c().entries_.get(i2);
                for (int i3 = 0; i3 < lwcVar.snippetMatches_.size(); i3++) {
                    lwb lwbVar = (lwb) lwcVar.snippetMatches_.get(i3);
                    String str = lwcVar.propertyName_;
                    int i4 = lwbVar.exactMatchUtf16Position_;
                    tf tfVar = new tf(str);
                    tfVar.a = new th(i4, lwbVar.exactMatchUtf16Length_ + i4);
                    tfVar.b = new th(i4, lwbVar.submatchUtf16Length_ + i4);
                    int i5 = lwbVar.windowUtf16Position_;
                    tfVar.c = new th(i5, lwbVar.windowUtf16Length_ + i5);
                    aakVar.b(tfVar.a());
                }
                for (int i6 = 0; i6 < lwcVar.embeddingMatches_.size(); i6++) {
                    lty ltyVar = (lty) lwcVar.embeddingMatches_.get(i6);
                    String str2 = lwcVar.propertyName_;
                    double d3 = ltyVar.semanticScore_;
                    int i7 = ltyVar.embeddingQueryVectorIndex_;
                    int iAV = a.aV(ltyVar.embeddingQueryMetricType_);
                    if (iAV == 0) {
                        iAV = 1;
                    }
                    vm vmVar = new vm(iAV - 1);
                    tf tfVar2 = new tf(str2);
                    tfVar2.d = vmVar;
                    aakVar.b(tfVar2.a());
                }
            }
        }
        for (int i8 = 0; i8 < lvvVar.b(); i8++) {
            lvv lvvVar2 = (lvv) lvvVar.joinedResults_.get(i8);
            if (lvvVar2.b() != 0) {
                throw new ts(2, "Nesting joined results within joined results not allowed.", null);
            }
            ti tiVarK = k(lvvVar2, depVar, aVar);
            aakVar.a();
            aakVar.f.add(tiVarK);
        }
        afv afvVar = new afv();
        j(lttVar, strG, depVar, afvVar);
        aakVar.a();
        ((Bundle) aakVar.d).clear();
        for (Map.Entry entry : afvVar.entrySet()) {
            azs.l((String) entry.getKey());
            azs.l((List) entry.getValue());
            ArrayList<String> arrayList = new ArrayList<>(((List) entry.getValue()).size());
            for (int i9 = 0; i9 < ((List) entry.getValue()).size(); i9++) {
                String str3 = (String) ((List) entry.getValue()).get(i9);
                azs.l(str3);
                arrayList.add(str3);
            }
            ((Bundle) aakVar.d).putStringArrayList((String) entry.getKey(), arrayList);
        }
        aakVar.a = true;
        return new ti(((ss) aakVar.c).a, aakVar.e, aakVar.f, aakVar.b);
    }
}
