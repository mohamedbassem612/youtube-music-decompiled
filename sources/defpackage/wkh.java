package defpackage;

import app.rive.semantics.SemanticState;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import org.chromium.net.NetworkException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wkh implements tha {
    final /* synthetic */ tha a;
    final /* synthetic */ wki b;

    public wkh(tha thaVar, wki wkiVar) {
        this.a = thaVar;
        this.b = wkiVar;
    }

    @Override // defpackage.tha
    public final void a() {
        twu.d("CHUNKO", 4, "onComplete called", null);
        this.a.a();
    }

    @Override // defpackage.tha
    public final void b(tnv tnvVar) {
        toe toeVar = tnvVar.a;
        for (Throwable cause = toeVar; cause != null; cause = cause.getCause()) {
            if ((cause instanceof NetworkException) && ((NetworkException) cause).getCronetInternalErrorCode() == -324) {
                twu.d("CHUNKO", 6, "onError: ERR_EMPTY_RESPONSE", null);
                this.a.b(tnvVar);
            }
        }
        Objects.toString(toeVar);
        twu.d("CHUNKO", 6, "onError: Got exception ".concat(toeVar.toString()), toeVar);
        this.a.b(tnvVar);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    @Override // defpackage.tha
    public final void c(tnw tnwVar) {
        MessageLite messageLite = (MessageLite) tnwVar.a;
        if (messageLite == null) {
            twu.d("CHUNKO", 5, "onNext with null response", null);
            this.a.c(tnwVar);
            return;
        }
        String str = "response " + (messageLite.getSerializedSize() / SemanticState.ReadOnly) + "KB";
        wki wkiVar = this.b;
        ?? Invoke = wkiVar.c.invoke(messageLite);
        if (Invoke != 0) {
            int serializedSize = Invoke.getSerializedSize() / SemanticState.ReadOnly;
            StringBuilder sb = new StringBuilder();
            sb.append((Object) str);
            sb.append(", FUT ");
            sb.append(serializedSize);
            sb.append("KB");
            aihl aihlVar = akso.b;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            aihi aihiVar = (aihi) Invoke;
            aihiVar.c(aihlVarCheckIsLite);
            if (aihiVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                aihiVar.c(aihlVarCheckIsLite2);
                Object objK = aihiVar.j.k(aihlVarCheckIsLite2.d);
                Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
                objC.getClass();
                int serializedSize2 = ((akso) objC).getSerializedSize() / SemanticState.ReadOnly;
            }
        }
        if (((Boolean) wkiVar.b.invoke(messageLite)).booleanValue()) {
            return;
        }
        this.a.c(tnwVar);
    }
}
