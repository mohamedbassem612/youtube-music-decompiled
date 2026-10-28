package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import app.rive.semantics.SemanticState;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$AndroidStackInfo;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$ClientError;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$ErrorMetaData;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$ErrorStackTrace;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$LogMessage;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$ServiceTrackingData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zvr implements zrx {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/net/error/HttpPingECatcherLogImpl");
    public final Executor b;
    public volatile Map c;
    public final awmd d;
    public volatile boolean e;
    public final boolean f;
    public final int g;
    public final akvx h;
    public final Context i;
    private final awmd j;
    private final aunn k;

    public zvr(Executor executor, awmd awmdVar, aunn aunnVar, tao taoVar, awmd awmdVar2, Context context) {
        int i;
        this.b = executor;
        this.k = aunnVar;
        this.j = awmdVar;
        amuc amucVar = taoVar.a().p;
        akvx akvxVar = (amucVar == null ? amuc.a : amucVar).c;
        this.f = (akvxVar == null ? akvx.a : akvxVar).c;
        this.d = awmdVar2;
        amuc amucVar2 = taoVar.a().p;
        akvx akvxVar2 = (amucVar2 == null ? amuc.a : amucVar2).c;
        if (((akvxVar2 == null ? akvx.a : akvxVar2).b & 2) != 0) {
            amuc amucVar3 = taoVar.a().p;
            akvx akvxVar3 = (amucVar3 == null ? amuc.a : amucVar3).c;
            i = (akvxVar3 == null ? akvx.a : akvxVar3).d;
        } else {
            i = 1;
        }
        this.g = i;
        amuc amucVar4 = taoVar.a().p;
        akvx akvxVar4 = (amucVar4 == null ? amuc.a : amucVar4).c;
        this.h = akvxVar4 == null ? akvx.a : akvxVar4;
        this.i = context;
    }

    @Override // defpackage.zrx
    public final int a() {
        return 72;
    }

    @Override // defpackage.zrx
    public final int b() {
        TimeUnit timeUnit = TimeUnit.HOURS;
        return 4320;
    }

    @Override // defpackage.zrx
    public final /* bridge */ /* synthetic */ List c() {
        return agke.t(10, 60, 3600, 43200);
    }

    @Override // defpackage.zrx
    public final boolean d() {
        return true;
    }

    public final tyt e(zvn zvnVar, zvm zvmVar, String str) {
        tyt tytVar = new tyt(Uri.parse("https://www.youtube.com/error_204"));
        tytVar.f("log.level", zvnVar.toString());
        tytVar.f("exception.category", zvmVar.toString());
        if (str != null) {
            tytVar.f("exception.type", str);
        }
        tytVar.f("t", "androiderror");
        ((abuz) this.k.io()).g(null, tytVar);
        return tytVar;
    }

    public final Map f(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("exception.message", str);
        }
        map.putAll(this.c);
        return map;
    }

    public final synchronized void g() {
        this.e = false;
        this.c = null;
    }

    public final synchronized void h() {
        this.e = true;
    }

    public final void i(zvn zvnVar, zvm zvmVar, String str, Throwable th, Map map, Function function) {
        j(zvnVar, zvmVar, str, th, agdf.a, map, function, false);
    }

    public final void j(final zvn zvnVar, final zvm zvmVar, final String str, final Throwable th, agev agevVar, final Map map, final Function function, final boolean z) {
        if (this.e) {
            this.b.execute(afwl.i(new Runnable() { // from class: zvq
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    ClientErrorOuterClass$ServiceTrackingData clientErrorOuterClass$ServiceTrackingData;
                    Function function2 = function;
                    zvr zvrVar = this.a;
                    if (Math.random() < ((Float) function2.apply(zvrVar.h)).floatValue()) {
                        Throwable thA = th;
                        String str2 = str;
                        zvm zvmVar2 = zvmVar;
                        zvn zvnVar2 = zvnVar;
                        if (!zvrVar.f || z) {
                            String stackTraceString = Log.getStackTraceString(thA);
                            Map mapF = zvrVar.f(str2);
                            tyt tytVarE = zvrVar.e(zvnVar2, zvmVar2, thA.getClass().getCanonicalName());
                            mapF.put("stacktrace.java", stackTraceString);
                            zvrVar.k(tytVarE, mapF);
                            return;
                        }
                        zvl zvlVar = (zvl) zvrVar.d.io();
                        aihf aihfVarCreateBuilder = ClientErrorOuterClass$LogMessage.a.createBuilder();
                        int iOrdinal = zvnVar2.ordinal();
                        ajtv ajtvVar = iOrdinal != 0 ? iOrdinal != 1 ? ajtv.ERROR_LEVEL_UNKNOWN : ajtv.ERROR_LEVEL_ERROR : ajtv.ERROR_LEVEL_WARNNING;
                        aihfVarCreateBuilder.copyOnWrite();
                        ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder.instance;
                        clientErrorOuterClass$LogMessage.d = ajtvVar.e;
                        clientErrorOuterClass$LogMessage.b |= 2;
                        if (str2 == null) {
                            str2 = "Unset LogMessage";
                        }
                        aihfVarCreateBuilder.copyOnWrite();
                        ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage2 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder.instance;
                        clientErrorOuterClass$LogMessage2.b |= 1;
                        clientErrorOuterClass$LogMessage2.c = str2;
                        if (thA != null) {
                            String canonicalName = thA.getClass().getCanonicalName();
                            aihfVarCreateBuilder.copyOnWrite();
                            ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage3 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder.instance;
                            canonicalName.getClass();
                            clientErrorOuterClass$LogMessage3.b |= 4;
                            clientErrorOuterClass$LogMessage3.e = canonicalName;
                        }
                        Map map2 = map;
                        int i = zvrVar.g;
                        aihfVarCreateBuilder.copyOnWrite();
                        ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage4 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder.instance;
                        int i2 = 16;
                        clientErrorOuterClass$LogMessage4.b |= 16;
                        clientErrorOuterClass$LogMessage4.f = i;
                        aihf aihfVarCreateBuilder2 = ClientErrorOuterClass$ErrorMetaData.a.createBuilder();
                        for (Map.Entry entry : map2.entrySet()) {
                            aihf aihfVarCreateBuilder3 = ajty.a.createBuilder();
                            String str3 = (String) entry.getKey();
                            aihfVarCreateBuilder3.copyOnWrite();
                            ajty ajtyVar = (ajty) aihfVarCreateBuilder3.instance;
                            str3.getClass();
                            ajtyVar.b |= 1;
                            ajtyVar.c = str3;
                            String str4 = (String) entry.getValue();
                            aihfVarCreateBuilder3.copyOnWrite();
                            ajty ajtyVar2 = (ajty) aihfVarCreateBuilder3.instance;
                            str4.getClass();
                            ajtyVar2.b |= 2;
                            ajtyVar2.d = str4;
                            aihfVarCreateBuilder2.aN((ajty) aihfVarCreateBuilder3.build());
                        }
                        int iA = txz.a(zvrVar.i);
                        aihfVarCreateBuilder2.copyOnWrite();
                        ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder2.instance;
                        clientErrorOuterClass$ErrorMetaData.b |= SemanticState.Obscured;
                        clientErrorOuterClass$ErrorMetaData.l = iA;
                        ajtx ajtxVar = (ajtx) ClientErrorOuterClass$ClientError.a.createBuilder();
                        ajtxVar.copyOnWrite();
                        ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError = (ClientErrorOuterClass$ClientError) ajtxVar.instance;
                        ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage5 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder.build();
                        clientErrorOuterClass$LogMessage5.getClass();
                        clientErrorOuterClass$ClientError.e = clientErrorOuterClass$LogMessage5;
                        clientErrorOuterClass$ClientError.b |= 4;
                        switch (zvmVar2.ordinal()) {
                            case 0:
                                i2 = 2;
                                break;
                            case 1:
                                i2 = 3;
                                break;
                            case 2:
                                i2 = 4;
                                break;
                            case 3:
                                i2 = 6;
                                break;
                            case 4:
                                i2 = 9;
                                break;
                            case 5:
                                break;
                            case 6:
                                i2 = 68;
                                break;
                            case 7:
                                i2 = 28;
                                break;
                            case 8:
                                i2 = 19;
                                break;
                            case 9:
                                i2 = 27;
                                break;
                            case 10:
                                i2 = 21;
                                break;
                            case 11:
                                i2 = 20;
                                break;
                            case 12:
                                i2 = 13;
                                break;
                            case 13:
                                i2 = 17;
                                break;
                            case 14:
                                i2 = 10;
                                break;
                            case 15:
                                i2 = 22;
                                break;
                            case 16:
                                i2 = 7;
                                break;
                            case 17:
                                i2 = 26;
                                break;
                            case 18:
                                i2 = 8;
                                break;
                            case 19:
                                i2 = 25;
                                break;
                            case 20:
                                i2 = 11;
                                break;
                            case 21:
                                i2 = 15;
                                break;
                            case 22:
                                i2 = 18;
                                break;
                            case 23:
                                i2 = 5;
                                break;
                            case 24:
                                i2 = 23;
                                break;
                            case 25:
                                i2 = 14;
                                break;
                            case 26:
                                i2 = 12;
                                break;
                            case 27:
                                i2 = 29;
                                break;
                            case 28:
                            case 30:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 42:
                            case 43:
                            case 44:
                            default:
                                i2 = 1;
                                break;
                            case 29:
                                i2 = 31;
                                break;
                            case 31:
                                i2 = 33;
                                break;
                            case 32:
                                i2 = 34;
                                break;
                            case 38:
                                i2 = 40;
                                break;
                            case 39:
                                i2 = 41;
                                break;
                            case 40:
                                i2 = 76;
                                break;
                            case 41:
                                i2 = 52;
                                break;
                            case 45:
                                i2 = 45;
                                break;
                            case 46:
                                i2 = 46;
                                break;
                            case 47:
                                i2 = 47;
                                break;
                            case 48:
                                i2 = 48;
                                break;
                            case 49:
                                i2 = 49;
                                break;
                            case 50:
                                i2 = 50;
                                break;
                            case 51:
                                i2 = 51;
                                break;
                            case 52:
                                i2 = 53;
                                break;
                            case 53:
                                i2 = 54;
                                break;
                            case 54:
                                i2 = 55;
                                break;
                            case 55:
                                i2 = 56;
                                break;
                            case 56:
                                i2 = 57;
                                break;
                            case 57:
                                i2 = 58;
                                break;
                            case 58:
                                i2 = 59;
                                break;
                            case 59:
                                i2 = 62;
                                break;
                            case 60:
                                i2 = 61;
                                break;
                            case 61:
                                i2 = 60;
                                break;
                            case 62:
                                i2 = 63;
                                break;
                            case 63:
                                i2 = 64;
                                break;
                            case 64:
                                i2 = 65;
                                break;
                            case 65:
                                i2 = 66;
                                break;
                            case 66:
                                i2 = 67;
                                break;
                            case 67:
                                i2 = 69;
                                break;
                            case 68:
                                i2 = 70;
                                break;
                            case 69:
                                i2 = 71;
                                break;
                            case 70:
                                i2 = 72;
                                break;
                            case 71:
                                i2 = 73;
                                break;
                            case 72:
                                i2 = 74;
                                break;
                            case 73:
                                i2 = 75;
                                break;
                        }
                        aihfVarCreateBuilder2.copyOnWrite();
                        ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData2 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder2.instance;
                        clientErrorOuterClass$ErrorMetaData2.c = i2 - 1;
                        clientErrorOuterClass$ErrorMetaData2.b |= 1;
                        Map map3 = zvrVar.c;
                        aihf aihfVarCreateBuilder4 = ClientErrorOuterClass$ServiceTrackingData.a.createBuilder();
                        if (map3 == null) {
                            clientErrorOuterClass$ServiceTrackingData = (ClientErrorOuterClass$ServiceTrackingData) aihfVarCreateBuilder4.build();
                        } else {
                            if (map3.containsKey("innertube.run.job")) {
                                String str5 = (String) map3.get("innertube.run.job");
                                aihfVarCreateBuilder4.copyOnWrite();
                                ClientErrorOuterClass$ServiceTrackingData clientErrorOuterClass$ServiceTrackingData2 = (ClientErrorOuterClass$ServiceTrackingData) aihfVarCreateBuilder4.instance;
                                str5.getClass();
                                clientErrorOuterClass$ServiceTrackingData2.b |= 32;
                                clientErrorOuterClass$ServiceTrackingData2.g = str5;
                            }
                            if (map3.containsKey("innertube.build.label")) {
                                String str6 = (String) map3.get("innertube.build.label");
                                aihfVarCreateBuilder4.copyOnWrite();
                                ClientErrorOuterClass$ServiceTrackingData clientErrorOuterClass$ServiceTrackingData3 = (ClientErrorOuterClass$ServiceTrackingData) aihfVarCreateBuilder4.instance;
                                str6.getClass();
                                clientErrorOuterClass$ServiceTrackingData3.b |= 4;
                                clientErrorOuterClass$ServiceTrackingData3.e = str6;
                            }
                            if (map3.containsKey("innertube.build.timestamp")) {
                                long j = Long.parseLong((String) map3.get("innertube.build.timestamp"), 10);
                                aihfVarCreateBuilder4.copyOnWrite();
                                ClientErrorOuterClass$ServiceTrackingData clientErrorOuterClass$ServiceTrackingData4 = (ClientErrorOuterClass$ServiceTrackingData) aihfVarCreateBuilder4.instance;
                                clientErrorOuterClass$ServiceTrackingData4.b |= 8;
                                clientErrorOuterClass$ServiceTrackingData4.f = j;
                            }
                            if (map3.containsKey("innertube.build.changelist")) {
                                long j2 = Long.parseLong((String) map3.get("innertube.build.changelist"), 10);
                                aihfVarCreateBuilder4.copyOnWrite();
                                ClientErrorOuterClass$ServiceTrackingData clientErrorOuterClass$ServiceTrackingData5 = (ClientErrorOuterClass$ServiceTrackingData) aihfVarCreateBuilder4.instance;
                                clientErrorOuterClass$ServiceTrackingData5.b |= 1;
                                clientErrorOuterClass$ServiceTrackingData5.c = j2;
                            }
                            if (map3.containsKey("innertube.build.experiments.source_version")) {
                                long j3 = Long.parseLong((String) map3.get("innertube.build.experiments.source_version"), 10);
                                aihfVarCreateBuilder4.copyOnWrite();
                                ClientErrorOuterClass$ServiceTrackingData clientErrorOuterClass$ServiceTrackingData6 = (ClientErrorOuterClass$ServiceTrackingData) aihfVarCreateBuilder4.instance;
                                clientErrorOuterClass$ServiceTrackingData6.b |= 2;
                                clientErrorOuterClass$ServiceTrackingData6.d = j3;
                            }
                            clientErrorOuterClass$ServiceTrackingData = (ClientErrorOuterClass$ServiceTrackingData) aihfVarCreateBuilder4.build();
                        }
                        aihfVarCreateBuilder2.copyOnWrite();
                        ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData3 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder2.instance;
                        clientErrorOuterClass$ServiceTrackingData.getClass();
                        clientErrorOuterClass$ErrorMetaData3.d = clientErrorOuterClass$ServiceTrackingData;
                        clientErrorOuterClass$ErrorMetaData3.b |= 2;
                        ajtxVar.copyOnWrite();
                        ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError2 = (ClientErrorOuterClass$ClientError) ajtxVar.instance;
                        ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData4 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder2.build();
                        clientErrorOuterClass$ErrorMetaData4.getClass();
                        clientErrorOuterClass$ClientError2.c = clientErrorOuterClass$ErrorMetaData4;
                        clientErrorOuterClass$ClientError2.b |= 1;
                        if (thA != null) {
                            if (zvt.b(thA)) {
                                thA = zvt.a(thA);
                            }
                            ahag ahagVar = (ahag) aext.b(thA, true).build();
                            if ((ahagVar.b & 1) != 0) {
                                aihf aihfVarCreateBuilder5 = ClientErrorOuterClass$ErrorStackTrace.a.createBuilder();
                                aihf aihfVarCreateBuilder6 = ClientErrorOuterClass$AndroidStackInfo.a.createBuilder();
                                aigj byteString = ahagVar.toByteString();
                                aihfVarCreateBuilder6.copyOnWrite();
                                ClientErrorOuterClass$AndroidStackInfo clientErrorOuterClass$AndroidStackInfo = (ClientErrorOuterClass$AndroidStackInfo) aihfVarCreateBuilder6.instance;
                                clientErrorOuterClass$AndroidStackInfo.b |= 1;
                                clientErrorOuterClass$AndroidStackInfo.c = byteString;
                                ClientErrorOuterClass$AndroidStackInfo clientErrorOuterClass$AndroidStackInfo2 = (ClientErrorOuterClass$AndroidStackInfo) aihfVarCreateBuilder6.build();
                                aihfVarCreateBuilder5.copyOnWrite();
                                ClientErrorOuterClass$ErrorStackTrace clientErrorOuterClass$ErrorStackTrace = (ClientErrorOuterClass$ErrorStackTrace) aihfVarCreateBuilder5.instance;
                                clientErrorOuterClass$AndroidStackInfo2.getClass();
                                clientErrorOuterClass$ErrorStackTrace.c = clientErrorOuterClass$AndroidStackInfo2;
                                clientErrorOuterClass$ErrorStackTrace.b = 2;
                                ajtxVar.copyOnWrite();
                                ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError3 = (ClientErrorOuterClass$ClientError) ajtxVar.instance;
                                ClientErrorOuterClass$ErrorStackTrace clientErrorOuterClass$ErrorStackTrace2 = (ClientErrorOuterClass$ErrorStackTrace) aihfVarCreateBuilder5.build();
                                clientErrorOuterClass$ErrorStackTrace2.getClass();
                                clientErrorOuterClass$ClientError3.d = clientErrorOuterClass$ErrorStackTrace2;
                                clientErrorOuterClass$ClientError3.b |= 2;
                            }
                        }
                        zvlVar.b((ClientErrorOuterClass$ClientError) ajtxVar.build());
                    }
                }
            }));
        } else {
            ((agrc) ((agrc) ((agrc) a.c()).j(th)).k("com/google/android/libraries/youtube/net/error/HttpPingECatcherLogImpl", "log", 191, "HttpPingECatcherLogImpl.java")).E("ECatcher disabled: level: %s, category: %s, message: %s", zvnVar, zvmVar, str);
        }
    }

    public final void k(tyt tytVar, Map map) {
        awmd awmdVar = this.j;
        zxi zxiVar = new zxi(2, "ecatcher");
        zxiVar.d = true;
        zxiVar.f = map;
        zxiVar.b(tytVar.a());
        zxiVar.a(tok.HTTP_PING_E_CATCHER_LOG);
        if (this.e) {
            ((zxj) awmdVar.io()).b(this, zxiVar, new xkj(2));
        }
    }
}
