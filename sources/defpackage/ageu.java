package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ageu {
    public boolean a;
    private final String b;
    private final aget c;
    private aget d;

    public ageu(String str) {
        aget agetVar = new aget();
        this.c = agetVar;
        this.d = agetVar;
        this.a = false;
        str.getClass();
        this.b = str;
    }

    private final aget h() {
        aget agetVar = new aget();
        this.d.c = agetVar;
        this.d = agetVar;
        return agetVar;
    }

    public final void a(Object obj) {
        h().b = obj;
    }

    public final void b(String str, Object obj) {
        aget agetVarH = h();
        agetVarH.b = obj;
        agetVarH.a = str;
    }

    public final void c(String str, Object obj) {
        ages agesVar = new ages();
        this.d.c = agesVar;
        this.d = agesVar;
        agesVar.b = obj;
        agesVar.a = str;
    }

    public final void d(String str, float f) {
        c(str, String.valueOf(f));
    }

    public final void e(String str, int i) {
        c(str, String.valueOf(i));
    }

    public final void f(String str, long j) {
        c(str, String.valueOf(j));
    }

    public final void g(String str, boolean z) {
        c(str, String.valueOf(z));
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.b);
        sb.append('{');
        String str = "";
        for (aget agetVar = this.c.c; agetVar != null; agetVar = agetVar.c) {
            boolean z2 = agetVar instanceof ages;
            Object obj = agetVar.b;
            if (z2 || obj != null || !z) {
                sb.append(str);
                String str2 = agetVar.a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String strDeepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                }
                str = ", ";
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
