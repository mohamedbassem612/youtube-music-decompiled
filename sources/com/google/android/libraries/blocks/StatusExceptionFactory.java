package com.google.android.libraries.blocks;

import com.google.net.util.proto2api.Status$StatusProto;
import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aext;
import defpackage.ahag;
import defpackage.ahxw;
import defpackage.aihf;
import defpackage.aihh;
import defpackage.aihl;
import defpackage.aihn;
import defpackage.aiik;
import defpackage.aiov;
import defpackage.asiz;
import defpackage.asjc;
import defpackage.asjd;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class StatusExceptionFactory {
    private StatusExceptionFactory() {
    }

    public static StatusException a(Status$StatusProto status$StatusProto) {
        ahxw ahxwVarA;
        int i = status$StatusProto.b;
        if ((i & 8) != 0) {
            ahxwVarA = ahxw.a(status$StatusProto.f);
        } else {
            ahxwVarA = ((i & 1) == 0 || (i & 2) == 0 || !status$StatusProto.d.equals("generic")) ? null : ahxw.a(status$StatusProto.c);
        }
        if (ahxwVarA == null) {
            ahxwVarA = ahxw.UNKNOWN;
        }
        ahxw ahxwVar = ahxwVarA;
        String str = status$StatusProto.e.isEmpty() ? "unknown error from StatusProto" : status$StatusProto.e;
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        aiov aiovVar = status$StatusProto.g;
        if (aiovVar == null) {
            aiovVar = aiov.a;
        }
        aiov aiovVar2 = aiovVar;
        aihl aihlVar = asjd.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        aiovVar2.c(aihlVarCheckIsLite);
        if (!aiovVar2.j.n(aihlVarCheckIsLite.d)) {
            return new StatusException(ahxwVar, str, stackTrace, aiovVar2);
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        aiovVar2.c(aihlVarCheckIsLite2);
        Object objK = aiovVar2.j.k(aihlVarCheckIsLite2.d);
        Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
        aihf aihfVarCreateBuilder = asiz.a.createBuilder();
        aihf aihfVarB = aext.b(new Throwable(), true);
        aihfVarCreateBuilder.copyOnWrite();
        asiz asizVar = (asiz) aihfVarCreateBuilder.instance;
        ahag ahagVar = (ahag) aihfVarB.build();
        ahagVar.getClass();
        asizVar.c = ahagVar;
        asizVar.b |= 1;
        aihf builder = ((asjd) objC).toBuilder();
        aihf aihfVarCreateBuilder2 = asjc.a.createBuilder();
        asiz asizVar2 = (asiz) aihfVarCreateBuilder.build();
        aihfVarCreateBuilder2.copyOnWrite();
        asjc asjcVar = (asjc) aihfVarCreateBuilder2.instance;
        asizVar2.getClass();
        asjcVar.c = asizVar2;
        asjcVar.b = 2;
        builder.cx((asjc) aihfVarCreateBuilder2.build());
        return new StatusException(ahxwVar, str, stackTrace, (asjd) builder.build(), aiovVar2);
    }

    public static StatusException fromProto(byte[] bArr) {
        try {
            return a((Status$StatusProto) aihn.parseFrom(Status$StatusProto.a, bArr, ExtensionRegistryLite.getGeneratedRegistry()));
        } catch (aiik e) {
            return new StatusException(ahxw.INTERNAL, "Proto parse failed:".concat(String.valueOf(e.getMessage())));
        }
    }

    public static byte[] toProto(Throwable th) {
        int i;
        aiov aiovVar;
        asjd asjdVar;
        aihf aihfVarCreateBuilder = Status$StatusProto.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        Status$StatusProto status$StatusProto = (Status$StatusProto) aihfVarCreateBuilder.instance;
        status$StatusProto.b |= 2;
        status$StatusProto.d = "generic";
        aihf aihfVarCreateBuilder2 = asiz.a.createBuilder();
        aihf aihfVarB = aext.b(th, true);
        aihfVarCreateBuilder2.copyOnWrite();
        asiz asizVar = (asiz) aihfVarCreateBuilder2.instance;
        ahag ahagVar = (ahag) aihfVarB.build();
        ahagVar.getClass();
        asizVar.c = ahagVar;
        asizVar.b |= 1;
        if (th instanceof StatusException) {
            StatusException statusException = (StatusException) th;
            asjd asjdVar2 = statusException.a;
            i = statusException.c.s;
            aiov aiovVar2 = statusException.b;
            if (aiovVar2 == null) {
                aiovVar2 = aiov.a;
            }
            if (asjdVar2 != null) {
                aihf builder = asjdVar2.toBuilder();
                aihf aihfVarCreateBuilder3 = asjc.a.createBuilder();
                asiz asizVar2 = (asiz) aihfVarCreateBuilder2.build();
                aihfVarCreateBuilder3.copyOnWrite();
                asjc asjcVar = (asjc) aihfVarCreateBuilder3.instance;
                asizVar2.getClass();
                asjcVar.c = asizVar2;
                asjcVar.b = 2;
                builder.cx((asjc) aihfVarCreateBuilder3.build());
                asjdVar = (asjd) builder.build();
            } else {
                aihf aihfVarCreateBuilder4 = asjd.a.createBuilder();
                aihf aihfVarCreateBuilder5 = asjc.a.createBuilder();
                asiz asizVar3 = (asiz) aihfVarCreateBuilder2.build();
                aihfVarCreateBuilder5.copyOnWrite();
                asjc asjcVar2 = (asjc) aihfVarCreateBuilder5.instance;
                asizVar3.getClass();
                asjcVar2.c = asizVar3;
                asjcVar2.b = 2;
                aihfVarCreateBuilder4.cx((asjc) aihfVarCreateBuilder5.build());
                asjdVar = (asjd) aihfVarCreateBuilder4.build();
            }
            aihh aihhVar = (aihh) aiovVar2.toBuilder();
            aihhVar.e(asjd.b, asjdVar);
            aiovVar = (aiov) aihhVar.build();
        } else {
            i = true != (th instanceof IllegalArgumentException) ? 13 : 3;
            aihf aihfVarCreateBuilder6 = asjd.a.createBuilder();
            aihf aihfVarCreateBuilder7 = asjc.a.createBuilder();
            asiz asizVar4 = (asiz) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder7.copyOnWrite();
            asjc asjcVar3 = (asjc) aihfVarCreateBuilder7.instance;
            asizVar4.getClass();
            asjcVar3.c = asizVar4;
            asjcVar3.b = 2;
            aihfVarCreateBuilder6.cx((asjc) aihfVarCreateBuilder7.build());
            asjd asjdVar3 = (asjd) aihfVarCreateBuilder6.build();
            aihh aihhVar2 = (aihh) aiov.a.createBuilder();
            aihhVar2.e(asjd.b, asjdVar3);
            aiovVar = (aiov) aihhVar2.build();
        }
        aihfVarCreateBuilder.copyOnWrite();
        Status$StatusProto status$StatusProto2 = (Status$StatusProto) aihfVarCreateBuilder.instance;
        status$StatusProto2.b |= 1;
        status$StatusProto2.c = i;
        aihfVarCreateBuilder.copyOnWrite();
        Status$StatusProto status$StatusProto3 = (Status$StatusProto) aihfVarCreateBuilder.instance;
        status$StatusProto3.b |= 8;
        status$StatusProto3.f = i;
        if (aiovVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            Status$StatusProto status$StatusProto4 = (Status$StatusProto) aihfVarCreateBuilder.instance;
            status$StatusProto4.g = aiovVar;
            status$StatusProto4.b |= 16;
        }
        if (th.getMessage() != null) {
            String message = th.getMessage();
            aihfVarCreateBuilder.copyOnWrite();
            Status$StatusProto status$StatusProto5 = (Status$StatusProto) aihfVarCreateBuilder.instance;
            message.getClass();
            status$StatusProto5.b |= 4;
            status$StatusProto5.e = message;
        } else {
            aihfVarCreateBuilder.copyOnWrite();
            Status$StatusProto status$StatusProto6 = (Status$StatusProto) aihfVarCreateBuilder.instance;
            status$StatusProto6.b |= 4;
            status$StatusProto6.e = "[message unknown]";
        }
        return ((Status$StatusProto) aihfVarCreateBuilder.build()).toByteArray();
    }
}
