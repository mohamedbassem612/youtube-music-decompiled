package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tge {
    public int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public tge(pnp pnpVar) {
        this.b = pnpVar.a;
        this.c = pnpVar.b;
        this.e = pnpVar.c;
        this.d = pnpVar.d;
        this.a = pnpVar.e;
    }

    private final vwt l() {
        if (this.c == null) {
            tfz tfzVar = tfz.a;
            this.c = new vwt((byte[]) null, (short[]) null);
        }
        return (vwt) this.c;
    }

    public final tgf a() {
        Object obj;
        Object obj2 = this.d;
        if (obj2 != null) {
            String str = ((tgd) obj2).c;
            if (!TextUtils.isEmpty(str) && ((obj = this.c) == null || !((vwt) obj).v("Content-Type"))) {
                b("Content-Type", str);
            }
            boolean zF = ((tgd) this.d).f();
            Object obj3 = this.c;
            if (zF) {
                if (obj3 == null || !((vwt) obj3).v("Transfer-Encoding")) {
                    b("Transfer-Encoding", "chunked");
                }
            } else if (obj3 == null || !((vwt) obj3).v("Content-Length")) {
                b("Content-Length", Long.toString(((tgd) this.d).b));
            }
        }
        Object obj4 = this.c;
        return new tgf(this.a, (String) this.b, obj4 != null ? ((vwt) obj4).u() : tfz.a, (tgd) this.d, (Optional) this.e);
    }

    public final void b(String str, String str2) {
        l().x(str, str2);
    }

    public final void c(String str, String str2) {
        vwt vwtVarL = l();
        Iterator it = ((ArrayList) vwtVarL.a).iterator();
        while (it.hasNext()) {
            if (str.equalsIgnoreCase((String) ((Map.Entry) it.next()).getKey())) {
                it.remove();
            }
        }
        vwtVarL.x(str, str2);
    }

    public final void d(tok tokVar) {
        this.e = Optional.of(tokVar);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, qud] */
    public final quk e() {
        if (this.c == null || this.a == 0 || this.d == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" context");
            }
            if (this.a == 0) {
                sb.append(" serviceSource");
            }
            if (this.d == null) {
                sb.append(" mdeErrorEventProto");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        quk qukVar = new quk((String) this.e, (Throwable) this.b, this.c, this.a, (aueb) this.d);
        qukVar.d.getClass();
        if (!qukVar.e.equals(quk.a)) {
            return qukVar;
        }
        tge tgeVar = new tge(qukVar);
        aihf aihfVarCreateBuilder = aueb.a.createBuilder();
        audd auddVar = audd.MEDIA_ENGINE_ERROR_TYPE_UNKNOWN;
        aihfVarCreateBuilder.copyOnWrite();
        aueb auebVar = (aueb) aihfVarCreateBuilder.instance;
        auebVar.c = auddVar.ap;
        auebVar.b |= 1;
        String str = (String) Optional.ofNullable(qukVar.b).orElse("Unset message");
        aihfVarCreateBuilder.copyOnWrite();
        aueb auebVar2 = (aueb) aihfVarCreateBuilder.instance;
        str.getClass();
        auebVar2.b |= 2;
        auebVar2.d = str;
        Optional optionalOfNullable = Optional.ofNullable(qukVar.c);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(((Throwable) optionalOfNullable.get()).getMessage());
        }
        String str2 = (String) optionalOfNullable.orElse("Unset cause");
        aihfVarCreateBuilder.copyOnWrite();
        aueb auebVar3 = (aueb) aihfVarCreateBuilder.instance;
        str2.getClass();
        auebVar3.b |= 4;
        auebVar3.e = str2;
        tgeVar.f((aueb) aihfVarCreateBuilder.build());
        return tgeVar.e();
    }

    public final void f(aueb auebVar) {
        if (auebVar == null) {
            throw new NullPointerException("Null mdeErrorEventProto");
        }
        this.d = auebVar;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public final pnp g() {
        ?? r4;
        int i;
        Object obj = this.b;
        if (obj != null && (r4 = this.e) != 0 && (i = this.a) != 0) {
            return new pnp((URL) obj, (String) this.c, r4, (byte[]) this.d, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" url");
        }
        if (this.e == null) {
            sb.append(" headers");
        }
        if (this.a == 0) {
            sb.append(" purpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final Map h() {
        ?? r1 = this.e;
        if (r1 != 0) {
            return r1;
        }
        throw new IllegalStateException("Property \"headers\" has not been set");
    }

    public final void i(pno pnoVar, String str) {
        List arrayList = h().containsKey(pnoVar) ? (List) h().get(pnoVar) : new ArrayList(1);
        arrayList.add(str);
        h().put(pnoVar, arrayList);
    }

    public final void j() {
        this.c = "application/x-protobuf";
    }

    public final void k(URL url) {
        if (url == null) {
            throw new NullPointerException("Null url");
        }
        this.b = url;
    }

    public tge(quk qukVar) {
        this.e = qukVar.b;
        this.b = qukVar.c;
        this.c = qukVar.d;
        this.a = qukVar.f;
        this.d = qukVar.e;
    }

    public tge(byte[] bArr) {
    }

    public tge() {
        this.e = Optional.empty();
    }
}
