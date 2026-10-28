package defpackage;

import app.rive.semantics.SemanticState;
import com.google.android.libraries.blocks.StatusException;
import com.google.android.libraries.blocks.StatusExceptionFactory;
import com.google.android.libraries.youtube.blocks.BlocksLogger;
import com.google.net.util.proto2api.Status$StatusProto;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$AndroidStackInfo;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$ClientError;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$ErrorMetaData;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$ErrorStackTrace;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$LogMessage;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$MultiLanguageStackInfo;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wah extends BlocksLogger {
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/innertube/datapush/blocks/DataPushBlocksLogger");
    public final agfr a;
    private final zwy c;
    private final zvl d;
    private final szb e;
    private final ConcurrentMap f = new ConcurrentHashMap();
    private final xil g;
    private final vxz h;

    public wah(zwy zwyVar, zvl zvlVar, szb szbVar, vxz vxzVar, xil xilVar) {
        this.c = zwyVar;
        this.d = zvlVar;
        this.e = szbVar;
        this.h = vxzVar;
        this.g = xilVar;
        zwyVar.getClass();
        this.a = aguu.al(new tpc(zwyVar, 15));
    }

    private static final int b(int i) {
        switch (i - 1) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            default:
                return 1;
        }
    }

    public final void a(String str, Runnable runnable) {
        startLatencyActionSpan(str);
        runnable.run();
        if (endLatencyActionSpan(str)) {
            logLatencyActionSpan(str);
        }
    }

    @Override // com.google.android.libraries.youtube.blocks.BlocksLogger
    public final boolean allowClientPerformanceSample() {
        return this.e.b((float) this.h.a(0, 45374891L, 0.0d), szc.h);
    }

    @Override // com.google.android.libraries.youtube.blocks.BlocksLogger
    public final boolean endLatencyActionSpan(String str) {
        if (!allowClientPerformanceSample()) {
            return false;
        }
        if (str.isEmpty()) {
            ((agrc) ((agrc) b.b()).k("com/google/android/libraries/youtube/innertube/datapush/blocks/DataPushBlocksLogger", "endLatencyActionSpan", 193, "DataPushBlocksLogger.java")).t("DataPushBlocksLogger: spanName is empty");
            return false;
        }
        agev agevVarA = this.g.a(str);
        if (!agevVarA.g()) {
            return false;
        }
        this.f.put(str, agevVarA.c());
        return true;
    }

    @Override // com.google.android.libraries.youtube.blocks.BlocksLogger
    public final void logBindingError(byte[] bArr) throws Throwable {
        Throwable e;
        asbn asbnVar;
        try {
            try {
                asbnVar = (asbn) aihn.parseFrom(asbn.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
                try {
                    if (!this.h.l(8, 45412925L, false)) {
                        Status$StatusProto defaultInstance = asbnVar.b;
                        if (defaultInstance == null) {
                            defaultInstance = Status$StatusProto.getDefaultInstance();
                        }
                        throw StatusExceptionFactory.a(defaultInstance);
                    }
                    zvl zvlVar = this.d;
                    aihf aihfVarCreateBuilder = ClientErrorOuterClass$LogMessage.a.createBuilder();
                    ajtv ajtvVar = ajtv.ERROR_LEVEL_ERROR;
                    aihfVarCreateBuilder.copyOnWrite();
                    ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder.instance;
                    clientErrorOuterClass$LogMessage.d = ajtvVar.e;
                    clientErrorOuterClass$LogMessage.b |= 2;
                    Status$StatusProto defaultInstance2 = asbnVar.b;
                    if (defaultInstance2 == null) {
                        defaultInstance2 = Status$StatusProto.getDefaultInstance();
                    }
                    String str = defaultInstance2.e;
                    aihfVarCreateBuilder.copyOnWrite();
                    ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage2 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder.instance;
                    str.getClass();
                    clientErrorOuterClass$LogMessage2.b |= 1;
                    clientErrorOuterClass$LogMessage2.c = str;
                    String canonicalName = StatusException.class.getCanonicalName();
                    aihfVarCreateBuilder.copyOnWrite();
                    ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage3 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder.instance;
                    canonicalName.getClass();
                    clientErrorOuterClass$LogMessage3.b |= 4;
                    clientErrorOuterClass$LogMessage3.e = canonicalName;
                    aihf aihfVarCreateBuilder2 = ClientErrorOuterClass$ErrorMetaData.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder2.instance;
                    clientErrorOuterClass$ErrorMetaData.c = 37;
                    clientErrorOuterClass$ErrorMetaData.b |= 1;
                    ajtx ajtxVar = (ajtx) ClientErrorOuterClass$ClientError.a.createBuilder();
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(asby.d);
                    asbnVar.c(aihlVarCheckIsLite);
                    Object objK = asbnVar.j.k(aihlVarCheckIsLite.d);
                    asby asbyVar = (asby) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                    aihl aihlVar = asbv.b;
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                    asbyVar.c(aihlVarCheckIsLite2);
                    if (asbyVar.j.n(aihlVarCheckIsLite2.d)) {
                        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
                        asbyVar.c(aihlVarCheckIsLite3);
                        Object objK2 = asbyVar.j.k(aihlVarCheckIsLite3.d);
                        asbv asbvVar = (asbv) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2));
                        aihf aihfVarCreateBuilder3 = ajlr.a.createBuilder();
                        int i = asbvVar.c;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ajlr ajlrVar = (ajlr) aihfVarCreateBuilder3.instance;
                        ajlrVar.b |= 1;
                        ajlrVar.c = i;
                        int i2 = asbvVar.g;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ajlr ajlrVar2 = (ajlr) aihfVarCreateBuilder3.instance;
                        ajlrVar2.b |= 2;
                        ajlrVar2.d = i2;
                        int iBi = a.bi(asbvVar.d);
                        if (iBi == 0) {
                            iBi = 1;
                        }
                        int iB = b(iBi);
                        aihfVarCreateBuilder3.copyOnWrite();
                        ajlr ajlrVar3 = (ajlr) aihfVarCreateBuilder3.instance;
                        ajlrVar3.e = iB - 1;
                        ajlrVar3.b |= 4;
                        int i3 = asbyVar.f;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ajlr ajlrVar4 = (ajlr) aihfVarCreateBuilder3.instance;
                        ajlrVar4.b |= 64;
                        ajlrVar4.i = i3;
                        int i4 = asbvVar.h;
                        aihfVarCreateBuilder3.copyOnWrite();
                        ajlr ajlrVar5 = (ajlr) aihfVarCreateBuilder3.instance;
                        ajlrVar5.b |= 32;
                        ajlrVar5.h = i4;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData2 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder2.instance;
                        ajlr ajlrVar6 = (ajlr) aihfVarCreateBuilder3.build();
                        ajlrVar6.getClass();
                        clientErrorOuterClass$ErrorMetaData2.i = ajlrVar6;
                        clientErrorOuterClass$ErrorMetaData2.b |= SemanticState.Focused;
                    }
                    Status$StatusProto defaultInstance3 = asbnVar.b;
                    if (defaultInstance3 == null) {
                        defaultInstance3 = Status$StatusProto.getDefaultInstance();
                    }
                    aiov aiovVar = defaultInstance3.g;
                    if (aiovVar == null) {
                        aiovVar = aiov.a;
                    }
                    aihl aihlVar2 = asjd.b;
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar2);
                    aiovVar.c(aihlVarCheckIsLite4);
                    if (aiovVar.j.n(aihlVarCheckIsLite4.d)) {
                        Status$StatusProto defaultInstance4 = asbnVar.b;
                        if (defaultInstance4 == null) {
                            defaultInstance4 = Status$StatusProto.getDefaultInstance();
                        }
                        aiov aiovVar2 = defaultInstance4.g;
                        if (aiovVar2 == null) {
                            aiovVar2 = aiov.a;
                        }
                        aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aihlVar2);
                        aiovVar2.c(aihlVarCheckIsLite5);
                        Object objK3 = aiovVar2.j.k(aihlVarCheckIsLite5.d);
                        ClientErrorOuterClass$MultiLanguageStackInfo clientErrorOuterClass$MultiLanguageStackInfo = (ClientErrorOuterClass$MultiLanguageStackInfo) aihn.parseFrom(ClientErrorOuterClass$MultiLanguageStackInfo.a, ((asjd) (objK3 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK3))).toByteArray(), ExtensionRegistryLite.getGeneratedRegistry());
                        aihf aihfVarCreateBuilder4 = ClientErrorOuterClass$ErrorStackTrace.a.createBuilder();
                        aihfVarCreateBuilder4.copyOnWrite();
                        ClientErrorOuterClass$ErrorStackTrace clientErrorOuterClass$ErrorStackTrace = (ClientErrorOuterClass$ErrorStackTrace) aihfVarCreateBuilder4.instance;
                        clientErrorOuterClass$MultiLanguageStackInfo.getClass();
                        clientErrorOuterClass$ErrorStackTrace.c = clientErrorOuterClass$MultiLanguageStackInfo;
                        clientErrorOuterClass$ErrorStackTrace.b = 5;
                        ajtxVar.copyOnWrite();
                        ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError = (ClientErrorOuterClass$ClientError) ajtxVar.instance;
                        ClientErrorOuterClass$ErrorStackTrace clientErrorOuterClass$ErrorStackTrace2 = (ClientErrorOuterClass$ErrorStackTrace) aihfVarCreateBuilder4.build();
                        clientErrorOuterClass$ErrorStackTrace2.getClass();
                        clientErrorOuterClass$ClientError.d = clientErrorOuterClass$ErrorStackTrace2;
                        clientErrorOuterClass$ClientError.b |= 2;
                    }
                    ajtxVar.copyOnWrite();
                    ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError2 = (ClientErrorOuterClass$ClientError) ajtxVar.instance;
                    ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage4 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder.build();
                    clientErrorOuterClass$LogMessage4.getClass();
                    clientErrorOuterClass$ClientError2.e = clientErrorOuterClass$LogMessage4;
                    clientErrorOuterClass$ClientError2.b |= 4;
                    ajtxVar.copyOnWrite();
                    ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError3 = (ClientErrorOuterClass$ClientError) ajtxVar.instance;
                    ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData3 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder2.build();
                    clientErrorOuterClass$ErrorMetaData3.getClass();
                    clientErrorOuterClass$ClientError3.c = clientErrorOuterClass$ErrorMetaData3;
                    clientErrorOuterClass$ClientError3.b |= 1;
                    zvlVar.b((ClientErrorOuterClass$ClientError) ajtxVar.build());
                } catch (Exception e2) {
                    e = e2;
                    zvl zvlVar2 = this.d;
                    aihf aihfVarCreateBuilder5 = ClientErrorOuterClass$LogMessage.a.createBuilder();
                    ajtv ajtvVar2 = ajtv.ERROR_LEVEL_ERROR;
                    aihfVarCreateBuilder5.copyOnWrite();
                    ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage5 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder5.instance;
                    clientErrorOuterClass$LogMessage5.d = ajtvVar2.e;
                    clientErrorOuterClass$LogMessage5.b |= 2;
                    Status$StatusProto defaultInstance5 = asbnVar.b;
                    if (defaultInstance5 == null) {
                        defaultInstance5 = Status$StatusProto.getDefaultInstance();
                    }
                    String str2 = defaultInstance5.e;
                    aihfVarCreateBuilder5.copyOnWrite();
                    ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage6 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder5.instance;
                    str2.getClass();
                    clientErrorOuterClass$LogMessage6.b |= 1;
                    clientErrorOuterClass$LogMessage6.c = str2;
                    String canonicalName2 = e.getClass().getCanonicalName();
                    if (canonicalName2 != null) {
                        aihfVarCreateBuilder5.copyOnWrite();
                        ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage7 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder5.instance;
                        clientErrorOuterClass$LogMessage7.b |= 4;
                        clientErrorOuterClass$LogMessage7.e = canonicalName2;
                    }
                    aihf aihfVarCreateBuilder6 = ClientErrorOuterClass$ErrorMetaData.a.createBuilder();
                    aihfVarCreateBuilder6.copyOnWrite();
                    ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData4 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder6.instance;
                    clientErrorOuterClass$ErrorMetaData4.c = 37;
                    clientErrorOuterClass$ErrorMetaData4.b |= 1;
                    aihl aihlVarCheckIsLite6 = aihn.checkIsLite(asby.d);
                    asbnVar.c(aihlVarCheckIsLite6);
                    Object objK4 = asbnVar.j.k(aihlVarCheckIsLite6.d);
                    asby asbyVar2 = (asby) (objK4 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK4));
                    aihl aihlVarCheckIsLite7 = aihn.checkIsLite(asbv.b);
                    asbyVar2.c(aihlVarCheckIsLite7);
                    Object objK5 = asbyVar2.j.k(aihlVarCheckIsLite7.d);
                    asbv asbvVar2 = (asbv) (objK5 == null ? aihlVarCheckIsLite7.b : aihlVarCheckIsLite7.c(objK5));
                    aihf aihfVarCreateBuilder7 = ajlr.a.createBuilder();
                    int i5 = asbvVar2.c;
                    aihfVarCreateBuilder7.copyOnWrite();
                    ajlr ajlrVar7 = (ajlr) aihfVarCreateBuilder7.instance;
                    ajlrVar7.b |= 1;
                    ajlrVar7.c = i5;
                    int i6 = asbvVar2.g;
                    aihfVarCreateBuilder7.copyOnWrite();
                    ajlr ajlrVar8 = (ajlr) aihfVarCreateBuilder7.instance;
                    ajlrVar8.b |= 2;
                    ajlrVar8.d = i6;
                    int iBi2 = a.bi(asbvVar2.d);
                    if (iBi2 == 0) {
                        iBi2 = 1;
                    }
                    aihfVarCreateBuilder7.copyOnWrite();
                    ajlr ajlrVar9 = (ajlr) aihfVarCreateBuilder7.instance;
                    ajlrVar9.e = b(iBi2) - 1;
                    ajlrVar9.b |= 4;
                    int i7 = asbyVar2.f;
                    aihfVarCreateBuilder7.copyOnWrite();
                    ajlr ajlrVar10 = (ajlr) aihfVarCreateBuilder7.instance;
                    ajlrVar10.b |= 64;
                    ajlrVar10.i = i7;
                    int i8 = asbvVar2.h;
                    aihfVarCreateBuilder7.copyOnWrite();
                    ajlr ajlrVar11 = (ajlr) aihfVarCreateBuilder7.instance;
                    ajlrVar11.b |= 32;
                    ajlrVar11.h = i8;
                    aihfVarCreateBuilder6.copyOnWrite();
                    ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData5 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder6.instance;
                    ajlr ajlrVar12 = (ajlr) aihfVarCreateBuilder7.build();
                    ajlrVar12.getClass();
                    clientErrorOuterClass$ErrorMetaData5.i = ajlrVar12;
                    clientErrorOuterClass$ErrorMetaData5.b |= SemanticState.Focused;
                    ajtx ajtxVar2 = (ajtx) ClientErrorOuterClass$ClientError.a.createBuilder();
                    ajtxVar2.copyOnWrite();
                    ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError4 = (ClientErrorOuterClass$ClientError) ajtxVar2.instance;
                    ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage8 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder5.build();
                    clientErrorOuterClass$LogMessage8.getClass();
                    clientErrorOuterClass$ClientError4.e = clientErrorOuterClass$LogMessage8;
                    clientErrorOuterClass$ClientError4.b |= 4;
                    ajtxVar2.copyOnWrite();
                    ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError5 = (ClientErrorOuterClass$ClientError) ajtxVar2.instance;
                    ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData6 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder6.build();
                    clientErrorOuterClass$ErrorMetaData6.getClass();
                    clientErrorOuterClass$ClientError5.c = clientErrorOuterClass$ErrorMetaData6;
                    clientErrorOuterClass$ClientError5.b |= 1;
                    aihf aihfVarCreateBuilder8 = ClientErrorOuterClass$ErrorStackTrace.a.createBuilder();
                    aihf aihfVarCreateBuilder9 = ClientErrorOuterClass$AndroidStackInfo.a.createBuilder();
                    if (zvt.b(e)) {
                        e = zvt.a(e);
                    }
                    aigj byteString = ((ahag) aext.b(e, true).build()).toByteString();
                    aihfVarCreateBuilder9.copyOnWrite();
                    ClientErrorOuterClass$AndroidStackInfo clientErrorOuterClass$AndroidStackInfo = (ClientErrorOuterClass$AndroidStackInfo) aihfVarCreateBuilder9.instance;
                    clientErrorOuterClass$AndroidStackInfo.b |= 1;
                    clientErrorOuterClass$AndroidStackInfo.c = byteString;
                    aihfVarCreateBuilder8.copyOnWrite();
                    ClientErrorOuterClass$ErrorStackTrace clientErrorOuterClass$ErrorStackTrace3 = (ClientErrorOuterClass$ErrorStackTrace) aihfVarCreateBuilder8.instance;
                    ClientErrorOuterClass$AndroidStackInfo clientErrorOuterClass$AndroidStackInfo2 = (ClientErrorOuterClass$AndroidStackInfo) aihfVarCreateBuilder9.build();
                    clientErrorOuterClass$AndroidStackInfo2.getClass();
                    clientErrorOuterClass$ErrorStackTrace3.c = clientErrorOuterClass$AndroidStackInfo2;
                    clientErrorOuterClass$ErrorStackTrace3.b = 2;
                    ajtxVar2.copyOnWrite();
                    ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError6 = (ClientErrorOuterClass$ClientError) ajtxVar2.instance;
                    ClientErrorOuterClass$ErrorStackTrace clientErrorOuterClass$ErrorStackTrace4 = (ClientErrorOuterClass$ErrorStackTrace) aihfVarCreateBuilder8.build();
                    clientErrorOuterClass$ErrorStackTrace4.getClass();
                    clientErrorOuterClass$ClientError6.d = clientErrorOuterClass$ErrorStackTrace4;
                    clientErrorOuterClass$ClientError6.b |= 2;
                    zvlVar2.b((ClientErrorOuterClass$ClientError) ajtxVar2.build());
                }
            } catch (aiik e3) {
                zvl zvlVar3 = this.d;
                zvj zvjVarA = zvk.a();
                zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                zvjVarA.d("Failed to parse BindingError. Exception Message: ".concat(String.valueOf(e3.getMessage())));
                zvjVarA.j = 38;
                zvjVarA.f(e3);
                zvlVar3.a(zvjVarA.a());
            }
        } catch (Exception e4) {
            e = e4;
            asbnVar = null;
        }
    }

    @Override // com.google.android.libraries.youtube.blocks.BlocksLogger
    public final boolean logLatencyActionSpan(String str) {
        if (!allowClientPerformanceSample()) {
            return false;
        }
        if (str.isEmpty()) {
            ((agrc) ((agrc) b.b()).k("com/google/android/libraries/youtube/innertube/datapush/blocks/DataPushBlocksLogger", "logLatencyActionSpan", 213, "DataPushBlocksLogger.java")).t("DataPushBlocksLogger: spanName is empty");
            return false;
        }
        ConcurrentMap concurrentMap = this.f;
        if (!concurrentMap.containsKey(str)) {
            ((agrc) ((agrc) b.b()).k("com/google/android/libraries/youtube/innertube/datapush/blocks/DataPushBlocksLogger", "logLatencyActionSpan", 217, "DataPushBlocksLogger.java")).t("DataPushBlocksLogger: Missing spanName in the map completedLatencyActionSpans");
            return false;
        }
        zwy zwyVar = this.c;
        zwyVar.s(149, zwyVar.f(), (String) this.a.io(), (amix) concurrentMap.get(str));
        concurrentMap.remove(str);
        return true;
    }

    @Override // com.google.android.libraries.youtube.blocks.BlocksLogger
    public final void logSpan(byte[] bArr) {
        try {
            asbz asbzVar = (asbz) aihn.parseFrom(asbz.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
            asca ascaVar = asbzVar.e;
            if (ascaVar == null) {
                ascaVar = asca.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(asby.c);
            ascaVar.c(aihlVarCheckIsLite);
            Object objK = ascaVar.j.k(aihlVarCheckIsLite.d);
            asby asbyVar = (asby) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(asbv.b);
            asbyVar.c(aihlVarCheckIsLite2);
            Object objK2 = asbyVar.j.k(aihlVarCheckIsLite2.d);
            asbv asbvVar = (asbv) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2));
            String str = asbzVar.d;
            if (str.isEmpty()) {
                str = "BlocksRoughMethodExecution";
            }
            aihf aihfVarCreateBuilder = amix.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            amix amixVar = (amix) aihfVarCreateBuilder.instance;
            str.getClass();
            amixVar.b |= 1;
            amixVar.c = str;
            long j = asbzVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            amix amixVar2 = (amix) aihfVarCreateBuilder.instance;
            amixVar2.b |= 8;
            amixVar2.e = j;
            long j2 = asbzVar.b;
            aihfVarCreateBuilder.copyOnWrite();
            amix amixVar3 = (amix) aihfVarCreateBuilder.instance;
            amixVar3.b |= 16;
            amixVar3.f = j2;
            aihf aihfVarCreateBuilder2 = amji.a.createBuilder();
            boolean zX = a.x();
            aihfVarCreateBuilder2.copyOnWrite();
            amji amjiVar = (amji) aihfVarCreateBuilder2.instance;
            amjiVar.b |= 8;
            amjiVar.d = zX;
            long id = Thread.currentThread().getId();
            aihfVarCreateBuilder2.copyOnWrite();
            amji amjiVar2 = (amji) aihfVarCreateBuilder2.instance;
            amjiVar2.b |= 16;
            amjiVar2.e = id;
            aihf aihfVarCreateBuilder3 = ajlr.a.createBuilder();
            int i = asbvVar.c;
            aihfVarCreateBuilder3.copyOnWrite();
            ajlr ajlrVar = (ajlr) aihfVarCreateBuilder3.instance;
            ajlrVar.b |= 1;
            ajlrVar.c = i;
            int i2 = asbvVar.g;
            aihfVarCreateBuilder3.copyOnWrite();
            ajlr ajlrVar2 = (ajlr) aihfVarCreateBuilder3.instance;
            ajlrVar2.b |= 2;
            ajlrVar2.d = i2;
            int iBi = a.bi(asbvVar.d);
            int iB = b(iBi != 0 ? iBi : 1);
            aihfVarCreateBuilder3.copyOnWrite();
            ajlr ajlrVar3 = (ajlr) aihfVarCreateBuilder3.instance;
            ajlrVar3.e = iB - 1;
            ajlrVar3.b |= 4;
            int i3 = asbvVar.e;
            aihfVarCreateBuilder3.copyOnWrite();
            ajlr ajlrVar4 = (ajlr) aihfVarCreateBuilder3.instance;
            ajlrVar4.b |= 8;
            ajlrVar4.f = i3;
            int i4 = asbvVar.f;
            aihfVarCreateBuilder3.copyOnWrite();
            ajlr ajlrVar5 = (ajlr) aihfVarCreateBuilder3.instance;
            ajlrVar5.b |= 16;
            ajlrVar5.g = i4;
            int i5 = asbvVar.h;
            aihfVarCreateBuilder3.copyOnWrite();
            ajlr ajlrVar6 = (ajlr) aihfVarCreateBuilder3.instance;
            ajlrVar6.b |= 32;
            ajlrVar6.h = i5;
            int i6 = asbyVar.f;
            aihfVarCreateBuilder3.copyOnWrite();
            ajlr ajlrVar7 = (ajlr) aihfVarCreateBuilder3.instance;
            ajlrVar7.b |= 64;
            ajlrVar7.i = i6;
            String str2 = asbvVar.i;
            aihfVarCreateBuilder3.copyOnWrite();
            ajlr ajlrVar8 = (ajlr) aihfVarCreateBuilder3.instance;
            str2.getClass();
            ajlrVar8.b |= SemanticState.Focused;
            ajlrVar8.j = str2;
            ajlr ajlrVar9 = (ajlr) aihfVarCreateBuilder3.build();
            aihfVarCreateBuilder2.copyOnWrite();
            amji amjiVar3 = (amji) aihfVarCreateBuilder2.instance;
            ajlrVar9.getClass();
            amjiVar3.j = ajlrVar9;
            amjiVar3.b |= SemanticState.Modal;
            amji amjiVar4 = (amji) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            amix amixVar4 = (amix) aihfVarCreateBuilder.instance;
            amjiVar4.getClass();
            amixVar4.g = amjiVar4;
            amixVar4.b |= 32;
            amix amixVar5 = (amix) aihfVarCreateBuilder.build();
            zwy zwyVar = this.c;
            zwyVar.s(149, zwyVar.f(), (String) this.a.io(), amixVar5);
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.libraries.youtube.blocks.BlocksLogger
    public final void startLatencyActionSpan(String str) {
        if (allowClientPerformanceSample()) {
            if (str.isEmpty()) {
                ((agrc) ((agrc) b.b()).k("com/google/android/libraries/youtube/innertube/datapush/blocks/DataPushBlocksLogger", "startLatencyActionSpan", 180, "DataPushBlocksLogger.java")).t("DataPushBlocksLogger: spanName is empty");
            } else {
                this.g.b(str);
            }
        }
    }
}
