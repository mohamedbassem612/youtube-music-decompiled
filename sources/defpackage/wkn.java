package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.protos.youtube.api.innertube.InnertubeContext$ClientInfo;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wkn {
    public final TelephonyManager a;
    public final AtomicReference b;
    private final Context c;
    private final alol d;
    private final mbc e;
    private final awmd f;
    private final awmd g;
    private final wlb h;
    private final twv i;
    private final wfu j;
    private final afkg k;
    private final AtomicBoolean l;
    private final twv m;
    private final String n;
    private final String o;
    private final AtomicReference p;
    private final Optional q;
    private final tqj r;
    private final tfq s;
    private final int t;

    public wkn(Context context, alol alolVar, TelephonyManager telephonyManager, mbc mbcVar, awmd awmdVar, awmd awmdVar2, vxu vxuVar, vxz vxzVar, wlb wlbVar, tfq tfqVar, wfu wfuVar, afkg afkgVar, Optional optional, tqj tqjVar, vxz vxzVar2) {
        this.c = context;
        this.d = alolVar;
        this.a = telephonyManager;
        this.e = mbcVar;
        this.f = awmdVar;
        this.g = awmdVar2;
        this.h = wlbVar;
        this.i = new wkk(context);
        this.m = new wkl(context, vxuVar, vxzVar);
        this.n = txz.g(context) ? "Android Wear" : txz.d(context) ? "Android Automotive" : txz.e(context) ? "ChromeOS" : "Android";
        this.t = txz.f(context) ? 3 : txz.e(context) ? 2 : (vxzVar2.l(140, 45789354L, false) && txz.g(context)) ? 8 : (vxzVar2.l(140, 45789354L, false) && txz.d(context)) ? 7 : 5;
        this.o = tym.J();
        this.s = tfqVar;
        this.j = wfuVar;
        this.b = new AtomicReference();
        this.l = new AtomicBoolean(false);
        this.k = afkgVar;
        this.q = optional;
        this.r = tqjVar;
        this.p = new AtomicReference();
    }

    private static int[] d(String str) {
        if (str != null) {
            try {
                List listH = agfm.b('.').h(str);
                return new int[]{Integer.parseInt((String) listH.get(0)), Integer.parseInt((String) listH.get(1))};
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object, zwb] */
    public final InnertubeContext$ClientInfo a() {
        aihf aihfVarC = c();
        alom alomVar = ((InnertubeContext$ClientInfo) aihfVarC.instance).z;
        if (alomVar == null) {
            alomVar = alom.a;
        }
        aihf builder = alomVar.toBuilder();
        builder.copyOnWrite();
        alom alomVar2 = (alom) builder.instance;
        alomVar2.b &= -33;
        alom alomVar3 = alom.a;
        alomVar2.e = alomVar3.e;
        builder.copyOnWrite();
        alom alomVar4 = (alom) builder.instance;
        alomVar4.b &= -2;
        alomVar4.c = alomVar3.c;
        builder.copyOnWrite();
        alom alomVar5 = (alom) builder.instance;
        alomVar5.b &= -17;
        alomVar5.d = alomVar3.d;
        aihfVarC.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo = (InnertubeContext$ClientInfo) aihfVarC.instance;
        alom alomVar6 = (alom) builder.build();
        alomVar6.getClass();
        innertubeContext$ClientInfo.z = alomVar6;
        innertubeContext$ClientInfo.c |= 32768;
        List listA = this.j.a();
        if (!listA.isEmpty()) {
            aihfVarC.copyOnWrite();
            ((InnertubeContext$ClientInfo) aihfVarC.instance).n = InnertubeContext$ClientInfo.emptyIntList();
            aihfVarC.bb(listA);
        }
        wlb wlbVar = this.h;
        hdw hdwVar = (hdw) wlbVar;
        abnc abncVar = hdwVar.i;
        int i = 1;
        int i2 = true != abncVar.i ? 2 : 3;
        aihfVarC.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo2 = (InnertubeContext$ClientInfo) aihfVarC.instance;
        innertubeContext$ClientInfo2.A = i2 - 1;
        innertubeContext$ClientInfo2.c |= 262144;
        aihf aihfVarCreateBuilder = ankh.a.createBuilder();
        yco ycoVar = ((ycp) hdwVar.h.io()).e;
        if (abncVar.s() || (ycoVar != null && ycoVar.am())) {
            aihfVarCreateBuilder.copyOnWrite();
            ankh ankhVar = (ankh) aihfVarCreateBuilder.instance;
            ankhVar.c = 1;
            ankhVar.b |= 1;
        } else {
            aihfVarCreateBuilder.copyOnWrite();
            ankh ankhVar2 = (ankh) aihfVarCreateBuilder.instance;
            ankhVar2.c = 2;
            ankhVar2.b |= 1;
        }
        vxz vxzVar = (vxz) hdwVar.f.io();
        hnq hnqVar = (hnq) hdwVar.c.io();
        long epochSecond = 0;
        if (vxzVar.l(98, 45419996L, false)) {
            try {
                long jLongValue = ((Long) afxd.f(hnqVar.h.n(hnqVar.f.e())).h(new hba(hnqVar, 11), hnqVar.g).get()).longValue();
                if (jLongValue > 0) {
                    epochSecond = ((hdw) wlbVar).g.a().minusSeconds(jLongValue).getEpochSecond();
                }
            } catch (InterruptedException | ExecutionException e) {
                ((agrc) ((agrc) ((agrc) hdw.a.b()).j(e)).k("com/google/android/apps/youtube/music/innertube/MusicClientInfoDecorator", "addToClientInfo", (char) 144, "MusicClientInfoDecorator.java")).t("Failure to get timestamp value.");
            }
        }
        boolean zG = hnqVar.g();
        aihfVarCreateBuilder.copyOnWrite();
        ankh ankhVar3 = (ankh) aihfVarCreateBuilder.instance;
        int i3 = 16;
        ankhVar3.b |= 16;
        ankhVar3.d = zG;
        int iC = hnqVar.c();
        aihfVarCreateBuilder.copyOnWrite();
        ankh ankhVar4 = (ankh) aihfVarCreateBuilder.instance;
        ankhVar4.b |= 64;
        ankhVar4.e = iC;
        jnm jnmVar = (jnm) hdwVar.d.io();
        int i4 = jnmVar.d.u() ? jnmVar.C() ? 4 : 2 : 1;
        aihfVarCreateBuilder.copyOnWrite();
        ankh ankhVar5 = (ankh) aihfVarCreateBuilder.instance;
        ankhVar5.f = i4 - 1;
        ankhVar5.b |= SemanticState.ReadOnly;
        aihfVarCreateBuilder.copyOnWrite();
        ankh ankhVar6 = (ankh) aihfVarCreateBuilder.instance;
        ankhVar6.b |= SemanticState.Obscured;
        ankhVar6.g = epochSecond;
        aihfVarC.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo3 = (InnertubeContext$ClientInfo) aihfVarC.instance;
        ankh ankhVar7 = (ankh) aihfVarCreateBuilder.build();
        ankhVar7.getClass();
        innertubeContext$ClientInfo3.P = ankhVar7;
        innertubeContext$ClientInfo3.d |= SemanticState.Hidden;
        List listA2 = ((wfu) hdwVar.j.io()).a();
        if (!listA2.isEmpty()) {
            aihfVarC.copyOnWrite();
            ((InnertubeContext$ClientInfo) aihfVarC.instance).n = InnertubeContext$ClientInfo.emptyIntList();
            aihfVarC.bb(listA2);
        }
        ajet ajetVar = ajet.USER_INTERFACE_THEME_DARK;
        aihfVarC.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo4 = (InnertubeContext$ClientInfo) aihfVarC.instance;
        innertubeContext$ClientInfo4.Q = ajetVar.d;
        innertubeContext$ClientInfo4.d |= SemanticState.Multiline;
        float f = hdwVar.b.getApplicationContext().getResources().getConfiguration().fontScale;
        aihfVarC.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo5 = (InnertubeContext$ClientInfo) aihfVarC.instance;
        innertubeContext$ClientInfo5.e = 77;
        innertubeContext$ClientInfo5.f = Float.valueOf(f);
        hfy hfyVar = (hfy) hdwVar.e.io();
        Map map = (Map) Collection.EL.stream(hfyVar.d.entrySet()).filter(new hkn(hfyVar, i)).collect(aghu.a(new ygi(15), new ygi(i3)));
        if (!map.isEmpty()) {
            aihf aihfVarCreateBuilder2 = akdf.a.createBuilder();
            for (Map.Entry entry : map.entrySet()) {
                zne zneVar = (zne) entry.getKey();
                Instant instant = (Instant) entry.getValue();
                aihf aihfVarCreateBuilder3 = akde.a.createBuilder();
                String str = zneVar.b().b;
                aihfVarCreateBuilder3.copyOnWrite();
                akde akdeVar = (akde) aihfVarCreateBuilder3.instance;
                akdeVar.b |= 1;
                akdeVar.c = str;
                if (instant != null) {
                    aijp aijpVarAv = ahng.av(instant);
                    aihfVarCreateBuilder3.copyOnWrite();
                    akde akdeVar2 = (akde) aihfVarCreateBuilder3.instance;
                    aijpVarAv.getClass();
                    akdeVar2.d = aijpVarAv;
                    akdeVar2.b |= 2;
                }
                aihfVarCreateBuilder2.copyOnWrite();
                akdf akdfVar = (akdf) aihfVarCreateBuilder2.instance;
                akde akdeVar3 = (akde) aihfVarCreateBuilder3.build();
                akdeVar3.getClass();
                aiie aiieVar = akdfVar.b;
                if (!aiieVar.c()) {
                    akdfVar.b = aihn.mutableCopy(aiieVar);
                }
                akdfVar.b.add(akdeVar3);
            }
            aihfVarC.copyOnWrite();
            InnertubeContext$ClientInfo innertubeContext$ClientInfo6 = (InnertubeContext$ClientInfo) aihfVarC.instance;
            akdf akdfVar2 = (akdf) aihfVarCreateBuilder2.build();
            akdfVar2.getClass();
            innertubeContext$ClientInfo6.X = akdfVar2;
            innertubeContext$ClientInfo6.d |= 33554432;
        }
        return (InnertubeContext$ClientInfo) aihfVarC.build();
    }

    public final String b() {
        String networkCountryIso = this.a.getNetworkCountryIso();
        if (true == TextUtils.isEmpty(networkCountryIso)) {
            networkCountryIso = "";
        }
        String strReplace = networkCountryIso.trim().replace(",", "");
        if (strReplace.length() > 2) {
            strReplace = strReplace.substring(0, 2);
        }
        int i = typ.a;
        return strReplace.toUpperCase(Locale.US);
    }

    public final aihf c() {
        alon alonVar;
        aihf aihfVarCreateBuilder = InnertubeContext$ClientInfo.a.createBuilder();
        Locale locale = Locale.getDefault();
        int i = wlw.a;
        String languageTag = locale.toLanguageTag();
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
        languageTag.getClass();
        int i2 = 2;
        innertubeContext$ClientInfo.b |= 2;
        innertubeContext$ClientInfo.h = languageTag;
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo2 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
        innertubeContext$ClientInfo2.o = this.d.aO;
        innertubeContext$ClientInfo2.b |= 33554432;
        String str = (String) this.i.io();
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo3 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
        str.getClass();
        innertubeContext$ClientInfo3.b |= 134217728;
        innertubeContext$ClientInfo3.q = str;
        String str2 = Build.VERSION.RELEASE;
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo4 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
        str2.getClass();
        innertubeContext$ClientInfo4.c |= 64;
        innertubeContext$ClientInfo4.w = str2;
        int i3 = Build.VERSION.SDK_INT;
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo5 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
        innertubeContext$ClientInfo5.b |= 67108864;
        innertubeContext$ClientInfo5.p = i3;
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo6 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
        innertubeContext$ClientInfo6.c |= 32;
        innertubeContext$ClientInfo6.v = this.n;
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo7 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
        innertubeContext$ClientInfo7.J = this.t - 1;
        innertubeContext$ClientInfo7.c |= 268435456;
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo8 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
        innertubeContext$ClientInfo8.c |= SemanticState.LiveRegion;
        innertubeContext$ClientInfo8.x = this.o;
        String str3 = Build.MANUFACTURER;
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo9 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
        str3.getClass();
        innertubeContext$ClientInfo9.b |= Integer.MIN_VALUE;
        innertubeContext$ClientInfo9.r = str3;
        String str4 = Build.BRAND;
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo10 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
        str4.getClass();
        final int i4 = 1;
        innertubeContext$ClientInfo10.c |= 1;
        innertubeContext$ClientInfo10.s = str4;
        String str5 = Build.MODEL;
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo11 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
        str5.getClass();
        innertubeContext$ClientInfo11.c |= 2;
        innertubeContext$ClientInfo11.t = str5;
        int iIntValue = ((Integer) this.f.io()).intValue();
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo12 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
        innertubeContext$ClientInfo12.d |= 1;
        innertubeContext$ClientInfo12.M = iIntValue;
        tqj tqjVar = this.r;
        int i5 = tqr.a;
        if (tqjVar.k(1073830286)) {
            ((wmr) this.g.io()).c();
        }
        aloj alojVar = (aloj) this.m.io();
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo13 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
        innertubeContext$ClientInfo13.K = alojVar.f;
        innertubeContext$ClientInfo13.c |= 1073741824;
        mbc mbcVar = this.e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        int offset = (int) (((long) TimeZone.getDefault().getOffset(mbcVar.f().toEpochMilli())) / 60000);
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo14 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
        innertubeContext$ClientInfo14.d |= 32;
        innertubeContext$ClientInfo14.N = offset;
        String id = TimeZone.getDefault().getID();
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo15 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
        id.getClass();
        innertubeContext$ClientInfo15.d |= 64;
        innertubeContext$ClientInfo15.O = id;
        if (!this.l.getAndSet(true) && Build.VERSION.SDK_INT <= 30) {
            this.k.post(new wvr(this, 1));
        }
        final int i6 = 0;
        String str6 = (String) DesugarAtomicReference.updateAndGet(this.b, new UnaryOperator() { // from class: wkj
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public final /* synthetic */ Function mo840andThen(Function function) {
                return i6 != 0 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                if (i6 == 0) {
                    String str7 = (String) obj;
                    return str7 == null ? ((wkn) this).b() : str7;
                }
                ActivityManager activityManager = (ActivityManager) ((Context) this).getSystemService("activity");
                if (activityManager == null) {
                    return alon.a;
                }
                ConfigurationInfo deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo();
                int i7 = deviceConfigurationInfo.reqGlEsVersion != 0 ? deviceConfigurationInfo.reqGlEsVersion : 65536;
                aihf aihfVarCreateBuilder2 = alon.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                alon alonVar2 = (alon) aihfVarCreateBuilder2.instance;
                alonVar2.b |= 2;
                alonVar2.d = i7 >> 16;
                aihfVarCreateBuilder2.copyOnWrite();
                alon alonVar3 = (alon) aihfVarCreateBuilder2.instance;
                alonVar3.b |= 4;
                alonVar3.e = (char) i7;
                return (alon) aihfVarCreateBuilder2.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return i6 != 0 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
            }
        });
        if (!TextUtils.isEmpty(str6)) {
            aihfVarCreateBuilder.copyOnWrite();
            InnertubeContext$ClientInfo innertubeContext$ClientInfo16 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
            str6.getClass();
            innertubeContext$ClientInfo16.b |= 16;
            innertubeContext$ClientInfo16.j = str6;
        }
        ajuf ajufVarA = ajuf.a(this.s.a());
        if (ajufVarA != null) {
            aihfVarCreateBuilder.copyOnWrite();
            InnertubeContext$ClientInfo innertubeContext$ClientInfo17 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
            innertubeContext$ClientInfo17.y = ajufVarA.p;
            innertubeContext$ClientInfo17.c |= SemanticState.Modal;
        }
        wmr wmrVar = (wmr) this.g.io();
        wmq wmqVar = (wmq) wmrVar.a.io();
        int i7 = wmqVar.a;
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo18 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
        innertubeContext$ClientInfo18.c |= 1048576;
        innertubeContext$ClientInfo18.B = i7;
        int i8 = wmqVar.b;
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo19 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
        innertubeContext$ClientInfo19.c |= 2097152;
        innertubeContext$ClientInfo19.C = i8;
        float f = wmqVar.c;
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo20 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
        innertubeContext$ClientInfo20.c |= 16777216;
        innertubeContext$ClientInfo20.F = f;
        float f2 = wmqVar.d;
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo21 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
        innertubeContext$ClientInfo21.c |= 33554432;
        innertubeContext$ClientInfo21.G = f2;
        float f3 = wmqVar.e;
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo22 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
        innertubeContext$ClientInfo22.c |= 134217728;
        innertubeContext$ClientInfo22.I = f3;
        int iRound = Math.round(f3);
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo23 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
        innertubeContext$ClientInfo23.c |= 67108864;
        innertubeContext$ClientInfo23.H = iRound;
        wmq wmqVar2 = wmrVar.c;
        if (wmqVar2 != null) {
            aihfVarCreateBuilder.copyOnWrite();
            InnertubeContext$ClientInfo innertubeContext$ClientInfo24 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
            innertubeContext$ClientInfo24.c |= 8388608;
            innertubeContext$ClientInfo24.E = wmqVar2.b;
            aihfVarCreateBuilder.copyOnWrite();
            InnertubeContext$ClientInfo innertubeContext$ClientInfo25 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
            innertubeContext$ClientInfo25.c |= 4194304;
            innertubeContext$ClientInfo25.D = wmqVar2.a;
            if (tqjVar.k(1073830286)) {
                wmrVar.c();
            }
        }
        final Context context = this.c;
        Optional optional = this.q;
        AtomicReference atomicReference = this.p;
        if (atomicReference.get() != null) {
            alonVar = (alon) atomicReference.get();
        } else if (!tqjVar.k(1073814179) || optional.isEmpty()) {
            alonVar = (alon) DesugarAtomicReference.updateAndGet(atomicReference, new UnaryOperator() { // from class: wkj
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public final /* synthetic */ Function mo840andThen(Function function) {
                    return i4 != 0 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    if (i4 == 0) {
                        String str7 = (String) obj;
                        return str7 == null ? ((wkn) context).b() : str7;
                    }
                    ActivityManager activityManager = (ActivityManager) ((Context) context).getSystemService("activity");
                    if (activityManager == null) {
                        return alon.a;
                    }
                    ConfigurationInfo deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo();
                    int i9 = deviceConfigurationInfo.reqGlEsVersion != 0 ? deviceConfigurationInfo.reqGlEsVersion : 65536;
                    aihf aihfVarCreateBuilder2 = alon.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    alon alonVar2 = (alon) aihfVarCreateBuilder2.instance;
                    alonVar2.b |= 2;
                    alonVar2.d = i9 >> 16;
                    aihfVarCreateBuilder2.copyOnWrite();
                    alon alonVar3 = (alon) aihfVarCreateBuilder2.instance;
                    alonVar3.b |= 4;
                    alonVar3.e = (char) i9;
                    return (alon) aihfVarCreateBuilder2.build();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return i4 != 0 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
                }
            });
        } else {
            alon alonVar2 = alon.a;
            aihf aihfVarCreateBuilder2 = alonVar2.createBuilder();
            vca vcaVar = (vca) optional.get();
            String strB = vcaVar.a().b();
            if (strB == null) {
                alonVar = alonVar2;
            } else {
                aihfVarCreateBuilder2.copyOnWrite();
                alon alonVar3 = (alon) aihfVarCreateBuilder2.instance;
                alonVar3.b |= 1;
                alonVar3.c = strB;
                int[] iArrD = d(vcaVar.a().d());
                if (iArrD != null) {
                    int i9 = iArrD[0];
                    aihfVarCreateBuilder2.copyOnWrite();
                    alon alonVar4 = (alon) aihfVarCreateBuilder2.instance;
                    alonVar4.b |= 2;
                    alonVar4.d = i9;
                    int i10 = iArrD[1];
                    aihfVarCreateBuilder2.copyOnWrite();
                    alon alonVar5 = (alon) aihfVarCreateBuilder2.instance;
                    alonVar5.b |= 4;
                    alonVar5.e = i10;
                }
                alonVar = (alon) DesugarAtomicReference.updateAndGet(atomicReference, new tu(aihfVarCreateBuilder2, i2));
            }
        }
        if (alonVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            InnertubeContext$ClientInfo innertubeContext$ClientInfo26 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
            innertubeContext$ClientInfo26.u = alonVar;
            innertubeContext$ClientInfo26.c |= 4;
        }
        return aihfVarCreateBuilder;
    }
}
