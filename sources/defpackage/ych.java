package defpackage;

import android.hardware.display.DisplayManager;
import android.net.ConnectivityManager;
import android.os.PowerManager;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.android.gms.cast.CastDevice;
import j$.util.Optional;
import java.util.Locale;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ych {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/remote/internal/MdxSessionEventLogger");
    public final xeu b;
    private final PowerManager c;
    private final DisplayManager d;
    private final ConnectivityManager e;
    private final xmj f;
    private final tfq g;
    private final wmy h;

    public ych(xeu xeuVar, tfq tfqVar, ConnectivityManager connectivityManager, PowerManager powerManager, DisplayManager displayManager, wmy wmyVar, xmj xmjVar) {
        xeuVar.getClass();
        this.b = xeuVar;
        this.g = tfqVar;
        this.e = connectivityManager;
        this.c = powerManager;
        this.d = displayManager;
        this.h = wmyVar;
        this.f = xmjVar;
    }

    public static amxg c(xvr xvrVar) {
        boolean z = xvrVar instanceof xvn;
        if (!z && !(xvrVar instanceof xvj)) {
            return null;
        }
        aihf aihfVarCreateBuilder = amxg.a.createBuilder();
        if (z) {
            xvn xvnVar = (xvn) xvrVar;
            String str = xvnVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            amxg amxgVar = (amxg) aihfVarCreateBuilder.instance;
            str.getClass();
            amxgVar.b |= 1;
            amxgVar.c = str;
            String str2 = xvnVar.e;
            if (str2 != null && !str2.isEmpty()) {
                aihfVarCreateBuilder.copyOnWrite();
                amxg amxgVar2 = (amxg) aihfVarCreateBuilder.instance;
                amxgVar2.b |= 4;
                amxgVar2.e = str2;
            }
            String str3 = xvnVar.f;
            if (str3 != null && !str3.isEmpty()) {
                aihfVarCreateBuilder.copyOnWrite();
                amxg amxgVar3 = (amxg) aihfVarCreateBuilder.instance;
                amxgVar3.b |= 2;
                amxgVar3.d = str3;
            }
            aihfVarCreateBuilder.copyOnWrite();
            amxg amxgVar4 = (amxg) aihfVarCreateBuilder.instance;
            amxgVar4.g = 1;
            amxgVar4.b |= SemanticState.Hidden;
        } else {
            CastDevice castDevice = ((xvj) xvrVar).a;
            String str4 = castDevice.d;
            if (!str4.isEmpty()) {
                aihfVarCreateBuilder.copyOnWrite();
                amxg amxgVar5 = (amxg) aihfVarCreateBuilder.instance;
                amxgVar5.b |= 1;
                amxgVar5.c = str4;
            }
            aihfVarCreateBuilder.copyOnWrite();
            amxg amxgVar6 = (amxg) aihfVarCreateBuilder.instance;
            amxgVar6.b |= 4;
            amxgVar6.e = "UnknownCastManufacturer";
            String str5 = castDevice.e;
            aihfVarCreateBuilder.copyOnWrite();
            amxg amxgVar7 = (amxg) aihfVarCreateBuilder.instance;
            amxgVar7.b |= 2;
            amxgVar7.d = str5;
            boolean zF = castDevice.f();
            aihfVarCreateBuilder.copyOnWrite();
            amxg amxgVar8 = (amxg) aihfVarCreateBuilder.instance;
            amxgVar8.b |= 16;
            amxgVar8.f = zF;
            if (castDevice.s.a(524288)) {
                aihfVarCreateBuilder.copyOnWrite();
                amxg amxgVar9 = (amxg) aihfVarCreateBuilder.instance;
                amxgVar9.g = 3;
                amxgVar9.b |= SemanticState.Hidden;
            } else if (castDevice.f()) {
                aihfVarCreateBuilder.copyOnWrite();
                amxg amxgVar10 = (amxg) aihfVarCreateBuilder.instance;
                amxgVar10.g = 2;
                amxgVar10.b |= SemanticState.Hidden;
            } else {
                aihfVarCreateBuilder.copyOnWrite();
                amxg amxgVar11 = (amxg) aihfVarCreateBuilder.instance;
                amxgVar11.g = 1;
                amxgVar11.b |= SemanticState.Hidden;
            }
        }
        return (amxg) aihfVarCreateBuilder.build();
    }

    public static void d(yco ycoVar, Consumer consumer) {
        if (ycoVar instanceof yay) {
            yay yayVar = (yay) ycoVar;
            aihf aihfVarCreateBuilder = amwt.a.createBuilder();
            xvn xvnVar = yayVar.k;
            xwc xwcVar = yayVar.z.j;
            xva xvaVarK = xvnVar.k();
            String str = xvaVarK.h;
            xvz xvzVar = xvaVarK.d;
            xvg xvgVar = xvaVarK.e;
            boolean z = ((xvzVar == null || TextUtils.isEmpty(xvzVar.b)) && (xvgVar == null || TextUtils.isEmpty(xvgVar.b))) ? false : true;
            int i = xvaVarK.a;
            int i2 = 3;
            if (i != -1) {
                if (i == 0) {
                    i2 = 7;
                } else if (i == 1) {
                    i2 = 5;
                } else if (i != 2) {
                    i2 = i != 3 ? 2 : 6;
                } else {
                    i2 = 4;
                }
            }
            aihfVarCreateBuilder.copyOnWrite();
            amwt amwtVar = (amwt) aihfVarCreateBuilder.instance;
            amwtVar.c = i2 - 1;
            amwtVar.b |= 1;
            boolean z2 = xvnVar.k == 1;
            aihfVarCreateBuilder.copyOnWrite();
            amwt amwtVar2 = (amwt) aihfVarCreateBuilder.instance;
            amwtVar2.b |= 4;
            amwtVar2.e = z2;
            boolean zS = xvnVar.s();
            aihfVarCreateBuilder.copyOnWrite();
            amwt amwtVar3 = (amwt) aihfVarCreateBuilder.instance;
            amwtVar3.b |= 2;
            amwtVar3.d = zS;
            int i3 = xvnVar.m;
            aihfVarCreateBuilder.copyOnWrite();
            amwt amwtVar4 = (amwt) aihfVarCreateBuilder.instance;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            amwtVar4.g = i4;
            amwtVar4.b |= 16;
            int i5 = yayVar.p;
            aihfVarCreateBuilder.copyOnWrite();
            amwt amwtVar5 = (amwt) aihfVarCreateBuilder.instance;
            amwtVar5.b |= 32;
            amwtVar5.h = i5;
            aihfVarCreateBuilder.copyOnWrite();
            amwt amwtVar6 = (amwt) aihfVarCreateBuilder.instance;
            amwtVar6.b |= SemanticState.Focused;
            amwtVar6.j = z;
            if (str != null) {
                aihfVarCreateBuilder.copyOnWrite();
                amwt amwtVar7 = (amwt) aihfVarCreateBuilder.instance;
                amwtVar7.b |= 64;
                amwtVar7.i = str;
            }
            if (xwcVar != null) {
                aihfVarCreateBuilder.copyOnWrite();
                amwt amwtVar8 = (amwt) aihfVarCreateBuilder.instance;
                amwtVar8.b |= 8;
                amwtVar8.f = xwcVar.b;
            }
            agrx agrxVar = agso.a;
            amwt amwtVar9 = (amwt) aihfVarCreateBuilder.build();
            int i6 = amwtVar9.c;
            boolean z3 = amwtVar9.e;
            boolean z4 = amwtVar9.d;
            consumer.r(aihfVarCreateBuilder);
        }
    }

    public static int f(int i) {
        if (i != 0) {
            return i != 1 ? 4 : 3;
        }
        return 2;
    }

    public final amwu a() {
        aihf aihfVarCreateBuilder = amwu.a.createBuilder();
        boolean z = this.h.a;
        aihfVarCreateBuilder.copyOnWrite();
        amwu amwuVar = (amwu) aihfVarCreateBuilder.instance;
        amwuVar.b |= 1;
        amwuVar.c = z;
        return (amwu) aihfVarCreateBuilder.build();
    }

    public final amwy b() {
        int i;
        aihf aihfVarCreateBuilder = amwy.a.createBuilder();
        tfq tfqVar = this.g;
        boolean zI = tfqVar.i();
        int i2 = zI ? 2 : 3;
        aihfVarCreateBuilder.copyOnWrite();
        amwy amwyVar = (amwy) aihfVarCreateBuilder.instance;
        amwyVar.c = i2 - 1;
        amwyVar.b |= 1;
        if (zI) {
            if (tfqVar.j(1)) {
                i = 3;
            } else if (tfqVar.j(9)) {
                i = 4;
            } else {
                i = tfqVar.j(0) ? 2 : 1;
            }
            aihfVarCreateBuilder.copyOnWrite();
            amwy amwyVar2 = (amwy) aihfVarCreateBuilder.instance;
            amwyVar2.d = i - 1;
            amwyVar2.b |= 2;
        }
        int i3 = true != this.c.isDeviceIdleMode() ? 3 : 2;
        aihfVarCreateBuilder.copyOnWrite();
        amwy amwyVar3 = (amwy) aihfVarCreateBuilder.instance;
        amwyVar3.f = i3 - 1;
        amwyVar3.b |= 8;
        int i4 = this.d.getDisplay(0).getState() == 2 ? 2 : 3;
        aihfVarCreateBuilder.copyOnWrite();
        amwy amwyVar4 = (amwy) aihfVarCreateBuilder.instance;
        amwyVar4.e = i4 - 1;
        amwyVar4.b |= 4;
        int i5 = this.e.getRestrictBackgroundStatus() == 1 ? 2 : 3;
        aihfVarCreateBuilder.copyOnWrite();
        amwy amwyVar5 = (amwy) aihfVarCreateBuilder.instance;
        amwyVar5.g = i5 - 1;
        amwyVar5.b |= 16;
        String string = Integer.toString(kml.a(this.f.b));
        aihfVarCreateBuilder.copyOnWrite();
        amwy amwyVar6 = (amwy) aihfVarCreateBuilder.instance;
        string.getClass();
        amwyVar6.b |= 32;
        amwyVar6.h = string;
        return (amwy) aihfVarCreateBuilder.build();
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, yco] */
    public final void e(yco ycoVar, int i, long j, long j2) {
        int i2 = ycoVar.n().k;
        amyu amyuVarR = ycoVar.r();
        Optional optionalU = ycoVar.u();
        boolean zAv = ycoVar.av();
        String str = ycoVar.n().a;
        int i3 = ycoVar.n().e;
        int i4 = i2 - 1;
        amyv amyvVarS = ycoVar.s();
        boolean zAn = ycoVar.an();
        Locale locale = Locale.US;
        Integer numValueOf = Integer.valueOf(i4);
        int i5 = amyuVarR.aa;
        String str2 = String.format(locale, "mdx session disconnected: sessionType=%d disconnectReason=%d prevState=%d msSinceStarted=%d msSinceConnected=%d errorCode=%s reconnect=%s sessionNonce=%s sessionIndex=%d sessionSource=%s isDisconnectedBySelectingDefaultRoute=%s", numValueOf, Integer.valueOf(i5), Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), optionalU, Boolean.valueOf(zAv), str, Integer.valueOf(i3), amyvVarS.name(), Boolean.valueOf(zAn));
        if (ycoVar.aT()) {
            ((agrc) ((agrc) a.c().i(agso.a, "MDX.EventLogger")).k("com/google/android/libraries/youtube/mdx/remote/internal/MdxSessionEventLogger", "logMdxSessionDisconnected", 325, "MdxSessionEventLogger.java")).w("%s", str2);
        } else {
            agrx agrxVar = agso.a;
        }
        aihf aihfVarCreateBuilder = amxn.a.createBuilder();
        boolean zAr = ycoVar.ar();
        aihfVarCreateBuilder.copyOnWrite();
        amxn amxnVar = (amxn) aihfVarCreateBuilder.instance;
        amxnVar.b |= SemanticState.Focused;
        amxnVar.h = zAr;
        aihfVarCreateBuilder.copyOnWrite();
        amxn amxnVar2 = (amxn) aihfVarCreateBuilder.instance;
        amxnVar2.c = i4;
        amxnVar2.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        amxn amxnVar3 = (amxn) aihfVarCreateBuilder.instance;
        amxnVar3.i = i5;
        amxnVar3.b |= SemanticState.Hidden;
        aihfVarCreateBuilder.copyOnWrite();
        amxn amxnVar4 = (amxn) aihfVarCreateBuilder.instance;
        amxnVar4.b |= SemanticState.Multiline;
        amxnVar4.n = str;
        aihfVarCreateBuilder.copyOnWrite();
        amxn amxnVar5 = (amxn) aihfVarCreateBuilder.instance;
        amxnVar5.b |= 16384;
        amxnVar5.o = i3;
        aihfVarCreateBuilder.copyOnWrite();
        amxn amxnVar6 = (amxn) aihfVarCreateBuilder.instance;
        amxnVar6.k = amyvVarS.E;
        amxnVar6.b |= SemanticState.ReadOnly;
        aihfVarCreateBuilder.copyOnWrite();
        amxn amxnVar7 = (amxn) aihfVarCreateBuilder.instance;
        amxnVar7.b |= 131072;
        amxnVar7.r = zAn;
        sda sdaVar = new sda(ycoVar, aihfVarCreateBuilder, 20);
        if (true == optionalU.isPresent()) {
            Object obj = optionalU.get();
            ?? r5 = sdaVar.a;
            Object obj2 = sdaVar.b;
            Integer num = (Integer) obj;
            if (r5.aT()) {
                ((agrc) ((agrc) a.c().i(agso.a, "MDX.EventLogger")).k("com/google/android/libraries/youtube/mdx/remote/internal/MdxSessionEventLogger", "logMdxSessionDisconnected", 341, "MdxSessionEventLogger.java")).w("status error code set: %d", num);
            }
            int iIntValue = num.intValue();
            aihf aihfVar = (aihf) obj2;
            aihfVar.copyOnWrite();
            amxn amxnVar8 = (amxn) aihfVar.instance;
            amxnVar8.b |= SemanticState.LiveRegion;
            amxnVar8.j = iIntValue;
        }
        int iF = f(i);
        aihfVarCreateBuilder.copyOnWrite();
        amxn amxnVar9 = (amxn) aihfVarCreateBuilder.instance;
        amxnVar9.d = iF - 1;
        amxnVar9.b |= 4;
        aihfVarCreateBuilder.copyOnWrite();
        amxn amxnVar10 = (amxn) aihfVarCreateBuilder.instance;
        amxnVar10.b |= 8;
        amxnVar10.e = j;
        aihfVarCreateBuilder.copyOnWrite();
        amxn amxnVar11 = (amxn) aihfVarCreateBuilder.instance;
        amxnVar11.b |= SemanticState.Modal;
        amxnVar11.l = j2;
        aihfVarCreateBuilder.copyOnWrite();
        amxn amxnVar12 = (amxn) aihfVarCreateBuilder.instance;
        amxnVar12.b |= 32;
        amxnVar12.f = zAv;
        d(ycoVar, new vnm(aihfVarCreateBuilder, 14));
        amxg amxgVarC = c(ycoVar.j());
        if (amxgVarC != null) {
            aihfVarCreateBuilder.copyOnWrite();
            amxn amxnVar13 = (amxn) aihfVarCreateBuilder.instance;
            amxnVar13.m = amxgVarC;
            amxnVar13.b |= SemanticState.Obscured;
        }
        amwy amwyVarB = b();
        aihfVarCreateBuilder.copyOnWrite();
        amxn amxnVar14 = (amxn) aihfVarCreateBuilder.instance;
        amwyVarB.getClass();
        amxnVar14.p = amwyVarB;
        amxnVar14.b |= 32768;
        amwu amwuVarA = a();
        aihfVarCreateBuilder.copyOnWrite();
        amxn amxnVar15 = (amxn) aihfVarCreateBuilder.instance;
        amwuVarA.getClass();
        amxnVar15.q = amwuVarA;
        amxnVar15.b |= 65536;
        xeu xeuVar = this.b;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.MDX_SESSION_DISCONNECTED);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        amxn amxnVar16 = (amxn) aihfVarCreateBuilder.build();
        amxnVar16.getClass();
        alouVar.d = amxnVar16;
        alouVar.c = 27;
        xeuVar.b((alou) alosVar.build());
    }
}
