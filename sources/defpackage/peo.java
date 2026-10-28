package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class peo implements pds {
    private static final agsn a = agsn.h("GnpSdk");
    private static final Set b = atqq.aS(new ahzv[]{ahzv.ACTION_CLICK, ahzv.CLICKED, ahzv.DISMISSED, ahzv.DISMISSED_REMOTE, ahzv.DISMISSED_BY_API, ahzv.EXPIRED, ahzv.SHOWN, ahzv.SHOWN_FORCED});
    private final Context c;
    private final pls d;
    private final pgy e;
    private final pup f;
    private final agev g;
    private final pwf h;
    private final omm i;
    private final axfd j;

    public peo(Context context, pls plsVar, pgy pgyVar, pup pupVar, agev agevVar, omm ommVar, pwf pwfVar, axfd axfdVar) {
        context.getClass();
        plsVar.getClass();
        pgyVar.getClass();
        ommVar.getClass();
        pwfVar.getClass();
        this.c = context;
        this.d = plsVar;
        this.e = pgyVar;
        this.f = pupVar;
        this.g = agevVar;
        this.i = ommVar;
        this.h = pwfVar;
        this.j = axfdVar;
    }

    private final String e() {
        try {
            Context context = this.c;
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return (str == null || str.length() == 0) ? "unknown" : str;
        } catch (PackageManager.NameNotFoundException e) {
            ((agsj) ((agsj) a.b()).j(e)).t("Failed to get app version.");
        }
    }

    private final String f() {
        try {
            Context context = this.c;
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            String strValueOf = a.aK() ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
            return strValueOf.length() == 0 ? "unknown" : strValueOf;
        } catch (PackageManager.NameNotFoundException e) {
            ((agsj) ((agsj) a.b()).j(e)).t("Failed to get app version code.");
        }
    }

    private final String g() {
        try {
            return lsx.a.a(this.c.getContentResolver(), "device_country", "");
        } catch (SecurityException e) {
            ((agsj) ((agsj) a.b()).j(e)).t("Exception reading GServices 'device_country' key.");
            return null;
        }
    }

    private final String h() {
        String languageTag = this.c.getResources().getConfiguration().getLocales().get(0).toLanguageTag();
        languageTag.getClass();
        return languageTag;
    }

    private final boolean i() {
        try {
            return new auy(this.c).d();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.pds
    public final Object a(String str, awoq awoqVar) throws Throwable {
        pek pekVar;
        axst axstVar;
        String str2;
        axst axstVar2;
        aibq aibqVar;
        axst axstVar3;
        axst axstVar4;
        String str3;
        if (awoqVar instanceof pek) {
            pekVar = (pek) awoqVar;
            int i = pekVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pekVar.d = i - Integer.MIN_VALUE;
            } else {
                pekVar = new pek(this, awoqVar);
            }
        } else {
            pekVar = new pek(this, awoqVar);
        }
        Object objD = pekVar.b;
        Object obj = awox.a;
        int i2 = pekVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                axstVar2 = pekVar.f;
                axstVar = pekVar.e;
                str2 = (String) pekVar.a;
                atqp.j(objD);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                axstVar3 = pekVar.e;
                axstVar4 = (axst) pekVar.a;
                atqp.j(objD);
            }
            str3 = (String) objD;
            if (str3 != null && str3.length() != 0) {
                aihf aihfVar = (aihf) axstVar3.a;
                aihfVar.copyOnWrite();
                aibw aibwVar = (aibw) aihfVar.instance;
                aibw aibwVar2 = aibw.a;
                aibwVar.b |= 4;
                aibwVar.d = str3;
            }
            aihn aihnVarBuild = ((aihf) axstVar4.a).build();
            aihnVarBuild.getClass();
            return (aibw) aihnVarBuild;
        }
        atqp.j(objD);
        aihf aihfVarCreateBuilder = aibw.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        axstVar = new axst(aihfVarCreateBuilder);
        aihf aihfVarCreateBuilder2 = aibv.a.createBuilder();
        aihfVarCreateBuilder2.getClass();
        Context context = this.c;
        ahng.bh(context.getResources().getDisplayMetrics().density, aihfVarCreateBuilder2);
        ahng.bb(e(), aihfVarCreateBuilder2);
        ahng.bc(f(), aihfVarCreateBuilder2);
        ahng.aZ(Build.VERSION.SDK_INT, aihfVarCreateBuilder2);
        String str4 = this.d.d;
        str4.getClass();
        ahng.bg(str4, aihfVarCreateBuilder2);
        ahng.bp(aihfVarCreateBuilder2);
        ahng.bq(aihfVarCreateBuilder2);
        String str5 = Build.VERSION.RELEASE;
        if (str5 != null && str5.length() != 0) {
            String str6 = Build.VERSION.RELEASE;
            str6.getClass();
            ahng.bk(str6, aihfVarCreateBuilder2);
        }
        String str7 = Build.ID;
        if (str7 != null && str7.length() != 0) {
            String str8 = Build.ID;
            str8.getClass();
            ahng.bi(str8, aihfVarCreateBuilder2);
        }
        String str9 = Build.MODEL;
        if (str9 != null && str9.length() != 0) {
            String str10 = Build.MODEL;
            str10.getClass();
            ahng.bj(str10, aihfVarCreateBuilder2);
        }
        String str11 = Build.MANUFACTURER;
        if (str11 != null && str11.length() != 0) {
            String str12 = Build.MANUFACTURER;
            str12.getClass();
            ahng.bf(str12, aihfVarCreateBuilder2);
        }
        aibn aibnVar = (aibn) peh.a.b(qnl.ad(context));
        if (aibnVar != null) {
            ahng.aY(aibnVar, aihfVarCreateBuilder2);
        }
        ahng.bn(aihfVarCreateBuilder2);
        pgy pgyVar = this.e;
        List<pgv> listC = pgyVar.c();
        ArrayList arrayList = new ArrayList(atqq.N(listC, 10));
        for (pgv pgvVar : listC) {
            aihf aihfVarCreateBuilder3 = aibr.a.createBuilder();
            aihfVarCreateBuilder3.getClass();
            String str13 = pgvVar.a;
            str13.getClass();
            ahno.q(str13, aihfVarCreateBuilder3);
            pgu pguVar = pgvVar.c;
            pguVar.getClass();
            switch (pguVar.ordinal()) {
                case 1:
                    aibqVar = aibq.IMPORTANCE_DEFAULT;
                    break;
                case 2:
                    aibqVar = aibq.IMPORTANCE_HIGH;
                    break;
                case 3:
                    aibqVar = aibq.IMPORTANCE_LOW;
                    break;
                case 4:
                    aibqVar = aibq.IMPORTANCE_MIN;
                    break;
                case 5:
                    aibqVar = aibq.IMPORTANCE_MAX;
                    break;
                case 6:
                    aibqVar = aibq.IMPORTANCE_NONE;
                    break;
                default:
                    aibqVar = aibq.IMPORTANCE_UNSPECIFIED;
                    break;
            }
            ahno.s(aibqVar, aihfVarCreateBuilder3);
            ahno.p(pgvVar.d ? aibp.TRUE : aibp.FALSE, aihfVarCreateBuilder3);
            String str14 = pgvVar.b;
            if (str14 != null && str14.length() != 0) {
                ahno.r(str14, aihfVarCreateBuilder3);
            }
            aihn aihnVarBuild2 = aihfVarCreateBuilder3.build();
            aihnVarBuild2.getClass();
            arrayList.add((aibr) aihnVarBuild2);
        }
        ahng.bl(arrayList, aihfVarCreateBuilder2);
        ahng.bo(aihfVarCreateBuilder2);
        List<pgx> listB = pgyVar.b();
        listB.getClass();
        ArrayList arrayList2 = new ArrayList(atqq.N(listB, 10));
        for (pgx pgxVar : listB) {
            aihf aihfVarCreateBuilder4 = aibt.a.createBuilder();
            aihfVarCreateBuilder4.getClass();
            String str15 = pgxVar.a;
            str15.getClass();
            aext.O(str15, aihfVarCreateBuilder4);
            aext.N(pgxVar.b ? aibs.BANNED : aibs.ALLOWED, aihfVarCreateBuilder4);
            arrayList2.add(aext.M(aihfVarCreateBuilder4));
        }
        ahng.bm(arrayList2, aihfVarCreateBuilder2);
        ahng.ba(new auy(context).c() ? aibo.ALLOWED : aibo.BANNED, aihfVarCreateBuilder2);
        ahng.bd(i(), aihfVarCreateBuilder2);
        String strG = g();
        if (strG != null && strG.length() != 0) {
            ahng.be(strG, aihfVarCreateBuilder2);
        }
        pup pupVar = this.f;
        aiej aiejVarA = pupVar.a();
        aiejVarA.getClass();
        aihfVarCreateBuilder2.copyOnWrite();
        aibv aibvVar = (aibv) aihfVarCreateBuilder2.instance;
        aibvVar.s = aiejVarA;
        aibvVar.b |= 16384;
        aiew aiewVarB = pupVar.b();
        aiewVarB.getClass();
        aihfVarCreateBuilder2.copyOnWrite();
        aibv aibvVar2 = (aibv) aihfVarCreateBuilder2.instance;
        aibvVar2.t = aiewVarB;
        aibvVar2.b |= 32768;
        aihn aihnVarBuild3 = aihfVarCreateBuilder2.build();
        aihnVarBuild3.getClass();
        aihf aihfVar2 = (aihf) axstVar.a;
        aihfVar2.copyOnWrite();
        aibw aibwVar3 = (aibw) aihfVar2.instance;
        aibwVar3.f = (aibv) aihnVarBuild3;
        aibwVar3.b |= 32;
        String strH = h();
        aihfVar2.copyOnWrite();
        aibw aibwVar4 = (aibw) aihfVar2.instance;
        aibwVar4.b |= 1;
        aibwVar4.c = strH;
        String id = TimeZone.getDefault().getID();
        id.getClass();
        aihfVar2.copyOnWrite();
        aibw aibwVar5 = (aibw) aihfVar2.instance;
        aibwVar5.b |= 8;
        aibwVar5.e = id;
        pekVar.a = str;
        pekVar.e = axstVar;
        pekVar.f = axstVar;
        pekVar.d = 1;
        objD = d(str, pekVar);
        if (objD == obj) {
            return obj;
        }
        str2 = str;
        axstVar2 = axstVar;
        aifv aifvVar = (aifv) objD;
        if (aifvVar != null) {
            aihf aihfVar3 = (aihf) axstVar2.a;
            aihfVar3.copyOnWrite();
            aibw aibwVar6 = (aibw) aihfVar3.instance;
            aibw aibwVar7 = aibw.a;
            aibwVar6.g = aifvVar;
            aibwVar6.b |= 64;
        }
        pekVar.a = axstVar;
        pekVar.e = axstVar2;
        pekVar.f = null;
        pekVar.d = 2;
        objD = c(str2, pekVar);
        if (objD == obj) {
            return obj;
        }
        axstVar3 = axstVar2;
        axstVar4 = axstVar;
        str3 = (String) objD;
        if (str3 != null) {
            aihf aihfVar4 = (aihf) axstVar3.a;
            aihfVar4.copyOnWrite();
            aibw aibwVar8 = (aibw) aihfVar4.instance;
            aibw aibwVar9 = aibw.a;
            aibwVar8.b |= 4;
            aibwVar8.d = str3;
        }
        aihn aihnVarBuild4 = ((aihf) axstVar4.a).build();
        aihnVarBuild4.getClass();
        return (aibw) aihnVarBuild4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // defpackage.pds
    public final Object b(pxk pxkVar, ahzv ahzvVar, awoq awoqVar) throws Throwable {
        pel pelVar;
        axst axstVarN;
        Object objY;
        ahub ahubVar;
        ahub ahubVar2;
        ahub ahubVar3;
        axst axstVar;
        if (awoqVar instanceof pel) {
            pelVar = (pel) awoqVar;
            int i = pelVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pelVar.c = i - Integer.MIN_VALUE;
            } else {
                pelVar = new pel(this, awoqVar);
            }
        } else {
            pelVar = new pel(this, awoqVar);
        }
        Object obj = pelVar.a;
        awox awoxVar = awox.a;
        int i2 = pelVar.c;
        if (i2 == 0) {
            atqp.j(obj);
            ahub ahubVarS = aewp.S(ahzn.a.createBuilder());
            axstVarN = aewp.N(ahzm.a.createBuilder());
            Context context = this.c;
            axstVarN.A(context.getResources().getDisplayMetrics().density);
            axstVarN.v(e());
            axstVarN.w(f());
            axstVarN.t(Build.VERSION.SDK_INT);
            axstVarN.K();
            axstVarN.E("998460566");
            axstVarN.H(true != qnl.af(context) ? 2 : 3);
            String str = Build.VERSION.RELEASE;
            if (str != null && str.length() != 0) {
                String str2 = Build.VERSION.RELEASE;
                str2.getClass();
                axstVarN.D(str2);
            }
            String str3 = Build.ID;
            if (str3 != null && str3.length() != 0) {
                String str4 = Build.ID;
                str4.getClass();
                axstVarN.B(str4);
            }
            String str5 = Build.MODEL;
            if (str5 != null && str5.length() != 0) {
                String str6 = Build.MODEL;
                str6.getClass();
                axstVarN.C(str6);
            }
            String str7 = Build.MANUFACTURER;
            if (str7 != null && str7.length() != 0) {
                String str8 = Build.MANUFACTURER;
                str8.getClass();
                axstVarN.z(str8);
            }
            axstVarN.I();
            pgy pgyVar = this.e;
            List listC = pgyVar.c();
            ArrayList arrayList = new ArrayList(atqq.N(listC, 10));
            Iterator it = listC.iterator();
            while (it.hasNext()) {
                arrayList.add(((pgv) it.next()).a());
            }
            axstVarN.F(arrayList);
            axstVarN.J();
            List<pgx> listB = pgyVar.b();
            listB.getClass();
            ArrayList arrayList2 = new ArrayList(atqq.N(listB, 10));
            for (pgx pgxVar : listB) {
                aihf aihfVarCreateBuilder = ahya.a.createBuilder();
                String str9 = pgxVar.a;
                aihfVarCreateBuilder.copyOnWrite();
                ahya ahyaVar = (ahya) aihfVarCreateBuilder.instance;
                str9.getClass();
                ahyaVar.b |= 1;
                ahyaVar.c = str9;
                ahxz ahxzVar = pgxVar.b ? ahxz.BANNED : ahxz.ALLOWED;
                aihfVarCreateBuilder.copyOnWrite();
                ahya ahyaVar2 = (ahya) aihfVarCreateBuilder.instance;
                ahyaVar2.d = ahxzVar.d;
                ahyaVar2.b |= 2;
                arrayList2.add((ahya) aihfVarCreateBuilder.build());
            }
            axstVarN.G(arrayList2);
            axstVarN.u(new auy(context).c() ? ahzb.ALLOWED : ahzb.BANNED);
            axstVarN.x(i());
            String strG = g();
            if (strG != null && strG.length() != 0) {
                axstVarN.y(strG);
            }
            pelVar.f = ahubVarS;
            pelVar.g = ahubVarS;
            pelVar.d = axstVarN;
            pelVar.h = ahubVarS;
            pelVar.e = axstVarN;
            pelVar.c = 1;
            if (!atqq.ay(b, ahzvVar) || pxkVar == null) {
                aihf aihfVarCreateBuilder2 = ahzl.a.createBuilder();
                aihfVarCreateBuilder2.getClass();
                objY = aewo.y(aihfVarCreateBuilder2);
            } else {
                objY = this.j.W(pxkVar, pelVar);
            }
            if (objY == awoxVar) {
                return awoxVar;
            }
            ahubVar = ahubVarS;
            ahubVar2 = ahubVar;
            ahubVar3 = ahubVar2;
            obj = objY;
            axstVar = axstVarN;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            axstVar = pelVar.e;
            ahubVar2 = pelVar.h;
            axstVarN = pelVar.d;
            ahubVar3 = pelVar.g;
            ahubVar = pelVar.f;
            atqp.j(obj);
        }
        ahzl ahzlVar = (ahzl) obj;
        ahzlVar.getClass();
        aihf aihfVar = (aihf) axstVar.a;
        aihfVar.copyOnWrite();
        ahzm ahzmVar = (ahzm) aihfVar.instance;
        ahzm ahzmVar2 = ahzm.a;
        ahzmVar.r = ahzlVar;
        ahzmVar.b |= 32768;
        ahubVar2.J(axstVarN.s());
        ahubVar3.K(h());
        String id = TimeZone.getDefault().getID();
        id.getClass();
        ahubVar3.L(id);
        return ahubVar.I();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0062 A[Catch: Exception -> 0x007b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x007b, blocks: (B:20:0x0043, B:29:0x0062), top: B:39:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, awoq awoqVar) throws Throwable {
        pem pemVar;
        if (awoqVar instanceof pem) {
            pemVar = (pem) awoqVar;
            int i = pemVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pemVar.c = i - Integer.MIN_VALUE;
            } else {
                pemVar = new pem(this, awoqVar);
            }
        } else {
            pemVar = new pem(this, awoqVar);
        }
        Object objK = pemVar.a;
        awox awoxVar = awox.a;
        int i2 = pemVar.c;
        try {
            if (i2 == 0) {
                atqp.j(objK);
                if (str != null) {
                    omm ommVar = this.i;
                    pemVar.d = str;
                    pemVar.c = 1;
                    objK = ommVar.k(pemVar);
                    if (objK == awoxVar) {
                        objK = awoxVar;
                    } else if (objK == pqk.GNP) {
                        Object obj = ((agfa) this.g).a;
                        new pxo(str);
                        pemVar.d = str;
                        pemVar.c = 2;
                        objK = ((omm) obj).b(pemVar);
                        if (objK == awoxVar) {
                            objK = awoxVar;
                        }
                    }
                }
                return null;
            }
            if (i2 == 1) {
                str = pemVar.d;
                atqp.j(objK);
                if (objK == pqk.GNP) {
                    Object obj2 = ((agfa) this.g).a;
                    new pxo(str);
                    pemVar.d = str;
                    pemVar.c = 2;
                    objK = ((omm) obj2).b(pemVar);
                    if (objK == awoxVar) {
                        objK = awoxVar;
                    }
                }
                return null;
            }
            if (i2 == 2) {
                atqp.j(objK);
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    atqp.j(objK);
                    return objK;
                } catch (Exception e) {
                    ((agsj) ((agsj) a.c()).j(e)).t("Failed getting language code from DevicePayloadProvider");
                }
            }
            return objK;
        } catch (Exception e2) {
            ((agsj) ((agsj) a.c()).j(e2)).t("Failed getting language code from GnpRegistrationDataProvider");
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00bb A[Catch: Exception -> 0x00ef, TRY_ENTER, TryCatch #0 {Exception -> 0x00ef, blocks: (B:26:0x0081, B:38:0x00d2, B:42:0x00e8, B:36:0x00bb), top: B:48:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d2 A[Catch: Exception -> 0x00ef, PHI: r2
      0x00d2: PHI (r2v19 java.lang.Object) = (r2v18 java.lang.Object), (r2v1 java.lang.Object) binds: [B:37:0x00d0, B:26:0x0081] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x00ef, blocks: (B:26:0x0081, B:38:0x00d2, B:42:0x00e8, B:36:0x00bb), top: B:48:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object d(String str, awoq awoqVar) throws Throwable {
        pen penVar;
        boolean z;
        String str2 = str;
        if (awoqVar instanceof pen) {
            penVar = (pen) awoqVar;
            int i = penVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                penVar.c = i - Integer.MIN_VALUE;
            } else {
                penVar = new pen(this, awoqVar);
            }
        } else {
            penVar = new pen(this, awoqVar);
        }
        Object objK = penVar.a;
        Object obj = awox.a;
        int i2 = penVar.c;
        try {
            if (i2 == 0) {
                atqp.j(objK);
                if (str2 != null) {
                    omm ommVar = this.i;
                    penVar.d = str2;
                    penVar.c = 1;
                    objK = ommVar.k(penVar);
                    if (objK != obj) {
                        if (objK == pqk.GNP) {
                            Object obj2 = ((agfa) this.g).a;
                            new pxo(str2);
                            penVar.d = str2;
                            penVar.c = 2;
                            objK = ((omm) obj2).a(penVar);
                            if (objK != obj) {
                                obj = (aifv) objK;
                                pwf pwfVar = this.h;
                                String packageName = this.c.getPackageName();
                                String str3 = this.d.a;
                                if (obj == null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                pwfVar.f(packageName, str3, "RENDER_CONTEXT_HELPER", false, z, "SUCCESS_REGISTRATION_DATA_PROVIDER");
                            }
                        }
                        this.h.f(this.c.getPackageName(), this.d.a, "RENDER_CONTEXT_HELPER", false, true, "NO_DEVICE_PAYLOAD_PROVIDER");
                    }
                    return obj;
                }
                this.h.f(this.c.getPackageName(), this.d.a, "RENDER_CONTEXT_HELPER", true, true, "NO_DEVICE_PAYLOAD_REQUESTED");
                return null;
            }
            if (i2 == 1) {
                str2 = penVar.d;
                atqp.j(objK);
                if (objK == pqk.GNP) {
                    Object obj3 = ((agfa) this.g).a;
                    new pxo(str2);
                    penVar.d = str2;
                    penVar.c = 2;
                    objK = ((omm) obj3).a(penVar);
                    if (objK != obj) {
                        obj = (aifv) objK;
                        pwf pwfVar2 = this.h;
                        String packageName2 = this.c.getPackageName();
                        String str4 = this.d.a;
                        if (obj == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        pwfVar2.f(packageName2, str4, "RENDER_CONTEXT_HELPER", false, z, "SUCCESS_REGISTRATION_DATA_PROVIDER");
                    }
                    return obj;
                }
                this.h.f(this.c.getPackageName(), this.d.a, "RENDER_CONTEXT_HELPER", false, true, "NO_DEVICE_PAYLOAD_PROVIDER");
                return null;
            }
            if (i2 == 2) {
                atqp.j(objK);
                obj = (aifv) objK;
                pwf pwfVar3 = this.h;
                String packageName3 = this.c.getPackageName();
                String str5 = this.d.a;
                if (obj == null) {
                    z = true;
                } else {
                    z = false;
                }
                pwfVar3.f(packageName3, str5, "RENDER_CONTEXT_HELPER", false, z, "SUCCESS_REGISTRATION_DATA_PROVIDER");
                return obj;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                atqp.j(objK);
                aifv aifvVar = (aifv) objK;
                this.h.f(this.c.getPackageName(), this.d.a, "RENDER_CONTEXT_HELPER", false, aifvVar == null, "SUCCESS_DEVICE_PAYLOAD_PROVIDER");
                return aifvVar;
            } catch (Exception e) {
                ((agsj) ((agsj) a.b()).j(e)).t("Failed getting device payload from DevicePayloadProvider");
                this.h.f(this.c.getPackageName(), this.d.a, "RENDER_CONTEXT_HELPER", false, true, "EXCEPTION_DEVICE_PAYLOAD_PROVIDER");
            }
        } catch (Exception e2) {
            ((agsj) ((agsj) a.b()).j(e2)).t("Failed getting device payload from GnpRegistrationDataProvider");
            this.h.f(this.c.getPackageName(), this.d.a, "RENDER_CONTEXT_HELPER", false, true, "EXCEPTION_REGISTRATION_DATA_PROVIDER");
        }
    }
}
