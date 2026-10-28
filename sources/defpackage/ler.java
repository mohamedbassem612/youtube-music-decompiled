package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.Objects;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ler extends lbc {
    public leq a;
    public final Set b;
    public boolean c;
    public lbw d;
    public SharedPreferences.OnSharedPreferenceChangeListener e;
    public lbw f;
    public final AtomicBoolean g;
    public final lfz h;
    public final kjc i;
    private boolean j;
    private final AtomicReference k;
    private final Object l;
    private lgt m;
    private lgh n;
    private final AtomicLong o;
    private long p;
    private volatile ExecutorService q;
    private lbf r;

    protected ler(ldr ldrVar) {
        super(ldrVar);
        this.b = new CopyOnWriteArraySet();
        this.l = new Object();
        this.c = true;
        this.g = new AtomicBoolean(false);
        this.h = new len(this);
        this.k = new AtomicReference();
        this.n = lgh.a;
        this.p = -1L;
        this.o = new AtomicLong(0L);
        this.i = new kjc(ldrVar);
    }

    private final lhn ao(final lfl lflVar) {
        try {
            URL url = new URI(lflVar.c).toURL();
            final AtomicReference atomicReference = new AtomicReference();
            lct lctVarH = h();
            lctVarH.a();
            kro.l(lctVarH.a);
            String str = lctVarH.a;
            lcx lcxVar = aT().k;
            Long lValueOf = Long.valueOf(lflVar.a);
            lcxVar.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, lflVar.c, Integer.valueOf(lflVar.b.length));
            if (!TextUtils.isEmpty(lflVar.g)) {
                aT().k.c("[sgtm] Uploading data from app. row_id", lValueOf, lflVar.g);
            }
            HashMap map = new HashMap();
            Bundle bundle = lflVar.d;
            for (String str2 : bundle.keySet()) {
                String string = bundle.getString(str2);
                if (!TextUtils.isEmpty(string)) {
                    map.put(str2, string);
                }
            }
            lev levVarK = K();
            byte[] bArr = lflVar.b;
            let letVar = new let() { // from class: leg
                /* JADX WARN: Code duplicated, block: B:10:0x0016  */
                /* JADX WARN: Code duplicated, block: B:11:0x002a A[PHI: r8
                  0x002a: PHI (r8v7 int) = (r8v1 int), (r8v0 int) binds: [B:9:0x0014, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:13:0x005c  */
                /* JADX WARN: Code duplicated, block: B:14:0x005f  */
                @Override // defpackage.let
                public final void a(int i, Throwable th, byte[] bArr2) {
                    lhn lhnVar;
                    ler lerVar = this.a;
                    lerVar.o();
                    lfl lflVar2 = lflVar;
                    if (i == 200 || i == 204) {
                        if (th == null) {
                            lerVar.aT().k.b("[sgtm] Upload succeeded for row_id", Long.valueOf(lflVar2.a));
                            lhnVar = lhn.SUCCESS;
                        } else {
                            lerVar.aT().f.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(lflVar2.a), Integer.valueOf(i), th);
                            if (Arrays.asList(((String) lcl.v.b(null)).split(",")).contains(String.valueOf(i))) {
                                lhnVar = lhn.BACKOFF;
                            } else {
                                lhnVar = lhn.FAILURE;
                            }
                        }
                    } else if (i == 304) {
                        i = 304;
                        if (th == null) {
                            lerVar.aT().k.b("[sgtm] Upload succeeded for row_id", Long.valueOf(lflVar2.a));
                            lhnVar = lhn.SUCCESS;
                        } else {
                            lerVar.aT().f.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(lflVar2.a), Integer.valueOf(i), th);
                            if (Arrays.asList(((String) lcl.v.b(null)).split(",")).contains(String.valueOf(i))) {
                                lhnVar = lhn.BACKOFF;
                            } else {
                                lhnVar = lhn.FAILURE;
                            }
                        }
                    } else {
                        lerVar.aT().f.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(lflVar2.a), Integer.valueOf(i), th);
                        if (Arrays.asList(((String) lcl.v.b(null)).split(",")).contains(String.valueOf(i))) {
                            lhnVar = lhn.BACKOFF;
                        } else {
                            lhnVar = lhn.FAILURE;
                        }
                    }
                    AtomicReference atomicReference2 = atomicReference;
                    lff lffVarJ = lerVar.j();
                    long j = lflVar2.a;
                    lbp lbpVar = new lbp(j, lhnVar.e, lflVar2.f);
                    lffVarJ.o();
                    lffVarJ.a();
                    lffVarJ.B(new lez(lffVarJ, lffVarJ.s(true), lbpVar, 1));
                    lerVar.aT().k.c("[sgtm] Updated status for row_id", Long.valueOf(j), lhnVar);
                    synchronized (atomicReference2) {
                        atomicReference2.set(lhnVar);
                        atomicReference2.notifyAll();
                    }
                }
            };
            levVarK.m();
            kro.l(url);
            kro.l(bArr);
            levVarK.aU().i(new leu(levVarK, str, url, bArr, map, letVar));
            try {
                L();
                long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
                synchronized (atomicReference) {
                    for (long jCurrentTimeMillis2 = 60000; atomicReference.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis()) {
                        try {
                            atomicReference.wait(jCurrentTimeMillis2);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (InterruptedException unused) {
                aT().f.a("[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == null ? lhn.UNKNOWN : (lhn) atomicReference.get();
        } catch (MalformedURLException | URISyntaxException e) {
            aT().c.d("[sgtm] Bad upload url for row_id", lflVar.c, Long.valueOf(lflVar.a), e);
            return lhn.FAILURE;
        }
    }

    private final void ap() {
        if (G().F(null, lcl.aS) && G().F(null, lcl.ba)) {
            if (!G().F(null, lcl.aT)) {
                j().y(Collections.singletonList(new lbx("event_dropped_count", "invalid_event_name", 1, 0L)));
            } else {
                t().d("invalid_event_name");
                t().a();
            }
        }
    }

    public final void A(String str, String str2, Bundle bundle) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        kro.i(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        aU().j(new ldu((Object) this, (Object) bundle2, 13));
    }

    public final void B() {
        if (!(aS().getApplicationContext() instanceof Application) || this.a == null) {
            return;
        }
        ((Application) aS().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.a);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:103:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:106:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:107:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:110:0x020c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0211  */
    /* JADX WARN: Code duplicated, block: B:114:0x0222  */
    /* JADX WARN: Code duplicated, block: B:115:0x0227  */
    /* JADX WARN: Code duplicated, block: B:118:0x0238  */
    /* JADX WARN: Code duplicated, block: B:119:0x023d  */
    /* JADX WARN: Code duplicated, block: B:122:0x024e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0253  */
    /* JADX WARN: Code duplicated, block: B:126:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:130:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:131:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:134:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:135:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:138:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:139:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:143:0x0320  */
    /* JADX WARN: Code duplicated, block: B:144:0x0327  */
    /* JADX WARN: Code duplicated, block: B:146:0x0332  */
    /* JADX WARN: Code duplicated, block: B:155:0x0371  */
    /* JADX WARN: Code duplicated, block: B:157:0x0392  */
    /* JADX WARN: Code duplicated, block: B:158:0x039e  */
    /* JADX WARN: Code duplicated, block: B:164:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:173:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:177:0x041a  */
    /* JADX WARN: Code duplicated, block: B:181:0x0436 A[Catch: NumberFormatException -> 0x043b, TRY_LEAVE, TryCatch #10 {NumberFormatException -> 0x043b, blocks: (B:179:0x042a, B:181:0x0436), top: B:225:0x042a }] */
    /* JADX WARN: Code duplicated, block: B:183:0x043b  */
    /* JADX WARN: Code duplicated, block: B:189:0x0459  */
    /* JADX WARN: Code duplicated, block: B:194:0x046e  */
    /* JADX WARN: Code duplicated, block: B:197:0x0481  */
    /* JADX WARN: Code duplicated, block: B:198:0x0484  */
    /* JADX WARN: Code duplicated, block: B:201:0x0493  */
    /* JADX WARN: Code duplicated, block: B:239:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0171  */
    /* JADX WARN: Code duplicated, block: B:88:0x0180  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:91:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:95:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:99:0x01da  */
    /* JADX WARN: Instruction removed from duplicated block: B:144:0x0327, please report this as an issue */
    public final void D() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        int i6;
        boolean z;
        lgi lgiVar;
        String str;
        ahfr ahfrVar;
        ahfs ahfsVar;
        ahfr ahfrVar2;
        ahfs ahfsVar2;
        ahfr ahfrVar3;
        ahfs ahfsVar3;
        ahfr ahfrVar4;
        ahfs ahfsVar4;
        String str2;
        boolean z2;
        String str3;
        boolean z3;
        String str4;
        String str5;
        String str6;
        int number;
        int number2;
        int number3;
        int number4;
        int i7;
        int i8;
        String str7;
        char c;
        int i9;
        String str8;
        int i10;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        agkj agkjVarD;
        String string6;
        HashMap map;
        int i11;
        int i12;
        lgi lgiVar2;
        String[] strArrSplit;
        ldl ldlVarJ;
        String string7;
        String strC;
        Bundle bundleB;
        ler lerVar;
        Map map2;
        String str14;
        Bundle bundleB2;
        Bundle bundleB3;
        String str15;
        String str16;
        StringBuilder sb;
        String str17;
        int i13;
        int iA;
        Map map3;
        int i14;
        int i15;
        String str18;
        String string8;
        ahfs ahfsVar5;
        o();
        aT().j.a("Handle tcf update.");
        SharedPreferences sharedPreferencesA = J().a();
        agke agkeVar = lgk.a;
        ahfr ahfrVar5 = ahfr.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        lgj lgjVar = lgj.a;
        ahfr ahfrVar6 = ahfr.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
        lgj lgjVar2 = lgj.d;
        agkj agkjVarP = agkj.p(ahfrVar5, lgjVar, ahfrVar6, lgjVar2, ahfr.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE, lgjVar, ahfr.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS, lgjVar, ahfr.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE, lgjVar2, ahfr.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, lgjVar2, ahfr.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, lgjVar2);
        agqj agqjVar = new agqj("CH");
        char[] cArr = new char[5];
        boolean zContains = sharedPreferencesA.contains("IABTCF_TCString");
        try {
            i = sharedPreferencesA.getInt("IABTCF_CmpSdkID", -1);
        } catch (ClassCastException unused) {
            i = -1;
        }
        try {
            i2 = sharedPreferencesA.getInt("IABTCF_PolicyVersion", -1);
        } catch (ClassCastException unused2) {
            i2 = -1;
        }
        try {
            i3 = sharedPreferencesA.getInt("IABTCF_gdprApplies", -1);
        } catch (ClassCastException unused3) {
            i3 = -1;
        }
        try {
            i4 = sharedPreferencesA.getInt("IABTCF_PurposeOneTreatment", -1);
        } catch (ClassCastException unused4) {
            i4 = -1;
        }
        try {
            i5 = sharedPreferencesA.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
        } catch (ClassCastException unused5) {
            i5 = -1;
        }
        try {
            string = sharedPreferencesA.getString("IABTCF_PublisherCC", "");
        } catch (ClassCastException unused6) {
            string = "";
        }
        agkh agkhVar = new agkh(4);
        agqr it = agkjVarP.keySet().iterator();
        while (it.hasNext()) {
            ahfr ahfrVar7 = (ahfr) it.next();
            boolean z4 = zContains;
            agkj agkjVar = agkjVarP;
            try {
                string8 = sharedPreferencesA.getString("IABTCF_PublisherRestrictions" + ahfrVar7.getNumber(), "");
            } catch (ClassCastException unused7) {
                string8 = "";
            }
            if (TextUtils.isEmpty(string8) || string8.length() < 755) {
                ahfsVar5 = ahfs.PURPOSE_RESTRICTION_UNDEFINED;
            } else {
                int iDigit = Character.digit(string8.charAt(754), 10);
                if (iDigit < 0 || iDigit > ahfs.values().length || iDigit == 0) {
                    ahfsVar5 = ahfs.PURPOSE_RESTRICTION_NOT_ALLOWED;
                } else if (iDigit != 1) {
                    ahfsVar5 = iDigit != 2 ? ahfs.PURPOSE_RESTRICTION_UNDEFINED : ahfs.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                } else {
                    ahfsVar5 = ahfs.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                }
            }
            agkhVar.e(ahfrVar7, ahfsVar5);
            zContains = z4;
            agkjVarP = agkjVar;
        }
        boolean z5 = zContains;
        agkj agkjVar2 = agkjVarP;
        agkj agkjVarD2 = agkhVar.d(true);
        try {
            string2 = sharedPreferencesA.getString("IABTCF_PurposeConsents", "");
        } catch (ClassCastException unused8) {
            string2 = "";
        }
        try {
            string3 = sharedPreferencesA.getString("IABTCF_VendorConsents", "");
        } catch (ClassCastException unused9) {
            string3 = "";
        }
        boolean z6 = !TextUtils.isEmpty(string3) && string3.length() >= 755 && string3.charAt(754) == '1';
        try {
            string4 = sharedPreferencesA.getString("IABTCF_PurposeLegitimateInterests", "");
        } catch (ClassCastException unused10) {
            string4 = "";
        }
        try {
            string5 = sharedPreferencesA.getString("IABTCF_VendorLegitimateInterests", "");
        } catch (ClassCastException unused11) {
            string5 = "";
        }
        if (!TextUtils.isEmpty(string5)) {
            i6 = i;
            if (string5.length() >= 755 && string5.charAt(754) == '1') {
                z = true;
            }
            cArr[0] = '2';
            if (z5) {
                str = "1";
                ahfrVar = ahfr.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
                ahfsVar = (ahfs) agkjVarD2.get(ahfrVar);
                ahfrVar2 = ahfr.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
                ahfsVar2 = (ahfs) agkjVarD2.get(ahfrVar2);
                int i16 = i2;
                ahfrVar3 = ahfr.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
                ahfsVar3 = (ahfs) agkjVarD2.get(ahfrVar3);
                ahfrVar4 = ahfr.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
                ahfsVar4 = (ahfs) agkjVarD2.get(ahfrVar4);
                agkh agkhVar2 = new agkh(4);
                agkhVar2.e("Version", "2");
                if (true != z6) {
                    str2 = "0";
                } else {
                    str2 = str;
                }
                z2 = z6;
                agkhVar2.e("VendorConsent", str2);
                if (true != z) {
                    str3 = "0";
                } else {
                    str3 = str;
                }
                z3 = z;
                agkhVar2.e("VendorLegitimateInterest", str3);
                if (i3 != 1) {
                    str4 = "0";
                } else {
                    str4 = str;
                }
                agkhVar2.e("gdprApplies", str4);
                if (i5 != 1) {
                    str5 = "0";
                } else {
                    str5 = str;
                }
                agkhVar2.e("EnableAdvertiserConsentMode", str5);
                agkhVar2.e("PolicyVersion", String.valueOf(i16));
                agkhVar2.e("CmpSdkID", String.valueOf(i6));
                if (i4 != 1) {
                    str6 = "0";
                } else {
                    str6 = str;
                }
                agkhVar2.e("PurposeOneTreatment", str6);
                agkhVar2.e("PublisherCC", string);
                if (ahfsVar != null) {
                    number = ahfsVar.getNumber();
                } else {
                    number = ahfs.PURPOSE_RESTRICTION_UNDEFINED.getNumber();
                }
                agkhVar2.e("PublisherRestrictions1", String.valueOf(number));
                if (ahfsVar2 != null) {
                    number2 = ahfsVar2.getNumber();
                } else {
                    number2 = ahfs.PURPOSE_RESTRICTION_UNDEFINED.getNumber();
                }
                agkhVar2.e("PublisherRestrictions3", String.valueOf(number2));
                if (ahfsVar3 != null) {
                    number3 = ahfsVar3.getNumber();
                } else {
                    number3 = ahfs.PURPOSE_RESTRICTION_UNDEFINED.getNumber();
                }
                agkhVar2.e("PublisherRestrictions4", String.valueOf(number3));
                if (ahfsVar4 != null) {
                    number4 = ahfsVar4.getNumber();
                } else {
                    number4 = ahfs.PURPOSE_RESTRICTION_UNDEFINED.getNumber();
                }
                agkhVar2.e("PublisherRestrictions7", String.valueOf(number4));
                agkhVar2.i(agkj.m("Purpose1", lgk.a(ahfrVar, string2, string4), "Purpose3", lgk.a(ahfrVar2, string2, string4), "Purpose4", lgk.a(ahfrVar3, string2, string4), "Purpose7", lgk.a(ahfrVar4, string2, string4)));
                i7 = i3;
                i8 = i4;
                str7 = string;
                c = 1;
                i9 = -1;
                str8 = string4;
                i10 = i5;
                str9 = string2;
                if (true != lgk.b(ahfrVar, agkjVar2, agkjVarD2, agqjVar, cArr, i10, i7, i8, str7, str9, str8, z2, z3)) {
                    str10 = "0";
                } else {
                    str10 = str;
                }
                if (true != lgk.b(ahfrVar2, agkjVar2, agkjVarD2, agqjVar, cArr, i10, i7, i8, str7, str9, str8, z2, z3)) {
                    str11 = "0";
                } else {
                    str11 = str;
                }
                if (true != lgk.b(ahfrVar3, agkjVar2, agkjVarD2, agqjVar, cArr, i10, i7, i8, str7, str9, str8, z2, z3)) {
                    str12 = "0";
                } else {
                    str12 = str;
                }
                if (true != lgk.b(ahfrVar4, agkjVar2, agkjVarD2, agqjVar, cArr, i10, i7, i8, str7, str9, str8, z2, z3)) {
                    str13 = "0";
                } else {
                    str13 = str;
                }
                agkhVar2.i(agkj.n("AuthorizePurpose1", str10, "AuthorizePurpose3", str11, "AuthorizePurpose4", str12, "AuthorizePurpose7", str13, "PurposeDiagnostics", new String(cArr)));
                agkjVarD = agkhVar2.d(true);
            } else {
                agkjVarD = agpn.b;
                str = "1";
                c = 1;
                i9 = -1;
            }
            lgiVar = new lgi(agkjVarD);
            aT().k.b("Tcf preferences read", lgiVar);
            ldl ldlVarJ2 = J();
            ldlVarJ2.o();
            string6 = ldlVarJ2.b().getString("stored_tcf_param", "");
            map = new HashMap();
            if (TextUtils.isEmpty(string6)) {
                lgiVar2 = new lgi(map);
                i12 = 2;
            } else {
                for (String str19 : string6.split(";")) {
                    strArrSplit = str19.split("=");
                    if (strArrSplit.length < 2 && lgk.a.contains(strArrSplit[0])) {
                        map.put(strArrSplit[0], strArrSplit[c]);
                    }
                }
                i12 = 2;
                lgiVar2 = new lgi(map);
            }
            ldlVarJ = J();
            ldlVarJ.o();
            string7 = ldlVarJ.b().getString("stored_tcf_param", "");
            strC = lgiVar.c();
            if (strC.equals(string7)) {
            }
            SharedPreferences.Editor editorEdit = ldlVarJ.b().edit();
            editorEdit.putString("stored_tcf_param", strC);
            editorEdit.apply();
            bundleB = lgiVar.b();
            aT().k.b("Consent generated from Tcf", bundleB);
            if (bundleB != Bundle.EMPTY) {
                lerVar = this;
                lerVar.X(bundleB, -30, System.currentTimeMillis());
            } else {
                lerVar = this;
            }
            Bundle bundle = new Bundle();
            map2 = lgiVar2.a;
            if (map2.isEmpty() && ((String) map2.get("Version")) == null) {
                str14 = str;
            } else {
                str14 = "0";
            }
            bundleB2 = lgiVar.b();
            bundleB3 = lgiVar2.b();
            if (bundleB2.size() != bundleB3.size() && Objects.equals(bundleB2.getString("ad_storage"), bundleB3.getString("ad_storage")) && Objects.equals(bundleB2.getString("ad_personalization"), bundleB3.getString("ad_personalization")) && Objects.equals(bundleB2.getString("ad_user_data"), bundleB3.getString("ad_user_data"))) {
                str15 = "0";
            } else {
                str15 = str;
            }
            bundle.putString("_tcfm", str14.concat(str15));
            Map map4 = lgiVar.a;
            str16 = (String) map4.get("PurposeDiagnostics");
            if (c == TextUtils.isEmpty(str16)) {
                str16 = "200000";
            }
            bundle.putString("_tcfd2", str16);
            str17 = str;
            sb = new StringBuilder(str17);
            try {
                str18 = (String) map4.get("CmpSdkID");
                if (TextUtils.isEmpty(str18)) {
                    i13 = i9;
                } else {
                    i13 = Integer.parseInt(str18);
                }
            } catch (NumberFormatException unused12) {
            }
            if (i13 >= 0 || i13 > 4095) {
                sb.append("00");
            } else {
                sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i13 >> 6));
                sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i13 & 63));
            }
            iA = lgiVar.a();
            if (iA >= 0 || iA > 63) {
                sb.append('0');
            } else {
                sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iA));
            }
            map3 = lgiVar.a;
            if (c != str17.equals(map3.get("gdprApplies"))) {
                i14 = 0;
            } else {
                i14 = i12;
            }
            i15 = i14 | 4;
            if (str17.equals(map3.get("EnableAdvertiserConsentMode"))) {
                i15 = i14 | 12;
            }
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i15));
            bundle.putString("_tcfd", sb.toString());
            lerVar.N("auto", "_tcf", bundle);
        }
        i6 = i;
        z = false;
        cArr[0] = '2';
        if (z5) {
            agkjVarD = agpn.b;
            str = "1";
            c = 1;
            i9 = -1;
        } else {
            str = "1";
            ahfrVar = ahfr.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            ahfsVar = (ahfs) agkjVarD2.get(ahfrVar);
            ahfrVar2 = ahfr.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
            ahfsVar2 = (ahfs) agkjVarD2.get(ahfrVar2);
            int i17 = i2;
            ahfrVar3 = ahfr.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
            ahfsVar3 = (ahfs) agkjVarD2.get(ahfrVar3);
            ahfrVar4 = ahfr.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
            ahfsVar4 = (ahfs) agkjVarD2.get(ahfrVar4);
            agkh agkhVar3 = new agkh(4);
            agkhVar3.e("Version", "2");
            if (true != z6) {
                str2 = "0";
            } else {
                str2 = str;
            }
            z2 = z6;
            agkhVar3.e("VendorConsent", str2);
            if (true != z) {
                str3 = "0";
            } else {
                str3 = str;
            }
            z3 = z;
            agkhVar3.e("VendorLegitimateInterest", str3);
            if (i3 != 1) {
                str4 = "0";
            } else {
                str4 = str;
            }
            agkhVar3.e("gdprApplies", str4);
            if (i5 != 1) {
                str5 = "0";
            } else {
                str5 = str;
            }
            agkhVar3.e("EnableAdvertiserConsentMode", str5);
            agkhVar3.e("PolicyVersion", String.valueOf(i17));
            agkhVar3.e("CmpSdkID", String.valueOf(i6));
            if (i4 != 1) {
                str6 = "0";
            } else {
                str6 = str;
            }
            agkhVar3.e("PurposeOneTreatment", str6);
            agkhVar3.e("PublisherCC", string);
            if (ahfsVar != null) {
                number = ahfsVar.getNumber();
            } else {
                number = ahfs.PURPOSE_RESTRICTION_UNDEFINED.getNumber();
            }
            agkhVar3.e("PublisherRestrictions1", String.valueOf(number));
            if (ahfsVar2 != null) {
                number2 = ahfsVar2.getNumber();
            } else {
                number2 = ahfs.PURPOSE_RESTRICTION_UNDEFINED.getNumber();
            }
            agkhVar3.e("PublisherRestrictions3", String.valueOf(number2));
            if (ahfsVar3 != null) {
                number3 = ahfsVar3.getNumber();
            } else {
                number3 = ahfs.PURPOSE_RESTRICTION_UNDEFINED.getNumber();
            }
            agkhVar3.e("PublisherRestrictions4", String.valueOf(number3));
            if (ahfsVar4 != null) {
                number4 = ahfsVar4.getNumber();
            } else {
                number4 = ahfs.PURPOSE_RESTRICTION_UNDEFINED.getNumber();
            }
            agkhVar3.e("PublisherRestrictions7", String.valueOf(number4));
            agkhVar3.i(agkj.m("Purpose1", lgk.a(ahfrVar, string2, string4), "Purpose3", lgk.a(ahfrVar2, string2, string4), "Purpose4", lgk.a(ahfrVar3, string2, string4), "Purpose7", lgk.a(ahfrVar4, string2, string4)));
            i7 = i3;
            i8 = i4;
            str7 = string;
            c = 1;
            i9 = -1;
            str8 = string4;
            i10 = i5;
            str9 = string2;
            if (true != lgk.b(ahfrVar, agkjVar2, agkjVarD2, agqjVar, cArr, i10, i7, i8, str7, str9, str8, z2, z3)) {
                str10 = "0";
            } else {
                str10 = str;
            }
            if (true != lgk.b(ahfrVar2, agkjVar2, agkjVarD2, agqjVar, cArr, i10, i7, i8, str7, str9, str8, z2, z3)) {
                str11 = "0";
            } else {
                str11 = str;
            }
            if (true != lgk.b(ahfrVar3, agkjVar2, agkjVarD2, agqjVar, cArr, i10, i7, i8, str7, str9, str8, z2, z3)) {
                str12 = "0";
            } else {
                str12 = str;
            }
            if (true != lgk.b(ahfrVar4, agkjVar2, agkjVarD2, agqjVar, cArr, i10, i7, i8, str7, str9, str8, z2, z3)) {
                str13 = "0";
            } else {
                str13 = str;
            }
            agkhVar3.i(agkj.n("AuthorizePurpose1", str10, "AuthorizePurpose3", str11, "AuthorizePurpose4", str12, "AuthorizePurpose7", str13, "PurposeDiagnostics", new String(cArr)));
            agkjVarD = agkhVar3.d(true);
        }
        lgiVar = new lgi(agkjVarD);
        aT().k.b("Tcf preferences read", lgiVar);
        ldl ldlVarJ3 = J();
        ldlVarJ3.o();
        string6 = ldlVarJ3.b().getString("stored_tcf_param", "");
        map = new HashMap();
        if (TextUtils.isEmpty(string6)) {
            lgiVar2 = new lgi(map);
            i12 = 2;
        } else {
            while (i11 < r7) {
                strArrSplit = str19.split("=");
                if (strArrSplit.length < 2) {
                }
            }
            i12 = 2;
            lgiVar2 = new lgi(map);
        }
        ldlVarJ = J();
        ldlVarJ.o();
        string7 = ldlVarJ.b().getString("stored_tcf_param", "");
        strC = lgiVar.c();
        if (strC.equals(string7)) {
            SharedPreferences.Editor editorEdit2 = ldlVarJ.b().edit();
            editorEdit2.putString("stored_tcf_param", strC);
            editorEdit2.apply();
            bundleB = lgiVar.b();
            aT().k.b("Consent generated from Tcf", bundleB);
            if (bundleB != Bundle.EMPTY) {
                lerVar = this;
                lerVar.X(bundleB, -30, System.currentTimeMillis());
            } else {
                lerVar = this;
            }
            Bundle bundle2 = new Bundle();
            map2 = lgiVar2.a;
            if (map2.isEmpty()) {
                str14 = "0";
            } else {
                str14 = "0";
            }
            bundleB2 = lgiVar.b();
            bundleB3 = lgiVar2.b();
            if (bundleB2.size() != bundleB3.size()) {
                str15 = str;
            } else {
                str15 = str;
            }
            bundle2.putString("_tcfm", str14.concat(str15));
            Map map5 = lgiVar.a;
            str16 = (String) map5.get("PurposeDiagnostics");
            if (c == TextUtils.isEmpty(str16)) {
                str16 = "200000";
            }
            bundle2.putString("_tcfd2", str16);
            str17 = str;
            sb = new StringBuilder(str17);
            str18 = (String) map5.get("CmpSdkID");
            if (TextUtils.isEmpty(str18)) {
                i13 = Integer.parseInt(str18);
            } else {
                i13 = i9;
            }
            if (i13 >= 0) {
                sb.append("00");
            } else {
                sb.append("00");
            }
            iA = lgiVar.a();
            if (iA >= 0) {
                sb.append('0');
            } else {
                sb.append('0');
            }
            map3 = lgiVar.a;
            if (c != str17.equals(map3.get("gdprApplies"))) {
                i14 = 0;
            } else {
                i14 = i12;
            }
            i15 = i14 | 4;
            if (str17.equals(map3.get("EnableAdvertiserConsentMode"))) {
                i15 = i14 | 12;
            }
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i15));
            bundle2.putString("_tcfd", sb.toString());
            lerVar.N("auto", "_tcf", bundle2);
        }
    }

    public final void E(String str, String str2, Bundle bundle) {
        F(str, str2, bundle, true, true, System.currentTimeMillis(), SystemClock.elapsedRealtime());
    }

    public final void F(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (!Objects.equals(str2, "screen_view")) {
            T(str == null ? "app" : str, str2, j, j2, bundle2, z2, !z2 || this.r == null || lga.am(str2), z, null);
            return;
        }
        lhh lhhVarL = l();
        synchronized (lhhVarL.j) {
            if (!lhhVarL.i) {
                lhhVarL.aT().h.a("Cannot log screen view event when the app is in the background.");
                return;
            }
            String string = bundle2.getString("screen_name");
            if (string != null && (string.length() <= 0 || string.length() > lhhVarL.G().c(null, false))) {
                lhhVarL.aT().h.b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                return;
            }
            String string2 = bundle2.getString("screen_class");
            if (string2 == null) {
                kzv kzvVar = lhhVarL.e;
                string2 = kzvVar != null ? lhhVarL.y(kzvVar.b) : "Activity";
            } else if (string2.length() <= 0 || string2.length() > lhhVarL.G().c(null, false)) {
                lhhVarL.aT().h.b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                return;
            }
            String str3 = string2;
            lhf lhfVar = lhhVarL.a;
            if (lhhVarL.f && lhfVar != null) {
                lhhVarL.f = false;
                boolean zEquals = Objects.equals(lhfVar.b, str3);
                boolean zEquals2 = Objects.equals(lhfVar.a, string);
                if (zEquals && zEquals2) {
                    lhhVarL.aT().h.a("Ignoring call to log screen view event with duplicate parameters.");
                    return;
                }
            }
            lhhVarL.aT().k.c("Logging screen view with name, class", string == null ? "null" : string, str3 == null ? "null" : str3);
            lhf lhfVar2 = lhhVarL.a == null ? lhhVarL.b : lhhVarL.a;
            lhf lhfVar3 = new lhf(string, str3, lhhVarL.L().s(), true, j, j2);
            lhhVarL.a = lhfVar3;
            lhhVarL.b = lhfVar2;
            lhhVarL.g = lhfVar3;
            lhhVarL.aV();
            lhhVarL.aU().j(new lel(lhhVarL, bundle2, lhfVar3, lhfVar2, SystemClock.elapsedRealtime(), 2));
        }
    }

    public final void N(String str, String str2, Bundle bundle) {
        o();
        O(str, str2, System.currentTimeMillis(), SystemClock.elapsedRealtime(), bundle);
    }

    public final void O(String str, String str2, long j, long j2, Bundle bundle) {
        o();
        boolean z = true;
        if (this.r != null && !lga.am(str2)) {
            z = false;
        }
        P(str, str2, j, j2, bundle, true, z, true, null);
    }

    /* JADX WARN: Code duplicated, block: B:181:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:184:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:213:0x04f4 A[SYNTHETIC] */
    protected final void P(String str, String str2, long j, long j2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        long j3;
        long j4;
        ArrayList arrayList;
        boolean z4;
        boolean z5;
        Bundle[] bundleArr;
        String str4 = str;
        kro.i(str4);
        if (bundle == null) {
            throw new NullPointerException("null reference");
        }
        o();
        a();
        ldr ldrVar = this.t;
        if (!ldrVar.w()) {
            aT().j.a("Event not sent since app measurement is disabled");
            return;
        }
        List list = h().c;
        if (list != null && !list.contains(str2)) {
            aT().j.c("Dropping non-safelisted event. event name, origin", str2, str4);
            if (G().F(null, lcl.aS) && G().F(null, lcl.aW)) {
                if (!G().F(null, lcl.aT)) {
                    j().y(Collections.singletonList(new lbx("event_dropped_count", "not_safelisted", 1, 0L)));
                    return;
                } else {
                    t().d("not_safelisted");
                    t().a();
                    return;
                }
            }
            return;
        }
        if (!this.j) {
            this.j = true;
            try {
                try {
                    (!ldrVar.b ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, aS().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, aS());
                } catch (Exception e) {
                    aT().f.b("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (ClassNotFoundException unused) {
                aT().i.a("Tag Manager is not found and thus will not be used");
            }
        }
        if (!G().F(null, lcl.aP) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            ae("auto", "_lgclid", bundle.getString("gclid"), System.currentTimeMillis());
        }
        if (z) {
            String[] strArr = lga.b;
            int length = strArr.length;
            if (!strArr[0].equals(str2)) {
                L().O(bundle, J().s.a());
            }
        }
        if (!z3 && !"_iap".equals(str2)) {
            ldr ldrVar2 = this.t;
            lga lgaVarL = ldrVar2.l();
            int i = 2;
            if (lgaVarL.ah("event", str2)) {
                if (!lgaVarL.ae("event", lec.a, lec.b, str2)) {
                    i = 13;
                } else if (lgaVarL.ad("event", 40, str2)) {
                    i = 0;
                }
            }
            if (i != 0) {
                aT().e.b("Invalid public event name. Event will not be logged (FE)", I().c(str2));
                ldrVar2.l();
                ldrVar2.l().R(this.h, null, i, "_ev", lga.aA(str2, 40, true), str2 != null ? str2.length() : 0);
                ap();
                return;
            }
        }
        lhf lhfVarT = l().t(false);
        if (lhfVarT != null && !bundle.containsKey("_sc")) {
            lhfVarT.d = true;
        }
        lga.N(lhfVarT, bundle, z && !z3);
        boolean zEquals = "am".equals(str4);
        boolean zAm = lga.am(str2);
        if (z && this.r != null && !zAm && !zEquals) {
            aT().j.c("Passing event to registered event handler (FE)", I().c(str2), I().b(bundle));
            lbf lbfVar = this.r;
            if (lbfVar == null) {
                throw new NullPointerException("null reference");
            }
            try {
                lbfVar.a.b(str4, str2, bundle, j);
                return;
            } catch (RemoteException e2) {
                ldr ldrVar3 = lbfVar.b.a;
                if (ldrVar3 != null) {
                    ldrVar3.aT().f.b("Event interceptor threw exception", e2);
                    return;
                }
                return;
            }
        }
        long j5 = j;
        ldr ldrVar4 = this.t;
        if (ldrVar4.y()) {
            int iD = L().d(str2);
            if (iD != 0) {
                aT().e.b("Invalid event name. Event will not be logged (FE)", I().c(str2));
                L();
                ldrVar4.l().R(this.h, str3, iD, "_ev", lga.aA(str2, 40, true), str2 != null ? str2.length() : 0);
                ap();
                return;
            }
            List listE = ksy.e("_o", "_sn", "_sc", "_si");
            lbt lbtVarG = G();
            adam adamVar = lcl.aT;
            String str5 = "_o";
            Bundle bundleU = L().u(str3, str2, bundle, listE, z3, lbtVarG.F(null, adamVar) ? t() : lgv.a);
            if (G().F(null, adamVar)) {
                t().a();
            }
            if (l().t(false) == null || !"_ae".equals(str2)) {
                j3 = 0;
            } else {
                lhe lheVar = m().b;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                j3 = 0;
                long j6 = jElapsedRealtime - lheVar.b;
                lheVar.b = jElapsedRealtime;
                if (j6 > 0) {
                    L().F(bundleU, j6);
                }
            }
            if (!"auto".equals(str4) && "_ssr".equals(str2)) {
                lga lgaVarL2 = L();
                String string = bundleU.getString("_ffr");
                if (ksz.a(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                if (Objects.equals(string, lgaVarL2.J().p.a())) {
                    lgaVarL2.aT().j.a("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                lgaVarL2.J().p.b(string);
            } else if ("_ae".equals(str2)) {
                String strA = L().J().p.a();
                if (!TextUtils.isEmpty(strA)) {
                    bundleU.putString("_ffr", strA);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(bundleU);
            boolean zV = m().v();
            if (J().k.a() > j3 && J().k(j5) && zV) {
                aT().k.a("Current session is expired, remove the session number, ID, and engagement time");
                j4 = j3;
                arrayList = arrayList2;
                ae("auto", "_sid", null, System.currentTimeMillis());
                ae("auto", "_sno", null, System.currentTimeMillis());
                ae("auto", "_se", null, System.currentTimeMillis());
                J().l.b(j4);
            } else {
                j4 = j3;
                arrayList = arrayList2;
            }
            if (bundleU.getLong("extend_session", j4) == 1) {
                aT().k.a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                ldrVar4.p().d.r(j5, j2);
            }
            ArrayList arrayList3 = new ArrayList(bundleU.keySet());
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str6 = (String) arrayList3.get(i2);
                if (str6 != null) {
                    L();
                    Object obj = bundleU.get(str6);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[]{(Bundle) obj};
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList4 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleU.putParcelableArray(str6, bundleArr);
                    }
                }
            }
            int i3 = 0;
            while (i3 < arrayList.size()) {
                Bundle bundleAt = (Bundle) arrayList.get(i3);
                String str7 = i3 != 0 ? "_ep" : str2;
                String str8 = str5;
                bundleAt.putString(str8, str4);
                if (z2) {
                    bundleAt = L().at(bundleAt);
                }
                Bundle bundle2 = bundleAt;
                lcd lcdVar = new lcd(str7, new lcc(bundle2), str4, j5, j2);
                lff lffVarJ = j();
                lffVarJ.o();
                lffVarJ.a();
                lgr lgrVarK = lffVarJ.k();
                Parcel parcelObtain = Parcel.obtain();
                kwo.a(lcdVar, parcelObtain, 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                if (bArrMarshall.length > 131072) {
                    lgrVarK.aT().d.a("Event is too long for local database. Sending event directly to service");
                } else {
                    if (lgrVarK.v(0, bArrMarshall)) {
                        z4 = true;
                        z5 = true;
                    }
                    lffVarJ.B(new ley(lffVarJ, lffVarJ.s(z4), z5, lcdVar, 2));
                    if (!zEquals) {
                        for (lbf lbfVar2 : this.b) {
                            try {
                                lbfVar2.a.b(str, str2, new Bundle(bundle2), j);
                            } catch (RemoteException e3) {
                                ldr ldrVar5 = lbfVar2.b.a;
                                if (ldrVar5 != null) {
                                    ldrVar5.aT().f.b("Event listener threw exception", e3);
                                }
                            }
                        }
                    }
                    i3++;
                    str4 = str;
                    j5 = j;
                    str5 = str8;
                }
                z5 = false;
                z4 = true;
                lffVarJ.B(new ley(lffVarJ, lffVarJ.s(z4), z5, lcdVar, 2));
                if (!zEquals) {
                    while (r6.hasNext()) {
                        lbfVar2.a.b(str, str2, new Bundle(bundle2), j);
                    }
                }
                i3++;
                str4 = str;
                j5 = j;
                str5 = str8;
            }
            if (l().t(false) == null || !"_ae".equals(str2)) {
                return;
            }
            m().w(true, true, SystemClock.elapsedRealtime());
        }
    }

    public final void Q(String str, long j) {
        o();
        if (G().F(null, lcl.aT)) {
            lgt lgtVarT = t();
            lgtVarT.c(str, j);
            lgtVarT.a();
        }
    }

    public final void R(Runnable runnable) {
        a();
        aT().k.b("[sgtm] retrieveAndUploadBatches called from", Thread.currentThread().getName());
        if (!G().F(null, lcl.L)) {
            S(runnable);
            return;
        }
        if (!this.g.compareAndSet(false, true)) {
            aT().k.b("[sgtm] Already retrieving batches, skip this call from", Thread.currentThread().getName());
            runnable.run();
            return;
        }
        try {
            ExecutorService executorServiceAl = this.q;
            if (executorServiceAl == null) {
                synchronized (this) {
                    try {
                        executorServiceAl = this.q;
                        if (executorServiceAl == null) {
                            ksy ksyVar = kyq.a;
                            executorServiceAl = ksy.al(1, new mdk(1));
                            this.q = executorServiceAl;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            executorServiceAl.execute(new ldu(this, (Object) runnable, 10));
        } catch (RejectedExecutionException e) {
            aT().f.b("[sgtm] Failed to schedule batch upload", e);
            this.g.set(false);
            runnable.run();
        }
    }

    public final void S(Runnable runnable) {
        ler lerVar;
        a();
        aT().k.b("[sgtm] retrieveAndUploadBatchesBlocking called from", Thread.currentThread().getName());
        if (aU().l()) {
            aT().c.a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        if (Thread.currentThread() == aU().c) {
            aT().c.a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        if (a.x()) {
            aT().c.a("Cannot retrieve and upload batches from main thread");
            return;
        }
        aT().k.a("[sgtm] Started client-side batch upload work.");
        boolean z = false;
        int size = 0;
        int i = 0;
        while (!z) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.aT().k.a("[sgtm] Getting upload batches from service (FE)");
            long jLongValue = ((Long) lcl.D.b(null)).longValue();
            AtomicReference atomicReference = new AtomicReference();
            this.aU().a(atomicReference, jLongValue, "[sgtm] Getting upload batches", new ldu(this, (Object) atomicReference, 9));
            lfn lfnVar = (lfn) atomicReference.get();
            if (this.G().F(null, lcl.aR) && this.G().F(null, lcl.bb)) {
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                this.aT().k.c("[sgtm] Recording batch retrieval diagnostics. batch count, duration millis", Integer.valueOf(lfnVar == null ? -1 : lfnVar.a.size()), Long.valueOf(jElapsedRealtime2));
                lerVar = this;
                this.aU().j(new laz(lerVar, jElapsedRealtime2, lfnVar, 3));
            } else {
                lerVar = this;
                lerVar.aT().k.a("[sgtm] Diagnostics not enabled, skipping batch retrieval diagnostics recording");
            }
            if (lfnVar != null) {
                List list = lfnVar.a;
                if (!list.isEmpty()) {
                    lerVar.aT().k.b("[sgtm] Retrieved upload batches. count", Integer.valueOf(list.size()));
                    size += list.size();
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        lhn lhnVarAo = lerVar.ao((lfl) it.next());
                        if (lhnVarAo == lhn.SUCCESS) {
                            i++;
                        } else if (lhnVarAo == lhn.BACKOFF) {
                            z = true;
                            break;
                        }
                    }
                    this = lerVar;
                }
            }
            lerVar.aT().k.c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(size), Integer.valueOf(i));
            runnable.run();
        }
        lerVar = this;
        lerVar.aT().k.c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(size), Integer.valueOf(i));
        runnable.run();
    }

    protected final void T(String str, String str2, long j, long j2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        List list = lga.a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list2 = (List) obj;
                    while (i < list2.size()) {
                        Object obj2 = list2.get(i);
                        if (obj2 instanceof Bundle) {
                            list2.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        aU().j(new lek(this, str, str2, j, j2, bundle2, z, z2, z3, str3));
    }

    final void U(String str, String str2, long j, Object obj) {
        aU().j(new lel(this, str, str2, obj, j, 0));
    }

    public final void V(String str) {
        this.k.set(str);
    }

    public final void W(Bundle bundle, long j) {
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            aT().f.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        lqd.d(bundle2, "app_id", String.class, null);
        lqd.d(bundle2, "origin", String.class, null);
        lqd.d(bundle2, "name", String.class, null);
        lqd.d(bundle2, "value", Object.class, null);
        lqd.d(bundle2, "trigger_event_name", String.class, null);
        lqd.d(bundle2, "trigger_timeout", Long.class, 0L);
        lqd.d(bundle2, "timed_out_event_name", String.class, null);
        lqd.d(bundle2, "timed_out_event_params", Bundle.class, null);
        lqd.d(bundle2, "triggered_event_name", String.class, null);
        lqd.d(bundle2, "triggered_event_params", Bundle.class, null);
        lqd.d(bundle2, "time_to_live", Long.class, 0L);
        lqd.d(bundle2, "expired_event_name", String.class, null);
        lqd.d(bundle2, "expired_event_params", Bundle.class, null);
        kro.i(bundle2.getString("name"));
        kro.i(bundle2.getString("origin"));
        kro.l(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (L().j(string) != 0) {
            aT().c.b("Invalid conditional user property name", I().e(string));
            return;
        }
        if (L().c(string, obj) != 0) {
            aT().c.c("Invalid conditional user property value", I().e(string), obj);
            return;
        }
        Object objW = L().w(string, obj);
        if (objW == null) {
            aT().c.c("Unable to normalize conditional user property value", I().e(string), obj);
            return;
        }
        lqd.e(bundle2, objW);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            aT().c.c("Invalid conditional user property timeout", I().e(string), Long.valueOf(j2));
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 > 15552000000L || j3 < 1) {
            aT().c.c("Invalid conditional user property time to live", I().e(string), Long.valueOf(j3));
        } else {
            aU().j(new ldu((Object) this, (Object) bundle2, 12));
        }
    }

    public final void X(Bundle bundle, int i, long j) {
        Object obj;
        String string;
        a();
        lgh lghVar = lgh.a;
        lgg[] lggVarArr = lgf.STORAGE.c;
        int length = lggVarArr.length;
        int i2 = 0;
        while (true) {
            obj = null;
            if (i2 >= length) {
                break;
            }
            String str = lggVarArr[i2].e;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i2++;
        }
        if (obj != null) {
            aT().h.b("Ignoring invalid consent setting", obj);
            aT().h.a("Valid consent values are 'granted', 'denied'");
        }
        boolean zL = aU().l();
        lgh lghVarF = lgh.f(bundle, i);
        Iterator it = lghVarF.c.values().iterator();
        while (it.hasNext()) {
            if (((lge) it.next()) != lge.UNINITIALIZED) {
                ac(lghVarF, zL);
                break;
            }
        }
        lgd lgdVarA = lgd.a(bundle, i);
        Iterator it2 = lgdVarA.f.values().iterator();
        while (it2.hasNext()) {
            if (((lge) it2.next()) != lge.UNINITIALIZED) {
                Y(lgdVarA, zL);
                break;
            }
        }
        Boolean boolD = lgd.d(bundle);
        if (boolD != null) {
            String str2 = i == -30 ? "tcf" : "app";
            if (zL) {
                ae(str2, "allow_personalized_ads", boolD.toString(), j);
            } else {
                ad(str2, "allow_personalized_ads", boolD.toString(), false, j);
            }
        }
    }

    final void Y(lgd lgdVar, boolean z) {
        ldu lduVar = new ldu(this, lgdVar, 19, (byte[]) null);
        if (!z) {
            aU().j(lduVar);
        } else {
            o();
            lduVar.run();
        }
    }

    public final void Z(Boolean bool) {
        a();
        aU().j(new ihq(this, bool, 11, (short[]) null));
    }

    final void aa(lgh lghVar) {
        o();
        boolean z = (lghVar.o() && lghVar.m()) || j().Q();
        ldr ldrVar = this.t;
        if (z != ldrVar.x()) {
            ldrVar.r();
            ldrVar.r = z;
            ldl ldlVarJ = J();
            ldlVarJ.o();
            Boolean boolValueOf = ldlVarJ.b().contains("measurement_enabled_from_api") ? Boolean.valueOf(ldlVarJ.b().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                ab(Boolean.valueOf(z), false);
            }
        }
    }

    public final void ab(Boolean bool, boolean z) {
        o();
        a();
        aT().j.b("Setting app measurement enabled (FE)", bool);
        J().i(bool);
        if (z) {
            ldl ldlVarJ = J();
            ldlVarJ.o();
            SharedPreferences.Editor editorEdit = ldlVarJ.b().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (this.t.x() || !(bool == null || bool.booleanValue())) {
            af();
        }
    }

    public final void ac(lgh lghVar, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        lgh lghVar2 = lghVar;
        a();
        int i2 = lghVar2.d;
        if (i2 != -10) {
            lge lgeVarC = lghVar2.c();
            lge lgeVar = lge.UNINITIALIZED;
            if (lgeVarC == lgeVar && lghVar2.d() == lgeVar) {
                aT().h.a("Ignoring empty consent settings");
                return;
            }
        }
        synchronized (this.l) {
            lgh lghVar3 = this.n;
            i = 0;
            if (lgh.p(i2, lghVar3.d)) {
                EnumMap enumMap = lghVar2.c;
                lgg[] lggVarArr = (lgg[]) enumMap.keySet().toArray(new lgg[0]);
                int length = lggVarArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        z2 = false;
                        break;
                    }
                    lgg lggVar = lggVarArr[i3];
                    lge lgeVar2 = (lge) enumMap.get(lggVar);
                    lge lgeVar3 = (lge) lghVar3.c.get(lggVar);
                    lge lgeVar4 = lge.DENIED;
                    if (lgeVar2 == lgeVar4 && lgeVar3 != lgeVar4) {
                        z2 = true;
                        break;
                    }
                    i3++;
                }
                boolean z4 = lghVar2.o() && !this.n.o();
                lgh lghVar4 = this.n;
                EnumMap enumMap2 = new EnumMap(lgg.class);
                lgg[] lggVarArr2 = lgf.STORAGE.c;
                int length2 = lggVarArr2.length;
                while (i < length2) {
                    lgg lggVar2 = lggVarArr2[i];
                    lge lgeVar5 = (lge) enumMap.get(lggVar2);
                    if (lgeVar5 == lge.UNINITIALIZED) {
                        lgeVar5 = (lge) lghVar4.c.get(lggVar2);
                    }
                    if (lgeVar5 != null) {
                        enumMap2.put(lggVar2, lgeVar5);
                    }
                    i++;
                }
                lgh lghVar5 = new lgh(enumMap2, i2);
                this.n = lghVar5;
                z3 = z4;
                lghVar2 = lghVar5;
                i = 1;
            } else {
                z2 = false;
                z3 = false;
            }
        }
        if (i == 0) {
            aT().i.b("Ignoring lower-priority consent settings, proposed settings", lghVar2);
            return;
        }
        long andIncrement = this.o.getAndIncrement();
        if (z2) {
            V(null);
            leo leoVar = new leo(this, lghVar2, andIncrement, z3, 1);
            if (!z) {
                aU().k(leoVar);
                return;
            } else {
                o();
                leoVar.run();
                return;
            }
        }
        leo leoVar2 = new leo(this, lghVar2, andIncrement, z3, 0);
        if (z) {
            o();
            leoVar2.run();
        } else if (i2 == 30 || i2 == -10) {
            aU().k(leoVar2);
        } else {
            aU().j(leoVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    public final void ad(String str, String str2, Object obj, boolean z, long j) {
        int iJ;
        if (z) {
            iJ = L().j(str2);
        } else {
            lga lgaVarL = L();
            if (!lgaVarL.ah("user property", str2)) {
                iJ = 6;
            } else if (!lgaVarL.ae("user property", lee.a, null, str2)) {
                iJ = 15;
            } else if (lgaVarL.ad("user property", 24, str2)) {
                iJ = 0;
            } else {
                iJ = 6;
            }
        }
        int i = 1;
        if (iJ != 0) {
            L();
            this.t.l().R(this.h, null, iJ, "_ev", lga.aA(str2, 24, true), str2 != null ? str2.length() : 0);
            return;
        }
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        if (obj == null) {
            U(str3, str2, j, null);
            return;
        }
        int iC = L().c(str2, obj);
        if (iC == 0) {
            Object objW = L().w(str2, obj);
            if (objW != null) {
                U(str3, str2, j, objW);
                return;
            }
            return;
        }
        if ("_id".equals(str2) && G().F(null, lcl.bj)) {
            aU().j(new lei(this, i));
        }
        L();
        this.t.l().R(this.h, null, iC, "_ev", lga.aA(str2, 24, true), ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    public final void ae(String str, String str2, Object obj, long j) {
        boolean z;
        kro.i(str);
        kro.i(str2);
        o();
        a();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    long j2 = true != "false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    Long lValueOf = Long.valueOf(j2);
                    ldk ldkVar = J().i;
                    lValueOf.getClass();
                    ldkVar.b(j2 == 1 ? "true" : "false");
                    obj = lValueOf;
                } else if (obj == null) {
                    J().i.b("unset");
                }
                str2 = "_npa";
            } else if (obj == null) {
                J().i.b("unset");
                str2 = "_npa";
            }
            aT().k.c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
        }
        String str4 = str2;
        Object obj2 = obj;
        ldr ldrVar = this.t;
        if (!ldrVar.w()) {
            aT().k.a("User property not set since app measurement is disabled");
            return;
        }
        if (ldrVar.y()) {
            lfy lfyVar = new lfy(str4, j, obj2, str);
            lff lffVarJ = j();
            lffVarJ.o();
            lffVarJ.a();
            lgr lgrVarK = lffVarJ.k();
            Parcel parcelObtain = Parcel.obtain();
            kwo.b(lfyVar, parcelObtain);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            if (bArrMarshall.length <= 131072) {
                if (lgrVarK.v(1, bArrMarshall)) {
                    z = true;
                }
                lffVarJ.B(new ley(lffVarJ, lffVarJ.s(true), z, lfyVar, 0));
            }
            lgrVarK.aT().d.a("User property too long for local database. Sending directly to service");
            z = false;
            lffVarJ.B(new ley(lffVarJ, lffVarJ.s(true), z, lfyVar, 0));
        }
    }

    public final void af() {
        ler lerVar;
        o();
        String strA = J().i.a();
        if (strA == null) {
            lerVar = this;
        } else if ("unset".equals(strA)) {
            lerVar = this;
            lerVar.ae("app", "_npa", null, System.currentTimeMillis());
        } else {
            lerVar = this;
            lerVar.ae("app", "_npa", Long.valueOf(true != "true".equals(strA) ? 0L : 1L), System.currentTimeMillis());
        }
        if (lerVar.t.w() && lerVar.c) {
            lerVar.aT().j.a("Recording app launch after enabling measurement for the first time (FE)");
            lerVar.y();
            lerVar.m().d.p();
            lerVar.aU().j(new iqc((lbc) lerVar, 17));
            return;
        }
        lerVar.aT().j.a("Updating Scion state (FE)");
        lff lffVarJ = lerVar.j();
        lffVarJ.o();
        lffVarJ.a();
        lffVarJ.B(new ihq(lffVarJ, lffVarJ.s(true), 14, (char[]) null));
    }

    public final void ag(String str, Bundle bundle, String str2) {
        ldr.B();
        T("auto", str, System.currentTimeMillis(), SystemClock.elapsedRealtime(), bundle, false, true, true, str2);
    }

    public final void ah(String str) {
        aj(str, Collections.singletonMap("", 1));
    }

    final void ai(String str, int i) {
        aj("sgtm", Collections.singletonMap(str, Integer.valueOf(i)));
    }

    final void aj(String str, Map map) {
        o();
        if (G().F(null, lcl.aT)) {
            lgt lgtVarT = t();
            for (Map.Entry entry : map.entrySet()) {
                lgtVarT.b(str, (String) entry.getKey(), ((Integer) entry.getValue()).intValue());
            }
            lgtVarT.a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry2 : map.entrySet()) {
            arrayList.add(new lbx(str, (String) entry2.getKey(), ((Integer) entry2.getValue()).intValue(), 0L));
        }
        j().y(arrayList);
    }

    public final void ak(long j) {
        V(null);
        aU().j(new jup((lbc) this, j, 6));
    }

    public final void al(Object obj) {
        ad("auto", "_ldl", obj, true, System.currentTimeMillis());
    }

    public final void am(lgh lghVar, long j, boolean z) {
        o();
        a();
        lgh lghVarF = J().f();
        if (j <= this.p && lgh.p(lghVarF.d, lghVar.d)) {
            aT().i.b("Dropped out-of-date consent setting, proposed settings", lghVar);
            return;
        }
        ldl ldlVarJ = J();
        ldlVarJ.o();
        int i = lghVar.d;
        if (!ldlVarJ.l(i)) {
            aT().i.b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        SharedPreferences.Editor editorEdit = ldlVarJ.b().edit();
        editorEdit.putString("consent_settings", lghVar.l());
        editorEdit.putInt("consent_source", i);
        editorEdit.apply();
        aT().k.b("Setting storage consent(FE)", lghVar);
        this.p = j;
        if (j().S()) {
            lff lffVarJ = j();
            lffVarJ.o();
            lffVarJ.a();
            lffVarJ.B(new lei(lffVarJ, 2));
        } else {
            j().U();
        }
        if (z) {
            j().w(new AtomicReference());
        }
    }

    public final void an(lbf lbfVar) {
        o();
        a();
        lbf lbfVar2 = this.r;
        if (lbfVar != lbfVar2) {
            kro.h(lbfVar2 == null, "EventInterceptor already set.");
        }
        this.r = lbfVar;
    }

    @Override // defpackage.lbc
    protected final boolean f() {
        return false;
    }

    public final lbu s() {
        o();
        lff lffVarJ = j();
        lffVarJ.o();
        lffVarJ.a();
        lco lcoVar = lffVarJ.b;
        if (lcoVar == null) {
            lffVarJ.t();
            lffVarJ.aT().j.a("Failed to get consents; not connected to service yet.");
            return null;
        }
        try {
            lbu lbuVarA = lcoVar.a(lffVarJ.s(false));
            lffVarJ.A();
            return lbuVarA;
        } catch (RemoteException e) {
            lffVarJ.aT().c.b("Failed to get consents; remote exception", e);
            return null;
        }
    }

    public final lgt t() {
        lgt lgtVar;
        synchronized (this) {
            lgtVar = this.m;
            if (lgtVar == null) {
                lgtVar = new lgt(this);
                this.m = lgtVar;
            }
        }
        return lgtVar;
    }

    public final String u() {
        return (String) this.k.get();
    }

    public final String v() {
        lhf lhfVar = this.t.o().a;
        if (lhfVar != null) {
            return lhfVar.b;
        }
        return null;
    }

    public final String w() {
        lhf lhfVar = this.t.o().a;
        if (lhfVar != null) {
            return lhfVar.a;
        }
        return null;
    }

    public final String x() {
        try {
            Context contextAS = aS();
            String strU = this.t.j;
            Resources resources = contextAS.getResources();
            if (TextUtils.isEmpty(strU)) {
                strU = mda.u(contextAS);
            }
            return mda.w(resources, strU);
        } catch (IllegalStateException e) {
            this.t.aT().c.b("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    public final void y() {
        o();
        a();
        if (this.t.y()) {
            Boolean boolL = G().l("google_analytics_deferred_deep_link_enabled");
            if (boolL != null && boolL.booleanValue()) {
                aT().j.a("Deferred Deep Link feature enabled.");
                aU().j(new kcx(this, 19));
            }
            lff lffVarJ = j();
            lffVarJ.o();
            lffVarJ.a();
            lbg lbgVarS = lffVarJ.s(true);
            lffVarJ.G().F(null, lcl.aO);
            lffVarJ.k().v(3, new byte[0]);
            lffVarJ.B(new ihq(lffVarJ, lbgVarS, 12, (char[]) null));
            this.c = false;
            ldl ldlVarJ = J();
            ldlVarJ.o();
            String string = ldlVarJ.b().getString("previous_os_version", null);
            String strC = ldlVarJ.H().c();
            if (!TextUtils.isEmpty(strC) && !strC.equals(string)) {
                SharedPreferences.Editor editorEdit = ldlVarJ.b().edit();
                editorEdit.putString("previous_os_version", strC);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string) || string.equals(H().c())) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            N("auto", "_ou", bundle);
        }
    }
}
