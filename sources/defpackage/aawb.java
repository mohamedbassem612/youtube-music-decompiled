package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.backup.Backup;
import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.elements.interfaces.BlockRegistryProvider;
import com.google.android.libraries.elements.interfaces.BlocksCapsFfi;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.CoreUpbSubscriptionProcessorRegistrar;
import com.google.android.libraries.elements.interfaces.ForeignFunction;
import com.google.android.libraries.elements.interfaces.SubscriptionProcessorRegistrar;
import com.google.android.libraries.elements.interfaces.SubscriptionProcessorRegistrarUpb;
import com.google.android.libraries.elements.interfaces.SubscriptionProcessorResolver;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.concurrent.ThreadLocalRandom;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;
import org.xml.sax.Attributes;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class aawb {

    @Backup
    public static final String QUICK_SEEK_PREFERENCE_STRING = "double_tap_skip_duration";

    public aawb(awmd awmdVar, abwg abwgVar) {
        abwgVar.getClass();
        ((avlh) abwgVar.c).x(new ifu(new xzn(12), 5)).H(new vvb(new xzn(13), 14)).al(new acae(new rri(awmdVar, 10), 7), new acae(acgq.a, 8));
    }

    public static /* synthetic */ String A(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "VIDEO_ERROR";
            case 3:
                return "UNPLAYABLE";
            case 4:
                return "REQUEST_FAILED";
            case 5:
                return "USER_AGE_CHECK_FAILED";
            case 6:
                return "USER_CONTENT_CHECK_FAILED";
            case 7:
                return "LICENSE_SERVER_ERROR";
            case 8:
                return "LICENSE_SERVER_NET_ERROR";
            case 9:
                return "LICENSE_SERVER_CONCURRENT_PLAYBACK_ERROR";
            case 10:
                return "PLAYER_ERROR";
            case 11:
                return "NO_STREAMS";
            case 12:
                return "WATCH_NEXT_ERROR";
            case 13:
                return "UNPLAYABLE_IN_BACKGROUND";
            case 14:
                return "UNPLAYABLE_IN_PICTURE_IN_PICTURE";
            case 15:
                return "UNPLAYABLE_BY_APP_POLICY";
            case 16:
                return "PARTIAL_PLAYBACK_DATA_EXHAUSTED";
            default:
                return "EMBARGOED";
        }
    }

    public static boolean B(int i) {
        return C(i, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 13, 14, 15, 17);
    }

    public static boolean C(int i, int... iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public static abep D(aawf aawfVar) {
        aawfVar.getClass();
        return new abep(aawfVar);
    }

    public static float E(aqmh aqmhVar) {
        float f = -1.0f;
        if (O(aqmhVar)) {
            for (aqmg aqmgVar : aqmhVar.c) {
                int i = aqmgVar.e;
                if (i != 0) {
                    float f2 = aqmgVar.d / i;
                    if (f2 > f) {
                        f = f2;
                    }
                }
            }
        }
        return f;
    }

    public static Uri F(aqmh aqmhVar) {
        aqmg aqmgVarJ = J(aqmhVar);
        if (aqmgVarJ == null) {
            return null;
        }
        return tyu.d(aqmgVarJ.c);
    }

    public static Uri G(aqmh aqmhVar, int i, int i2) {
        aqmg aqmgVarK = K(aqmhVar, i, i2);
        if (aqmgVarK == null || (aqmgVarK.b & 1) == 0) {
            return null;
        }
        return tyu.d(aqmgVarK.c);
    }

    public static Uri H(aqmh aqmhVar) {
        aqmg aqmgVarM = M(aqmhVar);
        if (aqmgVarM != null) {
            return tyu.d(aqmgVarM.c);
        }
        return null;
    }

    public static aqmg I(String str, int i, int i2) {
        aihf aihfVarCreateBuilder = aqmg.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aqmg aqmgVar = (aqmg) aihfVarCreateBuilder.instance;
        str.getClass();
        aqmgVar.b |= 1;
        aqmgVar.c = str;
        aihfVarCreateBuilder.copyOnWrite();
        aqmg aqmgVar2 = (aqmg) aihfVarCreateBuilder.instance;
        aqmgVar2.b |= 2;
        aqmgVar2.d = i;
        aihfVarCreateBuilder.copyOnWrite();
        aqmg aqmgVar3 = (aqmg) aihfVarCreateBuilder.instance;
        aqmgVar3.b |= 4;
        aqmgVar3.e = i2;
        return (aqmg) aihfVarCreateBuilder.build();
    }

    public static aqmg J(aqmh aqmhVar) {
        if (!O(aqmhVar)) {
            return null;
        }
        return (aqmg) aqmhVar.c.get(aqmhVar.c.size() - 1);
    }

    public static aqmg K(aqmh aqmhVar, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        aqmg aqmgVar = null;
        if (O(aqmhVar)) {
            int i3 = 0;
            for (aqmg aqmgVar2 : aqmhVar.c) {
                int i4 = i - aqmgVar2.d;
                int i5 = i2 - aqmgVar2.e;
                int i6 = (i4 * i4) + (i5 * i5);
                if (aqmgVar == null || i6 < i3) {
                    aqmgVar = aqmgVar2;
                    i3 = i6;
                }
            }
        }
        return aqmgVar;
    }

    public static aqmg L(aqmh aqmhVar, int i) {
        if (aqmhVar == null || !O(aqmhVar)) {
            return null;
        }
        if (i <= 0) {
            return (aqmg) aqmhVar.c.get(0);
        }
        for (aqmg aqmgVar : aqmhVar.c) {
            if (aqmgVar.d >= i) {
                return aqmgVar;
            }
        }
        return (aqmg) aqmhVar.c.get(aqmhVar.c.size() - 1);
    }

    public static aqmg M(aqmh aqmhVar) {
        if (O(aqmhVar)) {
            return (aqmg) aqmhVar.c.get(0);
        }
        return null;
    }

    public static aqmh N(Uri uri) {
        if (uri == null) {
            return null;
        }
        aihh aihhVar = (aihh) aqmh.a.createBuilder();
        aihf aihfVarCreateBuilder = aqmg.a.createBuilder();
        String string = uri.toString();
        aihfVarCreateBuilder.copyOnWrite();
        aqmg aqmgVar = (aqmg) aihfVarCreateBuilder.instance;
        string.getClass();
        aqmgVar.b |= 1;
        aqmgVar.c = string;
        aihhVar.x(aihfVarCreateBuilder);
        return (aqmh) aihhVar.build();
    }

    public static boolean O(aqmh aqmhVar) {
        return aqmhVar != null && aqmhVar.c.size() > 0;
    }

    public static boolean P(aqmh aqmhVar) {
        return O(aqmhVar) && ((aqmg) aqmhVar.c.get(0)).e == ((aqmg) aqmhVar.c.get(0)).d;
    }

    public static tpq Q(qrx qrxVar) {
        return new tpn(omj.U(qrxVar), atot.a);
    }

    public static tpq R(Context context, rrq rrqVar) {
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("disk_cache_serving_context_module");
        qpqVar.d("disk_cache_serving_context.pb");
        Uri uriA = qpqVar.a();
        qrl qrlVarA = qrm.a();
        qrlVarA.f(uriA);
        asmo asmoVar = asmo.a;
        qrlVarA.e(asmoVar);
        return new tpn(omj.U(rrqVar.c(qrlVarA.a())), asmoVar);
    }

    public static nrw S(addo addoVar, awmd awmdVar, vxz vxzVar) {
        return vxzVar.l(17, 45400744L, false) ? new adgx((aciz) awmdVar.io(), addoVar, "InnerTubeCommandExtensionHandler") : addoVar;
    }

    public static nzm T(boolean z, nzw nzwVar, boolean z2, aunn aunnVar) {
        return new nzm(z, nzwVar, z2, (adam) aunnVar.io());
    }

    public static adam U(adbv adbvVar) {
        return new adam(((adbt) adbvVar.a()).d, new Random());
    }

    public static boolean V(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, vxz vxzVar) {
        if (!vxzVar.l(145, 45715290L, false)) {
            if (!((adbt) ((adbv) awmdVar.io()).a()).b || !((szb) awmdVar2.io()).b(((adbt) ((adbv) awmdVar.io()).a()).c, szc.c)) {
                return false;
            }
        }
        return true;
    }

    public static BlockRegistryProvider W(awmd awmdVar) {
        return new acxj(new adav(awmdVar, 0));
    }

    public static ForeignFunction X(Container container) {
        ForeignFunction foreignFunctionCreate = BlocksCapsFfi.create(container);
        foreignFunctionCreate.getClass();
        return foreignFunctionCreate;
    }

    public static SubscriptionProcessorRegistrar Y(aunn aunnVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, aunn aunnVar2, aunn aunnVar3, Optional optional, Optional optional2, Optional optional3) {
        return new adbi(aunnVar, awmdVar, Optional.of(awmdVar2), awmdVar3, aunnVar2, aunnVar3, optional, optional2, ((Boolean) optional3.orElse(Boolean.FALSE)).booleanValue());
    }

    public static SubscriptionProcessorRegistrarUpb Z(aunn aunnVar, awmd awmdVar, awmd awmdVar2, aunn aunnVar2, aunn aunnVar3, Optional optional, Optional optional2, awmd awmdVar3, Optional optional3) {
        return new adbk(aunnVar, awmdVar, Optional.of(awmdVar2), aunnVar2, aunnVar3, optional, optional2, awmdVar3, ((Boolean) optional3.orElse(Boolean.FALSE)).booleanValue());
    }

    public static SubscriptionProcessorResolver aa(ByteStore byteStore, SubscriptionProcessorRegistrarUpb subscriptionProcessorRegistrarUpb) {
        SubscriptionProcessorResolver subscriptionProcessorResolverCreateEmpty = SubscriptionProcessorResolver.createEmpty();
        subscriptionProcessorResolverCreateEmpty.getClass();
        CoreUpbSubscriptionProcessorRegistrar.registerProcessors(subscriptionProcessorResolverCreateEmpty, byteStore);
        subscriptionProcessorRegistrarUpb.registerProcessors(subscriptionProcessorResolverCreateEmpty);
        return subscriptionProcessorResolverCreateEmpty;
    }

    public static boolean ab() {
        return ThreadLocalRandom.current().nextInt(1000) == 0;
    }

    public static nrw ac(addm addmVar, awmd awmdVar, vxz vxzVar) {
        return vxzVar.l(17, 45400744L, false) ? new adgx((aciz) awmdVar.io(), addmVar, "InlinePlaybackDelegateCommandHandler") : addmVar;
    }

    public static nru ad(Object obj, amdd amddVar, Map map) {
        if (amddVar == null) {
            amddVar = null;
        }
        return new adar(map, new adaq(obj, amddVar, null, null));
    }

    /* JADX WARN: Code duplicated, block: B:192:0x032b  */
    /* JADX WARN: Code duplicated, block: B:194:0x032f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:195:0x0331  */
    /* JADX WARN: Code duplicated, block: B:196:0x0336  */
    /* JADX WARN: Code duplicated, block: B:214:? A[RETURN, SYNTHETIC] */
    public static acjx ae(Object obj) {
        int i;
        String str;
        int iAV;
        acjw acjwVar;
        String str2;
        String str3;
        akek akekVar;
        ajtt ajttVar = null;
        ajtt ajttVar2 = null;
        akek akekVar2 = null;
        if (obj instanceof aobx) {
            aobx aobxVar = (aobx) obj;
            if ((aobxVar.b & SemanticState.Hidden) == 0) {
                str3 = aobxVar.e;
                akekVar = null;
            } else {
                akel akelVar = aobxVar.h;
                if (akelVar == null) {
                    akelVar = akel.a;
                }
                int i2 = akelVar.b;
                if (i2 == 1) {
                    akekVar = i2 == 1 ? (akek) akelVar.c : akek.a;
                    str3 = akekVar.c;
                } else {
                    Log.e("Continuations", "NextContinuationData has continuationToken but no continuationData.");
                    str3 = aobxVar.e;
                    akekVar = null;
                }
            }
            acka ackaVar = new acka();
            ackaVar.b(aobxVar);
            ackaVar.b = (aobxVar.b & 4) != 0 ? aobxVar.f.G() : new byte[0];
            ackaVar.c = acjw.b;
            ackaVar.a = str3;
            ackaVar.f = true;
            ackaVar.i = akekVar;
            if ((aobxVar.b & SemanticState.LiveRegion) != 0 && (ajttVar2 = aobxVar.i) == null) {
                ajttVar2 = ajtt.a;
            }
            ackaVar.h = ajttVar2;
            return ackaVar.a();
        }
        if (obj instanceof aobz) {
            aobz aobzVar = (aobz) obj;
            acka ackaVar2 = new acka();
            ackaVar2.b(aobzVar);
            ackaVar2.b = (aobzVar.b & 2) != 0 ? aobzVar.d.G() : new byte[0];
            ackaVar2.c = acjw.h;
            ackaVar2.a = aobzVar.c;
            return ackaVar2.a();
        }
        if (obj instanceof aoyh) {
            aoyh aoyhVar = (aoyh) obj;
            acka ackaVar3 = new acka();
            ackaVar3.b(aoyhVar);
            ackaVar3.b = (aoyhVar.b & 2) != 0 ? aoyhVar.d.G() : new byte[0];
            ackaVar3.c = acjw.c;
            ackaVar3.a = aoyhVar.c;
            return ackaVar3.a();
        }
        if (obj instanceof apho) {
            apho aphoVar = (apho) obj;
            acka ackaVar4 = new acka();
            ackaVar4.b(aphoVar);
            ackaVar4.b = (aphoVar.c & 64) != 0 ? aphoVar.h.G() : new byte[0];
            ackaVar4.c = acjw.d;
            ackaVar4.a = aphoVar.d;
            ackaVar4.d = aphoVar.e;
            ackaVar4.e = aphoVar.j;
            ackaVar4.f = aphoVar.g;
            ajtt ajttVar3 = aphoVar.i;
            if (ajttVar3 == null) {
                ajttVar3 = ajtt.a;
            }
            ackaVar4.h = ajttVar3;
            return ackaVar4.a();
        }
        if (obj instanceof aqmx) {
            aqmx aqmxVar = (aqmx) obj;
            if ((aqmxVar.b & 16) == 0) {
                str2 = aqmxVar.d;
            } else {
                akel akelVar2 = aqmxVar.f;
                if (akelVar2 == null) {
                    akelVar2 = akel.a;
                }
                int i3 = akelVar2.b;
                if (i3 == 1) {
                    akekVar2 = i3 == 1 ? (akek) akelVar2.c : akek.a;
                    str2 = akekVar2.c;
                } else {
                    Log.e("Continuations", "TimedContinuationData has continuationToken but no continuationData.");
                    str2 = aqmxVar.d;
                }
            }
            acka ackaVar5 = new acka();
            ackaVar5.b(aqmxVar);
            ackaVar5.b = (aqmxVar.b & 8) != 0 ? aqmxVar.e.G() : new byte[0];
            ackaVar5.c = acjw.e;
            ackaVar5.a = str2;
            ackaVar5.i = akekVar2;
            return ackaVar5.a();
        }
        if (obj instanceof airm) {
            airm airmVar = (airm) obj;
            acka ackaVar6 = new acka();
            ackaVar6.b(airmVar);
            ackaVar6.b = (airmVar.b & 4) != 0 ? airmVar.c.G() : new byte[0];
            ackaVar6.c = acjw.g;
            ackaVar6.a = airmVar.d;
            return ackaVar6.a();
        }
        if (obj instanceof amfj) {
            amfj amfjVar = (amfj) obj;
            acka ackaVar7 = new acka();
            ackaVar7.b(amfjVar);
            ackaVar7.b = (amfjVar.b & 32) != 0 ? amfjVar.f.G() : new byte[0];
            ackaVar7.c = acjw.f;
            ackaVar7.a = amfjVar.e;
            return ackaVar7.a();
        }
        if (obj instanceof aoik) {
            aoik aoikVar = (aoik) obj;
            acka ackaVar8 = new acka();
            ackaVar8.b(aoikVar);
            ackaVar8.b = (aoikVar.b & 2) != 0 ? aoikVar.d.G() : new byte[0];
            ackaVar8.c = acjw.a;
            ackaVar8.a = aoikVar.c;
            return ackaVar8.a();
        }
        if (obj instanceof aosj) {
            aosj aosjVar = (aosj) obj;
            acka ackaVar9 = new acka();
            ackaVar9.b(aosjVar);
            ackaVar9.b = (aosjVar.b & 2) != 0 ? aosjVar.d.G() : new byte[0];
            ackaVar9.c = acjw.a;
            ackaVar9.a = aosjVar.c;
            return ackaVar9.a();
        }
        if (obj instanceof amqr) {
            amqr amqrVar = (amqr) obj;
            acka ackaVar10 = new acka();
            ackaVar10.b(amqrVar);
            ackaVar10.b = (amqrVar.b & 4) != 0 ? amqrVar.e.G() : new byte[0];
            ackaVar10.c = acjw.a;
            ackaVar10.a = amqrVar.d;
            return ackaVar10.a();
        }
        if (obj instanceof apoi) {
            apoi apoiVar = (apoi) obj;
            acka ackaVar11 = new acka();
            ackaVar11.b(apoiVar);
            ackaVar11.b = (apoiVar.b & 2) != 0 ? apoiVar.d.G() : new byte[0];
            ackaVar11.c = acjw.j;
            ackaVar11.a = apoiVar.c;
            ackaVar11.f = true;
            ackaVar11.g = true;
            if ((apoiVar.b & 8) != 0 && (ajttVar = apoiVar.e) == null) {
                ajttVar = ajtt.a;
            }
            ackaVar11.h = ajttVar;
            return ackaVar11.a();
        }
        if (obj instanceof aqpx) {
            aqpx aqpxVar = (aqpx) obj;
            aqpw aqpwVar = aqpxVar.d;
            if (aqpwVar == null) {
                aqpwVar = aqpw.a;
            }
            if (aqpwVar.b != 1 || (iAV = a.aV(((Integer) aqpwVar.c).intValue())) == 0) {
                iAV = 1;
            }
            int i4 = iAV - 1;
            if (i4 == 1) {
                acjwVar = acjw.k;
            } else {
                if (i4 != 2) {
                    return null;
                }
                acjwVar = acjw.l;
            }
            acka ackaVar12 = new acka();
            ackaVar12.b(aqpxVar);
            ackaVar12.b = (aqpxVar.b & 4) != 0 ? aqpxVar.e.G() : new byte[0];
            ackaVar12.c = acjwVar;
            ackaVar12.a = aqpxVar.c;
            ackaVar12.f = true;
            return ackaVar12.a();
        }
        if (!(obj instanceof aqhn)) {
            if (!(obj instanceof ajla)) {
                return null;
            }
            ajla ajlaVar = (ajla) obj;
            acka ackaVar13 = new acka();
            ackaVar13.b(ajlaVar);
            ackaVar13.b = new byte[0];
            ackaVar13.c = acjw.m;
            akel akelVar3 = ajlaVar.c;
            if (akelVar3 == null) {
                akelVar3 = akel.a;
            }
            ackaVar13.a = (akelVar3.b == 1 ? (akek) akelVar3.c : akek.a).c;
            return ackaVar13.a();
        }
        aqhn aqhnVar = (aqhn) obj;
        int i5 = aqhnVar.c;
        if (i5 == 3) {
            if ((i5 == 3 ? (akel) aqhnVar.d : akel.a).b == 2) {
                byte[] bArrG = new byte[0];
                akel akelVar4 = aqhnVar.c == 3 ? (akel) aqhnVar.d : akel.a;
                ajlb ajlbVar = akelVar4.b == 2 ? (ajlb) akelVar4.c : ajlb.a;
                if (ajlbVar == null) {
                    throw new NullPointerException("Null batchItemContinuationData");
                }
                if ((aqhnVar.b & 1) != 0) {
                    bArrG = aqhnVar.e.G();
                }
                return new acjz(ajlbVar, bArrG, acjw.n);
            }
        }
        int i6 = aqhnVar.c;
        if (i6 != 3) {
            i = aqhnVar.c;
            if (i == 1) {
                return null;
            }
            if (i == 1) {
                str = (String) aqhnVar.d;
            } else {
                str = "";
            }
        } else {
            if ((i6 == 3 ? (akel) aqhnVar.d : akel.a).b == 1) {
                akel akelVar5 = aqhnVar.c == 3 ? (akel) aqhnVar.d : akel.a;
                str = (akelVar5.b == 1 ? (akek) akelVar5.c : akek.a).c;
            } else {
                i = aqhnVar.c;
                if (i == 1) {
                    return null;
                }
                if (i == 1) {
                    str = (String) aqhnVar.d;
                } else {
                    str = "";
                }
            }
        }
        acka ackaVar14 = new acka();
        ackaVar14.b(aqhnVar);
        ackaVar14.b = (aqhnVar.b & 1) != 0 ? aqhnVar.e.G() : new byte[0];
        ackaVar14.c = acjw.i;
        ackaVar14.a = str;
        return ackaVar14.a();
    }

    public static acjx af(String str, byte[] bArr, acjw acjwVar, alap alapVar, boolean z, boolean z2, boolean z3, boolean z4) {
        if (bArr == null) {
            throw new NullPointerException("Null requestTrackingParams");
        }
        if (acjwVar == null) {
            throw new NullPointerException("Null type");
        }
        if (str != null) {
            return new ackc(str, bArr, acjwVar, alapVar, z, z2, z4, z3);
        }
        throw new NullPointerException("Null continuationToken");
    }

    public static Object ag(acjx acjxVar, Class cls) {
        if (acjxVar instanceof ackb) {
            Object obj = ((ackb) acjxVar).a;
            if (cls.isAssignableFrom(obj.getClass())) {
                return obj;
            }
        }
        return null;
    }

    public static acer ah() {
        return new acer(new acdq(), new aces(), new acet());
    }

    public static Object ai(vxz vxzVar, aerj aerjVar, abvn abvnVar) {
        if (!vxzVar.l(182, 45712016L, false)) {
            return new Object();
        }
        aapn aapnVarH = aerjVar.h();
        aapnVarH.d(abvnVar);
        return aapnVarH;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aeda, java.lang.Object] */
    public static mfy aj(Activity activity, abfv abfvVar, adfn adfnVar, addl addlVar) {
        return ((activity instanceof afnb) && abfvVar.a.m()) ? adfnVar : addlVar;
    }

    public static fg ak(Context context, aawb aawbVar) {
        return new fg(context, "YouTube playerlib", new ComponentName(context.getPackageName(), aawbVar.a()), null);
    }

    public static abrt al(Context context, acdq acdqVar, abxv abxvVar, acdo acdoVar, abvn abvnVar, abrv abrvVar, abrp abrpVar, mbc mbcVar, awmd awmdVar, List list, abmt abmtVar) {
        return new abrt(context, acdqVar, abxvVar, acdoVar, abvnVar.Z(), abrpVar, abrvVar, mbcVar, (abrx) awmdVar.io(), list, abmtVar);
    }

    public static void am(dov dovVar, boolean z, abmt abmtVar) {
        dovVar.ay("/transcript", new acau(z, abmtVar));
        dovVar.ay("/transcript/text", new acat());
    }

    public static void an(dov dovVar, boolean z, abmt abmtVar) {
        dovVar.ay("/timedtext", new acas(z, abmtVar));
        dovVar.ay("/timedtext/window", new acar());
        dovVar.ay("/timedtext/text", new acbb());
        dovVar.ay("/timedtext/head/pen", new acba(abmtVar));
        dovVar.ay("/timedtext/head/ws", new acaz());
        dovVar.ay("/timedtext/head/wp", new acay());
        dovVar.ay("/timedtext/body/w", new acax());
        dovVar.ay("/timedtext/body/p", new acaw(abmtVar));
        dovVar.ay("/timedtext/body/p/s", new acav(abmtVar));
    }

    public static afvn b(aazj aazjVar, String str) {
        tsa tsaVar = tsa.EVENT_BUS_HANDLE_VIDEO_STAGE_EVENT;
        String str2 = aazjVar != null ? aazjVar.g : null;
        int i = aawm.a;
        return tym.ae(tsaVar, aawm.a(new qci(str), str2));
    }

    public static syp c(vxz vxzVar, tqj tqjVar, awmd awmdVar, syr syrVar) {
        syp sypVarB;
        if (vxzVar.l(15, 45796225L, false)) {
            return new aavb();
        }
        if (vxzVar.l(10, 45782790L, false)) {
            int iC = (int) vxzVar.c(2, 45782791L, 0L);
            if (iC <= 0) {
                iC = 1000;
            }
            sypVarB = new syq(iC);
            syrVar.a.add(new WeakReference(sypVarB, syrVar.b));
        } else {
            int iC2 = (int) vxzVar.c(1, 45782789L, 0L);
            if (iC2 <= 0) {
                iC2 = 20;
            }
            sypVarB = syrVar.b(iC2);
        }
        if (tqjVar == null) {
            return sypVarB;
        }
        int i = tqr.a;
        if (!tqjVar.l(1074420144, 64)) {
            return sypVarB;
        }
        agev agevVar = (agev) awmdVar.io();
        if (!agevVar.g()) {
            return sypVarB;
        }
        ((tes) agevVar.c()).b(new aava(sypVarB), tew.d, tew.e);
        return sypVarB;
    }

    public static int d(int i, String str) {
        if (i == 0) {
            return !TextUtils.isEmpty(str) ? 0 : -1;
        }
        return i;
    }

    public static atpu e() {
        aihf aihfVarCreateBuilder = atpu.a.createBuilder();
        Duration durationOfSeconds = Duration.ofSeconds(10L);
        durationOfSeconds.getClass();
        aigu aiguVarD = aikw.d(durationOfSeconds.getSeconds(), durationOfSeconds.getNano());
        aihfVarCreateBuilder.copyOnWrite();
        atpu atpuVar = (atpu) aihfVarCreateBuilder.instance;
        aiguVarD.getClass();
        atpuVar.c = aiguVarD;
        atpuVar.b |= 1;
        return (atpu) aihfVarCreateBuilder.build();
    }

    public static int f() {
        int i = new int[]{1, 2, 3, 4, 5}[0];
        int i2 = i - 1;
        if (i != 0) {
            return i2;
        }
        throw null;
    }

    public static int g() {
        int i = k()[2];
        int i2 = (-16777217) + i;
        if (i != 0) {
            return i2;
        }
        throw null;
    }

    public static int h() {
        int i = k()[2];
        int i2 = (-16777217) + i;
        if (i != 0) {
            return i2;
        }
        throw null;
    }

    public static int i() {
        int i = k()[1];
        int i2 = (-16777217) + i;
        if (i != 0) {
            return i2;
        }
        throw null;
    }

    public static int j() {
        int i = k()[0];
        int i2 = (-16777217) + i;
        if (i != 0) {
            return i2;
        }
        throw null;
    }

    public static int[] k() {
        return new int[]{16777217, 16777216, 1, 16711681, 16776961, 65281, 65536, SemanticState.Hidden, 16711936};
    }

    public static int l(int i) {
        switch (i) {
            case 0:
                return 9;
            case 1:
                return 10;
            case 2:
                return 12;
            case 3:
                return 17;
            case 4:
                return 18;
            case 5:
                return 20;
            case 6:
                return 33;
            case 7:
            default:
                return 34;
            case 8:
                return 36;
        }
    }

    public static int m(Attributes attributes, int i, String... strArr) {
        for (String str : strArr) {
            String value = attributes.getValue(str);
            if (value != null) {
                return typ.a(value, i);
            }
        }
        return i;
    }

    public static int n(float f) {
        return (int) (f * 1000.0f);
    }

    public static long o(Attributes attributes, long j, String... strArr) {
        String value = attributes.getValue(strArr[0]);
        if (value == null) {
            return j;
        }
        int i = typ.a;
        try {
            return Long.parseLong(value);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static String p(Attributes attributes, String... strArr) {
        for (String str : strArr) {
            String value = attributes.getValue(str);
            if (value != null) {
                return value;
            }
        }
        return null;
    }

    public static String q(Attributes attributes, String str, String... strArr) {
        String value = attributes.getValue(strArr[0]);
        return value != null ? value : str;
    }

    public static boolean r(Attributes attributes, String... strArr) {
        return m(attributes, 0, strArr) != 0;
    }

    public static avlh s(awku awkuVar) {
        awkuVar.getClass();
        return awkuVar.P();
    }

    public static avlh t(awku awkuVar) {
        awkuVar.getClass();
        return awkuVar.P();
    }

    public static avlh u(acip acipVar) {
        return acipVar instanceof acjt ? acipVar.z() : avlh.G(acipVar);
    }

    public static avlh v(avlh avlhVar, agek agekVar) {
        return avlhVar.p().W(new abld(4)).W(new vvb(agekVar, 6));
    }

    public static avlh w(avlh avlhVar, agek agekVar) {
        return avlhVar.p().W(new vvb(agekVar, 8));
    }

    public static void x(Throwable th) {
        zvp.b(zvn.b, zvm.k, "Failed unexpectedly while receiving an RX event.", th);
    }

    public static avll y(vxu vxuVar, long j) {
        aoqb aoqbVarCn = abmt.cn(vxuVar);
        if (((aoqbVarCn != null ? aoqbVarCn.b : 0L) & j) == 0) {
            return new vqh(8);
        }
        aoqb aoqbVarCn2 = abmt.cn(vxuVar);
        final int i = aoqbVarCn2 != null ? aoqbVarCn2.c : 0;
        return new avll() { // from class: abwq
            @Override // defpackage.avll
            public final axso a(avlh avlhVar) {
                int i2 = i;
                if (i2 != 1) {
                    return i2 == 2 ? avlhVar.V(awlg.a()) : avlhVar;
                }
                return avlhVar.V(avmh.a());
            }
        };
    }

    public static abml z(abmo abmoVar, abmq abmqVar, avlh avlhVar, avlh avlhVar2, abwj abwjVar) {
        if (!abwjVar.f) {
            abmoVar.g(avlhVar, avlhVar2);
            return abmoVar;
        }
        if (abmqVar.a.f) {
            abmqVar.c.g(avlhVar, avlhVar2);
            new avmm(avlhVar.ak(new abll(abmqVar, 17)), avlhVar2.ak(new abll(abmqVar, 18)));
        }
        return abmqVar;
    }

    public String a() {
        return acej.class.getName();
    }

    public aawb(char[] cArr, byte[] bArr, byte[] bArr2) {
    }

    private aawb() {
    }

    public aawb(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Duration duration = Duration.ZERO;
    }
}
