package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zhg {
    public final Object a;
    public final Object b;

    public zhg(awmd awmdVar, awmd awmdVar2) {
        awmdVar.getClass();
        this.b = awmdVar;
        this.a = new awmp(new zqe(awmdVar2, 6));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final Set a() {
        return this.a.entrySet();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void b(String str, String str2) {
        ?? r1 = this.a;
        List list = (List) r1.get(str);
        if (list == null) {
            r1.put(str, aguu.s(str2));
        } else {
            list.clear();
            list.add(str2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void c(String str, String str2) {
        ?? r1 = this.a;
        List list = (List) r1.get(str);
        if (list == null) {
            r1.put(str, aguu.s(str2));
        } else {
            list.add(str2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final void d(String str, String str2) {
        if (this.a.containsKey(str)) {
            return;
        }
        c(str, str2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    public final dd e() {
        dd supportFragmentManager = ((cf) ((ijt) this.b.io()).a).getSupportFragmentManager();
        supportFragmentManager.getClass();
        return supportFragmentManager;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    public final void f() {
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [awmi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [awqg, java.lang.Object] */
    public final void g(zhg zhgVar) {
        dd ddVarE = e();
        f();
        zrh zrhVar = new zrh((zqn) zhgVar.b, ddVarE, ((Boolean) this.a.a()).booleanValue());
        zhgVar.a.invoke(zrhVar);
        if (zrhVar.d) {
            throw new IllegalStateException("FragmentNavigator.Transaction.save() was not followed by a push() or restore().");
        }
        zrhVar.b.ah();
    }

    public zhg(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public zhg(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public zhg(aihf aihfVar) {
        this.a = new HashMap();
        this.b = aihfVar;
    }

    public zhg(awmd awmdVar, awmd awmdVar2, byte[] bArr) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
    }

    public zhg(elr elrVar, zzv zzvVar) {
        this.b = elrVar;
        this.a = zzvVar;
    }
}
