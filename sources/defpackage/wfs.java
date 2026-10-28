package defpackage;

import android.util.Base64;
import j$.net.URLDecoder;
import j$.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wfs {
    public static final /* synthetic */ int a = 0;

    static {
        agkz.q("/device/orientation", "/app/mdx");
    }

    public static int a(akve akveVar) {
        if ((akveVar.b & 1) != 0) {
            long j = akveVar.c;
            if (j > 0) {
                return (int) j;
            }
        }
        return Integer.MIN_VALUE;
    }

    public static int b(String str) {
        try {
            return a((akve) aihn.parseFrom(akve.a, Base64.decode(URLDecoder.decode(str, StandardCharsets.UTF_8), 8)));
        } catch (Exception unused) {
            return Integer.MIN_VALUE;
        }
    }

    public static wfn c(String str) {
        try {
            akve akveVarD = d(str);
            wfm wfmVarA = wfn.a();
            wfmVarA.a = akveVarD.f.B();
            if ((akveVarD.b & 1) != 0) {
                long j = akveVarD.c;
                if (j > 0) {
                    wfmVarA.b((int) j);
                }
            }
            return wfmVarA.a();
        } catch (Exception unused) {
            return wfn.a().a();
        }
    }

    public static akve d(String str) {
        return (akve) aihn.parseFrom(akve.a, Base64.decode(URLDecoder.decode(str, StandardCharsets.UTF_8), 8));
    }

    public static String e(int i, String str) {
        str.getClass();
        aigj aigjVarX = aigj.x(str);
        if (i <= 0) {
            throw new IllegalStateException();
        }
        aigjVarX.getClass();
        aihf aihfVarCreateBuilder = akve.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        akve akveVar = (akve) aihfVarCreateBuilder.instance;
        akveVar.d = 2;
        akveVar.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        akve akveVar2 = (akve) aihfVarCreateBuilder.instance;
        akveVar2.b |= 1;
        akveVar2.c = i;
        aihfVarCreateBuilder.copyOnWrite();
        akve akveVar3 = (akve) aihfVarCreateBuilder.instance;
        akveVar3.b |= 8;
        akveVar3.f = aigjVarX;
        return URLEncoder.encode(Base64.encodeToString(atqp.R((akve) aihfVarCreateBuilder.build()), 10), StandardCharsets.UTF_8);
    }

    public static String f(int i, aigj aigjVar) {
        aigjVar.getClass();
        aihf aihfVarCreateBuilder = akve.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        akve akveVar = (akve) aihfVarCreateBuilder.instance;
        akveVar.d = 1;
        akveVar.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        akve akveVar2 = (akve) aihfVarCreateBuilder.instance;
        akveVar2.b |= 1;
        akveVar2.c = i;
        aihfVarCreateBuilder.copyOnWrite();
        akve akveVar3 = (akve) aihfVarCreateBuilder.instance;
        akveVar3.b |= 8;
        akveVar3.f = aigjVar;
        return URLEncoder.encode(Base64.encodeToString(atqp.R((akve) aihfVarCreateBuilder.build()), 10), StandardCharsets.UTF_8);
    }

    public static String g(int i, String str) {
        str.getClass();
        return f(i, aigj.x(str));
    }

    public static String h(String str) {
        aigj aigjVar;
        try {
            aigjVar = ((akve) aihn.parseFrom(akve.a, Base64.decode(URLDecoder.decode(str, StandardCharsets.UTF_8), 8))).f;
        } catch (Exception unused) {
            aigjVar = aigj.d;
        }
        return aigjVar.B();
    }
}
