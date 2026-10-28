package defpackage;

import app.rive.semantics.SemanticState;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$AndroidStackInfo;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$ClientError;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$ErrorMetaData;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$ErrorStackTrace;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$LogMessage;
import j$.util.concurrent.ThreadLocalRandom;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xeb extends xff {
    private final xed r;
    private final ajtv s;
    private Throwable t;

    public xeb(Object obj, zup zupVar, xed xedVar) {
        super(obj, alot.PAYLOAD_NOT_SET, zupVar, xedVar);
        this.r = xedVar;
        this.s = ajtv.ERROR_LEVEL_UNKNOWN;
    }

    private final float m() {
        double d;
        Object obj = ((xff) this).e;
        if (obj instanceof zvj) {
            zvj zvjVar = (zvj) obj;
            if ((zvjVar.h & 2) == 0) {
                throw new IllegalStateException("Property \"clientSampleWeight\" has not been set");
            }
            d = zvjVar.b;
        } else {
            if (!(obj instanceof zvk)) {
                if (obj instanceof ClientErrorOuterClass$ClientError) {
                    ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError = (ClientErrorOuterClass$ClientError) obj;
                    ClientErrorOuterClass$LogMessage defaultInstance = clientErrorOuterClass$ClientError.e;
                    if (defaultInstance == null) {
                        defaultInstance = ClientErrorOuterClass$LogMessage.getDefaultInstance();
                    }
                    if ((defaultInstance.b & 32) != 0) {
                        ClientErrorOuterClass$LogMessage defaultInstance2 = clientErrorOuterClass$ClientError.e;
                        if (defaultInstance2 == null) {
                            defaultInstance2 = ClientErrorOuterClass$LogMessage.getDefaultInstance();
                        }
                        return defaultInstance2.g;
                    }
                }
                if (obj instanceof ajtx) {
                    ajtx ajtxVar = (ajtx) obj;
                    ClientErrorOuterClass$LogMessage defaultInstance3 = ((ClientErrorOuterClass$ClientError) ajtxVar.instance).e;
                    if (defaultInstance3 == null) {
                        defaultInstance3 = ClientErrorOuterClass$LogMessage.getDefaultInstance();
                    }
                    if ((defaultInstance3.b & 32) != 0) {
                        ClientErrorOuterClass$LogMessage defaultInstance4 = ((ClientErrorOuterClass$ClientError) ajtxVar.instance).e;
                        if (defaultInstance4 == null) {
                            defaultInstance4 = ClientErrorOuterClass$LogMessage.getDefaultInstance();
                        }
                        return defaultInstance4.g;
                    }
                }
                return 1.0f;
            }
            d = ((zvk) obj).a;
        }
        return (float) d;
    }

    @Override // defpackage.xff, defpackage.zug
    public final /* synthetic */ zug a(String str) {
        this.n = str;
        return this;
    }

    @Override // defpackage.xff, defpackage.zug
    public final /* synthetic */ zug b(String str) {
        this.o = str;
        return this;
    }

    @Override // defpackage.xff, defpackage.zug
    public final aigj c() throws Throwable {
        Object objA;
        ajtx ajtxVar;
        Object obj;
        Object obj2 = ((xff) this).e;
        if (obj2 == null) {
            Throwable thA = this.t;
            thA.getClass();
            aihf aihfVarCreateBuilder = ClientErrorOuterClass$LogMessage.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder.instance;
            clientErrorOuterClass$LogMessage.b |= 1;
            clientErrorOuterClass$LogMessage.c = "";
            ajtv ajtvVar = this.s;
            aihfVarCreateBuilder.copyOnWrite();
            ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage2 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder.instance;
            clientErrorOuterClass$LogMessage2.d = ajtvVar.e;
            clientErrorOuterClass$LogMessage2.b |= 2;
            xed xedVar = this.r;
            int i = xedVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage3 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder.instance;
            clientErrorOuterClass$LogMessage3.b |= 16;
            clientErrorOuterClass$LogMessage3.f = i;
            aihfVarCreateBuilder.copyOnWrite();
            ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage4 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder.instance;
            clientErrorOuterClass$LogMessage4.b |= 32;
            clientErrorOuterClass$LogMessage4.g = 1.0f;
            String canonicalName = thA.getClass().getCanonicalName();
            if (canonicalName == null) {
                canonicalName = "Unknown";
            }
            aihfVarCreateBuilder.copyOnWrite();
            ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage5 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder.instance;
            clientErrorOuterClass$LogMessage5.b |= 4;
            clientErrorOuterClass$LogMessage5.e = canonicalName;
            aihf aihfVarCreateBuilder2 = ClientErrorOuterClass$ErrorMetaData.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder2.instance;
            clientErrorOuterClass$ErrorMetaData.c = 0;
            clientErrorOuterClass$ErrorMetaData.b |= 1;
            aihfVarCreateBuilder2.copyOnWrite();
            ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData2 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder2.instance;
            clientErrorOuterClass$ErrorMetaData2.g = 0;
            clientErrorOuterClass$ErrorMetaData2.b |= 16;
            int iA = txz.a(xedVar.a);
            aihfVarCreateBuilder2.copyOnWrite();
            ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData3 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder2.instance;
            clientErrorOuterClass$ErrorMetaData3.b |= SemanticState.Obscured;
            clientErrorOuterClass$ErrorMetaData3.l = iA;
            aihf aihfVarCreateBuilder3 = ClientErrorOuterClass$ErrorStackTrace.a.createBuilder();
            aihfVarCreateBuilder3.getClass();
            if (!xedVar.d && zvt.b(thA)) {
                thA = zvt.a(thA);
            }
            aihf aihfVarCreateBuilder4 = ClientErrorOuterClass$AndroidStackInfo.a.createBuilder();
            aigj byteString = ((ahag) aext.b(thA, true).build()).toByteString();
            aihfVarCreateBuilder4.copyOnWrite();
            ClientErrorOuterClass$AndroidStackInfo clientErrorOuterClass$AndroidStackInfo = (ClientErrorOuterClass$AndroidStackInfo) aihfVarCreateBuilder4.instance;
            clientErrorOuterClass$AndroidStackInfo.b |= 1;
            clientErrorOuterClass$AndroidStackInfo.c = byteString;
            aihfVarCreateBuilder3.copyOnWrite();
            ClientErrorOuterClass$ErrorStackTrace clientErrorOuterClass$ErrorStackTrace = (ClientErrorOuterClass$ErrorStackTrace) aihfVarCreateBuilder3.instance;
            ClientErrorOuterClass$AndroidStackInfo clientErrorOuterClass$AndroidStackInfo2 = (ClientErrorOuterClass$AndroidStackInfo) aihfVarCreateBuilder4.build();
            clientErrorOuterClass$AndroidStackInfo2.getClass();
            clientErrorOuterClass$ErrorStackTrace.c = clientErrorOuterClass$AndroidStackInfo2;
            clientErrorOuterClass$ErrorStackTrace.b = 2;
            ajtx ajtxVar2 = (ajtx) ClientErrorOuterClass$ClientError.a.createBuilder();
            ajtxVar2.copyOnWrite();
            ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError = (ClientErrorOuterClass$ClientError) ajtxVar2.instance;
            ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage6 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder.build();
            clientErrorOuterClass$LogMessage6.getClass();
            clientErrorOuterClass$ClientError.e = clientErrorOuterClass$LogMessage6;
            clientErrorOuterClass$ClientError.b |= 4;
            ajtxVar2.copyOnWrite();
            ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError2 = (ClientErrorOuterClass$ClientError) ajtxVar2.instance;
            ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData4 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder2.build();
            clientErrorOuterClass$ErrorMetaData4.getClass();
            clientErrorOuterClass$ClientError2.c = clientErrorOuterClass$ErrorMetaData4;
            clientErrorOuterClass$ClientError2.b |= 1;
            ajtxVar2.copyOnWrite();
            ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError3 = (ClientErrorOuterClass$ClientError) ajtxVar2.instance;
            ClientErrorOuterClass$ErrorStackTrace clientErrorOuterClass$ErrorStackTrace2 = (ClientErrorOuterClass$ErrorStackTrace) aihfVarCreateBuilder3.build();
            clientErrorOuterClass$ErrorStackTrace2.getClass();
            clientErrorOuterClass$ClientError3.d = clientErrorOuterClass$ErrorStackTrace2;
            clientErrorOuterClass$ClientError3.b |= 2;
            obj = ajtxVar2;
        } else {
            if (obj2 instanceof zvj) {
                objA = obj2;
                objA = ((zvj) obj2).a();
            }
            objA = obj2;
            boolean z = objA instanceof zvk;
            Object objB = objA;
            if (z) {
                xed xedVar2 = this.r;
                objB = ((zvk) objA).b(xedVar2.c, xedVar2.a);
            }
            boolean z2 = objB instanceof ClientErrorOuterClass$ClientError;
            Object builder = objB;
            if (z2) {
                builder = ((ClientErrorOuterClass$ClientError) objB).toBuilder();
            }
            boolean z3 = builder instanceof ajtx;
            obj = builder;
            if (z3) {
                ajtxVar = (ajtx) builder;
                ajtxVar.getClass();
                ClientErrorOuterClass$LogMessage defaultInstance = ((ClientErrorOuterClass$ClientError) ajtxVar.instance).e;
                if (defaultInstance == null) {
                    defaultInstance = ClientErrorOuterClass$LogMessage.getDefaultInstance();
                }
                defaultInstance.getClass();
                int i2 = defaultInstance.b;
                if ((i2 & 16) == 0 || (i2 & 32) == 0) {
                    obj = ajtxVar;
                    aihf builder2 = defaultInstance.toBuilder();
                    builder2.getClass();
                    if ((defaultInstance.b & 16) == 0) {
                        int i3 = this.r.c;
                        builder2.copyOnWrite();
                        ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage7 = (ClientErrorOuterClass$LogMessage) builder2.instance;
                        clientErrorOuterClass$LogMessage7.b |= 16;
                        clientErrorOuterClass$LogMessage7.f = i3;
                    }
                    if ((defaultInstance.b & 32) == 0) {
                        builder2.copyOnWrite();
                        ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage8 = (ClientErrorOuterClass$LogMessage) builder2.instance;
                        clientErrorOuterClass$LogMessage8.b |= 32;
                        clientErrorOuterClass$LogMessage8.g = 1.0f;
                    }
                    ajtxVar.copyOnWrite();
                    ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError4 = (ClientErrorOuterClass$ClientError) ajtxVar.instance;
                    ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage9 = (ClientErrorOuterClass$LogMessage) builder2.build();
                    clientErrorOuterClass$LogMessage9.getClass();
                    clientErrorOuterClass$ClientError4.e = clientErrorOuterClass$LogMessage9;
                    clientErrorOuterClass$ClientError4.b |= 4;
                    obj = ajtxVar;
                }
            }
        }
        obj = ajtxVar;
        if (this.r.b) {
            float fM = m();
            if (fM >= 1.0f || ThreadLocalRandom.current().nextDouble() <= fM) {
                alot alotVar = alot.CLIENT_ERROR;
                ((xff) this).e = obj;
                ((xff) this).f = alotVar;
                return super.c();
            }
        }
        return null;
    }

    public final void d() {
        if (((xff) this).e == null && this.t == null) {
            this.t = new Exception("Unset");
        }
        ztf ztfVar = this.k.e;
        this.l = ztfVar.a();
        ztfVar.k(this);
    }

    @Override // defpackage.xff, defpackage.zug
    public final /* synthetic */ void e(boolean z) {
        this.p = z;
    }

    @Override // defpackage.xff
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void e(boolean z) {
        this.p = z;
    }

    @Override // defpackage.xff
    public final /* synthetic */ void g(String str) {
        this.n = str;
    }

    @Override // defpackage.xff
    public final /* synthetic */ void h(String str) {
        this.o = str;
    }

    public final String toString() {
        return "ErrEvent{level=" + this.s + ", type=0, category=0, serverSampleWeight=" + this.r.c + ", clientSampleWeight=" + m() + ", message='null', throwableException=" + this.t + ", kvPairs=null, blocksMethodExecutionInfo=null, elementsErrorMetadata=null, mediaEngineMetadata=null, hatsMetadata=null, multiLanguageStackInfo=null, cameraMetadata=null, reelPlaybackError=null, effectMetadata=null, csn='null'}";
    }
}
