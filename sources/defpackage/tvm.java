package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreListPreference;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.MessageLite;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tvm implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tvm(File file, int i) {
        this.$cid = i;
        this.a = "Failed to propagate C2PA manifest from source file";
        this.b = file;
    }

    /* JADX WARN: Code duplicated, block: B:193:0x05ac A[Catch: all -> 0x05c2, TryCatch #0 {all -> 0x05c2, blocks: (B:165:0x0516, B:167:0x052e, B:169:0x0537, B:171:0x0540, B:180:0x0576, B:182:0x057e, B:185:0x0584, B:187:0x058c, B:192:0x0596, B:193:0x05ac, B:172:0x054e, B:173:0x0553, B:175:0x055c, B:177:0x0565, B:194:0x05b1), top: B:230:0x0516, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:237:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:73:0x0211  */
    /* JADX WARN: Code duplicated, block: B:74:0x0216  */
    /* JADX WARN: Code duplicated, block: B:76:0x021e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0225 A[LOOP:1: B:77:0x021f->B:79:0x0225, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x0239  */
    /* JADX WARN: Code duplicated, block: B:86:0x0265 A[LOOP:2: B:81:0x023a->B:86:0x0265, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x0225, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, xzc] */
    /* JADX WARN: Type inference failed for: r0v73, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v78, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v76, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r2v59, types: [agek, java.lang.Object] */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        ukh ukhVarFo;
        float f;
        float f2;
        float f3;
        float f4;
        Object obj2;
        String str;
        int i;
        String string;
        String strL;
        Integer numValueOf;
        int iIntValue = 4;
        int i2 = 3;
        boolean z = false;
        int i3 = 2;
        Object obj3 = null;
        xvk xvkVar = null;
        switch (this.$cid) {
            case 0:
                return (MessageLite) ((tvn) this.b).a.a((MessageLite) obj, this.a);
            case 1:
                String str2 = (String) obj;
                ((ProtoDataStoreListPreference) this.b).ai((String) this.a, str2);
                return str2;
            case 2:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((agrc) ((agrc) uhk.a.c()).j(th).k("com/google/android/libraries/youtube/creation/common/provenance/TranscodeProvenanceHelper", "embedComposition$<anonymous>", 261, "TranscodeProvenanceHelper.kt")).w("%s for transcode segment", this.a);
                return this.b;
            case 3:
                ulb ulbVar = (ulb) obj;
                ukz ukzVar = (ukz) this.b;
                ukzVar.i.getClass();
                uqw uqwVar = new uqw();
                umf umfVar = ukzVar.j;
                ume umeVar = umfVar.f;
                Optional.empty();
                Optional.empty();
                Optional.empty();
                Optional.empty();
                Optional.empty();
                Optional.empty();
                Optional optional = umeVar.a;
                Optional optional2 = umeVar.e;
                Optional optional3 = umeVar.f;
                ula ulaVar = (ula) this.a;
                umfVar.n(new ume(optional, Optional.of(ulaVar.d), Optional.of(uqwVar), Optional.of(ulaVar.f), optional2, optional3));
                zf zfVar = ulbVar.e;
                usd usdVar = ulbVar.b;
                vfs vfsVar = ulaVar.b;
                vfsVar.getClass();
                vhu vhuVar = ukzVar.g;
                obj2 = ulbVar;
                if (!vhuVar.d) {
                    if (vhuVar.a.a() != null) {
                        throw null;
                    }
                    awno awnoVar = awno.a;
                    auhs auhsVarC = usdVar.c();
                    auhsVarC.getClass();
                    awro.t(vhuVar.b, null, 0, new vht(vhuVar, awnoVar, auhsVarC, awnoVar, new ArrayList(atqq.N(awnoVar, 10)), usdVar, vfsVar, null), 3);
                    obj2 = ulbVar;
                }
                break;
            case 4:
                Optional optional4 = (Optional) obj;
                usd usdVarA = ((use) this.b).a((auhs) this.a);
                urh urhVar = new urh(usdVarA, 2);
                if (true != optional4.isPresent()) {
                    return usdVarA;
                }
                usr usrVar = (usr) optional4.get();
                ((usd) urhVar.a).h(new uug(agke.q(new ury(usrVar.a, usrVar.b)), 0));
                return usdVarA;
            case 5:
                ascv ascvVar = (ascv) obj;
                if (ascvVar == null) {
                    return ascvVar;
                }
                ((vcl) this.b).f.put(this.a, ascvVar);
                return ascvVar;
            case 6:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                Object obj4 = this.a;
                Object obj5 = this.b;
                if (zBooleanValue) {
                    vfb vfbVar = (vfb) obj4;
                    Uri uriA = tyu.a(vfbVar.m().getAbsolutePath());
                    akqy akqyVar = vfbVar.o.l(63, 45750808L, false) ? null : akqy.a;
                    Context context = vfbVar.h;
                    if (!vfbVar.z()) {
                        try {
                            Bitmap bitmapR = nuo.r(context, uriA);
                            try {
                                float width = bitmapR.getWidth();
                                float height = bitmapR.getHeight();
                                float f5 = ((vfb) obj4).g;
                                float f6 = width / height;
                                if (f6 > f5) {
                                    if (((ukh) obj5).b > 0.0f || ((ukh) obj5).d > 0.0f) {
                                        ukhVarFo = yno.fo(width, height, f5);
                                    } else {
                                        float f7 = ((ukh) obj5).a;
                                        float f8 = (1.0f - f7) - (f5 / f6);
                                        f3 = f7;
                                        f4 = f8;
                                        f = 0.0f;
                                        f2 = 0.0f;
                                        if (f2 < 0.0f && Math.abs(f2) < 0.01f) {
                                            f += f2;
                                            f2 = 0.0f;
                                        }
                                        if (f4 < 0.0f && Math.abs(f4) < 0.01f) {
                                            f3 += f4;
                                            f4 = 0.0f;
                                        }
                                        if (f4 >= 0.0f || f2 < 0.0f) {
                                            ukhVarFo = yno.fo(width, height, f5);
                                        } else {
                                            ukg ukgVar = new ukg();
                                            ukgVar.c(f3);
                                            ukgVar.d(f4);
                                            ukgVar.e(f);
                                            ukgVar.b(f2);
                                            ukhVarFo = ukgVar.a();
                                        }
                                    }
                                } else if (((ukh) obj5).a > 0.0f || ((ukh) obj5).c > 0.0f) {
                                    ukhVarFo = yno.fo(width, height, f5);
                                } else {
                                    f = ((ukh) obj5).b;
                                    f2 = (1.0f - f) - (f6 / f5);
                                    f3 = 0.0f;
                                    f4 = 0.0f;
                                    if (f2 < 0.0f) {
                                        f += f2;
                                        f2 = 0.0f;
                                    }
                                    if (f4 < 0.0f) {
                                        f3 += f4;
                                        f4 = 0.0f;
                                    }
                                    if (f4 >= 0.0f) {
                                        ukhVarFo = yno.fo(width, height, f5);
                                    } else {
                                        ukhVarFo = yno.fo(width, height, f5);
                                    }
                                }
                                obj3 = ukhVarFo;
                                if (((vfb) obj4).y()) {
                                    bitmapR.recycle();
                                }
                            } catch (Throwable th2) {
                                if (((vfb) obj4).y()) {
                                    bitmapR.recycle();
                                }
                                throw th2;
                            }
                        } catch (IOException e) {
                            vfbVar.p(ajtv.ERROR_LEVEL_ERROR, "saveStagingOutput failed to save image", e);
                            obj3 = obj5;
                        }
                    }
                    vfbVar.n = new vfa(akqyVar, (ukh) obj3, vfbVar.b);
                } else {
                    ((vfb) obj4).p(ajtv.ERROR_LEVEL_ERROR, "saveStagingOutput failed to save AI edited image", null);
                }
                return bool;
            case 7:
                Boolean bool2 = (Boolean) obj;
                boolean zBooleanValue2 = bool2.booleanValue();
                obj2 = bool2;
                if (zBooleanValue2) {
                    vfb vfbVar2 = (vfb) this.a;
                    vfbVar2.n = new vfa(vfbVar2.o.l(63, 45750808L, false) ? null : akqy.a, (ukh) this.b, vfbVar2.b);
                    obj2 = bool2;
                }
                break;
            case 8:
                Boolean bool3 = (Boolean) obj;
                boolean zBooleanValue3 = bool3.booleanValue();
                obj2 = bool3;
                if (zBooleanValue3) {
                    vfb vfbVar3 = (vfb) this.a;
                    vfbVar3.n = new vfa(vfbVar3.o.l(63, 45750808L, false) ? null : akqy.a, (ukh) this.b, vfbVar3.b);
                    obj2 = bool3;
                }
                break;
            case 9:
                Optional optionalOfNullable = Optional.ofNullable((vsw) obj);
                vre vreVar = new vre(this.a, 2);
                boolean zIsPresent = optionalOfNullable.isPresent();
                Optional optional5 = optionalOfNullable;
                if (true == zIsPresent) {
                    Optional optionalFindFirst = Collection.EL.stream(((vsw) optionalOfNullable.get()).b).filter(new uso(vreVar.a, 16)).findFirst();
                    optionalFindFirst.getClass();
                    optional5 = optionalFindFirst;
                }
                boolean zIsPresent2 = optional5.isPresent();
                Optional optionalEmpty = optional5;
                if (true == zIsPresent2 && !abxv.t((vsv) optional5.get())) {
                    optionalEmpty = optional5;
                    twu.c(5, "Dropping invalid EngagementPanelSavedState.", null);
                    optionalEmpty = Optional.empty();
                }
                optionalEmpty = optional5;
                vre vreVar2 = new vre(this.b, i2);
                boolean zIsPresent3 = optionalEmpty.isPresent();
                obj2 = optionalEmpty;
                if (true == zIsPresent3) {
                    return Optional.ofNullable(new xpl((vsv) optionalEmpty.get(), vreVar2.a, (short[]) null));
                }
                break;
            case 10:
                wom womVar = (wom) this.b;
                almd almdVar = (almd) obj;
                Iterator it = ((Set) womVar.f.io()).iterator();
                while (it.hasNext()) {
                    ((wjz) it.next()).a(almdVar);
                }
                Object obj6 = this.a;
                wfy wfyVar = new wfy(almdVar);
                ((aaok) womVar.h.io()).s((woo) obj6, wfyVar);
                return wfyVar;
            case 11:
                ?? r0 = this.a;
                atpa atpaVar = (atpa) obj;
                xvr xvrVarJ = r0.j();
                String str3 = xvrVarJ.d().b;
                atoy atoyVar = atoy.a;
                atoy atoyVar2 = (atoy) atpaVar.b.get(str3);
                if (atoyVar2 != null) {
                    atoyVar = atoyVar2;
                }
                aihf builder = atoyVar.toBuilder();
                builder.copyOnWrite();
                atoy atoyVar3 = (atoy) builder.instance;
                atoyVar3.b |= 1;
                atoyVar3.c = str3;
                String str4 = r0.n().a;
                atpb atpbVar = atpb.a;
                Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((atoy) builder.instance).e);
                if (mapUnmodifiableMap.containsKey(str4)) {
                    atpbVar = (atpb) mapUnmodifiableMap.get(str4);
                }
                Object obj7 = this.b;
                aihf builder2 = atpbVar.toBuilder();
                long epochMilli = ((xnp) obj7).a.f().toEpochMilli();
                builder2.copyOnWrite();
                atpb atpbVar2 = (atpb) builder2.instance;
                int i4 = atpbVar2.b | 4;
                atpbVar2.b = i4;
                atpbVar2.e = epochMilli;
                if (xvrVarJ instanceof xvj) {
                    builder2.copyOnWrite();
                    atpb atpbVar3 = (atpb) builder2.instance;
                    atpbVar3.c = 1;
                    atpbVar3.b |= 1;
                } else if (xvrVarJ instanceof xvn) {
                    xvn xvnVar = (xvn) xvrVarJ;
                    if ((i4 & 1) == 0) {
                        if (xvnVar.r()) {
                            builder2.copyOnWrite();
                            atpb atpbVar4 = (atpb) builder2.instance;
                            atpbVar4.c = 3;
                            atpbVar4.b |= 1;
                        } else {
                            builder2.copyOnWrite();
                            atpb atpbVar5 = (atpb) builder2.instance;
                            atpbVar5.c = 2;
                            atpbVar5.b |= 1;
                        }
                    }
                }
                int iAS = a.aS(((atpb) builder2.instance).d);
                if (iAS == 0 || iAS != 3) {
                    int iB = r0.b();
                    if (iB == 0) {
                        builder2.copyOnWrite();
                        atpb atpbVar6 = (atpb) builder2.instance;
                        atpbVar6.d = 1;
                        atpbVar6.b |= 2;
                    } else if (iB == 1) {
                        builder2.copyOnWrite();
                        atpb atpbVar7 = (atpb) builder2.instance;
                        atpbVar7.d = 2;
                        atpbVar7.b |= 2;
                    }
                }
                atpb atpbVar8 = (atpb) builder2.build();
                atpbVar8.getClass();
                builder.copyOnWrite();
                ((atoy) builder.instance).a().put(str4, atpbVar8);
                aihf builder3 = atpaVar.toBuilder();
                builder3.cI(str3, (atoy) builder.build());
                return (atpa) builder3.build();
            case 12:
                atpd atpdVar = (atpd) obj;
                if (atpdVar != null && !atpdVar.c.isEmpty()) {
                    return atpdVar.c;
                }
                ?? r1 = this.a;
                String string2 = new BigInteger(130, (Random) this.b).toString(32);
                taf.j(((qrx) r1.io()).a(new xwd(string2, z ? 1 : 0), MoreExecutors.directExecutor()), new tsq(20));
                return string2;
            case 13:
                String str5 = (String) obj;
                if (!ahno.aa(str5)) {
                    return str5;
                }
                ?? r2 = this.b;
                String string3 = new BigInteger(130, (Random) this.a).toString(32);
                r2.edit().putString("remote_id", string3).apply();
                taf.j(aher.a, new tsq(19));
                return string3;
            case 14:
                aesp aespVar = (aesp) this.a;
                List<xvk> list = (List) obj;
                xve xveVarB = ((xwq) aespVar.f).b((xwc) this.b, 8);
                if (xveVarB == null) {
                    return Optional.empty();
                }
                xvb xvbVar = new xvb(xveVarB);
                for (xvk xvkVar2 : list) {
                    xvz xvzVar = xveVarB.d;
                    if (xvkVar2.b().equals(xvzVar)) {
                        xvkVar = xvkVar2;
                        if (xvkVar != null) {
                            strL = xvkVar.l();
                        } else {
                            str = xveVarB.c;
                            if (TextUtils.isEmpty(str)) {
                                i = 1;
                                while (true) {
                                    string = ((Resources) aespVar.c).getString(R.string.screen_name, Integer.valueOf(i));
                                    if (yno.cW(list, string) == null) {
                                        strL = string;
                                    } else {
                                        i++;
                                    }
                                }
                            } else {
                                strL = str;
                                while (yno.cW(list, strL) != null) {
                                    strL = str + ' ' + i3;
                                    i3++;
                                }
                            }
                        }
                        xvbVar.g(strL);
                        return Optional.of(new xvk(xvbVar.a(), false));
                    }
                }
                if (xvkVar != null) {
                    strL = xvkVar.l();
                } else {
                    str = xveVarB.c;
                    if (TextUtils.isEmpty(str)) {
                        strL = str;
                        while (yno.cW(list, strL) != null) {
                            strL = str + ' ' + i3;
                            i3++;
                        }
                    } else {
                        i = 1;
                        while (true) {
                            string = ((Resources) aespVar.c).getString(R.string.screen_name, Integer.valueOf(i));
                            if (yno.cW(list, string) == null) {
                                strL = string;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                xvbVar.g(strL);
                return Optional.of(new xvk(xvbVar.a(), false));
            case 15:
                Optional optional6 = (Optional) obj;
                if (optional6.isEmpty()) {
                    return Boolean.FALSE;
                }
                long jA = ((xze) optional6.get()).a();
                if (jA <= 0) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(((xsc) this.b).c.f().toEpochMilli() - jA <= ((Duration) this.a).toMillis());
            case 16:
                ydu yduVar = (ydu) this.a;
                String string4 = yduVar.h.getString("MdxCasterCategoryOverride", "");
                if (ahno.aa(string4)) {
                    numValueOf = null;
                } else {
                    try {
                        int i5 = Integer.parseInt(string4);
                        if (i5 == -1) {
                            numValueOf = null;
                        } else if (i5 == 0 || i5 == 1 || i5 == 2 || i5 == 3 || i5 == 4) {
                            agrx agrxVar = agso.a;
                            numValueOf = Integer.valueOf(i5);
                        } else {
                            agrx agrxVar2 = agso.a;
                            numValueOf = null;
                        }
                    } catch (NumberFormatException e2) {
                        ((agrc) ((agrc) ((agrc) ydu.a.c().i(agso.a, "MDX.UserProfile")).j(e2)).k("com/google/android/libraries/youtube/mdx/user/MdxUserProfile", "getCasterCategoryOverride", (char) 305, "MdxUserProfile.java")).t("Invalid caster category override value");
                    }
                }
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    yds ydsVar = yduVar.e;
                    long jA2 = ydsVar.a();
                    if (jA2 == 0) {
                        long j = ((atpi) ((tpq) ydsVar.b.io()).c()).d;
                        iIntValue = (j != -1 ? Duration.between(Instant.ofEpochMilli(j), ydsVar.c.f()).toDays() : 0L) <= 28 ? 0 : 1;
                    } else {
                        long days = Duration.between(Instant.ofEpochMilli(jA2), yduVar.g.f()).toDays();
                        if (days > 7) {
                            iIntValue = days <= 28 ? 3 : 2;
                        }
                    }
                }
                int[] iArr = yduVar.d;
                int[] iArr2 = yduVar.c;
                xvs xvsVar = (xvs) this.b;
                xvsVar.e(ydu.c(iArr2, 0));
                xvsVar.g(ydu.c(iArr2, 1));
                xvsVar.f(ydu.c(iArr2, 2));
                xvsVar.a(ydu.c(iArr, 0));
                xvsVar.c(ydu.c(iArr, 1));
                xvsVar.b(ydu.c(iArr, 2));
                xvsVar.d(iIntValue);
                return null;
            case 17:
                MessageLite messageLite = (MessageLite) this.a.apply((MessageLite) obj);
                ((ynq) this.b).e(messageLite);
                return messageLite;
            case 18:
                byh byhVar = new byh();
                byhVar.a = (Uri) this.b;
                byhVar.e = (byte[]) obj;
                byhVar.d = 2;
                if (((yqw) this.a).c.cI()) {
                    ypp yppVarA = ypq.a();
                    yppVarA.j(tok.MEDIA_ONESIE_REQUEST_PREPARER);
                    byhVar.k = yppVarA.a();
                }
                return byhVar.a();
            case 19:
                int i6 = zjr.L;
                aihf builder4 = ((atpl) obj).toBuilder();
                builder4.cM((String) this.a, ((atpk) this.b).c);
                return (atpl) builder4.build();
            default:
                int i7 = zjr.L;
                aihf builder5 = ((atpl) obj).toBuilder();
                Object obj8 = this.b;
                obj8.getClass();
                builder5.copyOnWrite();
                ((atpl) builder5.instance).b().put(this.a, obj8);
                return (atpl) builder5.build();
        }
        return obj2;
    }

    public /* synthetic */ tvm(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ tvm(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
