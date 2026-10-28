package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.youtube.creation.videoeffects.stickers.text.ColorChip;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class auzc {
    private static auzc c;
    public int a;
    public final Object b;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.Map] */
    public auzc(List list) {
        this.a = 0;
        afv afvVar = new afv(list.size());
        this.b = afvVar;
        azs.l(list);
        afvVar.clear();
        this.a = 0;
        for (int i = 0; i < list.size(); i++) {
            luq luqVar = (luq) list.get(i);
            this.a += luqVar.numAliveDocuments_;
            String strF = ed.f(luqVar.namespace_);
            this.b.put(strF, Integer.valueOf(((Integer) ed.k(this.b, strF, 0)).intValue() + luqVar.numAliveDocuments_));
        }
    }

    public static synchronized auzc a() {
        auzc auzcVar;
        auzcVar = c;
        if (auzcVar == null) {
            auzcVar = new auzc();
            c = auzcVar;
        }
        return auzcVar;
    }

    public static int e(vjb vjbVar) {
        if (vjbVar instanceof ColorChip) {
            return ((ColorChip) vjbVar).a;
        }
        if (vjbVar instanceof viy) {
            return ((viy) vjbVar).a.a;
        }
        return 0;
    }

    public static int f(vjb vjbVar) {
        if (vjbVar instanceof ColorChip) {
            return ((ColorChip) vjbVar).c;
        }
        if (vjbVar instanceof viy) {
            return ((viy) vjbVar).a.c;
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    public final synchronized List b() {
        this.a++;
        return this.b;
    }

    public final synchronized void c() {
    }

    public final yov d(int i) {
        yov[] yovVarArr = (yov[]) this.b;
        yov yovVar = yovVarArr[i];
        if (yovVar != null) {
            return yovVar;
        }
        yov yovVar2 = new yov();
        yovVarArr[i] = yovVar2;
        return yovVar2;
    }

    public final long g(cvj cvjVar) {
        int i;
        bwb bwbVar = (bwb) this.b;
        cvb cvbVar = (cvb) cvjVar;
        int i2 = 0;
        cvbVar.n(bwbVar.b, 0, 1, false);
        int i3 = bwbVar.b[0] & 255;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = SemanticState.Focused;
        int i5 = 0;
        while (true) {
            i = i5 + 1;
            if ((i3 & i4) != 0) {
                break;
            }
            i4 >>= 1;
            i5 = i;
        }
        int i6 = i3 & (~i4);
        cvbVar.n(bwbVar.b, 1, i5, false);
        while (i2 < i5) {
            i2++;
            i6 = (i6 << 8) + (bwbVar.b[i2] & 255);
        }
        this.a += i;
        return i6;
    }

    public final Object h() {
        int i = this.a;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = (Object[]) this.b;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.a = i2;
        return obj;
    }

    public final void i(Object obj) {
        int i = this.a;
        if (i < 256) {
            ((Object[]) this.b)[i] = obj;
            this.a = i + 1;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final void j(String str, int i) {
        azs.l(str);
        if (i > 0) {
            this.a -= i;
            ?? r2 = this.b;
            Integer num = (Integer) r2.get(str);
            if (num != null) {
                if (i >= num.intValue()) {
                    r2.remove(str);
                } else {
                    r2.put(str, Integer.valueOf(num.intValue() - i));
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void k(String str) {
        azs.l(str);
        this.a++;
        ?? r1 = this.b;
        r1.put(str, Integer.valueOf(((Integer) ed.k(r1, str, 0)).intValue() + 1));
    }

    public auzc(Activity activity) {
        this.a = 0;
        this.b = activity;
    }

    public auzc(byte[] bArr) {
        this.b = new yov[3];
    }

    public auzc(byte[] bArr, byte[] bArr2) {
        this.b = new Object[SemanticState.Hidden];
    }

    public auzc() {
        this.b = Collections.EMPTY_LIST;
        this.a = 0;
    }

    public auzc(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public auzc(char[] cArr) {
        this.b = new bwb(8);
    }

    public auzc(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.b = str;
            this.a = 1;
            return;
        }
        throw new IllegalArgumentException();
    }
}
