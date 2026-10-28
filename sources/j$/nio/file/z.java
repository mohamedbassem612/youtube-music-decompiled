package j$.nio.file;

import java.nio.file.WatchEvent;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class z {
    public static final y a = new y((Object) "OVERFLOW", (Object) Object.class, (byte) 0);
    public static final y b;
    public static final y c;
    public static final y d;

    static {
        Class<Path> cls = Path.class;
        b = new y((Object) "ENTRY_CREATE", (Object) cls, (byte) 0);
        byte b2 = 0;
        c = new y("ENTRY_DELETE", cls, b2);
        d = new y("ENTRY_MODIFY", cls, b2);
    }

    public static /* synthetic */ LinkOption[] h(java.nio.file.LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        LinkOption[] linkOptionArr2 = new LinkOption[length];
        for (int i = 0; i < length; i++) {
            linkOptionArr2[i] = linkOptionArr[i] == null ? null : LinkOption.NOFOLLOW_LINKS;
        }
        return linkOptionArr2;
    }

    public static /* synthetic */ e0[] i(WatchEvent.Kind[] kindArr) {
        if (kindArr == null) {
            return null;
        }
        int length = kindArr.length;
        e0[] e0VarArr = new e0[length];
        for (int i = 0; i < length; i++) {
            e0VarArr[i] = a.b(kindArr[i]);
        }
        return e0VarArr;
    }

    public static /* synthetic */ h0[] j(WatchEvent.Modifier[] modifierArr) {
        if (modifierArr == null) {
            return null;
        }
        int length = modifierArr.length;
        h0[] h0VarArr = new h0[length];
        for (int i = 0; i < length; i++) {
            WatchEvent.Modifier modifier = modifierArr[i];
            h0VarArr[i] = modifier == null ? null : modifier instanceof g0 ? ((g0) modifier).a : new f0(modifier);
        }
        return h0VarArr;
    }

    public static /* synthetic */ java.nio.file.LinkOption[] k(LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        java.nio.file.LinkOption[] linkOptionArr2 = new java.nio.file.LinkOption[length];
        for (int i = 0; i < length; i++) {
            linkOptionArr2[i] = a.c(linkOptionArr[i]);
        }
        return linkOptionArr2;
    }

    public static /* synthetic */ WatchEvent.Kind[] l(e0[] e0VarArr) {
        if (e0VarArr == null) {
            return null;
        }
        int length = e0VarArr.length;
        WatchEvent.Kind[] kindArr = new WatchEvent.Kind[length];
        for (int i = 0; i < length; i++) {
            kindArr[i] = a.f(e0VarArr[i]);
        }
        return kindArr;
    }

    public static /* synthetic */ WatchEvent.Modifier[] m(h0[] h0VarArr) {
        if (h0VarArr == null) {
            return null;
        }
        int length = h0VarArr.length;
        WatchEvent.Modifier[] modifierArr = new WatchEvent.Modifier[length];
        for (int i = 0; i < length; i++) {
            h0 h0Var = h0VarArr[i];
            modifierArr[i] = h0Var == null ? null : h0Var instanceof f0 ? ((f0) h0Var).a : new g0(h0Var);
        }
        return modifierArr;
    }

    public abstract Object a(String str);

    public abstract long b();

    public abstract j$.nio.file.attribute.d0 c(Class cls);

    public abstract long d();

    public abstract long e();

    public abstract long f();

    public abstract boolean g();

    public abstract String n();

    public abstract boolean o(Class cls);

    public abstract boolean p(String str);

    public abstract String q();
}
