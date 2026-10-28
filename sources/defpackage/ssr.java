package defpackage;

import android.util.Pair;
import j$.util.Optional;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ssr {
    private static final Charset a = StandardCharsets.UTF_8;
    private final rly b;
    private final zwb c;
    private final atzo d;
    private final atqo e;

    public ssr(rly rlyVar, zwb zwbVar, atqo atqoVar) {
        rlyVar.getClass();
        this.b = rlyVar;
        zwbVar.getClass();
        this.c = zwbVar;
        this.e = atqoVar;
        atzn atznVar = new atzn();
        atznVar.a = 60L;
        this.d = new atzo(atznVar);
    }

    public final String a(String str, atzc atzcVar, InputStream inputStream) throws ssq {
        taq.c();
        zwb zwbVar = this.c;
        if (!zwbVar.u()) {
            throw new ssq("Must be signed in to upload");
        }
        atze atzeVar = new atze(new BufferedInputStream(inputStream), -1L, 4194304);
        zwa zwaVarE = zwbVar.e();
        if (!(zwaVarE instanceof rlt)) {
            throw new ssq("AccountIdentity is required");
        }
        zwk zwkVarD = this.b.a((rlt) zwaVarE);
        if (!zwkVarD.f()) {
            throw new ssq("Could not fetch auth token");
        }
        Optional optionalB = zwkVarD.b(str);
        if (optionalB.isPresent()) {
            atzcVar.d((String) ((Pair) optionalB.get()).first, (String) ((Pair) optionalB.get()).second);
        }
        atzk atzkVarD = atqo.d(str, atzcVar, atzeVar, this.d);
        try {
            try {
                axoz axozVar = (axoz) atzkVarD.a().get();
                if (axozVar.d()) {
                    throw new tni((Throwable) axozVar.b);
                }
                if (!axozVar.c()) {
                    throw new tni();
                }
                Object obj = axozVar.a;
                int i = ((twp) obj).a;
                if (i < 0) {
                    throw new tni();
                }
                Object obj2 = ((twp) obj).c;
                obj2.getClass();
                try {
                    Object obj3 = ((twp) obj).b;
                    if (obj3 == null) {
                        throw new tni();
                    }
                    byte[] bArrB = agyi.b((InputStream) obj3);
                    if (i != 200) {
                        throw new tob(yno.L(i, (atzc) obj2, bArrB));
                    }
                    try {
                        return new JSONObject(new String(bArrB, a)).getString("encryptedBlobId");
                    } catch (JSONException unused) {
                        throw new tnp(yno.L(200, (atzc) obj2, bArrB));
                    }
                } catch (IOException unused2) {
                    throw new tni();
                }
            } catch (InterruptedException e) {
                atzkVarD.b();
                throw e;
            } catch (ExecutionException e2) {
                if (e2.getCause() == null) {
                    throw new tni();
                }
                throw new tni(e2.getCause());
            }
        } catch (tni | tnp | tob e3) {
            throw new ssq(e3);
        }
    }
}
