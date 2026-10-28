package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$AndroidStackInfo;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$ClientError;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$ErrorMetaData;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$ErrorStackTrace;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$LogMessage;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zvk {
    public final double a;
    private final String b;
    private final ajtv c;
    private final int d;
    private final Throwable e;
    private final agkj f;
    private final Optional g;
    private final Optional h;
    private final Optional i;
    private final Optional j;
    private final Optional k;
    private final Optional l;
    private final Optional m;
    private final Optional n;
    private final Optional o;
    private final Optional p;
    private final int q;
    private final int r;

    public zvk(String str, ajtv ajtvVar, int i, int i2, int i3, double d, Throwable th, agkj agkjVar, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, Optional optional8, Optional optional9, Optional optional10) {
        this.b = str;
        this.c = ajtvVar;
        this.q = i;
        this.r = i2;
        this.d = i3;
        this.a = d;
        this.e = th;
        this.f = agkjVar;
        this.g = optional;
        this.h = optional2;
        this.i = optional3;
        this.j = optional4;
        this.k = optional5;
        this.l = optional6;
        this.m = optional7;
        this.n = optional8;
        this.o = optional9;
        this.p = optional10;
    }

    public static zvj a() {
        zvj zvjVar = new zvj(null);
        zvjVar.d("");
        zvjVar.a = 1;
        zvjVar.h = (byte) (zvjVar.h | 1);
        zvjVar.b(1.0d);
        zvjVar.j = 1;
        zvjVar.i = 1;
        zvjVar.c(ajtv.ERROR_LEVEL_UNKNOWN);
        zvjVar.f(new Exception("Unset Exception"));
        zvjVar.c = agkj.h(agpn.b);
        return zvjVar;
    }

    public final ajtx b(int i, Context context) throws Throwable {
        ajtx ajtxVar = (ajtx) ClientErrorOuterClass$ClientError.a.createBuilder();
        aihf aihfVarCreateBuilder = ClientErrorOuterClass$LogMessage.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder.instance;
        String str = this.b;
        str.getClass();
        clientErrorOuterClass$LogMessage.b |= 1;
        clientErrorOuterClass$LogMessage.c = str;
        aihfVarCreateBuilder.copyOnWrite();
        ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage2 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder.instance;
        clientErrorOuterClass$LogMessage2.d = this.c.e;
        clientErrorOuterClass$LogMessage2.b |= 2;
        if (this.d != 1) {
            aihfVarCreateBuilder.copyOnWrite();
            ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage3 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder.instance;
            clientErrorOuterClass$LogMessage3.b |= 16;
            clientErrorOuterClass$LogMessage3.f = 0;
        } else {
            aihfVarCreateBuilder.copyOnWrite();
            ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage4 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder.instance;
            clientErrorOuterClass$LogMessage4.b |= 16;
            clientErrorOuterClass$LogMessage4.f = i;
        }
        Throwable thA = this.e;
        String str2 = (String) Objects.requireNonNullElse(thA.getClass().getCanonicalName(), "Unknown class name");
        aihfVarCreateBuilder.copyOnWrite();
        ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage5 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder.instance;
        str2.getClass();
        int i2 = 4;
        clientErrorOuterClass$LogMessage5.b |= 4;
        clientErrorOuterClass$LogMessage5.e = str2;
        ajtxVar.copyOnWrite();
        ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError = (ClientErrorOuterClass$ClientError) ajtxVar.instance;
        ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage6 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder.build();
        clientErrorOuterClass$LogMessage6.getClass();
        clientErrorOuterClass$ClientError.e = clientErrorOuterClass$LogMessage6;
        clientErrorOuterClass$ClientError.b |= 4;
        aihf aihfVarCreateBuilder2 = ClientErrorOuterClass$ErrorMetaData.a.createBuilder();
        int i3 = this.r;
        aihfVarCreateBuilder2.copyOnWrite();
        ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder2.instance;
        if (i3 == 0) {
            throw null;
        }
        clientErrorOuterClass$ErrorMetaData.c = i3 - 1;
        clientErrorOuterClass$ErrorMetaData.b |= 1;
        int i4 = this.q;
        aihfVarCreateBuilder2.copyOnWrite();
        ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData2 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder2.instance;
        if (i4 == 0) {
            throw null;
        }
        clientErrorOuterClass$ErrorMetaData2.g = i4 - 1;
        clientErrorOuterClass$ErrorMetaData2.b |= 16;
        this.p.isPresent();
        agqr it = this.f.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
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
        this.g.isPresent();
        Optional optional = this.h;
        yyk yykVar = new yyk(aihfVarCreateBuilder2, i2);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            aihf aihfVar = (aihf) yykVar.a;
            aihfVar.copyOnWrite();
            ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData3 = (ClientErrorOuterClass$ErrorMetaData) aihfVar.instance;
            clientErrorOuterClass$ErrorMetaData3.j = (aksg) obj;
            clientErrorOuterClass$ErrorMetaData3.b |= SemanticState.Hidden;
        }
        Optional optional2 = this.i;
        yyk yykVar2 = new yyk(aihfVarCreateBuilder2, 5);
        if (true == optional2.isPresent()) {
            Object obj2 = optional2.get();
            aihf aihfVar2 = (aihf) yykVar2.a;
            aihfVar2.copyOnWrite();
            ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData4 = (ClientErrorOuterClass$ErrorMetaData) aihfVar2.instance;
            clientErrorOuterClass$ErrorMetaData4.k = (aned) obj2;
            clientErrorOuterClass$ErrorMetaData4.b |= SemanticState.LiveRegion;
        }
        this.j.isPresent();
        this.l.isPresent();
        Optional optional3 = this.m;
        yyk yykVar3 = new yyk(aihfVarCreateBuilder2, 6);
        if (true == optional3.isPresent()) {
            Object obj3 = optional3.get();
            aihf aihfVar3 = (aihf) yykVar3.a;
            aihfVar3.copyOnWrite();
            ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData5 = (ClientErrorOuterClass$ErrorMetaData) aihfVar3.instance;
            clientErrorOuterClass$ErrorMetaData5.m = (apeo) obj3;
            clientErrorOuterClass$ErrorMetaData5.b |= 16384;
        }
        this.n.isPresent();
        Optional optional4 = this.o;
        yyk yykVar4 = new yyk(aihfVarCreateBuilder2, 7);
        if (true == optional4.isPresent()) {
            Object obj4 = optional4.get();
            aihf aihfVar4 = (aihf) yykVar4.a;
            aihfVar4.copyOnWrite();
            ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData6 = (ClientErrorOuterClass$ErrorMetaData) aihfVar4.instance;
            clientErrorOuterClass$ErrorMetaData6.n = (aokx) obj4;
            clientErrorOuterClass$ErrorMetaData6.b |= 131072;
        }
        int iA = txz.a(context);
        aihfVarCreateBuilder2.copyOnWrite();
        ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData7 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder2.instance;
        clientErrorOuterClass$ErrorMetaData7.b |= SemanticState.Obscured;
        clientErrorOuterClass$ErrorMetaData7.l = iA;
        ajtxVar.copyOnWrite();
        ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError2 = (ClientErrorOuterClass$ClientError) ajtxVar.instance;
        ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData8 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder2.build();
        clientErrorOuterClass$ErrorMetaData8.getClass();
        clientErrorOuterClass$ClientError2.c = clientErrorOuterClass$ErrorMetaData8;
        clientErrorOuterClass$ClientError2.b |= 1;
        aihf aihfVarCreateBuilder4 = ClientErrorOuterClass$ErrorStackTrace.a.createBuilder();
        Optional optional5 = this.k;
        if (optional5.isPresent()) {
            Object obj5 = optional5.get();
            aihfVarCreateBuilder4.copyOnWrite();
            ClientErrorOuterClass$ErrorStackTrace clientErrorOuterClass$ErrorStackTrace = (ClientErrorOuterClass$ErrorStackTrace) aihfVarCreateBuilder4.instance;
            clientErrorOuterClass$ErrorStackTrace.c = obj5;
            clientErrorOuterClass$ErrorStackTrace.b = 5;
            ajtxVar.copyOnWrite();
            ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError3 = (ClientErrorOuterClass$ClientError) ajtxVar.instance;
            ClientErrorOuterClass$ErrorStackTrace clientErrorOuterClass$ErrorStackTrace2 = (ClientErrorOuterClass$ErrorStackTrace) aihfVarCreateBuilder4.build();
            clientErrorOuterClass$ErrorStackTrace2.getClass();
            clientErrorOuterClass$ClientError3.d = clientErrorOuterClass$ErrorStackTrace2;
            clientErrorOuterClass$ClientError3.b |= 2;
        } else {
            if (zvt.b(thA)) {
                thA = zvt.a(thA);
            }
            aihf aihfVarCreateBuilder5 = ClientErrorOuterClass$AndroidStackInfo.a.createBuilder();
            aigj byteString = ((ahag) aext.b(thA, true).build()).toByteString();
            aihfVarCreateBuilder5.copyOnWrite();
            ClientErrorOuterClass$AndroidStackInfo clientErrorOuterClass$AndroidStackInfo = (ClientErrorOuterClass$AndroidStackInfo) aihfVarCreateBuilder5.instance;
            clientErrorOuterClass$AndroidStackInfo.b |= 1;
            clientErrorOuterClass$AndroidStackInfo.c = byteString;
            aihfVarCreateBuilder4.copyOnWrite();
            ClientErrorOuterClass$ErrorStackTrace clientErrorOuterClass$ErrorStackTrace3 = (ClientErrorOuterClass$ErrorStackTrace) aihfVarCreateBuilder4.instance;
            ClientErrorOuterClass$AndroidStackInfo clientErrorOuterClass$AndroidStackInfo2 = (ClientErrorOuterClass$AndroidStackInfo) aihfVarCreateBuilder5.build();
            clientErrorOuterClass$AndroidStackInfo2.getClass();
            clientErrorOuterClass$ErrorStackTrace3.c = clientErrorOuterClass$AndroidStackInfo2;
            clientErrorOuterClass$ErrorStackTrace3.b = 2;
            ajtxVar.copyOnWrite();
            ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError4 = (ClientErrorOuterClass$ClientError) ajtxVar.instance;
            ClientErrorOuterClass$ErrorStackTrace clientErrorOuterClass$ErrorStackTrace4 = (ClientErrorOuterClass$ErrorStackTrace) aihfVarCreateBuilder4.build();
            clientErrorOuterClass$ErrorStackTrace4.getClass();
            clientErrorOuterClass$ClientError4.d = clientErrorOuterClass$ErrorStackTrace4;
            clientErrorOuterClass$ClientError4.b |= 2;
        }
        return ajtxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zvk) {
            zvk zvkVar = (zvk) obj;
            if (this.b.equals(zvkVar.b) && this.c.equals(zvkVar.c)) {
                int i = this.q;
                int i2 = zvkVar.q;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    int i3 = this.r;
                    int i4 = zvkVar.r;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == i4 && this.d == zvkVar.d) {
                        if (Double.doubleToLongBits(this.a) == Double.doubleToLongBits(zvkVar.a) && this.e.equals(zvkVar.e) && aguu.q(this.f, zvkVar.f) && this.g.equals(zvkVar.g) && this.h.equals(zvkVar.h) && this.i.equals(zvkVar.i) && this.j.equals(zvkVar.j) && this.k.equals(zvkVar.k) && this.l.equals(zvkVar.l) && this.m.equals(zvkVar.m) && this.n.equals(zvkVar.n) && this.o.equals(zvkVar.o) && this.p.equals(zvkVar.p)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
        int i = this.q;
        a.by(i);
        int i2 = this.r;
        a.by(i2);
        double d = this.a;
        return (((((((((((((((((((((((((((((((iHashCode * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ this.d) * 1000003) ^ ((int) ((Double.doubleToLongBits(d) >>> 32) ^ Double.doubleToLongBits(d)))) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode();
    }

    public final String toString() {
        int i = this.q;
        String strValueOf = String.valueOf(this.c);
        String string = i != 0 ? Integer.toString(i - 1) : "null";
        int i2 = this.r;
        String string2 = i2 != 0 ? Integer.toString(i2 - 1) : "null";
        Throwable th = this.e;
        agkj agkjVar = this.f;
        Optional optional = this.g;
        Optional optional2 = this.h;
        Optional optional3 = this.i;
        Optional optional4 = this.j;
        Optional optional5 = this.k;
        Optional optional6 = this.l;
        Optional optional7 = this.m;
        Optional optional8 = this.n;
        Optional optional9 = this.o;
        Optional optional10 = this.p;
        return "ClientErrorLoggable{message=" + this.b + ", level=" + strValueOf + ", type=" + string + ", category=" + string2 + ", serverSampleWeight=" + this.d + ", clientSampleWeight=" + this.a + ", throwableException=" + String.valueOf(th) + ", kvPairs=" + String.valueOf(agkjVar) + ", blocksMethodExecutionInfo=" + String.valueOf(optional) + ", elementsErrorMetadata=" + String.valueOf(optional2) + ", mediaEngineMetadata=" + String.valueOf(optional3) + ", hatsMetadata=" + String.valueOf(optional4) + ", multiLanguageStackInfo=" + String.valueOf(optional5) + ", cameraMetadata=" + String.valueOf(optional6) + ", reelPlaybackError=" + String.valueOf(optional7) + ", effectMetadata=" + String.valueOf(optional8) + ", pageSystemError=" + String.valueOf(optional9) + ", csn=" + String.valueOf(optional10) + '}';
    }

    public zvk() {
        throw null;
    }
}
