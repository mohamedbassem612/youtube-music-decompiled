package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
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
public final class pwz implements pwl {
    private static final agsn a = agsn.h("GnpSdk");
    private final Context b;
    private final pls c;
    private final agev d;
    private final agev e;
    private final pup f;
    private final awmd g;
    private final pwf h;

    public pwz(Context context, pls plsVar, agev agevVar, agev agevVar2, pup pupVar, ahex ahexVar, awmd awmdVar, pwf pwfVar) {
        context.getClass();
        plsVar.getClass();
        ahexVar.getClass();
        awmdVar.getClass();
        pwfVar.getClass();
        this.b = context;
        this.c = plsVar;
        this.d = agevVar;
        this.e = agevVar2;
        this.f = pupVar;
        this.g = awmdVar;
        this.h = pwfVar;
    }

    private final String e() {
        String languageTag = this.b.getResources().getConfiguration().getLocales().get(0).toLanguageTag();
        languageTag.getClass();
        return languageTag;
    }

    private final aibv f() {
        String str;
        List arrayList;
        Iterable iterable;
        aibq aibqVar;
        String strValueOf = "";
        aihf aihfVarCreateBuilder = aibv.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        Context context = this.b;
        ahng.bh(context.getResources().getDisplayMetrics().density, aihfVarCreateBuilder);
        boolean zD = false;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (str == null) {
                str = "";
            }
        } catch (PackageManager.NameNotFoundException e) {
            ((agsj) ((agsj) a.b()).j(e)).t("Couldn't get app version name.");
        }
        ahng.bb(str, aihfVarCreateBuilder);
        try {
            Context context2 = this.b;
            PackageInfo packageInfo = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0);
            strValueOf = a.aK() ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        } catch (PackageManager.NameNotFoundException e2) {
            ((agsj) ((agsj) a.b()).j(e2)).t("Couldn't get app version code.");
        }
        ahng.bc(strValueOf, aihfVarCreateBuilder);
        ahng.aZ(Build.VERSION.SDK_INT, aihfVarCreateBuilder);
        ahng.bp(aihfVarCreateBuilder);
        ahng.bq(aihfVarCreateBuilder);
        Context context3 = this.b;
        ahng.ba(new auy(context3).c() ? aibo.ALLOWED : aibo.BANNED, aihfVarCreateBuilder);
        try {
            zD = new auy(context3).d();
        } catch (Throwable unused) {
        }
        ahng.bd(zD, aihfVarCreateBuilder);
        ahng.bn(aihfVarCreateBuilder);
        try {
            List notificationChannels = new auy(this.b).d.getNotificationChannels();
            notificationChannels.getClass();
            arrayList = new ArrayList(atqq.N(notificationChannels, 10));
            Iterator it = notificationChannels.iterator();
            while (it.hasNext()) {
                NotificationChannel notificationChannelM = bd$$ExternalSyntheticApiModelOutline1.m(it.next());
                aihf aihfVarCreateBuilder2 = aibr.a.createBuilder();
                aihfVarCreateBuilder2.getClass();
                String id = notificationChannelM.getId();
                id.getClass();
                ahno.q(id, aihfVarCreateBuilder2);
                int importance = notificationChannelM.getImportance();
                if (importance == 0) {
                    aibqVar = aibq.IMPORTANCE_NONE;
                } else if (importance == 1) {
                    aibqVar = aibq.IMPORTANCE_MIN;
                } else if (importance == 2) {
                    aibqVar = aibq.IMPORTANCE_LOW;
                } else if (importance == 3) {
                    aibqVar = aibq.IMPORTANCE_DEFAULT;
                } else if (importance != 4) {
                    aibqVar = importance != 5 ? aibq.IMPORTANCE_UNSPECIFIED : aibq.IMPORTANCE_MAX;
                } else {
                    aibqVar = aibq.IMPORTANCE_HIGH;
                }
                ahno.s(aibqVar, aihfVarCreateBuilder2);
                ahno.p(notificationChannelM.canShowBadge() ? aibp.TRUE : aibp.FALSE, aihfVarCreateBuilder2);
                String group = notificationChannelM.getGroup();
                if (group != null && group.length() != 0) {
                    String group2 = notificationChannelM.getGroup();
                    group2.getClass();
                    ahno.r(group2, aihfVarCreateBuilder2);
                }
                aihn aihnVarBuild = aihfVarCreateBuilder2.build();
                aihnVarBuild.getClass();
                arrayList.add((aibr) aihnVarBuild);
            }
        } catch (NullPointerException e3) {
            ((agsj) ((agsj) a.c()).j(e3)).t("Failed to get notification channels from Android.");
            arrayList = awno.a;
        }
        ahng.bl(arrayList, aihfVarCreateBuilder);
        ahng.bo(aihfVarCreateBuilder);
        if (a.aK()) {
            try {
                List notificationChannelGroups = new auy(this.b).d.getNotificationChannelGroups();
                notificationChannelGroups.getClass();
                ArrayList arrayList2 = new ArrayList(atqq.N(notificationChannelGroups, 10));
                Iterator it2 = notificationChannelGroups.iterator();
                while (it2.hasNext()) {
                    NotificationChannelGroup notificationChannelGroupM = gp$$ExternalSyntheticApiModelOutline2.m(it2.next());
                    aihf aihfVarCreateBuilder3 = aibt.a.createBuilder();
                    aihfVarCreateBuilder3.getClass();
                    String id2 = notificationChannelGroupM.getId();
                    id2.getClass();
                    aext.O(id2, aihfVarCreateBuilder3);
                    aext.N(notificationChannelGroupM.isBlocked() ? aibs.BANNED : aibs.ALLOWED, aihfVarCreateBuilder3);
                    arrayList2.add(aext.M(aihfVarCreateBuilder3));
                }
                iterable = arrayList2;
            } catch (NullPointerException e4) {
                ((agsj) ((agsj) a.c()).j(e4)).t("Failed to get notification channel groups from Android.");
                iterable = awno.a;
            }
        } else {
            iterable = awno.a;
        }
        ahng.bm(iterable, aihfVarCreateBuilder);
        String str2 = this.c.d;
        if (str2 != null && str2.length() != 0) {
            ahng.bg(str2, aihfVarCreateBuilder);
        }
        String str3 = Build.VERSION.RELEASE;
        if (str3 != null && str3.length() != 0) {
            String str4 = Build.VERSION.RELEASE;
            str4.getClass();
            ahng.bk(str4, aihfVarCreateBuilder);
        }
        String str5 = Build.ID;
        if (str5 != null && str5.length() != 0) {
            String str6 = Build.ID;
            str6.getClass();
            ahng.bi(str6, aihfVarCreateBuilder);
        }
        String str7 = Build.MODEL;
        if (str7 != null && str7.length() != 0) {
            String str8 = Build.MODEL;
            str8.getClass();
            ahng.bj(str8, aihfVarCreateBuilder);
        }
        String str9 = Build.MANUFACTURER;
        if (str9 != null && str9.length() != 0) {
            String str10 = Build.MANUFACTURER;
            str10.getClass();
            ahng.bf(str10, aihfVarCreateBuilder);
        }
        String strA = null;
        try {
            strA = lsx.a.a(this.b.getContentResolver(), "device_country", null);
        } catch (SecurityException e5) {
            ((agsj) ((agsj) a.b()).j(e5)).t("Exception reading GServices 'device_country' key.");
        }
        if (strA != null && strA.length() != 0) {
            ahng.be(strA, aihfVarCreateBuilder);
        }
        aibn aibnVar = (aibn) pwv.a.b(qnl.ad(this.b));
        if (aibnVar != null) {
            ahng.aY(aibnVar, aihfVarCreateBuilder);
        }
        aihn aihnVarBuild2 = aihfVarCreateBuilder.build();
        aihnVarBuild2.getClass();
        return (aibv) aihnVarBuild2;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0105  */
    /* JADX WARN: Code duplicated, block: B:41:0x0124  */
    /* JADX WARN: Code duplicated, block: B:44:0x012a  */
    /* JADX WARN: Code duplicated, block: B:47:0x013b  */
    /* JADX WARN: Code duplicated, block: B:50:0x017f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0185  */
    /* JADX WARN: Code duplicated, block: B:56:0x0198  */
    /* JADX WARN: Code duplicated, block: B:59:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:65:0x0207  */
    /* JADX WARN: Code duplicated, block: B:67:0x0211  */
    /* JADX WARN: Code duplicated, block: B:68:0x0218  */
    /* JADX WARN: Code duplicated, block: B:71:0x0221  */
    /* JADX WARN: Code duplicated, block: B:79:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.pwl
    public final Object a(pxk pxkVar, Set set, plv plvVar, awoq awoqVar) throws Throwable {
        pww pwwVar;
        agev agevVar;
        pxk pxkVar2;
        aihf aihfVar;
        Object obj;
        aifv aifvVar;
        aibv aibvVar;
        aiej aiejVar;
        aibv aibvVar2;
        aibv aibvVar3;
        aiej aiejVar2;
        aibv aibvVar4;
        aibv aibvVar5;
        aiej aiejVarA;
        aiej aiejVar3;
        ArrayList arrayList;
        int iMax;
        int i;
        long jA;
        long jA2;
        if (awoqVar instanceof pww) {
            pwwVar = (pww) awoqVar;
            int i2 = pwwVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pwwVar.f = i2 - Integer.MIN_VALUE;
            } else {
                pwwVar = new pww(this, awoqVar);
            }
        } else {
            pwwVar = new pww(this, awoqVar);
        }
        Object objC = pwwVar.d;
        Object obj2 = awox.a;
        int i3 = pwwVar.f;
        if (i3 != 0) {
            if (i3 == 1) {
                Object obj3 = pwwVar.c;
                aihf aihfVar2 = pwwVar.g;
                Set set2 = (Set) pwwVar.b;
                pxkVar2 = (pxk) pwwVar.a;
                atqp.j(objC);
                obj = obj3;
                aihfVar = aihfVar2;
                set = set2;
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aihfVar = (aihf) pwwVar.b;
                set = (Set) pwwVar.a;
                atqp.j(objC);
            }
            aifvVar = (aifv) objC;
            if (aifvVar != null) {
                aihfVar.copyOnWrite();
                aibw aibwVar = (aibw) aihfVar.instance;
                aibw aibwVar2 = aibw.a;
                aibwVar.g = aifvVar;
                aibwVar.b |= 64;
            }
            boolean zContains = set.contains(pya.IN_APP);
            aibvVar = ((aibw) aihfVar.instance).f;
            if (aibvVar == null) {
                aibvVar = aibv.a;
            }
            aiejVar = aibvVar.s;
            if (aiejVar == null) {
                aiejVar = aiej.a;
            }
            aihf builder = aiejVar.toBuilder();
            qnl.Z(builder, 2, zContains);
            aibvVar2 = ((aibw) aihfVar.instance).f;
            if (aibvVar2 == null) {
                aibvVar2 = aibv.a;
            }
            aihf builder2 = aibvVar2.toBuilder();
            builder2.copyOnWrite();
            aibv aibvVar6 = (aibv) builder2.instance;
            aiej aiejVar4 = (aiej) builder.build();
            aiejVar4.getClass();
            aibvVar6.s = aiejVar4;
            aibvVar6.b |= 16384;
            aihfVar.copyOnWrite();
            aibw aibwVar3 = (aibw) aihfVar.instance;
            aibv aibvVar7 = (aibv) builder2.build();
            aibvVar7.getClass();
            aibwVar3.f = aibvVar7;
            aibwVar3.b |= 32;
            boolean zContains2 = set.contains(pya.SYSTEM_TRAY);
            aibvVar3 = ((aibw) aihfVar.instance).f;
            if (aibvVar3 == null) {
                aibvVar3 = aibv.a;
            }
            aiejVar2 = aibvVar3.s;
            if (aiejVar2 == null) {
                aiejVar2 = aiej.a;
            }
            aihf builder3 = aiejVar2.toBuilder();
            qnl.Z(builder3, 3, !zContains2);
            aibvVar4 = ((aibw) aihfVar.instance).f;
            if (aibvVar4 == null) {
                aibvVar4 = aibv.a;
            }
            aihf builder4 = aibvVar4.toBuilder();
            builder4.copyOnWrite();
            aibv aibvVar8 = (aibv) builder4.instance;
            aiej aiejVar5 = (aiej) builder3.build();
            aiejVar5.getClass();
            aibvVar8.s = aiejVar5;
            aibvVar8.b |= 16384;
            aihfVar.copyOnWrite();
            aibw aibwVar4 = (aibw) aihfVar.instance;
            aibv aibvVar9 = (aibv) builder4.build();
            aibvVar9.getClass();
            aibwVar4.f = aibvVar9;
            aibwVar4.b |= 32;
            aibvVar5 = ((aibw) aihfVar.instance).f;
            if (aibvVar5 == null) {
                aibvVar5 = aibv.a;
            }
            aihf builder5 = aibvVar5.toBuilder();
            builder5.getClass();
            pup pupVar = this.f;
            aiejVarA = pupVar.a();
            aiejVar3 = ((aibv) builder5.instance).s;
            if (aiejVar3 == null) {
                aiejVar3 = aiej.a;
            }
            arrayList = new ArrayList();
            iMax = Math.max(aiejVarA.b.size(), aiejVar3.b.size());
            for (i = 0; i < iMax; i++) {
                jA = 0;
                if (i < aiejVarA.b.size()) {
                    jA2 = aiejVarA.b.a(i);
                } else {
                    jA2 = 0;
                }
                if (i < aiejVar3.b.size()) {
                    jA = aiejVar3.b.a(i);
                }
                arrayList.add(Long.valueOf(jA2 | jA));
            }
            aihf aihfVarCreateBuilder = aiej.a.createBuilder();
            aihfVarCreateBuilder.at(arrayList);
            aiej aiejVar6 = (aiej) aihfVarCreateBuilder.build();
            builder5.copyOnWrite();
            aibv aibvVar10 = (aibv) builder5.instance;
            aiejVar6.getClass();
            aibvVar10.s = aiejVar6;
            aibvVar10.b |= 16384;
            aiew aiewVarB = pupVar.b();
            builder5.copyOnWrite();
            aibv aibvVar11 = (aibv) builder5.instance;
            aiewVarB.getClass();
            aibvVar11.t = aiewVarB;
            aibvVar11.b |= 32768;
            aihfVar.copyOnWrite();
            aibw aibwVar5 = (aibw) aihfVar.instance;
            aibv aibvVar12 = (aibv) builder5.build();
            aibvVar12.getClass();
            aibwVar5.f = aibvVar12;
            aibwVar5.b |= 32;
            aihn aihnVarBuild = aihfVar.build();
            aihnVarBuild.getClass();
            return aihnVarBuild;
        }
        atqp.j(objC);
        aihf aihfVarCreateBuilder2 = aibw.a.createBuilder();
        String strE = e();
        aihfVarCreateBuilder2.copyOnWrite();
        aibw aibwVar6 = (aibw) aihfVarCreateBuilder2.instance;
        aibwVar6.b |= 1;
        aibwVar6.c = strE;
        String id = TimeZone.getDefault().getID();
        aihfVarCreateBuilder2.copyOnWrite();
        aibw aibwVar7 = (aibw) aihfVarCreateBuilder2.instance;
        id.getClass();
        aibwVar7.b |= 8;
        aibwVar7.e = id;
        aibv aibvVarF = f();
        aihfVarCreateBuilder2.copyOnWrite();
        aibw aibwVar8 = (aibw) aihfVarCreateBuilder2.instance;
        aibwVar8.f = aibvVarF;
        aibwVar8.b |= 32;
        if (plvVar.a()) {
            if (((Boolean) this.g.io()).booleanValue()) {
                throw new IllegalStateException("Registration data provider must be provided for GNP unified registrations");
            }
            agevVar = this.e;
        } else {
            if (!plvVar.b()) {
                throw new IllegalStateException("Unsupported targetType for RequestUtilImpl");
            }
            agevVar = this.d;
        }
        pwwVar.a = pxkVar;
        pwwVar.b = set;
        pwwVar.g = aihfVarCreateBuilder2;
        pwwVar.c = agevVar;
        pwwVar.f = 1;
        Object objD = d(agevVar, pwwVar);
        if (objD == obj2) {
            return obj2;
        }
        pxkVar2 = pxkVar;
        aihfVar = aihfVarCreateBuilder2;
        objC = objD;
        obj = agevVar;
        String str = (String) objC;
        if (str != null && str.length() != 0) {
            aihfVar.copyOnWrite();
            aibw aibwVar9 = (aibw) aihfVar.instance;
            aibw aibwVar10 = aibw.a;
            aibwVar9.b |= 4;
            aibwVar9.d = str;
        }
        pwwVar.a = set;
        pwwVar.b = aihfVar;
        pwwVar.g = null;
        pwwVar.c = null;
        pwwVar.f = 2;
        objC = c(pxkVar2, (agev) obj, pwwVar);
        if (objC == obj2) {
            return obj2;
        }
        aifvVar = (aifv) objC;
        if (aifvVar != null) {
            aihfVar.copyOnWrite();
            aibw aibwVar11 = (aibw) aihfVar.instance;
            aibw aibwVar12 = aibw.a;
            aibwVar11.g = aifvVar;
            aibwVar11.b |= 64;
        }
        boolean zContains3 = set.contains(pya.IN_APP);
        aibvVar = ((aibw) aihfVar.instance).f;
        if (aibvVar == null) {
            aibvVar = aibv.a;
        }
        aiejVar = aibvVar.s;
        if (aiejVar == null) {
            aiejVar = aiej.a;
        }
        aihf builder6 = aiejVar.toBuilder();
        qnl.Z(builder6, 2, zContains3);
        aibvVar2 = ((aibw) aihfVar.instance).f;
        if (aibvVar2 == null) {
            aibvVar2 = aibv.a;
        }
        aihf builder7 = aibvVar2.toBuilder();
        builder7.copyOnWrite();
        aibv aibvVar13 = (aibv) builder7.instance;
        aiej aiejVar7 = (aiej) builder6.build();
        aiejVar7.getClass();
        aibvVar13.s = aiejVar7;
        aibvVar13.b |= 16384;
        aihfVar.copyOnWrite();
        aibw aibwVar13 = (aibw) aihfVar.instance;
        aibv aibvVar14 = (aibv) builder7.build();
        aibvVar14.getClass();
        aibwVar13.f = aibvVar14;
        aibwVar13.b |= 32;
        boolean zContains4 = set.contains(pya.SYSTEM_TRAY);
        aibvVar3 = ((aibw) aihfVar.instance).f;
        if (aibvVar3 == null) {
            aibvVar3 = aibv.a;
        }
        aiejVar2 = aibvVar3.s;
        if (aiejVar2 == null) {
            aiejVar2 = aiej.a;
        }
        aihf builder8 = aiejVar2.toBuilder();
        qnl.Z(builder8, 3, !zContains4);
        aibvVar4 = ((aibw) aihfVar.instance).f;
        if (aibvVar4 == null) {
            aibvVar4 = aibv.a;
        }
        aihf builder9 = aibvVar4.toBuilder();
        builder9.copyOnWrite();
        aibv aibvVar15 = (aibv) builder9.instance;
        aiej aiejVar8 = (aiej) builder8.build();
        aiejVar8.getClass();
        aibvVar15.s = aiejVar8;
        aibvVar15.b |= 16384;
        aihfVar.copyOnWrite();
        aibw aibwVar14 = (aibw) aihfVar.instance;
        aibv aibvVar16 = (aibv) builder9.build();
        aibvVar16.getClass();
        aibwVar14.f = aibvVar16;
        aibwVar14.b |= 32;
        aibvVar5 = ((aibw) aihfVar.instance).f;
        if (aibvVar5 == null) {
            aibvVar5 = aibv.a;
        }
        aihf builder10 = aibvVar5.toBuilder();
        builder10.getClass();
        pup pupVar2 = this.f;
        aiejVarA = pupVar2.a();
        aiejVar3 = ((aibv) builder10.instance).s;
        if (aiejVar3 == null) {
            aiejVar3 = aiej.a;
        }
        arrayList = new ArrayList();
        iMax = Math.max(aiejVarA.b.size(), aiejVar3.b.size());
        while (i < iMax) {
            jA = 0;
            if (i < aiejVarA.b.size()) {
                jA2 = aiejVarA.b.a(i);
            } else {
                jA2 = 0;
            }
            if (i < aiejVar3.b.size()) {
                jA = aiejVar3.b.a(i);
            }
            arrayList.add(Long.valueOf(jA2 | jA));
        }
        aihf aihfVarCreateBuilder3 = aiej.a.createBuilder();
        aihfVarCreateBuilder3.at(arrayList);
        aiej aiejVar9 = (aiej) aihfVarCreateBuilder3.build();
        builder10.copyOnWrite();
        aibv aibvVar17 = (aibv) builder10.instance;
        aiejVar9.getClass();
        aibvVar17.s = aiejVar9;
        aibvVar17.b |= 16384;
        aiew aiewVarB2 = pupVar2.b();
        builder10.copyOnWrite();
        aibv aibvVar18 = (aibv) builder10.instance;
        aiewVarB2.getClass();
        aibvVar18.t = aiewVarB2;
        aibvVar18.b |= 32768;
        aihfVar.copyOnWrite();
        aibw aibwVar15 = (aibw) aihfVar.instance;
        aibv aibvVar19 = (aibv) builder10.build();
        aibvVar19.getClass();
        aibwVar15.f = aibvVar19;
        aibwVar15.b |= 32;
        aihn aihnVarBuild2 = aihfVar.build();
        aihnVarBuild2.getClass();
        return aihnVarBuild2;
    }

    @Override // defpackage.pwl
    public final ahzn b() {
        aibv aibvVarF = f();
        ahub ahubVarS = aewp.S(ahzn.a.createBuilder());
        ahubVarS.K(e());
        String id = TimeZone.getDefault().getID();
        id.getClass();
        ahubVarS.L(id);
        axst axstVarN = aewp.N(ahzm.a.createBuilder());
        axstVarN.A(aibvVarF.c);
        String str = aibvVarF.f;
        str.getClass();
        axstVarN.v(str);
        String str2 = aibvVarF.g;
        str2.getClass();
        axstVarN.w(str2);
        axstVarN.t(aibvVarF.k);
        axstVarN.K();
        String str3 = aibvVarF.e;
        str3.getClass();
        axstVarN.E(str3);
        pwm pwmVar = pwm.a;
        aibo aiboVarA = aibo.a(aibvVarF.p);
        if (aiboVarA == null) {
            aiboVarA = aibo.APP_BLOCK_STATE_UNKNOWN;
        }
        ahzb ahzbVar = (ahzb) pwmVar.b(aiboVarA);
        if (ahzbVar != null) {
            axstVarN.u(ahzbVar);
        }
        axstVarN.x(aibvVarF.q);
        axstVarN.H(true != qnl.af(this.b) ? 2 : 3);
        String str4 = aibvVarF.h;
        str4.getClass();
        if (str4.length() > 0) {
            String str5 = aibvVarF.h;
            str5.getClass();
            axstVarN.D(str5);
        }
        String str6 = aibvVarF.i;
        str6.getClass();
        if (str6.length() > 0) {
            String str7 = aibvVarF.i;
            str7.getClass();
            axstVarN.B(str7);
        }
        String str8 = aibvVarF.j;
        str8.getClass();
        if (str8.length() > 0) {
            String str9 = aibvVarF.j;
            str9.getClass();
            axstVarN.C(str9);
        }
        String str10 = aibvVarF.l;
        str10.getClass();
        if (str10.length() > 0) {
            String str11 = aibvVarF.l;
            str11.getClass();
            axstVarN.z(str11);
        }
        String str12 = aibvVarF.r;
        str12.getClass();
        if (str12.length() > 0) {
            String str13 = aibvVarF.r;
            str13.getClass();
            axstVarN.y(str13);
        }
        axstVarN.I();
        aiie<aibr> aiieVar = aibvVarF.n;
        aiieVar.getClass();
        ArrayList arrayList = new ArrayList(atqq.N(aiieVar, 10));
        for (aibr aibrVar : aiieVar) {
            aihf aihfVarCreateBuilder = ahyd.a.createBuilder();
            aihfVarCreateBuilder.getClass();
            String str14 = aibrVar.c;
            str14.getClass();
            aihfVarCreateBuilder.copyOnWrite();
            ahyd ahydVar = (ahyd) aihfVarCreateBuilder.instance;
            ahydVar.b |= 1;
            ahydVar.c = str14;
            pwu pwuVar = pwu.a;
            aibq aibqVarA = aibq.a(aibrVar.e);
            if (aibqVarA == null) {
                aibqVarA = aibq.IMPORTANCE_UNSPECIFIED;
            }
            ahyc ahycVar = (ahyc) pwuVar.b(aibqVarA);
            if (ahycVar != null) {
                aihfVarCreateBuilder.copyOnWrite();
                ahyd ahydVar2 = (ahyd) aihfVarCreateBuilder.instance;
                ahydVar2.e = ahycVar.h;
                ahydVar2.b |= 4;
            }
            pws pwsVar = pws.a;
            aibp aibpVarA = aibp.a(aibrVar.f);
            if (aibpVarA == null) {
                aibpVarA = aibp.UNSPECIFIED;
            }
            ahyb ahybVar = (ahyb) pwsVar.b(aibpVarA);
            if (ahybVar != null) {
                aihfVarCreateBuilder.copyOnWrite();
                ahyd ahydVar3 = (ahyd) aihfVarCreateBuilder.instance;
                ahydVar3.f = ahybVar.d;
                ahydVar3.b |= 8;
            }
            String str15 = aibrVar.d;
            str15.getClass();
            if (str15.length() > 0) {
                String str16 = aibrVar.d;
                str16.getClass();
                aihfVarCreateBuilder.copyOnWrite();
                ahyd ahydVar4 = (ahyd) aihfVarCreateBuilder.instance;
                ahydVar4.b |= 2;
                ahydVar4.d = str16;
            }
            aihn aihnVarBuild = aihfVarCreateBuilder.build();
            aihnVarBuild.getClass();
            arrayList.add((ahyd) aihnVarBuild);
        }
        axstVarN.F(arrayList);
        axstVarN.J();
        aiie<aibt> aiieVar2 = aibvVarF.o;
        aiieVar2.getClass();
        ArrayList arrayList2 = new ArrayList(atqq.N(aiieVar2, 10));
        for (aibt aibtVar : aiieVar2) {
            aihf aihfVarCreateBuilder2 = ahya.a.createBuilder();
            aihfVarCreateBuilder2.getClass();
            String str17 = aibtVar.c;
            str17.getClass();
            aihfVarCreateBuilder2.copyOnWrite();
            ahya ahyaVar = (ahya) aihfVarCreateBuilder2.instance;
            ahyaVar.b |= 1;
            ahyaVar.c = str17;
            pwt pwtVar = pwt.a;
            aibs aibsVarA = aibs.a(aibtVar.d);
            if (aibsVarA == null) {
                aibsVarA = aibs.CHANNEL_GROUP_UNKNOWN;
            }
            ahxz ahxzVar = (ahxz) pwtVar.b(aibsVarA);
            if (ahxzVar != null) {
                aihfVarCreateBuilder2.copyOnWrite();
                ahya ahyaVar2 = (ahya) aihfVarCreateBuilder2.instance;
                ahyaVar2.d = ahxzVar.d;
                ahyaVar2.b |= 2;
            }
            aihn aihnVarBuild2 = aihfVarCreateBuilder2.build();
            aihnVarBuild2.getClass();
            arrayList2.add((ahya) aihnVarBuild2);
        }
        axstVarN.G(arrayList2);
        ahubVarS.J(axstVarN.s());
        return ahubVarS.I();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0081  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public final Object c(pxk pxkVar, agev agevVar, awoq awoqVar) throws Throwable {
        pwy pwyVar;
        String str;
        String str2;
        aifv aifvVar;
        if (awoqVar instanceof pwy) {
            pwyVar = (pwy) awoqVar;
            int i = pwyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pwyVar.c = i - Integer.MIN_VALUE;
            } else {
                pwyVar = new pwy(this, awoqVar);
            }
        } else {
            pwyVar = new pwy(this, awoqVar);
        }
        Object objA = pwyVar.a;
        awox awoxVar = awox.a;
        int i2 = pwyVar.c;
        try {
            if (i2 == 0) {
                atqp.j(objA);
                if (pxkVar.b()) {
                    this.h.f(this.b.getPackageName(), this.c.a, "REQUEST_UTIL", true, true, "NO_DEVICE_PAYLOAD_REQUESTED");
                    return null;
                }
                if (!agevVar.g()) {
                    ((agsj) a.b()).t("Can't get device payload - no registration data provider");
                    str = "NO_REGISTRATION_DATA_PROVIDER";
                    str2 = str;
                    aifvVar = null;
                    this.h.f(this.b.getPackageName(), this.c.a, "REQUEST_UTIL", false, aifvVar == null, str2);
                    return aifvVar;
                }
                Object objC = agevVar.c();
                pwyVar.c = 1;
                objA = ((omm) objC).a(pwyVar);
                if (objA == awoxVar) {
                    return awoxVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(objA);
            }
            str2 = "SUCCESS_REGISTRATION_DATA_PROVIDER";
            aifvVar = (aifv) objA;
        } catch (Exception e) {
            ((agsj) ((agsj) a.b()).j(e)).t("Failed getting device payload");
            str = "EXCEPTION_REGISTRATION_DATA_PROVIDER";
        }
        if (aifvVar == null) {
        }
        this.h.f(this.b.getPackageName(), this.c.a, "REQUEST_UTIL", false, aifvVar == null, str2);
        return aifvVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(agev agevVar, awoq awoqVar) throws Throwable {
        pwx pwxVar;
        if (awoqVar instanceof pwx) {
            pwxVar = (pwx) awoqVar;
            int i = pwxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pwxVar.c = i - Integer.MIN_VALUE;
            } else {
                pwxVar = new pwx(this, awoqVar);
            }
        } else {
            pwxVar = new pwx(this, awoqVar);
        }
        Object objB = pwxVar.a;
        awox awoxVar = awox.a;
        int i2 = pwxVar.c;
        try {
            if (i2 == 0) {
                atqp.j(objB);
                if (!agevVar.g()) {
                    ((agsj) a.c()).t("Can't get account language code - no registration data provider");
                    return null;
                }
                Object objC = agevVar.c();
                pwxVar.c = 1;
                objB = ((omm) objC).b(pwxVar);
                if (objB == awoxVar) {
                    return awoxVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(objB);
            }
            return (String) objB;
        } catch (Exception e) {
            ((agsj) ((agsj) a.b()).j(e)).t("Failed getting language code");
        }
    }
}
